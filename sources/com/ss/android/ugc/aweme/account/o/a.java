package com.ss.android.ugc.aweme.account.o;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.h.a.g;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.aq;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.BaseBindService;
import com.zhiliaoapp.musically.R;
import f.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.account.login.v2.ui.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static final q<com.ss.android.ugc.aweme.account.login.v2.base.c, String, String, n<com.bytedance.sdk.a.a.a.d<g>>> f65209a = b.f65213a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1454a f65210b = new C1454a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f65211c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    private HashMap f65212d;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final View c(int i2) {
        if (this.f65212d == null) {
            this.f65212d = new HashMap();
        }
        View view = (View) this.f65212d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65212d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean e() {
        return ((Boolean) this.f65211c.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void h() {
        HashMap hashMap = this.f65212d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.a$a  reason: collision with other inner class name */
    public static final class C1454a {
        static {
            Covode.recordClassIndex(40102);
        }

        private C1454a() {
        }

        public /* synthetic */ C1454a(byte b2) {
            this();
        }

        public static int a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            l.d(cVar, "");
            if (cVar.A() == j.MODIFY_PHONE) {
                return 6;
            }
            Bundle arguments = cVar.getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.getBoolean("from_changePwd")) {
                return 11;
            }
            return 6;
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
        }
    }

    static {
        Covode.recordClassIndex(40101);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        int i3;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (e()) {
            i2 = R.string.fov;
        } else {
            i2 = R.string.fny;
        }
        bVar.f65051e = getString(i2);
        if (e()) {
            i3 = R.string.fou;
        } else {
            i3 = R.string.fnx;
        }
        bVar.f65052f = getString(i3);
        bVar.f65047a = " ";
        bVar.f65056j = false;
        bVar.f65054h = true;
        return bVar;
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65216b;

        static {
            Covode.recordClassIndex(40106);
        }

        e(a aVar, String str) {
            this.f65215a = aVar;
            this.f65216b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f65215a.a(this.f65216b, true);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65214a;

        static {
            Covode.recordClassIndex(40105);
        }

        d(a aVar) {
            this.f65214a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f65214a.e()) {
                r.onEventV3("verify_email_page_use_new_email");
            }
            Bundle bundle = new Bundle(this.f65214a.getArguments());
            bundle.putInt("next_page", k.INPUT_EMAIL_CHANGE.getValue());
            com.ss.android.ugc.aweme.account.login.v2.base.e.a(bundle, "");
            this.f65214a.a(bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void a(String str) {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        l.d(str, "");
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), str, A());
        if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
            f65209a.invoke(this, str, "user_click").d(new e(this, str)).c();
        } else {
            a(str, false);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65217a;

        static {
            Covode.recordClassIndex(40107);
        }

        f(a aVar) {
            this.f65217a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f65217a.e()) {
                r.onEventV3("verify_email_page_use_phone");
            }
            Bundle arguments = this.f65217a.getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.getInt("last_scene", -1) == j.BIND_PHONE.getValue()) {
                androidx.fragment.app.e activity = this.f65217a.getActivity();
                if (activity == null) {
                    l.b();
                }
                activity.finish();
                return;
            }
            BaseBindService h2 = cj.h();
            androidx.fragment.app.e activity2 = this.f65217a.getActivity();
            String w = this.f65217a.w();
            androidx.fragment.app.e activity3 = this.f65217a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
            h2.bindMobile(activity2, w, ((CommonFlowActivity) activity3).h(), new IAccountService.g(this) {
                /* class com.ss.android.ugc.aweme.account.o.a.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f65218a;

                static {
                    Covode.recordClassIndex(40108);
                }

                {
                    this.f65218a = r1;
                }

                @Override // com.ss.android.ugc.aweme.IAccountService.g
                public final void onResult(int i2, int i3, Object obj) {
                    if (i3 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("platForm", "phone");
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.BindMobileFinishData");
                        String optString = new JSONObject(((aq) obj).f66963b).optString("ticket", "");
                        l.b(optString, "");
                        com.ss.android.ugc.aweme.account.login.v2.base.e.d(bundle, optString);
                        androidx.fragment.app.e activity = this.f65218a.f65217a.getActivity();
                        if (!(activity instanceof CommonFlowActivity)) {
                            activity = null;
                        }
                        CommonFlowActivity commonFlowActivity = (CommonFlowActivity) activity;
                        if (commonFlowActivity != null) {
                            commonFlowActivity.a(i2, bundle);
                        }
                    }
                }
            });
        }
    }

    public final void a(String str, boolean z) {
        l.d(str, "");
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, str);
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        arguments.putInt("next_page", k.EMAIL_SMS_VERIFY.getValue());
        l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        i().setEnabled(false);
        i().setTextColor(androidx.core.content.b.c(i().getContext(), R.color.bz));
        TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
        tuxTextView.setVisibility(0);
        tuxTextView.setOnClickListener(new d(this));
        if (e()) {
            i2 = R.string.fot;
        } else {
            i2 = R.string.fnu;
        }
        tuxTextView.setText(getString(i2));
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        if (arguments.getBoolean("use_phone") || e()) {
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4k);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            TuxTextView tuxTextView3 = (TuxTextView) c(R.id.a4k);
            l.b(tuxTextView3, "");
            com.ss.android.ugc.aweme.account.login.v2.ui.q.a(tuxTextView3, new f(this), R.string.fnv, R.string.fnw);
        }
    }

    static final class b extends m implements q<com.ss.android.ugc.aweme.account.login.v2.base.c, String, String, n<com.bytedance.sdk.a.a.a.d<g>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65213a = new b();

        static {
            Covode.recordClassIndex(40103);
        }

        b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ n<com.bytedance.sdk.a.a.a.d<g>> invoke(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar2 = cVar;
            String str3 = str;
            String str4 = str2;
            l.d(cVar2, "");
            l.d(str3, "");
            l.d(str4, "");
            if (b.f65219a[cVar2.A().ordinal()] != 1) {
                return x.a(cVar2, str3, C1454a.a(cVar2), str4, (Map) null, (String) null, 112);
            }
            return x.a(cVar2, "", C1454a.a(cVar2), str4, (Map) null, (String) null, 112);
        }
    }
}
