package com.bytedance.android.a.a.f;

import android.text.TextUtils;
import com.bytedance.android.a.a.h.f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public C0088a f6657a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6658b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6659c;

    /* renamed from: d  reason: collision with root package name */
    public String f6660d;

    /* renamed from: e  reason: collision with root package name */
    public String f6661e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6662f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6663g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, JSONObject> f6664h;

    static {
        Covode.recordClassIndex(3197);
    }

    /* renamed from: com.bytedance.android.a.a.f.a$a  reason: collision with other inner class name */
    public static final class C0088a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6665a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6666b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6667c;

        /* renamed from: d  reason: collision with root package name */
        public String f6668d;

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f6669e;

        static {
            Covode.recordClassIndex(3198);
        }

        public final a a() {
            if (this.f6669e == null) {
                this.f6669e = new JSONObject();
            }
            return new a(this, (byte) 0);
        }
    }

    private a(C0088a aVar) {
        this.f6661e = "";
        this.f6657a = aVar;
        this.f6670i = aVar.f6665a;
        this.f6658b = aVar.f6666b;
        this.f6659c = aVar.f6667c;
        this.f6660d = f.c(aVar.f6668d);
        a(aVar.f6669e);
    }

    @Override // com.bytedance.android.a.a.f.b
    public final void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        super.a(jSONObject);
        if (jSONObject != null) {
            try {
                this.f6661e = jSONObject.optString("appid", "");
                if (this.f6664h == null) {
                    this.f6664h = new HashMap();
                }
                this.f6662f = a(jSONObject, "is_enable_monitor");
                this.f6663g = a(jSONObject, "is_enable_net_opt");
                this.f6664h.clear();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("settings");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (optJSONObject = optJSONObject2.optJSONObject(next)) != null) {
                            this.f6664h.put(next, optJSONObject);
                        }
                    }
                }
            } catch (Throwable th) {
                com.bytedance.android.a.a.h.a.a(th.getMessage());
            }
        }
    }

    /* synthetic */ a(C0088a aVar, byte b2) {
        this(aVar);
    }
}
