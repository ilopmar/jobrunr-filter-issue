package com.example.jobrunr_filter;

import org.jobrunr.jobs.Job;
import org.jobrunr.jobs.filters.JobServerFilter;
import org.springframework.stereotype.Component;

@Component
public class HandleJobErrorFilter implements JobServerFilter {

  public HandleJobErrorFilter() {
    System.out.println("==================== HandleJobErrorFilter.HandleJobErrorFilter ====================");
  }

  @Override
  public void onProcessing(Job job) {
    System.out.println("==================== HandleJobErrorFilter.onProcessing ====================");
  }

  @Override
  public void onProcessingSucceeded(Job job) {
    System.out.println("==================== HandleJobErrorFilter.onProcessingSucceeded ====================");
  }

  @Override
  public void onFailedAfterRetries(Job job) {
    System.out.println("==================== HandleJobErrorFilter.onFailedAfterRetries ====================");
  }

  @Override
  public void onProcessingFailed(Job job, Exception e) {
    System.out.println("==================== HandleJobErrorFilter.onProcessingFailed ====================");
  }

}
