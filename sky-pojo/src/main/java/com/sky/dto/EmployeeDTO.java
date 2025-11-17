package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "员工DTO")
public class EmployeeDTO implements Serializable {

    @ApiModelProperty(value = "员工ID", example = "null")
    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
