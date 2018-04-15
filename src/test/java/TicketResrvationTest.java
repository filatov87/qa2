import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TicketResrvationTest {

    public class TicketReservation {
        private String HOME_PAGE = "http://www.qaguru.lv/tickets/";
        private static final By QA_COURSE_MENU_LINK = By.xpath(".//span[text()='Курс Тестирования(QA)']");
        private static final By QA_REGISTRATION_BTN = By.className("regCourseA");
        private static final By SEND_BTN = By.id("ss-submit");
        private static final By NAME_FIELD = By.id("entry_1000000");

        @Test
        public void ticketReservation() {
            System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
//            открываем дом.страницу
//            выбираем ОТКУДА (ВВО)
//                    выбираем КУДА (РИКС)
//            Нажимаем ГОГОГО
//            Добавляем ИМЯ
//            Добавляем ФАМИЛИЯ
//            Добавляем СКИД.НОМЕР (7 символов)
//            Добавляем кол-во попутчиков
//            Добавляем кол-во детей
//            Добавляем кол-во багажа
//            Выбираем дату полёта
//            Нажимаем Get Price
//                    ---- Результаты---
//                    Проверяем, что имя как указано
//            Проверяем, что откуда-куда - как указано
//            Нажимаем Book!
//                    Выбираем места - 1 и 2 (опционально)
//                    Нажимаем Book!


        }
