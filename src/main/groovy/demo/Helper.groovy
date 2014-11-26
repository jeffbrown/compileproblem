package demo

class Helper {

    @groovy.transform.CompileStatic
    void test() {
        ConfigObject co = new ConfigObject()
        Holders.config = co
    }
}