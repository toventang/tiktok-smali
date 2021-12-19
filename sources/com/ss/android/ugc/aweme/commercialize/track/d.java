package com.ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.r;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final g f75363a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final d f75364b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final h f75365c = i.a((h.f.a.a) a.f75366a);

    public static boolean a() {
        return ((Boolean) f75365c.getValue()).booleanValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75366a = new a();

        static {
            Covode.recordClassIndex(46507);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private static boolean a() {
            boolean z;
            boolean z2;
            try {
                Object a2 = SettingsManager.a().a("ttnet_commerce_control", g.class, d.f75363a);
                if (!(a2 instanceof g)) {
                    a2 = null;
                }
                g gVar = (g) a2;
                if (gVar != null) {
                    z2 = gVar.getEnable3rdTrackerUsingTTNet();
                } else {
                    z2 = false;
                }
                z = q.m223constructorimpl(Boolean.valueOf(z2));
            } catch (Throwable th) {
                z = q.m223constructorimpl(r.a(th));
            }
            if (q.m226exceptionOrNullimpl(z) != null) {
                z = false;
            }
            return ((Boolean) z).booleanValue();
        }
    }

    static {
        Covode.recordClassIndex(46506);
    }
}
