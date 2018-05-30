#!/bin/bash
wget https://github.com/mozilla/geckodriver/releases/download/v0.18.0/geckodriver-v0.18.0-linux64.tar.gz
tar xvfz geckodriver-v0.18.0-linux64.tar.gz
rm geckodriver-v0.18.0-linux64.tar.gz

wget https://chromedriver.storage.googleapis.com/2.38/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm chromedriver_linux64.zip
