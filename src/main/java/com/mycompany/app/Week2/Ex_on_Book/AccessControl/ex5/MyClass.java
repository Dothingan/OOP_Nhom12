package com.mycompany.app.Week2.Ex_on_Book.AccessControl.ex5;
class MyClass {
    public String publicField = "Public Field";

    private String privateField = "Private Field";

    protected String protectedField = "Protected Field";

    String packageAccessField = "Package-Access Field";

    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void packageAccessMethod() {
        System.out.println("Package-Access Method");
    }
}

