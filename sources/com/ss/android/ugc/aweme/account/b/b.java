package com.ss.android.ugc.aweme.account.b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.h.a.g;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
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
import java.util.Map;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.account.login.v2.ui.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f62870a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static final q<com.ss.android.ugc.aweme.account.login.v2.base.c, String, String, n<com.bytedance.sdk.a.a.a.d<g>>> f62871b = C1385b.f62876a;

    /* renamed from: c  reason: collision with root package name */
    public static final String f62872c = "email_bundling_success";

    /* renamed from: d  reason: collision with root package name */
    public static final a f62873d = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private final h f62874j = i.a((h.f.a.a) new c(this));

    /* renamed from: k  reason: collision with root package name */
    private HashMap f62875k;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final View c(int i2) {
        if (this.f62875k == null) {
            this.f62875k = new HashMap();
        }
        View view = (View) this.f62875k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62875k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean e() {
        return ((Boolean) this.f62874j.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void h() {
        HashMap hashMap = this.f62875k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.c, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38732);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
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
        Covode.recordClassIndex(38731);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        KeyboardUtils.c(i());
        c.a(w());
        return super.q();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void g() {
        if (e()) {
            r.a("input_wrong_email", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Email Captcha").a("error_code", "1").f62575a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.b.b.p():com.ss.android.ugc.aweme.account.login.v2.ui.b");
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f62878b;

        static {
            Covode.recordClassIndex(38735);
        }

        d(b bVar, String str) {
            this.f62877a = bVar;
            this.f62878b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f62877a.a(this.f62878b, true);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.a(w(), "email");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.c
    public final void a(String str) {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        l.d(str, "");
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, str);
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), str, A());
        if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
            f62871b.invoke(this, str, "user_click").d(new d(this, str)).c();
        } else {
            a(str, false);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62879a;

        static {
            Covode.recordClassIndex(38736);
        }

        e(b bVar) {
            this.f62879a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f62879a.e()) {
                r.onEventV3("set_up_by_phone");
            }
            Bundle arguments = this.f62879a.getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.getInt("last_scene", -1) != -1) {
                androidx.fragment.app.e activity = this.f62879a.getActivity();
                if (activity == null) {
                    l.b();
                }
                activity.finish();
                return;
            }
            BaseBindService h2 = cj.h();
            androidx.fragment.app.e activity2 = this.f62879a.getActivity();
            String w = this.f62879a.w();
            androidx.fragment.app.e activity3 = this.f62879a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity");
            h2.bindMobile(activity2, w, ((CommonFlowActivity) activity3).h(), new IAccountService.g(this) {
                /* class com.ss.android.ugc.aweme.account.b.b.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f62880a;

                static {
                    Covode.recordClassIndex(38737);
                }

                {
                    this.f62880a = r1;
                }

                @Override // com.ss.android.ugc.aweme.IAccountService.g
                public final void onResult(int i2, int i3, Object obj) {
                    if (i3 == 1) {
                        androidx.fragment.app.e activity = this.f62880a.f62879a.getActivity();
                        if (!(activity instanceof CommonFlowActivity)) {
                            activity = null;
                        }
                        CommonFlowActivity commonFlowActivity = (CommonFlowActivity) activity;
                        if (commonFlowActivity != null) {
                            commonFlowActivity.a(i2, (Bundle) null);
                        }
                    }
                }
            });
        }
    }

    public final void a(String str, boolean z) {
        l.d(str, "");
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        arguments.putInt("next_page", k.EMAIL_SMS_BIND.getValue());
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
            ((TuxTextView) c(R.id.a4j)).setTextColor(androidx.core.content.b.c(view.getContext(), R.color.bx));
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView2, "");
            com.ss.android.ugc.aweme.account.login.v2.ui.q.a(tuxTextView2, new e(this), R.string.fnv, R.string.fnw);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.b$b  reason: collision with other inner class name */
    static final class C1385b extends m implements q<com.ss.android.ugc.aweme.account.login.v2.base.c, String, String, n<com.bytedance.sdk.a.a.a.d<g>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1385b f62876a = new C1385b();

        static {
            Covode.recordClassIndex(38733);
        }

        C1385b() {
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
            return x.a(cVar2, str3, b.f62870a, str4, (Map) null, (String) null, 112);
        }
    }
}
