package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.preload.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.ap;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class g implements h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f123713e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.favorites.g.a f123714a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f123715b;

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f123716c;

    /* renamed from: d  reason: collision with root package name */
    public final String f123717d;

    /* renamed from: f  reason: collision with root package name */
    private final String f123718f;

    /* renamed from: g  reason: collision with root package name */
    private final String f123719g;

    /* renamed from: h  reason: collision with root package name */
    private final String f123720h;

    static {
        Covode.recordClassIndex(81207);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "favorite";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81208);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f123721a;

        static {
            Covode.recordClassIndex(81209);
        }

        b(g gVar) {
            this.f123721a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f123721a.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        if (this.f123716c.isCollected()) {
            return R.raw.icon_2pt_bookmark_fill;
        }
        return R.raw.icon_2pt_bookmark;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        if (this.f123716c.isCollected()) {
            return R.raw.icon_bookmark_fill;
        }
        return R.raw.icon_bookmark;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        if (this.f123716c.isCollected()) {
            ShareFlavorService.a.a();
            return R.string.ti;
        }
        ShareFlavorService.a.a();
        return R.string.th;
    }

    public final void h() {
        if (this.f123714a == null) {
            com.ss.android.ugc.aweme.favorites.g.a aVar = new com.ss.android.ugc.aweme.favorites.g.a();
            this.f123714a = aVar;
            aVar.f90639c = this.f123717d;
        }
        com.ss.android.ugc.aweme.favorites.g.a aVar2 = this.f123714a;
        if (aVar2 == null) {
            l.a("collectActionPresenter");
        }
        aVar2.a_(new c(this));
        com.ss.android.ugc.aweme.favorites.g.a aVar3 = this.f123714a;
        if (aVar3 == null) {
            l.a("collectActionPresenter");
        }
        aVar3.a(2, this.f123716c.getAid(), Integer.valueOf(!this.f123716c.isCollected()));
    }

    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f123722a;

        static {
            Covode.recordClassIndex(81210);
        }

        @Override // com.ss.android.ugc.aweme.favorites.g.d
        public final void e_(Exception exc) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(g gVar) {
            this.f123722a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.favorites.g.d
        public final void a(String str) {
            if (str != null) {
                new com.bytedance.tux.g.b(this.f123722a.f123715b).a(str).b();
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.g.d
        public final void a(BaseResponse baseResponse) {
            if (!this.f123722a.f123716c.isCollected()) {
                this.f123722a.f123716c.setCollectStatus(1);
                AwemeService.b().c(this.f123722a.f123716c.getAid(), 1);
                ReportFeedAdAction.a(this.f123722a.f123717d);
                com.ss.android.ugc.d.a.c.a(new ag(54, this.f123722a.f123716c));
                if (l.a((Object) "homepage_hot", (Object) this.f123722a.f123717d)) {
                    a.C2958a.a().a(6);
                    return;
                }
                return;
            }
            this.f123722a.f123716c.setCollectStatus(0);
            AwemeService.b().c(this.f123722a.f123716c.getAid(), 0);
            com.ss.android.ugc.d.a.c.a(new ag(54, this.f123722a.f123716c));
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String region;
        l.d(context, "");
        l.d(sharePackage, "");
        if (!this.f123716c.isCollected()) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", this.f123717d).a("group_id", this.f123716c.getAid()).a("author_id", this.f123716c.getAuthorUid()).a("enter_method", "click_share_button").a("tag_id", this.f123718f).a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(this.f123716c, "detail")).a("is_highlighted", Boolean.valueOf(this.f123716c.isHighlighted())).a("rank_index", this.f123716c.getOriginalPos());
            l.b(a2, "");
            com.ss.android.ugc.aweme.upvote.event.c.a(a2, this.f123716c, this.f123717d);
            if (l.a((Object) "homepage_country", (Object) this.f123717d) && this.f123716c.getAuthor() != null) {
                if (this.f123716c.getAuthor() == null) {
                    region = "";
                } else {
                    User author = this.f123716c.getAuthor();
                    l.b(author, "");
                    region = author.getRegion();
                }
                dVar.a("country_name", region);
            }
            if (this.f123719g.length() > 0) {
                dVar.a("parent_tag_id", this.f123719g);
            }
            if (this.f123720h.length() > 0) {
                dVar.a("category_name", this.f123720h);
            }
            dVar.a(y.b(FeedParamProvider.a.a(context).getPreviousPage(), FeedParamProvider.a.a(context).getFromGroupId()));
            l.b(dVar, "");
            com.ss.android.ugc.aweme.story.b.h.a(dVar, this.f123716c);
            if (ac.a(this.f123717d)) {
                dVar.a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f123716c)));
                r.a("favourite_video", com.ss.android.ugc.aweme.metrics.ac.a(dVar.f66730a));
            } else {
                r.a("favourite_video", dVar.f66730a);
            }
            s.a(af.SHARE);
        } else {
            r.a("cancel_favourite_video", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f123717d).a("group_id", this.f123716c.getAid()).a("author_id", this.f123716c.getAuthorUid()).a("enter_method", "click_share_button").a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f123716c))).a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(this.f123716c, "detail")).f66730a);
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(this.f123716c)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.og).a();
            return;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            String aid = this.f123716c.getAid();
            com.ss.android.ugc.aweme.login.c.a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), this.f123717d, "click_favorite_video", new ap().a("group_id", aid).a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(aid)).f142646a, new b(this));
            return;
        }
        h();
    }

    public g(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        l.d(activity, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f123715b = activity;
        this.f123716c = aweme;
        this.f123717d = str;
        this.f123718f = str2;
        this.f123719g = str3;
        this.f123720h = str4;
    }
}
