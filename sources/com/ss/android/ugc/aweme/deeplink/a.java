package com.ss.android.ugc.aweme.deeplink;

import android.net.Uri;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f79424a = "sslocal";

    /* renamed from: b  reason: collision with root package name */
    public static final String f79425b = "snssdk";

    /* renamed from: c  reason: collision with root package name */
    public static final String f79426c = "localsdk";

    /* renamed from: d  reason: collision with root package name */
    public static final String f79427d = "musically";

    /* renamed from: e  reason: collision with root package name */
    public static final String f79428e = "tiktok";

    /* renamed from: f  reason: collision with root package name */
    public static final C1849a f79429f = new C1849a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.deeplink.a$a  reason: collision with other inner class name */
    public static final class C1849a {
        static {
            Covode.recordClassIndex(49326);
        }

        private C1849a() {
        }

        public static String a() {
            return a.f79425b + d.n;
        }

        public /* synthetic */ C1849a(byte b2) {
            this();
        }

        public static String a(String str) {
            l.d(str, "");
            if (m.a(str)) {
                return str;
            }
            try {
                Uri parse = Uri.parse(str);
                l.b(parse, "");
                String scheme = parse.getScheme();
                String a2 = a();
                if (l.a((Object) a.f79424a, (Object) scheme) || l.a((Object) a.f79426c, (Object) scheme)) {
                    return p.a(str, scheme, a2, false);
                }
                return str;
            } catch (Exception unused) {
                return str;
            }
        }
    }

    static {
        Covode.recordClassIndex(49325);
    }
}
