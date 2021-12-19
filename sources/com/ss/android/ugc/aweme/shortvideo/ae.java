package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final String f124883a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f124884b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f124885c;

    /* renamed from: d  reason: collision with root package name */
    public static final ae f124886d = new ae();

    /* renamed from: e  reason: collision with root package name */
    private static final h f124887e = i.a((h.f.a.a) a.f124888a);

    public static String a() {
        return (String) f124887e.getValue();
    }

    private ae() {
    }

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124888a = new a();

        static {
            Covode.recordClassIndex(82052);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            if (db.b()) {
                string = c.f115622a.getString(R.string.f_3);
            } else {
                string = c.f115622a.getString(R.string.f_4);
            }
            l.b(string, "");
            return string;
        }
    }

    static {
        Covode.recordClassIndex(82051);
        String string = com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.f_2);
        l.b(string, "");
        f124883a = string;
        String string2 = com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.f_4);
        l.b(string2, "");
        f124884b = string2;
        String string3 = com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.f_3);
        l.b(string3, "");
        f124885c = string3;
    }

    public static boolean b(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) f124884b) || l.a((Object) str, (Object) f124885c)) {
            return true;
        }
        return false;
    }

    public static int a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) f124883a)) {
            return 10;
        }
        if (l.a((Object) str, (Object) f124885c)) {
            return 14;
        }
        if (l.a((Object) str, (Object) f124884b)) {
            return 11;
        }
        return 8;
    }
}
