package com.ss.android.ugc.aweme.compliance.protection.restrictmode;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.experiment.cn;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77991a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f77992b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final h f77993c = i.a((h.f.a.a) C1810a.f77994a);

    private static boolean b() {
        return ((Boolean) f77993c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.a$a  reason: collision with other inner class name */
    static final class C1810a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1810a f77994a = new C1810a();

        static {
            Covode.recordClassIndex(48348);
        }

        C1810a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "is_opt_restrict_mode", false));
        }
    }

    static {
        Covode.recordClassIndex(48347);
    }

    public static boolean a() {
        if (cn.f89703a) {
            return b();
        }
        return b.a().a(true, "is_opt_restrict_mode", false);
    }
}
