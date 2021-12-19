package com.ss.android.ugc.aweme.feed.caption;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ClaCrowdsourcingEntrypoints;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.experiment.gv;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.feed.x.t;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;

public final class c extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {
    public static final int C;
    public static final int D = (((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 58.0f)) + com.ss.android.ugc.aweme.base.utils.i.b());
    public static final int E;
    public static final int F;
    public static final int G = ((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 32.0f));
    public static final a H = new a((byte) 0);
    public boolean A = true;
    public com.bytedance.tux.sheet.sheet.a B;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f92752a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f92753b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f92754c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f92755d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f92756e;

    /* renamed from: f  reason: collision with root package name */
    public TuxTextView f92757f;

    /* renamed from: g  reason: collision with root package name */
    public View f92758g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f92759h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f92760i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f92761j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f92762k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f92763l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f92764m;
    public boolean n;
    public boolean o;
    public String p = "";
    public ValueAnimator q;
    public boolean r;
    public long s = -1;
    public long t = -1;
    public boolean u;
    boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    private static int c(boolean z2) {
        return z2 ? 0 : 8;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58827);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.n = true;
            this.this$0.o = false;
            return z.f158842a;
        }
    }

    public final boolean d() {
        if (!this.u || !this.w || this.f92761j) {
            return false;
        }
        return true;
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.n = false;
            if (!this.this$0.o) {
                this.this$0.b();
            }
            this.this$0.o = false;
            return z.f158842a;
        }
    }

    private final void p() {
        if (!this.z) {
            this.z = true;
            r.a("edit_transl_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", ac.e(this.L)).a("author_id", ac.a(this.L)).f66730a);
        }
    }

    static {
        Covode.recordClassIndex(58826);
        int b2 = (int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 16.0f);
        C = b2;
        int b3 = (int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 56.0f);
        E = b3;
        F = Math.min((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 320.0f), (com.ss.android.ugc.aweme.base.utils.i.b(com.bytedance.ies.ugc.appcontext.d.a()) - b2) - b3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A[EDGE_INSN: B:29:0x004d->B:23:0x004d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.feed.model.CaptionItemModel c() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.L
            r8 = 0
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.CaptionLanguage r0 = r0.getOriginalCaptionLanguage()
            if (r0 == 0) goto L_0x0059
            long r0 = r0.getLanguageId()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x001f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.L
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x004f
            java.util.List r0 = r0.getCaptionList()
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r6 = r0.iterator()
        L_0x0039:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = (com.ss.android.ugc.aweme.feed.model.CaptionItemModel) r0
            long r3 = r0.getLanguageId()
            if (r7 != 0) goto L_0x0050
        L_0x004c:
            r8 = r5
        L_0x004d:
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r8 = (com.ss.android.ugc.aweme.feed.model.CaptionItemModel) r8
        L_0x004f:
            return r8
        L_0x0050:
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            goto L_0x004c
        L_0x0059:
            r7 = r8
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.caption.c.c():com.ss.android.ugc.aweme.feed.model.CaptionItemModel");
    }

    private final boolean o() {
        ClaCrowdsourcingEntrypoints a2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String claSubtitleId;
        Intent intent;
        Intent intent2;
        Fragment fragment = this.V;
        String str7 = "";
        h.f.b.l.b(fragment, str7);
        androidx.fragment.app.e activity = fragment.getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null || intent.getIntExtra("bottom_view_type", 0) != 1)) {
            Fragment fragment2 = this.V;
            h.f.b.l.b(fragment2, str7);
            androidx.fragment.app.e activity2 = fragment2.getActivity();
            if (activity2 == null || (intent2 = activity2.getIntent()) == null || intent2.getIntExtra("translation_status", 0) != 0) {
                return false;
            }
        }
        if (com.ss.android.ugc.aweme.experiment.o.a() && (a2 = com.ss.android.ugc.aweme.experiment.p.a()) != null) {
            CaptionItemModel a3 = t.a(this.L);
            String str8 = null;
            if (a3 != null) {
                str = a3.getLanguageName();
            } else {
                str = null;
            }
            gv subtitleType = a2.getSubtitleType();
            if (subtitleType != null) {
                str2 = subtitleType.f90169a;
            } else {
                str2 = null;
            }
            if (h.f.b.l.a((Object) str, (Object) str2)) {
                CaptionItemModel b2 = t.b(this.L);
                if (b2 != null) {
                    str3 = b2.getLanguageName();
                } else {
                    str3 = null;
                }
                gv subtitleType2 = a2.getSubtitleType();
                if (subtitleType2 != null) {
                    str4 = subtitleType2.f90170b;
                } else {
                    str4 = null;
                }
                if (h.f.b.l.a((Object) str3, (Object) str4)) {
                    CaptionItemModel b3 = t.b(this.L);
                    if (b3 != null) {
                        str5 = b3.getVersionType();
                    } else {
                        str5 = null;
                    }
                    gv subtitleType3 = a2.getSubtitleType();
                    if (subtitleType3 != null) {
                        str8 = subtitleType3.f90171c;
                    }
                    if (h.f.b.l.a((Object) str5, (Object) str8)) {
                        ITranslatedCaptionService j2 = TranslatedCaptionCacheServiceImpl.j();
                        if (a2.isEnrolled()) {
                            if (!a2.isOptOut()) {
                                CaptionItemModel b4 = t.b(this.L);
                                if (!(b4 == null || (claSubtitleId = b4.getClaSubtitleId()) == null)) {
                                    str7 = claSubtitleId;
                                }
                                if (!j2.d(str7)) {
                                    return true;
                                }
                            }
                            return false;
                        } else if (a2.getPassAgs() && a2.isTargetedUser() && j2.g()) {
                            CaptionItemModel b5 = t.b(this.L);
                            if (b5 == null || (str6 = b5.getClaSubtitleId()) == null) {
                                str6 = str7;
                            }
                            if (!j2.d(str6)) {
                                Aweme aweme = this.L;
                                h.f.b.l.b(aweme, str7);
                                String aid = aweme.getAid();
                                h.f.b.l.b(aid, str7);
                                j2.b(aid);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void e() {
        String e2;
        String str;
        Video video;
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        String str2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage2;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("subtitle_type", ah.c(this.L)).a("have_transl", ah.b(this.L) ? 1 : 0).a("use_transl", !this.f92761j ? 1 : 0);
        if (this.f92761j) {
            Aweme aweme = this.L;
            if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage2 = captionModel2.getOriginalCaptionLanguage()) == null || (e2 = originalCaptionLanguage2.getLanguageName()) == null) {
                e2 = "";
            }
        } else {
            e2 = ah.e(this.L);
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("to_lang", e2);
        if (this.f92761j) {
            str = ah.e(this.L);
        } else {
            Aweme aweme2 = this.L;
            if (aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (str = originalCaptionLanguage.getLanguageName()) == null) {
                str = "";
            }
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("subtitle_lang", str).a("have_tts", this.v ? 1 : 0).a("use_tts", d() ? 1 : 0).a("cla_subtitle_type", ah.a(this.f92761j, this.L));
        CaptionItemModel b2 = t.b(this.L);
        if (b2 == null || !t.a(b2)) {
            str2 = "manual";
        } else {
            str2 = "translator";
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("transl_type", str2);
        Aweme aweme3 = this.L;
        h.f.b.l.b(aweme3, "");
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("group_id", aweme3.getAid());
        Aweme aweme4 = this.L;
        h.f.b.l.b(aweme4, "");
        r.a("change_subtitle_lang", a6.a("author_id", aweme4.getAuthorUid()).f66730a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0140, code lost:
        if (h.z.f158842a == null) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.caption.c.b():void");
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f92776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.b f92777c;

        static {
            Covode.recordClassIndex(58833);
        }

        g(c cVar, String str, com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
            this.f92775a = cVar;
            this.f92776b = str;
            this.f92777c = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:77:0x017c, code lost:
            if (r0 == null) goto L_0x017e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 1992
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.caption.c.g.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$c  reason: collision with other inner class name */
    public static final class C2256c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92769a;

        static {
            Covode.recordClassIndex(58829);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2256c(c cVar) {
            this.f92769a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f92769a.b();
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92773a;

        static {
            Covode.recordClassIndex(58831);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(c cVar) {
            this.f92773a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f92773a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        return com.ss.android.ugc.aweme.feed.x.g.a(bVar, f.f92774a);
    }

    static final class f<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        public static final f f92774a = new f();

        static {
            Covode.recordClassIndex(58832);
        }

        f() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            Aweme aweme = (Aweme) obj;
            h.f.b.l.d(aweme, "");
            return ah.a(aweme);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f92784a;

        static {
            Covode.recordClassIndex(58844);
        }

        n(com.bytedance.tux.sheet.sheet.a aVar) {
            this.f92784a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92784a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f92785a;

        static {
            Covode.recordClassIndex(58845);
        }

        o(com.bytedance.tux.sheet.sheet.a aVar) {
            this.f92785a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92785a.dismiss();
        }
    }

    public c(View view) {
        super(view, ((Boolean) bv.f89645c.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new g(this, str, bVar)));
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f92781a;

            static {
                Covode.recordClassIndex(58839);
            }

            a(k kVar) {
                this.f92781a = kVar;
            }

            public final void onClick(View view) {
                CaptionItemModel b2;
                String translatorId;
                ClickAgent.onClick(view);
                Aweme aweme = this.f92781a.this$0.L;
                if (aweme != null && (b2 = t.b(aweme)) != null && (translatorId = b2.getTranslatorId()) != null) {
                    Context context = this.f92781a.this$0.R;
                    h.f.b.l.b(context, "");
                    String str = this.f92781a.this$0.M;
                    h.f.b.l.b(str, "");
                    t.a(context, translatorId, str, "caption", false, this.f92781a.this$0.L);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            int i2;
            Aweme aweme;
            CaptionItemModel b2;
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            c cVar = this.this$0;
            if (com.ss.android.ugc.aweme.experiment.o.a() && (aweme = cVar.L) != null && (b2 = t.b(aweme)) != null && t.a(b2)) {
                d.a aVar = new d.a();
                aVar.f45492d = R.string.agj;
                aVar.f45494f = new a(this);
                dVar2.a(aVar);
            }
            if (ah.f(this.this$0.L)) {
                d.b bVar = new d.b();
                if (this.this$0.f92761j) {
                    i2 = R.string.fjz;
                } else {
                    i2 = R.string.fjy;
                }
                bVar.f45497c = i2;
                bVar.f45500f = new b(this);
                dVar2.a(bVar);
            }
            d.b bVar2 = new d.b();
            bVar2.f45497c = R.string.h_a;
            bVar2.f45500f = new View$OnClickListenerC2257c(this);
            dVar2.a(bVar2);
            return z.f158842a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$k$c  reason: collision with other inner class name */
        static final class View$OnClickListenerC2257c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f92783a;

            static {
                Covode.recordClassIndex(58841);
            }

            View$OnClickListenerC2257c(k kVar) {
                this.f92783a = kVar;
            }

            public final void onClick(View view) {
                String e2;
                String str;
                Video video;
                CaptionModel captionModel;
                CaptionLanguage originalCaptionLanguage;
                ClickAgent.onClick(view);
                this.f92783a.this$0.o = true;
                this.f92783a.this$0.a(true);
                c cVar = this.f92783a.this$0;
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", cVar.M).a("use_transl", !cVar.f92761j ? 1 : 0).a("subtitle_type", ah.c(cVar.L)).a("have_transl", ah.b(cVar.L) ? 1 : 0);
                if (cVar.f92761j) {
                    Aweme aweme = cVar.L;
                    if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (e2 = originalCaptionLanguage.getLanguageName()) == null) {
                        e2 = "";
                    }
                } else {
                    e2 = ah.e(cVar.L);
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_lang", e2).a("have_tts", cVar.v ? 1 : 0).a("use_tts", cVar.d() ? 1 : 0).a("cla_subtitle_type", ah.a(cVar.f92761j, cVar.L));
                CaptionItemModel b2 = t.b(cVar.L);
                if (b2 == null || !t.a(b2)) {
                    str = "manual";
                } else {
                    str = "translator";
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("transl_type", str);
                Aweme aweme2 = cVar.L;
                h.f.b.l.b(aweme2, "");
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("group_id", aweme2.getAid());
                Aweme aweme3 = cVar.L;
                h.f.b.l.b(aweme3, "");
                r.a("hide_subtitle", a5.a("author_id", aweme3.getAuthorUid()).f66730a);
                this.f92783a.this$0.n = false;
                com.bytedance.tux.tooltip.a aVar = this.f92783a.this$0.f92752a;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f92782a;

            static {
                Covode.recordClassIndex(58840);
            }

            b(k kVar) {
                this.f92782a = kVar;
            }

            public final void onClick(View view) {
                int i2;
                ClickAgent.onClick(view);
                this.f92782a.this$0.t = SystemClock.elapsedRealtime();
                this.f92782a.this$0.o = true;
                TuxTextView tuxTextView = this.f92782a.this$0.f92757f;
                if (tuxTextView != null) {
                    tuxTextView.setText("");
                }
                TuxTextView tuxTextView2 = this.f92782a.this$0.f92757f;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                }
                View view2 = this.f92782a.this$0.f92758g;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                ImageView imageView = this.f92782a.this$0.f92759h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!this.f92782a.this$0.w || com.ss.android.ugc.aweme.feed.experiment.e.a()) {
                    LinearLayout linearLayout = this.f92782a.this$0.f92755d;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    ImageView imageView2 = this.f92782a.this$0.f92756e;
                    if (imageView2 != null) {
                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                        rotateAnimation.setDuration(1500);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        imageView2.setAnimation(rotateAnimation);
                    }
                    LinearLayout linearLayout2 = this.f92782a.this$0.f92754c;
                    if (linearLayout2 != null) {
                        linearLayout2.setEnabled(false);
                    }
                }
                com.ss.android.ugc.aweme.video.i O = v.O();
                h.f.b.l.b(O, "");
                com.ss.android.ugc.aweme.video.simplayer.f L = O.L();
                if (this.f92782a.this$0.f92761j) {
                    CaptionItemModel b2 = t.b(this.f92782a.this$0.L);
                    if (b2 != null) {
                        i2 = b2.getSubId();
                    }
                    i2 = 0;
                } else {
                    CaptionItemModel a2 = t.a(this.f92782a.this$0.L);
                    if (a2 != null) {
                        i2 = a2.getSubId();
                    }
                    i2 = 0;
                }
                L.a(i2);
                this.f92782a.this$0.A = false;
                this.f92782a.this$0.Q.a("use_translated_caption", Boolean.valueOf(this.f92782a.this$0.f92761j));
                if (!this.f92782a.this$0.f92761j) {
                    ITranslatedCaptionService j2 = TranslatedCaptionCacheServiceImpl.j();
                    Aweme aweme = this.f92782a.this$0.L;
                    h.f.b.l.b(aweme, "");
                    String aid = aweme.getAid();
                    h.f.b.l.b(aid, "");
                    j2.a(aid);
                }
                this.f92782a.this$0.f92761j = true ^ this.f92782a.this$0.f92761j;
                this.f92782a.this$0.e();
                this.f92782a.this$0.n = false;
                com.bytedance.tux.tooltip.a aVar = this.f92782a.this$0.f92752a;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("update_audio_state", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("update_caption_text", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("in_video_view_holder", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("play_complete_first_time", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("on_render_ready", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(6986);
        if (!this.K) {
            this.K = true;
            View view = this.S;
            if (!(view instanceof FrameLayout)) {
                view = null;
            }
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout != null) {
                frameLayout.addView(this.T);
                MethodCollector.o(6986);
                return;
            }
        }
        MethodCollector.o(6986);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f92766b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f92767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f92768d;

        static {
            Covode.recordClassIndex(58828);
        }

        b(c cVar, boolean z, z.c cVar2, z.c cVar3) {
            this.f92765a = cVar;
            this.f92766b = z;
            this.f92767c = cVar2;
            this.f92768d = cVar3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f92765a.f92760i;
            if (imageView != null) {
                h.f.b.l.b(valueAnimator, "");
                imageView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            if (!this.f92766b) {
                LinearLayout linearLayout = this.f92765a.f92754c;
                if (linearLayout != null) {
                    h.f.b.l.b(valueAnimator, "");
                    linearLayout.setAlpha(valueAnimator.getAnimatedFraction());
                }
                LinearLayout linearLayout2 = this.f92765a.f92754c;
                if (linearLayout2 != null) {
                    h.f.b.l.b(valueAnimator, "");
                    linearLayout2.setScaleX(((((float) c.G) * 1.0f) / ((float) this.f92767c.element)) + ((((float) (this.f92767c.element - c.G)) * valueAnimator.getAnimatedFraction()) / ((float) this.f92767c.element)));
                }
                LinearLayout linearLayout3 = this.f92765a.f92754c;
                if (linearLayout3 != null) {
                    h.f.b.l.b(valueAnimator, "");
                    linearLayout3.setScaleY(((((float) c.G) * 1.0f) / ((float) this.f92768d.element)) + ((((float) (this.f92768d.element - c.G)) * valueAnimator.getAnimatedFraction()) / ((float) this.f92768d.element)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92770a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92771b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f92772c;

        static {
            Covode.recordClassIndex(58830);
        }

        d(c cVar, int i2, int i3) {
            this.f92770a = cVar;
            this.f92771b = i2;
            this.f92772c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f92770a.f92760i;
            if (imageView != null) {
                h.f.b.l.b(valueAnimator, "");
                imageView.setAlpha(valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout = this.f92770a.f92754c;
            if (linearLayout != null) {
                h.f.b.l.b(valueAnimator, "");
                linearLayout.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout2 = this.f92770a.f92754c;
            if (linearLayout2 != null) {
                int i2 = this.f92771b;
                h.f.b.l.b(valueAnimator, "");
                linearLayout2.setScaleX(((((float) i2) - (((float) (i2 - c.G)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f92771b));
            }
            LinearLayout linearLayout3 = this.f92770a.f92754c;
            if (linearLayout3 != null) {
                int i3 = this.f92772c;
                h.f.b.l.b(valueAnimator, "");
                linearLayout3.setScaleY(((((float) i3) - (((float) (i3 - c.G)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f92772c));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92786a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f92787b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f92788c;

        static {
            Covode.recordClassIndex(58846);
        }

        p(c cVar, androidx.fragment.app.e eVar, com.bytedance.tux.sheet.sheet.a aVar) {
            this.f92786a = cVar;
            this.f92787b = eVar;
            this.f92788c = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            c cVar = this.f92786a;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", cVar.M);
            String str2 = "translate_tts";
            if (cVar.d()) {
                str = str2;
            } else {
                str = "translate_subtitle";
            }
            r.a("enter_setting_page", a2.a("enter_method", str).f66730a);
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f92787b, "aweme://setting");
            if (!this.f92786a.d()) {
                str2 = "translate_subtitle";
            }
            buildRoute.withParam("enter_from", str2).open();
            this.f92788c.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        h.f.b.l.d(view, "");
        View a2 = com.a.b.c.a((Activity) this.R, (int) R.layout.tk);
        this.f92753b = (FrameLayout) a2.findViewById(R.id.a2g);
        this.f92754c = (LinearLayout) a2.findViewById(R.id.a2k);
        this.f92755d = (LinearLayout) a2.findViewById(R.id.a2i);
        this.f92756e = (ImageView) a2.findViewById(R.id.a2h);
        this.f92757f = (TuxTextView) a2.findViewById(R.id.a2j);
        this.f92758g = a2.findViewById(R.id.eqi);
        this.f92759h = (ImageView) a2.findViewById(R.id.eqn);
        this.f92760i = (ImageView) a2.findViewById(R.id.bg3);
        this.T = a2;
    }

    public final void b(boolean z2) {
        r.a("click_edit_transl", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", ac.e(this.L)).a("author_id", ac.a(this.L)).a("is_new", z2 ? 1 : 0).f66730a);
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92780a;

        static {
            Covode.recordClassIndex(58837);
        }

        j(c cVar) {
            this.f92780a = cVar;
        }

        public final void onClick(View view) {
            String str;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            ClickAgent.onClick(view);
            this.f92780a.a(false);
            c cVar = this.f92780a;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", cVar.M);
            Aweme aweme = cVar.L;
            String str2 = "";
            h.f.b.l.b(aweme, str2);
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
            Aweme aweme2 = cVar.L;
            h.f.b.l.b(aweme2, str2);
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", aweme2.getAuthorUid()).a("use_transl", !cVar.f92761j ? 1 : 0).a("subtitle_type", ah.c(cVar.L)).a("have_transl", ah.b(cVar.L) ? 1 : 0);
            if (cVar.f92761j) {
                Aweme aweme3 = cVar.L;
                if (!(aweme3 == null || (video = aweme3.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str2 = languageName;
                }
            } else {
                str2 = ah.e(cVar.L);
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_lang", str2).a("have_tts", cVar.v ? 1 : 0).a("use_tts", cVar.d() ? 1 : 0).a("cla_subtitle_type", ah.a(cVar.f92761j, cVar.L));
            CaptionItemModel b2 = t.b(cVar.L);
            if (b2 == null || !t.a(b2)) {
                str = "manual";
            } else {
                str = "translator";
            }
            r.a("expand_subtitle", a5.a("transl_type", str).f66730a);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92778a;

        static {
            Covode.recordClassIndex(58834);
        }

        h(c cVar) {
            this.f92778a = cVar;
        }

        public final void onClick(View view) {
            String str;
            com.bytedance.tux.tooltip.h hVar;
            ClickAgent.onClick(view);
            c cVar = this.f92778a;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("have_transl", ah.b(cVar.L) ? 1 : 0).a("use_transl", !cVar.f92761j ? 1 : 0).a("subtitle_type", ah.c(cVar.L)).a("subtitle_lang", ah.e(cVar.L)).a("have_tts", cVar.v ? 1 : 0).a("use_tts", cVar.d() ? 1 : 0).a("cla_subtitle_type", ah.a(cVar.f92761j, cVar.L));
            Aweme aweme = cVar.L;
            h.f.b.l.b(aweme, "");
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
            Aweme aweme2 = cVar.L;
            h.f.b.l.b(aweme2, "");
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", aweme2.getAuthorUid()).a("enter_from", cVar.M);
            CaptionItemModel b2 = t.b(cVar.L);
            if (b2 == null || !t.a(b2)) {
                str = "manual";
            } else {
                str = "translator";
            }
            r.a("click_subtitle", a4.a("transl_type", str).f66730a);
            if (!a.a()) {
                Aweme aweme3 = cVar.L;
                h.f.b.l.b(aweme3, "");
                if (aweme3.getAuthorUid() != null) {
                    Aweme aweme4 = cVar.L;
                    h.f.b.l.b(aweme4, "");
                    String authorUid = aweme4.getAuthorUid();
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    if (!h.f.b.l.a((Object) authorUid, (Object) g2.getCurUserId())) {
                        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                        if (!(j2 instanceof androidx.fragment.app.e)) {
                            j2 = null;
                        }
                        androidx.fragment.app.e eVar = (androidx.fragment.app.e) j2;
                        if (eVar != null) {
                            cVar.a(eVar);
                            return;
                        }
                    }
                }
            }
            c cVar2 = this.f92778a;
            if (cVar2.f92754c != null) {
                LinearLayout linearLayout = cVar2.f92754c;
                if (linearLayout == null) {
                    h.f.b.l.b();
                }
                if (linearLayout.getVisibility() == 0) {
                    int i2 = -((int) com.bytedance.common.utility.n.b(cVar2.R, 8.0f));
                    Context context = cVar2.R;
                    h.f.b.l.b(context, "");
                    com.bytedance.tux.tooltip.a.a.b bVar = new com.bytedance.tux.tooltip.a.a.b(context);
                    LinearLayout linearLayout2 = cVar2.f92754c;
                    if (linearLayout2 == null) {
                        h.f.b.l.b();
                    }
                    com.bytedance.tux.tooltip.b d2 = ((com.bytedance.tux.tooltip.a.a.b) bVar.b(linearLayout2).a(androidx.core.content.b.c(cVar2.R, R.color.c7)).a(-1001L)).a(new k(cVar2)).b(new l(cVar2)).a(new m(cVar2)).b(i2).c().b(true).d(c.C);
                    if (cVar2.f92764m) {
                        hVar = com.bytedance.tux.tooltip.h.BOTTOM;
                    } else {
                        hVar = com.bytedance.tux.tooltip.h.TOP;
                    }
                    d2.a(hVar);
                    cVar2.f92752a = d2.d();
                    com.bytedance.tux.tooltip.a aVar = cVar2.f92752a;
                    if (aVar == null) {
                        h.f.b.l.b();
                    }
                    aVar.a();
                }
            }
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92779a;

        static {
            Covode.recordClassIndex(58835);
        }

        i(c cVar) {
            this.f92779a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
            // Method dump skipped, instructions count: 360
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.caption.c.i.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(androidx.fragment.app.e eVar) {
        if (d()) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("use_transl", !this.f92761j ? 1 : 0).a("have_transl", ah.b(this.L) ? 1 : 0).a("subtitle_type", ah.c(this.L)).a("subtitle_lang", ah.e(this.L)).a("have_tts", this.v ? 1 : 0).a("use_tts", d() ? 1 : 0).a("cla_subtitle_type", ah.a(this.f92761j, this.L));
            Aweme aweme = this.L;
            h.f.b.l.b(aweme, "");
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
            Aweme aweme2 = this.L;
            h.f.b.l.b(aweme2, "");
            r.a("tts_intro_show", a3.a("author_id", aweme2.getAuthorUid()).a("enter_from", this.M).f66730a);
        } else {
            com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("use_transl", !this.f92761j ? 1 : 0).a("have_transl", ah.b(this.L) ? 1 : 0).a("subtitle_type", ah.c(this.L)).a("subtitle_lang", ah.e(this.L)).a("have_tts", this.v ? 1 : 0).a("use_tts", d() ? 1 : 0).a("cla_subtitle_type", ah.a(this.f92761j, this.L));
            Aweme aweme3 = this.L;
            h.f.b.l.b(aweme3, "");
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("group_id", aweme3.getAid());
            Aweme aweme4 = this.L;
            h.f.b.l.b(aweme4, "");
            r.a("subtitle_intro_show", a5.a("author_id", aweme4.getAuthorUid()).a("enter_from", this.M).f66730a);
        }
        a.b();
        b bVar = new b(eVar, (byte) 0);
        com.bytedance.tux.sheet.sheet.a aVar = new a.C1112a().a(bVar).f45299a;
        bVar.getBtnDismiss().setOnClickListener(new n(aVar));
        bVar.getIvClose().setOnClickListener(new o(aVar));
        p pVar = new p(this, eVar, aVar);
        bVar.getTvGoSetting().setOnClickListener(pVar);
        bVar.a(pVar, d());
        aVar.show(eVar.getSupportFragmentManager(), "feed_caption_intro");
    }

    public final void a(boolean z2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        this.f92762k = z2;
        TranslatedCaptionCacheServiceImpl.j().a(this.f92762k);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.f.a(!this.f92762k));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        h.f.b.l.b(ofInt, "");
        ofInt.setDuration(200L);
        this.q = ofInt;
        if (!gb.a() && (linearLayout4 = this.f92754c) != null) {
            linearLayout4.setPivotX(0.0f);
        }
        if (this.f92764m) {
            LinearLayout linearLayout5 = this.f92754c;
            if (linearLayout5 != null) {
                linearLayout5.setPivotY(0.0f);
            }
        } else {
            LinearLayout linearLayout6 = this.f92754c;
            if (linearLayout6 != null) {
                linearLayout6.setPivotY((float) linearLayout6.getHeight());
            }
        }
        if (!z2) {
            LinearLayout linearLayout7 = this.f92754c;
            if (linearLayout7 != null) {
                linearLayout7.setAlpha(1.0f);
            }
            LinearLayout linearLayout8 = this.f92754c;
            if (linearLayout8 != null) {
                linearLayout8.setScaleX(1.0f);
            }
            LinearLayout linearLayout9 = this.f92754c;
            if (linearLayout9 != null) {
                linearLayout9.setScaleY(1.0f);
            }
            String str = this.p;
            boolean isEmpty = TextUtils.isEmpty(str);
            z.c cVar = new z.c();
            int i2 = F;
            cVar.element = i2;
            z.c cVar2 = new z.c();
            cVar2.element = G;
            if (isEmpty) {
                TuxTextView tuxTextView = this.f92757f;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                View view = this.f92758g;
                if (view != null) {
                    view.setVisibility(8);
                }
                ImageView imageView = this.f92759h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView2 = this.f92757f;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
                boolean o2 = o();
                View view2 = this.f92758g;
                if (view2 != null) {
                    view2.setVisibility(c(o2));
                }
                if (o2) {
                    p();
                }
                TuxTextView tuxTextView3 = this.f92757f;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(str);
                }
                LinearLayout linearLayout10 = this.f92754c;
                if (linearLayout10 != null) {
                    linearLayout10.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                LinearLayout linearLayout11 = this.f92754c;
                if (linearLayout11 == null) {
                    h.f.b.l.b();
                }
                cVar.element = linearLayout11.getMeasuredWidth();
                LinearLayout linearLayout12 = this.f92754c;
                if (linearLayout12 == null) {
                    h.f.b.l.b();
                }
                cVar2.element = linearLayout12.getMeasuredHeight();
                if (gb.a() && (linearLayout3 = this.f92754c) != null) {
                    linearLayout3.setPivotX((float) cVar.element);
                }
                if (!this.f92764m && (linearLayout2 = this.f92754c) != null) {
                    linearLayout2.setPivotY((float) cVar2.element);
                }
            }
            if (cVar.element > 0 && cVar2.element > 0) {
                ofInt.addUpdateListener(new b(this, isEmpty, cVar, cVar2));
            }
            ofInt.addListener(new C2256c(this));
        } else {
            LinearLayout linearLayout13 = this.f92754c;
            if (linearLayout13 == null) {
                h.f.b.l.b();
            }
            int width = linearLayout13.getWidth();
            LinearLayout linearLayout14 = this.f92754c;
            if (linearLayout14 == null) {
                h.f.b.l.b();
            }
            int height = linearLayout14.getHeight();
            if (gb.a() && (linearLayout = this.f92754c) != null) {
                linearLayout.setPivotX((float) width);
            }
            ImageView imageView2 = this.f92760i;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f92760i;
            if (imageView3 != null) {
                imageView3.setAlpha(0.0f);
            }
            if (width > 0 && height > 0) {
                ofInt.addUpdateListener(new d(this, width, height));
            }
            ofInt.addListener(new e(this));
        }
        ofInt.start();
    }
}
