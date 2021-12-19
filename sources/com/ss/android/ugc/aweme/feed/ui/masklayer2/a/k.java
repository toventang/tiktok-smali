package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.preload.b.a;
import com.ss.android.ugc.aweme.upvote.event.c;
import com.ss.android.ugc.aweme.utils.ap;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class k extends n implements d {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.favorites.g.a f94896a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.ui.masklayer2.a f94897b;

    /* renamed from: c  reason: collision with root package name */
    private final f f94898c;

    static {
        Covode.recordClassIndex(60188);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
    }

    static final class a implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f94899a;

        static {
            Covode.recordClassIndex(60189);
        }

        a(k kVar) {
            this.f94899a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f94899a.a();
        }
    }

    public final void a() {
        String str;
        if (this.f94896a == null) {
            this.f94896a = new com.ss.android.ugc.aweme.favorites.g.a();
        }
        com.ss.android.ugc.aweme.favorites.g.a aVar = this.f94896a;
        if (aVar != null) {
            aVar.f90639c = this.f94902g;
        }
        com.ss.android.ugc.aweme.favorites.g.a aVar2 = this.f94896a;
        if (aVar2 != null) {
            aVar2.a_(this);
        }
        com.ss.android.ugc.aweme.favorites.g.a aVar3 = this.f94896a;
        if (aVar3 != null) {
            Object[] objArr = new Object[3];
            int i2 = 0;
            objArr[0] = 2;
            Aweme aweme = this.f94901f;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            objArr[1] = str;
            Aweme aweme2 = this.f94901f;
            if (aweme2 == null || !aweme2.isCollected()) {
                i2 = 1;
            }
            objArr[2] = Integer.valueOf(i2);
            aVar3.a(objArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        f fVar = this.f94898c;
        if (!(fVar instanceof Dialog)) {
            fVar = null;
        }
        Dialog dialog = (Dialog) fVar;
        if (dialog != null) {
            new b(dialog).a(str).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
        Aweme aweme = this.f94901f;
        if (aweme != null) {
            aweme.setCollectStatus(!aweme.isCollected());
            AwemeService.b().c(aweme.getAid(), aweme.getCollectStatus());
            if (l.a((Object) "homepage_hot", (Object) this.f94902g)) {
                a.C2958a.a().a(6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        Integer num;
        String aid;
        Activity ownerActivity;
        String str4 = "";
        l.d(view, str4);
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 != null) {
            dVar.a(y.b(FeedParamProvider.a.a(j2).getPreviousPage(), FeedParamProvider.a.a(j2).getFromGroupId()));
        }
        Aweme aweme = this.f94901f;
        if (aweme == null || !aweme.isCollected()) {
            str = "favourite_video";
        } else {
            str = "cancel_favourite_video";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", this.f94902g);
        Aweme aweme2 = this.f94901f;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str2);
        Aweme aweme3 = this.f94901f;
        if (aweme3 != null) {
            str3 = aweme3.getAuthorUid();
        } else {
            str3 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str3).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f94901f))).a("enter_method", "long_press");
        Aweme aweme4 = this.f94901f;
        if (aweme4 != null) {
            bool = Boolean.valueOf(aweme4.isHighlighted());
        } else {
            bool = null;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("is_highlighted", bool);
        Aweme aweme5 = this.f94901f;
        if (aweme5 != null) {
            num = Integer.valueOf(aweme5.getOriginalPos());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("rank_index", num);
        Aweme aweme6 = this.f94901f;
        if (aweme6 == null || !aweme6.isCollected()) {
            c.a(a6, this.f94901f, this.f94902g);
        }
        r.a(str, a6.f66730a);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(this.f94901f)) {
            f fVar = this.f94898c;
            if (!(fVar instanceof Dialog)) {
                fVar = null;
            }
            Dialog dialog = (Dialog) fVar;
            if (dialog != null && (ownerActivity = dialog.getOwnerActivity()) != null) {
                new b(ownerActivity).e(R.string.og).b();
                return;
            }
            return;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, str4);
        if (!g2.isLogin()) {
            Aweme aweme7 = this.f94901f;
            if (!(aweme7 == null || (aid = aweme7.getAid()) == null)) {
                str4 = aid;
            }
            com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), this.f94902g, "click_favorite_video", new ap().a("group_id", str4).a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(str4)).f142646a, new a(this));
            return;
        }
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(com.ss.android.ugc.aweme.feed.ui.masklayer2.a aVar, f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94897b = aVar;
        this.f94898c = fVar;
    }
}
