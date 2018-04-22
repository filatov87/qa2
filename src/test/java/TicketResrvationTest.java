import Pages.BaseFunc;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TicketResrvationTest {

    public class TicketReservation {
        private String HOME_PAGE = "http://www.qaguru.lv/tickets/";
        private BaseFunc baseFunc = new BaseFunc();
//        private final Logger LOGGER = LogManager(TicketReservation.class);


        @Test
        public void ticketReservation() {
//            LOGGER.info("Starting test");
//            вызываем driver
//            baseFunc;
//            открываем дом.страницу
            baseFunc.goToUrl(HOME_PAGE);
//            LOGGER.info("Selecting FROM");
//            выбираем ОТКУДА (ВВО)
            baseFunc.selectFrom();
//            выбираем КУДА (РИКС)
            baseFunc.selectTo();
//            Нажимаем ГОГОГО
            baseFunc.SubmitTicketSearch();
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
            baseFunc.closeBrowser();
        }
    }
}


