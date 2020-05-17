package lk.pathum;

public class Main {

    public static void main(String[] args) {

        /*
        * Telescoping constructor
        * */
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("lettuce");
        lunchOrderBean.setMeat("Chicken");

        System.out.println("---Telescoping Constructor--");
        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getMeat());

        /*
         * Builder pattern
         */

        LunchOrder.Builder lunchBuilder = new LunchOrder.Builder();

        lunchBuilder.bread("wheat").condiments("mustard").meat("fish");

        LunchOrder lunchOrder = lunchBuilder.build();

        System.out.println("---Builder Pattern--");
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getDressing());


    }
}
