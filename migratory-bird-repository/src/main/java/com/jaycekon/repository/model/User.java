package com.jaycekon.repository.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by weijie_huang on 2017/9/7.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User extends BaseEntity {

    private String password;

    private String username;

    private String idCard;

    private String phone;

    @Override
    public String toString() {
        return "User{ id='" + getId() + '\'' +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
