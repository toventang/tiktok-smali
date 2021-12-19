package com.ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f143475a = a().getBoolean("useSurfaceView", false);

    /* renamed from: b  reason: collision with root package name */
    public static final f f143476b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f143477c = i.a((h.f.a.a) a.f143478a);

    public static Keva a() {
        return (Keva) f143477c.getValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143478a = new a();

        static {
            Covode.recordClassIndex(93885);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("player_setting", 0);
        }
    }

    static {
        Covode.recordClassIndex(93884);
    }
}
