package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.a.l;
import h.f.b.m;
import h.h;
import h.i;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final l f34107a;

    /* renamed from: b  reason: collision with root package name */
    static final h f34108b = i.a((h.f.a.a) a.f34110a);

    /* renamed from: c  reason: collision with root package name */
    public static final o f34109c = new o();

    private o() {
    }

    static final class a extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34110a = new a();

        static {
            Covode.recordClassIndex(20308);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return a();
        }

        private static l a() {
            l lVar;
            try {
                lVar = (l) SettingsManager.a().a("im_sdk_report_db_info", l.class);
            } catch (Throwable unused) {
                lVar = o.f34107a;
            }
            if (lVar == null) {
                return o.f34107a;
            }
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(20307);
        l lVar = new l();
        lVar.enable = 1;
        f34107a = lVar;
    }
}
