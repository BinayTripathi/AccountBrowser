package com.binay.accountbrowser.controller.accounts;

import java.net.URL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class AccountBrowserIntegrationTests {
	
	MockMvc mockMvc;
	 
	@Autowired
	private AccountsController accountsController;
	
	 @LocalServerPort
	 private int port;

	 @Autowired
	 private TestRestTemplate restTemplate;
	
	/*@BeforeEach
    public void preTest() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
          .standaloneSetup(accountsController)
          .build();
    }

	@Test
	void getansactionsForAccount_should_return_HHTP_OK_For_Valid_Transaction() {
		
		 try {
			mockMvc
			 .perform(get("/accounts/user/user1"))
			 .andExpect(status().isOk());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	 
	 @Test
	    public void getHello() throws Exception {

		 ResponseEntity<CollectionModel> response = restTemplate.getForEntity(
				new URL("http://localhost:" + port + "/accounts/user/user1").toString(), CollectionModel.class);
		 
			Assertions.assertTrue(response.getStatusCode() == HttpStatus.OK);

	    }

}
