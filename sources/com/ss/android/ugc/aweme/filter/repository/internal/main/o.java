package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

/* access modifiers changed from: package-private */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95734a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f95735b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95736c;

    static {
        Covode.recordClassIndex(60661);
    }

    private final Keva a() {
        return (Keva) this.f95735b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60662);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f95737a = new b();

        static {
            Covode.recordClassIndex(60663);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("filter_intensity");
        }
    }

    public /* synthetic */ o() {
        this("filter_intensity");
    }

    public o(String str) {
        l.d(str, "");
        this.f95736c = str;
        this.f95735b = i.a((h.f.a.a) b.f95737a);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.n
    public final int a(String str, String str2) {
        l.d(str, "");
        if (str2 != null) {
            return a().getInt(str2, -1);
        }
        return a().getInt(str, -1);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.n
    public final void a(String str, int i2, String str2) {
        l.d(str, "");
        if (str2 != null) {
            a().storeInt(str2, i2);
        } else {
            a().storeInt(str, i2);
        }
    }
}
