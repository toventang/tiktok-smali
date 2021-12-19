package com.kakao.usermgmt.request;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class SignupRequest extends AuthorizedApiRequest {
    private final JSONObject properties;

    static {
        Covode.recordClassIndex(34439);
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/signup");
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.properties;
        if (jSONObject != null) {
            hashMap.put("properties", jSONObject.toString());
        }
        return hashMap;
    }

    public SignupRequest(Map<String, String> map) {
        JSONObject jSONObject;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        this.properties = jSONObject;
    }
}
