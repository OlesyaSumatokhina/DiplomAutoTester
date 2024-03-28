**Дипломный проект профессии "Тестировщик ПО**

[План автоматизации](https://github.com/OlesyaSumatokhina/DiplomAutoTester/blob/master/docs/Plan.md)

Отчет по итогам тестирования

Отчет по итогам автоматизации

__Инструкция по запуску__

1. Склонировать репозиторий https://github.com/OlesyaSumatokhina/DiplomAutoTester к себе в локальную папку командой **git clone**;
2. Запустить программу Docker Desktop;
3. Открыть склонированный проект на локальной машине в IntelliJ IDEA;
4. Запустить в терминале IDEA docker compose командой **docker compose up**;
5. Открыть программу DBeaver;
6. Выбрать там базу данных (на выбор MSQL или PostgreSQL);
7. Создать новое соединение с базой данных, проверить тестовое подключение;
8. В терминале IDEA запустить приложение командой **java -jar aqa-shop.jar**;
9. Запустить тесты командой в терминале: 
**для MSQL ./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"
для postgresql ./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"**;
10. Запустить формирование отчета, с одновременным открытием в браузере командой в терминале **./gradlew allureServe**;
11. Посмотреть сформировавшийся отчет в браузере.
