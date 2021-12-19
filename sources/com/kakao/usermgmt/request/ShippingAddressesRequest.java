package com.kakao.usermgmt.request;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.AuthorizedApiRequest;

public class ShippingAddressesRequest extends AuthorizedApiRequest {
    private final Long addressId;
    private final Integer fromUpdatedAt;
    private final Integer pageSize;

    static {
        Covode.recordClassIndex(34438);
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        Uri.Builder path = super.getUriBuilder().path("v1/user/shipping_address");
        Long l2 = this.addressId;
        if (l2 != null) {
            path.appendQueryParameter("address_id", l2.toString());
        }
        Integer num = this.fromUpdatedAt;
        if (num != null) {
            path.appendQueryParameter("from_updated_at", num.toString());
        }
        Integer num2 = this.pageSize;
        if (num2 != null) {
            path.appendQueryParameter("page_size", num2.toString());
        }
        return path;
    }

    public ShippingAddressesRequest(Long l2, Integer num, Integer num2) {
        this.addressId = l2;
        this.fromUpdatedAt = num;
        this.pageSize = num2;
    }
}
