package com.hp.devops.demoapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class TestSuitEntity {
    // a         sasdasad      b               c
	private static Random rand;
	private static int randomNumber, randomNumber2, randomNumber3;

	@Before
	public void beforeEach() {
		rand = new Random();
		randomNumber = rand.nextInt(3);
	}


	@Test
	public void throwsExceptionTestA() {
		String []   testStopWords = {"test", "it",  "case",  "cases", "tests", "class"};
		Arrays.asList(testStopWords);

		if (randomNumber == 0  ) {
			Band band = new Band(null);
			 band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void mySpecialAuditTest() {
		Assert.assertEquals(1, 2);
		if (randomNumber == 1) {
			Band band = new Band( null);
			band.throwsExceptionMethod();
		} else if (randomNumber == 1) {
			Assert.assertEquals(1, 2);
		}
	}

	@Test
	public void viewerCantManageRunRelation() {
		Assert.assertEquals(1, 2);
		if (randomNumber == 2) {
			Assert.assertEquals(true ,   false);
		} else if (randomNumber == 1) {
		} else {
			Band band =  new Band( null);
			band.throwsExceptionMethod();
		}
	}



}
