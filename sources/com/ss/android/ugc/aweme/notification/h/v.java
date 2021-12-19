package com.ss.android.ugc.aweme.notification.h;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.r;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.utils.n;
import com.ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collections;
import java.util.Objects;

public final class v extends w implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f113726d = new a((byte) 0);
    private final SmartRoundImageView A;
    private final TuxIconView B;
    private final TuxIconView C;
    private final SmartRoundImageView D;
    private final View E;
    private final TextView F;
    private com.ss.android.ugc.aweme.follow.widet.a G;
    private AtMe H;

    /* renamed from: a  reason: collision with root package name */
    public BaseNotice f113727a;

    /* renamed from: b  reason: collision with root package name */
    public String f113728b;

    /* renamed from: c  reason: collision with root package name */
    public String f113729c;

    /* renamed from: e  reason: collision with root package name */
    private final View f113730e;

    /* renamed from: f  reason: collision with root package name */
    private final AvatarImageWithVerify f113731f;
    private final TextView v;
    private final FollowTuxTextView w;
    private final View x;
    private final MutualRelationView y;
    private final TextView z;

    static {
        Covode.recordClassIndex(73103);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73105);
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
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        AtMe atMe = this.H;
        if (atMe != null) {
            return atMe.getUser();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        this.f113487h.a(this.f113648j, new b(this));
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(73106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            v vVar = this.this$0;
            vVar.a("show", "at", vVar.f113648j, this.this$0.f113728b, this.this$0.f113729c, (User) null);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.p
    public final void c(int i2) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i2);
        bundle.putString("username", this.v.getText().toString());
        AtMe atMe = this.H;
        if (atMe != null) {
            User user = atMe.getUser();
            l.b(user, "");
            UrlModel avatarThumb = user.getAvatarThumb();
            int subType = atMe.getSubType();
            if (subType == 1) {
                Context context = this.f113647i;
                l.b(context, "");
                str = context.getResources().getString(R.string.cfy);
            } else if (subType == 2) {
                Context context2 = this.f113647i;
                l.b(context2, "");
                str = context2.getResources().getString(R.string.cfx);
            } else if (subType == 7) {
                Context context3 = this.f113647i;
                l.b(context3, "");
                str = context3.getResources().getString(R.string.dku);
            } else {
                return;
            }
            if (str != null) {
                bundle.putString("content", str);
                bundle.putSerializable("avatar_thumb", avatarThumb);
            } else {
                return;
            }
        }
        this.n = bundle;
        this.f113674m = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113730e = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113731f = avatarImageWithVerify;
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
        View findViewById8 = view.findViewById(R.id.cx1);
        l.b(findViewById8, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById8;
        this.A = smartRoundImageView;
        View findViewById9 = view.findViewById(R.id.cxj);
        l.b(findViewById9, "");
        this.B = (TuxIconView) findViewById9;
        View findViewById10 = view.findViewById(R.id.cxi);
        l.b(findViewById10, "");
        this.C = (TuxIconView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cx0);
        l.b(findViewById11, "");
        SmartRoundImageView smartRoundImageView2 = (SmartRoundImageView) findViewById11;
        this.D = smartRoundImageView2;
        View findViewById12 = view.findViewById(R.id.cxt);
        l.b(findViewById12, "");
        this.E = findViewById12;
        View findViewById13 = view.findViewById(R.id.cxu);
        l.b(findViewById13, "");
        this.F = (TextView) findViewById13;
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(smartRoundImageView);
        com.ss.android.ugc.aweme.notification.g.a.a(smartRoundImageView2);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        smartRoundImageView.setOnClickListener(this);
        smartRoundImageView2.setOnClickListener(this);
        followTuxTextView.setOnClickListener(this);
        this.G = new com.ss.android.ugc.aweme.follow.widet.a(followTuxTextView, new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.h.v.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f113732a;

            static {
                Covode.recordClassIndex(73104);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113732a = r1;
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
                    java.lang.String r1 = "at"
                    java.lang.String r0 = "inbox_interaction_message"
                    com.ss.android.ugc.aweme.notification.utils.e.a(r2, r1, r0, r5)
                    r0 = 0
                    com.ss.android.ugc.aweme.notification.utils.e.a(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.v.AnonymousClass1.a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
        ((com.facebook.drawee.f.a) smartRoundImageView.getHierarchy()).c(R.color.f159922f);
        ((com.facebook.drawee.f.a) smartRoundImageView2.getHierarchy()).c(R.color.f159922f);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
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
        AtMe atMe = this.H;
        if (atMe != null) {
            a("click", "at", this.f113727a, this.f113728b, this.f113729c, (User) null);
            User user = null;
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cx6) {
                    User user2 = atMe.getUser();
                    l.b(user2, "");
                    String uid = user2.getUid();
                    l.b(uid, "");
                    User user3 = atMe.getUser();
                    l.b(user3, "");
                    String secUid = user3.getSecUid();
                    l.b(secUid, "");
                    p.a.a(uid, secUid, false, null, null, 56);
                } else if (valueOf.intValue() == R.id.cxx || valueOf.intValue() == R.id.cx1 || valueOf.intValue() == R.id.cx0) {
                    c.HandlerC2905c b2 = c.b();
                    if (b2 != null) {
                        b2.b(this.f113727a);
                    }
                    if (this.f113674m) {
                        n.a(this.n, getAdapterPosition());
                    }
                    AtMe atMe2 = this.H;
                    if (atMe2 != null) {
                        user = atMe2.getUser();
                    }
                    int a2 = h.a(user);
                    if (atMe.getSubType() == 55 || atMe.getSubType() == 54) {
                        if (atMe.getAweme() != null) {
                            Aweme aweme = atMe.getAweme();
                            l.b(aweme, "");
                            if (aweme.getAid() != null) {
                                SmartRouter.buildRoute(d.a(), atMe.getSchemaUrl()).withParam("video_from", "STORY_ENTRANCE_DEFAULT").withParam("enter_from", "notification_page").withParam("story_comment_user_follow_status", a2).open();
                            }
                        }
                        Context context = this.f113647i;
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        new com.bytedance.tux.g.b((Activity) context).e(R.string.g9_).b();
                    } else {
                        SmartRoute withParam = SmartRouter.buildRoute(d.a(), atMe.getSchemaUrl()).withParam("refer", "notification_page").withParam("story_comment_user_follow_status", a2);
                        l.b(withParam, "");
                        String schemaUrl = atMe.getSchemaUrl();
                        l.b(schemaUrl, "");
                        c.a(withParam, schemaUrl).open();
                    }
                    if (!TextUtils.isEmpty(k.a(atMe.getSchemaUrl()))) {
                        Context context2 = this.f113647i;
                        l.b(context2, "");
                        j.a(context2);
                    }
                }
            }
        }
    }

    public final void a(BaseNotice baseNotice, String str, String str2) {
        String cid;
        String a2;
        com.ss.android.ugc.aweme.follow.widet.a aVar;
        l.d(baseNotice, "");
        l.d(str2, "");
        if (baseNotice.atMe != null) {
            this.f113727a = baseNotice;
            this.f113728b = str;
            this.f113729c = str2;
            this.H = baseNotice.atMe;
            this.B.setVisibility(8);
            this.C.setVisibility(8);
            AtMe atMe = this.H;
            if (atMe != null) {
                this.f113731f.setUserData(new UserVerify(atMe.getUser().getAvatarThumb(), atMe.getUser().getCustomVerify(), atMe.getUser().getEnterpriseVerifyReason(), Integer.valueOf(atMe.getUser().getVerificationType())));
                this.f113731f.a();
                TextView textView = this.v;
                User user = atMe.getUser();
                l.b(user, "");
                a(textView, user, this.f113727a, str, str2);
                User user2 = atMe.getUser();
                if (!(user2 == null || (aVar = this.G) == null)) {
                    aVar.a(user2);
                }
                a(this.y, Collections.singletonList(atMe.getUser()), this.A, this.f113730e);
                a(this.w, "at", Collections.singletonList(atMe.getUser()), this.x);
                if (atMe.getSubType() == 2 || atMe.getSubType() == 55) {
                    this.A.setVisibility(0);
                    this.D.setVisibility(8);
                    this.z.setTextColor(androidx.core.content.b.c(this.f113647i, R.color.bx));
                    Comment comment = atMe.getComment();
                    if (!(comment == null || (cid = comment.getCid()) == null || cid.length() == 0)) {
                        this.E.setVisibility(0);
                        NoticeCommentHelperService a3 = NoticeCommentHelperServiceImpl.a();
                        TextView textView2 = this.F;
                        if (comment.getUser() != null) {
                            StringBuilder sb = new StringBuilder();
                            User user3 = comment.getUser();
                            l.b(user3, "");
                            a2 = sb.append(j.a(user3)).append(": ").append(a3.a(comment)).toString();
                        } else {
                            a2 = a3.a(comment);
                        }
                        textView2.setText(a2);
                        com.ss.android.ugc.aweme.emoji.i.b.b.a(this.F);
                    }
                    if (atMe.getImageUrl() == null) {
                        this.B.setVisibility(0);
                    } else {
                        com.bytedance.lighten.a.v a4 = r.a(com.ss.android.ugc.aweme.base.v.a(atMe.getImageUrl())).b(em.a(500)).a("Notice");
                        a4.E = this.A;
                        a4.c();
                    }
                } else {
                    this.A.setVisibility(8);
                    this.D.setVisibility(0);
                    this.E.setVisibility(8);
                    this.z.setTextColor(androidx.core.content.b.c(this.f113647i, R.color.c5));
                    if (atMe.getImageUrl() == null) {
                        this.C.setVisibility(0);
                    } else {
                        com.bytedance.lighten.a.v a5 = r.a(com.ss.android.ugc.aweme.base.v.a(atMe.getImageUrl())).b(em.a(500)).a("Notice");
                        a5.E = this.D;
                        a5.c();
                    }
                }
                q.a(this.z, new SpannableStringBuilder(com.ss.android.ugc.aweme.ao.a.a(atMe)), baseNotice, 7, com.bytedance.common.utility.n.a(this.f113647i) - ((int) com.bytedance.common.utility.n.b(this.f113647i, 148.0f)));
                com.ss.android.ugc.aweme.emoji.i.b.b.a(this.z);
            }
            a((w) true);
        }
    }
}
