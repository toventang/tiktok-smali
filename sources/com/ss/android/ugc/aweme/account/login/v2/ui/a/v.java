package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.a.ad;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.i;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.n.e;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.j;
import f.a.h;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class v extends a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.v2.ui.f f65001a;

    /* renamed from: b  reason: collision with root package name */
    public ad f65002b = new ad();

    /* renamed from: c  reason: collision with root package name */
    public EditText f65003c;

    /* renamed from: d  reason: collision with root package name */
    public final i f65004d = new i();

    /* renamed from: e  reason: collision with root package name */
    public boolean f65005e;

    /* renamed from: j  reason: collision with root package name */
    public String f65006j = "";

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.v2.a.d f65007k;

    /* renamed from: l  reason: collision with root package name */
    public String f65008l = "";

    /* renamed from: m  reason: collision with root package name */
    private boolean f65009m = true;
    private HashMap n;

    static {
        Covode.recordClassIndex(39963);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.ht;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void g() {
        super.D();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        return this.f65009m;
    }

    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f65010a;

        static {
            Covode.recordClassIndex(39964);
        }

        @Override // com.ss.android.ugc.aweme.account.n.e.a
        public final void a() {
            this.f65010a.g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(v vVar) {
            this.f65010a = vVar;
        }
    }

    public final EditText e() {
        EditText editText = this.f65003c;
        if (editText == null) {
            l.a("etUserName");
        }
        return editText;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.dzj);
        if (loadingButton != null) {
            loadingButton.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.dzj);
        if (loadingButton != null) {
            loadingButton.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void f() {
        super.f();
        RecyclerView recyclerView = (RecyclerView) c(R.id.dzk);
        l.b(recyclerView, "");
        recyclerView.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f65007k = null;
        this.f65002b.b();
        this.f65004d.a();
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void u() {
        super.u();
        RecyclerView recyclerView = (RecyclerView) c(R.id.dzk);
        l.b(recyclerView, "");
        recyclerView.setVisibility(8);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (AccountKeyBoardHelper.a.a()) {
            EditText editText = this.f65003c;
            if (editText == null) {
                l.a("etUserName");
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
            return;
        }
        EditText editText2 = this.f65003c;
        if (editText2 == null) {
            l.a("etUserName");
        }
        editText2.requestFocus();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65047a = getString(R.string.ard);
        bVar.f65051e = getString(R.string.arj);
        bVar.f65052f = getString(R.string.ari);
        bVar.f65048b = getString(R.string.flo);
        bVar.f65054h = true;
        bVar.f65055i = "set_username";
        bVar.f65057k = true;
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void D() {
        this.f65009m = false;
        r.a("click_username_skip", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", this.f65006j).f62575a);
        IAccountUserService e2 = cj.f71084b.e();
        l.b(e2, "");
        if (!e2.isChildrenMode()) {
            com.bytedance.sdk.a.e.a a2 = com.ss.android.ugc.aweme.account.n.e.a();
            if (a2 != null) {
                com.ss.android.ugc.aweme.account.n.e.a(getActivity(), getArguments(), new a(this), a2);
            } else {
                super.D();
            }
        } else {
            super.D();
        }
    }

    public static final class e implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f65013a;

        static {
            Covode.recordClassIndex(39968);
        }

        public static final class a extends f.a.m.a<com.ss.android.ugc.aweme.account.login.v2.a.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f65014a;

            static {
                Covode.recordClassIndex(39969);
            }

            @Override // org.a.c
            public final void onComplete() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(e eVar) {
                this.f65014a = eVar;
            }

            @Override // org.a.c
            public final /* synthetic */ void onNext(Object obj) {
                com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) obj;
                l.d(dVar, "");
                v vVar = this.f65014a.f65013a;
                l.d(dVar, "");
                List<String> list = null;
                if (!l.a((Object) dVar.f64233a, (Object) false)) {
                    vVar.a(true, 3, null);
                    return;
                }
                vVar.a(false, 1, dVar.status_msg);
                com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = vVar.f65001a;
                if (fVar == null) {
                    l.b();
                }
                List<String> list2 = dVar.f64234b;
                if (list2 != null) {
                    list = n.g((Iterable) list2);
                }
                fVar.a(list);
            }

            @Override // org.a.c
            public final void onError(Throwable th) {
                String str;
                List<String> list;
                List<String> list2;
                l.d(th, "");
                v vVar = this.f65014a.f65013a;
                l.d(th, "");
                if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                    if (aVar.getRawResponse() != null) {
                        Object rawResponse = aVar.getRawResponse();
                        if (rawResponse instanceof com.ss.android.ugc.aweme.account.login.v2.a.d) {
                            com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) rawResponse;
                            list = dVar.f64234b;
                            str = dVar.status_msg;
                        } else {
                            str = null;
                            list = null;
                        }
                        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = vVar.f65001a;
                        if (fVar == null) {
                            l.b();
                        }
                        if (list != null) {
                            list2 = n.g((Iterable) list);
                        } else {
                            list2 = null;
                        }
                        fVar.a(list2);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        vVar.a(false, 1, str);
                        return;
                    }
                }
                vVar.a(true, 1, null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(v vVar) {
            this.f65013a = vVar;
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.base.i.a
        public final void a(String str) {
            l.d(str, "");
            if (!TextUtils.isEmpty(str)) {
                View c2 = this.f65013a.c(R.id.dzi);
                l.b(c2, "");
                ((InputWithIndicator) c2.findViewById(R.id.bpw)).a(2, 0);
                this.f65013a.f65002b.a(str, new a(this));
            }
        }
    }

    public static final class b extends f.a.m.a<com.ss.android.ugc.aweme.account.login.v2.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f65011a;

        static {
            Covode.recordClassIndex(39965);
        }

        @Override // org.a.c
        public final void onComplete() {
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(v vVar) {
            this.f65011a = vVar;
        }

        @Override // org.a.c
        public final /* synthetic */ void onNext(Object obj) {
            com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) obj;
            l.d(dVar, "");
            List<String> list = dVar.f64234b;
            if (list != null && (!list.isEmpty())) {
                if (this.f65011a.ab_()) {
                    this.f65011a.a(dVar);
                } else {
                    this.f65011a.f65007k = dVar;
                }
            }
        }
    }

    public static final class f extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f65015a;

        static {
            Covode.recordClassIndex(39970);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(v vVar) {
            this.f65015a = vVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            if (this.f65015a.ab_()) {
                String obj = this.f65015a.e().getText().toString();
                boolean isEmpty = TextUtils.isEmpty(obj);
                if (isEmpty || this.f65015a.f65005e) {
                    this.f65015a.f65002b.b();
                    this.f65015a.f65004d.a("");
                }
                if (this.f65015a.f65005e) {
                    this.f65015a.e().setSelection(obj.length());
                    this.f65015a.a(true, 3, null);
                    this.f65015a.f65005e = false;
                    return;
                }
                com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = this.f65015a.f65001a;
                if (fVar == null) {
                    l.b();
                }
                fVar.a(null);
                this.f65015a.a(false, 1, null);
                if (!isEmpty) {
                    this.f65015a.f65004d.a(obj);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            super.onTextChanged(charSequence, i2, i3, i4);
            if (!this.f65015a.f65005e) {
                if (i4 > 0) {
                    if (i3 == 0) {
                        r.a("type_username", new com.ss.android.ugc.aweme.account.a.b.a().a(StringSet.type, "write").a("platform", this.f65015a.f65006j).f62575a);
                        return;
                    }
                } else if (i4 == 0) {
                    if (i3 > 0) {
                        r.a("type_username", new com.ss.android.ugc.aweme.account.a.b.a().a(StringSet.type, "delete").a("platform", this.f65015a.f65006j).f62575a);
                        return;
                    }
                    return;
                } else if (i4 <= 0) {
                    return;
                }
                if (i3 > 0) {
                    r.a("type_username", new com.ss.android.ugc.aweme.account.a.b.a().a(StringSet.type, "replace").a("platform", this.f65015a.f65006j).f62575a);
                }
            }
        }
    }

    static final class c extends m implements h.f.a.b<String, z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(39966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            if (!TextUtils.isEmpty(str2)) {
                this.this$0.f65005e = true;
                this.this$0.e().setText(str2);
                r.a("choose_recommend_username", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.this$0.w()).a("enter_method", this.this$0.x()).a("platform", this.this$0.f65006j).f62575a);
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.account.login.v2.a.d dVar) {
        List g2;
        l.d(dVar, "");
        List<String> list = dVar.f64234b;
        if (list != null && (g2 = n.g((Iterable) list)) != null && (!g2.isEmpty())) {
            this.f65005e = true;
            EditText editText = this.f65003c;
            if (editText == null) {
                l.a("etUserName");
            }
            editText.setText((CharSequence) g2.get(0));
            this.f65008l = (String) g2.get(0);
            com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = this.f65001a;
            if (fVar == null) {
                l.b();
            }
            fVar.a(g2.subList(1, g2.size()));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("set_username_platform", "")) == null) {
            str = "";
        }
        this.f65006j = str;
        r.a("set_username_show", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", w()).a("enter_method", x()).a("platform", this.f65006j).f62575a);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("new_user_need_get_recommend_username")) {
            this.f65002b.a("", new b(this));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f65012a;

        static {
            Covode.recordClassIndex(39967);
        }

        d(v vVar) {
            this.f65012a = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ad adVar = this.f65012a.f65002b;
            v vVar = this.f65012a;
            String obj = vVar.e().getText().toString();
            String str = this.f65012a.f65006j;
            String str2 = this.f65012a.f65008l;
            l.d(vVar, "");
            l.d(obj, "");
            l.d(str, "");
            l.d(str2, "");
            adVar.b();
            adVar.a().put("login_name", obj);
            HashMap<String, String> a2 = adVar.a();
            l.d(vVar, "");
            l.d(a2, "");
            l.d(str, "");
            l.d(str2, "");
            String str3 = a2.get("login_name");
            h<R> a3 = NetworkProxyAccount.d("/passport/login_name/register/", a2).a(new x.w(vVar)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            x.C1440x xVar = new x.C1440x(vVar, str, str2, str3);
            f.a.d.f<? super R> fVar = f.a.e.b.a.f157191d;
            f.a.d.a aVar = f.a.e.b.a.f157190c;
            h<R> a4 = a3.a(fVar, xVar, aVar, aVar).a(new x.y(vVar, str, str2, str3));
            x.z zVar = new x.z(vVar);
            f.a.e.b.b.a((Object) zVar, "onFinally is null");
            h a5 = f.a.h.a.a(new f.a.e.e.b.c(a4, zVar));
            x.aa aaVar = new x.aa(vVar);
            j jVar = f.a.e.b.a.f157194g;
            f.a.d.a aVar2 = f.a.e.b.a.f157190c;
            f.a.e.b.b.a((Object) aaVar, "onSubscribe is null");
            f.a.e.b.b.a((Object) jVar, "onRequest is null");
            f.a.e.b.b.a((Object) aVar2, "onCancel is null");
            h a6 = f.a.h.a.a(new f.a.e.e.b.e(a5, aaVar, jVar, aVar2));
            l.b(a6, "");
            adVar.f64203a = a6.a((f.a.d.f) new ad.c(obj, vVar)).a(ad.d.f64213a, ad.e.f64214a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        InputResultIndicator inputResultIndicator;
        l.d(str, "");
        View c2 = c(R.id.dzi);
        if (c2 != null && (inputResultIndicator = (InputResultIndicator) c2.findViewById(R.id.bpx)) != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View c2 = c(R.id.dzi);
        l.b(c2, "");
        EditText editText = ((InputWithIndicator) c2.findViewById(R.id.bpw)).getEditText();
        this.f65003c = editText;
        if (editText == null) {
            l.a("etUserName");
        }
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.arg));
        RecyclerView recyclerView = (RecyclerView) c(R.id.dzk);
        l.b(recyclerView, "");
        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = new com.ss.android.ugc.aweme.account.login.v2.ui.f(recyclerView, null, new c(this));
        this.f65001a = fVar;
        fVar.f65069a = true;
        a(c(R.id.dzj), new d(this));
        this.f65004d.a(new e(this), TimeUnit.MILLISECONDS);
        EditText editText2 = this.f65003c;
        if (editText2 == null) {
            l.a("etUserName");
        }
        editText2.addTextChangedListener(new f(this));
        com.ss.android.ugc.aweme.account.login.v2.a.d dVar = this.f65007k;
        if (dVar != null) {
            a(dVar);
        }
    }

    public final void a(boolean z, int i2, String str) {
        LoadingButton loadingButton = (LoadingButton) c(R.id.dzj);
        l.b(loadingButton, "");
        loadingButton.setEnabled(z);
        if (str == null) {
            View c2 = c(R.id.dzi);
            l.b(c2, "");
            ((InputResultIndicator) c2.findViewById(R.id.bpx)).a();
        } else {
            View c3 = c(R.id.dzi);
            l.b(c3, "");
            ((InputResultIndicator) c3.findViewById(R.id.bpx)).a(str);
        }
        View c4 = c(R.id.dzi);
        l.b(c4, "");
        ((InputWithIndicator) c4.findViewById(R.id.bpw)).a(i2, 0);
    }
}
