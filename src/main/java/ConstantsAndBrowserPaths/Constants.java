package ConstantsAndBrowserPaths;

import org.openqa.selenium.By;

public class Constants {
    //верхняя кнопка "заказать"
    public final static By UPPER_ORDER_BUTTON = By.cssSelector(".Header_Nav__AGCXC > .Button_Button__ra12g");
    //нижняя кнопка "заказать"
    public final static By LOWER_ORDER_BUTTON = By.cssSelector(".Button_Middle__1CSJM");
    //чек боксы выбора цвета
    //черный
    public final static By BLACK_COLOUR = By.id("black");
    //серый
    public final static By GREY_COLOUR = By.id("grey");
    //выпадающий список продолжительности аренды
    //один день
    public final static By ONE_DAY_RENT = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    //двое суток
    public final static By TWO_DAYS_RENT = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2]");

    //раздел "Вопросы о важном"
    //вопросы

    public final static By QUESTION_1 = By.id("accordion__heading-0");
    public final static By QUESTION_2 = By.id("accordion__heading-1");
    public final static By QUESTION_3 = By.id("accordion__heading-2");
    public final static By QUESTION_4 = By.id("accordion__heading-3");
    public final static By QUESTION_5 = By.id("accordion__heading-4");
    public final static By QUESTION_6 = By.id("accordion__heading-5");
    public final static By QUESTION_7 = By.id("accordion__heading-6");
    public final static By QUESTION_8 = By.id("accordion__heading-7");

    //раскрывающиеся ответы на вопросы
    public final static By LOCATOR_ANSWER_1 = By.id("accordion__panel-0");
    public final static By LOCATOR_ANSWER_2 = By.id("accordion__panel-1");
    public final static By LOCATOR_ANSWER_3 = By.id("accordion__panel-2");
    public final static By LOCATOR_ANSWER_4 = By.id("accordion__panel-3");
    public final static By LOCATOR_ANSWER_5 = By.id("accordion__panel-4");
    public final static By LOCATOR_ANSWER_6 = By.id("accordion__panel-5");
    public final static By LOCATOR_ANSWER_7 = By.id("accordion__panel-6");
    public final static By LOCATOR_ANSWER_8 = By.id("accordion__panel-7");


    //текст ответов на вопросы о важном
    public final static String TEXT_ANSWER_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public final static String TEXT_ANSWER_2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public final static String TEXT_ANSWER_3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public final static String TEXT_ANSWER_4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public final static String TEXT_ANSWER_5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public final static String TEXT_ANSWER_6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public final static String TEXT_ANSWER_7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public final static String TEXT_ANSWER_8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";



}
