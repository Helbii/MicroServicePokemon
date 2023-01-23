package com.micro.service.UserService.model;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    private int id;

    private long gold;
    private long exp;
    private long level;
}