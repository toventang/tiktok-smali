package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f123299a;

    /* renamed from: b  reason: collision with root package name */
    public static final C3192a f123300b = new C3192a((byte) 0);

    static {
        Covode.recordClassIndex(80991);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.a$a  reason: collision with other inner class name */
    public static final class C3192a {
        static {
            Covode.recordClassIndex(80992);
        }

        private C3192a() {
        }

        public static boolean a() {
            Boolean bool;
            try {
                IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                bool = iESSettingsProxy.getSilentShareConfigurable();
            } catch (com.bytedance.ies.a unused) {
                bool = true;
            }
            l.b(bool, "");
            if (!bool.booleanValue() || a.f123299a != 0) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C3192a(byte b2) {
            this();
        }

        public static void a(o oVar) {
            l.d(oVar, "");
            o f2 = oVar.f("data");
            if (f2 != null) {
                a.f123299a = a(f2, "tt_publish_enhancement");
            }
        }

        private static int a(o oVar, String str) {
            try {
                r d2 = oVar.d(str);
                if (d2 == null) {
                    return 0;
                }
                if (!(d2.f54900a instanceof Boolean)) {
                    return d2.g();
                }
                if (d2.h()) {
                    return 1;
                }
                return 0;
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        }
    }
}
