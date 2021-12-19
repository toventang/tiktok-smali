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
import com.ss.android.ugc.aweme.account.login.v2.a.w;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.account.ui.CodeInputView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import f.a.q;
import h.a.ag;
import h.a.n;
import h.m.p;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class r extends m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f64031b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f64032a;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f64033j = h.i.a((h.f.a.a) new c(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f64034k = h.i.a((h.f.a.a) new j(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f64035l = h.i.a((h.f.a.a) new i(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f64036m = h.i.a((h.f.a.a) new b(this));
    private HashMap n;

    static {
        Covode.recordClassIndex(39449);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.g1;
    }

    public final String g() {
        return (String) this.f64033j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final String k() {
        return (String) this.f64034k.getValue();
    }

    public final List<t> l() {
        return (List) this.f64035l.getValue();
    }

    public final t m() {
        return (t) this.f64036m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39450);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(String str, Context context) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(context, "");
            int hashCode = str.hashCode();
            if (hashCode != -797498437) {
                if (hashCode == 312290780 && str.equals("mobile_sms_verify")) {
                    String string = context.getString(R.string.d0e);
                    h.f.b.l.b(string, "");
                    return string;
                }
            } else if (str.equals("pwd_verify")) {
                String string2 = context.getString(R.string.h0v);
                h.f.b.l.b(string2, "");
                return string2;
            }
            String string3 = context.getString(R.string.d0d);
            h.f.b.l.b(string3, "");
            return string3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64045a;

        static {
            Covode.recordClassIndex(39464);
        }

        k(r rVar) {
            this.f64045a = rVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f64045a.t();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(39452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String email;
            t m2 = this.this$0.m();
            if (m2 == null || (email = m2.getEmail()) == null) {
                return "";
            }
            return email;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(39463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            return arguments.getString("platform", "");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final com.ss.android.ugc.aweme.account.login.v2.ui.a.l e() {
        com.ss.android.ugc.aweme.account.login.v2.ui.a.l lVar = new com.ss.android.ugc.aweme.account.login.v2.ui.a.l();
        lVar.a(g());
        lVar.f64883b = false;
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

    static final class b extends h.f.b.m implements h.f.a.a<t> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(39451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t invoke() {
            String str;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            for (t tVar : (List) serializable) {
                if (tVar != null) {
                    str = tVar.getVerify_way();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) "email_verify")) {
                    return tVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<List<? extends t>> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(39462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends t> invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) serializable) {
                t tVar = (t) obj;
                String str = null;
                if (!com.ss.android.ugc.aweme.account.login.v2.base.e.h(this.this$0)) {
                    if (!h.f.b.l.a((Object) (tVar != null ? tVar.getVerify_way() : null), (Object) "pwd_verify")) {
                    }
                } else {
                    if (!h.f.b.l.a((Object) (tVar != null ? tVar.getVerify_way() : null), (Object) "mobile_sms_verify")) {
                    }
                }
                String verify_way = tVar.getVerify_way();
                t m2 = this.this$0.m();
                if (m2 != null) {
                    str = m2.getVerify_way();
                }
                if (!h.f.b.l.a((Object) verify_way, (Object) str)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.fjs) + "\n" + getString(R.string.czw);
        bVar.f65052f = getString(R.string.czx, g());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    public static final class h extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64044a;

        static {
            Covode.recordClassIndex(39461);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(r rVar) {
            this.f64044a = rVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            boolean z;
            TuxButton tuxButton = (TuxButton) this.f64044a.c(R.id.cuz);
            h.f.b.l.b(tuxButton, "");
            CodeInputView codeInputView = (CodeInputView) this.f64044a.c(R.id.bpd);
            h.f.b.l.b(codeInputView, "");
            Editable text = codeInputView.getText();
            if (text == null || text.length() != 6) {
                z = false;
            } else {
                z = true;
            }
            tuxButton.setEnabled(z);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f64043a;

        static {
            Covode.recordClassIndex(39460);
        }

        g(View view) {
            this.f64043a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(this.f64043a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        h.f.b.l.d(str, "");
        KeyboardUtils.c(c(R.id.bpd));
        this.f64032a = str;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        super.onCreate(bundle);
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), g(), A());
        if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
            c("auto_system").c();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64037a;

        static {
            Covode.recordClassIndex(39453);
        }

        d(r rVar) {
            this.f64037a = rVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f64037a.c(R.id.a54);
            h.f.b.l.b(tuxCheckBox, "");
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f64037a.c(R.id.a54);
            h.f.b.l.b(tuxCheckBox2, "");
            tuxCheckBox.setSelected(!tuxCheckBox2.isSelected());
            Keva repo = Keva.getRepo("two_step_verification");
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) this.f64037a.c(R.id.a54);
            h.f.b.l.b(tuxCheckBox3, "");
            repo.storeBoolean("ask_next_time", tuxCheckBox3.isSelected());
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64038a;

        static {
            Covode.recordClassIndex(39454);
        }

        e(r rVar) {
            this.f64038a = rVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            r rVar = this.f64038a;
            if (rVar.getContext() != null) {
                com.ss.android.ugc.aweme.common.f.a aVar = new com.ss.android.ugc.aweme.common.f.a(rVar.getContext());
                List<t> l2 = rVar.l();
                ArrayList arrayList = new ArrayList(n.a((Iterable) l2, 10));
                for (T t : l2) {
                    if (t == null || (str = t.getVerify_way()) == null) {
                        str = "";
                    }
                    Context context = rVar.getContext();
                    if (context == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(context, "");
                    arrayList.add(a.a(str, context));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.a((String[]) array, new l(rVar));
                bt.a(aVar.f76416a.a());
            }
        }
    }

    private f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.g>> c(String str) {
        HashMap c2;
        int i2;
        h.f.b.l.d(str, "");
        String f2 = com.ss.android.ugc.aweme.account.login.v2.base.e.f(this);
        if (p.a((CharSequence) f2)) {
            c2 = ag.c(new h.p("verify_ticket", com.ss.android.ugc.aweme.account.login.v2.base.e.g(this)));
            i2 = 6;
        } else {
            c2 = ag.c(new h.p("not_login_ticket", f2));
            i2 = 13;
        }
        f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.g>> a2 = x.a(this, g(), i2, str, c2, (String) null, 96).a((f.a.d.a) new k(this));
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64039a;

        static {
            Covode.recordClassIndex(39455);
        }

        f(r rVar) {
            this.f64039a = rVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxButton tuxButton = (TuxButton) this.f64039a.c(R.id.cuz);
            String str = "";
            h.f.b.l.b(tuxButton, str);
            tuxButton.setEnabled(false);
            ((TuxButton) this.f64039a.c(R.id.cuz)).setLoading(true);
            if (com.ss.android.ugc.aweme.account.login.v2.base.e.h(this.f64039a)) {
                String w = this.f64039a.w();
                h.f.b.l.b(w, str);
                r rVar = this.f64039a;
                String str2 = rVar.f64032a;
                if (str2 != null) {
                    str = str2;
                }
                x.a(w, rVar, "", str, 6, ag.a(new h.p("verify_ticket", com.ss.android.ugc.aweme.account.login.v2.base.e.g(this.f64039a))), new h.f.a.b<w, z>(this) {
                    /* class com.ss.android.ugc.aweme.account.login.twostep.r.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(39456);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(w wVar) {
                        h.f.b.l.d(wVar, "");
                        String k2 = this.this$0.f64039a.k();
                        h.f.b.l.b(k2, "");
                        q.a(k2, "email", false);
                        return z.f158842a;
                    }
                }).d(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.account.login.twostep.r.f.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f64040a;

                    static {
                        Covode.recordClassIndex(39457);
                    }

                    {
                        this.f64040a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.bytedance.sdk.a.a.d.a aVar = (com.bytedance.sdk.a.a.d.a) obj;
                        String k2 = this.f64040a.f64039a.k();
                        h.f.b.l.b(k2, "");
                        q.a(k2, "email", true);
                        Bundle arguments = this.f64040a.f64039a.getArguments();
                        if (arguments == null) {
                            h.f.b.l.b();
                        }
                        Bundle bundle = new Bundle();
                        String str = aVar.f43089j;
                        h.f.b.l.b(str, "");
                        com.ss.android.ugc.aweme.account.login.v2.base.e.d(bundle, str);
                        arguments.putBundle("final_data", bundle);
                        r rVar = this.f64040a.f64039a;
                        Bundle arguments2 = this.f64040a.f64039a.getArguments();
                        if (arguments2 == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(arguments2, "");
                        rVar.b(arguments2);
                    }
                }).a(new f.a.d.a(this) {
                    /* class com.ss.android.ugc.aweme.account.login.twostep.r.f.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f64041a;

                    static {
                        Covode.recordClassIndex(39458);
                    }

                    {
                        this.f64041a = r1;
                    }

                    @Override // f.a.d.a
                    public final void a() {
                        TuxButton tuxButton = (TuxButton) this.f64041a.f64039a.c(R.id.cuz);
                        h.f.b.l.b(tuxButton, "");
                        tuxButton.setEnabled(true);
                        ((TuxButton) this.f64041a.f64039a.c(R.id.cuz)).setLoading(false);
                    }
                }).c();
                return;
            }
            Bundle arguments = this.f64039a.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            String string = arguments.getString("verify_ticket");
            Bundle arguments2 = this.f64039a.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            String string2 = arguments2.getString("not_login_ticket");
            r rVar2 = this.f64039a;
            String str3 = rVar2.f64032a;
            if (str3 == null) {
                str3 = str;
            }
            if (string == null) {
                string = str;
            }
            if (string2 == null) {
                string2 = str;
            }
            h.f.b.l.d(rVar2, str);
            h.f.b.l.d(str3, str);
            h.f.b.l.d("13", str);
            h.f.b.l.d(string, str);
            h.f.b.l.d(string2, str);
            f.a.n b2 = f.a.n.a((q) new x.ae(rVar2, str3, "13", string, string2)).d(new x.af(rVar2)).b(new x.ag(rVar2));
            h.f.b.l.b(b2, str);
            com.ss.android.ugc.aweme.account.login.v2.a.z.a(rVar2, b2).d(AnonymousClass4.f64042a).c();
        }
    }

    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64046a;

        static {
            Covode.recordClassIndex(39465);
        }

        l(r rVar) {
            this.f64046a = rVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.account.login.v2.base.k kVar;
            t tVar = this.f64046a.l().get(i2);
            if (tVar != null) {
                r rVar = this.f64046a;
                Bundle arguments = rVar.getArguments();
                if (arguments == null) {
                    h.f.b.l.b();
                }
                String verify_way = tVar.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                h.f.b.l.d(verify_way, "");
                int hashCode = verify_way.hashCode();
                if (hashCode != -797498437) {
                    if (hashCode == 312290780 && verify_way.equals("mobile_sms_verify")) {
                        kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                        arguments.putInt("next_page", kVar.getValue());
                        h.f.b.l.b(arguments, "");
                        com.ss.android.ugc.aweme.account.login.v2.base.e.a(arguments, this.f64046a.g());
                        h.f.b.l.b(arguments, "");
                        rVar.a(arguments);
                    }
                } else if (verify_way.equals("pwd_verify")) {
                    kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV;
                    arguments.putInt("next_page", kVar.getValue());
                    h.f.b.l.b(arguments, "");
                    com.ss.android.ugc.aweme.account.login.v2.base.e.a(arguments, this.f64046a.g());
                    h.f.b.l.b(arguments, "");
                    rVar.a(arguments);
                }
                kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                arguments.putInt("next_page", kVar.getValue());
                h.f.b.l.b(arguments, "");
                com.ss.android.ugc.aweme.account.login.v2.base.e.a(arguments, this.f64046a.g());
                h.f.b.l.b(arguments, "");
                rVar.a(arguments);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        String k2 = k();
        h.f.b.l.b(k2, "");
        q.c(k2, "email");
        TuxCheckBox tuxCheckBox = (TuxCheckBox) c(R.id.a54);
        h.f.b.l.b(tuxCheckBox, "");
        tuxCheckBox.setSelected(Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true));
        ((TuxCheckBox) c(R.id.a54)).setOnClickListener(new d(this));
        if (!l().isEmpty()) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((TuxTextView) c(R.id.a4j)).setOnClickListener(new e(this));
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        ((TuxButton) c(R.id.cuz)).setOnClickListener(new f(this));
        view.setOnClickListener(new g(view));
        ((CodeInputView) c(R.id.bpd)).setInputLength(6);
        ((CodeInputView) c(R.id.bpd)).addTextChangedListener(new h(this));
        ((CodeInputView) c(R.id.bpd)).requestFocus();
    }
}
