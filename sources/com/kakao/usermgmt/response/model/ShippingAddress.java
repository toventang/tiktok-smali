package com.kakao.usermgmt.response.model;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectConverter;
import com.kakao.network.response.ResponseBody;
import com.kakao.usermgmt.StringSet;
import com.kakao.util.OptionalBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class ShippingAddress {
    public static final JSONObjectConverter<ShippingAddress> CONVERTER = new JSONObjectConverter<ShippingAddress>() {
        /* class com.kakao.usermgmt.response.model.ShippingAddress.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34460);
        }

        @Override // com.kakao.network.response.JSONObjectConverter
        public final ShippingAddress convert(JSONObject jSONObject) {
            return new ShippingAddress(jSONObject);
        }
    };
    private final String baseAddress;
    private final String detailAddress;
    private final Long id;
    private final OptionalBoolean isDefault;
    private final String name;
    private final String receiverName;
    private final String receiverPhoneNumber1;
    private final String receiverPhoneNumber2;
    private final String type;
    private final Integer updatedAt;
    private final String zipCode;
    private final String zoneNumber;

    public String getBaseAddress() {
        return this.baseAddress;
    }

    public String getDetailAddress() {
        return this.detailAddress;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public String getReceiverPhoneNumber1() {
        return this.receiverPhoneNumber1;
    }

    public String getReceiverPhoneNumber2() {
        return this.receiverPhoneNumber2;
    }

    public String getType() {
        return this.type;
    }

    public Integer getUpdatedAt() {
        return this.updatedAt;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getZoneNumber() {
        return this.zoneNumber;
    }

    public OptionalBoolean isDefault() {
        return this.isDefault;
    }

    static {
        Covode.recordClassIndex(34459);
    }

    public String toString() {
        Boolean bool;
        try {
            JSONObject put = new JSONObject().put("id", this.id).put(StringSet.name, this.name);
            OptionalBoolean optionalBoolean = this.isDefault;
            if (optionalBoolean == null) {
                bool = null;
            } else {
                bool = optionalBoolean.getBoolean();
            }
            return put.put("is_default", bool).put("updated_at", this.updatedAt).put(StringSet.type, this.type).put("base_address", this.baseAddress).put("detail_address", this.detailAddress).put("receiver_name", this.receiverName).put("receiver_phone_number1", this.receiverPhoneNumber1).put("receiver_phone_number2", this.receiverPhoneNumber2).put("zone_number", this.zoneNumber).put("zip_code", this.zipCode).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    private ShippingAddress(JSONObject jSONObject) {
        Long l2;
        OptionalBoolean optionalBoolean;
        Integer num;
        try {
            if (jSONObject.has("id")) {
                l2 = Long.valueOf(jSONObject.getLong("id"));
            } else {
                l2 = null;
            }
            this.id = l2;
            if (jSONObject.has("is_default")) {
                optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(jSONObject.getBoolean("is_default")));
            } else {
                optionalBoolean = null;
            }
            this.isDefault = optionalBoolean;
            if (jSONObject.has("updated_at")) {
                num = Integer.valueOf(jSONObject.getInt("updated_at"));
            } else {
                num = null;
            }
            this.updatedAt = num;
            this.name = jSONObject.optString(StringSet.name, null);
            this.type = jSONObject.optString(StringSet.type, null);
            this.baseAddress = jSONObject.optString("base_address");
            this.detailAddress = jSONObject.optString("detail_address");
            this.receiverName = jSONObject.optString("receiver_name");
            this.receiverPhoneNumber1 = jSONObject.optString("receiver_phone_number1");
            this.receiverPhoneNumber2 = jSONObject.optString("receiver_phone_number2");
            this.zoneNumber = jSONObject.optString("zone_number");
            this.zipCode = jSONObject.optString("zip_code");
        } catch (JSONException e2) {
            throw new ResponseBody.ResponseBodyException(e2);
        }
    }
}
