package com.facebook.a.b.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f46604a;

    /* renamed from: b  reason: collision with root package name */
    public final b f46605b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC1159a f46606c;

    /* renamed from: d  reason: collision with root package name */
    public final String f46607d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f46608e;

    /* renamed from: f  reason: collision with root package name */
    public final List<b> f46609f;

    /* renamed from: g  reason: collision with root package name */
    public final String f46610g;

    /* renamed from: h  reason: collision with root package name */
    public final String f46611h;

    /* renamed from: i  reason: collision with root package name */
    public final String f46612i;

    static {
        Covode.recordClassIndex(28421);
    }

    /* renamed from: com.facebook.a.b.a.a$a  reason: collision with other inner class name */
    public enum EnumC1159a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        static {
            Covode.recordClassIndex(28422);
        }
    }

    public enum b {
        MANUAL,
        INFERENCE;

        static {
            Covode.recordClassIndex(28423);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }, LOOP:0: B:5:0x000e->B:6:0x0010, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.a.b.a.a> a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            if (r4 == 0) goto L_0x000d
            int r1 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x001e
            org.json.JSONObject r0 = r4.getJSONObject(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.a.b.a.a r0 = a(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r3.add(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r2 = r2 + 1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.b.a.a.a(org.json.JSONArray):java.util.List");
    }

    private static a a(JSONObject jSONObject) {
        String string = jSONObject.getString("event_name");
        b valueOf = b.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        EnumC1159a valueOf2 = EnumC1159a.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new c(jSONArray.getJSONObject(i2)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList2.add(new b(optJSONArray.getJSONObject(i3)));
            }
        }
        return new a(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    private a(String str, b bVar, EnumC1159a aVar, String str2, List<c> list, List<b> list2, String str3, String str4, String str5) {
        this.f46604a = str;
        this.f46605b = bVar;
        this.f46606c = aVar;
        this.f46607d = str2;
        this.f46608e = list;
        this.f46609f = list2;
        this.f46610g = str3;
        this.f46611h = str4;
        this.f46612i = str5;
    }
}
