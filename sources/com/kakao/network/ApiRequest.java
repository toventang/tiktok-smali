package com.kakao.network;

import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.kakao.common.IConfiguration;
import com.kakao.common.PhaseInfo;
import com.kakao.network.multipart.Part;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ApiRequest implements IRequest {
    private String appKey;
    private String appVer;
    private String extras;
    private String kaHeader;

    static {
        Covode.recordClassIndex(34354);
    }

    @Override // com.kakao.network.IRequest
    public String getBodyEncoding() {
        return "UTF-8";
    }

    @Override // com.kakao.network.IRequest
    public abstract String getMethod();

    public ApiRequest() {
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public String getExtras() {
        return this.extras;
    }

    @Override // com.kakao.network.IRequest
    public List<Part> getMultiPartList() {
        return new ArrayList();
    }

    @Override // com.kakao.network.IRequest
    public Map<String, String> getParams() {
        return new HashMap();
    }

    public Uri.Builder getUriBuilder() {
        return new Uri.Builder().scheme("https");
    }

    public String getHttpUserAgentString() {
        return "os/android-" + Build.VERSION.SDK_INT;
    }

    @Override // com.kakao.network.IRequest
    public String getUrl() {
        Uri.Builder uriBuilder = getUriBuilder();
        if (uriBuilder != null) {
            return uriBuilder.build().toString();
        }
        return "";
    }

    @Override // com.kakao.network.IRequest
    public Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("KA", this.kaHeader);
        if (!hashMap.containsKey("Content-Type")) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        }
        if (!hashMap.containsKey("Accept")) {
            hashMap.put("Accept", "*/*");
        }
        if (!hashMap.containsKey("User-Agent")) {
            hashMap.put("User-Agent", getHttpUserAgentString());
        }
        hashMap.put("Authorization", "KakaoAK " + getAppKey());
        return hashMap;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setAppVer(String str) {
        this.appVer = str;
    }

    public void setExtras(String str) {
        this.extras = str;
    }

    public void setKaHeader(String str) {
        this.kaHeader = str;
    }

    public ApiRequest(PhaseInfo phaseInfo, IConfiguration iConfiguration) {
        this.appKey = phaseInfo.appKey();
        this.kaHeader = iConfiguration.getKAHeader();
        this.extras = iConfiguration.getExtrasJson().toString();
        this.appVer = iConfiguration.getAppVer();
    }

    public void setConfiguration(PhaseInfo phaseInfo, IConfiguration iConfiguration) {
        setAppKey(phaseInfo.appKey());
        setKaHeader(iConfiguration.getKAHeader());
        setAppVer(iConfiguration.getAppVer());
        setExtras(iConfiguration.getExtrasJson().toString());
    }
}
