package com.bytedance.apm.config;

import android.text.TextUtils;
import com.bytedance.apm.core.b;
import com.bytedance.apm.g.d;
import com.bytedance.apm.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public final String A;
    public final e B;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f24794a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f24795b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f24796c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.apm.g.c f24797d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24798e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24799f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f24800g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f24801h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f24802i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f24803j;

    /* renamed from: k  reason: collision with root package name */
    public final long f24804k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f24805l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f24806m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final JSONObject q;
    public final b r;
    public final IHttpService s;
    public final Set<Object> t;
    public final long u;
    public final com.bytedance.apm.g.b v;
    public final com.bytedance.apm.g.a w;
    public final d x;
    public final ExecutorService y;
    public final com.bytedance.services.apm.api.e z;

    static {
        Covode.recordClassIndex(14530);
    }

    public static final class a {
        com.bytedance.services.apm.api.e A = new com.bytedance.services.apm.api.e() {
            /* class com.bytedance.apm.config.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14532);
            }

            @Override // com.bytedance.services.apm.api.e
            public final byte[] a(byte[] bArr) {
                return EncryptorUtil.a(bArr, bArr.length);
            }
        };
        com.bytedance.apm.h.b B;
        com.bytedance.b.e.b C;
        String D;

        /* renamed from: a  reason: collision with root package name */
        boolean f24807a;

        /* renamed from: b  reason: collision with root package name */
        boolean f24808b;

        /* renamed from: c  reason: collision with root package name */
        boolean f24809c;

        /* renamed from: d  reason: collision with root package name */
        boolean f24810d = h.f24867a;

        /* renamed from: e  reason: collision with root package name */
        boolean f24811e;

        /* renamed from: f  reason: collision with root package name */
        boolean f24812f;

        /* renamed from: g  reason: collision with root package name */
        long f24813g = 2500;

        /* renamed from: h  reason: collision with root package name */
        boolean f24814h = h.f24868b;

        /* renamed from: i  reason: collision with root package name */
        boolean f24815i = h.f24869c;

        /* renamed from: j  reason: collision with root package name */
        boolean f24816j = true;

        /* renamed from: k  reason: collision with root package name */
        boolean f24817k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f24818l;

        /* renamed from: m  reason: collision with root package name */
        public List<String> f24819m = com.bytedance.apm.b.a.f24423a;
        public List<String> n = com.bytedance.apm.b.a.f24425c;
        public List<String> o = com.bytedance.apm.b.a.f24428f;
        JSONObject p = new JSONObject();
        public b q;
        public IHttpService r;
        Set<Object> s = new HashSet();
        public long t = 0;
        public com.bytedance.apm.g.b u;
        public com.bytedance.apm.g.a v;
        d w;
        e x;
        ExecutorService y;
        com.bytedance.apm.g.c z;

        static {
            Covode.recordClassIndex(14531);
        }

        public final c a() {
            if (!TextUtils.isEmpty(this.p.optString("aid"))) {
                TextUtils.isEmpty(this.p.optString("app_version"));
                TextUtils.isEmpty(this.p.optString("update_version_code"));
                TextUtils.isEmpty(this.p.optString("device_id"));
                return new c(this, (byte) 0);
            }
            throw new IllegalArgumentException("aid" + " must not be empty");
        }

        public final a a(JSONObject jSONObject) {
            Iterator<String> keys;
            try {
                JSONObject jSONObject2 = this.p;
                if (!(jSONObject2 == null || jSONObject == null || (keys = jSONObject.keys()) == null)) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!jSONObject.isNull(next)) {
                            jSONObject2.put(next, jSONObject.opt(next));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            return this;
        }

        public final a a(String str, int i2) {
            try {
                this.p.put(str, i2);
            } catch (JSONException unused) {
            }
            return this;
        }

        public final a a(String str, String str2) {
            try {
                this.p.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private c(a aVar) {
        this.q = aVar.p;
        this.n = aVar.f24807a;
        this.o = aVar.f24808b;
        this.r = aVar.q;
        this.f24794a = aVar.f24819m;
        this.s = aVar.r;
        this.f24799f = aVar.f24816j;
        this.f24798e = aVar.f24815i;
        this.f24801h = aVar.f24810d;
        this.f24802i = aVar.f24811e;
        this.f24803j = aVar.f24812f;
        this.f24804k = aVar.f24813g;
        this.f24806m = aVar.f24818l;
        this.t = aVar.s;
        this.f24795b = aVar.n;
        this.f24796c = aVar.o;
        this.u = aVar.t;
        this.f24805l = aVar.f24814h;
        this.f24800g = aVar.f24817k;
        this.w = aVar.v;
        this.v = aVar.u;
        this.x = aVar.w;
        this.y = aVar.y;
        this.f24797d = aVar.z;
        this.z = aVar.A;
        this.p = aVar.f24809c;
        this.A = aVar.D;
        this.B = aVar.x;
        com.bytedance.apm.h.b bVar = aVar.B;
        com.bytedance.apm.h.a.f24996c = bVar;
        if (bVar != null) {
            com.bytedance.apm.h.a.f24994a = true;
        }
        com.bytedance.apm.h.a.f24997d = aVar.C;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
