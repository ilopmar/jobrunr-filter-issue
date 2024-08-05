package com.example.jobrunr_filter;

import org.jobrunr.scheduling.BackgroundJob;
import org.jobrunr.scheduling.JobBuilder;
import org.springframework.stereotype.Service;

@Service
public class TestJobRunrService {

  public void scheduleJob() {
    BackgroundJob.create(JobBuilder.aJob()
        .withLabels("label1")
        .withName("Notification job")
        .withDetails(this::foo)
    );
  }

  public void foo() {
    throw new RuntimeException("Background Job Enqueued");
  }

}

