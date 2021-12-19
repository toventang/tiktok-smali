package com.kakao.usermgmt.request;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

public class AgeAuthRequest extends AuthorizedApiRequest {
    private final String ageLimit;
    private final List<String> propertyKeyList;

    static {
        Covode.recordClassIndex(34434);
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        Uri.Builder uriBuilder = super.getUriBuilder();
        uriBuilder.path("v1/user/age_auth");
        String str = this.ageLimit;
        if (str != null && str.length() > 0) {
            uriBuilder.appendQueryParameter("age_limit", this.ageLimit);
        }
        List<String> list = this.propertyKeyList;
        if (list != null && list.size() > 0) {
            uriBuilder.appendQueryParameter("property_keys", new JSONArray((Collection) this.propertyKeyList).toString());
        }
        return uriBuilder;
    }

    public AgeAuthRequest(String str, List<String> list) {
        this.ageLimit = str;
        this.propertyKeyList = list;
    }
}
