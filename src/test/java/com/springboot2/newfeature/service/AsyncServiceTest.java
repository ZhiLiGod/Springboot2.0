package com.springboot2.newfeature.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncServiceTest {

  @Autowired
  private AsyncService asyncService;

  @Test
  public void test_1() throws Exception {
    asyncService.asynvProcess();
    log.info("coming in test_1");
  }

  @Test
  public void test_2() throws Exception {
    long start = System.currentTimeMillis();
    Future<Integer> result = asyncService.asyncProcessReturn();
    log.info("get async task value: {}", result.get());
    log.info("Time elapse: {}", System.currentTimeMillis() - start);
  }

}
