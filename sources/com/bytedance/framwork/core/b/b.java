package com.bytedance.framwork.core.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.b.b.a;
import com.bytedance.framwork.core.b.c.d;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements com.bytedance.framwork.core.b.d.b {

    /* renamed from: a  reason: collision with root package name */
    public int f29392a = 120;

    /* renamed from: b  reason: collision with root package name */
    public int f29393b = 100;

    /* renamed from: c  reason: collision with root package name */
    public String f29394c;

    /* renamed from: d  reason: collision with root package name */
    public Context f29395d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f29396e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f29397f;

    /* renamed from: g  reason: collision with root package name */
    private long f29398g;

    /* renamed from: h  reason: collision with root package name */
    private c f29399h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f29400i = true;

    /* renamed from: j  reason: collision with root package name */
    private long f29401j;

    /* renamed from: k  reason: collision with root package name */
    private long f29402k;

    static {
        Covode.recordClassIndex(17141);
    }

    public final void a() {
        this.f29400i = true;
        this.f29402k = 0;
    }

    private boolean b() {
        int i2 = this.f29393b;
        List<a> a2 = this.f29399h.a(Integer.parseInt(this.f29394c), i2);
        if (com.bytedance.framwork.core.b.e.b.a(a2)) {
            return true;
        }
        long j2 = -1;
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONArray();
            LinkedList linkedList = new LinkedList();
            for (a aVar : a2) {
                long j3 = aVar.f29403a;
                if (j3 > j2) {
                    j2 = j3;
                }
                String str = aVar.f29407e;
                linkedList.add(aVar);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("log_id", j3);
                    jSONObject.put("d_s_t", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
            z = a(jSONArray);
            if (z) {
                b(j2);
            }
        } catch (Throwable unused2) {
        }
        return z;
    }

    public final int b(long j2) {
        return this.f29399h.a(this.f29394c, j2);
    }

    public final void c(long j2) {
        this.f29400i = false;
        this.f29401j = System.currentTimeMillis();
        this.f29402k = j2;
    }

    private boolean a(JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (jSONArray.length() == 0) {
                return false;
            }
            jSONObject.put("data", jSONArray);
            JSONObject jSONObject2 = this.f29396e;
            if (jSONObject2 == null) {
                return true;
            }
            jSONObject.put("header", jSONObject2);
            String str = this.f29394c;
            String jSONObject3 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject3)) {
                return false;
            }
            return d.f29439b.get(str).b(jSONObject3);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.framwork.core.b.d.b
    public final void a(long j2) {
        long j3 = this.f29402k;
        if (j3 > 0 && j2 - this.f29401j > j3) {
            a();
        }
        if (this.f29400i && !this.f29397f) {
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = (long) this.f29399h.a(this.f29394c);
            if (a2 <= 0) {
                return;
            }
            if (a2 > ((long) this.f29393b) || (currentTimeMillis - this.f29398g) / 1000 > ((long) this.f29392a)) {
                this.f29398g = currentTimeMillis;
                b();
            }
        }
    }

    public b(Context context, String str) {
        this.f29395d = context;
        this.f29399h = c.a(context);
        this.f29394c = str;
    }
}
