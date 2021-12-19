package com.bytedance.android.a.b.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends com.bytedance.android.a.a.f.b {

    /* renamed from: a  reason: collision with root package name */
    public a f6710a;

    /* renamed from: b  reason: collision with root package name */
    public long f6711b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6712c;

    /* renamed from: d  reason: collision with root package name */
    public int f6713d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f6714e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f6715f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f6716g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.a.b.a.a f6717h;

    /* renamed from: j  reason: collision with root package name */
    public int f6718j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6719k;

    /* renamed from: l  reason: collision with root package name */
    public List<String> f6720l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6721m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6723a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f6724b;

        /* renamed from: c  reason: collision with root package name */
        public com.bytedance.android.a.b.a.a f6725c;

        static {
            Covode.recordClassIndex(3235);
        }
    }

    static {
        Covode.recordClassIndex(3233);
    }

    private b(a aVar) {
        this.f6712c = true;
        this.f6714e = a.a(true);
        this.f6715f = a.a(false);
        this.f6721m = false;
        this.f6716g = new ArrayList();
        this.f6718j = 10000;
        this.f6719k = true;
        this.f6720l = new ArrayList();
        this.f6710a = aVar;
        this.f6670i = aVar.f6723a;
        this.f6713d = aVar.f6724b;
        this.f6717h = aVar.f6725c;
        this.f6711b = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.android.a.a.f.b
    public final void a(JSONObject jSONObject) {
        boolean z;
        super.a(jSONObject);
        if (jSONObject != null) {
            boolean z2 = false;
            try {
                this.f6712c = a(jSONObject, "store_when_offline", true);
                this.f6713d = jSONObject.optInt("android_store_impl", 0);
                if (this.f6714e == null) {
                    this.f6714e = new ArrayList();
                }
                this.f6714e.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("macro_standard");
                if (optJSONArray != null) {
                    a(optJSONArray, this.f6714e);
                    a.a(this.f6714e);
                } else {
                    this.f6714e.addAll(a.a(true));
                }
                if (this.f6715f == null) {
                    this.f6715f = new ArrayList();
                }
                this.f6715f.clear();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("macro_non_standard");
                if (optJSONArray2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f6721m = z;
                if (optJSONArray2 != null) {
                    a(optJSONArray2, this.f6715f);
                    a.a(this.f6715f);
                } else {
                    this.f6715f.addAll(a.a(false));
                }
                if (this.f6716g == null) {
                    this.f6716g = new ArrayList();
                }
                this.f6716g.clear();
                a(jSONObject.optJSONArray("macro_blocklist"), this.f6716g);
                this.f6718j = jSONObject.optInt("request_timeout", 10000);
                this.f6720l.clear();
                a(jSONObject.optJSONArray("redirect_blocklist"), this.f6720l);
            } catch (Throwable th) {
                com.bytedance.android.a.a.h.a.a(th.getMessage());
            }
            this.f6711b = SystemClock.uptimeMillis();
            if (jSONObject.optInt("enable_url_encode_compat", 1) == 1) {
                z2 = true;
            }
            this.f6719k = z2;
        }
    }

    public /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    private static void a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == 0)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    Object obj = jSONArray.get(i2);
                    if (obj instanceof String) {
                        list.add(obj);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
    }
}
