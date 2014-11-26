package demo

class Helper {

    @groovy.transform.CompileStatic
    void test() {

        // with 2.4.0-beta-4 this compiles.
        demo.Config config = new ConfigObject()

        // with 2.4.0-beta-4 this does not compile.
        // in Holders.groovy the following is defined...
        // static setConfig(Config cfg) {}
        Holders.config = new ConfigObject()

        // ...with 2.3.7 it all compiles
    }
}