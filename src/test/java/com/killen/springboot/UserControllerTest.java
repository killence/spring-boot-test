package com.killen.springboot;

import com.killen.springboot.controller.UserController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @ClassName UserControllerTest
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-28
 * @Version V1.0
 **/
@SpringBootTest
public class UserControllerTest {
    private MockMvc mockMvc;

    /**
     * @BeforeEach先当与@Before
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void getUser() throws Exception{
         mockMvc.perform(MockMvcRequestBuilders.post("/user?name=小明")
                 /**
                  * 这句是设置 JSON 返回编码
                  */
                 .accept(MediaType.APPLICATION_JSON_UTF8))
                 /**
                  * 断言，判断是否存在小明
                  */
                 .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("小明")));
    }

}