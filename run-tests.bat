@echo off
echo Running tests with Allure reporting...

REM Clean and run tests
call mvn clean test

REM Generate Allure report
call mvn allure:report

REM Serve the report
call mvn allure:serve
