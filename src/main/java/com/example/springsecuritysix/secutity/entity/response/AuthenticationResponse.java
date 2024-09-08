package com.example.springsecuritysix.secutity.entity.response;

import com.example.springsecuritysix.entity.response.CommonResponse;
import com.example.springsecuritysix.util.constant.ResponseCodeConstants;
import lombok.*;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse extends CommonResponse {
    public AuthenticationResponse(String token, String message) {
        super.setCode(ResponseCodeConstants.OK);
        super.setStatus("OK");
        super.setMessage(message);
        this.token = token;
    }

    private String token;

}
