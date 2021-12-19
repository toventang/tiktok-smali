package com.ss.android.ugc.aweme.notification.h;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.utils.n;
import com.ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;
import h.f.b.m;
import h.u;
import h.z;
import java.util.List;
import java.util.Objects;

public final class r extends w implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f113685d = new a((byte) 0);
    private final View A;
    private final View B;
    private final TextView C;
    private final SmartRoundImageView D;
    private final TuxIconView E;
    private com.ss.android.ugc.aweme.follow.widet.a F;
    private String G;

    /* renamed from: a  reason: collision with root package name */
    public CommentNotice f113686a;

    /* renamed from: b  reason: collision with root package name */
    public BaseNotice f113687b;

    /* renamed from: c  reason: collision with root package name */
    public String f113688c;

    /* renamed from: e  reason: collision with root package name */
    private final View f113689e;

    /* renamed from: f  reason: collision with root package name */
    private final AvatarImageWithVerify f113690f;
    private final TextView v;
    private final FollowTuxTextView w;
    private final View x;
    private final MutualRelationView y;
    private final TextView z;

    static {
        Covode.recordClassIndex(73085);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73087);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        this.f113487h.a(this.f113648j, new b(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        Comment comment;
        CommentNotice commentNotice = this.f113686a;
        if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
            return null;
        }
        return comment.getUser();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(73088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            User user;
            Comment comment;
            r rVar = this.this$0;
            int i2 = rVar.f113648j.clientOrder;
            BaseNotice baseNotice = this.this$0.f113648j;
            String a2 = r.a(this.this$0.f113648j.commentNotice);
            String str = this.this$0.f113688c;
            boolean z = this.this$0.f113648j.hasRead;
            CommentNotice commentNotice = this.this$0.f113686a;
            if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
                user = null;
            } else {
                user = comment.getUser();
            }
            rVar.a("show", UGCMonitor.EVENT_COMMENT, i2, baseNotice, a2, "notification_page", str, z ? 1 : 0, user);
            return z.f158842a;
        }
    }

    private boolean b(SpannableStringBuilder spannableStringBuilder) {
        l.d(spannableStringBuilder, "");
        CommentNotice commentNotice = this.f113686a;
        if (commentNotice == null) {
            return false;
        }
        u<String, Integer, Integer> a2 = com.ss.android.ugc.aweme.ao.a.a(commentNotice);
        spannableStringBuilder.append((CharSequence) a2.getFirst());
        if (a2.getSecond().intValue() == -1 || a2.getThird().intValue() == -1) {
            return true;
        }
        TextView textView = this.z;
        int intValue = a2.getSecond().intValue();
        int intValue2 = a2.getThird().intValue();
        Comment replyComment = commentNotice.getReplyComment();
        l.b(replyComment, "");
        User user = replyComment.getUser();
        l.b(user, "");
        a(textView, spannableStringBuilder, intValue, intValue2, user, this.f113687b, this.f113688c);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113689e = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113690f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        this.v = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cxo);
        l.b(findViewById4, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById4;
        this.w = followTuxTextView;
        View findViewById5 = view.findViewById(R.id.cxp);
        l.b(findViewById5, "");
        this.x = findViewById5;
        View findViewById6 = view.findViewById(R.id.crv);
        l.b(findViewById6, "");
        this.y = (MutualRelationView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cwx);
        l.b(findViewById7, "");
        this.z = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cxt);
        l.b(findViewById8, "");
        this.A = findViewById8;
        View findViewById9 = view.findViewById(R.id.dl5);
        l.b(findViewById9, "");
        this.B = findViewById9;
        View findViewById10 = view.findViewById(R.id.cxu);
        l.b(findViewById10, "");
        this.C = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cwz);
        l.b(findViewById11, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById11;
        this.D = smartRoundImageView;
        View findViewById12 = view.findViewById(R.id.cxh);
        l.b(findViewById12, "");
        this.E = (TuxIconView) findViewById12;
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(smartRoundImageView);
        smartRoundImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        ((com.facebook.drawee.f.a) smartRoundImageView.getHierarchy()).c(R.color.f159922f);
        followTuxTextView.setOnClickListener(this);
        this.F = new com.ss.android.ugc.aweme.follow.widet.a(followTuxTextView, new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.h.r.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f113691a;

            static {
                Covode.recordClassIndex(73086);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113691a = r1;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int r4, com.ss.android.ugc.aweme.profile.model.User r5) {
                /*
                    r3 = this;
                    super.a(r4, r5)
                    java.lang.String r2 = "follow"
                    java.lang.String r1 = "comment"
                    java.lang.String r0 = "inbox_interaction_message"
                    com.ss.android.ugc.aweme.notification.utils.e.a(r2, r1, r0, r5)
                    r0 = 0
                    com.ss.android.ugc.aweme.notification.utils.e.a(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.r.AnonymousClass1.a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
    }

    private void a(SpannableStringBuilder spannableStringBuilder) {
        Comment replyComment;
        TextView textView;
        String text;
        String text2;
        String str = "";
        l.d(spannableStringBuilder, str);
        this.A.setVisibility(8);
        CommentNotice commentNotice = this.f113686a;
        if (commentNotice != null && (replyComment = commentNotice.getReplyComment()) != null) {
            this.A.setVisibility(0);
            if (commentNotice.getCommentType() == 12 || commentNotice.getCommentType() == 27) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                l.b(createIUserServicebyMonsterPlugin, str);
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                textView = this.C;
                if (currentUser != null) {
                    StringBuilder append = new StringBuilder().append(j.a(currentUser)).append(": ");
                    Comment level1Comment = commentNotice.getLevel1Comment();
                    if (!(level1Comment == null || (text2 = level1Comment.getText()) == null)) {
                        str = text2;
                    }
                    str = append.append(str).toString();
                } else {
                    Comment level1Comment2 = commentNotice.getLevel1Comment();
                    if (!(level1Comment2 == null || (text = level1Comment2.getText()) == null)) {
                        str = text;
                    }
                }
            } else {
                NoticeCommentHelperService a2 = NoticeCommentHelperServiceImpl.a();
                textView = this.C;
                if (replyComment.getUser() != null) {
                    StringBuilder sb = new StringBuilder();
                    User user = replyComment.getUser();
                    l.b(user, str);
                    str = sb.append(j.a(user)).append(": ").append(a2.a(replyComment)).toString();
                } else {
                    str = a2.a(replyComment);
                }
            }
            textView.setText(str);
            if (!TextUtils.isEmpty(this.C.getText())) {
                com.ss.android.ugc.aweme.emoji.i.b.b.a(this.C);
            } else {
                this.A.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.notification.h.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r7) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.r.c(int):void");
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        int i2;
        int i3;
        Integer valueOf;
        ClickAgent.onClick(view);
        d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = h();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            return;
        }
        CommentNotice commentNotice = this.f113686a;
        if (commentNotice != null) {
            int i4 = 0;
            boolean a2 = i.a(new Integer[]{23, 25, 27, 26}, Integer.valueOf(commentNotice.getCommentType()));
            BaseNotice baseNotice = this.f113687b;
            if (baseNotice != null) {
                i2 = baseNotice.clientOrder;
            } else {
                i2 = -1;
            }
            BaseNotice baseNotice2 = this.f113687b;
            CommentNotice commentNotice2 = null;
            if (baseNotice2 != null) {
                commentNotice2 = baseNotice2.commentNotice;
            }
            String a3 = a(commentNotice2);
            String str = this.f113688c;
            BaseNotice baseNotice3 = this.f113687b;
            if (baseNotice3 == null || !baseNotice3.hasRead) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            Comment comment = commentNotice.getComment();
            l.b(comment, "");
            a("click", UGCMonitor.EVENT_COMMENT, i2, baseNotice2, a3, "notification_page", str, i3, comment.getUser());
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cx6) {
                    Comment comment2 = commentNotice.getComment();
                    l.b(comment2, "");
                    User user = comment2.getUser();
                    l.b(user, "");
                    String uid = user.getUid();
                    l.b(uid, "");
                    Comment comment3 = commentNotice.getComment();
                    l.b(comment3, "");
                    User user2 = comment3.getUser();
                    l.b(user2, "");
                    String secUid = user2.getSecUid();
                    l.b(secUid, "");
                    p.a.a(uid, secUid, false, null, null, 56);
                } else if (valueOf.intValue() == R.id.cxx || valueOf.intValue() == R.id.cwz) {
                    int commentType = commentNotice.getCommentType();
                    if (commentType == 7 || commentType == 8 || commentType == 9 || commentType == 10) {
                        Context context = view.getContext();
                        l.b(context, "");
                        String forwardId = commentNotice.getForwardId();
                        l.b(forwardId, "");
                        Comment comment4 = commentNotice.getComment();
                        l.b(comment4, "");
                        String cid = comment4.getCid();
                        l.b(cid, "");
                        Aweme aweme = commentNotice.getAweme();
                        if (aweme != null) {
                            i4 = aweme.getEnterpriseType();
                        }
                        t a4 = t.a();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        t.a(a4, (Activity) context, com.ss.android.ugc.aweme.ck.u.a("aweme://aweme/detail/".concat(String.valueOf(forwardId))).a("profile_enterprise_type", i4).a("cid", cid).a("refer", "message").a("video_from", "from_launch_forward").a());
                        return;
                    }
                    if (this.f113674m) {
                        n.a(this.n, getAdapterPosition());
                    }
                    Comment comment5 = commentNotice.getComment();
                    l.b(comment5, "");
                    int a5 = h.a(comment5.getUser());
                    if (a2) {
                        if (commentNotice.getAweme() != null) {
                            Aweme aweme2 = commentNotice.getAweme();
                            l.b(aweme2, "");
                            if (aweme2.getAid() != null) {
                                Aweme aweme3 = commentNotice.getAweme();
                                l.b(aweme3, "");
                                String aid = aweme3.getAid();
                                l.b(aid, "");
                                Comment comment6 = commentNotice.getComment();
                                l.b(comment6, "");
                                a(aid, comment6.getCid(), Integer.valueOf(a5));
                                return;
                            }
                        }
                        View view3 = this.itemView;
                        l.b(view3, "");
                        new com.bytedance.tux.g.b(view3).e(R.string.g9_).b();
                        return;
                    }
                    Aweme aweme4 = commentNotice.getAweme();
                    l.b(aweme4, "");
                    String aid2 = aweme4.getAid();
                    l.b(aid2, "");
                    Comment comment7 = commentNotice.getComment();
                    l.b(comment7, "");
                    p.a(this, aid2, comment7.getCid(), Integer.valueOf(a5), (List) null, 0, 24);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r13, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.r.a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, java.lang.String, java.lang.String):void");
    }
}
