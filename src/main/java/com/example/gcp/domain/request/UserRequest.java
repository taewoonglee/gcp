package com.example.gcp.domain.request;

import com.example.gcp.domain.entity.MyUser;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String name;
    private String descc;

    public MyUser toEntity()
    {
        return MyUser
                .builder()
                .descc(descc)
                .name(name)
                .build();
    }

}
