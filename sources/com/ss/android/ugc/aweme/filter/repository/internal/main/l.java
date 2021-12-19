package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.c;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.filter.repository.a.n;

public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95729a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f95730b;

    /* renamed from: c  reason: collision with root package name */
    private final n f95731c;

    static {
        Covode.recordClassIndex(60656);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60657);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static l a(String str) {
            h.f.b.l.d(str, "");
            return new l(str, new o(), (byte) 0);
        }
    }

    private l(String str, n nVar) {
        this.f95730b = str;
        this.f95731c = nVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.n
    public final int a(FilterBean filterBean, k kVar) {
        h.f.b.l.d(filterBean, "");
        h.f.b.l.d(kVar, "");
        int a2 = this.f95731c.a(this.f95730b + '-' + filterBean.getId(), filterBean.getCompareKey());
        if (a2 == -1) {
            return c.a(filterBean, c.a(filterBean, kVar), kVar);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.n
    public final void a(FilterBean filterBean, int i2) {
        h.f.b.l.d(filterBean, "");
        this.f95731c.a(this.f95730b + '-' + filterBean.getId(), i2, filterBean.getCompareKey());
    }

    public /* synthetic */ l(String str, n nVar, byte b2) {
        this(str, nVar);
    }
}
