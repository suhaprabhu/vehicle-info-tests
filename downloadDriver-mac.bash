#!/bin/bash
wget https://github.com/mozilla/geckodriver/releases/download/v0.20.1/geckodriver-v0.20.1-macos.tar.gz
tar xvfz geckodriver-v0.20.1-macos.tar.gz
rm geckodriver-v0.20.1-macos.tar.gz

wget https://chromedriver.storage.googleapis.com/2.38/chromedriver_mac64.zip
unzip chromedriver_mac64.zip
rm chromedriver_mac64.zip
