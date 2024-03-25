**Перечень автоматизируемых сценариев:**
_Позитивные сценарии:_

1. покупка тура с обычной оплатой по дебетовой карте;
2. покупка тура с выдачей кредита по данным банковской карты.

_Негативные сценарии:_

1. Оплата тура по дебетовой карте с не валидным значением номера карты;
2. Оплата тура по дебетовой карте с не валидным значением месяц выпуска карты;
3. Оплата тура по дебетовой карте с не валидным значением года выпуска карты;
4. Оплата тура по дебетовой карте с не валидным значением фамилии владельца карты;
5. Оплата тура по дебетовой карте с не валидным значением имени владельца карты;
6. Оплата тура по дебетовой карте с не валидным указанием CVC/CVV карты;
7. Оплата тура по кредитной карте с не валидным значением номера карты;
8. Оплата тура по кредитной карте с не валидным значением месяц выпуска карты;
9. Оплата тура по кредитной карте с не валидным значением года выпуска карты;
10. Оплата тура по кредитной карте с не валидным значением фамилии владельца карты;
11. Оплата тура по кредитной карте с не валидным значением имени владельца карты;
12. Оплата тура по кредитной карте с не валидным указанием CVC/CVV карты;

**Перечень используемых инструментов**
*Все тесты будут написаны на языке Java, т.к. сама программа написана на этом языке.*
- IntelliJ IDEA (программа для написания кода);
- JUnit (библиотека для написания и запуска авто-тестов);
- Gradle (система управления зависимости);
- Selenide (для автоматизированного тестирования веб-приложений);
- Allure (для создания подробных отчетов о выполнении тестов);
- Docker (для работы с контейнерами);
- DBeaver (работа с БД);
- Google Chrome;
- Git и GitHub (для контроля версий проекта).

**Возможные риски при автоматизации**
1. стоимость автоматизации тестирования;
2. риск появления проблем с настройкой приложения и БД;
3. при использовании изолированных входных данных для тестов можно пропустить ключевые баги;
4. поломка автотестов из-за изменений в коде в новом релизе;

**Интервальная оценка с учетом рисков в часах**
1. подготовка окружения, настройка и развертывания БД - 8 часов;
2. написание автотестов, тестирование, отладка тестов - 48;
3. формирование и анализ отчетов - 2 часа.

**План сдачи работ**
1. 22.03 - 23.03 подготовка окружения, развертывание БД;
2. 24.03 - 10.04 написание автотестов, тестирование;
3. 11.04 Формирование и анализ отчетов.