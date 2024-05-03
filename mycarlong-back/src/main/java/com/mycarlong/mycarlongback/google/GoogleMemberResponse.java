package com.mycarlong.mycarlongback.google;

import static com.mycarlong.mycarlongback.oauth.OauthServerType.GOOGLE;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.mycarlong.mycarlongback.oauth.OauthId;
import com.mycarlong.mycarlongback.oauth.OauthMember;

@JsonNaming(SnakeCaseStrategy.class)
public record GoogleMemberResponse(
        String id,
        boolean hasSignedUp,
        GoogleProfile googleProfile
) {

        public OauthMember toDomain() {
                System.out.println("googleProfile= " + googleProfile);
                System.out.println("id= " + id);
                return OauthMember.builder()
                .oauthId(new OauthId(String.valueOf(id), GOOGLE))
                .nickname(googleProfile.name)
                .email(googleProfile.email)
                .build();
        }


@JsonNaming(SnakeCaseStrategy.class)
public record GoogleProfile(
        String id,
        String email,
        boolean verified_email,
        String name,
        String given_name,
        String family_name,
        String picture,
        String locale
) {
}
}
