package com.ss.android.ugc.aweme.ecommerce.pdp.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import f.a.t;
import h.f.b.l;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f86589e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86590a;

    /* renamed from: b  reason: collision with root package name */
    public final int f86591b;

    /* renamed from: c  reason: collision with root package name */
    public t<ProductPackStruct> f86592c;

    /* renamed from: d  reason: collision with root package name */
    public ProductPackStruct f86593d;

    static {
        Covode.recordClassIndex(54244);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54245);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private d(String str, int i2, t<ProductPackStruct> tVar) {
        l.d(str, "");
        l.d(tVar, "");
        this.f86590a = str;
        this.f86591b = i2;
        this.f86592c = tVar;
        this.f86593d = null;
    }

    public /* synthetic */ d(String str, int i2, t tVar, byte b2) {
        this(str, i2, tVar);
    }
}
