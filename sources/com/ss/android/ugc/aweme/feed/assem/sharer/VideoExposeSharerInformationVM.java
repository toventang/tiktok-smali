package com.ss.android.ugc.aweme.feed.assem.sharer;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.utils.cv;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.k.i;

public final class VideoExposeSharerInformationVM extends FeedBaseViewModel<j> implements r {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ i[] f92498k = {new h.f.b.r(VideoExposeSharerInformationVM.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final a f92499m = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    w f92500l;
    private final com.ss.android.ugc.aweme.feed.assem.h n = new com.ss.android.ugc.aweme.feed.assem.h(c.f92503a);

    static final class c extends m implements h.f.a.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f92503a = new c();

        static {
            Covode.recordClassIndex(58572);
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
        Covode.recordClassIndex(58569);
    }

    public final void a(Context context) {
        this.n.a(f92498k[0], context);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
    }

    public final Context h() {
        return (Context) this.n.a(f92498k[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58570);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(VideoItemParams videoItemParams) {
            ExposeSharer exposeSharer;
            String uid;
            String str;
            l.d(videoItemParams, "");
            Aweme aweme = videoItemParams.mAweme;
            if (aweme == null || (exposeSharer = aweme.getExposeSharer()) == null || (uid = exposeSharer.getUid()) == null) {
                return false;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (g2 != null) {
                str = g2.getCurUserId();
            } else {
                str = null;
            }
            return !l.a((Object) uid, (Object) str);
        }
    }

    private final void j() {
        a(g.f92506a);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new j();
    }

    static final class b implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f92501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoExposeSharerInformationVM f92502b;

        static {
            Covode.recordClassIndex(58571);
        }

        b(Aweme aweme, VideoExposeSharerInformationVM videoExposeSharerInformationVM) {
            this.f92501a = aweme;
            this.f92502b = videoExposeSharerInformationVM;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            VideoExposeSharerInformationVM videoExposeSharerInformationVM = this.f92502b;
            Aweme aweme = this.f92501a;
            String str = videoExposeSharerInformationVM.p;
            if (str == null) {
                str = "";
            }
            videoExposeSharerInformationVM.a(aweme, str, false);
        }
    }

    public final int i() {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (exposeSharer = aweme.getExposeSharer()) == null) {
            return R.string.d88;
        }
        int followStatus = exposeSharer.getFollowStatus();
        int followerStatus = exposeSharer.getFollowerStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return R.string.c06;
            }
            if (followStatus == 2) {
                return R.string.bbg;
            }
            if (followStatus != 4) {
                return R.string.d88;
            }
            return R.string.bzw;
        } else if (followerStatus == 1) {
            return R.string.byt;
        } else {
            return R.string.byp;
        }
    }

