package com.kakao.usermgmt.request;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

public class MeV2Request extends AuthorizedApiRequest {
    private final List<String> propertyKeyList;
    private final boolean secureResource;

    static {
        Covode.recordClassIndex(34436);
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        Uri.Builder appendQueryParameter = super.getUriBuilder().path("v2/user/me").appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        List<String> list = this.propertyKeyList;
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("property_keys", new JSONArray((Collection) this.propertyKeyList).toString());
        }
        return appendQueryParameter;
    }

    public MeV2Request(List<String> list, boolean z) {
        this.propertyKeyList = list;
        this.secureResource = z;
    }
}
