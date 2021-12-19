package com.kakao.auth.authorization.accesstoken;

import android.net.Uri;
import com.a;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.request.AuthRequest;
import com.kakao.common.IConfiguration;
import com.kakao.common.PhaseInfo;
import com.kakao.network.IRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.network.multipart.Part;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessTokenRequest extends AuthRequest implements IRequest {
    private final String approvalType;
    private final String authCode;
    private final IConfiguration configuration;
    private final PhaseInfo phaseInfo;
    private final String refreshToken;

    static {
        Covode.recordClassIndex(34278);
    }

    @Override // com.kakao.network.IRequest
    public String getBodyEncoding() {
        return "UTF-8";
    }

    @Override // com.kakao.network.IRequest
    public String getMethod() {
        return "POST";
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    private boolean isAccessTokenRequestWithAuthCode() {
        if (this.authCode != null) {
            return true;
        }
        return false;
    }

    @Override // com.kakao.network.IRequest
    public List<Part> getMultiPartList() {
        return Collections.emptyList();
    }

    @Override // com.kakao.network.IRequest
    public String getUrl() {
        return new Uri.Builder().scheme("https").authority(ServerProtocol.authAuthority()).path("oauth/token").build().toString();
    }

    @Override // com.kakao.network.IRequest
    public Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("KA", this.configuration.getKAHeader());
        if (!hashMap.containsKey("Content-Type")) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        }
        if (!hashMap.containsKey("Accept")) {
            hashMap.put("Accept", "*/*");
        }
        hashMap.put("Authorization", "KakaoAK " + getAppKey());
        Map<String, String> extraHeadersMap = getExtraHeadersMap();
        if (extraHeadersMap != null && !extraHeadersMap.isEmpty()) {
            for (String str : extraHeadersMap.keySet()) {
                String str2 = extraHeadersMap.get(str);
                if (str2 != null) {
                    hashMap.put(str, str2);
                }
            }
        }
        return hashMap;
    }

    @Override // com.kakao.network.IRequest
    public Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        if (isAccessTokenRequestWithAuthCode()) {
            hashMap.put("grant_type", "authorization_code");
            hashMap.put("code", getAuthCode());
        } else {
            hashMap.put("grant_type", "refresh_token");
            hashMap.put("refresh_token", getRefreshToken());
        }
        hashMap.put("client_id", getAppKey());
        hashMap.put("android_key_hash", this.configuration.getKeyHash());
        hashMap.put("redirect_uri", getRedirectURI());
        String str = this.approvalType;
        if (str != null && str.length() > 0) {
            hashMap.put("approval_type", this.approvalType);
        }
        Map<String, String> extraParamsMap = getExtraParamsMap();
        if (extraParamsMap != null && !extraParamsMap.isEmpty()) {
            for (String str2 : extraParamsMap.keySet()) {
                String str3 = extraParamsMap.get(str2);
                if (str3 != null) {
                    hashMap.put(str2, str3);
                }
            }
        }
        return hashMap;
    }

    public AccessTokenRequest(PhaseInfo phaseInfo2, IConfiguration iConfiguration, String str, String str2, String str3) {
        super(phaseInfo2.appKey(), a.a("%s%s%s", new Object[]{"kakao", phaseInfo2.appKey(), "://oauth"}));
        this.phaseInfo = phaseInfo2;
        this.configuration = iConfiguration;
        this.authCode = str;
        this.refreshToken = str2;
        this.approvalType = str3;
    }
}
