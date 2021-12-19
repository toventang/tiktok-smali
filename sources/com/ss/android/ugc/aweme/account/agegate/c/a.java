package com.ss.android.ugc.aweme.account.agegate.c;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.agegate.c.b;
import com.ss.android.ugc.aweme.account.agegate.c.c;
import com.ss.android.ugc.aweme.account.base.a.a;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.u;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.o;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final C1377a f62696b = new C1377a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f62697a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f62698c = h.i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f62699d = h.i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.v2.ui.f f62700e;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.account.agegate.model.g[] f62701j = {com.ss.android.ugc.aweme.account.agegate.model.g.f62789c, com.ss.android.ugc.aweme.account.agegate.model.g.f62790d, com.ss.android.ugc.aweme.account.agegate.model.g.f62791e};

    /* renamed from: k  reason: collision with root package name */
    private HashMap f62702k;

    static {
        Covode.recordClassIndex(38624);
    }

    private final boolean k() {
        return ((Boolean) this.f62698c.getValue()).booleanValue();
    }

    private final boolean l() {
        return ((Boolean) this.f62699d.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f62702k == null) {
            this.f62702k = new HashMap();
        }
        View view = (View) this.f62702k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62702k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.g9;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f62702k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.a$a  reason: collision with other inner class name */
    public static final class C1377a {
        static {
            Covode.recordClassIndex(38625);
        }

        private C1377a() {
        }

        public /* synthetic */ C1377a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (!k()) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("age_gate_block");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38627);
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
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("is_existing_user", false);
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void i() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.b__);
        if (inputWithIndicator != null) {
            inputWithIndicator.a(1, 3);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((InputWithIndicator) c(R.id.b__)).getEditText());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        boolean z;
        LoadingButton loadingButton = (LoadingButton) c(R.id.b_b);
        if (loadingButton != null) {
            LoadingButton loadingButton2 = (LoadingButton) c(R.id.b_b);
            if (loadingButton2 != null) {
                z = loadingButton2.isEnabled();
            } else {
                z = false;
            }
            loadingButton.b(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        boolean z;
        LoadingButton loadingButton = (LoadingButton) c(R.id.b_b);
        if (loadingButton != null) {
            LoadingButton loadingButton2 = (LoadingButton) c(R.id.b_b);
            if (loadingButton2 != null) {
                z = loadingButton2.isEnabled();
            } else {
                z = false;
            }
            loadingButton.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        String str;
        boolean k2 = k();
        if (k()) {
            str = getString(R.string.ard);
        } else {
            str = " ";
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(str, null, k2, getString(R.string.ae6), getString(R.string.ae2), false, null, false, true, 458);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void e() {
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.b_a);
        if (inputResultIndicator != null) {
            inputResultIndicator.a();
        }
        r();
        if (l()) {
            q.b(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", k.DELETE_VIDEO_ALERT.getValue());
        arguments.putSerializable("age_gate_response", new AgeGateResponse(0, "", true, 0, 1, null, 32, null));
        arguments.putString("enter_from", "from_create_account_password");
        arguments.putBoolean("can_return_to_prev_page", false);
        arguments.putBoolean("finish_before_jump", true);
        l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void g() {
        String str;
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.b_a);
        if (inputResultIndicator != null) {
            inputResultIndicator.a();
        }
        r();
        if (l()) {
            q.b(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", k.FTC_CREATE_PASSWORD.getValue());
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.b__);
        if (inputWithIndicator == null || (str = inputWithIndicator.getText()) == null) {
            str = "";
        }
        arguments.putString("ftc_username", str);
        l.b(arguments, "");
        a(arguments);
    }

    public static final class g extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62705a;

        static {
            Covode.recordClassIndex(38631);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(a aVar) {
            this.f62705a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f62705a.c(R.id.b_a);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
            c a2 = a.a(this.f62705a);
            String valueOf = String.valueOf(editable);
            l.d(valueOf, "");
            a2.f62734e.onNext(valueOf);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void a(List<String> list) {
        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = this.f62700e;
        if (fVar != null) {
            fVar.a(list);
        }
    }

    public static final /* synthetic */ c a(a aVar) {
        c cVar = aVar.f62697a;
        if (cVar == null) {
            l.a("presenter");
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void b(String str) {
        r();
        if (str != null) {
            a(0, str);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62703a;

        static {
            Covode.recordClassIndex(38628);
        }

        d(a aVar) {
            this.f62703a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.C1386a aVar = new a.C1386a();
            aVar.f62886a = o.a("terms-of-use");
            aVar.a(this.f62703a.getActivity()).show();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62704a;

        static {
            Covode.recordClassIndex(38629);
        }

        e(a aVar) {
            this.f62704a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.C1386a aVar = new a.C1386a();
            aVar.f62886a = o.a("privacy-policy");
            aVar.a(this.f62704a.getActivity()).show();
        }
    }

    static final class f extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            new com.bytedance.tux.g.b(this.this$0).e(num.intValue()).b();
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<String, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            c a2 = a.a(this.this$0);
            l.d(str2, "");
            a2.f62736g.a(str2);
            a2.f62735f = true;
            r.onEventV3("click_create_account_username_suggest");
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean l2 = l();
        String w = w();
        l.b(w, "");
        String x = x();
        l.b(x, "");
        this.f62697a = new c(this, l2, w, x);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void b(boolean z) {
        String text;
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.b__);
        if (inputWithIndicator != null) {
            int i2 = 1;
            if (z) {
                i2 = 2;
            } else {
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.b__);
                if (inputWithIndicator2 == null || (text = inputWithIndicator2.getText()) == null || text.length() == 0) {
                    i2 = 0;
                }
            }
            inputWithIndicator.a(i2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void a(String str) {
        l.d(str, "");
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.b__);
        if (inputWithIndicator != null) {
            inputWithIndicator.setText(str);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62706a;

        static {
            Covode.recordClassIndex(38632);
        }

        h(a aVar) {
            this.f62706a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            ((LoadingButton) this.f62706a.c(R.id.b_b)).a(true);
            c a2 = a.a(this.f62706a);
            InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f62706a.c(R.id.b__);
            if (inputWithIndicator == null || (str = inputWithIndicator.getText()) == null) {
                str = "";
            }
            l.d(str, "");
            if (!a2.f62737h) {
                u.a(true, a2.f62738i, a2.f62739j, a2.f62735f);
                a2.f62736g.g();
                return;
            }
            f.a.b.b bVar = a2.f62731b;
            if (bVar != null) {
                bVar.dispose();
            }
            b bVar2 = a2.f62730a;
            l.d(str, "");
            f.a.h<R> a3 = NetworkProxyAccount.d("/passport/login_name/update/", ag.a(v.a("login_name", str))).a(new b.i(bVar2));
            l.b(a3, "");
            a2.f62731b = a3.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.d(a2), new c.e(a2));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void a(boolean z) {
        LoadingButton loadingButton = (LoadingButton) c(R.id.b_b);
        if (loadingButton != null) {
            loadingButton.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.b_a);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.g
    public final void a(Integer num, Integer num2) {
        r();
        if (num2 != null) {
            String string = getString(num2.intValue());
            l.b(string, "");
            a(0, string);
        }
        if (num != null) {
            new com.bytedance.tux.g.b(this).a(getString(num.intValue())).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        f.a.b.b bVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        c cVar = this.f62697a;
        if (cVar == null) {
            l.a("presenter");
        }
        f.a.b.b bVar2 = cVar.f62733d;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = cVar.f62733d) == null)) {
            bVar.dispose();
        }
        cVar.f62733d = cVar.f62734e.a(f.a.e.b.a.f157188a).b(new c.a(cVar)).d(500, TimeUnit.MILLISECONDS).a(c.b.f62741a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new c.C1380c(cVar));
        if (cVar.f62737h) {
            cVar.f62736g.a(cVar.f62730a.a());
            cVar.f62734e.onNext(cVar.f62730a.a());
        }
        r.a("show_create_account_page", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", cVar.f62738i).f62575a);
        if (k()) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.b_c);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            com.ss.android.ugc.aweme.account.login.z.a(getActivity(), (TextView) c(R.id.b_c), new d(this), new e(this), false);
        }
        if (l()) {
            q.b(true);
        }
        ((InputWithIndicator) c(R.id.b__)).getEditText().setInputType(524288);
        ((InputWithIndicator) c(R.id.b__)).getEditText().setFilters(new com.ss.android.ugc.aweme.account.agegate.util.i[]{new com.ss.android.ugc.aweme.account.agegate.util.i(this.f62701j, new f(this))});
        ((InputWithIndicator) c(R.id.b__)).getEditText().addTextChangedListener(new g(this));
        a(c(R.id.b_b), new h(this));
        RecyclerView recyclerView = (RecyclerView) c(R.id.b_g);
        l.b(recyclerView, "");
        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = new com.ss.android.ugc.aweme.account.login.v2.ui.f(recyclerView, null, new i(this));
        this.f62700e = fVar;
        fVar.f65069a = true;
    }
}
