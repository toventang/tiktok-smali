package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static boolean f129045a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final b f129046b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final h f129047c = i.a((h.f.a.a) a.f129048a);

    static Keva a() {
        return (Keva) f129047c.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f129048a = new a();

        static {
            Covode.recordClassIndex(84695);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("allow_long_video");
        }
    }

    static {
        Covode.recordClassIndex(84694);
    }
}
