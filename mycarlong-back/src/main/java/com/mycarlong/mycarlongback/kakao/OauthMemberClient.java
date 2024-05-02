package com.mycarlong.mycarlongback.kakao;

public interface OauthMemberClient {

  OauthServerType supportServer();

  OauthMember fetch(String code);
}
