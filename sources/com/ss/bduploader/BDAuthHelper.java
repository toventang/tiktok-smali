package com.ss.bduploader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.bduploader.AWSV4Auth;
import java.util.Map;
import java.util.TreeMap;

public class BDAuthHelper {
    private String accessKeyID;
    private String authorization;
    private TreeMap<String, String> awsHeaders;
    private String canonicalURI;
    private boolean debug;
    private String host;
    private String httpMethodName;
    private String payload;
    private TreeMap<String, String> queryParameters;
    private String queryStr;
    private String regionName;
    private String secretAccessKey;
    private String serviceName;
    private String xAmzDate;
    private String xAmzSecurityToken;

    static {
        Covode.recordClassIndex(100632);
    }

    public Map<String, String> getSignature() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("x-amz-date", this.xAmzDate);
        treeMap.put("X-Amz-Security-Token", this.xAmzSecurityToken);
        parseAPIString(this.queryStr);
        Map<String, String> headers = new AWSV4Auth.Builder(this.accessKeyID, this.secretAccessKey).regionName(this.regionName).serviceName(this.serviceName).httpMethodName(this.httpMethodName).canonicalURI("/top/v1").queryParameters(this.queryParameters).awsHeaders(treeMap).payload(this.payload).build().getHeaders();
        this.authorization = headers.get("Authorization");
        return headers;
    }

    public void setAwsHeaders(TreeMap<String, String> treeMap) {
        this.awsHeaders = treeMap;
    }

    public void setQueryParameters(TreeMap<String, String> treeMap) {
        this.queryParameters = treeMap;
    }

    public String getStringValue(int i2) {
        getSignature();
        if (i2 != 10) {
            return null;
        }
        return this.authorization;
    }

    private String parseAPIString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "parseAPIString:query string is empty";
        }
        try {
            String[] split = str.split("[?]");
            if (split.length < 2) {
                return "parseAPIString:query string param is empty";
            }
            String[] split2 = split[1].split("&");
            TreeMap<String, String> treeMap = new TreeMap<>();
            for (String str2 : split2) {
                String[] split3 = str2.split("=");
                if (split3.length == 2) {
                    treeMap.put(split3[0], split3[1]);
                }
            }
            this.queryParameters = treeMap;
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void setStringValue(int i2, String str) {
        switch (i2) {
            case 0:
                this.accessKeyID = str;
                return;
            case 1:
                this.secretAccessKey = str;
                return;
            case 2:
                this.regionName = str;
                return;
            case 3:
                this.serviceName = str;
                return;
            case 4:
                this.httpMethodName = str;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                this.canonicalURI = str;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.payload = str;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                this.host = str;
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                this.xAmzDate = str;
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                this.xAmzSecurityToken = str;
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            default:
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                this.queryStr = str;
                return;
        }
    }
}
