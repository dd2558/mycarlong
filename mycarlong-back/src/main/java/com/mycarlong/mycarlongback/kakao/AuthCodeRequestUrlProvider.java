package com.mycarlong.mycarlongback.kakao;


public interface AuthCodeRequestUrlProvider {

  OauthServerType supportServer();

  String provide();
}
