package com.ss.android.ugc.aweme.dsp.playpage.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.c.e;
import com.ss.android.ugc.aweme.dsp.playpage.model.g;
import h.f.b.l;

public interface b {
    public static final a d_ = a.f83711a;

    static {
        Covode.recordClassIndex(52229);
    }

    com.ss.android.ugc.aweme.dsp.playerservice.f.a a();

    int g();

    e k();

    androidx.fragment.app.e m();

    g n();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f83711a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(52230);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r0 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean a(com.ss.android.ugc.aweme.dsp.playpage.base.b r0) {
            /*
                if (r0 == 0) goto L_0x000e
                r0 = 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                if (r0 == 0) goto L_0x000e
                boolean r0 = r0.booleanValue()
                return r0
            L_0x000e:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.base.b.a.a(com.ss.android.ugc.aweme.dsp.playpage.base.b):boolean");
        }

        public static boolean b(b bVar) {
            e eVar;
            if (bVar != null) {
                eVar = bVar.k();
            } else {
                eVar = null;
            }
            return l.a(eVar, e.f83417e);
        }
    }
}
