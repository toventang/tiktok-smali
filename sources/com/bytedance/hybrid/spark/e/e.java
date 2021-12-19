package com.bytedance.hybrid.spark.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31185a = new a((byte) 0);

    static {
        Covode.recordClassIndex(18108);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18109);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(String str) {
            l.c(str, "");
            try {
                Uri parse = Uri.parse(str);
                l.a((Object) parse, "");
                String host = parse.getHost();
                if (host != null && p.c(host, "_page", false)) {
                    return 1;
                }
                String host2 = parse.getHost();
                if (host2 != null && p.c(host2, "_popup", false)) {
                    return 2;
                }
                String host3 = parse.getHost();
                if (host3 == null) {
                    return 1;
                }
                p.c(host3, "_card", false);
                return 1;
            } catch (Exception unused) {
                return 1;
            }
        }
    }
}
