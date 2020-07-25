package com.epam.TDD_DEMO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAInStartTest {

		RemoveAInStart obj;
		@BeforeEach
		void initializeTest()
		{
			obj=new RemoveAInStart();
		}
		@Test
		void testEmptyString() {
			
			assertEquals("",obj.remove(""));
		}
		@Test
		void test1Chars() {
			assertEquals("B",obj.remove("B"));
		}
		@Test
		void test2Chars() {
			assertEquals("B",obj.remove("BA"));
		}
		@Test
		void test4Chars() {
			assertEquals("BCD",obj.remove("ABCD"));
		}
		@Test
		void testNChars() {
			assertEquals("BCDEF",obj.remove("AABCDEF"));
		}

}
