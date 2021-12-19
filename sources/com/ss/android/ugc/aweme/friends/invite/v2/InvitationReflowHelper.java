package com.ss.android.ugc.aweme.friends.invite.v2;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

public final class InvitationReflowHelper implements IAccountUserService.a, au, com.ss.android.ugc.aweme.friends.invite.b, com.ss.android.ugc.aweme.profile.presenter.r, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: c  reason: collision with root package name */
    public static c f96914c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f96915d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f96916a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<com.bytedance.tux.dialog.a> f96917b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f96918e = b.f96924a;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f96919f = h.i.a((h.f.a.a) new e(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f96920g = h.i.a((h.f.a.a) f.f96931a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f96921h = h.i.a((h.f.a.a) d.f96930a);

    /* renamed from: i  reason: collision with root package name */
    private final r f96922i = new r(this);

    /* renamed from: j  reason: collision with root package name */
    private final WeakReference<androidx.fragment.app.e> f96923j;

    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f96926d = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final String f96927a;

        /* renamed from: b  reason: collision with root package name */
        public final String f96928b;

        /* renamed from: c  reason: collision with root package name */
        public final String f96929c;

        static {
            Covode.recordClassIndex(61505);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.f.b.l.a(this.f96927a, cVar.f96927a) && h.f.b.l.a(this.f96928b, cVar.f96928b) && h.f.b.l.a(this.f96929c, cVar.f96929c);
        }

        public final int hashCode() {
            String str = this.f96927a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f96928b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f96929c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Invitation(code=" + this.f96927a + ", uid=" + this.f96928b + ", secUid=" + this.f96929c + ")";
        }

        public static final class a {
            static {
                Covode.recordClassIndex(61506);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static c a(Intent intent) {
                h.f.b.l.d(intent, "");
                return new c(a(intent, "invitation_code"), a(intent, "inviter_uid"), a(intent, "inviter_sec_uid"));
            }

            public static c a(Uri uri) {
                h.f.b.l.d(uri, "");
                return new c(uri.getQueryParameter("invitation_code"), uri.getQueryParameter("inviter_uid"), uri.getQueryParameter("inviter_sec_uid"));
            }

            private static String a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        public final boolean a() {
            if (!hl.a(this.f96927a) || !hl.a(this.f96928b) || !hl.a(this.f96929c)) {
                return false;
            }
            return true;
        }

        public c(String str, String str2, String str3) {
            this.f96927a = str;
            this.f96928b = str2;
            this.f96929c = str3;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f96936a;

        static {
            Covode.recordClassIndex(61516);
        }

        m(h.f.a.a aVar) {
            this.f96936a = aVar;
        }

        public final /* synthetic */ void run() {
            h.f.b.l.b(this.f96936a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(61502);
    }

    private final com.ss.android.ugc.aweme.profile.presenter.o e() {
        return (com.ss.android.ugc.aweme.profile.presenter.o) this.f96920g.getValue();
    }

    private final Handler f() {
        return (Handler) this.f96921h.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.share.viewmodel.a c() {
        return (com.ss.android.ugc.aweme.share.viewmodel.a) this.f96919f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(330, new org.greenrobot.eventbus.g(InvitationReflowHelper.class, "onComplianceDialogDone", com.ss.android.ugc.aweme.compliance.api.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61503);
        }

        private a() {
        }

        public static boolean a() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            return g2.isLogin();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static c a(Uri uri) {
            String queryParameter;
            String queryParameter2;
            String queryParameter3;
            c a2 = c.a.a(uri);
            if (!(a2.a() || (queryParameter3 = uri.getQueryParameter("params_url")) == null || queryParameter3.length() == 0)) {
                Uri parse = Uri.parse(queryParameter3);
                h.f.b.l.b(parse, "");
                a2 = c.a.a(parse);
            }
            if (!(a2.a() || (queryParameter = uri.getQueryParameter("target_url")) == null || queryParameter.length() == 0 || (queryParameter2 = Uri.parse(queryParameter).getQueryParameter("af_dp")) == null || queryParameter2.length() == 0)) {
                Uri parse2 = Uri.parse(queryParameter2);
                h.f.b.l.b(parse2, "");
                a2 = c.a.a(parse2);
            }
            com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "interceptDeepLink: ".concat(String.valueOf(a2)));
            return a2;
        }

        private static boolean a(c cVar) {
            boolean z;
            if (p.a.a().d() != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean shouldShowForcedLogin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin();
            com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "shouldJourney: " + z + ", shouldMandatoryLogin:" + shouldShowForcedLogin);
            if (!z && !shouldShowForcedLogin) {
                return false;
            }
            InvitationReflowHelper.f96914c = cVar;
            com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "jumpUntilNextMainLaunch");
            return true;
        }

        public static Intent a(Uri uri, Intent intent) {
            h.f.b.l.d(uri, "");
            h.f.b.l.d(intent, "");
            try {
                c a2 = a(uri);
                if (a2.a()) {
                    if (a(a2)) {
                        return null;
                    }
                    h.f.b.l.d(intent, "");
                    intent.putExtra("invitation_code", a2.f96927a);
                    intent.putExtra("inviter_uid", a2.f96928b);
                    intent.putExtra("inviter_sec_uid", a2.f96929c);
                }
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.common.f.a("InvitationReflowHelper", "interceptDeepLink error", th);
            }
            return intent;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.p<java.lang.String, ? extends java.util.HashMap<java.lang.String, java.lang.Object>> */
        /* JADX WARN: Multi-variable type inference failed */
        public static h.p<String, HashMap<String, Object>> a(String str, h.p<String, ? extends HashMap<String, Object>> pVar) {
            String str2 = "";
            h.f.b.l.d(str, str2);
            h.f.b.l.d(pVar, str2);
            try {
                Uri parse = Uri.parse(str);
                h.f.b.l.b(parse, str2);
                c a2 = a(parse);
                if (a2.a()) {
                    if (a(a2)) {
                        return new h.p<>(str2, pVar.getSecond());
                    }
                    HashMap hashMap = (HashMap) pVar.getSecond();
                    h.f.b.l.d(hashMap, str2);
                    String str3 = a2.f96927a;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    hashMap.put("invitation_code", str3);
                    String str4 = a2.f96928b;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    hashMap.put("inviter_uid", str4);
                    String str5 = a2.f96929c;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    hashMap.put("inviter_sec_uid", str2);
                }
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.common.f.a("InvitationReflowHelper", "interceptDeepLink error", th);
            }
            return pVar;
        }
    }

    public static final class b implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

        /* renamed from: a  reason: collision with root package name */
        static boolean f96924a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f96925b;

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(330, new org.greenrobot.eventbus.g(b.class, "onComplianceDialogDone", com.ss.android.ugc.aweme.compliance.api.b.a.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        private b() {
        }

        static {
            Covode.recordClassIndex(61504);
            b bVar = new b();
            f96925b = bVar;
            cg.a(bVar);
        }

        @org.greenrobot.eventbus.r
        public final void onComplianceDialogDone(com.ss.android.ugc.aweme.compliance.api.b.a aVar) {
            com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "ComplianceSubscriber onComplianceDialogDone");
            f96924a = true;
        }
    }

    public static final class r implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InvitationReflowHelper f96937a;

        static {
            Covode.recordClassIndex(61524);
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void a() {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f96938a;

            static {
                Covode.recordClassIndex(61525);
            }

            a(r rVar) {
                this.f96938a = rVar;
            }

            public final void run() {
                this.f96938a.f96937a.d();
            }
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void b() {
            new Handler(Looper.getMainLooper()).post(new a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(InvitationReflowHelper invitationReflowHelper) {
            this.f96937a = invitationReflowHelper;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.profile.presenter.o> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f96931a = new f();

        static {
            Covode.recordClassIndex(61509);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.profile.presenter.o invoke() {
            return new com.ss.android.ugc.aweme.profile.presenter.o();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f96930a = new d();

        static {
            Covode.recordClassIndex(61507);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.share.viewmodel.a> {
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(InvitationReflowHelper invitationReflowHelper) {
            super(0);
            this.this$0 = invitationReflowHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.share.viewmodel.a invoke() {
            androidx.fragment.app.e b2 = this.this$0.b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            return a.C3244a.a(b2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class i extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(61512);
        }

        i(InvitationReflowHelper invitationReflowHelper) {
            super(0, invitationReflowHelper, InvitationReflowHelper.class, "tryReflow", "tryReflow()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((InvitationReflowHelper) this.receiver).d();
            return z.f158842a;
        }
    }

    static final /* synthetic */ class j extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(61513);
        }

        j(InvitationReflowHelper invitationReflowHelper) {
            super(0, invitationReflowHelper, InvitationReflowHelper.class, "tryReflow", "tryReflow()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((InvitationReflowHelper) this.receiver).d();
            return z.f158842a;
        }
    }

    public final androidx.fragment.app.e b() {
        return this.f96923j.get();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f96916a = null;
        this.f96918e = false;
        e().cd_();
        f().removeCallbacksAndMessages(null);
        cg.b(this);
        com.ss.android.ugc.aweme.account.b.g().removeUserChangeListener(this);
    }

    public final void d() {
        c cVar;
        com.bytedance.tux.dialog.a aVar;
        boolean a2 = c().a("swipe_up_guide");
        if (!this.f96918e || a2 || (cVar = this.f96916a) == null || !cVar.a()) {
            com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "tryReflow blocked by:" + this.f96918e + ", " + a2 + ", " + this.f96916a);
            return;
        }
        WeakReference<com.bytedance.tux.dialog.a> weakReference = this.f96917b;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            aVar.dismiss();
        }
        c cVar2 = this.f96916a;
        if (cVar2 == null) {
            h.f.b.l.b();
        }
        a(cVar2);
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.b
    public final void a() {
        c cVar = f96914c;
        if (cVar != null) {
            this.f96916a = cVar;
            f96914c = null;
            if (!com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.c()) {
                f().postDelayed(new m(new j(this)), 3000);
            } else {
                d();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InvitationReflowHelper f96932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f96933b;

        static {
            Covode.recordClassIndex(61510);
        }

        g(InvitationReflowHelper invitationReflowHelper, User user) {
            this.f96932a = invitationReflowHelper;
            this.f96933b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96932a.b(this.f96933b);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InvitationReflowHelper f96934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f96935b;

        static {
            Covode.recordClassIndex(61511);
        }

        h(InvitationReflowHelper invitationReflowHelper, User user) {
            this.f96934a = invitationReflowHelper;
            this.f96935b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96934a.b(this.f96935b);
        }
    }

    public static void a(androidx.fragment.app.e eVar) {
        new com.bytedance.tux.g.b(eVar).e(R.string.cmc).b();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        androidx.fragment.app.e b2 = b();
        if (b2 != null) {
            a(b2);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onComplianceDialogDone(com.ss.android.ugc.aweme.compliance.api.b.a aVar) {
        com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "onComplianceDialogDone");
        this.f96918e = true;
        d();
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ User $inviter;
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(InvitationReflowHelper invitationReflowHelper, User user) {
            super(1);
            this.this$0 = invitationReflowHelper;
            this.$inviter = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            InvitationReflowHelper.a(this.$inviter, "enter_profile");
            this.this$0.b(this.$inviter);
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ User $inviter;
        final /* synthetic */ h.f.a.b $primaryActionBlock;
        final /* synthetic */ int $primaryResId;
        final /* synthetic */ int $secondaryResId = R.string.cmd;
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(InvitationReflowHelper invitationReflowHelper, int i2, h.f.a.b bVar, User user) {
            super(1);
            this.this$0 = invitationReflowHelper;
            this.$primaryResId = i2;
            this.$primaryActionBlock = bVar;
            this.$inviter = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$primaryResId, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper.p.AnonymousClass1 */
                final /* synthetic */ p this$0;

                static {
                    Covode.recordClassIndex(61520);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.$primaryActionBlock.invoke(aVar);
                    return z.f158842a;
                }
            });
            dVar2.b(this.$secondaryResId, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper.p.AnonymousClass2 */
                final /* synthetic */ p this$0;

                static {
                    Covode.recordClassIndex(61521);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    InvitationReflowHelper.a(this.this$0.$inviter, "cancel");
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ User $inviter;
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(InvitationReflowHelper invitationReflowHelper, User user) {
            super(1);
            this.this$0 = invitationReflowHelper;
            this.$inviter = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.hfr, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper.q.AnonymousClass1 */
                final /* synthetic */ q this$0;

                static {
                    Covode.recordClassIndex(61523);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.a(this.this$0.$inviter);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.dh6, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        androidx.fragment.app.e b2;
        if (followStatus != null && followStatus.followStatus == 4 && (b2 = b()) != null) {
            new com.bytedance.tux.g.b(b2).e(R.string.evc).b();
        }
    }

    public InvitationReflowHelper(WeakReference<androidx.fragment.app.e> weakReference) {
        h.f.b.l.d(weakReference, "");
        this.f96923j = weakReference;
    }

    private final void a(c cVar) {
        com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", "request, info:".concat(String.valueOf(cVar)));
        InvitationApi invitationApi = InvitationApi.f96912a;
        String str = cVar.f96927a;
        if (str == null) {
            h.f.b.l.b();
        }
        String str2 = cVar.f96928b;
        if (str2 == null) {
            h.f.b.l.b();
        }
        String str3 = cVar.f96929c;
        if (str3 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.aweme.common.g.a(invitationApi.getInvitationInfo(str, str2, str3), new k(this, cVar), new l(this));
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.b
    public final void b(Intent intent) {
        h.f.b.l.d(intent, "");
        c cVar = f96914c;
        if (cVar == null) {
            cVar = c.a.a(intent);
        }
        f96914c = null;
        if (cVar.a()) {
            this.f96916a = cVar;
            if (!com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.c()) {
                f().postDelayed(new m(new i(this)), 3000);
            } else {
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(InvitationReflowHelper invitationReflowHelper) {
            super(1);
            this.this$0 = invitationReflowHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.common.f.c("InvitationReflowHelper", "request onError: " + ((com.ss.android.ugc.aweme.base.api.a.b.a) th2).getResponse());
            } else {
                androidx.fragment.app.e b2 = this.this$0.b();
                if (b2 != null) {
                    InvitationReflowHelper.a(b2);
                }
                com.ss.android.ugc.aweme.common.f.c("InvitationReflowHelper", "request onError: " + th2.getMessage());
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ c $info;
        final /* synthetic */ User $inviter;
        final /* synthetic */ androidx.fragment.app.e $this_showReflowDialog;
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(InvitationReflowHelper invitationReflowHelper, androidx.fragment.app.e eVar, User user, c cVar) {
            super(1);
            this.this$0 = invitationReflowHelper;
            this.$this_showReflowDialog = eVar;
            this.$inviter = user;
            this.$info = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            InvitationReflowHelper.a(this.$inviter, "follow");
            if (!a.a()) {
                this.this$0.f96916a = this.$info;
                com.ss.android.ugc.aweme.login.c.a(this.$this_showReflowDialog, "homepage_hot", "");
            } else if (this.$inviter.isBlock()) {
                InvitationReflowHelper invitationReflowHelper = this.this$0;
                User user = this.$inviter;
                if (invitationReflowHelper.b() != null) {
                    androidx.fragment.app.e b2 = invitationReflowHelper.b();
                    Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(b2).b(R.string.h44), new q(invitationReflowHelper, user)).a(false)).a().b().show();
                }
            } else {
                this.this$0.a(this.$inviter);
            }
            return z.f158842a;
        }
    }

    public final void b(User user) {
        int followStatus;
        SmartRouter.buildRoute(b(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "homepage_hot").withParam("enter_method", "follow_invite_popup").withParam("extra_from_pre_page", "homepage_hot").withParam("extra_previous_page_position", "follow_invite_popup").open();
        if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
            followStatus = 3;
        } else {
            followStatus = user.getFollowStatus();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("enter_method", "follow_invite_popup");
        String uid = user.getUid();
        h.f.b.l.b(uid, "");
        linkedHashMap.put("to_user_id", uid);
        linkedHashMap.put("follow_status", String.valueOf(followStatus));
        com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", linkedHashMap);
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<b, z> {
        final /* synthetic */ c $info;
        final /* synthetic */ InvitationReflowHelper this$0;

        static {
            Covode.recordClassIndex(61514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(InvitationReflowHelper invitationReflowHelper, c cVar) {
            super(1);
            this.this$0 = invitationReflowHelper;
            this.$info = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            String str;
            androidx.fragment.app.e b2;
            boolean z;
            View inflate;
            int i2;
            h.f.a.b bVar2;
            String str2;
            MethodCollector.i(9639);
            b bVar3 = bVar;
            h.f.b.l.d(bVar3, "");
            StringBuilder sb = new StringBuilder("request onResult, inviter:");
            User user = bVar3.f96980a;
            if (user != null) {
                str = user.getUid() + ", " + user.getFollowStatus() + ", " + user.isBlock + ", " + user.isBlocked();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.common.f.b("InvitationReflowHelper", sb.append(str).toString());
            if (!(bVar3.f96980a == null || (b2 = this.this$0.b()) == null)) {
                InvitationReflowHelper invitationReflowHelper = this.this$0;
                c cVar = this.$info;
                User user2 = bVar3.f96980a;
                if (invitationReflowHelper.c().a("swipe_up_guide")) {
                    com.ss.android.ugc.aweme.common.f.c("InvitationReflowHelper", "showReflowDialog blocked by swipe showing");
                } else {
                    invitationReflowHelper.f96916a = null;
                    if (user2.getFollowStatus() == 1 || user2.getFollowStatus() == 2 || user2.getFollowStatus() == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (a.a()) {
                        inflate = LayoutInflater.from(b2).inflate(R.layout.a26, (ViewGroup) null);
                        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.bu3);
                        com.ss.android.ugc.aweme.base.e.a(remoteImageView, user2.getAvatarThumb());
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        h.f.b.l.b(g2, "");
                        User curUser = g2.getCurUser();
                        h.f.b.l.b(curUser, "");
                        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) inflate.findViewById(R.id.bu5), curUser.getAvatarThumb());
                        remoteImageView.setOnClickListener(new g(invitationReflowHelper, user2));
                        h.f.b.l.b(inflate, "");
                    } else {
                        inflate = LayoutInflater.from(b2).inflate(R.layout.a25, (ViewGroup) null);
                        RemoteImageView remoteImageView2 = (RemoteImageView) inflate.findViewById(R.id.bu0);
                        remoteImageView2.setOnClickListener(new h(invitationReflowHelper, user2));
                        com.ss.android.ugc.aweme.base.e.a(remoteImageView2, user2.getAvatarThumb());
                        h.f.b.l.b(inflate, "");
                    }
                    if (user2.isBlocked() || z) {
                        str2 = b2.getString(R.string.c1j);
                        h.f.b.l.b(str2, "");
                        i2 = R.string.cme;
                        bVar2 = new n(invitationReflowHelper, user2);
                    } else {
                        str2 = b2.getString(R.string.cmg, new Object[]{user2.getNickname()});
                        h.f.b.l.b(str2, "");
                        i2 = R.string.clk;
                        bVar2 = new o(invitationReflowHelper, b2, user2, cVar);
                    }
                    com.bytedance.tux.dialog.a a2 = ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.e.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.e.d.a(new com.bytedance.tux.dialog.b(b2), inflate, 0).b(str2).b(R.string.cmf), new p(invitationReflowHelper, i2, bVar2, user2)).a(false)).a();
                    invitationReflowHelper.f96917b = new WeakReference<>(a2);
                    a2.b().show();
                    InvitationReflowHelper.a(user2, "show");
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(9639);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.b
    public final void a(Intent intent) {
        h.f.b.l.d(intent, "");
        androidx.fragment.app.e b2 = b();
        if (b2 == null) {
            h.f.b.l.b();
        }
        b2.getLifecycle().a(this);
        cg.a(this);
        c().a(this.f96922i);
        com.ss.android.ugc.aweme.account.b.g().addUserChangeListener(this);
        b(intent);
    }

    public final void a(User user) {
        boolean z;
        String str;
        if (e().j()) {
            com.ss.android.ugc.aweme.common.f.c("InvitationReflowHelper", "doFollowInviter loading now, " + user.getUid());
            return;
        }
        e().a_(this);
        com.ss.android.ugc.aweme.profile.presenter.o e2 = e();
        n.a b2 = new n.a().a(user.getUid()).b(user.getSecUid());
        if (user.isSecret() || user.isPrivateAccount()) {
            z = true;
        } else {
            z = false;
        }
        e2.a(b2.a(z).a(1).b(29).d(user.getFollowerStatus()).a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uid = user.getUid();
        h.f.b.l.b(uid, "");
        linkedHashMap.put("to_user_id", uid);
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("enter_method", "follow_invite_popup");
        if (user.getFollowerStatus() == 1) {
            str = "mutual";
        } else {
            str = "single";
        }
        linkedHashMap.put("follow_type", str);
        com.ss.android.ugc.aweme.common.r.a("follow", linkedHashMap);
    }

    public static void a(User user, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uid = user.getUid();
        h.f.b.l.b(uid, "");
        linkedHashMap.put("to_user_id", uid);
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("action_type", str);
        if (a.a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        linkedHashMap.put("is_login", str2);
        com.ss.android.ugc.aweme.common.r.a("invitee_guide_follow_pop_up", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService.a
    public final void a(int i2, User user, User user2) {
        com.bytedance.tux.dialog.a aVar;
        if (i2 == 1) {
            if (a.a()) {
                WeakReference<com.bytedance.tux.dialog.a> weakReference = this.f96917b;
                if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                    aVar.dismiss();
                }
                d();
            }
        } else if (i2 == 3) {
            b.f96924a = false;
        }
    }
}
