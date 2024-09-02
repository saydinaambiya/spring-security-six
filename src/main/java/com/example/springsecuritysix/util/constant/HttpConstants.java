package com.example.springsecuritysix.util.constant;

public final class HttpConstants {
    public HttpConstants() {}

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER = "Bearer ";
    public static final int INDEX_TOKEN = 7;
    public static final String[] WHITELIST_ENDPOINTS = {UrlConstants.LOGIN, UrlConstants.REGISTER};
}
