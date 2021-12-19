package com.ss.android.ugc.aweme.external.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.external.a.e;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.x;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class d implements IAVTransformService {
    static {
        Covode.recordClassIndex(56665);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVTransformService.ITransformCallback $callback;

        static {
            Covode.recordClassIndex(56667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.$callback = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$callback.finish(null);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$d  reason: collision with other inner class name */
    static final class C2172d extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVTransformService.ITransformCallback $callback;

        static {
            Covode.recordClassIndex(56669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2172d(IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.$callback = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVTransformService.ITransformCallback iTransformCallback = this.$callback;
            if (iTransformCallback != null) {
                iTransformCallback.finish(false);
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVTransformService.ITransformCallback $call;

        static {
            Covode.recordClassIndex(56673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.$call = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVTransformService.ITransformCallback iTransformCallback = this.$call;
            if (iTransformCallback != null) {
                iTransformCallback.finish(-1);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ String $audioPath;
        final /* synthetic */ IAVTransformService.ITransformCallback $callback;

        static {
            Covode.recordClassIndex(56666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.$audioPath = str;
            this.$callback = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Object a2;
            if (TextUtils.isEmpty(this.$audioPath)) {
                a2 = null;
            } else {
                a2 = com.ss.android.ugc.aweme.port.in.c.D.b().a(k.b.a(this.$audioPath));
            }
            this.$callback.finish(a2);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVTransformService.ITransformCallback $call;
        final /* synthetic */ int $duration;
        final /* synthetic */ String $inputPath;
        final /* synthetic */ String $outputPath;
        final /* synthetic */ IAVTransformService.ITransformProgress $progressCallback;
        final /* synthetic */ int $startTime;

        static {
            Covode.recordClassIndex(56671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, String str2, int i2, int i3, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.$inputPath = str;
            this.$outputPath = str2;
            this.$startTime = i2;
            this.$duration = i3;
            this.$progressCallback = iTransformProgress;
            this.$call = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.common.utility.d.b.b(di.f126461d);
            com.bytedance.common.utility.d.b.b(di.o);
            com.bytedance.common.utility.d.b.b(di.f126462e);
            VEUtils.k kVar = new VEUtils.k();
            kVar.f150844a = this.$inputPath;
            kVar.f150845b = this.$outputPath;
            kVar.f150855l = this.$startTime;
            kVar.f150856m = this.$duration;
            kVar.f150851h = -1;
            kVar.f150852i = 240;
            kVar.f150850g = 10;
            int convertVideo2Webp = VEUtils.convertVideo2Webp(kVar, new a(this));
            IAVTransformService.ITransformCallback iTransformCallback = this.$call;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Integer.valueOf(convertVideo2Webp));
            }
            return z.f158842a;
        }

        static final class a implements VEUtils.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90294a;

            static {
                Covode.recordClassIndex(56672);
            }

            a(f fVar) {
                this.f90294a = fVar;
            }

            @Override // com.ss.android.vesdk.VEUtils.i
            public final void a(int i2) {
                IAVTransformService.ITransformProgress iTransformProgress = this.f90294a.$progressCallback;
                if (iTransformProgress != null) {
                    iTransformProgress.update(i2);
                }
            }
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ VideoShare2GifEditContext $context;
        final /* synthetic */ e $listener;

        static {
            Covode.recordClassIndex(56668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoShare2GifEditContext videoShare2GifEditContext, e eVar) {
            super(0);
            this.$context = videoShare2GifEditContext;
            this.$listener = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            float f2;
            VideoShare2GifEditContext videoShare2GifEditContext = this.$context;
            e eVar = this.$listener;
            eVar.onStart();
            x xVar = new x(videoShare2GifEditContext.f123493f);
            if (xVar.a(new String[]{videoShare2GifEditContext.f123488a}, (String[]) null, (String[]) null, x.l.VIDEO_OUT_RATIO_ORIGINAL) != 0) {
                eVar.onDone(false);
            } else {
                xVar.f();
                xVar.b(new com.ss.android.ugc.aweme.shortvideo.cut.a.a.d(eVar, xVar));
                xVar.a(new com.ss.android.ugc.aweme.shortvideo.cut.a.a.e(eVar, xVar));
                if (!TextUtils.isEmpty(videoShare2GifEditContext.f123492e)) {
                    File file = new File(videoShare2GifEditContext.f123492e);
                    if (file.exists()) {
                        com.ss.android.ugc.aweme.shortvideo.cut.a.a.c.a(file);
                    }
                    xVar.e((int) videoShare2GifEditContext.f123500m, (int) videoShare2GifEditContext.n);
                    if (videoShare2GifEditContext.f123490c) {
                        String str = i.f115645a.getExternalCacheDir() + "/watermark.png";
                        if (com.ss.android.ugc.tools.utils.i.a(str)) {
                            com.ss.android.ugc.aweme.video.e.c(str);
                        }
                        com.ss.android.ugc.aweme.port.in.g.a().p().a().a(str);
                        if (videoShare2GifEditContext.f123496i < videoShare2GifEditContext.f123497j) {
                            f2 = 0.47f;
                        } else {
                            f2 = 0.27f;
                        }
                        float f3 = (((((float) videoShare2GifEditContext.f123496i) * f2) * 52.0f) / 145.0f) / ((float) videoShare2GifEditContext.f123497j);
                        xVar.al = str;
                        xVar.am = (double) f2;
                        xVar.an = (double) f3;
                        xVar.ao = (double) (1.0f - (f2 / 2.0f));
                        xVar.ap = (double) (1.0f - (f3 / 2.0f));
                    }
                    int i3 = videoShare2GifEditContext.f123496i;
                    if (videoShare2GifEditContext.f123496i > videoShare2GifEditContext.f123497j) {
                        i2 = 480;
                    } else {
                        i2 = 270;
                    }
                    int min = Math.min(i3, i2);
                    int i4 = (int) (((((float) min) * 1.0f) / ((float) videoShare2GifEditContext.f123496i)) * ((float) videoShare2GifEditContext.f123497j));
                    VEVideoEncodeSettings d2 = new VEVideoEncodeSettings.a(2).a(VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF).a(min, i4).a(8).b(com.ss.android.ugc.aweme.property.b.b()).d();
                    d2.setSpeed(2.5f);
                    eVar.onConfigured(new com.ss.android.ugc.aweme.shortvideo.cut.a.a.a(min, i4, videoShare2GifEditContext.f123500m, videoShare2GifEditContext.n));
                    xVar.d(2);
                    xVar.a(videoShare2GifEditContext.f123492e, (String) null, d2);
                }
            }
            return z.f158842a;
        }
    }

    public static final class e implements IVideo2GifService.ConvertListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoShare2GifEditContext f90291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IAVTransformService.ITransformProgress f90292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IAVTransformService.ITransformCallback f90293c;

        static {
            Covode.recordClassIndex(56670);
        }

        @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onStart() {
        }

        @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onUpdateProgress(int i2) {
            IAVTransformService.ITransformProgress iTransformProgress = this.f90292b;
            if (iTransformProgress != null) {
                iTransformProgress.update(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onDone(boolean z) {
            IAVTransformService.ITransformCallback iTransformCallback = this.f90293c;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Boolean.valueOf(z));
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onConfigured(com.ss.android.ugc.aweme.shortvideo.cut.a.a.a aVar) {
            l.d(aVar, "");
            r.a("gif_generate", new com.ss.android.ugc.aweme.df.k().a("height", String.valueOf(aVar.f125423b)).a("width", String.valueOf(aVar.f125422a)).a("gif_length_in_video", String.valueOf(aVar.f125425d - aVar.f125424c)).a("gif_offset", String.valueOf(aVar.f125424c)).a("group_id", this.f90291a.f123489b).a("author_id", this.f90291a.p).a("speed", String.valueOf(aVar.f125426e)).a());
        }

        e(VideoShare2GifEditContext videoShare2GifEditContext, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback iTransformCallback) {
            this.f90291a = videoShare2GifEditContext;
            this.f90292b = iTransformProgress;
            this.f90293c = iTransformCallback;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r7 = r1.f118753d;
        r8 = r1.f118750a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r8 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r1 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r0 = r1.f118758i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig(r3, r4, r5, r6, r7, r8, r9, null, null, null, null, 1920, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r5 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        r6 = r1.f118752c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r6 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        h.f.b.l.b(r6, r9);
     */
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig parseUploadVideoConfig(java.lang.String r17) {
        /*
            r16 = this;
            java.lang.String r9 = ""
            r2 = r17
            h.f.b.l.d(r2, r9)
            com.ss.android.ugc.aweme.port.in.u r0 = com.ss.android.ugc.aweme.port.in.g.a()
            com.ss.android.ugc.aweme.port.in.au r0 = r0.C()
            com.google.gson.f r1 = r0.getRetrofitFactoryGson()
            java.lang.Class<com.ss.android.ugc.aweme.publish.f.d> r0 = com.ss.android.ugc.aweme.publish.f.d.class
            java.lang.Object r0 = r1.a(r2, r0)
            h.f.b.l.b(r0, r9)
            com.ss.android.ugc.aweme.publish.f.d r0 = (com.ss.android.ugc.aweme.publish.f.d) r0
            com.ss.android.ugc.aweme.publish.f.g r1 = r0.f118722a
            com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig r2 = new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig
            r0 = 0
            if (r1 == 0) goto L_0x0056
            int r3 = r1.f118757h
            int r4 = r1.f118755f
            java.lang.String r5 = r1.f118751b
            if (r5 != 0) goto L_0x0030
        L_0x002d:
            r5 = r9
            if (r1 == 0) goto L_0x0034
        L_0x0030:
            java.lang.String r6 = r1.f118752c
            if (r6 != 0) goto L_0x0035
        L_0x0034:
            r6 = r9
        L_0x0035:
            h.f.b.l.b(r6, r9)
            if (r1 == 0) goto L_0x0054
            int r7 = r1.f118753d
            java.lang.String r8 = r1.f118750a
            if (r8 != 0) goto L_0x0043
        L_0x0040:
            r8 = r9
            if (r1 == 0) goto L_0x0047
        L_0x0043:
            java.lang.String r0 = r1.f118758i
            if (r0 != 0) goto L_0x0052
        L_0x0047:
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 1920(0x780, float:2.69E-42)
            r15 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L_0x0052:
            r9 = r0
            goto L_0x0047
        L_0x0054:
            r7 = 0
            goto L_0x0040
        L_0x0056:
            r3 = 0
            r4 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.external.a.d.parseUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void audio2wavebean(String str, IAVTransformService.ITransformCallback<MusicWaveBean> iTransformCallback) {
        l.d(str, "");
        l.d(iTransformCallback, "");
        e.a aVar = new e.a();
        aVar.f90301c = true;
        e.a a2 = aVar.a(new a(str, iTransformCallback));
        a2.f90299a = new b(iTransformCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback<Boolean> iTransformCallback) {
        l.d(videoShare2GifEditContext, "");
        e eVar = new e(videoShare2GifEditContext, iTransformProgress, iTransformCallback);
        e.a aVar = new e.a();
        aVar.f90301c = true;
        e.a a2 = aVar.a(new c(videoShare2GifEditContext, eVar));
        a2.f90299a = new C2172d(iTransformCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void video2webp(String str, String str2, int i2, int i3, IAVTransformService.ITransformCallback<Integer> iTransformCallback, IAVTransformService.ITransformProgress iTransformProgress) {
        l.d(str, "");
        l.d(str2, "");
        e.a aVar = new e.a();
        aVar.f90301c = true;
        e.a a2 = aVar.a(new f(str, str2, i2, i3, iTransformProgress, iTransformCallback));
        a2.f90299a = new g(iTransformCallback);
        a2.a();
    }
}
