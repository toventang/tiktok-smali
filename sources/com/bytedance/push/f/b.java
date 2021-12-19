package com.bytedance.push.f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f42119a;

    /* renamed from: b  reason: collision with root package name */
    public C1032b f42120b;

    static {
        Covode.recordClassIndex(25742);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f42126a;

        /* renamed from: b  reason: collision with root package name */
        public int f42127b;

        static {
            Covode.recordClassIndex(25745);
        }

        public final String toString() {
            return a();
        }

        /* access modifiers changed from: package-private */
        public final String a() {
            return com.a.a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(this.f42126a), Integer.valueOf(this.f42127b)});
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f42121a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f42122b;

        static {
            Covode.recordClassIndex(25743);
        }

        public final String toString() {
            return "ChildSwitcher{tag='" + this.f42121a + '\'' + ", isOpen=" + this.f42122b + '}';
        }
    }

    /* renamed from: com.bytedance.push.f.b$b  reason: collision with other inner class name */
    public static class C1032b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42123a;

        /* renamed from: b  reason: collision with root package name */
        public c f42124b;

        /* renamed from: c  reason: collision with root package name */
        public c f42125c;

        static {
            Covode.recordClassIndex(25744);
        }

        public final String toString() {
            return "MuteConfig{isMute=" + this.f42123a + ", from=" + this.f42124b + ", to=" + this.f42125c + '}';
        }
    }

    public final String a() {
        int i2;
        C1032b bVar = this.f42120b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (bVar.f42123a) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_mute", i2);
            if (bVar.f42123a) {
                jSONObject.put("start_time", bVar.f42124b.a());
                jSONObject.put("end_time", bVar.f42125c.a());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String b() {
        int i2;
        ArrayList<a> arrayList = this.f42119a == null ? null : new ArrayList(this.f42119a);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (a aVar : arrayList) {
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (aVar.f42122b) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    jSONObject.put("is_close", i2);
                    jSONObject.put(StringSet.name, aVar.f42121a);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }
}
