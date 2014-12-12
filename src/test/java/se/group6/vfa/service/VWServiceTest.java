//package se.group6.vfa.service;
//
//import static org.mockito.Mockito.mock;
//import junit.framework.Assert;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import se.group6.vfa.entity.VW;
//import se.group6.vfa.repository.VWRepository;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/applicationContext.xml" })
//public class VWServiceTest {
//
//	private VWService vwService;
//
//	private VW vw;
//
//	@Autowired
//	private VWRepository vwRepository;
//
//	@Before
//	public void setUp() throws Exception {
//		vwService = mock(VWService.class);
//		vwRepository = mock(VWRepository.class);
//		vw = mock(VW.class);
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		vwService = null;
//	}
//
//	@Test
//	public void checkIfvwServiceIsNullReturnsFalse() {
//		Assert.assertNotNull(vwService.findAll());
//	}
//
//	@Test
//	public void testFindAllReturnsAllListOfVW() {
//		Assert.assertEquals(vwService.findAll(), vwRepository.findAll());
//	}
//
//	@Test
//	public void testFindOneVWReturnsOneVWWithSameID() {
//		VW vwTest = new VW();
//		vwTest.setId(20);
//		vwRepository.save(vwTest);
//		Assert.assertEquals(vwService.findOne(20), vwRepository.findOne(20));
//	}
//
//	@Test
//	public void testSaveVWExpectSuccessfullySavedVW() {
//		VW vwTest2 = new VW();
//		vwTest2.setId(19);
//		vwService.save(vwTest2);
//		Assert.assertEquals(vwService.findOne(19), vwRepository.findOne(19));
//	}
//
// }