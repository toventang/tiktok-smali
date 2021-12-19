package com.bytedance.ies.bullet.service.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.m;
import h.f.b.l;
import h.q;
import h.r;
import h.z;

public interface j {
    public static final a G = a.f32522a;

    static {
        Covode.recordClassIndex(19290);
    }

    q getLoggerWrapper();

    void printLog(String str, p pVar, String str2);

    void printReject(Throwable th, String str);

    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f32522a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(19291);
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(19292);
        }

        public static void a(j jVar, Throwable th, String str) {
            int i2;
            l.c(th, "");
            l.c(str, "");
            try {
                m mVar = jVar.getLoggerWrapper().f32525a;
                if (mVar == null) {
                    th.getMessage();
                    i2 = 0;
                } else {
                    mVar.a(th, str);
                    i2 = z.f158842a;
                }
                q.m223constructorimpl(i2);
            } catch (Throwable th2) {
                q.m223constructorimpl(r.a(th2));
            }
        }

        public static void a(j jVar, String str, p pVar, String str2) {
            boolean z;
            int i2;
            l.c(str, "");
            l.c(pVar, "");
            l.c(str2, "");
            try {
                m mVar = jVar.getLoggerWrapper().f32525a;
                String str3 = jVar.getLoggerWrapper().f32526b;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = "[" + str2 + "] " + str;
                } else if (str3.length() > 0) {
                    str = "[" + str3 + "] " + str;
                }
                if (mVar == null) {
                    int i3 = k.f32523a[pVar.ordinal()];
                    i2 = 0;
                } else {
                    mVar.a(str, pVar);
                    i2 = z.f158842a;
                }
                q.m223constructorimpl(i2);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }

        public static /* synthetic */ void a(j jVar, String str, p pVar, String str2, int i2) {
            if ((i2 & 2) != 0) {
                pVar = p.I;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            jVar.printLog(str, pVar, str2);
        }
    }
}
