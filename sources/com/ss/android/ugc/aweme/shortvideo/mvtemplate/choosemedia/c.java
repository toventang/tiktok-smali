package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.bn;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f129128a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f129129b = i.a((h.f.a.a) a.f129130a);

    private static Keva a() {
        return (Keva) f129129b.getValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f129130a = new a();

        static {
            Covode.recordClassIndex(84749);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("allow_ten_minute_video_uploading");
        }
    }

    static {
        Covode.recordClassIndex(84748);
    }

    public static boolean a(String str) {
        l.d(str, "");
        return a().getBoolean(bn.a(str), true);
    }

    public static void b(String str) {
        l.d(str, "");
        a().storeBoolean(bn.a(str), false);
    }
}
