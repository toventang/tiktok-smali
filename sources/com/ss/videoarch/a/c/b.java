package com.ss.videoarch.a.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f154240a;

    /* renamed from: b  reason: collision with root package name */
    public String f154241b;

    /* renamed from: c  reason: collision with root package name */
    public String f154242c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f154243d;

    /* renamed from: e  reason: collision with root package name */
    public int f154244e;

    /* renamed from: f  reason: collision with root package name */
    public int f154245f;

    /* renamed from: g  reason: collision with root package name */
    public int f154246g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f154247h;

    /* renamed from: i  reason: collision with root package name */
    public int f154248i;

    /* renamed from: j  reason: collision with root package name */
    public int f154249j;

    /* renamed from: k  reason: collision with root package name */
    public int f154250k;

    /* renamed from: l  reason: collision with root package name */
    public int f154251l;

    /* renamed from: m  reason: collision with root package name */
    public String f154252m = "";
    private JSONObject n;
    private int o;
    private long p = -1;
    private int q = -1;
    private String r;
    private String s;
    private String t = "";
    private String u = "";
    private final String v = "LiveStreamInfo";
    private int w;

    static {
        Covode.recordClassIndex(102850);
    }

    public final JSONObject a() {
        JSONObject jSONObject = this.f154240a;
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("auto");
            return jSONObject2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject2;
        }
    }

    public final String b() {
        JSONObject jSONObject = this.f154240a;
        if (jSONObject == null || !jSONObject.has("rule_ids")) {
            return null;
        }
        return this.f154240a.optString("rule_ids");
    }

    public final String c() {
        JSONObject jSONObject = this.f154240a;
        if (jSONObject == null || !jSONObject.has("session_id")) {
            return null;
        }
        return this.f154240a.optString("session_id");
    }

    private String e() {
        JSONObject jSONObject = this.f154240a;
        if (jSONObject != null && jSONObject.has("query")) {
            StringBuilder sb = new StringBuilder();
            try {
                JSONObject jSONObject2 = this.f154240a.getJSONObject("query");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    String encode = URLEncoder.encode(next, "UTF-8");
                    sb.append("&").append(encode).append("=").append(URLEncoder.encode(string, "UTF-8"));
                }
                return sb.toString();
            } catch (UnsupportedEncodingException | JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public final Map<String, String> d() {
        JSONObject jSONObject = this.f154240a;
        if (jSONObject != null && jSONObject.has("header")) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject2 = this.f154240a.getJSONObject("header");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
                return hashMap;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private boolean g(String str) {
        if (TextUtils.isEmpty(str) || !str.equals("auto") || TextUtils.isEmpty(this.f154241b)) {
            return false;
        }
        return true;
    }

    public final boolean d(String str) {
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return false;
        }
        try {
            if (jSONObject.getJSONObject(str) != null) {
                return true;
            }
            return false;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public b(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            this.n = jSONObject.getJSONObject("data");
            if (jSONObject.has("common")) {
                this.f154240a = jSONObject.getJSONObject("common");
            }
            JSONObject jSONObject2 = this.f154240a;
            if (jSONObject2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("auto");
                if (jSONObject3 != null && jSONObject3.has("default")) {
                    this.f154241b = jSONObject3.getString("default");
                }
                this.f154247h = true;
                if (jSONObject3 != null && jSONObject3.has("list") && (optJSONArray = jSONObject3.optJSONArray("list")) != null && optJSONArray.length() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= optJSONArray.length()) {
                            break;
                        } else if (!d(optJSONArray.getString(i2))) {
                            this.f154247h = false;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.o = 0;
    }

    public static String a(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (!jSONObject2.has("adaptationSet") || (jSONObject = jSONObject2.getJSONObject("adaptationSet")) == null || !jSONObject.has("representation") || (jSONArray = jSONObject.getJSONArray("representation")) == null) {
                return null;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                if (jSONObject3.has("defaultSelect") && jSONObject3.has("url") && jSONObject3.optInt("defaultSelect") == 1) {
                    return jSONObject3.getString("url");
                }
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void b(String str) {
        if (g(str)) {
            str = this.f154241b;
        }
        if (d(str)) {
            this.f154241b = str;
        }
    }

    private boolean e(String str) {
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return false;
        }
        try {
            JSONObject a2 = a();
            if (a2 != null) {
                if (a2.has("list")) {
                    JSONArray optJSONArray = a2.optJSONArray("list");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            String string = optJSONArray.getString(i2);
                            if (string != null && string.equals(str)) {
                                if (!string.equals("origin")) {
                                    return true;
                                }
                                if (this.f154243d) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private String f(String str) {
        int indexOf;
        int indexOf2 = str.indexOf(".com");
        int indexOf3 = str.indexOf(".com:");
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.u)) {
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 5;
                int i3 = i2 + 1;
                while (i3 < sb.length() && sb.charAt(i3) - '0' >= 0 && sb.charAt(i3) - '0' <= 9) {
                    i3++;
                }
                sb.replace(i2, i3, this.u);
            } else if (indexOf2 != -1 && ((indexOf = str.indexOf("vhost")) == -1 || indexOf > indexOf2)) {
                sb.insert(indexOf2 + 4, ":" + this.u);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        int indexOf4 = sb2.indexOf("://");
        if (!TextUtils.isEmpty(this.t)) {
            if (this.t.equals("kcp")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "httpk");
                }
            } else if (this.t.equals("quic") || this.t.equals("quicu")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "httpq");
                }
            } else if (this.t.equals("tls")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "https");
                }
            } else if (this.t.equals("tcp") && indexOf4 != -1) {
                sb2.replace(0, indexOf4, "http");
            }
        }
        return sb2.toString();
    }

    public final boolean a(int i2) {
        this.o = i2 | this.o;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    public final boolean c(String str) {
        JSONObject jSONObject = this.n;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return false;
        }
        int i2 = this.q;
        if (i2 < 0) {
            this.q = 1;
            Iterator<String> keys = this.n.keys();
            String str2 = null;
            String str3 = null;
            while (true) {
                if (!keys.hasNext()) {
                    break;
                }
                String next = keys.next();
                if (e(next)) {
                    str3 = g(next, str);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !str3.equals(str2)) {
                        this.q = 0;
                        break;
                    } else if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                }
            }
            if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
                this.q = 0;
            }
            if (this.q == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(String str, String str2) {
        this.t = str;
        this.u = str2;
    }

    private long l(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        long j2 = -1;
        if (!d(str)) {
            return -1;
        }
        try {
            j2 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("FastOpenDuration");
            return j2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return j2;
        }
    }

    private long m(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        long j2 = 0;
        if (!d(str)) {
            return 0;
        }
        try {
            j2 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("gop");
            return j2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return j2;
        }
    }

    public final String a(long j2, String str) {
        JSONObject jSONObject = this.n;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        Iterator<String> keys = this.n.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (e(next) && j2 == h(next, str) / 1000) {
                return next;
            }
        }
        return null;
    }

    public final String b(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        try {
            String k2 = k(str, str2);
            if (k2 != null) {
                return new JSONObject(k2).optString("AvLines");
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final int c(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return -1;
        }
        try {
            String k2 = k(str, str2);
            if (k2 != null) {
                return new JSONObject(k2).optInt("CheckSilenceInterval");
            }
            return -1;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final String d(String str, String str2) {
        String str3;
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestFormat");
        } catch (JSONException e2) {
            e2.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final String e(String str, String str2) {
        String str3;
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestProtocol");
        } catch (JSONException e2) {
            e2.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final String f(String str, String str2) {
        String str3;
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestAccessCode");
        } catch (JSONException e2) {
            e2.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final String g(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        String str3 = null;
        if (!d(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("VCodec");
            return str3;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return str3;
        }
    }

    public final long h(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        long j2 = 0;
        if (!d(str)) {
            return 0;
        }
        try {
            j2 = new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("vbitrate");
            return j2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return j2;
        }
    }

    public final String k(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        String str3 = null;
        if (!d(str)) {
            return null;
        }
        try {
            str3 = this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params");
            return str3;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return str3;
        }
    }

    public final JSONObject i(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("NNSR"));
            this.f154245f = jSONObject.optInt("ShorterSideUpperBound");
            this.f154246g = jSONObject.optInt("LongerSideUpperBound");
            this.w = jSONObject.optInt("FrameRateUpperBound");
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final JSONObject j(String str, String str2) {
        if (g(str)) {
            str = this.f154241b;
        }
        if (!d(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(this.n.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("ASF"));
            this.f154248i = jSONObject.optInt("LongerSideUpperBound");
            this.f154249j = jSONObject.optInt("LongerSideLowerBound");
            this.f154250k = jSONObject.optInt("ShorterSideUpperBound");
            this.f154251l = jSONObject.optInt("ShorterSideLowerBound");
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(String str, String str2, String str3) {
        this.f154242c = str;
        this.r = str2;
        this.s = str3;
    }

    public final String c(String str, String str2, String str3) {
        String str4;
        String str5;
        if (this.f154240a == null) {
            return null;
        }
        if (str.equals("rtmp")) {
            str4 = "rtmp_ports";
        } else {
            str4 = "http_ports";
        }
        try {
            str5 = new JSONObject(this.f154240a.getJSONObject(str4).optString(str2)).optString(str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
            str5 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        return str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.c.b.b(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final boolean a(int i2, int i3, float f2) {
        int max = Math.max(i2, i3);
        int min = Math.min(i2, i3);
        if (max > this.f154246g || min > this.f154245f || f2 > ((float) this.w)) {
            return false;
        }
        return true;
    }

    public final boolean a(String str, String str2, long j2) {
        if (this.p > 0) {
            return true;
        }
        long j3 = -1;
        String str3 = "ld";
        while (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(b(str3, str, str2))) {
                long h2 = h(str3, str2);
                if (str3.equals("origin") && h2 <= j3 && j2 > 0) {
                    this.p = j2;
                    h2 = j2;
                }
                j3 = h2;
            }
            str3.hashCode();
            switch (str3.hashCode()) {
                case -1008619738:
                    if (!str3.equals("origin")) {
                    }
                    break;
                case 3324:
                    if (str3.equals("hd")) {
                        str3 = "uhd";
                        continue;
                    }
                    break;
                case 3448:
                    if (str3.equals("ld")) {
                        str3 = "sd";
                        continue;
                    }
                    break;
                case 3665:
                    if (str3.equals("sd")) {
                        str3 = "hd";
                        continue;
                    }
                    break;
                case 115761:
                    if (str3.equals("uhd")) {
                        str3 = "origin";
                        continue;
                    }
                    break;
            }
            str3 = null;
        }
        if (this.p > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.c.b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
