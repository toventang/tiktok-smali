package com.ss.android.ugc.aweme.sticker.p;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f134993a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f134994b = i.a((h.f.a.a) a.f134995a);

    public static Keva a() {
        return (Keva) f134994b.getValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f134995a = new a();

        static {
            Covode.recordClassIndex(88271);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("sticker_bind_music");
        }
    }

    static {
        Covode.recordClassIndex(88270);
    }

    public static final String a(String str) {
        if (str == null) {
            return null;
        }
        return a().getString(str, null);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a().storeString(str, str2);
    }
}
