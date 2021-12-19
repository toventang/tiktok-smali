package com.ss.ugc.live.sdk.msg.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.d.d;
import java.util.Collections;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public d f154109a;

    /* renamed from: b  reason: collision with root package name */
    public String f154110b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f154111c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f154112d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f154113e;

    /* renamed from: f  reason: collision with root package name */
    public a f154114f;

    /* renamed from: g  reason: collision with root package name */
    public String f154115g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f154116h;

    /* renamed from: i  reason: collision with root package name */
    public long f154117i;

    /* renamed from: j  reason: collision with root package name */
    public h f154118j;

    static {
        Covode.recordClassIndex(102795);
    }

    private e() {
        this.f154109a = d.POST;
    }

    public final byte[] a() {
        return d.a(this);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final e f154119a = new e((byte) 0);

        static {
            Covode.recordClassIndex(102796);
        }

        public final e a() {
            if (this.f154119a.f154116h == null) {
                this.f154119a.f154116h = Collections.emptyMap();
            }
            return this.f154119a;
        }

        public final a a(String str) {
            this.f154119a.f154110b = str;
            return this;
        }

        public final a b(String str) {
            this.f154119a.f154115g = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f154119a.f154113e = bArr;
            return this;
        }
    }

    /* synthetic */ e(byte b2) {
        this();
    }
}
