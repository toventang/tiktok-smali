package com.facebook.a;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.c.a;
import com.facebook.internal.ad;
import com.facebook.internal.w;
import com.facebook.j;
import com.facebook.u;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f46686a = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    static class a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        static {
            Covode.recordClassIndex(28451);
        }

        private Object readResolve() {
            return new c(this.jsonString, this.isImplicit, this.inBackground, null, (byte) 0);
        }
    }

    static class b implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        static {
            Covode.recordClassIndex(28452);
        }

        private Object readResolve() {
            return new c(this.jsonString, this.isImplicit, this.inBackground, this.checksum, (byte) 0);
        }

        private b(String str, boolean z, boolean z2, String str2) {
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        /* synthetic */ b(String str, boolean z, boolean z2, String str2, byte b2) {
            this(str, z, z2, str2);
        }
    }

    static {
        Covode.recordClassIndex(28450);
    }

    private Object writeReplace() {
        return new b(this.jsonObject.toString(), this.isImplicit, this.inBackground, this.checksum, (byte) 0);
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return a().equals(this.checksum);
    }

    public final String toString() {
        return com.a.a("\"%s\", implicit: %b, json: %s", new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()});
    }

    private String a() {
        if (Build.VERSION.SDK_INT > 19) {
            return b(this.jsonObject.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.jsonObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str).append(" = ").append(this.jsonObject.optString(str)).append('\n');
        }
        return b(sb.toString());
    }

    private static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i2 = 0; i2 < length; i2++) {
                stringBuffer.append(com.a.a("%02x", new Object[]{Byte.valueOf(digest[i2])}));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            ad.a("Failed to generate checksum: ", (Exception) e2);
            return "0";
        } catch (UnsupportedEncodingException e3) {
            ad.a("Failed to generate checksum: ", (Exception) e3);
            return "1";
        }
    }

    private Map<String, String> a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            a(str);
            Object com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str);
            if ((com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) || (com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof Number)) {
                hashMap.put(str, com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString());
            } else {
                throw new j(com.a.a("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, str}));
            }
        }
        com.facebook.a.d.a.a(hashMap);
        com.facebook.a.h.a.a(hashMap, this.name);
        a.a(hashMap, this.name);
        return hashMap;
    }

    private static void a(String str) {
        boolean contains;
        MethodCollector.i(82);
        if (str == null) {
            str = "<None Provided>";
        } else if (str.length() != 0 && str.length() <= 40) {
            HashSet<String> hashSet = f46686a;
            synchronized (hashSet) {
                try {
                    contains = hashSet.contains(str);
                } finally {
                    MethodCollector.o(82);
                }
            }
            if (contains) {
                MethodCollector.o(82);
                return;
            } else if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                synchronized (hashSet) {
                    try {
                        hashSet.add(str);
                    } finally {
                        MethodCollector.o(82);
                    }
                }
                return;
            } else {
                j jVar = new j(com.a.a("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
                MethodCollector.o(82);
                throw jVar;
            }
        }
        j jVar2 = new j(com.a.a(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, 40}));
        MethodCollector.o(82);
        throw jVar2;
    }

    public static Object com_facebook_appevents_AppEvent_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private c(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        this.name = jSONObject.optString("_eventName");
        this.checksum = str2;
        this.inBackground = z2;
    }

    /* synthetic */ c(String str, boolean z, boolean z2, String str2, byte b2) {
        this(str, z, z2, str2);
    }

    private JSONObject a(String str, String str2, Double d2, Bundle bundle, UUID uuid) {
        a(str2);
        JSONObject jSONObject = new JSONObject();
        String a2 = com.facebook.a.h.a.a(str2);
        jSONObject.put("_eventName", a2);
        jSONObject.put("_eventName_md5", b(a2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> a3 = a(bundle);
            for (String str3 : a3.keySet()) {
                jSONObject.put(str3, a3.get(str3));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            w.a(u.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    public c(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.jsonObject = a(str, str2, d2, bundle, uuid);
        this.checksum = a();
    }
}
