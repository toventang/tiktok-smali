package com.ss.android.ugc.aweme.account.l;

import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.a.u;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.a.z;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.ChecklistItemView;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.LoginService;
import com.zhiliaoapp.musically.R;
import f.a.n;
import f.a.q;
import h.f.b.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class a extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f63127a = h.i.a((h.f.a.a) new l(this));

    /* renamed from: b  reason: collision with root package name */
    private final h.h f63128b = h.i.a((h.f.a.a) new k(this));

    /* renamed from: c  reason: collision with root package name */
    public final Map<f, ChecklistItemView> f63129c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<f, String> f63130d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final h.h f63131e = h.i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f63132j = h.i.a((h.f.a.a) new C1401a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f63133k = h.i.a((h.f.a.a) new j(this));

    /* renamed from: l  reason: collision with root package name */
    private String f63134l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap f63135m;

    static {
        Covode.recordClassIndex(38879);
    }

    private String k() {
        return (String) this.f63128b.getValue();
    }

    private final String l() {
        return (String) this.f63132j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public View c(int i2) {
        if (this.f63135m == null) {
            this.f63135m = new HashMap();
        }
        View view = (View) this.f63135m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63135m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hi;
    }

    /* access modifiers changed from: protected */
    public final String g() {
        return (String) this.f63127a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public void h() {
        HashMap hashMap = this.f63135m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i() {
        return ((Boolean) this.f63131e.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class l extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return com.ss.android.ugc.aweme.account.login.v2.base.e.e(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.agu);
        if (loadingButton != null) {
            loadingButton.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.agu);
        if (loadingButton != null) {
            loadingButton.a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$a  reason: collision with other inner class name */
    static final class C1401a extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1401a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("conditional_login_ticket");
            }
            return null;
        }
    }

    static final class j extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("otp_type");
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((InputWithIndicator) c(R.id.agv)).getEditText());
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            int i2 = b.f63146b[this.this$0.V_().ordinal()];
            boolean z = true;
            if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
                z = (i2 == 4 || i2 == 5) ? false : AccountService.a().e().hasCurUserSetPassword();
            }
            return Boolean.valueOf(z);
        }
    }

    static final class k extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null && (string = arguments.getString("platForm")) != null) {
                return string;
            }
            int i2 = b.f63145a[this.this$0.V_().ordinal()];
            if (i2 == 1) {
                return "email";
            }
            if (i2 != 2) {
                return "";
            }
            return "phone";
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (!i() || l() != null) {
            i2 = R.string.aqp;
        } else {
            i2 = R.string.h5z;
        }
        bVar.f65051e = getString(i2);
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    public void e() {
        ((LoadingButton) c(R.id.agu)).a(true);
        String text = ((InputWithIndicator) c(R.id.agv)).getText();
        if (!b(text)) {
            if (TextUtils.isEmpty(g())) {
                x.a(this, text).d(new g(this)).c();
            } else if (TextUtils.equals(k(), "email")) {
                String g2 = g();
                h.f.b.l.d(this, "");
                h.f.b.l.d(g2, "");
                h.f.b.l.d(text, "");
                n b2 = n.a((q) new x.k(this, g2, text)).d(new x.l(this)).b(new x.m(this));
                h.f.b.l.b(b2, "");
                z.a(this, b2).d(new e(this)).c();
            } else {
                String g3 = g();
                h.f.b.l.d(this, "");
                h.f.b.l.d(g3, "");
                h.f.b.l.d(text, "");
                n b3 = n.a((q) new x.n(this, g3, text)).d(new x.o(this)).b(new x.p(this));
                h.f.b.l.b(b3, "");
                z.a(this, b3).d(new f(this)).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63139b;

        static {
            Covode.recordClassIndex(38882);
        }

        c(a aVar, String str) {
            this.f63138a = aVar;
            this.f63139b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f63138a.c(this.f63139b);
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63143a;

        static {
            Covode.recordClassIndex(38887);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f63143a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            String str2;
            String obj;
            if (this.f63143a.ab_()) {
                Iterator<Map.Entry<f, ChecklistItemView>> it = this.f63143a.f63129c.entrySet().iterator();
                boolean z2 = true;
                boolean z3 = true;
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<f, ChecklistItemView> next = it.next();
                    f key = next.getKey();
                    ChecklistItemView value = next.getValue();
                    if (!(editable == null || (obj = editable.toString()) == null)) {
                        str = obj;
                    }
                    if (key.a(str)) {
                        value.setVariant(ChecklistItemView.b.Success);
                    } else {
                        value.setVariant(ChecklistItemView.b.None);
                        z3 = false;
                    }
                }
                Iterator<Map.Entry<f, String>> it2 = this.f63143a.f63130d.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        ((InputResultIndicator) this.f63143a.c(R.id.agw)).a();
                        break;
                    }
                    Map.Entry<f, String> next2 = it2.next();
                    f key2 = next2.getKey();
                    String value2 = next2.getValue();
                    if (editable == null || (str2 = editable.toString()) == null) {
                        str2 = str;
                    }
                    if (!key2.a(str2)) {
                        this.f63143a.a(0, value2);
                        z = false;
                        break;
                    }
                }
                LoadingButton loadingButton = (LoadingButton) this.f63143a.c(R.id.agu);
                h.f.b.l.b(loadingButton, str);
                if (!z3 || !z) {
                    z2 = false;
                }
                loadingButton.setEnabled(z2);
            }
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63144a;

        static {
            Covode.recordClassIndex(38888);
        }

        i(a aVar) {
            this.f63144a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63144a.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63137b;

        static {
            Covode.recordClassIndex(38881);
        }

        b(a aVar, String str) {
            this.f63136a = aVar;
            this.f63137b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.login.v2.base.k kVar;
            u uVar = (u) obj;
            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f63136a.requireActivity().getString(R.string.abn)).a();
            a aVar = this.f63136a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
            if (h.f.b.l.a((Object) this.f63137b, (Object) "phone")) {
                kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.RESET_PASSWORD_FOR_PHONE;
            } else {
                kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.RESET_PASSWORD_FOR_EMAIL;
            }
            com.bytedance.sdk.a.n.a aVar2 = uVar.p;
            if (aVar2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(aVar, jVar, kVar, aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63140a;

        static {
            Covode.recordClassIndex(38884);
        }

        e(a aVar) {
            this.f63140a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            cj.a(8, 1, (Object) ((com.ss.android.ugc.aweme.account.login.v2.a.l) ((com.bytedance.sdk.a.a.a.d) obj).f43081j).f64247b);
            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f63140a.getString(R.string.abn)).a();
            androidx.fragment.app.e activity = this.f63140a.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63141a;

        static {
            Covode.recordClassIndex(38885);
        }

        f(a aVar) {
            this.f63141a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            cj.a(8, 1, (Object) ((com.bytedance.sdk.a.h.a.c) ((com.bytedance.sdk.a.a.a.d) obj).f43081j).f43255b);
            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f63141a.getString(R.string.abn)).a();
            androidx.fragment.app.e activity = this.f63141a.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63142a;

        static {
            Covode.recordClassIndex(38886);
        }

        g(a aVar) {
            this.f63142a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f63142a.getString(R.string.ab9)).a();
            androidx.fragment.app.e activity = this.f63142a.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a("set_password_show", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", k()).a("enter_from", w()).a("enter_method", x()).f62575a);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        h.f.b.l.d(str, "");
        if (l() != null) {
            String l2 = l();
            if (l2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(l2, "");
            if (l2.length() != 0) {
                if (!h.f.b.l.a((Object) this.f63134l, (Object) str)) {
                    this.f63134l = str;
                    String l3 = l();
                    if (l3 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(l3, "");
                    x.a(this, str, l3).d(new c(this, str)).c();
                } else {
                    c(str);
                }
                return true;
            }
        }
        return false;
    }

    public final void c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IAccountUserService e2 = AccountService.a().e();
        h.f.b.l.b(e2, "");
        if (e2.isLogin()) {
            LoginService g2 = cj.g();
            h.f.b.l.b(g2, "");
            if (g2.isEnableMultiAccountLogin()) {
                String encode = Uri.encode("1");
                h.f.b.l.b(encode, "");
                linkedHashMap.put("multi_login", encode);
            }
        }
        String str2 = "mobile";
        if (!h.f.b.l.a((Object) k(), (Object) "phone") && !h.f.b.l.a((Object) k(), (Object) str2)) {
            str2 = "email";
        }
        String l2 = l();
        if (l2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(l2, "");
        x.a(this, str2, str, l2, g(), linkedHashMap).d(new b(this, str2)).c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
        ((InputResultIndicator) c(R.id.agw)).a(str);
        ((LoadingButton) c(R.id.agu)).b(true);
        LoadingButton loadingButton = (LoadingButton) c(R.id.agu);
        h.f.b.l.b(loadingButton, "");
        loadingButton.setEnabled(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.account.l.f, com.ss.android.ugc.aweme.account.ui.ChecklistItemView> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.Map<com.ss.android.ugc.aweme.account.l.f, com.ss.android.ugc.aweme.account.ui.ChecklistItemView> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f63129c.clear();
        Map<f, ChecklistItemView> map = this.f63129c;
        e eVar = new e();
        View c2 = c(R.id.a5e);
        h.f.b.l.b(c2, "");
        map.put(eVar, c2);
        Map<f, ChecklistItemView> map2 = this.f63129c;
        d dVar = new d();
        View c3 = c(R.id.a5d);
        h.f.b.l.b(c3, "");
        map2.put(dVar, c3);
        this.f63130d.clear();
        Map<f, String> map3 = this.f63130d;
        h hVar = new h();
        String string = getResources().getString(R.string.awn);
        h.f.b.l.b(string, "");
        map3.put(hVar, string);
        String string2 = getString(R.string.awp);
        h.f.b.l.b(string2, "");
        ((ChecklistItemView) c(R.id.a5e)).setDesc(string2);
        String string3 = getString(R.string.awo);
        h.f.b.l.b(string3, "");
        ((ChecklistItemView) c(R.id.a5d)).setDesc(string3);
        ((InputWithIndicator) c(R.id.agv)).getEditText().addTextChangedListener(new h(this));
        a(c(R.id.agu), new i(this));
    }
}