    private final void b(boolean z) {
        if (z) {
            a(d.f92504a);
        } else {
            a(e.f92505a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<j, j> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f92504a = new d();

        static {
            Covode.recordClassIndex(58573);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            return j.a(jVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(true), null, 0, false, 119);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<j, j> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f92505a = new e();

        static {
            Covode.recordClassIndex(58574);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            return j.a(jVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(false), null, 0, false, 119);
        }
    }

    static final class f extends m implements h.f.a.b<j, j> {
        final /* synthetic */ boolean $hasPlayed = true;

        static {
            Covode.recordClassIndex(58575);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            return j.a(jVar2, null, null, null, null, null, 0, this.$hasPlayed, 63);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<j, j> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92506a = new g();

        static {
            Covode.recordClassIndex(58576);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            return j.a(jVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(true), 0, false, 111);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<j, j> {
        final /* synthetic */ VideoExposeSharerInformationVM this$0;

        static {
            Covode.recordClassIndex(58577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VideoExposeSharerInformationVM videoExposeSharerInformationVM) {
            super(1);
            this.this$0 = videoExposeSharerInformationVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            return j.a(jVar2, null, null, null, null, null, this.this$0.i(), false, 95);
        }
    }

    public final void a(boolean z) {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (exposeSharer = aweme.getExposeSharer()) == null)) {
            if (exposeSharer.getFollowStatus() == 0) {
                j();
            } else {
                b(z);
            }
        }
        a(new h(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && (exposeSharer = aweme.getExposeSharer()) != null && exposeSharer.getUid() != null) {
            String uid = exposeSharer.getUid();
            if (followStatus == null) {
                l.b();
            }
            if (l.a((Object) uid, (Object) followStatus.userId)) {
                exposeSharer.setFollowStatus(followStatus.followStatus);
                a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && (exposeSharer = aweme.getExposeSharer()) != null && exposeSharer.getUid() != null) {
            Activity a2 = o.a(h());
            l.b(a2, "");
            com.ss.android.ugc.aweme.common.l.a(a2, exc);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ j a(j jVar, VideoItemParams videoItemParams) {
        String str;
        String str2;
        ExposeSharer exposeSharer;
        ExposeSharer exposeSharer2;
        j jVar2 = jVar;
        l.d(jVar2, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        UrlModel urlModel = null;
        if (aweme == null || (exposeSharer2 = aweme.getExposeSharer()) == null) {
            str = null;
        } else {
            str = exposeSharer2.getNickname();
        }
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        Aweme aweme2 = videoItemParams.mAweme;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        String sb2 = sb.append(str2).toString();
        if (sb2 == null) {
            sb2 = "no_aid";
        }
        Aweme aweme3 = videoItemParams.mAweme;
        if (!(aweme3 == null || (exposeSharer = aweme3.getExposeSharer()) == null)) {
            urlModel = exposeSharer.getAvatar();
        }
        return j.a(jVar2, str, sb2, urlModel, null, null, i(), false, 88);
    }

    public final void a(Aweme aweme, String str, boolean z) {
        String str2;
        String str3;
        boolean z2;
        int i2;
        String str4;
        w wVar = this.f92500l;
        if (wVar != null && wVar.i() && aweme.getExposeSharer() != null) {
            n.a aVar = new n.a();
            ExposeSharer exposeSharer = aweme.getExposeSharer();
            String str5 = null;
            if (exposeSharer != null) {
                str2 = exposeSharer.getUid();
            } else {
                str2 = null;
            }
            n.a a2 = aVar.a(str2);
            ExposeSharer exposeSharer2 = aweme.getExposeSharer();
            if (exposeSharer2 != null) {
                str3 = exposeSharer2.getSecUid();
            } else {
                str3 = null;
            }
            n.a b2 = a2.b(str3);
            ExposeSharer exposeSharer3 = aweme.getExposeSharer();
            int i3 = 0;
            if (exposeSharer3 == null || exposeSharer3.isPrivateAccount() != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            n.a b3 = b2.a(z2).a(1).c(str).b(cv.a.a(str, null));
            ExposeSharer exposeSharer4 = aweme.getExposeSharer();
            int i4 = -1;
            if (exposeSharer4 != null) {
                i2 = exposeSharer4.getFollowerStatus();
            } else {
                i2 = -1;
            }
            n.a d2 = b3.d(i2);
            String str6 = "homepage_hot";
            if (z) {
                if (!TextUtils.equals(str, str6)) {
                    i4 = cv.a.a(str);
                }
                d2.c(i4);
            } else {
                d2.c(cv.a.a(str));
            }
            w wVar2 = this.f92500l;
            if (wVar2 == null) {
                l.b();
            }
            wVar2.a(d2.a());
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "share_user_info_card");
            if (((FeedBaseViewModel) this).o != 0) {
                str6 = "server_push";
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("previous_page", str6).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid());
            ExposeSharer exposeSharer5 = aweme.getExposeSharer();
            if (exposeSharer5 != null) {
                str5 = exposeSharer5.getUid();
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("to_user_id", str5);
            ExposeSharer exposeSharer6 = aweme.getExposeSharer();
            if (exposeSharer6 == null || exposeSharer6.getFollowerStatus() != 1) {
                str4 = "single";
            } else {
                str4 = "mutual";
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("follow_type", str4);
            ExposeSharer exposeSharer7 = aweme.getExposeSharer();
            if (exposeSharer7 != null && exposeSharer7.isPrivateAccount() == 1) {
                i3 = 1;
            }
            com.ss.android.ugc.aweme.common.r.a("follow", a6.a("is_private", i3).f66730a);
        }
    }
}
