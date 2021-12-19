package com.ss.android.ugc.aweme.music.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.utils.dw;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2857a f111543a = new C2857a((byte) 0);

    static {
        Covode.recordClassIndex(71642);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.k.a$a  reason: collision with other inner class name */
    public static final class C2857a {
        static {
            Covode.recordClassIndex(71643);
        }

        private C2857a() {
        }

        public /* synthetic */ C2857a(byte b2) {
            this();
        }

        public static String a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str3, "");
            String string = Keva.getRepoFromSp(d.a(), str3, 0).getString(str, str2);
            l.b(string, "");
            return string;
        }

        public static <T> void a(String str, T t, String str2) {
            l.d(str, "");
            l.d(str2, "");
            Keva repoFromSp = Keva.getRepoFromSp(d.a(), str2, 0);
            if (t instanceof String) {
                repoFromSp.storeString(str, t);
            } else if (t instanceof Boolean) {
                repoFromSp.storeBoolean(str, t.booleanValue());
            } else {
                repoFromSp.storeString(str, dw.a(t));
            }
        }

        public static boolean a(String str, Boolean bool, String str2) {
            l.d(str, "");
            l.d(str2, "");
            boolean z = false;
            Keva repoFromSp = Keva.getRepoFromSp(d.a(), str2, 0);
            if (bool != null) {
                z = bool.booleanValue();
            }
            return repoFromSp.getBoolean(str, z);
        }
    }
}
