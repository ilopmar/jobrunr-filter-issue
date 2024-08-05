# JobRunr issue

This is a test project to reproduce an issue with JobRunr filters: https://github.com/jobrunr/jobrunr/issues/1081

Steps to reproduce the issue:
- Send the following request to trigger the job: `curl localhost:8080/test`
- Open the dashboard http://localhost:8000/dashboard/jobs. You can see the job, and that it retries 10 times instead of 20

Another test:
- Open `AppJobConfig.java` and uncomment the `handleJobErrorFilter` filter.
- Open the `HandleJobErrorFilter.java` file
- Restart the app and send the same curl request.
- You can see in the application log that none of the `println`s from the filter (besides the constructor) is shown in the logs.
