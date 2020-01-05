package com.killen.springboot.param;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @ClassName UserParam
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-05
 * @Version V1.0
 **/
@Data
public class UserParam {
    private long id;
    @NotEmpty(message="姓名不能为空")
    private String userName;
    @NotEmpty(message="密码不能为空")
    @Length(min=6,message="密码⻓度不能⼩于6位")
    private String passWord;
    @Max(value = 100, message = "年龄不能⼤于100岁")
    @Min(value= 18 ,message= "必须年满18岁！" )
    private int age;
}
