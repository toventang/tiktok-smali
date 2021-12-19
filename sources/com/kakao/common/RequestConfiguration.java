package com.kakao.common;

import com.bytedance.covode.number.Covode;
import com.kakao.util.exception.KakaoException;
import org.json.JSONObject;

public class RequestConfiguration implements IConfiguration {
    private String appVer;
    private JSONObject extras;
    private String kaHeader;
    private String keyHash;
    private String packageName;

    static {
        Covode.recordClassIndex(34350);
    }

    @Override // com.kakao.common.IConfiguration
    public String getAppVer() {
        return this.appVer;
    }

    @Override // com.kakao.common.IConfiguration
    public JSONObject getExtrasJson() {
        return this.extras;
    }

    @Override // com.kakao.common.IConfiguration
    public String getKAHeader() {
        return this.kaHeader;
    }

    @Override // com.kakao.common.IConfiguration
    public String getKeyHash() {
        return this.keyHash;
    }

    @Override // com.kakao.common.IConfiguration
    public String getPackageName() {
        return this.packageName;
    }

    public RequestConfiguration(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        if (str == null || str.length() == 0) {
            throw new KakaoException(KakaoException.ErrorType.MISS_CONFIGURATION, "Android key hash is null.");
        }
        this.keyHash = str;
        this.kaHeader = str2;
        this.appVer = str3;
        this.packageName = str4;
        this.extras = jSONObject;
    }
}
