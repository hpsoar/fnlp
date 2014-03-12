package org.fnlp.nlp.cn;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChineseTransTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private ChineseTrans tc;

	@Before
	public void setUp() throws Exception {
		tc = new ChineseTrans();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToTrad() {
		String str;
		str = "ddd";
		str = tc.toTrad(str);
		str = tc.toTrad(str);		
		str = tc.toTrad(str);		
		str = tc.toTrad(str);		
		System.out.println(str);
	}
//	@Test
//	public void testToTradHash() {
//		String str;
//		str = ChineseTrans.simplified;
//		str = ChineseTrans.toTradwithHash(str);
//		str = ChineseTrans.toTradwithHash(str);
//		str = ChineseTrans.toTradwithHash(str);	
//		str = ChineseTrans.toTradwithHash(str);
//		System.out.println(str);
//	}
	@Test
	public void testToSimp() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testNormalise() {
		String str;
		str = "。";
		str = tc.normalizeCAP(str, true);
		System.out.println(str);
		System.out.println(str.equals("。"));
	}

	@Test
	public void testToFullWidth() {
		String str;
		str = "http://news.bbc.co.uk/1/hi/programmes/panorama/live_forums/2124808.stm";
		str = tc.toFullWidth(str);
		System.out.println(str);
	}

	@Test
	public void testNormalize() {
		String str;

		str = "挺【】遠徳什麽愛訊ｈｔｔｐ：／／ｎｅｗｓ．ｂｂｃ．ｃｏ．ｕｋ／１／ｈｉ／ｐｒｏｇｒａｍｍｅｓ／ｐａｎｏｒａｍａ／ｌｉｖｅ＿ｆｏｒｕｍｓ／２１２４８０８．ｓｔｍ";
		str = tc.normalize(str);
		System.out.println(str);
	}
	
	@Test
	public void testToHalfWidth() {
		String str;
		str = "ｈｔｔｐ：／／ｎｅｗｓ．ｂｂｃ．ｃｏ．ｕｋ／１／ｈｉ／ｐｒｏｇｒａｍｍｅｓ／ｐａｎｏｒａｍａ／ｌｉｖｅ＿ｆｏｒｕｍｓ／２１２４８０８．ｓｔｍ";
		str = tc.toHalfWidth(str);
		System.out.println(str);
	}

}