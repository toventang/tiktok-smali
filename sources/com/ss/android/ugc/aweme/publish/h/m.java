package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.publish.k;
import com.ss.android.ugc.aweme.publish.n;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import h.f.b.l;
import h.h;
import h.i;

final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    private final h f118831a = i.a((h.f.a.a) a.f118833a);

    /* renamed from: b  reason: collision with root package name */
    private final h f118832b = i.a((h.f.a.a) b.f118834a);

    static {
        Covode.recordClassIndex(77185);
    }

    static final class a extends h.f.b.m implements h.f.a.a<TTUploaderService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118833a = new a();

        static {
            Covode.recordClassIndex(77186);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TTUploaderService invoke() {
            return new TTUploaderService();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<h> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118834a = new b();

        static {
            Covode.recordClassIndex(77187);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h();
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.n
    public final com.ss.android.ugc.aweme.uploader.b c() {
        return new com.ss.android.ugc.aweme.publish.core.uploader.engine.a();
    }

    @Override // com.ss.android.ugc.aweme.publish.n
    public final com.ss.android.ugc.aweme.uploader.b.a d() {
        return new com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.b();
    }

    @Override // com.ss.android.ugc.aweme.publish.n
    public final com.ss.android.ugc.aweme.uploader.a.a e() {
        return new com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.a();
    }

    @Override // com.ss.android.ugc.aweme.publish.n
    public final k a() {
        return (h) this.f118832b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.publish.n
    public final q<com.ss.android.ugc.aweme.publish.f.h> b() {
        q<com.ss.android.ugc.aweme.publish.f.h> a2 = ((TTUploaderService) this.f118831a.getValue()).a();
        l.b(a2, "");
        return a2;
    }
}
