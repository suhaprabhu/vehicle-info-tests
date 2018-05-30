package info.vehicle.helpers;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class DataHelper {

    private static List<Map<String, String>> cache;
    public static List<Map<String, String>> getTestData(String fileName) throws IOException, InvalidFormatException
    {
        // Check the cache instead of reading the spreadsheet multiple times
        if (cache != null && cache.size() > 0) {
            return cache;
        }
        List<Map<String, String>> dataList = new ArrayList<>();
        List<String> headers = Arrays.asList("Registration", "Make", "Colour");

        Workbook workbook = WorkbookFactory.create(new File(fileName));
        DataFormatter dataFormatter = new DataFormatter();
        Sheet sheet = workbook.getSheetAt(0);
        sheet.forEach(row -> {
            Map<String, String> dataMap = new HashMap<>();
            AtomicInteger i = new AtomicInteger();
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                dataMap.put(headers.get(i.getAndIncrement()), cellValue);
            });
            dataList.add(dataMap);
        });
        cache = dataList;
        return dataList;
    }
}
