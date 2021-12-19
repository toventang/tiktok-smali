package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.o;
import com.ss.android.ugc.aweme.account.login.twostep.r;
import com.ss.android.ugc.aweme.account.login.v2.a.w;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.account.ui.CodeInputView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class s extends m {

    /* renamed from: a  reason: collision with root package name */
    final h.h f64047a = h.i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    public String f64048b;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f64049j = h.i.a((h.f.a.a) new h(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f64050k = h.i.a((h.f.a.a) new g(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f64051l = h.i.a((h.f.a.a) new i(this));

    /* renamed from: m  reason: collision with root package name */
    private HashMap f64052m;

    static {
        Covode.recordClassIndex(39466);
    }

    private String l() {
        return (String) this.f64049j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64052m == null) {
            this.f64052m = new HashMap();
        }
        View view = (View) this.f64052m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64052m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.g1;
    }

    public final List<t> g() {
        return (List) this.f64050k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64052m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final String k() {
        return (String) this.f64051l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* access modifiers changed from: package-private */
    public static final class j implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64060a;

        static {
            Covode.recordClassIndex(39479);
        }

        j(s sVar) {
            this.f64060a = sVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f64060a.t();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(39477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String mobile;
            t tVar = (t) this.this$0.f64047a.getValue();
            if (tVar == null || (mobile = tVar.getMobile()) == null) {
                return "";
            }
            return mobile;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(39478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return arguments.getString("platform", "");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final com.ss.android.ugc.aweme.account.login.v2.ui.a.l e() {
        com.ss.android.ugc.aweme.account.login.v2.ui.a.l lVar = new com.ss.android.ugc.aweme.account.login.v2.ui.a.l();
        lVar.a(l());
        lVar.f64883b = true;
        lVar.f64885d = false;
        lVar.f64886e = false;
        lVar.f64887f = false;
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        KeyboardUtils.c(c(R.id.bpd));
        c("resend").c();
    }

    static final class a extends h.f.b.m implements h.f.a.a<t> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(39467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t invoke() {
            String str;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            for (t tVar : (List) serializable) {
                if (tVar != null) {
                    str = tVar.getVerify_way();
                } else {
                    str = null;
                }
                if (l.a((Object) str, (Object) "mobile_sms_verify")) {
                    return tVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<List<? extends t>> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(39476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends t> invoke() {
            String str;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) serializable) {
                t tVar = (t) obj;
                if (tVar != null) {
                    str = tVar.getVerify_way();
                } else {
                    str = null;
                }
                if (l.a((Object) str, (Object) "email_verify")) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        int i3;
        if (o.a()) {
            i2 = R.string.aqy;
        } else {
            i2 = R.string.d0g;
        }
        if (o.a()) {
            i3 = R.string.ar0;
        } else {
            i3 = R.string.d0f;
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.fjs) + "\n" + getString(i3);
        bVar.f65052f = getString(i2, l());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    public static final class f extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64059a;

        static {
            Covode.recordClassIndex(39475);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(s sVar) {
            this.f64059a = sVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            int i2;
            boolean z;
            if (o.a()) {
                i2 = 6;
            } else {
                i2 = 4;
            }
            TuxButton tuxButton = (TuxButton) this.f64059a.c(R.id.cuz);
            l.b(tuxButton, "");
            CodeInputView codeInputView = (CodeInputView) this.f64059a.c(R.id.bpd);
            l.b(codeInputView, "");
            Editable text = codeInputView.getText();
            if (text == null || text.length() != i2) {
                z = false;
            } else {
                z = true;
            }
            tuxButton.setEnabled(z);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f64058a;

        static {
            Covode.recordClassIndex(39474);
        }

        e(View view) {
            this.f64058a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(this.f64058a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        l.d(str, "");
        KeyboardUtils.c(c(R.id.bpd));
        this.f64048b = str;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        super.onCreate(bundle);
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), l(), A());
        if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
            c("auto_system").c();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64053a;

        static {
            Covode.recordClassIndex(39468);
        }

        b(s sVar) {
            this.f64053a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f64053a.c(R.id.a54);
            l.b(tuxCheckBox, "");
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f64053a.c(R.id.a54);
            l.b(tuxCheckBox2, "");
            tuxCheckBox.setSelected(!tuxCheckBox2.isSelected());
            Keva repo = Keva.getRepo("two_step_verification");
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) this.f64053a.c(R.id.a54);
            l.b(tuxCheckBox3, "");
            repo.storeBoolean("ask_next_time", tuxCheckBox3.isSelected());
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64054a;

        static {
            Covode.recordClassIndex(39469);
        }

        c(s sVar) {
            this.f64054a = sVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            s sVar = this.f64054a;
            if (sVar.getContext() != null) {
                com.ss.android.ugc.aweme.common.f.a aVar = new com.ss.android.ugc.aweme.common.f.a(sVar.getContext());
                List<t> g2 = sVar.g();
                ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
                for (T t : g2) {
                    if (t == null || (str = t.getVerify_way()) == null) {
                        str = "";
                    }
                    Context context = sVar.getContext();
                    if (context == null) {
                        l.b();
                    }
                    l.b(context, "");
                    arrayList.add(r.a.a(str, context));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.a((String[]) array, new k(sVar));
                bt.a(aVar.f76416a.a());
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64055a;

        static {
            Covode.recordClassIndex(39470);
        }

        d(s sVar) {
            this.f64055a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxButton tuxButton = (TuxButton) this.f64055a.c(R.id.cuz);
            String str = "";
            l.b(tuxButton, str);
            tuxButton.setEnabled(false);
            ((TuxButton) this.f64055a.c(R.id.cuz)).setLoading(true);
            s sVar = this.f64055a;
            String str2 = sVar.f64048b;
            if (str2 != null) {
                str = str2;
            }
            x.a(sVar, "", str, 22, ag.a(new p("verify_ticket", com.ss.android.ugc.aweme.account.login.v2.base.e.g(this.f64055a))), new h.f.a.b<w, z>(this) {
                /* class com.ss.android.ugc.aweme.account.login.twostep.s.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(39471);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(w wVar) {
                    l.d(wVar, "");
                    String k2 = this.this$0.f64055a.k();
                    l.b(k2, "");
                    q.a(k2, "sms", false);
                    return z.f158842a;
                }
            }).d(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.account.login.twostep.s.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f64056a;

                static {
                    Covode.recordClassIndex(39472);
                }

                {
                    this.f64056a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    com.bytedance.sdk.a.a.d.a aVar = (com.bytedance.sdk.a.a.d.a) obj;
                    String k2 = this.f64056a.f64055a.k();
                    l.b(k2, "");
                    q.a(k2, "sms", true);
                    Bundle arguments = this.f64056a.f64055a.getArguments();
                    if (arguments == null) {
                        l.b();
                    }
                    Bundle bundle = new Bundle();
                    String str = aVar.f43089j;
                    l.b(str, "");
                    com.ss.android.ugc.aweme.account.login.v2.base.e.d(bundle, str);
                    arguments.putBundle("final_data", bundle);
                    s sVar = this.f64056a.f64055a;
                    Bundle arguments2 = this.f64056a.f64055a.getArguments();
                    if (arguments2 == null) {
                        l.b();
                    }
                    l.b(arguments2, "");
                    sVar.b(arguments2);
                }
            }).a(new f.a.d.a(this) {
                /* class com.ss.android.ugc.aweme.account.login.twostep.s.d.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f64057a;

                static {
                    Covode.recordClassIndex(39473);
                }

                {
                    this.f64057a = r1;
                }

                @Override // f.a.d.a
                public final void a() {
                    TuxButton tuxButton = (TuxButton) this.f64057a.f64055a.c(R.id.cuz);
                    l.b(tuxButton, "");
                    tuxButton.setEnabled(true);
                    ((TuxButton) this.f64057a.f64055a.c(R.id.cuz)).setLoading(false);
                }
            }).c();
        }
    }

    private f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> c(String str) {
        HashMap c2;
        l.d(str, "");
        String f2 = com.ss.android.ugc.aweme.account.login.v2.base.e.f(this);
        if (h.m.p.a((CharSequence) f2)) {
            c2 = ag.c(new p("verify_ticket", com.ss.android.ugc.aweme.account.login.v2.base.e.g(this)));
        } else {
            c2 = ag.c(new p("not_login_ticket", f2));
        }
        f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a2 = x.a(this, l(), A(), V_(), "", str, (String) null, c2).a(new j(this));
        l.b(a2, "");
        return a2;
    }

    static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64061a;

        static {
            Covode.recordClassIndex(39480);
        }

        k(s sVar) {
            this.f64061a = sVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (this.f64061a.g().get(i2) != null) {
                s sVar = this.f64061a;
                Bundle arguments = sVar.getArguments();
                if (arguments == null) {
                    l.b();
                }
                arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.getValue());
                l.b(arguments, "");
                sVar.a(arguments);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        String k2 = k();
        l.b(k2, "");
        q.c(k2, "sms");
        TuxCheckBox tuxCheckBox = (TuxCheckBox) c(R.id.a54);
        l.b(tuxCheckBox, "");
        tuxCheckBox.setSelected(Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true));
        ((TuxCheckBox) c(R.id.a54)).setOnClickListener(new b(this));
        if (!g().isEmpty()) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((TuxTextView) c(R.id.a4j)).setOnClickListener(new c(this));
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        TuxButton tuxButton = (TuxButton) c(R.id.cuz);
        l.b(tuxButton, "");
        tuxButton.setEnabled(true);
        ((TuxButton) c(R.id.cuz)).setOnClickListener(new d(this));
        view.setOnClickListener(new e(view));
        ((CodeInputView) c(R.id.bpd)).addTextChangedListener(new f(this));
        ((CodeInputView) c(R.id.bpd)).requestFocus();
    }
}
