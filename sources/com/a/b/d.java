package com.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public b f4933a;

    /* renamed from: b  reason: collision with root package name */
    public int f4934b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4935c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4936d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4937e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4938f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4939g;

    /* renamed from: h  reason: collision with root package name */
    private int f4940h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f4941a;

        /* renamed from: b  reason: collision with root package name */
        public int f4942b = 1;

        /* renamed from: c  reason: collision with root package name */
        public int f4943c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4944d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4945e = true;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4946f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4947g = true;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4948h = true;

        static {
            Covode.recordClassIndex(2044);
        }
    }

    static {
        Covode.recordClassIndex(2043);
    }

    public final int a() {
        int i2 = this.f4940h;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalStateException("themeID not set");
    }

    public d(a aVar) {
        this.f4933a = aVar.f4941a;
        this.f4934b = aVar.f4942b;
        this.f4940h = aVar.f4943c;
        this.f4935c = aVar.f4944d;
        this.f4936d = aVar.f4945e;
        this.f4937e = aVar.f4946f;
        this.f4938f = aVar.f4947g;
        this.f4939g = aVar.f4948h;
    }
}
