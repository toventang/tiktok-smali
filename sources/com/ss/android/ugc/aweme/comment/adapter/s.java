package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.a.c;
import com.ss.android.ugc.aweme.comment.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommerceCommentStruct;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.ui.bq;
import com.ss.android.ugc.aweme.comment.ui.bu;
import com.ss.android.ugc.aweme.comment.util.f;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.comment.widget.a;
import com.ss.android.ugc.aweme.comment.widget.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.gq;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public class s extends RecyclerView.ViewHolder {
    View A;
    protected TextView B;
    protected com.ss.android.ugc.aweme.comment.g.a C;
    private bq D = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.s.AnonymousClass1 */

        static {
            Covode.recordClassIndex(43955);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            s.this.a(view, "click_comment_head");
        }
    };
    private bq E = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.s.AnonymousClass2 */

        static {
            Covode.recordClassIndex(43956);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            s.this.a(view, "click_name");
        }
    };
    private bq F = new bq() {
        /* class com.ss.android.ugc.aweme.comment.adapter.s.AnonymousClass3 */

        static {
            Covode.recordClassIndex(43957);
        }

        @Override // com.ss.android.ugc.aweme.comment.ui.bq
        public final void a(View view) {
            s.this.a(view, "click_button");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Comment f71415a;

    /* renamed from: b  reason: collision with root package name */
    View f71416b;

    /* renamed from: c  reason: collision with root package name */
    SmartAvatarImageView f71417c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f71418d;

    /* renamed from: e  reason: collision with root package name */
    TuxTextView f71419e;

    /* renamed from: f  reason: collision with root package name */
    protected MentionTextView f71420f;

    /* renamed from: g  reason: collision with root package name */
    public View f71421g;

    /* renamed from: h  reason: collision with root package name */
    TuxTextView f71422h;

    /* renamed from: i  reason: collision with root package name */
    protected MentionTextView f71423i;

    /* renamed from: j  reason: collision with root package name */
    ImageView f71424j;

    /* renamed from: k  reason: collision with root package name */
    protected View f71425k;

    /* renamed from: l  reason: collision with root package name */
    CommentTranslationStatusView f71426l;

    /* renamed from: m  reason: collision with root package name */
    TextView f71427m;
    ImageView n;
    View o;
    int p;
    protected String q;
    protected String r;
    protected String s;
    protected boolean t;
    protected int u;
    protected b v;
    protected com.ss.android.ugc.aweme.comment.widget.a w;
    protected boolean x = true;
    protected CommentBatchManagementViewModel y;
    protected u<Boolean> z;

    static {
        Covode.recordClassIndex(43954);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public void b() {
        c();
    }

    private boolean h() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (!c.a() || (commentBatchManagementViewModel = this.y) == null || !commentBatchManagementViewModel.a().getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private void i() {
        this.f71418d.setSelected(true);
        View view = this.A;
        view.setBackgroundColor(view.getResources().getColor(R.color.v));
    }

    private void j() {
        this.f71418d.setSelected(false);
        View view = this.A;
        view.setBackgroundColor(view.getResources().getColor(R.color.r));
    }

    public final void e() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if ((this.itemView.getContext() instanceof e) && c.a() && (commentBatchManagementViewModel = this.y) != null) {
            commentBatchManagementViewModel.a().removeObserver(this.z);
        }
    }

    public final void d() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if ((this.itemView.getContext() instanceof e) && c.a() && (commentBatchManagementViewModel = this.y) != null) {
            commentBatchManagementViewModel.a().observe((d) this.itemView.getContext(), this.z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        Comment comment;
        if (this.C != null && (comment = this.f71415a) != null && comment.getUser() != null && this.f71415a.getCid() != null && !g()) {
            this.C.a(this.v, this.f71415a);
        }
    }

    private boolean g() {
        if (!h()) {
            return false;
        }
        String cid = this.f71415a.getCid();
        if (TextUtils.isEmpty(cid)) {
            return true;
        }
        Map<String, Comment> map = this.y.f72895b;
        if (map.containsKey(this.f71415a.getCid())) {
            j();
            map.remove(cid);
        } else {
            i();
            map.put(cid, this.f71415a);
        }
        this.y.b().postValue(Integer.valueOf(map.size()));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        boolean z2;
        if (m.a(this.f71415a) || (com.ss.android.ugc.aweme.comment.a.a.c() && !this.t)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String a2 = f.a(this.f71415a, !z2);
        if (!TextUtils.isEmpty(a2)) {
            this.f71420f.setText(a2);
            this.f71420f.setVisibility(0);
            com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f71420f);
        } else {
            this.f71420f.setVisibility(8);
        }
        l.d(this.f71415a, "");
        MentionTextView mentionTextView = this.f71420f;
        mentionTextView.setSpanColor(mentionTextView.getResources().getColor(R.color.bx));
        this.f71420f.setSpanStyle(1);
        this.f71420f.setOnSpanClickListener(new v(this));
        this.f71420f.a(f.a(this.f71415a, this.f71420f.getContext(), z2), new com.ss.android.ugc.aweme.shortvideo.view.f(), (MentionTextView.d) null);
        this.f71420f.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f71420f.getVisibility() == 0) {
            a.C0730a aVar = new a.C0730a();
            aVar.a(this.f71420f.getText());
            this.f71420f.setText(aVar.f33382a);
        }
    }

    public final void c(String str) {
        this.s = str;
    }

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener, View.OnLongClickListener {
        static {
            Covode.recordClassIndex(43958);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (s.this.C != null && s.this.f71415a != null) {
                s.this.C.a(s.this.v, s.this.f71415a);
            }
        }

        public final boolean onLongClick(View view) {
            if (s.this.C == null || s.this.f71415a == null) {
                return true;
            }
            s.this.C.a(s.this.v, s.this.f71415a, s.this.w);
            return true;
        }
    }

    public final void a(int i2) {
        this.u = i2;
    }

    public final void b(String str) {
        this.r = str;
    }

    public void a(String str) {
        this.q = str;
    }

    public final void b(boolean z2) {
        this.t = z2;
    }

    public final void a(boolean z2) {
        this.x = z2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct.getUserId().equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
            r.a("self_mention_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.q).f66730a);
        }
        if (com.bytedance.ies.ugc.appcontext.f.j() != null) {
            SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.f.j(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("extra_from_pre_page", "notification_page").withParam("sec_uid", textExtraStruct.getSecUid()).open();
        }
        this.f71420f.getContext();
        r.a(StringSet.name, "comment_at", textExtraStruct.getUserId(), 0);
        r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.q).a("to_user_id", textExtraStruct.getUserId()).a("group_id", this.r).a("author_id", this.s).a("enter_method", "comment_at").a("self_click", textExtraStruct.getUserId().equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId()) ? 1 : 0).f66730a);
        com.ss.android.ugc.aweme.feed.s.a(af.PROFILE);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view, Boolean bool) {
        int i2;
        float f2;
        ImageView imageView = this.f71418d;
        if (imageView != null) {
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            MentionTextView mentionTextView = this.f71420f;
            Context context = view.getContext();
            if (bool.booleanValue()) {
                f2 = 16.0f;
            } else {
                f2 = 0.0f;
            }
            mentionTextView.setPadding(0, 0, (int) n.b(context, f2), 0);
            if (bool.booleanValue()) {
                o.b(false, this.n, this.o, this.f71427m);
                return;
            }
            o.b(true, this.n, this.o, this.f71427m);
            j();
        }
    }

    public final void a(View view, String str) {
        com.ss.android.ugc.aweme.comment.g.a aVar;
        if (this.f71415a != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            if (!TextUtils.equals(str, "click_button")) {
                User user = this.f71415a.getUser();
                if (user == null) {
                    return;
                }
                if (user.isAdFake()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.of).a();
                } else if (!TextUtils.isEmpty(user.getUid()) && (aVar = this.C) != null) {
                    aVar.a(user.getUid(), user.getSecUid(), str);
                }
            } else if (!g()) {
                this.C.b(this.f71415a);
            }
        }
    }

    public s(View view, com.ss.android.ugc.aweme.comment.g.a aVar) {
        super(view);
        this.p = com.ss.android.ugc.aweme.framework.d.b.a(view.getContext(), 32.0f);
        this.f71416b = view.findViewById(R.id.c7o);
        this.f71417c = (SmartAvatarImageView) view.findViewById(R.id.or);
        this.f71418d = (ImageView) view.findViewById(R.id.byy);
        this.f71419e = (TuxTextView) view.findViewById(R.id.title);
        this.f71420f = (MentionTextView) view.findViewById(R.id.adh);
        this.f71421g = view.findViewById(R.id.dl3);
        this.f71422h = (TuxTextView) view.findViewById(R.id.dld);
        this.f71423i = (MentionTextView) view.findViewById(R.id.dl4);
        this.f71424j = (ImageView) view.findViewById(R.id.ayu);
        this.f71425k = view.findViewById(R.id.dl5);
        this.f71426l = (CommentTranslationStatusView) view.findViewById(R.id.eqo);
        this.f71427m = (TextView) view.findViewById(R.id.eyo);
        this.n = (ImageView) view.findViewById(R.id.bwd);
        this.o = view.findViewById(R.id.c5g);
        this.A = view.findViewById(R.id.ad9);
        this.B = (TextView) view.findViewById(R.id.aa0);
        this.C = aVar;
        view.setOnClickListener(new t(this));
        this.v = new b(view.getContext());
        this.w = new com.ss.android.ugc.aweme.comment.widget.a();
        gq.a(this.f71420f);
        gq.a(this.f71423i);
        if (c.a()) {
            this.y = CommentBatchManagementViewModel.a.a((e) view.getContext());
            this.z = new u(this, view);
        }
        SmartAvatarImageView smartAvatarImageView = this.f71417c;
        if (smartAvatarImageView != null) {
            smartAvatarImageView.setOnTouchListener(this.D);
            this.f71419e.setOnTouchListener(this.E);
            this.B.setOnTouchListener(this.F);
        }
    }

    public void a(Comment comment, Rect rect) {
        User curUser;
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        if (comment != null && this.f71420f != null) {
            View view = this.f71416b;
            if (rect != null) {
                if (rect.top >= 0) {
                    paddingTop = rect.top;
                } else {
                    paddingTop = view.getPaddingTop();
                }
                if (rect.bottom >= 0) {
                    paddingBottom = rect.bottom;
                } else {
                    paddingBottom = view.getPaddingBottom();
                }
                int i2 = Build.VERSION.SDK_INT;
                if (rect.left >= 0) {
                    paddingStart = rect.left;
                } else {
                    paddingStart = view.getPaddingStart();
                }
                if (rect.right >= 0) {
                    paddingEnd = rect.right;
                } else {
                    paddingEnd = view.getPaddingEnd();
                }
                view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            }
            this.f71415a = comment;
            this.v.a(this.f71420f.getContext(), comment, new bu(this.f71420f.getContext(), this.f71420f), new bu(this.f71420f.getContext(), this.f71423i), this.f71426l);
            com.ss.android.ugc.aweme.comment.widget.a aVar = this.w;
            Context context = this.f71420f.getContext();
            MentionTextView mentionTextView = this.f71420f;
            CommentTranslationStatusView commentTranslationStatusView = this.f71426l;
            l.d(context, "");
            l.d(comment, "");
            l.d(mentionTextView, "");
            l.d(commentTranslationStatusView, "");
            aVar.f73024c = mentionTextView;
            aVar.f73022a = context;
            l.d(comment, "");
            aVar.f73026e = comment;
            aVar.f73023b = commentTranslationStatusView;
            aVar.f73025d = new a.b();
            this.f71421g.setVisibility(8);
            b();
            User user = comment.getUser();
            if (comment.getCommerceInfo() != null) {
                CommerceCommentStruct commerceInfo = comment.getCommerceInfo();
                v b2 = com.bytedance.lighten.a.r.a(commerceInfo.getAvartalUrl()).b(em.a(100));
                int i3 = this.p;
                v a2 = b2.a(i3, i3);
                a2.K = true;
                v a3 = a2.a("CommentViewHolder");
                a3.E = this.f71417c;
                a3.c();
                this.f71419e.setText(commerceInfo.getNickName());
            } else if (user != null) {
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
                if (!(avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0)) {
                    d.a();
                    v b3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(avatarThumb)).b(em.a(100));
                    int i4 = this.p;
                    v a4 = b3.a(i4, i4);
                    a4.K = true;
                    v a5 = a4.a("CommentViewHolder");
                    a5.E = this.f71417c;
                    a5.c();
                }
                if (!d.a().f71352a || TextUtils.isEmpty(user.getUserDisplayName())) {
                    this.f71419e.setText(in.a(user, false));
                } else {
                    this.f71419e.setText(user.getUserDisplayName());
                }
                io.a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f71419e);
                a();
            }
            if (!h()) {
                return;
            }
            if (this.y.f72895b.containsKey(this.f71415a.getCid())) {
                i();
            } else {
                j();
            }
        }
    }
}
