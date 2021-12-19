package com.ss.android.ugc.aweme.video.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.n;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.j;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final C3817a f143231i = new C3817a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f143232a;

    /* renamed from: b  reason: collision with root package name */
    public final j f143233b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f143234c;

    /* renamed from: d  reason: collision with root package name */
    public String f143235d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f143236e;

    /* renamed from: f  reason: collision with root package name */
    public final long f143237f;

    /* renamed from: g  reason: collision with root package name */
    public final long f143238g;

    /* renamed from: h  reason: collision with root package name */
    public final OnUIPlayListener f143239h;

    /* renamed from: j  reason: collision with root package name */
    private final b f143240j;

    static {
        Covode.recordClassIndex(93749);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.a.a$a  reason: collision with other inner class name */
    public static final class C3817a {
        static {
            Covode.recordClassIndex(93750);
        }

        private C3817a() {
        }

        public /* synthetic */ C3817a(byte b2) {
            this();
        }
    }

    public final void c() {
        i iVar = this.f143232a;
        if (iVar != null) {
            iVar.B();
        }
    }

    public final void g() {
        i iVar = this.f143232a;
        if (iVar != null) {
            iVar.F();
        }
    }

    public final String a() {
        String str = this.f143235d;
        if (str == null || p.a((CharSequence) str)) {
            return null;
        }
        return this.f143235d;
    }

    private final boolean h() {
        Aweme aweme;
        AwemeStatus status;
        Aweme aweme2 = this.f143234c;
        if (aweme2 == null || aweme2.getStatus() == null || (aweme = this.f143234c) == null || (status = aweme.getStatus()) == null || !status.isDelete()) {
            return false;
        }
        return true;
    }

    public final void b() {
        i iVar = this.f143232a;
        if (iVar != null && iVar.b(this.f143239h) && 1 != 0) {
            iVar.a((OnUIPlayListener) null);
        }
    }

    public final Video e() {
        Video a2;
        String a3 = a();
        if (a3 != null && (a2 = this.f143240j.a(String.class, a3)) != null) {
            return a2;
        }
        Aweme aweme = this.f143234c;
        if (aweme != null) {
            return this.f143240j.a(Aweme.class, aweme);
        }
        return null;
    }

    public final boolean f() {
        j jVar = this.f143233b;
        l.b(jVar, "");
        if (!jVar.c() || h()) {
            return true;
        }
        return false;
    }

    public final void d() {
        Video e2;
        if (!f()) {
            if ((this.f143234c != null || a() != null) && (e2 = e()) != null) {
                i iVar = this.f143232a;
                if (iVar != null) {
                    iVar.a(this.f143239h);
                }
                i iVar2 = this.f143232a;
                if (iVar2 != null) {
                    j jVar = this.f143233b;
                    l.b(jVar, "");
                    iVar2.a(jVar.b());
                }
                i iVar3 = this.f143232a;
                if (iVar3 != null) {
                    iVar3.a(e2, this.f143239h, 0);
                }
            }
        }
    }

    static final class c extends m implements h.f.a.b<Aweme, Video> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143242a = new c();

        static {
            Covode.recordClassIndex(93752);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Video invoke(Aweme aweme) {
            Aweme aweme2 = aweme;
            l.d(aweme2, "");
            Video video = aweme2.getVideo();
            if (video == null) {
                return null;
            }
            video.setRationAndSourceId(aweme2.getAid());
            return video;
        }
    }

    public final void a(int i2) {
        if (!f()) {
            b(i2);
        }
    }

    static final class b extends m implements h.f.a.b<String, Video> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143241a = new b();

        static {
            Covode.recordClassIndex(93751);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Video invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            Video video = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setBytevc1(false);
            videoUrlModel.setUrlList(n.a(str2));
            videoUrlModel.setUri(str2);
            videoUrlModel.setUrlKey(str2);
            videoUrlModel.setSourceId(str2);
            video.setPlayAddr(videoUrlModel);
            video.setSourceId(str2);
            return video;
        }
    }

    private final void b(int i2) {
        Video e2;
        if ((this.f143234c != null || a() != null) && (e2 = e()) != null) {
            i iVar = this.f143232a;
            if (iVar != null) {
                iVar.a(this.f143239h);
            }
            i iVar2 = this.f143232a;
            if (iVar2 != null) {
                j jVar = this.f143233b;
                l.b(jVar, "");
                iVar2.a(jVar.b());
            }
            i iVar3 = this.f143232a;
            if (iVar3 != null) {
                n.b bVar = new n.b();
                bVar.a(true);
                bVar.a(com.ss.android.ugc.aweme.video.simcommon.a.a(e2));
                bVar.c(true);
                bVar.a(i2);
                bVar.i(this.f143236e);
                iVar3.b(bVar.f143496a);
            }
        }
    }

    public final void a(float f2, float f3) {
        i iVar = this.f143232a;
        if (iVar != null) {
            iVar.a(f2, f3);
        }
    }

    public a(KeepSurfaceTextureView keepSurfaceTextureView, OnUIPlayListener onUIPlayListener) {
        long j2;
        l.d(onUIPlayListener, "");
        this.f143239h = onUIPlayListener;
        this.f143233b = j.a(keepSurfaceTextureView);
        i iVar = this.f143232a;
        long j3 = 0;
        if (iVar != null) {
            j2 = iVar.j();
        } else {
            j2 = 0;
        }
        this.f143237f = j2;
        i iVar2 = this.f143232a;
        this.f143238g = iVar2 != null ? iVar2.n() : j3;
        b bVar = new b();
        bVar.a(String.class, (h.f.a.b) b.f143241a);
        bVar.a(Aweme.class, (h.f.a.b) c.f143242a);
        this.f143240j = bVar;
    }
}
