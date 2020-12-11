package com.shinetech.smartboss.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class SysUser implements Serializable {
    private String id;
    private String userName;
    private String password;
    private String nickName;
    private LocalDateTime createDateTime;
}
