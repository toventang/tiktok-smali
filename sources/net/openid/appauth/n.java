package net.openid.appauth;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class n {
    static {
        Covode.recordClassIndex(106094);
    }

    static final class d extends b<String> {
        static {
            Covode.recordClassIndex(106098);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // net.openid.appauth.n.b
        public final /* bridge */ /* synthetic */ String a(String str) {
            return str;
        }

        private d(String str) {
            super(str, null);
        }

        d(String str, byte b2) {
            this(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends c<String> {
        static {
            Covode.recordClassIndex(106099);
        }

        e(String str) {
            super(str, null);
        }

        e(String str, List<String> list) {
            super(str, list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends b<Uri> {
        static {
            Covode.recordClassIndex(106100);
        }

        private f(String str) {
            super(str, null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // net.openid.appauth.n.b
        public final /* synthetic */ Uri a(String str) {
            return Uri.parse(str);
        }

        f(String str, byte b2) {
            this(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends b<Boolean> {
        static {
            Covode.recordClassIndex(106095);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // net.openid.appauth.n.b
        public final /* synthetic */ Boolean a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }

        a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }
    }

    public static JSONObject a(Map<String, String> map) {
        p.a(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            p.a((Object) entry.getKey(), (Object) "map entries must not have null keys");
            p.a((Object) entry.getValue(), (Object) "map entries must not have null values");
            a(jSONObject, entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f159710a;

        /* renamed from: b  reason: collision with root package name */
        public final T f159711b;

        static {
            Covode.recordClassIndex(106096);
        }

        /* access modifiers changed from: package-private */
        public abstract T a(String str);

        b(String str, T t) {
            this.f159710a = str;
            this.f159711b = t;
        }
    }

    static abstract class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f159712a;

        /* renamed from: b  reason: collision with root package name */
        public final List<T> f159713b;

        static {
            Covode.recordClassIndex(106097);
        }

        c(String str, List<T> list) {
            this.f159712a = str;
            this.f159713b = list;
        }
    }

    public static <T> T a(JSONObject jSONObject, b<T> bVar) {
        try {
            if (!jSONObject.has(bVar.f159710a)) {
                return bVar.f159711b;
            }
            return bVar.a(jSONObject.getString(bVar.f159710a));
        } catch (JSONException e2) {
            throw new IllegalStateException("unexpected JSONException", e2);
        }
    }

    public static String b(JSONObject jSONObject, String str) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Uri c(JSONObject jSONObject, String str) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Uri d(JSONObject jSONObject, String str) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Long e(JSONObject jSONObject, String str) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static Map<String, String> f(JSONObject jSONObject, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, p.a((Object) jSONObject2.getString(next), (Object) "additional parameter values must not be null"));
        }
        return linkedHashMap;
    }

    public static String a(JSONObject jSONObject, String str) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            throw new JSONException("field \"" + str + "\" is mapped to a null value");
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static void b(JSONObject jSONObject, String str, String str2) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e2) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e2);
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, int i2) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        p.a(Integer.valueOf(i2), "value must not be null");
        try {
            jSONObject.put(str, i2);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        p.a((Object) str2, (Object) "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        p.a(jSONObject, "json must not be null");
        p.a((Object) str, (Object) "field must not be null");
        p.a(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }
}
