package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import dataBase.DBUtils;
import dataBase.FormPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

class TestPayMyPayment {

    private FormPage formPage;

    @BeforeEach
    void setUpPage() {
        formPage = new FormPage();
    }

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void clearAll() throws SQLException {
        DBUtils.clearAllData();
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    @DisplayName("Payment by approved card, regular purchase, valid details")
    void shouldPayByApprovedCard() throws SQLException {
        formPage.buyForYourMoney();
        formPage.setCardNumber("4444444444444441");
        formPage.setCardMonth("08");
        formPage.setCardYear("25");
        formPage.setCardOwner("Ivan Petrov");
        formPage.setCardCVV("999");
        formPage.pushСontinueButton();
        formPage.checkMessageSuccess();
    }

    @Test
    @DisplayName("Payment using an unapproved card, regular purchase with valid data")
    void shouldPayByDeclinedCard() throws SQLException {
        formPage.buyForYourMoney();
        formPage.setCardNumber("4444444444444442");
        formPage.setCardMonth("04");
        formPage.setCardYear("26");
        formPage.setCardOwner("Irina Ivanova");
        formPage.setCardCVV("345");
        formPage.pushСontinueButton();
        formPage.checkMessageSuccess();
    }

    @Test
    @DisplayName("Payment using an unknown card, regular purchase with valid data")
    void shouldPayBynUnkCard() throws SQLException {
        formPage.buyForYourMoney();
        formPage.setCardNumber("4444444444444444");
        formPage.setCardMonth("04");
        formPage.setCardYear("26");
        formPage.setCardOwner("Irina Ivanova");
        formPage.setCardCVV("345");
        formPage.pushСontinueButton();
        formPage.checkMessageSuccess();
    }

    @Test
    @DisplayName("Payment using a card with an invalid number, regular purchase")
    void shouldPayInvalidNumberCard() throws SQLException {
        formPage.buyForYourMoney();
        formPage.setCardNumber("444444444444AAAA");
        formPage.setCardMonth("04");
        formPage.setCardYear("26");
        formPage.setCardOwner("Irina Ivanova");
        formPage.setCardCVV("345");
        formPage.pushСontinueButton();
        formPage.checkMessageWrongFormat();
    }
}