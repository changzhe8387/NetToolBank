package com.schedulingtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nettoolbank.batch.Scheduling;

@RunWith(SpringJUnit4ClassRunner.class)
public class SchedulingTest {

	Scheduling schedulingTest;

	@Test
	public void excute_Test() throws Exception{
		schedulingTest.scheduling();
	}
}
