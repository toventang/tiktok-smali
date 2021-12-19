package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.m;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class ba implements bt {
    public static final a z = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public bw f125670a;

    /* renamed from: b  reason: collision with root package name */
    public bv f125671b;

    /* renamed from: c  reason: collision with root package name */
    public final l f125672c = new l();

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f125673d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g f125674e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e f125675f = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e();

    /* renamed from: g  reason: collision with root package name */
    public VideoSegment f125676g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.c f125677h;

    /* renamed from: i  reason: collision with root package name */
    public String f125678i = "sync_page_recommend";

    /* renamed from: j  reason: collision with root package name */
    public boolean f125679j;

    /* renamed from: k  reason: collision with root package name */
    public long f125680k;

    /* renamed from: l  reason: collision with root package name */
    public m f125681l;

    /* renamed from: m  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.shortvideo.c> f125682m;
    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.e n;
    public com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h o;
    public int p;
    com.ss.android.ugc.aweme.shortvideo.ac.a q;
    public long r;
    public boolean s;
    public CutVideoStickerPointMusicViewModel t;
    CutVideoMultiModeViewModel u;
    CutVideoBottomBarViewModel v;
    CutVideoEditViewModel w;
    public boolean x;
    public boolean y;

    static {
        Covode.recordClassIndex(82536);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82537);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {
        static {
            Covode.recordClassIndex(82544);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
        }

        h() {
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    public final void e() {
        this.f125672c.c(0);
    }

    public static final class c implements l.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ba f125685a;

        static {
            Covode.recordClassIndex(82539);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
        public final boolean a() {
            return this.f125685a.g();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
        public final List<VideoSegment> b() {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125685a.f125674e;
            if (gVar == null) {
                h.f.b.l.b();
            }
            return gVar.c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ba baVar) {
            this.f125685a = baVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
        public final void a(long j2) {
            this.f125685a.f125672c.a(j2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r3 != 6) goto L_0x0021;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r3) {
            /*
                r2 = this;
                r0 = 5
                if (r3 == r0) goto L_0x0021
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f125685a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g r0 = r0.f125674e
                if (r0 == 0) goto L_0x001b
                boolean r0 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.a(r3)
                if (r0 != 0) goto L_0x001b
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f125685a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g r0 = r0.f125674e
                if (r0 != 0) goto L_0x0018
                h.f.b.l.b()
            L_0x0018:
                r0.b()
            L_0x001b:
                r0 = 7
                if (r3 == r0) goto L_0x002a
                r0 = 6
                if (r3 == r0) goto L_0x002a
            L_0x0021:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f125685a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h r0 = r0.a()
                r0.f()
            L_0x002a:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r0 = r2.f125685a
                com.ss.android.ugc.aweme.shortvideo.cut.scene.bv r1 = r0.f125671b
                if (r1 != 0) goto L_0x0035
                java.lang.String r0 = "stickPointVideoSegController"
                h.f.b.l.a(r0)
            L_0x0035:
                r1.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba.c.a(int):void");
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ba f125686a;

        static {
            Covode.recordClassIndex(82540);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.e
        public final VESize b() {
            com.ss.android.ugc.asve.editor.g gVar = this.f125686a.f125672c.f125973a;
            if (gVar != null) {
                return gVar.b();
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.e
        public final int a() {
            if (this.f125686a.f125676g == null) {
                return 0;
            }
            VideoSegment videoSegment = this.f125686a.f125676g;
            if (videoSegment == null) {
                h.f.b.l.b();
            }
            return videoSegment.f125486j;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(ba baVar) {
            this.f125686a = baVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.e
        public final void a(float f2, float f3, float f4, int i2) {
            com.ss.android.ugc.asve.editor.g gVar = this.f125686a.f125672c.f125973a;
            if (gVar != null) {
                gVar.a(f2, f3, f4, 0, i2);
            }
            ba.a(this.f125686a).f126016a = f2;
            ba.a(this.f125686a).f126017b = f3;
            ba.a(this.f125686a).f126018c = 0;
            ba.a(this.f125686a).f126019d = i2;
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ba f125688a;

        static {
            Covode.recordClassIndex(82545);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
            this.f125688a.f125672c.a(0L);
            this.f125688a.a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(ba baVar) {
            this.f125688a = baVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            boolean z;
            ba baVar = this.f125688a;
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            baVar.a(z);
        }
    }

    public final void f() {
        this.f125672c.a((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f) new i(this), false);
    }

    public final boolean g() {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.u;
        if (cutVideoMultiModeViewModel == null) {
            h.f.b.l.a("multiModeViewModel");
        }
        return cutVideoMultiModeViewModel.a();
    }

    public final m h() {
        m mVar = this.f125681l;
        if (mVar == null) {
            h.f.b.l.a("stickPointVideoRotateData");
        }
        return mVar;
    }

    public final com.ss.android.ugc.aweme.shortvideo.c i() {
        bw bwVar = this.f125670a;
        if (bwVar == null) {
            h.f.b.l.a("musicViewController");
        }
        return bwVar.a();
    }

    public final void j() {
        this.p = this.f125672c.e();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    public final bv k() {
        bv bvVar = this.f125671b;
        if (bvVar == null) {
            h.f.b.l.a("stickPointVideoSegController");
        }
        return bvVar;
    }

    public static final class b implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ba f125683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f125684b;

        static {
            Covode.recordClassIndex(82538);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e.b
        public final void a() {
            if (this.f125683a.f125672c.a()) {
                this.f125683a.x = true;
            }
            this.f125683a.f125672c.b();
            this.f125683a.f125680k = System.currentTimeMillis();
        }

        b(ba baVar, androidx.fragment.app.e eVar) {
            this.f125683a = baVar;
            this.f125684b = eVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e.b
        public final void a(boolean z, boolean z2, boolean z3) {
            if (z) {
                this.f125683a.f125672c.f();
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f125684b).a(R.string.g7r).a();
                this.f125683a.f125679j = true;
            } else if (this.f125683a.x) {
                this.f125683a.f125672c.c();
                this.f125683a.x = false;
            }
            if (z3) {
                com.ss.android.ugc.aweme.video.e.c(new File(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125943b).getPath());
            }
            if (z2) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125683a.f125674e;
                if (gVar == null) {
                    h.f.b.l.b();
                }
                List<VideoSegment> c2 = gVar.c();
                if (c2 != null && !c2.isEmpty()) {
                    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.c(c2);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i.a(z, z2, System.currentTimeMillis() - this.f125683a.f125680k);
        }
    }

    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h a() {
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
        if (hVar == null) {
            h.f.b.l.a("videoEditView");
        }
        return hVar;
    }

    public final List<VideoSegment> c() {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125674e;
        if (gVar == null || k.a(gVar.c())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar2 = this.f125674e;
        if (gVar2 == null) {
            h.f.b.l.b();
        }
        for (VideoSegment videoSegment : gVar2.c()) {
            if (!videoSegment.f125485i) {
                arrayList.add(videoSegment);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    public final void d() {
        bv bvVar = this.f125671b;
        if (bvVar == null) {
            h.f.b.l.a("stickPointVideoSegController");
        }
        bvVar.b(false);
        this.f125672c.c(1);
        this.f125672c.g();
        this.f125672c.d();
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125674e;
        if (gVar != null) {
            gVar.a(false, true);
        }
    }

    public final List<VideoSegment> b() {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125674e;
        if (gVar == null || k.a(gVar.c())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar2 = this.f125674e;
        if (gVar2 == null) {
            h.f.b.l.b();
        }
        for (VideoSegment videoSegment : gVar2.c()) {
            if (!videoSegment.f125485i && !videoSegment.p && !this.f125675f.a(videoSegment) && !com.ss.android.ugc.tools.utils.h.a(videoSegment.a(false), false)) {
                arrayList.add(videoSegment);
            }
        }
        return arrayList;
    }

    public static final class g implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ba f125687a;

        static {
            Covode.recordClassIndex(82543);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(ba baVar) {
            this.f125687a = baVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            if (!this.f125687a.g() || this.f125687a.f125673d == null) {
                this.f125687a.f125672c.d();
                if (this.f125687a.g()) {
                    this.f125687a.f125672c.a(0L);
                } else {
                    this.f125687a.f125672c.a((long) this.f125687a.p);
                }
            } else {
                CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f125687a.t;
                if (cutVideoStickerPointMusicViewModel == null) {
                    h.f.b.l.a("musicViewModel");
                }
                cutVideoStickerPointMusicViewModel.a();
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ ba this$0;

        static {
            Covode.recordClassIndex(82542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ba baVar) {
            super(1);
            this.this$0 = baVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.s = bool.booleanValue();
            return z.f158842a;
        }
    }

    public static final /* synthetic */ m a(ba baVar) {
        m mVar = baVar.f125681l;
        if (mVar == null) {
            h.f.b.l.a("stickPointVideoRotateData");
        }
        return mVar;
    }

    static final class e extends h.f.b.m implements h.f.a.b<Float, z> {
        final /* synthetic */ ba this$0;

        static {
            Covode.recordClassIndex(82541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ba baVar) {
            super(1);
            this.this$0 = baVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Float f2) {
            this.this$0.r = (long) (f2.floatValue() * 1000.0f);
            return z.f158842a;
        }
    }

    public final void a(boolean z2) {
        bv bvVar = this.f125671b;
        if (bvVar == null) {
            h.f.b.l.a("stickPointVideoSegController");
        }
        bvVar.b(true);
        if (this.f125673d != null) {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.t;
            if (cutVideoStickerPointMusicViewModel == null) {
                h.f.b.l.a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.a();
        } else {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.t;
            if (cutVideoStickerPointMusicViewModel2 == null) {
                h.f.b.l.a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel2.a(false);
            this.f125672c.a(0L);
        }
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = this.f125674e;
        if (gVar != null) {
            gVar.a(true, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    public final void a(int i2, VideoSegment videoSegment) {
        this.f125672c.f125977e = i2;
        this.f125676g = videoSegment;
        if (g()) {
            this.f125672c.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    public final void a(boolean z2, boolean z3) {
        if (z2) {
            l lVar = this.f125672c;
            VideoSegment videoSegment = this.f125676g;
            if (videoSegment == null) {
                Integer.valueOf(-201);
            } else {
                com.ss.android.ugc.asve.editor.g gVar = lVar.f125973a;
                if (gVar != null) {
                    Integer.valueOf(gVar.b(videoSegment.f125477a, v.a.a(videoSegment.f125486j)));
                }
            }
        }
        if (g()) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar2 = this.f125674e;
            if (gVar2 != null) {
                gVar2.b();
            }
            this.f125672c.a(z2, z3, 0, new h());
        }
        this.f125676g = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    public final void a(int i2, int i3, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        h.f.b.l.d(fVar, "");
        if (g()) {
            this.f125672c.a(i2, i3, fVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 == null) goto L_0x001d;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r9, float r10, float r11) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.scene.ba.a(float, float, float):void");
    }
}
