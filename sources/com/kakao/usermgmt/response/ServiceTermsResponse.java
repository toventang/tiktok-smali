package com.kakao.usermgmt.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.usermgmt.response.model.ServiceTerms;
import java.util.List;

public class ServiceTermsResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<ServiceTermsResponse> CONVERTER = new ResponseStringConverter<ServiceTermsResponse>() {
        /* class com.kakao.usermgmt.response.ServiceTermsResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34448);
        }

        public final ServiceTermsResponse convert(String str) {
            return new ServiceTermsResponse(str);
        }
    };
    private final List<ServiceTerms> allowedTerms;
    private final Long userId;

    public List<ServiceTerms> getAllowedTerms() {
        return this.allowedTerms;
    }

    public Long getUserId() {
        return this.userId;
    }

    static {
        Covode.recordClassIndex(34447);
    }

    private ServiceTermsResponse(String str) {
        super(str);
        Long l2;
        List<ServiceTerms> list = null;
        if (getBody().has("user_id")) {
            l2 = Long.valueOf(getBody().getLong("user_id"));
        } else {
            l2 = null;
        }
        this.userId = l2;
        this.allowedTerms = getBody().has("allowed_service_terms") ? ServiceTerms.CONVERTER.convertList(getBody().getJSONArray("allowed_service_terms")) : list;
    }
}
