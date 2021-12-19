package com.ss.android.ugc.aweme.notification.h;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.d;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class o extends p implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f113665d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f113666a;

    /* renamed from: b  reason: collision with root package name */
    public String f113667b;

    /* renamed from: c  reason: collision with root package name */
    public String f113668c;

    /* renamed from: e  reason: collision with root package name */
    private final View f113669e;

    /* renamed from: f  reason: collision with root package name */
    private final AvatarImageWithVerify f113670f;
    private final TextView q;
    private final TextView r;
    private final View s;
    private final SmartRoundImageView t;
    private BaseNotice u;

    static {
        Covode.recordClassIndex(73074);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73075);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean c() {
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
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(73076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            User user;
            o oVar = this.this$0;
            int i2 = oVar.f113648j.clientOrder;
            BaseNotice baseNotice = this.this$0.f113648j;
            String str = this.this$0.f113668c;
            String str2 = this.this$0.f113667b;
            d dVar = this.this$0.f113666a;
            if (dVar != null) {
                user = dVar.f112842b;
            } else {
                user = null;
            }
            oVar.a("show", "donation_sticker", i2, baseNotice, "", str, str2, user);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113669e = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113670f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        this.q = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwx);
        l.b(findViewById4, "");
        this.r = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cxt);
        l.b(findViewById5, "");
        this.s = findViewById5;
        View findViewById6 = view.findViewById(R.id.cwz);
        l.b(findViewById6, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById6;
        this.t = smartRoundImageView;
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(smartRoundImageView);
        j.a(smartRoundImageView);
        smartRoundImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        ((com.facebook.drawee.f.a) smartRoundImageView.getHierarchy()).c(R.color.a1);
        findViewById5.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        int i2;
        Integer valueOf;
        ClickAgent.onClick(view);
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = c();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            return;
        }
        d dVar = this.f113666a;
        if (dVar != null) {
            BaseNotice baseNotice = this.u;
            if (baseNotice != null) {
                i2 = baseNotice.clientOrder;
            } else {
                i2 = -1;
            }
            a("click", "donation_sticker", i2, this.u, "", this.f113668c, this.f113667b, dVar.f112842b);
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cx6) {
                    if (dVar.f112842b != null) {
                        User user = dVar.f112842b;
                        if (user == null) {
                            l.b();
                        }
                        String uid = user.getUid();
                        l.b(uid, "");
                        User user2 = dVar.f112842b;
                        if (user2 == null) {
                            l.b();
                        }
                        String secUid = user2.getSecUid();
                        l.b(secUid, "");
                        p.a.a(uid, secUid, false, null, null, 56);
                    }
                } else if ((valueOf.intValue() == R.id.cxx || valueOf.intValue() == R.id.cwz) && dVar.f112841a != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://aweme/detail/");
                    Aweme aweme = dVar.f112841a;
                    if (aweme == null) {
                        l.b();
                    }
                    buildRoute.withParam("id", aweme.getAid()).withParam("refer", "message").withParam("enter_method", "notice_click").withParam("show_donation", true).open();
                }
            }
        }
    }

    public final void a(BaseNotice baseNotice, String str, String str2) {
        l.d(baseNotice, "");
        l.d(str2, "");
        if (baseNotice.donationNotice != null) {
            this.f113667b = str;
            this.u = baseNotice;
            this.f113668c = str2;
            d dVar = baseNotice.donationNotice;
            this.f113666a = dVar;
            if (dVar != null) {
                User user = dVar.f112842b;
                if (user != null) {
                    this.f113670f.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                    this.f113670f.a();
                    a(this.q, user, this.u, str, str2);
                }
                Aweme aweme = dVar.f112841a;
                if (aweme != null) {
                    Video video = aweme.getVideo();
                    l.b(video, "");
                    v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(video.getOriginCover())).b(em.a(500)).a("DONATION_NOTICE");
                    a2.E = this.t;
                    a2.c();
                }
                q.a(this.r, new SpannableStringBuilder(this.f113647i.getString(R.string.bau)), baseNotice, 7, n.a(this.f113647i) - ((int) n.b(this.f113647i, 148.0f)));
            }
        }
    }
}
