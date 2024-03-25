import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

public class TestPayMyPayment {
    private DashboardPage dashboardPage;

    @BeforeEach
    void setUpPage() {
        dashboardPage = new DashboardPage();
    }

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void clearAll() throws SQLException {
        Utilits.clearAllData();
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

@Test
    @DisplayName("Оплата по обычной карте, валидные данные")
    void
}
