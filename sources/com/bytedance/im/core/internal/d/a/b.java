package com.bytedance.im.core.internal.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.proto.Request;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f38697a;

    /* renamed from: b  reason: collision with root package name */
    public String f38698b;

    /* renamed from: c  reason: collision with root package name */
    public String f38699c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f38700d;

    /* renamed from: e  reason: collision with root package name */
    public Request f38701e;

    static {
        Covode.recordClassIndex(23076);
    }

    private b() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f38702a = new b((byte) 0);

        static {
            Covode.recordClassIndex(23077);
        }

        public final a a(Request request) {
            this.f38702a.f38701e = request;
            return this;
        }

        public final a a(String str) {
            this.f38702a.f38699c = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f38702a.f38700d = bArr;
            return this;
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }
}
