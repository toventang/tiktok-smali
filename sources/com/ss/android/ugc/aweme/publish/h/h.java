package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c;
import com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d;
import com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g;
import com.ss.android.ugc.aweme.publish.k;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import h.f.b.m;
import h.i;

final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f118829a = i.a((h.f.a.a) a.f118830a);

    static {
        Covode.recordClassIndex(77176);
    }

    private final g e() {
        return (g) this.f118829a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.publish.k
    public final void a() {
        e().a();
    }

    @Override // com.ss.android.ugc.aweme.publish.k
    public final void c() {
        e().c();
    }

    @Override // com.ss.android.ugc.aweme.publish.k
    public final UploadSpeedInfo b() {
        return e().b();
    }

    @Override // com.ss.android.ugc.aweme.publish.k
    public final boolean d() {
        return e().d();
    }

    static final class a extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118830a = new a();

        static {
            Covode.recordClassIndex(77177);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            int a2 = com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.k.a();
            if (a2 == 0) {
                return new d();
            }
            if (a2 == 1) {
                return new c();
            }
            throw new IllegalArgumentException("speed test argument not supported");
        }
    }
}
