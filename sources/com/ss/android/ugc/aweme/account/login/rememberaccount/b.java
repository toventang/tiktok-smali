package com.ss.android.ugc.aweme.account.login.rememberaccount;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.a.h.b.a.k;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.base.g;
import com.ss.android.ugc.aweme.account.m.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.account.login.v2.base.c implements m.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63639b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    m f63640a;

    /* renamed from: c  reason: collision with root package name */
    private final h f63641c = i.a((h.f.a.a) new e(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f63642d = i.a((h.f.a.a) new C1420b(this));

    /* renamed from: e  reason: collision with root package name */
    private HashMap f63643e;

    static {
        Covode.recordClassIndex(39235);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final String Z_() {
        return "LoginMethodListFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void b_(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final View c(int i2) {
        if (this.f63643e == null) {
            this.f63643e = new HashMap();
        }
        View view = (View) this.f63643e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63643e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final Bundle g() {
        return (Bundle) this.f63641c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void h() {
        HashMap hashMap = this.f63643e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final Map<String, Object> i() {
        return (Map) this.f63642d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final boolean q() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39236);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.m.a
    public final void e() {
        B();
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f63644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f63645b;

        static {
            Covode.recordClassIndex(39238);
        }

        public static final class a extends k {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f63646c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h.f.a.m f63647d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f63648e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ BaseLoginMethod f63649f;

            static {
                Covode.recordClassIndex(39239);
            }

            /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$a$a  reason: collision with other inner class name */
            static final class RunnableC1421a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h.f.a.a f63650a;

                static {
                    Covode.recordClassIndex(39240);
                }

                RunnableC1421a(h.f.a.a aVar) {
                    this.f63650a = aVar;
                }

                public final void run() {
                    this.f63650a.invoke();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$a$b  reason: collision with other inner class name */
            static final class C1422b extends h.f.b.m implements h.f.a.a<z> {
                final /* synthetic */ com.bytedance.sdk.a.a.a.e $response;
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(39241);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1422b(a aVar, com.bytedance.sdk.a.a.a.e eVar) {
                    super(0);
                    this.this$0 = aVar;
                    this.$response = eVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.bytedance.sdk.a.n.a aVar;
                    String str = this.this$0.f63648e;
                    b bVar = this.this$0.f63646c.f63644a;
                    com.bytedance.sdk.a.a.a.e eVar = this.$response;
                    if (eVar != null) {
                        aVar = eVar.f43082j;
                    } else {
                        aVar = null;
                    }
                    v.a(false, str, (g) bVar, aVar, (Map) this.this$0.f63646c.f63644a.i(), false, 32);
                    boolean z = false;
                    d.a.b(0, 0, "");
                    com.bytedance.sdk.a.a.a.e eVar2 = this.$response;
                    if (eVar2 == null) {
                        l.b();
                    }
                    cj.a(eVar2.f43082j);
                    Bundle arguments = this.this$0.f63646c.f63644a.getArguments();
                    if (arguments == null) {
                        l.b();
                    }
                    com.ss.android.ugc.aweme.account.d.a(arguments, this.this$0.f63646c.f63644a.getActivity(), new h.f.a.b<b.i<Bundle>, z>(this) {
                        /* class com.ss.android.ugc.aweme.account.login.rememberaccount.b.c.a.C1422b.AnonymousClass1 */
                        final /* synthetic */ C1422b this$0;

                        static {
                            Covode.recordClassIndex(39242);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(b.i<Bundle> iVar) {
                            l.d(iVar, "");
                            this.this$0.this$0.f63646c.f63644a.k();
                            b bVar = this.this$0.this$0.f63646c.f63644a;
                            Bundle arguments = this.this$0.this$0.f63646c.f63644a.getArguments();
                            if (arguments == null) {
                                l.b();
                            }
                            l.b(arguments, "");
                            bVar.b(arguments);
                            return z.f158842a;
                        }
                    });
                    if (l.a((Object) this.this$0.f63649f.isFromReInstallNet(), (Object) true)) {
                        String uid = this.this$0.f63649f.getUid();
                        String valueOf = String.valueOf(this.$response.f43082j.f43463a);
                        l.d(uid, "");
                        l.d(valueOf, "");
                        for (T t : q.f63528b) {
                            if (l.a((Object) t.getUid(), (Object) uid)) {
                                t.setUid(valueOf);
                                t.setLoginTime(Long.valueOf(System.currentTimeMillis()));
                                t.setTransToNormal(true);
                                z = true;
                            }
                        }
                        if (z) {
                            q.f();
                        }
                    }
                    return z.f158842a;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.e eVar) {
                com.bytedance.sdk.a.n.a aVar;
                com.bytedance.sdk.a.a.a.e eVar2 = eVar;
                C1422b bVar = new C1422b(this, eVar2);
                if (eVar2 == null || (aVar = eVar2.f43082j) == null || !aVar.f43474l) {
                    bVar.invoke();
                } else {
                    com.ss.android.ugc.aweme.compliance.api.a.q().a(true, new RunnableC1421a(bVar));
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.e eVar, int i2) {
                String str;
                com.bytedance.sdk.a.a.a.e eVar2 = eVar;
                h.f.a.m mVar = this.f63647d;
                Integer valueOf = Integer.valueOf(i2);
                if (eVar2 != null) {
                    str = eVar2.f43075f;
                } else {
                    str = null;
                }
                mVar.invoke(valueOf, str);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.e eVar, String str) {
                com.bytedance.sdk.a.a.a.e eVar2 = eVar;
                l.d(eVar2, "");
                super.a(eVar2, str);
                this.f63647d.invoke(Integer.valueOf(eVar2.f43073d), eVar2.f43075f);
            }

            a(c cVar, h.f.a.m mVar, String str, BaseLoginMethod baseLoginMethod) {
                this.f63646c = cVar;
                this.f63647d = mVar;
                this.f63648e = str;
                this.f63649f = baseLoginMethod;
            }
        }

        private static boolean b() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.account.login.rememberaccount.e
        public final void a() {
            Bundle bundle = new Bundle(this.f63644a.g());
            bundle.putString("enter_from", "trust_one_click_pad");
            bundle.putString("enter_method", "add_a_account");
            Map<String, Object> a2 = v.a(bundle);
            if (a2 == null) {
                l.b();
            }
            a2.put("login_last_time", 1);
            androidx.fragment.app.e activity = this.f63644a.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            I18nSignUpActivity.a.a(activity, bundle, true, true, false);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$b  reason: collision with other inner class name */
        static final class C1423b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ BaseLoginMethod $method;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(39243);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1423b(c cVar, BaseLoginMethod baseLoginMethod) {
                super(0);
                this.this$0 = cVar;
                this.$method = baseLoginMethod;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String w = this.this$0.f63644a.w();
                l.b(w, "");
                String x = this.this$0.f63644a.x();
                l.b(x, "");
                com.ss.android.ugc.aweme.account.a.b.a a2 = I18nSignUpActivity.a.a(w, x, "click_login", v.a(this.this$0.f63644a.g()));
                if (this.$method.getLoginMethodName() == LoginMethodName.THIRD_PARTY) {
                    StringBuilder sb = new StringBuilder();
                    BaseLoginMethod baseLoginMethod = this.$method;
                    Objects.requireNonNull(baseLoginMethod, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.TPLoginMethod");
                    a2.a(sb.append(((TPLoginMethod) baseLoginMethod).getPlatform()).append("_is_show").toString(), 1);
                } else {
                    a2.a("phone_email_show", 1);
                }
                r.a("login_notify", a2.f62575a);
                Bundle bundle = new Bundle(this.this$0.f63644a.g());
                bundle.putBoolean("disable_auto_gms", true);
                LoginService g2 = cj.g();
                Objects.requireNonNull(g2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.LoginService");
                Context context = this.this$0.f63645b.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                if (!g2.loginByMethod((Activity) context, bundle, this.$method)) {
                    Context context2 = this.this$0.f63645b.getContext();
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    I18nSignUpActivity.a.a((Activity) context2, bundle, true, false, false);
                }
                return z.f158842a;
            }
        }

        c(b bVar, View view) {
            this.f63644a = bVar;
            this.f63645b = view;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$c  reason: collision with other inner class name */
        static final class C1424c extends h.f.b.m implements h.f.a.m<Integer, String, z> {
            final /* synthetic */ h.f.a.a $login;
            final /* synthetic */ String $platForm;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(39244);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1424c(c cVar, String str, h.f.a.a aVar) {
                super(2);
                this.this$0 = cVar;
                this.$platForm = str;
                this.$login = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Integer num, String str) {
                int intValue = num.intValue();
                String str2 = str;
                d.a.b(1, intValue, str2);
                v.a(false, intValue, this.$platForm, (g) this.this$0.f63644a, (Map) this.this$0.f63644a.i(), false, 32);
                this.this$0.f63644a.k();
                if (intValue == 2029 || intValue == 1321) {
                    this.$login.invoke();
                } else {
                    b bVar = this.this$0.f63644a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bVar.a(intValue, str2);
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.account.login.rememberaccount.e
        public final void a(BaseLoginMethod baseLoginMethod, int i2) {
            String str;
            String str2;
            String str3;
            String uid;
            String str4 = "";
            l.d(baseLoginMethod, str4);
            this.f63644a.getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = b();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f63645b.getContext()).a(this.f63644a.getString(R.string.de8)).a();
                return;
            }
            C1423b bVar = new C1423b(this, baseLoginMethod);
            CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
            Long l2 = null;
            if (commonUserInfo != null) {
                str = commonUserInfo.getSecUid();
            } else {
                str = null;
            }
            int i3 = 1;
            boolean z = !TextUtils.isEmpty(str);
            if (z) {
                CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo2 == null) {
                    l.b();
                }
                String secUid = commonUserInfo2.getSecUid();
                if (secUid == null) {
                    l.b();
                }
                l.d(secUid, str4);
                l.d("d_ticket", str4);
                if (!TextUtils.isEmpty(secUid)) {
                    str2 = Keva.getRepo("aweme_user_config__".concat(String.valueOf(secUid))).getString("d_ticket", str4);
                    if ((!(!l.a((Object) baseLoginMethod.getAllowOneKeyLogin(), (Object) true)) || TextUtils.isEmpty(str2)) && (!l.a((Object) baseLoginMethod.isFromReInstallNet(), (Object) true))) {
                        bVar.invoke();
                    }
                    String a2 = a.a(baseLoginMethod);
                    b bVar2 = this.f63644a;
                    if (bVar2.f63640a == null) {
                        Context context = bVar2.getContext();
                        if (context == null) {
                            l.b();
                        }
                        bVar2.f63640a = new m(context);
                        m mVar = bVar2.f63640a;
                        if (mVar == null) {
                            l.b();
                        }
                        mVar.f63490a = bVar2;
                    }
                    bt.a(bVar2.f63640a);
                    if (baseLoginMethod.getLoginTime() != null) {
                        Long loginTime = baseLoginMethod.getLoginTime();
                        if (loginTime == null) {
                            l.b();
                        }
                        if (loginTime.longValue() > 0) {
                            Long loginTime2 = baseLoginMethod.getLoginTime();
                            if (loginTime2 == null) {
                                l.b();
                            }
                            l2 = Long.valueOf(loginTime2.longValue() / 1000);
                        }
                    }
                    Map<String, Object> i4 = this.f63644a.i();
                    if (i4 != null) {
                        i4.put("order", String.valueOf(i2));
                    }
                    b bVar3 = this.f63644a;
                    v.a((Boolean) false, a2, (g) bVar3, false, (Map) bVar3.i(), false, 40);
                    a aVar = new a(this, new C1424c(this, a2, bVar), a2, baseLoginMethod);
                    this.f63644a.b(aVar);
                    HashMap hashMap = new HashMap();
                    if (l.a((Object) baseLoginMethod.isFromReInstallNet(), (Object) true)) {
                        str3 = "true";
                    } else {
                        str3 = "false";
                    }
                    hashMap.put("is_reinstall", str3);
                    com.bytedance.sdk.a.a.e z2 = this.f63644a.z();
                    if (z) {
                        CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
                        if (commonUserInfo3 == null) {
                            l.b();
                        }
                        uid = commonUserInfo3.getSecUid();
                        if (uid == null) {
                            l.b();
                        }
                    } else {
                        uid = baseLoginMethod.getUid();
                    }
                    l.d(baseLoginMethod, str4);
                    int i5 = com.ss.android.ugc.aweme.account.login.r.f63535a[baseLoginMethod.getLoginMethodName().ordinal()];
                    if (i5 == 1 || i5 == 2 || i5 == 3) {
                        i3 = 3;
                    } else if (i5 != 4) {
                        if (i5 != 5) {
                            i3 = -1;
                        } else {
                            i3 = 2;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i3);
                    if (baseLoginMethod instanceof TPLoginMethod) {
                        str4 = ((TPLoginMethod) baseLoginMethod).getPlatform();
                    }
                    z2.a(uid, z, str2, valueOf, l2, str4, hashMap, aVar);
                    return;
                }
            }
            str2 = str4;
            if (!(!l.a((Object) baseLoginMethod.getAllowOneKeyLogin(), (Object) true))) {
            }
            bVar.invoke();
        }
    }

    public final void k() {
        bt.b(this.f63640a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$b  reason: collision with other inner class name */
    static final class C1420b extends h.f.b.m implements h.f.a.a<Map<String, Object>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1420b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Object> invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return ad.h(arguments.getSerializable("ONE_KEY_LOGIN_MOB_PARAMS"));
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Bundle> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return arguments.getBundle("origin_bundle");
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f63651a;

        static {
            Covode.recordClassIndex(39245);
        }

        d(b bVar) {
            this.f63651a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Bundle bundle = new Bundle(this.f63651a.g());
            bundle.putString("enter_from", "trust_one_click_pad");
            bundle.putString("enter_method", "sign_in");
            Map<String, Object> a2 = v.a(bundle);
            if (a2 == null) {
                l.b();
            }
            a2.put("login_last_time", 1);
            androidx.fragment.app.e activity = this.f63651a.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            I18nSignUpActivity.a.a(activity, bundle, false, true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (i2 < 0) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(getString(R.string.de8)).a();
        } else if (!TextUtils.isEmpty(str)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(str).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        List g2 = n.g((Collection) q.a(cj.f71084b.e().allUidList()));
        RecyclerView recyclerView = (RecyclerView) c(R.id.cm0);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) c(R.id.cm0);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(new c(g2, new c(this, view)));
        ((TuxTextView) c(R.id.cfr)).setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        String string = getString(R.string.fh);
        l.b(string, "");
        String string2 = getString(R.string.fg, string);
        l.b(string2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int a2 = p.a((CharSequence) string2, string, 0, false, 6);
        TuxTextView tuxTextView = (TuxTextView) c(R.id.cfr);
        l.b(tuxTextView, "");
        int c2 = androidx.core.content.b.c(tuxTextView.getContext(), R.color.bh);
        spannableStringBuilder.setSpan(new LoginMethodListFragment$onViewCreated$2(c2, c2), a2, string.length() + a2, 34);
        TuxTextView tuxTextView2 = (TuxTextView) c(R.id.cfr);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(spannableStringBuilder);
        ((TuxTextView) c(R.id.cfr)).setOnClickListener(new d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ga, viewGroup, false);
    }
}
