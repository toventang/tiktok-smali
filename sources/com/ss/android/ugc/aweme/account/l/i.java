package com.ss.android.ugc.aweme.account.l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.q;
import com.ss.android.ugc.aweme.account.login.twostep.t;
import com.ss.android.ugc.aweme.account.login.v2.a.ag;
import com.ss.android.ugc.aweme.account.login.v2.a.w;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.json.JSONObject;

public final class i extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f63164e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public EditText f63165a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f63166b = h.i.a((h.f.a.a) new d(this));

    /* renamed from: c  reason: collision with root package name */
    final h.h f63167c = h.i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h f63168d = h.i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f63169j = h.i.a((h.f.a.a) new e(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f63170k = h.i.a((h.f.a.a) new n(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f63171l = h.i.a((h.f.a.a) new p(this));

    /* renamed from: m  reason: collision with root package name */
    private HashMap f63172m;

    static {
        Covode.recordClassIndex(38910);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f63172m == null) {
            this.f63172m = new HashMap();
        }
        View view = (View) this.f63172m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63172m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hv;
    }

    public final String e() {
        return (String) this.f63169j.getValue();
    }

    public final String g() {
        return (String) this.f63170k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f63172m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final List<t> i() {
        return (List) this.f63171l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38911);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(38914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return com.ss.android.ugc.aweme.account.login.v2.base.e.a(this.this$0);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(38915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return com.ss.android.ugc.aweme.account.login.v2.base.e.c(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EditText editText = this.f63165a;
        if (editText == null) {
            h.f.b.l.a("passwordInput");
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
    }

    static final class b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(38912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (h.m.p.a((CharSequence) this.this$0.e())) {
                return this.this$0.f63166b.getValue();
            }
            return this.this$0.e();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(38927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(i iVar) {
            super(0);
            this.this$0 = iVar;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (!com.ss.android.ugc.aweme.account.login.v2.base.e.i(this)) {
            cj.a(17, 2, new Bundle());
        }
        return super.q();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.bpm)).b(true);
        ((LoadingButton) c(R.id.cuz)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.bpm)).a(true);
        ((LoadingButton) c(R.id.cuz)).a(true);
    }

    static final class c extends h.f.b.m implements h.f.a.a<t> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(38913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(0);
            this.this$0 = iVar;
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
                if (h.f.b.l.a((Object) str, (Object) "pwd_verify")) {
                    return tVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<List<? extends t>> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(38929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(i iVar) {
            super(0);
            this.this$0 = iVar;
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
                String verify_way = tVar != null ? tVar.getVerify_way() : null;
                t tVar2 = (t) this.this$0.f63168d.getValue();
                if (tVar2 != null) {
                    str = tVar2.getVerify_way();
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
        String string;
        if (com.ss.android.ugc.aweme.account.login.v2.base.e.i(this)) {
            string = getString(R.string.fjs) + "\n" + getString(R.string.ap4);
        } else {
            string = getString(R.string.ap4);
            h.f.b.l.b(string, "");
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, string, " ", false, "verify_enter_password_page", false, false, 1231);
    }

    public static final class f extends com.ss.android.ugc.aweme.base.ui.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63173a;

        static {
            Covode.recordClassIndex(38916);
        }

        f(i iVar) {
            this.f63173a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f63173a.c(R.id.bpm);
            if (loadingButton != null) {
                loadingButton.setEnabled(!com.ss.android.ugc.aweme.account.login.v2.ui.c.b(i.a(this.f63173a)));
            }
            LoadingButton loadingButton2 = (LoadingButton) this.f63173a.c(R.id.cuz);
            if (loadingButton2 != null) {
                loadingButton2.setEnabled(!com.ss.android.ugc.aweme.account.login.v2.ui.c.b(i.a(this.f63173a)));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f63173a.c(R.id.bpx);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63180a;

        static {
            Covode.recordClassIndex(38924);
        }

        l(i iVar) {
            this.f63180a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f63180a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public static final /* synthetic */ EditText a(i iVar) {
        EditText editText = iVar.f63165a;
        if (editText == null) {
            h.f.b.l.a("passwordInput");
        }
        return editText;
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63175a;

        static {
            Covode.recordClassIndex(38918);
        }

        h(i iVar) {
            this.f63175a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((TuxCheckBox) this.f63175a.c(R.id.a54)).performClick();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a("verify_enter_password", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", w()).f62575a);
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63178a;

        static {
            Covode.recordClassIndex(38921);
        }

        k(i iVar) {
            this.f63178a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            i iVar = this.f63178a;
            String obj = i.a(this.f63178a).getText().toString();
            String g2 = this.f63178a.g();
            h.f.b.l.b(g2, "");
            x.a((com.ss.android.ugc.aweme.account.login.v2.base.c) iVar, (String) iVar.f63167c.getValue(), obj, g2, false, (h.f.a.b) new h.f.a.b<w, z>(this) {
                /* class com.ss.android.ugc.aweme.account.l.i.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(38922);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(w wVar) {
                    h.f.b.l.d(wVar, "");
                    String g2 = this.this$0.f63178a.g();
                    h.f.b.l.b(g2, "");
                    q.a(g2, "password", false);
                    return z.f158842a;
                }
            }, 16).d(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.account.l.i.k.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k f63179a;

                static {
                    Covode.recordClassIndex(38923);
                }

                {
                    this.f63179a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    JSONObject jSONObject;
                    JSONObject optJSONObject;
                    com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
                    String g2 = this.f63179a.f63178a.g();
                    h.f.b.l.b(g2, "");
                    q.a(g2, "password", true);
                    String str = null;
                    if (Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true)) {
                        com.bytedance.sdk.a.h.a.o oVar = (com.bytedance.sdk.a.h.a.o) dVar.f43081j;
                        if (!(oVar == null || (jSONObject = oVar.f43284m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                            str = optJSONObject.optString("ticket");
                        }
                        TwoStepAuthApi.f63745a = str;
                        return;
                    }
                    TwoStepAuthApi.f63745a = null;
                }
            }).c();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63174a;

        static {
            Covode.recordClassIndex(38917);
        }

        g(i iVar) {
            this.f63174a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f63174a.c(R.id.a54);
            h.f.b.l.b(tuxCheckBox, "");
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f63174a.c(R.id.a54);
            h.f.b.l.b(tuxCheckBox2, "");
            tuxCheckBox.setSelected(!tuxCheckBox2.isSelected());
            Keva repo = Keva.getRepo("two_step_verification");
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) this.f63174a.c(R.id.a54);
            h.f.b.l.b(tuxCheckBox3, "");
            repo.storeBoolean("ask_next_time", tuxCheckBox3.isSelected());
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63181a;

        static {
            Covode.recordClassIndex(38925);
        }

        m(i iVar) {
            this.f63181a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            i iVar = this.f63181a;
            String obj = i.a(iVar).getText().toString();
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(obj, "");
            f.a.n b2 = f.a.n.a((f.a.q) new x.ct(iVar, obj)).d(new x.cu(iVar)).b(new x.cv(iVar));
            h.f.b.l.b(b2, "");
            com.ss.android.ugc.aweme.account.login.v2.a.z.a(iVar, b2).d(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.account.l.i.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f63182a;

                static {
                    Covode.recordClassIndex(38926);
                }

                {
                    this.f63182a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    String a2;
                    String str;
                    com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
                    String str2 = "";
                    if (this.f63182a.f63181a.A() == com.ss.android.ugc.aweme.account.login.v2.base.j.MODIFY_PHONE) {
                        i iVar = this.f63182a.f63181a;
                        Bundle arguments = this.f63182a.f63181a.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_MODIFY.getValue());
                        ag agVar = (ag) dVar.f43081j;
                        if (agVar == null || (str = agVar.a()) == null) {
                            str = str2;
                        }
                        arguments.putString("ticket", str);
                        h.f.b.l.b(arguments, str2);
                        iVar.a(arguments);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    ag agVar2 = (ag) dVar.f43081j;
                    if (!(agVar2 == null || (a2 = agVar2.a()) == null)) {
                        str2 = a2;
                    }
                    bundle.putString("ticket", str2);
                    cj.a(17, 1, bundle);
                    androidx.fragment.app.e activity = this.f63182a.f63181a.getActivity();
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    activity.finish();
                }
            }).c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$i  reason: collision with other inner class name */
    static final class View$OnClickListenerC1403i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63176a;

        static {
            Covode.recordClassIndex(38919);
        }

        View$OnClickListenerC1403i(i iVar) {
            this.f63176a = iVar;
        }

        public final void onClick(View view) {
            String str;
            String string;
            ClickAgent.onClick(view);
            i iVar = this.f63176a;
            if (iVar.getContext() != null) {
                com.ss.android.ugc.aweme.common.f.a aVar = new com.ss.android.ugc.aweme.common.f.a(iVar.getContext());
                List<t> i2 = iVar.i();
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) i2, 10));
                for (T t : i2) {
                    if (t == null || (str = t.getVerify_way()) == null) {
                        str = "";
                    }
                    Context context = iVar.getContext();
                    if (context == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(context, "");
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(context, "");
                    int hashCode = str.hashCode();
                    if (hashCode != 300626556) {
                        if (hashCode == 312290780 && str.equals("mobile_sms_verify")) {
                            string = context.getString(R.string.d0e);
                            h.f.b.l.b(string, "");
                            arrayList.add(string);
                        }
                    } else if (str.equals("email_verify")) {
                        string = context.getString(R.string.d0d);
                        h.f.b.l.b(string, "");
                        arrayList.add(string);
                    }
                    string = context.getString(R.string.d0d);
                    h.f.b.l.b(string, "");
                    arrayList.add(string);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.a((String[]) array, new o(iVar));
                bt.a(aVar.f76416a.a());
            }
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63177a;

        static {
            Covode.recordClassIndex(38920);
        }

        j(i iVar) {
            this.f63177a = iVar;
        }

        public final void onClick(View view) {
            boolean z;
            Object obj;
            int value;
            ClickAgent.onClick(view);
            i iVar = this.f63177a;
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = iVar.v;
            if (bVar == null) {
                h.f.b.l.b();
            }
            String str = bVar.f65055i;
            if (str == null) {
                h.f.b.l.b();
            }
            if (this.f63177a.e().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = "email";
            } else {
                obj = "mobile";
            }
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(obj, "");
            if (h.f.b.l.a(obj, (Object) "mobile")) {
                r.a("click_forget_password", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_from", str).a("enter_method", iVar.x()).f62575a);
            } else {
                r.a("click_forget_password", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "email").a("enter_from", str).a("enter_method", iVar.x()).f62575a);
            }
            Bundle arguments = iVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            if (h.f.b.l.a(obj, (Object) "mobile")) {
                value = com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_FIND_PASSWORD.getValue();
            } else {
                value = com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_EMAIL_FIND_PASSWORD.getValue();
            }
            arguments.putInt("next_page", value);
            arguments.putInt("current_scene", com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD.getValue());
            h.f.b.l.b(arguments, "");
            iVar.a(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.bpx);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    static final class o implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f63183a;

        static {
            Covode.recordClassIndex(38928);
        }

        o(i iVar) {
            this.f63183a = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.account.login.v2.base.k kVar;
            t tVar = this.f63183a.i().get(i2);
            if (tVar != null) {
                i iVar = this.f63183a;
                Bundle arguments = iVar.getArguments();
                if (arguments == null) {
                    h.f.b.l.b();
                }
                String verify_way = tVar.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                h.f.b.l.d(verify_way, "");
                int hashCode = verify_way.hashCode();
                if (hashCode != 300626556) {
                    if (hashCode == 312290780 && verify_way.equals("mobile_sms_verify")) {
                        kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                        arguments.putInt("next_page", kVar.getValue());
                        h.f.b.l.b(arguments, "");
                        iVar.a(arguments);
                    }
                } else if (verify_way.equals("email_verify")) {
                    kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV;
                    arguments.putInt("next_page", kVar.getValue());
                    h.f.b.l.b(arguments, "");
                    iVar.a(arguments);
                }
                kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                arguments.putInt("next_page", kVar.getValue());
                h.f.b.l.b(arguments, "");
                iVar.a(arguments);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) c(R.id.bpw)).getEditText();
        this.f63165a = editText;
        if (editText == null) {
            h.f.b.l.a("passwordInput");
        }
        editText.setHint(getString(R.string.d_q));
        editText.addTextChangedListener(new f(this));
        if (com.ss.android.ugc.aweme.account.login.v2.base.e.i(this)) {
            TuxCheckBox tuxCheckBox = (TuxCheckBox) c(R.id.a54);
            h.f.b.l.b(tuxCheckBox, "");
            tuxCheckBox.setSelected(Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true));
            ((TuxCheckBox) c(R.id.a54)).setOnClickListener(new g(this));
            LoadingButton loadingButton = (LoadingButton) c(R.id.bpm);
            h.f.b.l.b(loadingButton, "");
            loadingButton.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) c(R.id.a54);
            h.f.b.l.b(tuxCheckBox2, "");
            tuxCheckBox2.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a55);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            LoadingButton loadingButton2 = (LoadingButton) c(R.id.cuz);
            h.f.b.l.b(loadingButton2, "");
            loadingButton2.setVisibility(0);
            ((TuxTextView) c(R.id.a55)).setOnClickListener(new h(this));
            if (!i().isEmpty()) {
                View c2 = c(R.id.bpk);
                h.f.b.l.b(c2, "");
                c2.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) c(R.id.a4j);
                h.f.b.l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                ((TuxTextView) c(R.id.a4j)).setOnClickListener(new View$OnClickListenerC1403i(this));
            } else {
                View c3 = c(R.id.bpk);
                h.f.b.l.b(c3, "");
                c3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) c(R.id.a4j);
                h.f.b.l.b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                a(c(R.id.bpk), new j(this));
            }
            String g2 = g();
            h.f.b.l.b(g2, "");
            q.c(g2, "password");
            a(c(R.id.cuz), new k(this));
            return;
        }
        LoadingButton loadingButton3 = (LoadingButton) c(R.id.bpm);
        h.f.b.l.b(loadingButton3, "");
        loadingButton3.setVisibility(0);
        String string = getString(R.string.dgs);
        h.f.b.l.b(string, "");
        ((LoadingButton) c(R.id.bpm)).setText(string);
        TuxTextView tuxTextView5 = (TuxTextView) c(R.id.a4j);
        h.f.b.l.b(tuxTextView5, "");
        tuxTextView5.setVisibility(8);
        TuxCheckBox tuxCheckBox3 = (TuxCheckBox) c(R.id.a54);
        h.f.b.l.b(tuxCheckBox3, "");
        tuxCheckBox3.setVisibility(8);
        TuxTextView tuxTextView6 = (TuxTextView) c(R.id.a55);
        h.f.b.l.b(tuxTextView6, "");
        tuxTextView6.setVisibility(8);
        LoadingButton loadingButton4 = (LoadingButton) c(R.id.cuz);
        h.f.b.l.b(loadingButton4, "");
        loadingButton4.setVisibility(8);
        View c4 = c(R.id.bpk);
        h.f.b.l.b(c4, "");
        c4.setVisibility(0);
        View c5 = c(R.id.bpk);
        h.f.b.l.b(c5, "");
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = this.v;
        if (bVar == null) {
            h.f.b.l.b();
        }
        String str = bVar.f65055i;
        if (str == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.e.a(c5, this, str, false);
        if (A() == com.ss.android.ugc.aweme.account.login.v2.base.j.MODIFY_PHONE) {
            NormalTitleBar normalTitleBar = (NormalTitleBar) c(R.id.rq);
            h.f.b.l.b(normalTitleBar, "");
            normalTitleBar.setVisibility(0);
            NormalTitleBar normalTitleBar2 = (NormalTitleBar) c(R.id.rq);
            h.f.b.l.b(normalTitleBar2, "");
            normalTitleBar2.getStartBtn().setOnClickListener(new l(this));
            NormalTitleBar normalTitleBar3 = (NormalTitleBar) c(R.id.rq);
            h.f.b.l.b(normalTitleBar3, "");
            ImageView endBtn = normalTitleBar3.getEndBtn();
            h.f.b.l.b(endBtn, "");
            endBtn.setVisibility(8);
        }
        a(c(R.id.bpm), new m(this));
    }
}
