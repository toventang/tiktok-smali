package com.kakao.usermgmt.response.model;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectConverter;
import com.kakao.util.helper.log.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceTerms {
    public static final JSONObjectConverter<ServiceTerms> CONVERTER = new JSONObjectConverter<ServiceTerms>() {
        /* class com.kakao.usermgmt.response.model.ServiceTerms.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34458);
        }

        @Override // com.kakao.network.response.JSONObjectConverter
        public final ServiceTerms convert(JSONObject jSONObject) {
            return new ServiceTerms(jSONObject);
        }
    };
    private final String agreedAt;
    private final String tag;

    public String getAgreedAt() {
        return this.agreedAt;
    }

    public String getTag() {
        return this.tag;
    }

    static {
        Covode.recordClassIndex(34457);
    }

    public String toString() {
        try {
            return new JSONObject().put("tag", this.tag).put("agreed_at", this.agreedAt).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public Date getAgreedAtDate() {
        if (this.agreedAt == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return simpleDateFormat.parse(this.agreedAt);
        } catch (ParseException unused) {
            Logger.w("Failed to parse ServiceTerms agreedAt field: ", this.agreedAt);
            return null;
        }
    }

    private ServiceTerms(JSONObject jSONObject) {
        this.tag = jSONObject.optString("tag", null);
        this.agreedAt = jSONObject.optString("agreed_at", null);
    }
}
