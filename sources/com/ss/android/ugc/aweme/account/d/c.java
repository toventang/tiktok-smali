package com.ss.android.ugc.aweme.account.d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.o;
import com.bytedance.sdk.a.h.a.g;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.l;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.account.o.d;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Map;

public final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f62948a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f62949b;

    static {
        Covode.recordClassIndex(38781);
    }

    private String g() {
        return (String) this.f62948a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f62949b == null) {
            this.f62949b = new HashMap();
        }
        View view = (View) this.f62949b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62949b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f62949b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.a(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62953a;

        static {
            Covode.recordClassIndex(38786);
        }

        d(c cVar) {
            this.f62953a = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f62953a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        c("resend").c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final l e() {
        l lVar = new l();
        lVar.a(g());
        lVar.f64883b = false;
        lVar.f64885d = false;
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.arr);
        bVar.f65052f = getString(R.string.ars, g());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c("auto_system").c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        h.f.b.l.d(str, "");
        x.b(this, str, 6, null).d(new b(this)).c();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62950a;

        static {
            Covode.recordClassIndex(38783);
        }

        b(c cVar) {
            this.f62950a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            o oVar = (o) obj;
            c cVar = this.f62950a;
            Bundle arguments = this.f62950a.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            Bundle bundle = new Bundle(arguments);
            e.a(bundle, "");
            String str = oVar.f43104j;
            h.f.b.l.b(str, "");
            e.d(bundle, str);
            bundle.putInt("next_page", k.INPUT_EMAIL_CHANGE.getValue());
            cVar.a(bundle);
        }
    }

    private n<com.bytedance.sdk.a.a.a.d<g>> c(String str) {
        h.f.b.l.d(str, "");
        n<com.bytedance.sdk.a.a.a.d<g>> a2 = x.a(this, g(), 6, str, (Map) null, (String) null, 112).a((f.a.d.a) new d(this));
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1390c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62951a;

        static {
            Covode.recordClassIndex(38784);
        }

        View$OnClickListenerC1390c(c cVar) {
            this.f62951a = cVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.account.login.ui.a aVar;
            ClickAgent.onClick(view);
            User f2 = cj.f();
            h.f.b.l.b(f2, "");
            if (f2.isPhoneBinded()) {
                User f3 = cj.f();
                h.f.b.l.b(f3, "");
                if (!TextUtils.isEmpty(f3.getBindPhone())) {
                    User f4 = cj.f();
                    h.f.b.l.b(f4, "");
                    String bindPhone = f4.getBindPhone();
                    androidx.fragment.app.e activity = this.f62951a.getActivity();
                    h.f.b.l.b(bindPhone, "");
                    TimerHolder.b a2 = TimerHolder.a.a(activity, bindPhone, this.f62951a.A());
                    if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
                        d.a.a(this.f62951a, bindPhone, "auto_system").d(new f(this) {
                            /* class com.ss.android.ugc.aweme.account.d.c.View$OnClickListenerC1390c.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ View$OnClickListenerC1390c f62952a;

                            static {
                                Covode.recordClassIndex(38785);
                            }

                            {
                                this.f62952a = r1;
                            }

                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(Object obj) {
                                this.f62952a.f62951a.a(true);
                            }
                        }).c();
                        return;
                    } else {
                        this.f62951a.a(false);
                        return;
                    }
                }
            }
            com.ss.android.ugc.aweme.account.n.g.b(this.f62951a.getContext(), this.f62951a.w(), this.f62951a.x());
        }
    }

    public final void a(boolean z) {
        e.a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            h.f.b.l.b();
        }
        Bundle bundle = new Bundle(arguments);
        e.a(bundle, "");
        bundle.putInt("next_page", k.VERIFY_PHONE.getValue());
        bundle.putInt("next_next_page", k.INPUT_EMAIL_CHANGE.getValue());
        User f2 = cj.f();
        h.f.b.l.b(f2, "");
        String bindPhone = f2.getBindPhone();
        h.f.b.l.b(bindPhone, "");
        e.b(bundle, bindPhone);
        a(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(getString(R.string.fnt));
        ((TuxTextView) c(R.id.a4j)).setOnClickListener(new View$OnClickListenerC1390c(this));
    }
}
