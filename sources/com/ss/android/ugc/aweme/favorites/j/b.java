package com.ss.android.ugc.aweme.favorites.j;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.ss.android.ugc.aweme.comment.c.m;
import com.ss.android.ugc.aweme.comment.f.k;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.util.l;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, u<m>, com.ss.android.ugc.aweme.comment.f.a, k, com.ss.android.ugc.aweme.comment.services.b, a.AbstractC2193a {

    /* renamed from: a  reason: collision with root package name */
    public Comment f90656a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f90657b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f90658c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.b f90659d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.g.b f90660e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.n.a f90661f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.favorites.a.b f90662g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.j.e f90663h;

    /* renamed from: i  reason: collision with root package name */
    public TuxButton f90664i;

    /* renamed from: j  reason: collision with root package name */
    public TuxButton f90665j;

    /* renamed from: k  reason: collision with root package name */
    public ConstraintLayout f90666k;

    /* renamed from: l  reason: collision with root package name */
    public RemoteImageView f90667l;

    /* renamed from: m  reason: collision with root package name */
    public SmartCircleImageView f90668m;
    public TuxTextView n;
    public TuxTextView o;
    public TuxTextView p;
    public CommentTranslationStatusView q;
    public final long r = 1000;
    private com.bytedance.tux.sheet.a.a s;

    static {
        Covode.recordClassIndex(56954);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(String str) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void g(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final String o() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void onEvent(com.ss.android.ugc.aweme.forward.a.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final int p() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final boolean q() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Comment n() {
        return this.f90656a;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.j.b$b  reason: collision with other inner class name */
    public static final class C2194b implements com.ss.android.ugc.aweme.comment.g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90672a;

        static {
            Covode.recordClassIndex(56956);
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void e() {
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void h() {
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void i() {
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void j() {
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void f() {
            this.f90672a.a();
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void g() {
            this.f90672a.b();
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void k() {
            Comment comment = this.f90672a.f90656a;
            if (comment != null) {
                this.f90672a.a(comment, 1);
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void l() {
            Comment comment = this.f90672a.f90656a;
            if (comment != null) {
                this.f90672a.a(comment, 0);
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void b() {
            com.ss.android.ugc.aweme.comment.j.c cVar;
            Comment comment = this.f90672a.f90656a;
            if (comment != null) {
                b bVar = this.f90672a;
                if (!bVar.d()) {
                    l.d(comment, "");
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "collection_comment");
                    String cid = comment.getCid();
                    if (cid == null) {
                        cid = "";
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("comment_id", cid);
                    String awemeId = comment.getAwemeId();
                    if (awemeId == null) {
                        awemeId = "";
                    }
                    r.a("delete_comment", a3.a("group_id", awemeId).a("is_video", "0").f66730a);
                    com.ss.android.ugc.aweme.comment.j.e eVar = bVar.f90663h;
                    if (!(eVar == null || (cVar = (com.ss.android.ugc.aweme.comment.j.c) eVar.f76396h) == null)) {
                        cVar.f72024d = new com.ss.android.ugc.aweme.comment.i.g(false, false, comment);
                    }
                    com.ss.android.ugc.aweme.comment.j.e eVar2 = bVar.f90663h;
                    if (eVar2 != null) {
                        String cid2 = comment.getCid();
                        String awemeId2 = comment.getAwemeId();
                        int a4 = com.ss.android.ugc.aweme.app.c.c.a("");
                        ((com.ss.android.ugc.aweme.comment.j.c) eVar2.f76396h).f72023c = awemeId2;
                        eVar2.a(cid2, Integer.valueOf(a4), 0);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void c() {
            Comment comment;
            String str;
            String str2;
            User author;
            Activity activity = this.f90672a.f90657b;
            if (activity != null && (comment = this.f90672a.f90656a) != null) {
                l.d(comment, "");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                if (g2 != null) {
                    str = g2.getCurUserId();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "collection_comment").a("enter_method", "click_report_button");
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
                    str2 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
                String awemeId = comment.getAwemeId();
                if (awemeId == null) {
                    awemeId = "";
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", awemeId);
                String cid = comment.getCid();
                if (cid == null) {
                    cid = "";
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("comment_id", cid);
                if (str == null) {
                    str = "";
                }
                r.a("report_comment", a5.a("user_id", str).a("is_video", "0").f66730a);
                User user = comment.getUser();
                l.b(user, "");
                l.a.a(activity, comment, user.getUid(), n.b(activity));
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void d() {
            String str;
            String str2;
            String uid;
            User author;
            Comment comment = this.f90672a.f90656a;
            if (comment != null) {
                b bVar = this.f90672a;
                String str3 = "";
                h.f.b.l.d(comment, str3);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                if (g2 != null) {
                    str = g2.getCurUserId();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
                    str2 = str3;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("author_id", str2).a("enter_from", "collection_comment");
                String awemeId = comment.getAwemeId();
                if (awemeId == null) {
                    awemeId = str3;
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", awemeId);
                String cid = comment.getCid();
                if (cid == null) {
                    cid = str3;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("comment_id", cid);
                if (str == null) {
                    str = str3;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("user_id", str);
                User user = comment.getUser();
                if (!(user == null || (uid = user.getUid()) == null)) {
                    str3 = uid;
                }
                r.a("copy_comment", a5.a("to_user_id", str3).f66730a);
                if (bVar.f90659d != null) {
                    com.ss.android.ugc.aweme.comment.b.a(comment);
                }
                bVar.a(R.string.bsk, 0);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C2194b(b bVar) {
            this.f90672a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.comment.g.b
        public final void a(CommentVideoModel.Type type) {
            com.ss.android.ugc.aweme.comment.b bVar;
            com.ss.android.ugc.aweme.comment.b bVar2 = this.f90672a.f90659d;
            if (bVar2 != null && bVar2.u && type == CommentVideoModel.Type.COMMENT && (bVar = this.f90672a.f90659d) != null) {
                bVar.a("comment_press", type);
            }
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.k
    public final void b() {
        com.ss.android.ugc.aweme.comment.n.a aVar;
        Comment comment = this.f90656a;
        if (comment != null && (aVar = this.f90661f) != null) {
            aVar.a(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.i.a.AbstractC2193a
    public final void c() {
        Comment comment = this.f90656a;
        if (comment != null) {
            com.ss.android.ugc.aweme.favorites.i.a.b(comment.getCid());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Aweme m() {
        Comment comment = this.f90656a;
        if (comment != null) {
            return comment.getAliasAweme();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.f90657b == null) {
            return true;
        }
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = e();
        }
        if (j.f107229h) {
            return false;
        }
        a(R.string.de8, 0);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.k
    public final void a() {
        String str;
        String str2;
        com.ss.android.ugc.aweme.comment.n.a aVar;
        User author;
        Comment comment = this.f90656a;
        if (comment != null) {
            String str3 = "";
            h.f.b.l.d(comment, str3);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (g2 != null) {
                str = g2.getCurUserId();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Aweme aliasAweme = comment.getAliasAweme();
            if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
                str2 = str3;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("author_id", str2).a("enter_from", "collection_comment");
            String cid = comment.getCid();
            if (cid == null) {
                cid = str3;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("comment_id", cid);
            if (str == null) {
                str = str3;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("user_id", str);
            String awemeId = comment.getAwemeId();
            if (awemeId != null) {
                str3 = awemeId;
            }
            r.a("translate_comment", a4.a("group_id", str3).f66730a);
            com.ss.android.ugc.aweme.comment.n.b a5 = com.ss.android.ugc.aweme.comment.widget.b.a(comment, SettingServiceImpl.v().h());
            if (a5 != null && (aVar = this.f90661f) != null) {
                aVar.a(comment, a5, this.q);
            }
        }
    }

    static final class c implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90673a;

        static {
            Covode.recordClassIndex(56957);
        }

        c(b bVar) {
            this.f90673a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            com.ss.android.ugc.aweme.comment.g.b bVar = this.f90673a.f90660e;
            if (bVar != null) {
                bVar.e();
            }
        }
    }

    static final class e implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90676a;

        static {
            Covode.recordClassIndex(56959);
        }

        e(b bVar) {
            this.f90676a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            com.ss.android.ugc.aweme.comment.g.b bVar = this.f90676a.f90660e;
            if (bVar != null) {
                bVar.e();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.a
    public final void d(Exception exc) {
        Activity activity = this.f90657b;
        if (activity != null) {
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) activity, (Throwable) exc, (int) R.string.g4j);
        }
    }

    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90678a;

        static {
            Covode.recordClassIndex(56961);
        }

        public g(b bVar) {
            this.f90678a = bVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.comment.b bVar;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.comment.b bVar2 = this.f90678a.f90659d;
            if (bVar2 != null && bVar2.u && (bVar = this.f90678a.f90659d) != null) {
                bVar.a("collection_reply_button", CommentVideoModel.Type.COMMENT);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(Comment comment) {
        a(R.string.bsl, 2131232033);
    }

    /* access modifiers changed from: package-private */
    public static final class a<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comment f90670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f90671c;

        static {
            Covode.recordClassIndex(56955);
        }

        a(b bVar, Comment comment, int i2) {
            this.f90669a = bVar;
            this.f90670b = comment;
            this.f90671c = i2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            h.f.b.l.d(iVar, "");
            if (!iVar.c() && !iVar.b()) {
                com.ss.android.ugc.aweme.favorites.a.b bVar = this.f90669a.f90662g;
                if (bVar != null) {
                    bVar.a(this.f90670b);
                }
                if (this.f90671c == 1) {
                    this.f90670b.setCollectStatus(1);
                } else {
                    this.f90670b.setCollectStatus(0);
                }
                ICommentFavoriteService a2 = CommentFavoriteServiceImpl.a();
                String cid = this.f90670b.getCid();
                h.f.b.l.b(cid, "");
                a2.a(cid, this.f90671c);
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(m mVar) {
        Activity activity;
        m mVar2 = mVar;
        if (mVar2 != null && mVar2.f71770a != null && (activity = this.f90657b) != null && !activity.isFinishing()) {
            if (mVar2.f71771b) {
                Comment comment = mVar2.f71770a;
                h.f.b.l.b(comment, "");
                this.q.setLoading(false);
                Comment comment2 = this.f90656a;
                if (comment2 != null) {
                    comment2.setTranslated(comment.isTranslated());
                }
                this.o.setText(comment.getText());
                return;
            }
            this.q.setLoading(false);
            Activity activity2 = this.f90657b;
            if (activity2 != null) {
                com.ss.android.ugc.aweme.app.api.b.a.a((Context) activity2, (Throwable) mVar2.f71772c, (int) R.string.g4j);
            }
        }
    }

    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90677a;

        static {
            Covode.recordClassIndex(56960);
        }

        public f(b bVar) {
            this.f90677a = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            User author;
            User author2;
            User author3;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.comment.b bVar = this.f90677a.f90659d;
            if (bVar != null && bVar.u) {
                Comment comment = this.f90677a.f90656a;
                User user = null;
                if (comment != null) {
                    String str4 = "";
                    h.f.b.l.d(comment, str4);
                    Aweme aliasAweme = comment.getAliasAweme();
                    if (aliasAweme == null || (author3 = aliasAweme.getAuthor()) == null) {
                        str = null;
                    } else {
                        str = author3.getUid();
                    }
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, str4);
                    int i2 = 1 ^ (h.f.b.l.a(str, g2.getCurUserId()) ? 1 : 0);
                    String awemeId = comment.getAwemeId();
                    if (awemeId == null) {
                        awemeId = str4;
                    }
                    Aweme aliasAweme2 = comment.getAliasAweme();
                    if (aliasAweme2 == null || (author2 = aliasAweme2.getAuthor()) == null || (str2 = author2.getUid()) == null) {
                        str2 = str4;
                    }
                    com.ss.android.ugc.aweme.comment.m.c.a("collection_reply_button", "collection_comment", awemeId, str2, i2);
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    Aweme aliasAweme3 = comment.getAliasAweme();
                    if (aliasAweme3 == null || (author = aliasAweme3.getAuthor()) == null || (str3 = author.getUid()) == null) {
                        str3 = str4;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("author_id", str3).a("enter_from", "collection_comment").a("enter_method", "collection_reply_button");
                    String awemeId2 = comment.getAwemeId();
                    if (awemeId2 != null) {
                        str4 = awemeId2;
                    }
                    r.a("enter_text", a2.a("group_id", str4).a("comment_category", "reply").f66730a);
                }
                com.ss.android.ugc.aweme.comment.b bVar2 = this.f90677a.f90659d;
                if (bVar2 != null) {
                    Comment comment2 = this.f90677a.f90656a;
                    if (comment2 != null) {
                        user = comment2.getUser();
                    }
                    bVar2.a(user, "collection_comment");
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.dzp);
        h.f.b.l.b(findViewById, "");
        this.f90664i = (TuxButton) findViewById;
        View findViewById2 = view.findViewById(R.id.dzq);
        h.f.b.l.b(findViewById2, "");
        this.f90665j = (TuxButton) findViewById2;
        View findViewById3 = view.findViewById(R.id.dzo);
        h.f.b.l.b(findViewById3, "");
        this.f90666k = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.dzy);
        h.f.b.l.b(findViewById4, "");
        this.f90667l = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dzn);
        h.f.b.l.b(findViewById5, "");
        this.f90668m = (SmartCircleImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dzt);
        h.f.b.l.b(findViewById6, "");
        this.n = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.dzs);
        h.f.b.l.b(findViewById7, "");
        this.o = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.dzr);
        h.f.b.l.b(findViewById8, "");
        this.p = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.eqo);
        h.f.b.l.b(findViewById9, "");
        this.q = (CommentTranslationStatusView) findViewById9;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        Aweme aliasAweme;
        String cid;
        ClickAgent.onClick(view);
        String str3 = "";
        h.f.b.l.d(view, str3);
        Comment comment = this.f90656a;
        if (comment != null) {
            h.f.b.l.d(comment, str3);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "collection_comment");
            String awemeId = comment.getAwemeId();
            if (awemeId == null) {
                awemeId = str3;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", awemeId);
            String cid2 = comment.getCid();
            if (cid2 == null) {
                cid2 = str3;
            }
            r.a("enter_comment_list", a3.a("trigger_comment_id", cid2).f66730a);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f90657b, "aweme://aweme/detail/");
        Comment comment2 = this.f90656a;
        if (comment2 == null || (str = comment2.getAwemeId()) == null) {
            str = str3;
        }
        SmartRoute withParam = buildRoute.withParam("id", str).withParam("refer", "collection_comment");
        Comment comment3 = this.f90656a;
        if (!(comment3 == null || (cid = comment3.getCid()) == null)) {
            str3 = cid;
        }
        SmartRoute withParam2 = withParam.withParam("cid", str3).withParam("video_from", "collection_comment");
        Comment comment4 = this.f90656a;
        if (comment4 == null || (aliasAweme = comment4.getAliasAweme()) == null) {
            str2 = null;
        } else {
            str2 = aliasAweme.getAid();
        }
        withParam2.withParam("last_group_id", str2).open();
    }

    public final boolean onLongClick(View view) {
        Comment comment;
        String text;
        a.d a2;
        if (!(view == null || this.f90657b == null || this.f90660e == null || this.f90659d == null || (comment = this.f90656a) == null)) {
            String authorUid = Comment.getAuthorUid(comment);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            boolean equals = TextUtils.equals(authorUid, g2.getCurUserId());
            ArrayList<String> arrayList = new ArrayList();
            Activity activity = this.f90657b;
            if (activity != null) {
                String string = activity.getString(R.string.am6);
                h.f.b.l.b(string, "");
                arrayList.add(string);
                String string2 = activity.getString(R.string.bsi);
                h.f.b.l.b(string2, "");
                arrayList.add(string2);
                String string3 = activity.getString(R.string.aui);
                h.f.b.l.b(string3, "");
                arrayList.add(string3);
                if (!equals) {
                    Comment comment2 = this.f90656a;
                    if (comment2 == null || !comment2.isTranslated()) {
                        String string4 = activity.getString(R.string.amo);
                        h.f.b.l.b(string4, "");
                        arrayList.add(string4);
                    } else {
                        String string5 = activity.getString(R.string.am7);
                        h.f.b.l.b(string5, "");
                        arrayList.add(string5);
                    }
                }
                String string6 = activity.getString(R.string.fcr);
                h.f.b.l.b(string6, "");
                arrayList.add(string6);
                if (equals) {
                    String string7 = activity.getString(R.string.b5g);
                    h.f.b.l.b(string7, "");
                    arrayList.add(string7);
                }
            }
            androidx.fragment.app.e eVar = null;
            androidx.fragment.app.i iVar = null;
            if (com.ss.android.ugc.aweme.comment.d.a.c()) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    com.ss.android.ugc.aweme.comment.b bVar = this.f90659d;
                    if (!(bVar == null || (a2 = bVar.a(this.f90660e, str, this.f90656a)) == null)) {
                        arrayList2.add(a2);
                    }
                }
                Comment comment3 = this.f90656a;
                String a3 = in.a(comment3 != null ? comment3.getUser() : null, false);
                Comment comment4 = this.f90656a;
                if (!(comment4 == null || (text = comment4.getText()) == null || text.length() <= 0)) {
                    StringBuilder append = new StringBuilder().append(a3).append(": ");
                    Comment comment5 = this.f90656a;
                    a3 = append.append(comment5 != null ? comment5.getText() : null).toString();
                }
                a.b bVar2 = new a.b();
                h.f.b.l.b(a3, "");
                this.s = bVar2.a(a3).a().a(arrayList2).a(new c(this)).b("").b();
                if (!(!arrayList2.isEmpty())) {
                    return false;
                }
                Comment comment6 = this.f90656a;
                if (comment6 != null) {
                    com.ss.android.ugc.aweme.favorites.h.a.a(comment6);
                }
                com.bytedance.tux.sheet.a.a aVar = this.s;
                if (aVar != null) {
                    Fragment fragment = this.f90658c;
                    if (fragment != null) {
                        iVar = fragment.getFragmentManager();
                    }
                    aVar.show(iVar, "CommentCollectViewHolder");
                }
                return true;
            }
            Fragment fragment2 = this.f90658c;
            if (fragment2 != null) {
                eVar = fragment2.getActivity();
            }
            com.ss.android.ugc.aweme.common.f.a aVar2 = new com.ss.android.ugc.aweme.common.f.a(eVar);
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            aVar2.a((CharSequence[]) array, new d(this, arrayList));
            aVar2.a(new e(this));
            if (!arrayList.isEmpty()) {
                Comment comment7 = this.f90656a;
                if (comment7 != null) {
                    com.ss.android.ugc.aweme.favorites.h.a.a(comment7);
                }
                aVar2.f76416a.b();
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.a
    public final void a(String str, com.ss.android.ugc.aweme.comment.i.g gVar) {
        com.ss.android.ugc.aweme.favorites.a.b bVar;
        Comment comment = this.f90656a;
        if (comment != null && (bVar = this.f90662g) != null) {
            bVar.a(comment);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        Activity activity = this.f90657b;
        if (activity == null) {
            return;
        }
        if (i3 != 0) {
            new com.bytedance.tux.g.b(activity).a(activity.getString(i2)).b(i3).b();
        } else {
            new com.bytedance.tux.g.b(activity).a(activity.getString(i2)).b();
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f90675b;

        static {
            Covode.recordClassIndex(56958);
        }

        d(b bVar, List list) {
            this.f90674a = bVar;
            this.f90675b = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0150, code lost:
            if (android.text.TextUtils.equals(r2, r0) != false) goto L_0x0152;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r5, int r6) {
            /*
            // Method dump skipped, instructions count: 393
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.j.b.d.onClick(android.content.DialogInterface, int):void");
        }
    }

    public final void a(Comment comment, int i2) {
        if (!d()) {
            com.ss.android.ugc.aweme.comment.m.c.a("collection_comment", i2, comment);
            i<BaseResponse> collectComment = UserFavoritesApi.f90439a.collectComment(comment.getCid(), i2);
            if (collectComment != null) {
                collectComment.a(new a(this, comment, i2), i.f4826c, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(Exception exc, int i2, Comment comment) {
        a(R.string.fcn, 0);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(int i2, int i3, String str, String str2, boolean z) {
        Aweme aliasAweme;
        String cid;
        String str3 = str;
        Comment comment = this.f90656a;
        if (comment != null && (aliasAweme = comment.getAliasAweme()) != null) {
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            String a2 = com.ss.android.ugc.aweme.comment.m.b.a(this.f90656a);
            h.f.b.l.b(a2, str4);
            Comment comment2 = this.f90656a;
            if (!(comment2 == null || (cid = comment2.getCid()) == null)) {
                str4 = cid;
            }
            com.ss.android.ugc.aweme.comment.m.c.a(aliasAweme, str3, "collection_comment", a2, str4, this.f90656a, "list", String.valueOf(i3), 0, "collection_text_panel", null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, 0, "collection_text", null, null, null, null, null, null, null, null, null, null, -134218496, 63);
        }
    }
}
