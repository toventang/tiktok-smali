package com.bytedance.apm.trace.model;

import android.text.TextUtils;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.h;
import com.bytedance.apm.trace.a.a;
import com.bytedance.apm.trace.a.c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements a, c {

    /* renamed from: a  reason: collision with root package name */
    public final long f25390a;

    /* renamed from: b  reason: collision with root package name */
    public final a f25391b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25392c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25393d;

    /* renamed from: e  reason: collision with root package name */
    private final String f25394e;

    /* renamed from: f  reason: collision with root package name */
    private long f25395f;

    /* renamed from: g  reason: collision with root package name */
    private long f25396g;

    /* renamed from: h  reason: collision with root package name */
    private String f25397h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f25398i;

    /* renamed from: j  reason: collision with root package name */
    private List<com.bytedance.w.a.a> f25399j;

    /* renamed from: k  reason: collision with root package name */
    private long f25400k;

    /* renamed from: l  reason: collision with root package name */
    private long f25401l;

    static {
        Covode.recordClassIndex(14760);
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f25394e);
            jSONObject.put("span_id", new StringBuilder().append(this.f25390a).toString());
            jSONObject.put("operation_name", this.f25393d);
            if (this.f25395f != 0) {
                jSONObject.put("parent_id", new StringBuilder().append(this.f25395f).toString());
            }
            if (this.f25396g != 0) {
                jSONObject.put("reference_id", new StringBuilder().append(this.f25396g).toString());
            }
            jSONObject.put("start_timestamp", this.f25400k);
            jSONObject.put("finish_timestamp", this.f25401l);
            Map<String, String> map = this.f25398i;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("tags", new JSONObject(this.f25398i));
            }
            if (!h.a(this.f25399j)) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.w.a.a aVar : this.f25399j) {
                    jSONArray.put(aVar.a());
                }
                jSONObject.put("logs", jSONArray);
            }
            jSONObject.put("thread_id", this.f25397h);
            jSONObject.put("is_finished", 1);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.trace.a.b
    public final a a(long j2) {
        this.f25395f = j2;
        return this;
    }

    @Override // com.bytedance.apm.trace.a.b
    public final a b(long j2) {
        this.f25396g = j2;
        return this;
    }

    @Override // com.bytedance.apm.trace.a.b
    public final a a(String str) {
        this.f25397h = str;
        return this;
    }

    @Override // com.bytedance.apm.trace.a.b
    public final a a(String str, String str2) {
        this.f25391b.a(str);
        if (this.f25398i == null) {
            this.f25398i = new HashMap();
        }
        if (TextUtils.equals(str, "error")) {
            this.f25392c = true;
        }
        this.f25398i.put(str, str2);
        return this;
    }

    @Override // com.bytedance.apm.trace.a.c
    public final void a(long j2, long j3) {
        String str = this.f25397h;
        if (str == null || str.isEmpty()) {
            this.f25397h = Thread.currentThread().getName();
        }
        this.f25400k = j2;
        this.f25401l = j3;
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.trace.model.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14761);
            }

            public final void run() {
                b.this.a();
            }
        });
    }

    public b(String str, String str2, a aVar, long j2) {
        this.f25393d = str;
        this.f25391b = aVar;
        this.f25394e = str2;
        this.f25390a = j2;
    }
}
