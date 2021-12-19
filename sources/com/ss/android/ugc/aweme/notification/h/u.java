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
import com.bytedance.lighten.a.v;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notification.LikeListDetailActivity;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.utils.k;
import com.ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class u extends w implements View.OnClickListener {
    private final SmartRoundImageView A;
    private final FollowTuxTextView B;
    private final View C;
    private final MutualRelationView D;
    private final View E;
    private final TextView F;
    private final TuxIconView G;
    private DiggNotice H;
    private boolean I = true;
    private com.ss.android.ugc.aweme.follow.widet.a J;

    /* renamed from: a  reason: collision with root package name */
    public BaseNotice f113710a;

    /* renamed from: b  reason: collision with root package name */
    public String f113711b;

    /* renamed from: c  reason: collision with root package name */
    public String f113712c;

    /* renamed from: d  reason: collision with root package name */
    private final View f113713d;

    /* renamed from: e  reason: collision with root package name */
    private final View f113714e;

    /* renamed from: f  reason: collision with root package name */
    private final AvatarImageWithVerify f113715f;
    private final AvatarImageView v;
    private final AvatarImageView w;
    private final View x;
    private final TextView y;
    private final TextView z;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final C2910a f113717a = C2910a.f113724g;

        static {
            Covode.recordClassIndex(73100);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.h.u$a$a  reason: collision with other inner class name */
        public static final class C2910a {

            /* renamed from: a  reason: collision with root package name */
            public static final int f113718a = 3;

            /* renamed from: b  reason: collision with root package name */
            public static int f113719b = 8;

            /* renamed from: c  reason: collision with root package name */
            static final int f113720c = 5;

            /* renamed from: d  reason: collision with root package name */
            public static final int f113721d = 6;

            /* renamed from: e  reason: collision with root package name */
            public static final int f113722e = 9;

            /* renamed from: f  reason: collision with root package name */
            public static final int f113723f = 10;

            /* renamed from: g  reason: collision with root package name */
            static final /* synthetic */ C2910a f113724g = new C2910a();

            /* renamed from: h  reason: collision with root package name */
            private static final int f113725h = 2;

            private C2910a() {
            }

            static {
                Covode.recordClassIndex(73101);
            }
        }
    }

    static {
        Covode.recordClassIndex(73098);
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

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(73102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar) {
            super(0);
            this.this$0 = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            u uVar = this.this$0;
            uVar.a("show", "like", uVar.f113648j, this.this$0.f113711b, this.this$0.f113712c, (User) null);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        List<User> users;
        DiggNotice diggNotice = this.H;
        if (diggNotice == null || (users = diggNotice.getUsers()) == null || users.size() != 1) {
            return null;
        }
        return users.get(0);
    }

    private static int b(DiggNotice diggNotice) {
        if (diggNotice == null || diggNotice.getAweme() == null) {
            return 0;
        }
        Aweme aweme = diggNotice.getAweme();
        l.b(aweme, "");
        return aweme.getEnterpriseType();
    }

    private final boolean a(DiggNotice diggNotice) {
        Aweme aweme;
        String aid;
        String cid = diggNotice.getCid();
        if (!(cid == null || cid.length() == 0) || (aweme = diggNotice.getAweme()) == null || (aid = aweme.getAid()) == null || aid.length() == 0 || b(diggNotice.getDiggType()) || !com.ss.android.ugc.aweme.experiment.f.b()) {
            return false;
        }
        Aweme aweme2 = diggNotice.getAweme();
        l.b(aweme2, "");
        String aid2 = aweme2.getAid();
        l.b(aid2, "");
        List<User> users = diggNotice.getUsers();
        l.b(users, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) users, 10));
        for (T t : users) {
            l.b(t, "");
            arrayList.add(t.getUid());
        }
        p.a(this, aid2, (String) null, (Integer) null, arrayList, diggNotice.getMergeCount(), 4);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.p
    public final void c(int i2) {
        int mergeCount;
        Integer valueOf;
        Integer valueOf2;
        Bundle bundle = new Bundle();
        BaseNotice baseNotice = this.f113710a;
        if (baseNotice != null) {
            bundle.putInt("from_where", baseNotice.type);
        }
        DiggNotice diggNotice = this.H;
        UrlModel urlModel = null;
        if (diggNotice != null && (mergeCount = diggNotice.getMergeCount()) > 0) {
            User user = diggNotice.getUsers().get(0);
            l.b(user, "");
            bundle.putString("username", j.a(user));
            User user2 = diggNotice.getUsers().get(0);
            l.b(user2, "");
            urlModel = user2.getAvatarThumb();
            if (mergeCount >= 2) {
                if (diggNotice.getDiggType() == 1 && (valueOf2 = Integer.valueOf((int) R.string.dl1)) != null) {
                    valueOf2.intValue();
                    Context context = this.f113647i;
                    l.b(context, "");
                    String string = context.getResources().getString(valueOf2.intValue(), Integer.valueOf(mergeCount - 1));
                    l.b(string, "");
                    bundle.putString("content", string);
                } else {
                    return;
                }
            } else if (diggNotice.getDiggType() == 1 && (valueOf = Integer.valueOf((int) R.string.dko)) != null) {
                valueOf.intValue();
                Context context2 = this.f113647i;
                l.b(context2, "");
                String string2 = context2.getResources().getString(valueOf.intValue());
                l.b(string2, "");
                bundle.putString("content", string2);
            } else {
                return;
            }
        }
        bundle.putSerializable("avatar_thumb", urlModel);
        this.n = bundle;
        this.f113674m = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113713d = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        this.f113714e = findViewById2;
        View findViewById3 = view.findViewById(R.id.cx8);
        l.b(findViewById3, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById3;
        this.f113715f = avatarImageWithVerify;
        View findViewById4 = view.findViewById(R.id.cx_);
        l.b(findViewById4, "");
        this.v = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cxa);
        l.b(findViewById5, "");
        this.w = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dl5);
        l.b(findViewById6, "");
        this.x = findViewById6;
        View findViewById7 = view.findViewById(R.id.cxm);
        l.b(findViewById7, "");
        this.y = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cwx);
        l.b(findViewById8, "");
        this.z = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.cwz);
        l.b(findViewById9, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById9;
        this.A = smartRoundImageView;
        View findViewById10 = view.findViewById(R.id.cxo);
        l.b(findViewById10, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById10;
        this.B = followTuxTextView;
        View findViewById11 = view.findViewById(R.id.cxp);
        l.b(findViewById11, "");
        this.C = findViewById11;
        View findViewById12 = view.findViewById(R.id.crv);
        l.b(findViewById12, "");
        this.D = (MutualRelationView) findViewById12;
        View findViewById13 = view.findViewById(R.id.cxt);
        l.b(findViewById13, "");
        this.E = findViewById13;
        View findViewById14 = view.findViewById(R.id.cxu);
        l.b(findViewById14, "");
        this.F = (TextView) findViewById14;
        View findViewById15 = view.findViewById(R.id.cxh);
        l.b(findViewById15, "");
        this.G = (TuxIconView) findViewById15;
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(findViewById2);
        com.ss.android.ugc.aweme.notification.g.a.a(smartRoundImageView);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        followTuxTextView.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        smartRoundImageView.setOnClickListener(this);
        this.J = new com.ss.android.ugc.aweme.follow.widet.a(followTuxTextView, new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.h.u.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u f113716a;

            static {
                Covode.recordClassIndex(73099);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113716a = r1;
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
                    java.lang.String r1 = "like"
                    java.lang.String r0 = "inbox_interaction_message"
                    com.ss.android.ugc.aweme.notification.utils.e.a(r2, r1, r0, r5)
                    r0 = 0
                    com.ss.android.ugc.aweme.notification.utils.e.a(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.u.AnonymousClass1.a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
        ((com.facebook.drawee.f.a) smartRoundImageView.getHierarchy()).c(R.color.f159922f);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        boolean z2;
        Integer num;
        String aid;
        int diggType;
        long j2;
        User user;
        String uid;
        List<User> users;
        User user2;
        String secUid;
        int diggType2;
        long j3;
        User user3;
        String uid2;
        List<User> users2;
        User user4;
        String secUid2;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
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
            DiggNotice diggNotice = this.H;
            if (diggNotice != null) {
                a("click", "like", this.f113710a, this.f113711b, this.f113712c, (User) null);
                IUgCommonService j4 = UgCommonServiceImpl.j();
                BaseNotice baseNotice = this.f113710a;
                if (baseNotice == null || baseNotice.timeLineType != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                j4.a(z2);
                if (this.f113674m) {
                    com.ss.android.ugc.aweme.notification.utils.n.a(this.n, getAdapterPosition());
                }
                String str = null;
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == R.id.cwz) {
                        if (diggNotice.getUsers().size() > 1) {
                            com.ss.android.ugc.aweme.notification.utils.n.a((Bundle) null, 0);
                        }
                        if (a(diggNotice)) {
                            return;
                        }
                        if (diggNotice.getDiggType() == a.C2910a.f113720c || diggNotice.getDiggType() == a.C2910a.f113721d) {
                            k.a(this.f113647i, diggNotice.getForwardId(), "message", diggNotice.getCid(), b(diggNotice));
                        } else if (diggNotice.getDiggType() == a.C2910a.f113723f || diggNotice.getDiggType() == a.C2910a.f113722e) {
                            if (diggNotice.getAweme() != null) {
                                Aweme aweme = diggNotice.getAweme();
                                l.b(aweme, "");
                                String aid2 = aweme.getAid();
                                l.b(aid2, "");
                                DiggNotice diggNotice2 = this.H;
                                if (diggNotice2 != null) {
                                    str = diggNotice2.getCid();
                                }
                                p.a(aid2, str);
                                return;
                            }
                            Context context = this.f113647i;
                            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                            new com.bytedance.tux.g.b((Activity) context).e(R.string.g9_).b();
                        } else if (diggNotice.getAweme() != null) {
                            Aweme aweme2 = diggNotice.getAweme();
                            l.b(aweme2, "");
                            String aid3 = aweme2.getAid();
                            l.b(aid3, "");
                            DiggNotice diggNotice3 = this.H;
                            if (diggNotice3 != null) {
                                str = diggNotice3.getCid();
                            }
                            p.a(this, aid3, str, (Integer) null, (List) null, 0, 28);
                        }
                    } else if (num.intValue() == R.id.cx8) {
                        com.ss.android.ugc.aweme.notification.utils.n.a((Bundle) null, 0);
                        List<User> users3 = diggNotice.getUsers();
                        if (users3 != null && (user3 = (User) n.h((List) users3)) != null && (uid2 = user3.getUid()) != null && (users2 = diggNotice.getUsers()) != null && (user4 = (User) n.h((List) users2)) != null && (secUid2 = user4.getSecUid()) != null) {
                            p.a.a(uid2, secUid2, false, null, null, 56);
                        }
                    } else if (num.intValue() == R.id.cx6) {
                        if (diggNotice.getDiggType() != 0) {
                            int diggType3 = diggNotice.getDiggType();
                            if (diggType3 == a.C2910a.f113722e) {
                                diggType2 = 1;
                            } else if (diggType3 == a.C2910a.f113723f) {
                                diggType2 = 3;
                            } else {
                                diggType2 = diggNotice.getDiggType();
                            }
                            if (!a(diggNotice)) {
                                Context context2 = view.getContext();
                                l.b(context2, "");
                                BaseNotice baseNotice2 = this.f113710a;
                                if (baseNotice2 != null) {
                                    str = baseNotice2.nid;
                                }
                                Aweme aweme3 = diggNotice.getAweme();
                                Comment comment = diggNotice.getComment();
                                BaseNotice baseNotice3 = this.f113710a;
                                if (baseNotice3 != null) {
                                    j3 = baseNotice3.lastReadTime;
                                } else {
                                    j3 = 0;
                                }
                                a(context2, str, aweme3, comment, diggType2, j3);
                                return;
                            }
                            return;
                        }
                        com.ss.android.ugc.aweme.notification.utils.n.a((Bundle) null, 0);
                        List<User> users4 = diggNotice.getUsers();
                        if (users4 != null && (user = (User) n.h((List) users4)) != null && (uid = user.getUid()) != null && (users = diggNotice.getUsers()) != null && (user2 = (User) n.h((List) users)) != null && (secUid = user2.getSecUid()) != null) {
                            p.a.a(uid, secUid, false, null, null, 56);
                        }
                    } else if (num.intValue() != R.id.cxx) {
                    } else {
                        if (diggNotice.getDiggType() == a.C2910a.f113720c || diggNotice.getDiggType() == a.C2910a.f113721d) {
                            k.a(this.f113647i, diggNotice.getForwardId(), "message", diggNotice.getCid(), b(diggNotice));
                        } else if (diggNotice.getUsers().size() > 1 && diggNotice.getDiggType() != 0) {
                            int diggType4 = diggNotice.getDiggType();
                            if (diggType4 == a.C2910a.f113722e) {
                                diggType = 1;
                            } else if (diggType4 == a.C2910a.f113723f) {
                                diggType = 3;
                            } else {
                                diggType = diggNotice.getDiggType();
                            }
                            if (!a(diggNotice)) {
                                Context context3 = view.getContext();
                                l.b(context3, "");
                                BaseNotice baseNotice4 = this.f113710a;
                                if (baseNotice4 != null) {
                                    str = baseNotice4.nid;
                                }
                                Aweme aweme4 = diggNotice.getAweme();
                                Comment comment2 = diggNotice.getComment();
                                BaseNotice baseNotice5 = this.f113710a;
                                if (baseNotice5 != null) {
                                    j2 = baseNotice5.lastReadTime;
                                } else {
                                    j2 = 0;
                                }
                                a(context3, str, aweme4, comment2, diggType, j2);
                            }
                        } else if (diggNotice.getDiggType() != a.C2910a.f113722e && diggNotice.getDiggType() != a.C2910a.f113723f) {
                            Aweme aweme5 = diggNotice.getAweme();
                            if (aweme5 != null && (aid = aweme5.getAid()) != null && aid.length() != 0 && !a(diggNotice)) {
                                Aweme aweme6 = diggNotice.getAweme();
                                l.b(aweme6, "");
                                String aid4 = aweme6.getAid();
                                l.b(aid4, "");
                                p.a(this, aid4, diggNotice.getCid(), (Integer) null, (List) null, 0, 28);
                            }
                        } else if (diggNotice.getAweme() != null) {
                            Aweme aweme7 = diggNotice.getAweme();
                            l.b(aweme7, "");
                            String aid5 = aweme7.getAid();
                            l.b(aid5, "");
                            p.a(aid5, diggNotice.getCid());
                        } else {
                            Context context4 = this.f113647i;
                            Objects.requireNonNull(context4, "null cannot be cast to non-null type android.app.Activity");
                            new com.bytedance.tux.g.b((Activity) context4).e(R.string.g9_).b();
                        }
                    }
                }
            }
        }
    }

    public final void a(BaseNotice baseNotice, boolean z2, String str, String str2) {
        int size;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        int i2;
        String a2;
        int i3;
        com.ss.android.ugc.aweme.follow.widet.a aVar;
        l.d(baseNotice, "");
        l.d(str2, "");
        if (baseNotice.diggNotice != null) {
            this.f113710a = baseNotice;
            this.f113711b = str;
            this.f113712c = str2;
            this.I = z2;
            DiggNotice diggNotice = baseNotice.diggNotice;
            this.H = diggNotice;
            if (diggNotice != null && (size = diggNotice.getUsers().size()) > 0) {
                a(this.y, diggNotice.getUsers(), 1, diggNotice.getMergeCount(), this.f113710a, z2, str, str2);
                List<User> users = diggNotice.getUsers();
                l.b(users, "");
                User user = (User) n.h((List) users);
                if (!(user == null || (aVar = this.J) == null)) {
                    aVar.a(user);
                }
                a(this.D, diggNotice.getUsers(), this.A, this.f113713d);
                a(this.B, "like", diggNotice.getUsers(), this.C);
                if (size == 1) {
                    this.f113715f.setVisibility(0);
                    this.v.setVisibility(8);
                    this.w.setVisibility(8);
                    this.f113715f.setUserData(new UserVerify(diggNotice.getUsers().get(0).getAvatarThumb(), diggNotice.getUsers().get(0).getCustomVerify(), diggNotice.getUsers().get(0).getEnterpriseVerifyReason(), Integer.valueOf(diggNotice.getUsers().get(0).getVerificationType())));
                    this.f113714e.setVisibility(8);
                    this.f113715f.a();
                } else {
                    this.f113714e.setVisibility(0);
                    this.f113715f.setVisibility(8);
                    this.v.setVisibility(0);
                    this.w.setVisibility(0);
                    AvatarImageView avatarImageView = this.v;
                    User user2 = diggNotice.getUsers().get(0);
                    l.b(user2, "");
                    e.a(avatarImageView, user2.getAvatarThumb());
                    AvatarImageView avatarImageView2 = this.w;
                    User user3 = diggNotice.getUsers().get(1);
                    l.b(user3, "");
                    e.a(avatarImageView2, user3.getAvatarThumb());
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int diggType = diggNotice.getDiggType();
                if (diggType == a.C2910a.f113718a || diggType == a.C2910a.f113721d || diggType == a.C2910a.f113719b || diggType == a.C2910a.f113723f) {
                    Context context = this.f113647i;
                    if (diggNotice.getDiggType() == a.C2910a.f113719b) {
                        i2 = R.string.cv;
                    } else {
                        i2 = R.string.dkn;
                    }
                    spannableStringBuilder.append((CharSequence) context.getString(i2));
                    Comment comment = diggNotice.getComment();
                    if (comment != null) {
                        NoticeCommentHelperService a3 = NoticeCommentHelperServiceImpl.a();
                        if (comment.getUser() != null) {
                            StringBuilder sb = new StringBuilder();
                            User user4 = comment.getUser();
                            l.b(user4, "");
                            a2 = sb.append(j.a(user4)).append(": ").append(a3.a(comment)).toString();
                        } else {
                            a2 = a3.a(comment);
                        }
                        if (!TextUtils.isEmpty(a2)) {
                            this.E.setVisibility(0);
                            this.F.setText(a2);
                            com.ss.android.ugc.aweme.emoji.i.b.b.a(this.F);
                        } else {
                            this.E.setVisibility(8);
                        }
                    }
                } else {
                    Context context2 = this.f113647i;
                    if (diggNotice.getDiggType() == a.C2910a.f113722e) {
                        i3 = R.string.djk;
                    } else {
                        i3 = R.string.dko;
                    }
                    spannableStringBuilder.append((CharSequence) context2.getString(i3));
                    this.E.setVisibility(8);
                }
                a(spannableStringBuilder, baseNotice);
                this.z.setText(spannableStringBuilder);
                Aweme aweme = diggNotice.getAweme();
                if (aweme != null && (video = aweme.getVideo()) != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && !urlList.isEmpty()) {
                    this.A.setVisibility(0);
                    v a4 = r.a(com.ss.android.ugc.aweme.base.v.a(video.getOriginCover())).b(em.a(500)).a("Notice");
                    a4.E = this.A;
                    a4.c();
                } else if (diggNotice.getDiggType() == a.C2910a.f113719b) {
                    this.A.setVisibility(8);
                } else {
                    this.A.setVisibility(0);
                    this.A.setImageDrawable(androidx.core.content.b.a(this.f113647i, (int) R.color.f159922f));
                }
                if (diggNotice.getDiggType() == a.C2910a.f113722e || diggNotice.getDiggType() == a.C2910a.f113723f) {
                    if (diggNotice.getAweme() != null) {
                        Aweme aweme2 = diggNotice.getAweme();
                        l.b(aweme2, "");
                        if (aweme2.getVideo() != null) {
                            this.G.setVisibility(8);
                        }
                    }
                    this.G.setVisibility(0);
                }
            }
            w.a(this);
        }
    }

    private final void a(Context context, String str, Aweme aweme, Comment comment, int i2, long j2) {
        String str2;
        String str3;
        Video video;
        UrlModel urlModel = null;
        if (i2 == a.C2910a.f113718a) {
            if (comment != null) {
                str2 = comment.getCid();
            }
            str2 = null;
        } else {
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            str2 = null;
        }
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        boolean z2 = this.I;
        String a2 = g.a(comment);
        if (!(aweme == null || (video = aweme.getVideo()) == null)) {
            urlModel = video.getOriginCover();
        }
        LikeListDetailActivity.a.a(context, str, str3, str2, z2, i2, j2, a2, urlModel, this.f113711b);
    }
}
