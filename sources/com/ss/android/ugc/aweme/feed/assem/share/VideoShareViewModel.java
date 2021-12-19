package com.ss.android.ugc.aweme.feed.assem.share;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.guide.h;
import com.ss.android.ugc.aweme.feed.helper.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ae;
import com.ss.android.ugc.aweme.share.ah;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.v;

public final class VideoShareViewModel extends FeedBaseViewModel<r> {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f92432k = {new r(VideoShareViewModel.class, "context", "getContext()Landroid/content/Context;", 0)};
    public static final a w = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    int f92433l;

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f92434m;
    public volatile boolean n;
    long v;
    private final com.ss.android.ugc.aweme.feed.assem.h x = new com.ss.android.ugc.aweme.feed.assem.h(c.f92435a);
    private String y;

    static final class c extends m implements h.f.a.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f92435a = new c();

        static {
            Covode.recordClassIndex(58511);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(58508);
    }

    public final void a(Context context) {
        this.x.a(f92432k[0], context);
    }

    public final Context h() {
        return (Context) this.x.a(f92432k[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58509);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static int k() {
        return com.bytedance.ies.abmock.b.a().a(true, "share_guide_daily_limit", 0);
    }

    private final void l() {
        a(new b(this));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new r(null, 127);
    }

    public final void i() {
        if (this.f92434m) {
            this.f92434m = false;
            l();
        }
        if (this.n) {
            this.n = false;
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        Aweme aweme;
        String str;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null)) {
            try {
                Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                Context h2 = h();
                Activity activity = null;
                if (!(h2 instanceof Activity)) {
                    h2 = null;
                }
                if (j2 != ((Activity) h2)) {
                    return false;
                }
                Activity j3 = com.bytedance.ies.ugc.appcontext.f.j();
                if (!(j3 instanceof androidx.fragment.app.e)) {
                    j3 = null;
                }
                Aweme a2 = AwemeChangeCallBack.a((androidx.fragment.app.e) j3);
                if (a2 != null) {
                    str = a2.getAid();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, aweme.getAid()) || !w.a(h()) || !w.a(aweme) || h.a.f93250a.a(aweme.getAid())) {
                    return false;
                }
                h.a.f93250a.b(aweme.getAid());
                int a3 = com.bytedance.ies.abmock.b.a().a(true, "interction_share_button_whatsapp_style", 0);
                Context h3 = h();
                if (h3 instanceof Activity) {
                    activity = h3;
                }
                if (!w.a(activity)) {
                    a(new e(this));
                    if (a3 == 1) {
                        a(1.02f, 0.95f);
                    } else if (a3 == 2) {
                        a(1.05f, 0.9f);
                    }
                } else if (a3 == 1) {
                    a(1.02f, 0.95f);
                } else if (a3 == 2 && !this.f92434m) {
                    this.f92434m = true;
                    a(h.f92438a);
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    static final class f extends m implements h.f.a.b<r, r> {
        final /* synthetic */ VideoItemParams $params;
        final /* synthetic */ VideoShareViewModel this$0;

        static {
            Covode.recordClassIndex(58514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VideoShareViewModel videoShareViewModel, VideoItemParams videoItemParams) {
            super(1);
            this.this$0 = videoShareViewModel;
            this.$params = videoItemParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return this.this$0.a((com.bytedance.assem.arch.viewModel.j) rVar2, this.$params);
        }
    }

    public static f d(r rVar) {
        f fVar = rVar.f92493c;
        if (fVar == null) {
            return new f();
        }
        return fVar;
    }

    private static d g(r rVar) {
        d dVar = rVar.f92496f;
        if (dVar == null) {
            return new d();
        }
        return dVar;
    }

    static final class g extends m implements h.f.a.b<r, r> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92437a = new g();

        static {
            Covode.recordClassIndex(58515);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, false, null, null, null, v.a(1, 1), null, null, 111);
        }
    }

    public static final class d extends m implements h.f.a.b<r, r> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f92436a = new d();

        static {
            Covode.recordClassIndex(58512);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, false, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(v.a(b.HideStayHomeGuide, null)), 63);
        }
    }

    static final class e extends m implements h.f.a.b<r, r> {
        final /* synthetic */ VideoShareViewModel this$0;

        static {
            Covode.recordClassIndex(58513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VideoShareViewModel videoShareViewModel) {
            super(1);
            this.this$0 = videoShareViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, false, null, f.a(VideoShareViewModel.d(rVar2), androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), 2131231753)), null, null, null, null, 123);
        }
    }

    static final class h extends m implements h.f.a.b<r, r> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f92438a = new h();

        static {
            Covode.recordClassIndex(58516);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, false, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(v.a(b.BreatheShare, null)), 63);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<r, r> {
        final /* synthetic */ float $scaleMax;
        final /* synthetic */ float $scaleMin;

        static {
            Covode.recordClassIndex(58517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(float f2, float f3) {
            super(1);
            this.$scaleMin = f2;
            this.$scaleMax = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, false, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(v.a(b.FlipAndBreathe, new c(this.$scaleMin, this.$scaleMax))), 63);
        }
    }

    public static final class j extends m implements h.f.a.b<r, r> {
        final /* synthetic */ VideoShareViewModel this$0;

        static {
            Covode.recordClassIndex(58518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(VideoShareViewModel videoShareViewModel) {
            super(1);
            this.this$0 = videoShareViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            Aweme aweme;
            r rVar2 = rVar;
            l.d(rVar2, "");
            b bVar = b.ShareGuide;
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            return r.a(rVar2, false, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(v.a(bVar, new a(aweme, this.this$0.p))), 63);
        }
    }

    public static final class k extends m implements h.f.a.b<r, r> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92439a = new k();

        static {
            Covode.recordClassIndex(58519);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, false, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(v.a(b.ShowStayHomeGuide, null)), 63);
        }
    }

    private final CharSequence a(AwemeStatistics awemeStatistics) {
        Resources resources;
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(awemeStatistics.getShareCount());
        if (!TextUtils.equals("0", a2) || h() == null) {
            return a2;
        }
        Context h2 = h();
        if (h2 == null || (resources = h2.getResources()) == null) {
            return null;
        }
        return resources.getText(R.string.haa);
    }

    public static r c(r rVar) {
        int b2 = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 40.0f);
        d a2 = d.a(g(rVar), Float.valueOf(1.0f));
        d(rVar);
        return r.a(rVar, false, null, f.a(androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), ae.a()), new ViewGroup.LayoutParams(b2, -1)), null, null, a2, null, 91);
    }

    public final r b(r rVar) {
        Context h2 = h();
        if (!(h2 instanceof Activity)) {
            h2 = null;
        }
        Activity activity = (Activity) h2;
        if (activity == null || !w.a(activity)) {
            return c(rVar);
        }
        return r.a(rVar, false, null, f.a(d(rVar), androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), 2131231753)), null, null, null, null, 123);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<r, r> {
        final /* synthetic */ VideoShareViewModel this$0;

        static {
            Covode.recordClassIndex(58510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoShareViewModel videoShareViewModel) {
            super(1);
            this.this$0 = videoShareViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r c2;
            r rVar2 = rVar;
            l.d(rVar2, "");
            if (w.a(this.this$0.h())) {
                c2 = this.this$0.b(rVar2);
            } else if (com.bytedance.ies.abmock.b.a().a(true, "interction_share_button_style", 0) != 0) {
                c2 = this.this$0.a(rVar2);
            } else {
                c2 = VideoShareViewModel.c(rVar2);
            }
            return r.a(this.this$0.e(c2), false, null, null, null, v.a(1, 1), null, null, 111);
        }
    }

    private final r f(r rVar) {
        Aweme aweme;
        Aweme aweme2;
        User author;
        r rVar2 = rVar;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        String str = null;
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || aweme.getAuthor() == null || com.ss.android.ugc.aweme.im.service.c.k.c())) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            VideoItemParams videoItemParams2 = (VideoItemParams) g();
            if (!(videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (author = aweme2.getAuthor()) == null)) {
                str = author.getUid();
            }
            if (g2.isMe(str)) {
                return r.a(rVar2, false, null, f.a(d(rVar2), androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), 2131233138)), null, null, null, null, 123);
            }
        }
        if (w.a(h())) {
            return b(rVar2);
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "interction_share_button_style", 0) != 0) {
            return a(rVar2);
        }
        try {
            rVar2 = c(rVar2);
            return rVar2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return rVar2;
        }
    }

    public final r a(r rVar) {
        Drawable a2;
        this.y = ah.f123353b.d();
        boolean b2 = w.b(h());
        if (this.y != null || !b2) {
            int a3 = com.bytedance.ies.abmock.b.a().a(true, "interction_share_button_style", 0);
            if (this.y == null || a3 == 1) {
                return c(rVar);
            }
            Context h2 = h();
            if (!(h2 instanceof Activity)) {
                h2 = null;
            }
            Activity activity = (Activity) h2;
            if (activity == null || (a2 = ah.f123353b.a(activity, this.y)) == null) {
                return rVar;
            }
            d(rVar);
            return r.a(rVar, false, null, f.a(a2, new ViewGroup.LayoutParams((int) n.b(h(), 36.0f), (int) n.b(h(), 36.0f))), null, null, null, null, 123);
        }
        d(rVar);
        return r.a(rVar, false, null, f.a(androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), 2131231753), new ViewGroup.LayoutParams((int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 36.0f), (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 36.0f))), null, null, null, null, 123);
    }

    public final r e(r rVar) {
        User user;
        AwemeStatistics awemeStatistics;
        e eVar;
        String str;
        Aweme aweme;
        Aweme aweme2;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        Aweme aweme3 = null;
        if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
            user = null;
        } else {
            user = aweme2.getAuthor();
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) g();
        if (videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null) {
            awemeStatistics = null;
        } else {
            awemeStatistics = aweme.getStatistics();
        }
        if (awemeStatistics == null || user == null) {
            eVar = new e(false, 6);
        } else {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (TextUtils.equals(g2.getCurUserId(), user.getUid())) {
                eVar = new e(false, 6);
            } else if (com.bytedance.ies.abmock.b.a().a(true, "share_button_style", 2) == 2) {
                eVar = new e(true, Float.valueOf(10.0f), com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.haa));
            } else if (com.bytedance.ies.abmock.b.a().a(true, "share_button_style", 2) == 3) {
                Float valueOf = Float.valueOf(12.0f);
                CharSequence a2 = a(awemeStatistics);
                if (a2 != null) {
                    str = a2.toString();
                } else {
                    str = null;
                }
                eVar = new e(true, valueOf, str);
            } else {
                eVar = new e(false, 6);
            }
        }
        VideoItemParams videoItemParams3 = (VideoItemParams) g();
        if (videoItemParams3 != null) {
            aweme3 = videoItemParams3.mAweme;
        }
        if (com.ss.android.ugc.aweme.login.b.a.a(aweme3)) {
            return r.a(rVar, false, e.a(eVar, "0"), null, null, null, null, null, 125);
        }
        return r.a(rVar, false, eVar, null, null, null, null, null, 125);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(com.bytedance.assem.arch.viewModel.j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    private final void a(float f2, float f3) {
        if (!this.f92434m) {
            this.f92434m = true;
            a(new i(f3, f2));
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (android.text.TextUtils.equals(r1, r0.getUid()) == false) goto L_0x0038;
     */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.ss.android.ugc.aweme.feed.assem.share.r a(com.ss.android.ugc.aweme.feed.assem.share.r r7, com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }
}
