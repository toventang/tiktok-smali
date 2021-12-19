package com.ss.android.ugc.aweme.feed.assem.corss.language;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class VideoCLACaptionViewModel extends FeedBaseViewModel<l> {
    public long A = -1;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: k  reason: collision with root package name */
    public long f92093k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f92094l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f92095m;
    public boolean n;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y = "";
    public boolean z;

    static {
        Covode.recordClassIndex(58072);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new l();
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(0);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.w = true;
            this.this$0.x = false;
            return z.f158842a;
        }
    }

    private final void m() {
        b(new k(this));
    }

    public final boolean j() {
        if (!this.B || !this.D || this.f92094l) {
            return false;
        }
        return true;
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(0);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.w = false;
            if (!this.this$0.x) {
                this.this$0.a(AnonymousClass1.f92098a);
            }
            this.this$0.x = false;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        return ah.a(aweme);
    }

    public final void i() {
        boolean h2 = h();
        this.n = h2;
        if (h2) {
            this.f92095m = TranslatedCaptionCacheServiceImpl.j().b();
        }
        this.B = TranslatedCaptionCacheServiceImpl.j().e();
    }

    public final int k() {
        Aweme aweme;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Long l2;
        Aweme aweme2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        if (!this.f92094l) {
            return 0;
        }
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return 8;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) g();
        if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (video2 = aweme2.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Iterator<T> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            long languageId = next.getLanguageId();
            if (l2 != null && languageId == l2.longValue()) {
                if (next.isAutoGenerated()) {
                    return 0;
                }
            }
        }
        return 8;
    }

    private final void l() {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        String str;
        String str2;
        Aweme aweme5;
        Aweme aweme6;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("use_transl", !this.f92094l ? 1 : 0);
        VideoItemParams videoItemParams = (VideoItemParams) g();
        String str3 = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("have_transl", ah.b(aweme) ? 1 : 0);
        VideoItemParams videoItemParams2 = (VideoItemParams) g();
        if (videoItemParams2 != null) {
            aweme2 = videoItemParams2.mAweme;
        } else {
            aweme2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("subtitle_type", ah.c(aweme2));
        VideoItemParams videoItemParams3 = (VideoItemParams) g();
        if (videoItemParams3 != null) {
            aweme3 = videoItemParams3.mAweme;
        } else {
            aweme3 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_lang", ah.e(aweme3)).a("have_tts", this.C ? 1 : 0).a("use_tts", j() ? 1 : 0);
        boolean z2 = this.f92094l;
        VideoItemParams videoItemParams4 = (VideoItemParams) g();
        if (videoItemParams4 != null) {
            aweme4 = videoItemParams4.mAweme;
        } else {
            aweme4 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("cla_subtitle_type", ah.a(z2, aweme4));
        VideoItemParams videoItemParams5 = (VideoItemParams) g();
        if (videoItemParams5 == null || (aweme6 = videoItemParams5.mAweme) == null) {
            str = null;
        } else {
            str = aweme6.getAid();
        }
        com.ss.android.ugc.aweme.app.f.d a7 = a6.a("group_id", str);
        VideoItemParams videoItemParams6 = (VideoItemParams) g();
        if (videoItemParams6 == null || (aweme5 = videoItemParams6.mAweme) == null) {
            str2 = null;
        } else {
            str2 = aweme5.getAuthorUid();
        }
        com.ss.android.ugc.aweme.app.f.d a8 = a7.a("author_id", str2);
        VideoItemParams videoItemParams7 = (VideoItemParams) g();
        if (videoItemParams7 != null) {
            str3 = videoItemParams7.mEventType;
        }
        r.a("subtitle_intro_show", a8.a("enter_from", str3).f66730a);
    }

    static final class d extends h.f.b.m implements h.f.a.b<l, l> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f92099a = new d();

        static {
            Covode.recordClassIndex(58079);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, false, null, 2);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<l, l> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f92100a = new e();

        static {
            Covode.recordClassIndex(58080);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, true, null, 2);
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f92101a;

        static {
            Covode.recordClassIndex(58087);
        }

        l(com.bytedance.tux.sheet.sheet.a aVar) {
            this.f92101a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92101a.dismiss();
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f92102a;

        static {
            Covode.recordClassIndex(58088);
        }

        m(com.bytedance.tux.sheet.sheet.a aVar) {
            this.f92102a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92102a.dismiss();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<l, l> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92106a = new o();

        static {
            Covode.recordClassIndex(58090);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, false, new com.bytedance.assem.arch.extensions.g(true), 1);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ h.f.a.a $hideCaptionListener;
        final /* synthetic */ h.f.a.a $seeCaptionListener;
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VideoCLACaptionViewModel videoCLACaptionViewModel, h.f.a.a aVar, h.f.a.a aVar2) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
            this.$seeCaptionListener = aVar;
            this.$hideCaptionListener = aVar2;
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92097a;

            static {
                Covode.recordClassIndex(58075);
            }

            b(a aVar) {
                this.f92097a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f92097a.this$0.x = true;
                VideoCLACaptionViewModel videoCLACaptionViewModel = this.f92097a.this$0;
                videoCLACaptionViewModel.b(new h(videoCLACaptionViewModel));
                this.f92097a.this$0.w = false;
                this.f92097a.$hideCaptionListener.invoke();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            Aweme aweme;
            int i2;
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            if (ah.f(aweme)) {
                d.b bVar = new d.b();
                if (this.this$0.f92094l) {
                    i2 = R.string.fjz;
                } else {
                    i2 = R.string.fjy;
                }
                bVar.f45497c = i2;
                bVar.f45500f = new View$OnClickListenerC2232a(this);
                dVar2.a(bVar);
            }
            d.b bVar2 = new d.b();
            bVar2.f45497c = R.string.h_a;
            bVar2.f45500f = new b(this);
            dVar2.a(bVar2);
            return z.f158842a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2232a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92096a;

            static {
                Covode.recordClassIndex(58074);
            }

            View$OnClickListenerC2232a(a aVar) {
                this.f92096a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r13) {
                /*
                // Method dump skipped, instructions count: 314
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel.a.View$OnClickListenerC2232a.onClick(android.view.View):void");
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            String str;
            String str2;
            h.f.b.l.d(lVar, "");
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
            if (this.this$0.j()) {
                str2 = "translate_tts";
            } else {
                str2 = "translate_subtitle";
            }
            r.a("enter_setting_page", a2.a("enter_method", str2).f66730a);
            return z.f158842a;
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCLACaptionViewModel f92103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f92104b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f92105c;

        static {
            Covode.recordClassIndex(58089);
        }

        n(VideoCLACaptionViewModel videoCLACaptionViewModel, androidx.fragment.app.e eVar, com.bytedance.tux.sheet.sheet.a aVar) {
            this.f92103a = videoCLACaptionViewModel;
            this.f92104b = eVar;
            this.f92105c = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            VideoCLACaptionViewModel videoCLACaptionViewModel = this.f92103a;
            videoCLACaptionViewModel.b(new f(videoCLACaptionViewModel));
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f92104b, "aweme://setting");
            if (this.f92103a.j()) {
                str = "translate_tts";
            } else {
                str = "translate_subtitle";
            }
            buildRoute.withParam("enter_from", str).open();
            this.f92105c.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(androidx.fragment.app.e eVar) {
        if (j()) {
            m();
        } else {
            l();
        }
        com.ss.android.ugc.aweme.feed.caption.a.b();
        com.ss.android.ugc.aweme.feed.caption.b bVar = new com.ss.android.ugc.aweme.feed.caption.b(eVar, (byte) 0);
        com.bytedance.tux.sheet.sheet.a aVar = new a.C1112a().a(bVar).f45299a;
        bVar.getBtnDismiss().setOnClickListener(new l(aVar));
        bVar.getIvClose().setOnClickListener(new m(aVar));
        n nVar = new n(this, eVar, aVar);
        bVar.getTvGoSetting().setOnClickListener(nVar);
        bVar.a(nVar, j());
        aVar.show(eVar.getSupportFragmentManager(), "feed_caption_intro");
    }

    static final class i extends h.f.b.m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.corss.language.l r8) {
            /*
            // Method dump skipped, instructions count: 247
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel.i.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String str;
            String str2;
            Aweme aweme5;
            Aweme aweme6;
            h.f.b.l.d(lVar, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("use_transl", !this.this$0.f92094l ? 1 : 0);
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            Aweme aweme7 = null;
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("have_transl", ah.b(aweme) ? 1 : 0);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            if (videoItemParams2 != null) {
                aweme2 = videoItemParams2.mAweme;
            } else {
                aweme2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("subtitle_type", ah.c(aweme2));
            VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
            if (videoItemParams3 != null) {
                aweme3 = videoItemParams3.mAweme;
            } else {
                aweme3 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_lang", ah.e(aweme3)).a("have_tts", this.this$0.C ? 1 : 0).a("use_tts", this.this$0.j() ? 1 : 0);
            boolean z = this.this$0.f92094l;
            VideoItemParams videoItemParams4 = (VideoItemParams) this.this$0.g();
            if (videoItemParams4 != null) {
                aweme4 = videoItemParams4.mAweme;
            } else {
                aweme4 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("cla_subtitle_type", ah.a(z, aweme4));
            VideoItemParams videoItemParams5 = (VideoItemParams) this.this$0.g();
            if (videoItemParams5 == null || (aweme6 = videoItemParams5.mAweme) == null) {
                str = null;
            } else {
                str = aweme6.getAid();
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("group_id", str);
            VideoItemParams videoItemParams6 = (VideoItemParams) this.this$0.g();
            if (videoItemParams6 == null || (aweme5 = videoItemParams6.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme5.getAuthorUid();
            }
            com.ss.android.ugc.aweme.app.f.d a8 = a7.a("author_id", str2);
            VideoItemParams videoItemParams7 = (VideoItemParams) this.this$0.g();
            if (videoItemParams7 != null) {
                aweme7 = videoItemParams7.mAweme;
            }
            r.a("tts_intro_show", a8.a("enter_from", aweme7).f66730a);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            String str;
            String str2;
            String str3;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            Aweme aweme6;
            String str4 = "";
            h.f.b.l.d(lVar, str4);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            Aweme aweme7 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            if (videoItemParams2 == null || (aweme6 = videoItemParams2.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme6.getAid();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str2);
            VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
            if (videoItemParams3 == null || (aweme5 = videoItemParams3.mAweme) == null) {
                str3 = null;
            } else {
                str3 = aweme5.getAuthorUid();
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str3).a("use_transl", !this.this$0.f92094l ? 1 : 0);
            VideoItemParams videoItemParams4 = (VideoItemParams) this.this$0.g();
            if (videoItemParams4 != null) {
                aweme = videoItemParams4.mAweme;
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_type", ah.c(aweme));
            VideoItemParams videoItemParams5 = (VideoItemParams) this.this$0.g();
            if (videoItemParams5 != null) {
                aweme2 = videoItemParams5.mAweme;
            } else {
                aweme2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("have_transl", ah.b(aweme2) ? 1 : 0);
            if (this.this$0.f92094l) {
                VideoItemParams videoItemParams6 = (VideoItemParams) this.this$0.g();
                if (!(videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str4 = languageName;
                }
            } else {
                VideoItemParams videoItemParams7 = (VideoItemParams) this.this$0.g();
                if (videoItemParams7 != null) {
                    aweme3 = videoItemParams7.mAweme;
                } else {
                    aweme3 = null;
                }
                str4 = ah.e(aweme3);
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("subtitle_lang", str4).a("have_tts", this.this$0.C ? 1 : 0).a("use_tts", this.this$0.j() ? 1 : 0);
            boolean z = this.this$0.f92094l;
            VideoItemParams videoItemParams8 = (VideoItemParams) this.this$0.g();
            if (videoItemParams8 != null) {
                aweme7 = videoItemParams8.mAweme;
            }
            r.a("expand_subtitle", a7.a("cla_subtitle_type", ah.a(z, aweme7)).f66730a);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            String str;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String str2;
            Aweme aweme5;
            Aweme aweme6;
            Aweme aweme7;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            String str3 = "";
            h.f.b.l.d(lVar, str3);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            String str4 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str).a("use_transl", !this.this$0.f92094l ? 1 : 0);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_type", ah.c(aweme));
            VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("have_transl", ah.b(aweme2) ? 1 : 0);
            if (this.this$0.f92094l) {
                VideoItemParams videoItemParams4 = (VideoItemParams) this.this$0.g();
                if (!(videoItemParams4 == null || (aweme7 = videoItemParams4.mAweme) == null || (video = aweme7.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str3 = languageName;
                }
            } else {
                VideoItemParams videoItemParams5 = (VideoItemParams) this.this$0.g();
                if (videoItemParams5 != null) {
                    aweme3 = videoItemParams5.mAweme;
                } else {
                    aweme3 = null;
                }
                str3 = ah.e(aweme3);
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_lang", str3).a("have_tts", this.this$0.C ? 1 : 0).a("use_tts", this.this$0.j() ? 1 : 0);
            boolean z = this.this$0.f92094l;
            VideoItemParams videoItemParams6 = (VideoItemParams) this.this$0.g();
            if (videoItemParams6 != null) {
                aweme4 = videoItemParams6.mAweme;
            } else {
                aweme4 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("cla_subtitle_type", ah.a(z, aweme4));
            VideoItemParams videoItemParams7 = (VideoItemParams) this.this$0.g();
            if (videoItemParams7 == null || (aweme6 = videoItemParams7.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme6.getAid();
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("group_id", str2);
            VideoItemParams videoItemParams8 = (VideoItemParams) this.this$0.g();
            if (!(videoItemParams8 == null || (aweme5 = videoItemParams8.mAweme) == null)) {
                str4 = aweme5.getAuthorUid();
            }
            r.a("hide_subtitle", a7.a("author_id", str4).f66730a);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoCLACaptionViewModel this$0;

        static {
            Covode.recordClassIndex(58085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VideoCLACaptionViewModel videoCLACaptionViewModel) {
            super(1);
            this.this$0 = videoCLACaptionViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            String str;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            String e2;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            String str2;
            Aweme aweme6;
            Aweme aweme7;
            Aweme aweme8;
            Aweme aweme9;
            Video video2;
            CaptionModel captionModel2;
            CaptionLanguage originalCaptionLanguage2;
            String str3 = "";
            h.f.b.l.d(lVar, str3);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            String str4 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_type", ah.c(aweme));
            VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("have_transl", ah.b(aweme2) ? 1 : 0).a("use_transl", !this.this$0.f92094l ? 1 : 0);
            if (this.this$0.f92094l) {
                VideoItemParams videoItemParams4 = (VideoItemParams) this.this$0.g();
                if (videoItemParams4 == null || (aweme9 = videoItemParams4.mAweme) == null || (video2 = aweme9.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage2 = captionModel2.getOriginalCaptionLanguage()) == null || (e2 = originalCaptionLanguage2.getLanguageName()) == null) {
                    e2 = str3;
                }
            } else {
                VideoItemParams videoItemParams5 = (VideoItemParams) this.this$0.g();
                if (videoItemParams5 != null) {
                    aweme3 = videoItemParams5.mAweme;
                } else {
                    aweme3 = null;
                }
                e2 = ah.e(aweme3);
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("to_lang", e2);
            if (this.this$0.f92094l) {
                VideoItemParams videoItemParams6 = (VideoItemParams) this.this$0.g();
                if (videoItemParams6 != null) {
                    aweme8 = videoItemParams6.mAweme;
                } else {
                    aweme8 = null;
                }
                str3 = ah.e(aweme8);
            } else {
                VideoItemParams videoItemParams7 = (VideoItemParams) this.this$0.g();
                if (!(videoItemParams7 == null || (aweme4 = videoItemParams7.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str3 = languageName;
                }
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("subtitle_lang", str3).a("have_tts", this.this$0.C ? 1 : 0).a("use_tts", this.this$0.j() ? 1 : 0);
            boolean z = this.this$0.f92094l;
            VideoItemParams videoItemParams8 = (VideoItemParams) this.this$0.g();
            if (videoItemParams8 != null) {
                aweme5 = videoItemParams8.mAweme;
            } else {
                aweme5 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("cla_subtitle_type", ah.a(z, aweme5));
            VideoItemParams videoItemParams9 = (VideoItemParams) this.this$0.g();
            if (videoItemParams9 == null || (aweme7 = videoItemParams9.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme7.getAid();
            }
            com.ss.android.ugc.aweme.app.f.d a8 = a7.a("group_id", str2);
            VideoItemParams videoItemParams10 = (VideoItemParams) this.this$0.g();
            if (!(videoItemParams10 == null || (aweme6 = videoItemParams10.mAweme) == null)) {
                str4 = aweme6.getAuthorUid();
            }
            r.a("change_subtitle_lang", a8.a("author_id", str4).f66730a);
            return z.f158842a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(com.bytedance.assem.arch.viewModel.j jVar, VideoItemParams videoItemParams) {
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(videoItemParams, "");
        return videoItemParams;
    }
}
