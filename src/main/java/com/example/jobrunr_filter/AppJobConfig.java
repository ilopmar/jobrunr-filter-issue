package com.example.jobrunr_filter;

import org.jobrunr.configuration.JobRunr;
import org.jobrunr.jobs.filters.RetryFilter;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.storage.InMemoryStorageProvider;
import org.jobrunr.storage.StorageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppJobConfig {

  @Bean
  public StorageProvider storageProvider() {
    return new InMemoryStorageProvider();
  }

  @Bean
  public JobScheduler jobScheduler(StorageProvider storageProvider, HandleJobErrorFilter handleJobErrorFilter) {
    return JobRunr.configure()
        .useStorageProvider(storageProvider)
        .withJobFilter(new RetryFilter(20, 4))
        //        .withJobFilter(handleJobErrorFilter)
        .initialize()
        .getJobScheduler();
  }

}
