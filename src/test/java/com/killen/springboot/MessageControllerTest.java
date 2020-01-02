package com.killen.springboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.security.RunAs;

/**
 * @ClassName MessageControllerTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/
@SpringBootTest

public class MessageControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        saveMessages();
    }

    private void saveMessages() {
        for (int i=1;i<10;i++){
            final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("text", "text"+i);
            params.add("summary", "summary"+i);
            try {
                MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders.post("/message")
                                .params(params)).andReturn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void saveMessage() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("text", "text");
        params.add("summary", "summary");
        String mvcResult= mockMvc.perform(MockMvcRequestBuilders.post("/message")
                .params(params)).andReturn().getResponse().getContentAsString();
        System.out.println("Result === "+mvcResult);
    }

    @Test
    public void getMessages() throws Exception{
        String contentAsString = mockMvc.perform(MockMvcRequestBuilders.get("/messages")).andReturn().getResponse().getContentAsString();
        System.out.println("Result ======== "+contentAsString);
    }

    @Test
    public void getMessage() throws  Exception{
        String contentAsString = mockMvc.perform(MockMvcRequestBuilders.get("/message/3")).andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

    @Test
    public void modifyMessage() throws Exception{
        final MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        params.add("id","3");
        params.add("text","spring boot");
        params.add("summary","abc");
        String contentAsString = mockMvc.perform(MockMvcRequestBuilders.put("/message").params(params)).andReturn().getResponse().getContentAsString();
        System.out.println("Result === "+contentAsString);

    }

    @Test
    public void deleteMessage() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.delete("/message/2")).andReturn();
        String contentAsString = mockMvc.perform(MockMvcRequestBuilders.get("/messages")).andReturn().getResponse().getContentAsString();
        System.out.println("Result ===" + contentAsString);
    }
}
