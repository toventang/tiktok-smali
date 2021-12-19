package com.ss.android.ugc.aweme.comment.adapter;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.f.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.common.k.g;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.a.c;
import com.ss.android.ugc.aweme.comment.f.j;
import com.ss.android.ugc.aweme.comment.g.a;
import com.ss.android.ugc.aweme.comment.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommerceCommentStruct;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.ui.bq;
import com.ss.android.ugc.aweme.comment.ui.bu;
import com.ss.android.ugc.aweme.comment.util.f;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.emoji.utils.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.gq;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.Map;

public final class h extends RecyclerView.ViewHolder implements j {
    CommentBatchManagementViewModel A;
    u<Boolean> B;
    String C;
    String D;
    String E;
    boolean F;
    private i G;
    private bq H = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(43937);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            h.this.a(view, "click_comment_head");
        }
    };
    private bq I = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.h.AnonymousClass2 */

        static {
            Covode.recordClassIndex(43938);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            h.this.a(view, "click_name");
        }
    };
    private bq J = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.h.AnonymousClass3 */

        static {
            Covode.recordClassIndex(43939);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            h.this.a(view, "click_button");
        }
    };
    private bq K = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.h.AnonymousClass4 */

        static {
            Covode.recordClassIndex(43940);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            String str;
            Comment comment;
            if (h.this.y != null && h.this.x != null) {
                String str2 = "";
                if (view.getId() == R.id.f5q) {
                    if (h.this.y.getRelationLabel() != null) {
                        str2 = h.this.y.getRelationLabel().getUserId();
                    }
                    str = h.this.y.getUser().getSecUid();
                } else if (b.a((Collection) h.this.y.getReplyComments()) || (comment = h.this.y.getReplyComments().get(0)) == null) {
                    str = str2;
                } else {
                    if (comment.getRelationLabel() != null) {
                        str2 = comment.getRelationLabel().getUserId();
                    }
                    str = comment.getUser().getSecUid();
                }
                if (!TextUtils.isEmpty(str2)) {
                    h.this.x.a(str2, str);
                }
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    View f71374a = this.itemView.findViewById(R.id.ad9);

    /* renamed from: b  reason: collision with root package name */
    View f71375b = this.itemView.findViewById(R.id.c7o);

    /* renamed from: c  reason: collision with root package name */
    SmartCircleImageView f71376c = ((SmartCircleImageView) this.itemView.findViewById(R.id.or));

    /* renamed from: d  reason: collision with root package name */
    ImageView f71377d = ((ImageView) this.itemView.findViewById(R.id.byy));

    /* renamed from: e  reason: collision with root package name */
    View f71378e = this.itemView.findViewById(R.id.be6);

    /* renamed from: f  reason: collision with root package name */
    View f71379f = this.itemView.findViewById(R.id.c5g);

    /* renamed from: g  reason: collision with root package name */
    ImageView f71380g = ((ImageView) this.itemView.findViewById(R.id.bwd));

    /* renamed from: h  reason: collision with root package name */
    TextView f71381h = ((TextView) this.itemView.findViewById(R.id.eyo));

    /* renamed from: i  reason: collision with root package name */
    TextView f71382i = ((TextView) this.itemView.findViewById(R.id.title));

    /* renamed from: j  reason: collision with root package name */
    TuxTextView f71383j = ((TuxTextView) this.itemView.findViewById(R.id.aa6));

    /* renamed from: k  reason: collision with root package name */
    MentionTextView f71384k = ((MentionTextView) this.itemView.findViewById(R.id.adh));

    /* renamed from: l  reason: collision with root package name */
    TextView f71385l = ((TextView) this.itemView.findViewById(R.id.aah));

    /* renamed from: m  reason: collision with root package name */
    TextView f71386m = ((TextView) this.itemView.findViewById(R.id.f5q));
    CommentTranslationStatusView n = ((CommentTranslationStatusView) this.itemView.findViewById(R.id.eqo));
    TuxTextView o = ((TuxTextView) this.itemView.findViewById(R.id.d7x));
    TuxTextView p = ((TuxTextView) this.itemView.findViewById(R.id.c_y));
    protected ViewStub q = ((ViewStub) this.itemView.findViewById(R.id.ffu));
    protected RemoteImageView r;
    protected TextView s = ((TextView) this.itemView.findViewById(R.id.aam));
    TextView t = ((TextView) this.itemView.findViewById(R.id.aa0));
    View u = this.itemView.findViewById(R.id.dlb);
    ImageView v = ((ImageView) this.itemView.findViewById(R.id.c0e));
    TextView w = ((TextView) this.itemView.findViewById(R.id.f5w));
    public a x;
    public Comment y;
    com.ss.android.ugc.aweme.comment.widget.b z;

    static {
        Covode.recordClassIndex(43936);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.y.getAliasAweme() != null || !g()) {
            return false;
        }
        String cid = this.y.getCid();
        if (!TextUtils.isEmpty(cid)) {
            Map<String, Comment> map = this.A.f72895b;
            if (map.containsKey(this.y.getCid())) {
                d();
                map.remove(cid);
            } else {
                h();
                map.put(cid, this.y);
            }
            this.A.b().postValue(Integer.valueOf(map.size()));
        }
        return true;
    }

    private boolean g() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (!c.a() || (commentBatchManagementViewModel = this.A) == null || !commentBatchManagementViewModel.a().getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private void h() {
        this.f71377d.setSelected(true);
        View view = this.f71374a;
        view.setBackgroundColor(view.getResources().getColor(R.color.v));
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f71377d.setSelected(false);
        View view = this.f71374a;
        view.setBackgroundColor(view.getResources().getColor(R.color.r));
    }

    private void f() {
        MethodCollector.i(3309);
        if (this.q != null) {
            Aweme aliasAweme = this.y.getAliasAweme();
            if (aliasAweme != null) {
                if (this.r == null) {
                    this.r = (RemoteImageView) this.q.inflate();
                }
                this.r.setVisibility(0);
                a(aliasAweme.getVideo());
                MethodCollector.o(3309);
                return;
            }
            RemoteImageView remoteImageView = this.r;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(8);
            }
        }
        MethodCollector.o(3309);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.j
    public final void c() {
        getClass().getSimpleName();
        Comment comment = this.y;
        if (comment != null) {
            a(comment.isUserDigged(), this.y.getDiggCount(), false, this.y.isAuthorDigged());
        }
    }

    private void e() {
        boolean z2;
        if (m.a(this.y) || (com.ss.android.ugc.aweme.comment.a.a.c() && !this.F)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String a2 = f.a(this.y, !z2);
        if (!TextUtils.isEmpty(a2)) {
            this.f71384k.setText(a2);
            this.f71384k.setVisibility(0);
            com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f71384k);
        } else {
            this.f71384k.setVisibility(8);
        }
        l.d(this.y, "");
        MentionTextView mentionTextView = this.f71384k;
        mentionTextView.setSpanColor(mentionTextView.getResources().getColor(R.color.bx));
        this.f71384k.setSpanStyle(1);
        this.f71384k.setOnSpanClickListener(new p(this));
        MentionTextView mentionTextView2 = this.f71384k;
        mentionTextView2.a(f.a(this.y, mentionTextView2.getContext(), z2), new com.ss.android.ugc.aweme.shortvideo.view.f(), (MentionTextView.d) null);
        this.f71384k.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f71384k.getVisibility() == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f71384k.getText());
            this.f71384k.setText(spannableStringBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.j
    public final void b() {
        boolean z2;
        Comment comment = this.y;
        if (comment != null) {
            int i2 = 4;
            if (m.a(comment)) {
                TextView textView = this.s;
                if (textView != null) {
                    o.b(false, textView, this.t);
                }
                if (this.y.getAliasAweme() == null) {
                    this.f71381h.setVisibility(4);
                    this.f71379f.setVisibility(4);
                    this.f71380g.setVisibility(4);
                }
            } else {
                if (this.s != null) {
                    if (!com.ss.android.ugc.aweme.comment.a.a.c()) {
                        this.s.setVisibility(8);
                    } else if (this.F) {
                        o.b(false, this.s, this.t);
                    } else {
                        if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
                            TextView textView2 = this.s;
                            aa.a aVar = aa.s;
                            textView2.setText(aa.a.a(((long) this.y.getCreateTime()) * 1000));
                        } else {
                            this.s.setText(ib.a(this.itemView.getContext(), ((long) this.y.getCreateTime()) * 1000));
                        }
                        o.b(true, this.s);
                        if (this.y.getAliasAweme() == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o.b(z2, this.t);
                    }
                }
                if (this.y.getAliasAweme() == null) {
                    TextView textView3 = this.f71381h;
                    if (this.y.getDiggCount() != 0) {
                        i2 = 0;
                    }
                    textView3.setVisibility(i2);
                    this.f71379f.setVisibility(0);
                    this.f71380g.setVisibility(0);
                }
            }
            m.a(this.y, this.o);
            e();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.j
    public final void a(String str) {
        this.C = str;
    }

    private void a(Video video) {
        if (this.r != null && video != null && video.getCover() != null && !b.a((Collection) video.getCover().getUrlList())) {
            UrlModel cover = video.getCover();
            if (this.G == null) {
                this.G = new i() {
                    /* class com.ss.android.ugc.aweme.comment.adapter.h.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(43941);
                    }

                    @Override // com.ss.android.ugc.aweme.emoji.utils.i
                    public final void b() {
                    }

                    @Override // com.ss.android.ugc.aweme.emoji.utils.i
                    public final void a() {
                        h.this.r.setBackgroundResource(R.color.f159926j);
                        ((com.facebook.drawee.f.a) h.this.r.getHierarchy()).a(q.b.f47441g);
                        RemoteImageView remoteImageView = h.this.r;
                        e b2 = com.facebook.drawee.a.a.c.b();
                        b2.f47325m = h.this.r.getController();
                        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(g.a(2131231221));
                        a2.f48449f = new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.ARGB_8888).a();
                        b2.f47315c = (REQUEST) a2.a();
                        remoteImageView.setController(b2.e());
                    }
                };
            }
            com.ss.android.ugc.aweme.emoji.utils.h.a(this.r, cover, this.G);
        }
    }

    public final void a(View view) {
        int i2;
        int id = view.getId();
        if (id == R.id.c5g) {
            if (!m.a(this.y) && this.y.getCid() != null && this.f71379f.getVisibility() == 0) {
                if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), this.C, "like_comment", new ap().a("group_id", this.D).a("log_pb", ac.c(this.D)).f142646a);
                    return;
                }
                Comment comment = this.y;
                if (comment != null && this.x != null) {
                    if (com.ss.android.ugc.aweme.comment.h.a.a(comment)) {
                        boolean z2 = !this.y.isUserDigged();
                        boolean isAuthorDigged = this.y.isAuthorDigged();
                        if (TextUtils.equals(this.E, com.ss.android.ugc.aweme.account.b.g().getCurUserId()) && !TextUtils.equals(this.E, Comment.getAuthorUid(this.y))) {
                            if (z2) {
                                com.ss.android.ugc.aweme.comment.m.b.b(this.C, this.D, this.E, this.y.getCid());
                            }
                            isAuthorDigged = z2;
                        }
                        int diggCount = this.y.getDiggCount();
                        if (z2) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        a(z2, diggCount + i2, true, isAuthorDigged);
                    }
                    a aVar = this.x;
                    Comment comment2 = this.y;
                    getAdapterPosition();
                    aVar.c(comment2);
                }
            }
        } else if (id == R.id.f5w && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && !TextUtils.isEmpty(this.y.getReplyToUserId()) && this.x != null && com.bytedance.ies.ugc.appcontext.f.j() != null) {
            SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.f.j(), "aweme://user/profile/").withParam("uid", this.y.getReplyToUserId()).open();
            a(this.y.getReplyToUserId(), "click_name");
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.j
    public final void a(Comment comment) {
        User curUser;
        v vVar;
        if (comment != null) {
            this.f71375b.setBackgroundResource(R.drawable.lf);
            this.y = comment;
            this.z.a(this.f71384k.getContext(), comment, new bu(this.f71384k.getContext(), this.f71384k), new bu(this.f71384k.getContext(), null), this.n);
            b();
            User user = this.y.getUser();
            if (comment.getCommerceInfo() == null) {
                int a2 = n.a(24.0d);
                if (user != null) {
                    UrlModel avatarThumb = user.getAvatarThumb();
                    if (d.a().f71354c) {
                        curUser = in.c();
                    } else {
                        com.ss.android.ugc.aweme.account.b.a();
                        curUser = com.ss.android.ugc.aweme.account.b.f62864a.e().getCurUser();
                    }
                    if (!(curUser == null || curUser.getUid() == null || !curUser.getUid().equals(user.getUid()))) {
                        avatarThumb = curUser.getAvatarThumb();
                    }
                    if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                        vVar = r.a(2131232324);
                    } else {
                        vVar = r.a(com.ss.android.ugc.aweme.base.v.a(avatarThumb));
                    }
                    d.a();
                    v a3 = vVar.b(em.a(100)).a(a2, a2);
                    a3.K = true;
                    v a4 = a3.a("CommentViewHolder");
                    a4.E = this.f71376c;
                    a4.c();
                    if (!d.a().f71352a || TextUtils.isEmpty(user.getUserDisplayName())) {
                        this.f71382i.setText(in.a(user, false));
                    } else {
                        this.f71382i.setText(user.getUserDisplayName());
                    }
                }
            } else {
                CommerceCommentStruct commerceInfo = comment.getCommerceInfo();
                int a5 = n.a(24.0d);
                v a6 = r.a(commerceInfo.getAvartalUrl()).b(em.a(100)).a(a5, a5);
                a6.K = true;
                v a7 = a6.a("CommentViewHolder");
                a7.E = this.f71376c;
                a7.c();
                this.f71382i.setText(commerceInfo.getNickName());
            }
            if (TextUtils.isEmpty(this.y.getReplyToUserName()) || TextUtils.equals("0", this.y.getReplyToReplyCommentId()) || !com.ss.android.ugc.aweme.comment.a.a.b()) {
                com.ss.android.ugc.aweme.comment.util.b.b(comment, this.f71383j);
                com.ss.android.ugc.aweme.comment.util.b.a(comment, this.f71385l);
                com.ss.android.ugc.aweme.comment.util.m.a(this.f71386m, comment.getRelationLabel());
                o.b(false, this.v, this.w);
            } else {
                this.w.setText(this.y.getReplyToUserName());
                o.b(true, this.v, this.w);
                o.b(false, this.f71383j, this.f71385l, this.f71386m);
                if (this.f71374a != null) {
                    this.u.post(new o(this));
                }
            }
            if (com.ss.android.ugc.aweme.comment.a.f.a()) {
                this.f71381h.setText(com.ss.android.ugc.aweme.i18n.b.a((long) comment.getDiggCount()));
                a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
                f();
            } else if (this.y.getAliasAweme() == null) {
                this.f71381h.setText(com.ss.android.ugc.aweme.i18n.b.a((long) comment.getDiggCount()));
                a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
                RemoteImageView remoteImageView = this.r;
                if (remoteImageView != null && remoteImageView.getVisibility() == 0) {
                    this.r.setVisibility(8);
                }
            } else {
                this.f71380g.setVisibility(8);
                this.f71381h.setVisibility(8);
                this.p.setVisibility(8);
                f();
            }
            if (g() && this.y.getAliasAweme() != null) {
                if (this.A.f72895b.containsKey(this.y.getCid())) {
                    h();
                } else {
                    d();
                }
            }
        }
    }

    public final void a(View view, String str) {
        a aVar;
        if (this.y != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            if (!TextUtils.equals(str, "click_button")) {
                User user = this.y.getUser();
                if (user == null) {
                    return;
                }
                if (user.isAdFake()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.of).a();
                } else if (!TextUtils.isEmpty(user.getUid()) && (aVar = this.x) != null) {
                    aVar.a(user.getUid(), user.getSecUid(), str);
                }
            } else if (!a()) {
                this.x.b(this.y);
            }
        }
    }

    public h(ViewGroup viewGroup, a aVar) {
        super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.it, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.c5g);
        if (findViewById != null) {
            findViewById.setOnClickListener(new i(this));
        }
        View findViewById2 = this.itemView.findViewById(R.id.f5w);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new j(this));
        }
        this.x = aVar;
        this.itemView.setOnClickListener(new k(this));
        this.itemView.setOnLongClickListener(new l(this));
        TuxTextView tuxTextView = this.o;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(new c.a());
            this.o.setOnClickListener(new m(this));
        }
        this.f71376c.setOnTouchListener(this.H);
        this.f71382i.setOnTouchListener(this.I);
        this.t.setOnTouchListener(this.J);
        this.f71386m.setOnTouchListener(this.K);
        this.z = new com.ss.android.ugc.aweme.comment.widget.b(this.f71384k.getContext());
        gq.a(this.f71384k);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f71384k.setBreakStrategy(0);
        }
        this.f71384k.setLineSpacing(com.bytedance.common.utility.n.b(d.a(), 3.0f), 1.0f);
        if (com.ss.android.ugc.aweme.comment.a.c.a()) {
            this.A = CommentBatchManagementViewModel.a.a((androidx.fragment.app.e) this.itemView.getContext());
            this.B = new n(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.C).a("to_user_id", str).a("group_id", this.D).a("author_id", this.E).a("enter_method", str2).a("self_click", str.equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId()) ? 1 : 0).f66730a);
    }

    private void a(boolean z2, int i2, boolean z3, boolean z4) {
        int i3;
        boolean z5;
        int i4;
        getClass().getSimpleName();
        if (this.p != null) {
            if (!z4 || TextUtils.equals(this.E, Comment.getAuthorUid(this.y))) {
                z5 = false;
            } else {
                z5 = true;
            }
            TuxTextView tuxTextView = this.p;
            if (z5) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            tuxTextView.setVisibility(i4);
        }
        if (z3) {
            this.f71380g.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                /* class com.ss.android.ugc.aweme.comment.adapter.h.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(43942);
                }

                public final void run() {
                    h.this.f71380g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.f71381h.setText(com.ss.android.ugc.aweme.i18n.b.a((long) i2));
        TextView textView = this.f71381h;
        if (i2 == 0) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        textView.setVisibility(i3);
        if (z2) {
            this.f71380g.setSelected(true);
            ImageView imageView = this.f71380g;
            imageView.setImageDrawable(imageView.getResources().getDrawable(2131232227));
            TextView textView2 = this.f71381h;
            textView2.setTextColor(textView2.getResources().getColor(R.color.bh));
            return;
        }
        this.f71380g.setSelected(false);
        ImageView imageView2 = this.f71380g;
        imageView2.setImageDrawable(imageView2.getResources().getDrawable(2131232228));
        TextView textView3 = this.f71381h;
        textView3.setTextColor(textView3.getResources().getColor(R.color.c5));
    }
}
