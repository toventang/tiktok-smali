package com.ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.regex.Pattern;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f62830a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f62831b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(38701);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(String str) {
            l.d(str, "");
            return d.f62830a.matcher(str).matches();
        }
    }

    static {
        Covode.recordClassIndex(38700);
        Pattern compile = Pattern.compile("^.{0,30}$");
        l.b(compile, "");
        f62830a = compile;
    }
}
