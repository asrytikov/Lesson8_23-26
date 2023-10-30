package dz7;
/*
Д/3 Доработать класс Phone. Сделать его абстрактным.
Метод info() сделать абстрактным.
Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
Реализацию info() в каждом классе-наследнике.
Создать объекты каждого класса-наследника и проверить метод Info().

 */

public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("999-999-999","Samsung S55", 100.123);
        phone.receiveCall("Misha");
        phone.info();
    }
}