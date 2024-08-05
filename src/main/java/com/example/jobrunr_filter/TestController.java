package com.example.jobrunr_filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final TestJobRunrService testJobRunrService;

  public TestController(TestJobRunrService testJobRunrService) {
    this.testJobRunrService = testJobRunrService;
  }

  @GetMapping(value = "/test")
  public void test() {
    testJobRunrService.scheduleJob();
  }

}
