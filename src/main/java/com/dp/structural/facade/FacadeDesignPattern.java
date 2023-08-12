package com.dp.structural.facade;

public class FacadeDesignPattern {

    static class Client {
        public static void main(String[] args) {
            IFacade facade = new Facade(new Class1(), new Class2(), new Class3());
            facade.operation();
        }
    }

    interface IFacade {
        void operation();
    }

    static class Facade implements IFacade {
        private Class1 class1;
        private Class2 class2;
        private Class3 class3;

        public Facade(Class1 class1, Class2 class2, Class3 class3) {
            this.class1 = class1;
            this.class2 = class2;
            this.class3 = class3;
        }

        @Override
        public void operation() {
            System.out.printf("Facade forwards requests to....%s%s%s", class1.operation1(), class2.operation1(), class3.operation3());
        }
    }

    static class Class1 {
        String operation1() {
            return "class1 opeartion...";
        }
    }

    static class Class2 {
        String operation1() {
            return "class2 opeartion...";
        }
    }

    static class Class3 {
        String operation3() {
            return "class3 opeartion...";
        }
    }


}


