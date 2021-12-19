package com.ss.android.ugc.aweme.shortvideo.upload.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3427a f131997a = new C3427a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f131998b = com.bytedance.ies.abmock.b.a().a(true, "studio_synthesis_enable_ending_watermark", 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f131999c = i.a((h.f.a.a) b.f132000a);

    static {
        Covode.recordClassIndex(86496);
    }

    public final String a() {
        return (String) this.f131999c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a.a$a  reason: collision with other inner class name */
    public static final class C3427a {
        static {
            Covode.recordClassIndex(86497);
        }

        private C3427a() {
        }

        public /* synthetic */ C3427a(byte b2) {
            this();
        }
    }

    public final boolean c() {
        int i2 = this.f131998b;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (2 == this.f131998b) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f132000a = new b();

        static {
            Covode.recordClassIndex(86498);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String c2 = g.a().g().c().c("ending_watermark");
            File g2 = g.a().g().c().g(c2);
            if (!g2.exists() && !g2.mkdirs()) {
                q.a("EndingWatermarkConfig", new Throwable("create watermark resource root dir failed!"));
            }
            return c2;
        }
    }

    public final File b() {
        return g.a().g().c().a(g.a().g().c().g(a()), "watermark_video.mp4");
    }
}
