package com.example.eBeydemo.ebay;

/**
 * @program: eBey-demo
 * @description eBay 信息
 * @author: HuGoldWater
 * @create: 2019-08-01 16:44
 **/
public enum EBayEnvironment {

    PRODUCTION("-litdshop-PRD-725797ef3-078d1c01", "PRD-25797ef3f3e9-8100-418a-ba1b-2ebd", "f0f74ff9-7a34-4cec-8dc5-aa06e843db6f", "_--litdshop-PRD-7-ahlbbrsfc", "https://auth.ebay.com/oauth2/authorize", "https://api.ebay.com/identity/v1/oauth2/token"),
    SANDBOX("-litdshop-PRD-725797ef3-078d1c01", "PRD-25797ef3f3e9-8100-418a-ba1b-2ebd", "f0f74ff9-7a34-4cec-8dc5-aa06e843db6f", "_--litdshop-PRD-7-ahlbbrsfc", "https://auth.sandbox.ebay.com/oauth2/authorize", "https://api.sandbox.ebay.com/identity/v1/oauth2/token");
    private final String appId;
    private final String certId;
    private final String devId;
    private final String ruName;
    private final String authorizeUrl;
    private final String tokenUrl;


    EBayEnvironment(String appId, String certId, String devId, String ruName, String authorizeUrl, String tokenUrl) {
        this.appId = appId;
        this.certId = certId;
        this.devId = devId;
        this.ruName = ruName;
        this.authorizeUrl = authorizeUrl;
        this.tokenUrl = tokenUrl;
    }

    public String getAppId() {
        return appId;
    }

    public String getCertId() {
        return certId;
    }

    public String getDevId() {
        return devId;
    }

    public String getRuName() {
        return ruName;
    }

    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }
}
