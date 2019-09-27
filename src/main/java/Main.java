public class Main {
    public static void main(String[] args) {
        Burger longerBBQ = new Burger();
        longerBBQ.name = "Лонгер BBQ";
        System.out.println(longerBBQ.name);
        longerBBQ.description = "Сочная курочка, маринованные огурчики, лук и аппетитный соус барбекю! Спешите попробовать!";
        System.out.println(longerBBQ.description);
        longerBBQ.weightGm = 107;
        System.out.println(longerBBQ.weightGm + "  г");
        longerBBQ.calorieContentKcal = 236;
        System.out.println(longerBBQ.calorieContentKcal + " Ккал");
        longerBBQ.proteinsGm = 9.7f;
        System.out.println(longerBBQ.proteinsGm + " г");
        longerBBQ.fatsG = 7.1f;
        System.out.println(longerBBQ.fatsG + " г");
        longerBBQ.carbohydrates = 33.f;
        System.out.println(longerBBQ.carbohydrates + " г");
        longerBBQ.price = 50;
        System.out.println(longerBBQ.price + " руб.");
        Burger cheeseburger = new Burger();
        System.out.println("          ");
        cheeseburger.name = "Чизбургер";
        System.out.println(cheeseburger.name);
        cheeseburger.description = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        System.out.println(cheeseburger.description);
        cheeseburger.weightGm = 167;
        System.out.println(cheeseburger.weightGm + "  г");
        cheeseburger.calorieContentKcal = 237;
        System.out.println(cheeseburger.calorieContentKcal + " Ккал");
        cheeseburger.proteinsGm = 13.2f;
        System.out.println(cheeseburger.proteinsGm + " г");
        cheeseburger.fatsG = 8.6f;
        System.out.println(cheeseburger.fatsG + " г");
        cheeseburger.carbohydrates = 26.6f;
        System.out.println(cheeseburger.carbohydrates + " г");
        cheeseburger.price = 69;
        System.out.println(cheeseburger.price + " руб.");
    }
}