public class Main {
    public static void main(String[] args) {
        task13 ();
        task45 ();
        task68 ();
    }
    //ВЕТКА ДЛЯ ВНЕСЕНИЯ ПРАВОК
    public static void task13 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }
    public static void task45 () {
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }
    public static void task68 () {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalBoxersWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес " + totalBoxersWeight + " кг");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Вычитанием " + weightDifference + " кг");
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Делением с остатком " + weightDifference2 + " кг");
        System.out.println();
        var totalHours = 640;
        var hoursOnePerson = 8;
        var amountOfWorkers = totalHours / hoursOnePerson;
        System.out.println("Всего работников в компании " + amountOfWorkers + " человек");
        var newAmountOfWorkers = amountOfWorkers + 94;
        System.out.println("Стало " + newAmountOfWorkers + " сотрудников");
        var newTotalHours = newAmountOfWorkers * 8;
        System.out.println("Если в компании работает " + newAmountOfWorkers + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");

    }
}