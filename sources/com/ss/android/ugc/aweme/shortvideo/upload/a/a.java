package com.ss.android.ugc.aweme.shortvideo.upload.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f131967a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f131968b = i.a((h.f.a.a) C3425a.f131969a);

    public static Keva a() {
        return (Keva) f131968b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.a.a$a  reason: collision with other inner class name */
    static final class C3425a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3425a f131969a = new C3425a();

        static {
            Covode.recordClassIndex(86471);
        }

        C3425a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("upload_cached_log");
        }
    }

    public static final long b() {
        return a().getLong("upload_speed", -1024);
    }

    public static final long c() {
        return a().getLong("upload_finish_timestamp", -1);
    }

    static {
        Covode.recordClassIndex(86470);
    }
}
