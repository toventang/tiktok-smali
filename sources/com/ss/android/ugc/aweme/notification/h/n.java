package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collections;
import java.util.List;

public final class n extends w implements View.OnClickListener {
    private final MutualRelationView A;
    private com.ss.android.ugc.aweme.follow.widet.a B;

    /* renamed from: a  reason: collision with root package name */
    public CommentNotice f113658a;

    /* renamed from: b  reason: collision with root package name */
    public BaseNotice f113659b;

    /* renamed from: c  reason: collision with root package name */
    public String f113660c;

    /* renamed from: d  reason: collision with root package name */
    public String f113661d;

    /* renamed from: e  reason: collision with root package name */
    private final View f113662e;

    /* renamed from: f  reason: collision with root package name */
    private final AvatarImageWithVerify f113663f;
    private final TextView v;
    private final TextView w;
    private final SmartRoundImageView x;
    private final FollowTuxTextView y;
    private final View z;

    static {
        Covode.recordClassIndex(73071);
    }

    private static boolean j() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        this.f113487h.a(this.f113648j, new a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        Comment comment;
        CommentNotice commentNotice = this.f113658a;
        if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
            return null;
        }
        return comment.getUser();
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(73073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            User user;
            Comment comment;
            n nVar = this.this$0;
            String h2 = nVar.h();
            int i2 = this.this$0.f113648j.clientOrder;
            BaseNotice baseNotice = this.this$0.f113648j;
            String a2 = n.a(this.this$0.f113648j.commentNotice);
            String str = this.this$0.f113661d;
            String str2 = this.this$0.f113660c;
            CommentNotice commentNotice = this.this$0.f113658a;
            if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
                user = null;
            } else {
                user = comment.getUser();
            }
            nVar.a("show", h2, i2, baseNotice, a2, str, str2, user);
            return z.f158842a;
        }
    }

    public final String h() {
        Integer valueOf;
        CommentNotice commentNotice = this.f113658a;
        if (commentNotice == null || (valueOf = Integer.valueOf(commentNotice.getCommentType())) == null) {
            return "";
        }
        if (valueOf.intValue() == 17) {
            return "video_reply_comment";
        }
        if (valueOf.intValue() == 18) {
            return "video_reply_reply";
        }
        if (valueOf.intValue() == 19) {
            return "video_reply_like";
        }
        return "";
    }

    private final String i() {
        Integer num;
        CommentNotice commentNotice = this.f113658a;
        if (commentNotice != null) {
            num = Integer.valueOf(commentNotice.getCommentType());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 17) {
                Context context = this.f113647i;
                l.b(context, "");
                String string = context.getResources().getString(R.string.dl8);
                l.b(string, "");
                return string;
            } else if (num.intValue() == 18) {
                Context context2 = this.f113647i;
                l.b(context2, "");
                String string2 = context2.getResources().getString(R.string.dl7);
                l.b(string2, "");
                return string2;
            } else if (num.intValue() == 19) {
                Context context3 = this.f113647i;
                l.b(context3, "");
                String string3 = context3.getResources().getString(R.string.dl6);
                l.b(string3, "");
                return string3;
            }
        }
        return "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113662e = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113663f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        this.v = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwx);
        l.b(findViewById4, "");
        this.w = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cwz);
        l.b(findViewById5, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById5;
        this.x = smartRoundImageView;
        View findViewById6 = view.findViewById(R.id.cxo);
        l.b(findViewById6, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById6;
        this.y = followTuxTextView;
        View findViewById7 = view.findViewById(R.id.cxp);
        l.b(findViewById7, "");
        this.z = findViewById7;
        View findViewById8 = view.findViewById(R.id.crv);
        l.b(findViewById8, "");
        this.A = (MutualRelationView) findViewById8;
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(smartRoundImageView);
        smartRoundImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        ((com.facebook.drawee.f.a) smartRoundImageView.getHierarchy()).c(R.color.f159922f);
        followTuxTextView.setOnClickListener(this);
        this.B = new com.ss.android.ugc.aweme.follow.widet.a(followTuxTextView, new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.h.n.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f113664a;

            static {
                Covode.recordClassIndex(73072);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113664a = r1;
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
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.n.AnonymousClass1.a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        int i2;
        Integer valueOf;
        ClickAgent.onClick(view);
        d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = j();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.de8).b();
            return;
        }
        CommentNotice commentNotice = this.f113658a;
        if (commentNotice != null) {
            String h2 = h();
            BaseNotice baseNotice = this.f113659b;
            if (baseNotice != null) {
                i2 = baseNotice.clientOrder;
            } else {
                i2 = -1;
            }
            BaseNotice baseNotice2 = this.f113659b;
            CommentNotice commentNotice2 = null;
            if (baseNotice2 != null) {
                commentNotice2 = baseNotice2.commentNotice;
            }
            String a2 = a(commentNotice2);
            String str = this.f113661d;
            String str2 = this.f113660c;
            Comment comment = commentNotice.getComment();
            l.b(comment, "");
            a("click", h2, i2, baseNotice2, a2, str, str2, comment.getUser());
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
                    Comment comment4 = commentNotice.getComment();
                    l.b(comment4, "");
                    Aweme aliasAweme = comment4.getAliasAweme();
                    l.b(aliasAweme, "");
                    String aid = aliasAweme.getAid();
                    l.b(aid, "");
                    p.a(this, aid, "", (Integer) null, (List) null, 0, 28);
                }
            }
        }
    }

    public final void a(BaseNotice baseNotice, String str, String str2) {
        Aweme aliasAweme;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        com.ss.android.ugc.aweme.follow.widet.a aVar;
        l.d(baseNotice, "");
        l.d(str2, "");
        if (baseNotice.commentNotice != null) {
            CommentNotice commentNotice = baseNotice.commentNotice;
            l.b(commentNotice, "");
            if (commentNotice.isReplyWithVideo()) {
                CommentNotice commentNotice2 = baseNotice.commentNotice;
                l.b(commentNotice2, "");
                if (commentNotice2.getComment() != null) {
                    CommentNotice commentNotice3 = baseNotice.commentNotice;
                    l.b(commentNotice3, "");
                    Comment comment = commentNotice3.getComment();
                    l.b(comment, "");
                    if (comment.getAliasAweme() != null) {
                        this.f113660c = str;
                        this.f113659b = baseNotice;
                        this.f113661d = str2;
                        CommentNotice commentNotice4 = baseNotice.commentNotice;
                        this.f113658a = commentNotice4;
                        if (commentNotice4 != null) {
                            Comment comment2 = commentNotice4.getComment();
                            l.b(comment2, "");
                            User user = comment2.getUser();
                            l.b(user, "");
                            this.f113663f.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                            this.f113663f.a();
                            Comment comment3 = commentNotice4.getComment();
                            l.b(comment3, "");
                            User user2 = comment3.getUser();
                            if (!(user2 == null || (aVar = this.B) == null)) {
                                aVar.a(user2);
                            }
                            MutualRelationView mutualRelationView = this.A;
                            Comment comment4 = commentNotice4.getComment();
                            l.b(comment4, "");
                            a(mutualRelationView, Collections.singletonList(comment4.getUser()), (View) null, this.f113662e);
                            FollowTuxTextView followTuxTextView = this.y;
                            String h2 = h();
                            Comment comment5 = commentNotice4.getComment();
                            l.b(comment5, "");
                            a(followTuxTextView, h2, Collections.singletonList(comment5.getUser()), this.z);
                            a(this.v, user, this.f113659b, str, str2);
                            Comment comment6 = commentNotice4.getComment();
                            if (comment6 == null || (aliasAweme = comment6.getAliasAweme()) == null || (video = aliasAweme.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || urlList.isEmpty()) {
                                this.x.setImageDrawable(androidx.core.content.b.a(this.f113647i, (int) R.color.f159922f));
                            } else {
                                Comment comment7 = commentNotice4.getComment();
                                l.b(comment7, "");
                                Aweme aliasAweme2 = comment7.getAliasAweme();
                                l.b(aliasAweme2, "");
                                Video video2 = aliasAweme2.getVideo();
                                l.b(video2, "");
                                v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(video2.getOriginCover())).b(em.a(500)).a("Notice");
                                a2.E = this.x;
                                a2.c();
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i());
                            a(spannableStringBuilder, baseNotice);
                            this.w.setText(spannableStringBuilder);
                        }
                        a((w) true);
                    }
                }
            }
        }
    }
}
