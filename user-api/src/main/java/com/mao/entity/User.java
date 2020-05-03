package com.mao.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author bigdope
 * @create 2019-03-07
 **/
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 4564254158645694235L;

    private Long id;

    private String name;

    private String password;

}
