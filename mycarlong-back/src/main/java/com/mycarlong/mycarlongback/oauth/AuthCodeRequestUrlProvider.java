package com.mycarlong.mycarlongback.oauth;

public interface AuthCodeRequestUrlProvider {

  OauthServerType supportServer();

  String provide();
}
