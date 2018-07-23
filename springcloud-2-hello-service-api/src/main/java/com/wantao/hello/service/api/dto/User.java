package com.wantao.hello.service.api.dto;/*
 *author:wantao
 *createTime:18-7-22 11:33
 *description:
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
}
