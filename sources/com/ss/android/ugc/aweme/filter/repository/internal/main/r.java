package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.c;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import h.f.b.l;

public final class r implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95746a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f95747b;

    /* renamed from: c  reason: collision with root package name */
    private final n f95748c;

    static {
        Covode.recordClassIndex(60666);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60667);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static n a(String str) {
            l.d(str, "");
            return new r(str, new o("filter_intensity_resId"), (byte) 0);
        }
    }

    private r(String str, n nVar) {
        this.f95747b = str;
        this.f95748c = nVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.n
    public final int a(FilterBean filterBean, k kVar) {
        l.d(filterBean, "");
        l.d(kVar, "");
        int a2 = this.f95748c.a(this.f95747b + '-' + filterBean.getResId(), filterBean.getCompareKey());
        if (a2 == -1) {
            return c.a(filterBean, c.a(filterBean, kVar), kVar);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.n
    public final void a(FilterBean filterBean, int i2) {
        l.d(filterBean, "");
        this.f95748c.a(this.f95747b + '-' + filterBean.getResId(), i2, filterBean.getCompareKey());
    }

    public /* synthetic */ r(String str, n nVar, byte b2) {
        this(str, nVar);
    }
}
