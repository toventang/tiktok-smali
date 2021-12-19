package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.i.g;
import h.f.b.l;
import h.h;
import h.i;
import java.util.concurrent.ScheduledExecutorService;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final h f156859a = i.a((h.f.a.a) a.f156860a);

    private static final boolean a() {
        return ((Boolean) f156859a.getValue()).booleanValue();
    }

    static {
        Covode.recordClassIndex(104182);
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156860a = new a();

        static {
            Covode.recordClassIndex(104183);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((Boolean) g.f122216a.getValue()).booleanValue());
        }
    }

    public static final j a(int i2, s sVar) {
        l.d(sVar, "");
        if (i2 == 2) {
            return new p(sVar);
        }
        if (i2 == 3) {
            return new o(sVar);
        }
        if (i2 == 4) {
            return new q(sVar);
        }
        if (i2 == 6) {
            if (a()) {
                sVar.f156868e = true;
            }
            return new n(sVar);
        } else if (i2 == 7) {
            return new r(sVar);
        } else {
            if (i2 == 10) {
                if (a()) {
                    sVar.f156868e = true;
                }
                return new k(sVar);
            } else if (i2 != 11) {
                if (a()) {
                    sVar.f156868e = true;
                }
                ScheduledExecutorService d2 = com.ss.android.ugc.aweme.cw.g.d();
                l.b(d2, "");
                return new g(sVar, d2);
            } else {
                if (a()) {
                    sVar.f156868e = true;
                }
                return new a(sVar);
            }
        }
    }
}
