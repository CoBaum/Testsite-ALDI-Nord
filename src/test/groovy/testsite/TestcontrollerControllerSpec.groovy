package testsite

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TestcontrollerControllerSpec extends Specification implements ControllerUnitTest<TestcontrollerController> {

    def setup() {
    }

    def cleanup() {
    }

    void "testSomething"() {
        controller.index()
            assert "Hello World" == response.text
    }
}
