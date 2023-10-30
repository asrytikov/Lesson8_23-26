package dz6;/*Д/з Класс dz6.Phone.
        Создайте класс dz6.Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс dz6.Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
        Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс dz6.Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        Добавить конструктор без параметров.

 */

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setModel("Samsung S55");
        phone.setNumber("999-999-999");
        phone.setWeight(100.123);

        phone.receiveCall("Misha");
        phone.info();
        System.out.println(phone.getNumber());
    }
}