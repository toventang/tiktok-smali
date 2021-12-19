package com.bytedance.globalpayment.iap.common.ability.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import com.bytedance.globalpayment.payment.common.lib.h.a;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30336a = b.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17596);
    }

    public static <T> T a(String str, Class<T> cls) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            T newInstance = cls.newInstance();
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                JsonName jsonName = (JsonName) field.getAnnotation(JsonName.class);
                if (jsonName != null) {
                    Object opt = jSONObject.opt(jsonName.value());
                    if (opt instanceof JSONObject) {
                        field.set(newInstance, a(opt.toString(), field.getType()));
                    } else if (!(opt instanceof JSONArray)) {
                        field.set(newInstance, opt);
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            a.a().e();
            e2.getLocalizedMessage();
            return null;
        } catch (InstantiationException e3) {
            a.a().e();
            e3.getLocalizedMessage();
            return null;
        } catch (JSONException e4) {
            a.a().e();
            e4.getLocalizedMessage();
            return null;
        }
    }
}
