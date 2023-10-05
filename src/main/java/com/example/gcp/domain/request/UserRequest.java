package com.example.gcp.domain.request;

import com.example.gcp.domain.entity.MyUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserRequest {
    private String name;
    private String description;

    public MyUser toEntity()
    {
        return MyUser
                .builder()
                .description(description)
                .name(name)
                .build();
    }

}
