package com.kakao.usermgmt.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.usermgmt.response.model.ShippingAddress;
import com.kakao.util.OptionalBoolean;
import java.util.List;

public class ShippingAddressResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<ShippingAddressResponse> CONVERTER = new ResponseStringConverter<ShippingAddressResponse>() {
        /* class com.kakao.usermgmt.response.ShippingAddressResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34450);
        }

        public final ShippingAddressResponse convert(String str) {
            return new ShippingAddressResponse(str);
        }
    };
    private final OptionalBoolean hasShippingAddresses;
    private final List<ShippingAddress> shippingAddresses;
    private final OptionalBoolean shippingAddressesNeedsAgreement;
    private final Long userId;

    public List<ShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public Long getUserId() {
        return this.userId;
    }

    public OptionalBoolean hasShippingAddresses() {
        return this.hasShippingAddresses;
    }

    public OptionalBoolean shippingAddressesNeedsAgreement() {
        return this.shippingAddressesNeedsAgreement;
    }

    static {
        Covode.recordClassIndex(34449);
    }

    private ShippingAddressResponse(String str) {
        super(str);
        Long l2;
        OptionalBoolean optionalBoolean;
        OptionalBoolean optionalBoolean2;
        List<ShippingAddress> list = null;
        if (getBody().has("user_id")) {
            l2 = Long.valueOf(getBody().getLong("user_id"));
        } else {
            l2 = null;
        }
        this.userId = l2;
        if (getBody().has("has_shipping_addresses")) {
            optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(getBody().getBoolean("has_shipping_addresses")));
        } else {
            optionalBoolean = null;
        }
        this.hasShippingAddresses = optionalBoolean;
        if (getBody().has("shipping_addresses_needs_agreement")) {
            optionalBoolean2 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(getBody().getBoolean("shipping_addresses_needs_agreement")));
        } else {
            optionalBoolean2 = null;
        }
        this.shippingAddressesNeedsAgreement = optionalBoolean2;
        this.shippingAddresses = getBody().has("shipping_addresses") ? ShippingAddress.CONVERTER.convertList(getBody().getJSONArray("shipping_addresses")) : list;
    }
}
