package com.ss.android.ugc.aweme.account.d;

import android.os.Bundle;
import android.text.TextUtils;
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
import f.a.d.f;
import f.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.account.login.v2.ui.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f62931a = 7;

    /* renamed from: b  reason: collision with root package name */
    public static final q<com.ss.android.ugc.aweme.account.login.v2.base.c, String, String, n<com.bytedance.sdk.a.a.a.d<g>>> f62932b = b.f62937a;

    /* renamed from: c  reason: collision with root package name */
    public static final C1388a f62933c = new C1388a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final h f62934d = i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f62935j;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final View c(int i2) {
        if (this.f62935j == null) {
            this.f62935j = new HashMap();
        }
        View view = (View) this.f62935j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62935j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean e() {
        return ((Boolean) this.f62934d.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void h() {
        HashMap hashMap = this.f62935j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.a$a  reason: collision with other inner class name */
    public static final class C1388a {
        static {
            Covode.recordClassIndex(38770);
        }

        private C1388a() {
        }

        public /* synthetic */ C1388a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38772);
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
        Covode.recordClassIndex(38769);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void g() {
        if (e()) {
            r.a("input_wrong_email", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Email Captcha").a("error_code", "1").f62575a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        int i3;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (e()) {
            i2 = R.string.fos;
        } else {
            i2 = R.string.fnu;
        }
        bVar.f65051e = getString(i2);
        if (e()) {
            i3 = R.string.f371for;
        } else {
            i3 = R.string.fns;
        }
        bVar.f65052f = getString(i3);
        bVar.f65047a = " ";
        bVar.f65056j = false;
        bVar.f65054h = true;
        return bVar;
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62938a;

        static {
            Covode.recordClassIndex(38773);
        }

        d(a aVar) {
            this.f62938a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f62938a.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void a(String str) {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        l.d(str, "");
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, str);
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), str, A());
        if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
            f62932b.invoke(this, str, "user_click").d(new d(this)).c();
        } else {
            a(false);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62939a;

        static {
            Covode.recordClassIndex(38774);
        }

        e(a aVar) {
            this.f62939a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f62939a.e()) {
                r.onEventV3("Enter_new_email_page_use_phone");
            }
            Bundle arguments = this.f62939a.getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.getInt("last_scene", -1) == j.BIND_PHONE.getValue()) {
                androidx.fragment.app.e activity = this.f62939a.getActivity();
                if (activity == null) {
                    l.b();
                }
                activity.finish();
                return;
            }
            BaseBindService h2 = cj.h();
            androidx.fragment.app.e activity2 = this.f62939a.getActivity();
            String w = this.f62939a.w();
            androidx.fragment.app.e activity3 = this.f62939a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
            h2.bindMobile(activity2, w, ((CommonFlowActivity) activity3).h(), new IAccountService.g(this) {
                /* class com.ss.android.ugc.aweme.account.d.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f62940a;

                static {
                    Covode.recordClassIndex(38775);
                }

                {
                    this.f62940a = r1;
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
                        androidx.fragment.app.e activity = this.f62940a.f62939a.getActivity();
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

    public final void a(boolean z) {
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        arguments.putInt("next_page", k.EMAIL_SMS_CHANGE.getValue());
        l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        if (arguments.getBoolean("use_phone") || e()) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView2, "");
            ((TuxTextView) c(R.id.a4j)).setTextColor(androidx.core.content.b.c(tuxTextView2.getContext(), R.color.bx));
            TuxTextView tuxTextView3 = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView3, "");
            com.ss.android.ugc.aweme.account.login.v2.ui.q.a(tuxTextView3, new e(this), R.string.fnv, R.string.fnw);
        }
    }

    static final class b extends m implements q<com.ss.android.ugc.aweme.account.login.v2.base.c, String, String, n<com.bytedance.sdk.a.a.a.d<g>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62937a = new b();

        static {
            Covode.recordClassIndex(38771);
        }

        b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ n<com.bytedance.sdk.a.a.a.d<g>> invoke(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            HashMap hashMap;
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar2 = cVar;
            String str3 = str;
            String str4 = str2;
            l.d(cVar2, "");
            l.d(str3, "");
            l.d(str4, "");
            String e2 = com.ss.android.ugc.aweme.account.login.v2.base.e.e(cVar2);
            if (!TextUtils.isEmpty(e2)) {
                hashMap = new HashMap();
                hashMap.put("ticket", e2);
            } else {
                hashMap = null;
            }
            return x.a(cVar2, str3, a.f62931a, str4, hashMap, (String) null, 96);
        }
    }
}
