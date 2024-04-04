**Дипломный проект профессии "Тестировщик ПО**

[План автоматизации](https://github.com/OlesyaSumatokhina/DiplomAutoTester/blob/master/docs/Plan.md)

Отчет по итогам тестирования

Отчет по итогам автоматизации

__Инструкция по запуску__

1. Склонировать репозиторий https://github.com/OlesyaSumatokhina/DiplomAutoTester к себе в локальную папку командой <code>git clone</code>;
2. Запустить программу Docker Desktop;
3. Открыть склонированный проект на локальной машине в IntelliJ IDEA;
4. Запустить в терминале IDEA docker compose командой <code>docker compose up</code>;
5. Открыть программу DBeaver;
6. Выбрать там базу данных (на выбор MSQL или PostgreSQL);
7. Создать новое соединение с базой данных, проверить тестовое подключение;
8. В терминале IDEA запустить приложение командой <code>java -jar aqa-shop.jar</code>;
9. Запустить тесты командой в терминале:

**для MSQL** <code>./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"</code>

**для postgresql** <code>./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"</code>;
10. Запустить формирование отчета, с одновременным открытием в браузере командой в терминале <code>./gradlew allureServe</code>;
11. Посмотреть сформировавшийся отчет в браузере.
