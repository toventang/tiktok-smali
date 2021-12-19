package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.bn;
import com.ss.android.ugc.aweme.shortvideo.by;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.io.File;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public String f135814a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.app.d f135815b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f135816c;

    /* renamed from: d  reason: collision with root package name */
    private String f135817d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f135818e = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f135819f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f135820g;

    /* renamed from: h  reason: collision with root package name */
    private final h f135821h = i.a((h.f.a.a) new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f135822i = i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f135823j;

    /* renamed from: k  reason: collision with root package name */
    private final m f135824k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.asve.recorder.effect.a f135825l;

    /* renamed from: m  reason: collision with root package name */
    private final j f135826m;

    static {
        Covode.recordClassIndex(88766);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void a() {
        this.f135816c = true;
    }

    public final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c f() {
        return (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c) this.f135821h.getValue();
    }

    public final SafeHandler g() {
        return (SafeHandler) this.f135822i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void b() {
        this.f135816c = this.f135819f;
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(88767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c invoke() {
            return new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c(this.this$0.f135815b);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(88768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0.f135815b);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(88769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f().show();
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(88772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f().show();
            return z.f158842a;
        }
    }

    private final double i() {
        return (double) this.f135823j.K().value();
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void d() {
        if (this.f135819f) {
            a(this.f135815b, null, null, null);
            b();
        }
    }

    private final ShortVideoContext h() {
        ac a2 = ae.a(this.f135815b, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        l.b(shortVideoContext, "");
        return shortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void e() {
        if (this.f135819f) {
            a(this.f135815b, this.f135814a, this.f135817d, this.f135818e);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void c() {
        ac a2 = ae.a(this.f135815b, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        if (shortVideoContext != null && this.f135819f) {
            dt<TimeSpeedModelExtension> dtVar = shortVideoContext.f124757b.f124711f;
            l.b(dtVar, "");
            com.ss.android.ugc.aweme.sticker.model.a aVar = shortVideoContext.f124757b.r;
            l.d(dtVar, "");
            if (aVar != null) {
                boolean z = true;
                for (TimeSpeedModelExtension timeSpeedModelExtension : dtVar) {
                    l.b(timeSpeedModelExtension, "");
                    if (l.a(timeSpeedModelExtension.getBackgroundVideo(), aVar)) {
                        z = false;
                    }
                }
                if (z) {
                    c.a(aVar.getVideoPath(), aVar.getAudioPath());
                }
            }
            shortVideoContext.a((com.ss.android.ugc.aweme.sticker.model.a) null);
            this.f135817d = "";
            this.f135818e = "";
            a(this.f135815b, null, null, null);
            q.a("BackgroundVideo remove BGV");
            this.f135819f = false;
            a(0);
        }
    }

    private final void a(long j2) {
        long j3;
        long j4;
        ShortVideoContext h2 = h();
        if (h2.f124757b.t) {
            j3 = l.f135833a;
        } else {
            j3 = 15000;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        String str = h2.f124757b.y;
        if (cVar == null || TextUtils.isEmpty(str)) {
            j4 = h2.f124757b.f124712g;
        } else {
            j3 = h.j.h.b(j3, by.a(cVar, str));
            j4 = h2.f124757b.f124712g;
        }
        long j5 = j3 - j4;
        if (!this.f135820g && j2 > 0) {
            j5 = h.j.h.b(j5, j2);
        }
        long resolveMaxDurationFor3MinWithMusic = g.a().l().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(h2, h2.f124757b.f124712g + j5);
        h2.a(resolveMaxDurationFor3MinWithMusic);
        this.f135824k.a(new com.bytedance.creativex.recorder.b.a.j(resolveMaxDurationFor3MinWithMusic));
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void a(Double d2) {
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            if (this.f135819f) {
                q.a("BackgroundVideo set speed：".concat(String.valueOf(doubleValue)));
                this.f135825l.a(d2.doubleValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void a(Effect effect) {
        l.d(effect, "");
        if (this.f135816c) {
            b(this.f135817d, this.f135818e);
            this.f135816c = false;
            return;
        }
        boolean h2 = com.ss.android.ugc.aweme.sticker.p.g.h(effect);
        this.f135820g = h2;
        if (h2) {
            e eVar = new e(this.f135815b, effect);
            c cVar = new c(this);
            d dVar = new d(this, effect);
            l.d(cVar, "");
            l.d(dVar, "");
            cVar.invoke();
            if (!com.ss.android.ugc.tools.utils.i.a(dj.f126465h)) {
                com.ss.android.ugc.tools.utils.i.a(dj.f126465h, false);
            }
            String[] a2 = eVar.a();
            String str = a2[0];
            String str2 = a2[1];
            if (com.ss.android.ugc.tools.utils.i.a(str2)) {
                eVar.f135799b = str;
                eVar.f135800c = str2;
            } else if (!TextUtils.isEmpty(str)) {
                String a3 = bn.a(str);
                eVar.f135799b = eVar.f135798a + File.separator + a3 + "_background_v";
                eVar.f135800c = eVar.f135798a + File.separator + a3 + "_background_a";
            }
            if (!com.ss.android.ugc.tools.utils.i.a(eVar.f135798a) || !com.ss.android.ugc.tools.utils.i.a(eVar.f135799b) || !com.ss.android.ugc.tools.utils.i.a(eVar.f135800c) || VEUtils.getVideoFileInfo(eVar.f135799b) == null || VEUtils.getAudioFileInfo(eVar.f135800c) == null) {
                if (!com.ss.android.ugc.tools.utils.i.a(eVar.f135798a)) {
                    com.ss.android.ugc.tools.utils.i.a(eVar.f135798a, false);
                    if (!com.ss.android.ugc.tools.utils.i.a(eVar.f135798a)) {
                        q.b("BackgroundVideo, splitDir create fail");
                        dVar.invoke(false, eVar.f135801d, eVar.f135802e);
                        return;
                    }
                }
                if (!com.ss.android.ugc.tools.utils.i.a(str)) {
                    q.b("BackgroundVideo, default video not exist");
                    dVar.invoke(false, eVar.f135801d, eVar.f135802e);
                    return;
                }
                IInternalAVService a4 = AVServiceImpl.a();
                l.b(a4, "");
                ISDKService sDKService = a4.getSDKService();
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                l.b(application, "");
                Context applicationContext = application.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                l.b(applicationContext, "");
                sDKService.split(applicationContext, 1000, eVar.f135798a, str, eVar.f135800c, eVar.f135799b, new e.b(eVar, dVar));
                return;
            }
            com.ss.android.ugc.tools.utils.h.a(eVar.f135799b, eVar.f135801d);
            com.ss.android.ugc.tools.utils.i.a(eVar.f135800c, eVar.f135802e);
            dVar.invoke(true, eVar.f135801d, eVar.f135802e);
            return;
        }
        d dVar2 = new d(this.f135815b, effect);
        e eVar2 = new e(this);
        f fVar = new f(this, effect);
        l.d(eVar2, "");
        l.d(fVar, "");
        eVar2.invoke();
        if (!com.ss.android.ugc.tools.utils.i.a(dj.f126465h)) {
            com.ss.android.ugc.tools.utils.i.a(dj.f126465h, false);
        }
        if (!com.ss.android.ugc.tools.utils.i.a(dVar2.f135788a) || !com.ss.android.ugc.tools.utils.i.a(dVar2.f135789b) || !com.ss.android.ugc.tools.utils.i.a(dVar2.f135790c) || VEUtils.getVideoFileInfo(dVar2.f135789b) == null || VEUtils.getAudioFileInfo(dVar2.f135790c) == null) {
            if (!com.ss.android.ugc.tools.utils.i.a(dVar2.f135788a)) {
                com.ss.android.ugc.tools.utils.i.a(dVar2.f135788a, false);
                if (!com.ss.android.ugc.tools.utils.i.a(dVar2.f135788a)) {
                    q.b("BackgroundVideo, splitDir create fail");
                    fVar.invoke(false, dVar2.f135791d, dVar2.f135792e);
                    return;
                }
            }
            String a5 = dVar2.a();
            if (!com.ss.android.ugc.tools.utils.i.a(a5)) {
                q.b("BackgroundVideo, default video not exist");
                fVar.invoke(false, dVar2.f135791d, dVar2.f135792e);
                return;
            }
            IInternalAVService a6 = AVServiceImpl.a();
            l.b(a6, "");
            ISDKService sDKService2 = a6.getSDKService();
            Application application2 = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application2, "");
            Context applicationContext2 = application2.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext2 == null) {
                applicationContext2 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            l.b(applicationContext2, "");
            sDKService2.split(applicationContext2, 1000, dVar2.f135788a, a5, dVar2.f135790c, dVar2.f135789b, new d.b(dVar2, fVar));
            return;
        }
        com.ss.android.ugc.tools.utils.h.a(dVar2.f135789b, dVar2.f135791d);
        com.ss.android.ugc.tools.utils.i.a(dVar2.f135790c, dVar2.f135792e);
        fVar.invoke(true, dVar2.f135791d, dVar2.f135792e);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f135817d = str;
        this.f135818e = str2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f
    public final void a(String str, h.f.a.a<z> aVar) {
        l.d(str, "");
        l.d(aVar, "");
        AVServiceImpl.a().getVideoLegalCheckerAndToastService(this.f135815b).isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, aVar);
    }

    private static int c(String str, String str2) {
        if (com.bytedance.x.c.c.a(str) || com.bytedance.x.c.c.a(str2)) {
            q.b("BackgroundVideo path invalid, videoPath: " + str + " audioPath: " + str2);
            return -1;
        }
        if (str == null) {
            l.b();
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo != null) {
            return videoFileInfo.duration;
        }
        q.b("BackgroundVideo getVideoInfo fail, videoPath: " + str + " audioPath: " + str2);
        return -1;
    }

    public final void b(String str, String str2) {
        if (!this.f135824k.c().f6468a.getValue().booleanValue()) {
            com.ss.android.ugc.aweme.sticker.f.e.b(this.f135826m);
            return;
        }
        ac a2 = ae.a(this.f135815b, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        if (shortVideoContext == null) {
            q.a("BackgroundVideo set BGV error, shortVideo context is null");
            return;
        }
        int c2 = c(str, str2);
        if (c2 > 0) {
            this.f135817d = str;
            this.f135818e = str2;
            long j2 = (long) c2;
            shortVideoContext.a(new com.ss.android.ugc.aweme.sticker.model.a(str, str2, j2, this.f135820g, 0, null, 48, null));
            a(j2);
            q.a("BackgroundVideo set BGV, videoPath: " + str + " audioPath: " + str2);
            a(this.f135815b, this.f135814a, str, str2);
            a(Double.valueOf(i()));
            this.f135819f = true;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.q<Boolean, String, String, z> {
        final /* synthetic */ Effect $faceStickerBean;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(88770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar, Effect effect) {
            super(3);
            this.this$0 = kVar;
            this.$faceStickerBean = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Boolean bool, String str, String str2) {
            boolean booleanValue = bool.booleanValue();
            final String str3 = str;
            final String str4 = str2;
            l.d(str3, "");
            l.d(str4, "");
            if (this.this$0.f135815b != null && !this.this$0.f135815b.isFinishing()) {
                this.this$0.f().dismiss();
                if (booleanValue) {
                    this.this$0.f135814a = BackgroundVideoStickerPresenter.a.a(this.$faceStickerBean);
                    this.this$0.g().post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k.d.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f135827a;

                        static {
                            Covode.recordClassIndex(88771);
                        }

                        {
                            this.f135827a = r1;
                        }

                        public final void run() {
                            this.f135827a.this$0.b(str3, str4);
                        }
                    });
                } else {
                    q.b("BackgroundVideo default video parse fail");
                }
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.q<Boolean, String, String, z> {
        final /* synthetic */ Effect $faceStickerBean;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(88773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar, Effect effect) {
            super(3);
            this.this$0 = kVar;
            this.$faceStickerBean = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Boolean bool, String str, String str2) {
            boolean booleanValue = bool.booleanValue();
            final String str3 = str;
            final String str4 = str2;
            l.d(str3, "");
            l.d(str4, "");
            if (this.this$0.f135815b != null && !this.this$0.f135815b.isFinishing()) {
                this.this$0.f().dismiss();
                if (booleanValue) {
                    this.this$0.f135814a = BackgroundVideoStickerPresenter.a.a(this.$faceStickerBean);
                    this.this$0.g().post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f135830a;

                        static {
                            Covode.recordClassIndex(88774);
                        }

                        {
                            this.f135830a = r1;
                        }

                        public final void run() {
                            this.f135830a.this$0.b(str3, str4);
                        }
                    });
                } else {
                    q.b("BackgroundVideo default video parse fail");
                }
            }
            return z.f158842a;
        }
    }

    private final void a(Context context, String str, String str2, String str3) {
        T value = this.f135824k.c().f6468a.getValue();
        if (com.ss.android.ugc.aweme.property.bn.a()) {
            this.f135823j.D().c(true);
        }
        l.b(value, "");
        if (value.booleanValue()) {
            this.f135825l.a(context, str, str2, str3);
        }
        com.ss.android.ugc.gamora.recorder.sticker.c.k.b(this.f135826m);
    }

    public k(androidx.appcompat.app.d dVar, com.bytedance.creativex.recorder.b.a.d dVar2, m mVar, com.ss.android.ugc.asve.recorder.effect.a aVar, j jVar) {
        l.d(dVar, "");
        l.d(dVar2, "");
        l.d(mVar, "");
        l.d(aVar, "");
        l.d(jVar, "");
        this.f135815b = dVar;
        this.f135823j = dVar2;
        this.f135824k = mVar;
        this.f135825l = aVar;
        this.f135826m = jVar;
    }
}
