package com.ss.android.ugc.aweme.profile.widgets.e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.experiment.BioLinkReportConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.profile.ui.v2.w;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;

public class a extends com.bytedance.assem.arch.d.a {
    public static final b o = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public EnterpriseTransformLayout f117738j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f117739k;

    /* renamed from: l  reason: collision with root package name */
    public View f117740l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f117741m;
    public TextView n;
    private final com.bytedance.assem.arch.extensions.i p = new com.bytedance.assem.arch.extensions.i(bQ_(), new C2993a(this, null));

    static {
        Covode.recordClassIndex(76226);
    }

    private final com.ss.android.ugc.aweme.profile.widgets.h.a.b u() {
        return (com.ss.android.ugc.aweme.profile.widgets.h.a.b) this.p.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76228);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private final String v() {
        String str;
        com.ss.android.ugc.aweme.profile.widgets.h.a.b u = u();
        if (u == null || (str = u.f117883c) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$a  reason: collision with other inner class name */
    public static final class C2993a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2993a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.e.a.C2993a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void n() {
        EnterpriseTransformLayout enterpriseTransformLayout = this.f117738j;
        if (enterpriseTransformLayout != null) {
            enterpriseTransformLayout.setHasShownDownloadLink(false);
        }
        EnterpriseTransformLayout enterpriseTransformLayout2 = this.f117738j;
        if (enterpriseTransformLayout2 != null) {
            enterpriseTransformLayout2.setIsVisibleToUser(false);
        }
        super.n();
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        User user;
        String str;
        super.j();
        w wVar = (w) com.bytedance.assem.arch.service.d.f(this, ab.a(x.class));
        if (wVar != null && wVar.f117301e) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            String str2 = null;
            if (iVar != null) {
                user = iVar.f117705a;
                if (user != null) {
                    str = user.getBioEmail();
                }
                str = null;
            } else {
                user = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                y.a("personal_homepage", "email", user);
            }
            if (user != null) {
                str2 = user.getBioUrl();
            }
            if (!TextUtils.isEmpty(str2)) {
                y.a("personal_homepage", "weblink", user);
            }
        }
        EnterpriseTransformLayout enterpriseTransformLayout = this.f117738j;
        if (!(enterpriseTransformLayout == null || enterpriseTransformLayout.f116756h == null || enterpriseTransformLayout.f116761m)) {
            if (enterpriseTransformLayout.f116756h.getBizAccountInfo() != null && !TextUtils.isEmpty(enterpriseTransformLayout.f116756h.getBizAccountInfo().getAndroidDownloadAppLink())) {
                enterpriseTransformLayout.a();
            } else if (enterpriseTransformLayout.f116756h.getCommerceInfo() != null && !com.bytedance.common.utility.collection.b.a((Collection) enterpriseTransformLayout.f116756h.getCommerceInfo().getOfflineInfoList())) {
                for (com.ss.android.ugc.aweme.commerce.j jVar : enterpriseTransformLayout.f116756h.getCommerceInfo().getOfflineInfoList()) {
                    if (jVar != null && jVar.getOfflineInfoType() == 2) {
                        enterpriseTransformLayout.a();
                    }
                }
            }
        }
        EnterpriseTransformLayout enterpriseTransformLayout2 = this.f117738j;
        if (enterpriseTransformLayout2 != null) {
            enterpriseTransformLayout2.setIsVisibleToUser(true);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f117748b;

        static {
            Covode.recordClassIndex(76237);
        }

        j(a aVar, User user) {
            this.f117747a = aVar;
            this.f117748b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117747a.a(this.f117748b);
            y.a("weblink", this.f117748b);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117742a;

        static {
            Covode.recordClassIndex(76229);
        }

        c(a aVar) {
            this.f117742a = aVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f117742a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar != null) {
                user = iVar.f117705a;
            } else {
                user = null;
            }
            this.f117742a.a(user);
            y.a("weblink", user);
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                TextView textView = this.this$0.f117741m;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.this$0.n;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = this.this$0.f117739k;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View view = this.this$0.f117740l;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            return z.f158842a;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f117745b;

        static {
            Covode.recordClassIndex(76235);
        }

        i(a aVar, User user) {
            this.f117744a = aVar;
            this.f117745b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context ar_ = this.f117744a.ar_();
            if (ar_ != null) {
                ((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(ar_).a(R.string.cwn).b(R.string.cwl)).a(R.string.cwm, new DialogInterface$OnClickListenerC2994a(this)).a().b().show();
            }
            y.a("weblink", this.f117745b);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$i$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC2994a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f117746a;

            static {
                Covode.recordClassIndex(76236);
            }

            DialogInterface$OnClickListenerC2994a(i iVar) {
                this.f117746a = iVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.f117746a.f117744a);
                if (b2 != null) {
                    com.ss.android.ugc.aweme.profile.service.b.f116618a.switchToBioUrl(b2, this.f117746a.f117745b.getBioUrl());
                }
            }
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            User user;
            String str;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                a aVar3 = this.this$0;
                if (!aVar2.f25631b.booleanValue()) {
                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(aVar3, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    String str2 = null;
                    if (iVar != null) {
                        user = iVar.f117705a;
                        if (user != null) {
                            str = user.getBioEmail();
                        }
                        str = null;
                    } else {
                        user = null;
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        y.a("personal_homepage", "email", user);
                    }
                    if (user != null) {
                        str2 = user.getBioUrl();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        y.a("personal_homepage", "weblink", user);
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117743a;

        static {
            Covode.recordClassIndex(76231);
        }

        e(a aVar) {
            this.f117743a = aVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f117743a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar != null) {
                user = iVar.f117705a;
            } else {
                user = null;
            }
            a aVar = this.f117743a;
            if (user != null) {
                String bioEmail = user.getBioEmail();
                l.b(bioEmail, "");
                if (!TextUtils.isEmpty(bioEmail)) {
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(bioEmail))));
                    try {
                        Context ar_ = aVar.ar_();
                        if (ar_ != null) {
                            com.ss.android.ugc.tiktok.security.a.a.a(intent, ar_);
                            ar_.startActivity(intent);
                        }
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.b("ProfileEnterpriseAssem", e2.getMessage());
                    }
                }
            }
            y.a("email", user);
        }
    }

    public final void a(User user) {
        String str;
        int i2;
        Aweme aweme;
        if (user != null) {
            String bioSecureUrl = user.getBioSecureUrl();
            if (!TextUtils.isEmpty(bioSecureUrl)) {
                SmartRoute withParam = SmartRouter.buildRoute(ar_(), "aweme://webview/").withParam(Uri.parse(bioSecureUrl));
                BioLinkReportConfig a2 = com.ss.android.ugc.aweme.profile.experiment.a.a();
                if (a2 == null || a2.isBioLinkReportShow()) {
                    ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                    if (acVar == null || (aweme = acVar.f117249g) == null) {
                        str = null;
                    } else {
                        str = aweme.getAid();
                    }
                    withParam.withParam("aweme_id", str);
                    withParam.withParam("owner_id", user.getUid());
                    withParam.withParam("enter_from", "biolink_profile_page");
                    withParam.withParam("report_type", "bio_link");
                    BioLinkReportConfig a3 = com.ss.android.ugc.aweme.profile.experiment.a.a();
                    if (a3 != null) {
                        i2 = a3.getShowReportJumpTime();
                    } else {
                        i2 = 0;
                    }
                    withParam.withParam("page_depth_of_report_show", i2);
                }
                withParam.open();
            }
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            User user;
            String str;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                boolean booleanValue = aVar2.f25631b.booleanValue();
                Context ar_ = this.this$0.ar_();
                String str2 = null;
                if (!(ar_ instanceof Activity)) {
                    ar_ = null;
                }
                Activity activity = (Activity) ar_;
                if (activity != null) {
                    o.a(activity);
                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    if (iVar != null) {
                        user = iVar.f117705a;
                    } else {
                        user = null;
                    }
                    if (booleanValue) {
                        o.b(activity);
                        if (user != null) {
                            str = user.getBioEmail();
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            y.a("others_homepage", "email", user);
                        }
                        if (user != null) {
                            str2 = user.getBioUrl();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            y.a("others_homepage", "weblink", user);
                        }
                        EnterpriseTransformLayout enterpriseTransformLayout = this.this$0.f117738j;
                        if (enterpriseTransformLayout != null) {
                            enterpriseTransformLayout.setIsVisibleToUser(true);
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 23) {
                            Window window = activity.getWindow();
                            l.b(window, "");
                            View decorView = window.getDecorView();
                            l.b(decorView, "");
                            decorView.setSystemUiVisibility(1024);
                        }
                        EnterpriseTransformLayout enterpriseTransformLayout2 = this.this$0.f117738j;
                        if (enterpriseTransformLayout2 != null) {
                            enterpriseTransformLayout2.setHasShownDownloadLink(false);
                        }
                        EnterpriseTransformLayout enterpriseTransformLayout3 = this.this$0.f117738j;
                        if (enterpriseTransformLayout3 != null) {
                            enterpriseTransformLayout3.setIsVisibleToUser(false);
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        String str;
        String str2 = "";
        l.d(view, str2);
        this.f117741m = (TextView) view.findViewById(R.id.fe0);
        EnterpriseTransformLayout enterpriseTransformLayout = (EnterpriseTransformLayout) view.findViewById(R.id.dbo);
        this.f117738j = enterpriseTransformLayout;
        if (enterpriseTransformLayout != null) {
            if (TextUtils.isEmpty(v())) {
                str2 = v();
            } else if (u() == null) {
                str2 = null;
            } else {
                ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (!(acVar == null || (str = acVar.f117245c) == null)) {
                    str2 = str;
                }
            }
            enterpriseTransformLayout.setEnterFrom(str2);
        }
        TextView textView = this.f117741m;
        if (textView != null) {
            textView.setOnClickListener(new c(this));
        }
        this.f117739k = (TextView) view.findViewById(R.id.ez2);
        this.f117740l = view.findViewById(R.id.cas);
        this.n = (TextView) view.findViewById(R.id.eq8);
        TextView textView2 = this.f117739k;
        if (textView2 != null) {
            textView2.setOnClickListener(new e(this));
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), b.f117749a, new f(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117750a, new g(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), d.f117751a, new h(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), e.f117752a, new d(this));
    }

    static final class f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            TextView textView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                a aVar3 = this.this$0;
                if (aVar3.ar_() != null && aVar3.f25594h) {
                    if (TextUtils.isEmpty(t.getBioEmail()) || in.b(t, in.g(t)) || (EnterpriseTransformLayout.a((User) t) && !TextUtils.isEmpty(t.getBioEmail()))) {
                        TextView textView6 = aVar3.f117739k;
                        if (textView6 != null) {
                            textView6.setVisibility(8);
                        }
                    } else {
                        TextView textView7 = aVar3.f117739k;
                        if (textView7 != null) {
                            textView7.setVisibility(0);
                        }
                    }
                    if (TextUtils.isEmpty(t.getBioUrl())) {
                        TextView textView8 = aVar3.f117741m;
                        if (textView8 != null) {
                            textView8.setVisibility(8);
                        }
                    } else {
                        TextView textView9 = aVar3.f117741m;
                        if (textView9 != null) {
                            textView9.setVisibility(0);
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        TextView textView10 = aVar3.f117741m;
                        if (textView10 != null) {
                            textView10.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                        }
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g2, "");
                        if (!g2.isLogin() || !in.g(t) || !TextUtils.isEmpty(t.getBioSecureUrl())) {
                            int i3 = Build.VERSION.SDK_INT;
                            TextView textView11 = aVar3.f117741m;
                            if (textView11 != null) {
                                textView11.setCompoundDrawablesRelativeWithIntrinsicBounds(2131233439, 0, 0, 0);
                            }
                            TextView textView12 = aVar3.f117741m;
                            if (textView12 != null) {
                                textView12.setCompoundDrawablePadding((int) n.b(aVar3.ar_(), 4.0f));
                            }
                            TextView textView13 = aVar3.f117741m;
                            if (textView13 != null) {
                                textView13.setText(t.getBioUrl());
                            }
                            TextView textView14 = aVar3.f117741m;
                            if (textView14 != null) {
                                Context ar_ = aVar3.ar_();
                                if (ar_ == null) {
                                    l.b();
                                }
                                textView14.setTextColor(androidx.core.content.b.c(ar_, R.color.bx));
                            }
                            TextView textView15 = aVar3.f117741m;
                            if (textView15 != null) {
                                textView15.setOnClickListener(new j(aVar3, t));
                            }
                        } else {
                            int i4 = Build.VERSION.SDK_INT;
                            TextView textView16 = aVar3.f117741m;
                            if (textView16 != null) {
                                textView16.setCompoundDrawablesRelativeWithIntrinsicBounds(2131233340, 0, 0, 0);
                            }
                            TextView textView17 = aVar3.f117741m;
                            if (textView17 != null) {
                                textView17.setCompoundDrawablePadding((int) n.b(aVar3.ar_(), 4.0f));
                            }
                            TextView textView18 = aVar3.f117741m;
                            if (textView18 != null) {
                                textView18.setText(R.string.cwn);
                            }
                            TextView textView19 = aVar3.f117741m;
                            if (textView19 != null) {
                                Context ar_2 = aVar3.ar_();
                                if (ar_2 == null) {
                                    l.b();
                                }
                                textView19.setTextColor(androidx.core.content.b.c(ar_2, R.color.ly));
                            }
                            TextView textView20 = aVar3.f117741m;
                            if (textView20 != null) {
                                textView20.setOnClickListener(new i(aVar3, t));
                            }
                        }
                    }
                    if (aVar3.f117740l != null) {
                        if (aVar3.f117739k == null || (textView4 = aVar3.f117739k) == null || textView4.getVisibility() != 0 || aVar3.f117741m == null || (textView5 = aVar3.f117741m) == null || textView5.getVisibility() != 0) {
                            View view = aVar3.f117740l;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        } else {
                            View view2 = aVar3.f117740l;
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                        }
                    }
                    if (!in.g(t)) {
                        if (!(aVar3.f117739k == null || (textView3 = aVar3.f117739k) == null || textView3.getVisibility() != 0)) {
                            y.a("others_homepage", "email", (User) t);
                        }
                        if (!(aVar3.f117741m == null || (textView2 = aVar3.f117741m) == null || textView2.getVisibility() != 0)) {
                            y.a("others_homepage", "weblink", (User) t);
                        }
                    }
                }
                EnterpriseTransformLayout enterpriseTransformLayout = aVar3.f117738j;
                if (enterpriseTransformLayout != null) {
                    enterpriseTransformLayout.f116756h = t;
                    enterpriseTransformLayout.setVisibility(8);
                    enterpriseTransformLayout.f116749a.setVisibility(8);
                    enterpriseTransformLayout.f116750b.setVisibility(8);
                    enterpriseTransformLayout.f116751c.setVisibility(8);
                    enterpriseTransformLayout.f116752d.setVisibility(8);
                    enterpriseTransformLayout.f116756h = t;
                    enterpriseTransformLayout.f116758j = null;
                    ArrayList arrayList = new ArrayList();
                    if (EnterpriseTransformLayout.a((User) t)) {
                        if (enterpriseTransformLayout.f116756h != null && !TextUtils.isEmpty(enterpriseTransformLayout.f116756h.getBioEmail())) {
                            String string = enterpriseTransformLayout.getResources().getString(R.string.bmf);
                            String bioEmail = enterpriseTransformLayout.f116756h.getBioEmail();
                            EnterpriseTransformLayout.a aVar4 = new EnterpriseTransformLayout.a(enterpriseTransformLayout, (byte) 0);
                            aVar4.f116764b = string;
                            aVar4.f116763a = 1;
                            aVar4.f116765c = bioEmail;
                            arrayList.add(aVar4);
                        }
                        enterpriseTransformLayout.a(arrayList);
                    } else {
                        com.ss.android.ugc.aweme.commerce.f commerceInfo = t.getCommerceInfo();
                        if (!(commerceInfo == null || commerceInfo.getOfflineInfoList() == null)) {
                            for (com.ss.android.ugc.aweme.commerce.j jVar : commerceInfo.getOfflineInfoList()) {
                                arrayList.add(enterpriseTransformLayout.a(jVar));
                            }
                        }
                    }
                    if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
                        enterpriseTransformLayout.setVisibility(0);
                        if (arrayList.size() > 0) {
                            enterpriseTransformLayout.a(enterpriseTransformLayout.f116749a, arrayList.get(0), 0);
                            new Paint().setTextSize(enterpriseTransformLayout.f116749a.getTextSize());
                            if (arrayList.size() > 1) {
                                TextView textView21 = enterpriseTransformLayout.f116750b;
                                EnterpriseTransformLayout.a aVar5 = arrayList.get(1);
                                if (!(textView21 == null || aVar5 == null)) {
                                    String str = aVar5.f116764b;
                                    if (!TextUtils.isEmpty(str)) {
                                        Paint paint = new Paint();
                                        paint.setTextSize(textView21.getTextSize());
                                        if (paint.measureText(str) > n.b(enterpriseTransformLayout.getContext(), 250.0f)) {
                                            textView = enterpriseTransformLayout.f116751c;
                                            enterpriseTransformLayout.a(textView, arrayList.get(1), 1);
                                        }
                                    }
                                }
                                textView = enterpriseTransformLayout.f116750b;
                                enterpriseTransformLayout.a(textView, arrayList.get(1), 1);
                            }
                        }
                        if (enterpriseTransformLayout.f116749a.getVisibility() == 0 && enterpriseTransformLayout.f116750b.getVisibility() == 0) {
                            EnterpriseTransformLayout.a(enterpriseTransformLayout.f116750b, 0);
                            enterpriseTransformLayout.f116752d.setVisibility(0);
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }
}
