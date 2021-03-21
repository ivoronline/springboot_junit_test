package com.ivoronline.springboot_junit_test.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

  @Autowired MyController myController;

  @Test
  void hello() {

    //PERFORM ACTION
    String result = myController.hello();

    //TEST RESULT
    assertEquals("Hello from Controller", result);

  }

}
