package ru.ikbo1319.experement.ex_24.pr_2;

public class MagicianChair extends AbstractFabric2 implements Chair{
    private int magicLevel;
    public MagicianChair(String color, int age, int magicLvl) {
        super(color, age);
        this.magicLevel = magicLvl;
    }

    public MagicianChair(String color, int age) {
        super(color, age);
    }

    @Override
    public String printChair() {
        return "magical chair";
    }

    @Override
    public void action() {
        System.out.println("Вжух~~~~~~~");
        System.out.println("*   *   *");
        System.out.println("          * ");
        System.out.println("    *      * ");
        System.out.println("          * ");
        System.out.println("      *  * ");
        System.out.println("  *     *");
        System.out.println("       * ");
        System.out.println("   *  *");
        System.out.println("*    *");
    }
}
