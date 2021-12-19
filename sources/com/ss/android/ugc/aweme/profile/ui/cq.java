package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.login.v2.a.ad;
import com.ss.android.ugc.aweme.account.login.v2.base.i;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.k;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.experiment.gy;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.utils.dk;
import com.ss.android.ugc.aweme.utils.hg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class cq extends cp implements k {
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f117078a = "";

    /* renamed from: b  reason: collision with root package name */
    b f117079b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f117080c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f117081d;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f117082f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f117083g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.v2.ui.f f117084h;

    /* renamed from: i  reason: collision with root package name */
    public ad f117085i = new ad();

    /* renamed from: j  reason: collision with root package name */
    public EditText f117086j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.account.login.v2.base.i f117087k = new com.ss.android.ugc.aweme.account.login.v2.base.i();

    /* renamed from: l  reason: collision with root package name */
    public boolean f117088l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.v2.a.d f117089m;
    public String n = "";
    private String s = "";
    private String t = "";
    private boolean u;
    private String v = "";
    private int w;
    private boolean x;
    private AccountKeyBoardHelper y;
    private SparseArray z;

    public interface b {
        static {
            Covode.recordClassIndex(75605);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(75603);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final View a(int i2) {
        if (this.z == null) {
            this.z = new SparseArray();
        }
        View view = (View) this.z.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.z.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final void cc_() {
        SparseArray sparseArray = this.z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75604);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final TextView a() {
        TextView textView = this.f117080c;
        if (textView == null) {
            l.a("mUserLinkHint");
        }
        return textView;
    }

    public final EditText c() {
        EditText editText = this.f117086j;
        if (editText == null) {
            l.a("etUserName");
        }
        return editText;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void f() {
        RecyclerView recyclerView = this.f117083g;
        if (recyclerView == null) {
            l.a("setUsernameRv");
        }
        recyclerView.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.y;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f64747a = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void u() {
        RecyclerView recyclerView = this.f117083g;
        if (recyclerView == null) {
            l.a("setUsernameRv");
        }
        recyclerView.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.bf
    public final void onDestroyView() {
        this.f117089m = null;
        this.f117085i.b();
        this.f117087k.a();
        super.onDestroyView();
        cc_();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final boolean ca_() {
        Dialog dialog;
        EditText editText = this.f117086j;
        if (editText == null) {
            l.a("etUserName");
        }
        KeyboardUtils.c(editText);
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final void d() {
        b bVar = this.f117079b;
        if (bVar != null) {
            EditText editText = this.f117086j;
            if (editText == null) {
                l.a("etUserName");
            }
            bVar.a(editText.getText().toString());
        }
        EditText editText2 = this.f117086j;
        if (editText2 == null) {
            l.a("etUserName");
        }
        if (!gy.a(editText2.getText().toString())) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", 1);
            com.bytedance.apm.b.a("check_user_name_status", jSONObject, (JSONObject) null, (JSONObject) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.y;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f64747a = this;
        }
        if (AccountKeyBoardHelper.a.a()) {
            EditText editText = this.f117086j;
            if (editText == null) {
                l.a("etUserName");
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
            return;
        }
        EditText editText2 = this.f117086j;
        if (editText2 == null) {
            l.a("etUserName");
        }
        editText2.requestFocus();
    }

    public static final class c implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cq f117090a;

        static {
            Covode.recordClassIndex(75606);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            if (dk.a(this.f117090a.c().getText().toString(), com.bytedance.ies.ugc.appcontext.d.a())) {
                KeyboardUtils.c(this.f117090a.c());
                y.a("save_profile", "click_save", StringSet.name);
                cq cqVar = this.f117090a;
                androidx.fragment.app.e activity = cqVar.getActivity();
                if (activity != null) {
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(activity).a(R.string.flz).b(R.string.flx), new h(cqVar)).a(new i(cqVar))).a().b().show();
                    return;
                }
                return;
            }
            y.b(0, this.f117090a.f117078a, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(cq cqVar) {
            this.f117090a = cqVar;
        }
    }

    public static final class f implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cq f117092a;

        static {
            Covode.recordClassIndex(75609);
        }

        public static final class a extends f.a.m.a<com.ss.android.ugc.aweme.account.login.v2.a.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f117093a;

            static {
                Covode.recordClassIndex(75610);
            }

            @Override // org.a.c
            public final void onComplete() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(f fVar) {
                this.f117093a = fVar;
            }

            @Override // org.a.c
            public final void onError(Throwable th) {
                String str;
                List<String> list;
                List<String> list2;
                List g2;
                l.d(th, "");
                cq cqVar = this.f117093a.f117092a;
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
                        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = cqVar.f117084h;
                        if (fVar == null) {
                            l.b();
                        }
                        if (list == null || (g2 = n.g((Iterable) list)) == null) {
                            list2 = null;
                        } else {
                            list2 = n.g((Collection) g2);
                        }
                        fVar.a(list2);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        cqVar.a(false, 1, str);
                        return;
                    }
                }
                cqVar.a(true, 1, (String) null);
            }

            @Override // org.a.c
            public final /* synthetic */ void onNext(Object obj) {
                List g2;
                com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) obj;
                l.d(dVar, "");
                cq cqVar = this.f117093a.f117092a;
                l.d(dVar, "");
                List<String> list = null;
                if (!l.a((Object) dVar.f64233a, (Object) false)) {
                    cqVar.a(true, 3, (String) null);
                    return;
                }
                cqVar.a(false, 1, dVar.status_msg);
                com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = cqVar.f117084h;
                if (fVar == null) {
                    l.b();
                }
                List<String> list2 = dVar.f64234b;
                if (!(list2 == null || (g2 = n.g((Iterable) list2)) == null)) {
                    list = n.g((Collection) g2);
                }
                fVar.a(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(cq cqVar) {
            this.f117092a = cqVar;
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.base.i.a
        public final void a(String str) {
            l.d(str, "");
            if (!TextUtils.isEmpty(str)) {
                LinearLayout linearLayout = this.f117092a.f117082f;
                if (linearLayout == null) {
                    l.a("setUsernameInclude");
                }
                ((InputWithIndicator) linearLayout.findViewById(R.id.bpw)).a(2, 0);
                this.f117092a.f117085i.a(str, new a(this));
            }
        }
    }

    public static final class d extends f.a.m.a<com.ss.android.ugc.aweme.account.login.v2.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cq f117091a;

        static {
            Covode.recordClassIndex(75607);
        }

        @Override // org.a.c
        public final void onComplete() {
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(cq cqVar) {
            this.f117091a = cqVar;
        }

        @Override // org.a.c
        public final /* synthetic */ void onNext(Object obj) {
            com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) obj;
            l.d(dVar, "");
            List<String> list = dVar.f64234b;
            if (list != null && (!list.isEmpty())) {
                this.f117091a.a(dVar);
            }
        }
    }

    public static final class g extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cq f117094a;

        static {
            Covode.recordClassIndex(75611);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(cq cqVar) {
            this.f117094a = cqVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            String obj = this.f117094a.c().getText().toString();
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (isEmpty || this.f117094a.f117088l) {
                this.f117094a.f117085i.b();
                this.f117094a.f117087k.a("");
            }
            if (this.f117094a.f117088l) {
                this.f117094a.c().setSelection(obj.length());
                this.f117094a.a(true, 3, (String) null);
                this.f117094a.f117088l = false;
                return;
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = this.f117094a.f117084h;
            if (fVar == null) {
                l.b();
            }
            fVar.a(null);
            this.f117094a.a(false, 1, (String) null);
            if (!isEmpty) {
                this.f117094a.f117087k.a(obj);
            }
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            super.onTextChanged(charSequence, i2, i3, i4);
            this.f117094a.a().setText("www.tiktok.com/");
            TextView a2 = this.f117094a.a();
            cq cqVar = this.f117094a;
            String obj = cqVar.c().getText().toString();
            l.d(obj, "");
            if (l.a((Object) obj, (Object) "")) {
                obj = "username";
            }
            SpannableString spannableString = new SpannableString("@".concat(String.valueOf(obj)));
            Context context = cqVar.getContext();
            if (context == null) {
                l.b();
            }
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bx)), 0, obj.length() + 1, 33);
            a2.append(spannableString);
            boolean z = this.f117094a.f117088l;
        }
    }

    static final class e extends m implements h.f.a.b<String, z> {
        final /* synthetic */ cq this$0;

        static {
            Covode.recordClassIndex(75608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(cq cqVar) {
            super(1);
            this.this$0 = cqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            if (!TextUtils.isEmpty(str2)) {
                this.this$0.f117088l = true;
                this.this$0.c().setText(str2);
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ cq this$0;

        static {
            Covode.recordClassIndex(75612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(cq cqVar) {
            super(1);
            this.this$0 = cqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.fly, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.cq.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(75613);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.d();
                    this.this$0.this$0.dismiss();
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, AnonymousClass2.f117095a);
            bVar2.f44820b = true;
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ cq this$0;

        static {
            Covode.recordClassIndex(75615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(cq cqVar) {
            super(1);
            this.this$0 = cqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            com.bytedance.tux.dialog.a aVar2 = aVar;
            l.d(aVar2, "");
            Object obj = aVar2.f44884j;
            if (obj == null) {
                y.a(0, this.this$0.f117078a, "blank");
            } else if (l.a(obj, (Object) 0)) {
                y.a(1, this.this$0.f117078a, "button");
            } else if (l.a(obj, (Object) 1)) {
                y.a(0, this.this$0.f117078a, "button");
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.account.login.v2.a.d dVar) {
        List g2;
        List g3;
        l.d(dVar, "");
        List<String> list = dVar.f64234b;
        if (list != null && (g2 = n.g((Iterable) list)) != null && (g3 = n.g((Collection) g2)) != null && (!g3.isEmpty())) {
            this.f117088l = true;
            EditText editText = this.f117086j;
            if (editText == null) {
                l.a("etUserName");
            }
            editText.setText((CharSequence) g3.get(0));
            this.n = (String) g3.get(0);
            com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = this.f117084h;
            if (fVar == null) {
                l.b();
            }
            fVar.a(g3.subList(1, g3.size()));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("content_name");
            if (string == null) {
                l.b();
            }
            this.s = string;
            String string2 = arguments.getString("content_value");
            if (string2 == null) {
                l.b();
            }
            this.t = string2;
            this.u = arguments.getBoolean("is_edit_enabled");
            String string3 = arguments.getString("edit_hint");
            if (string3 == null) {
                l.b();
            }
            this.v = string3;
            this.w = arguments.getInt("content_max_length");
            this.x = arguments.getBoolean("is_enable_null");
            String string4 = arguments.getString("enter_from");
            if (string4 == null) {
                l.b();
            }
            this.f117078a = string4;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("new_user_need_get_recommend_username")) {
            this.f117085i.a("", new d(this));
        }
    }

    public final void a(boolean z2, int i2, String str) {
        if (!z2 || !this.u) {
            i();
        } else {
            h();
        }
        if (str == null) {
            LinearLayout linearLayout = this.f117082f;
            if (linearLayout == null) {
                l.a("setUsernameInclude");
            }
            ((InputResultIndicator) linearLayout.findViewById(R.id.bpx)).a();
        } else {
            LinearLayout linearLayout2 = this.f117082f;
            if (linearLayout2 == null) {
                l.a("setUsernameInclude");
            }
            ((InputResultIndicator) linearLayout2.findViewById(R.id.bpx)).a(str);
        }
        LinearLayout linearLayout3 = this.f117082f;
        if (linearLayout3 == null) {
            l.a("setUsernameInclude");
        }
        ((InputWithIndicator) linearLayout3.findViewById(R.id.bpw)).a(i2, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ao_, viewGroup, false);
        androidx.fragment.app.e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        hg.a(activity, window, true);
        View findViewById = a2.findViewById(R.id.fdi);
        l.b(findViewById, "");
        this.f117080c = (TextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.eyy);
        l.b(findViewById2, "");
        this.f117081d = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.dzi);
        l.b(findViewById3, "");
        this.f117082f = (LinearLayout) findViewById3;
        View findViewById4 = a2.findViewById(R.id.dzk);
        l.b(findViewById4, "");
        this.f117083g = (RecyclerView) findViewById4;
        this.o = (TuxNavBar) a2.findViewById(R.id.csl);
        com.bytedance.tux.navigation.a.c j2 = j();
        com.bytedance.tux.navigation.a.g b2 = b(this.s);
        com.bytedance.tux.navigation.a.e a3 = new com.bytedance.tux.navigation.a.e().a((Object) "save");
        String string = getString(R.string.bkt);
        l.b(string, "");
        com.bytedance.tux.navigation.a.e a4 = a3.a(string).a((com.bytedance.tux.navigation.a.d) new c(this));
        TuxNavBar tuxNavBar = this.o;
        if (tuxNavBar != null) {
            TuxNavBar.a b3 = new TuxNavBar.a().a(j2).a(b2).b(a4);
            b3.f45188d = true;
            tuxNavBar.setNavActions(b3);
        }
        LinearLayout linearLayout = this.f117082f;
        if (linearLayout == null) {
            l.a("setUsernameInclude");
        }
        EditText editText = ((InputWithIndicator) linearLayout.findViewById(R.id.bpw)).getEditText();
        this.f117086j = editText;
        if (!this.u) {
            if (editText == null) {
                l.a("etUserName");
            }
            editText.setEnabled(false);
            EditText editText2 = this.f117086j;
            if (editText2 == null) {
                l.a("etUserName");
            }
            editText2.setFocusable(false);
            EditText editText3 = this.f117086j;
            if (editText3 == null) {
                l.a("etUserName");
            }
            editText3.setFocusableInTouchMode(false);
        }
        i();
        if (TextUtils.isEmpty(this.v)) {
            TextView textView = this.f117081d;
            if (textView == null) {
                l.a("mIdEditHintText");
            }
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.f117081d;
            if (textView2 == null) {
                l.a("mIdEditHintText");
            }
            textView2.setText(this.v);
        }
        l.b(a2, "");
        this.y = new AccountKeyBoardHelper(a2, this);
        LinearLayout linearLayout2 = this.f117082f;
        if (linearLayout2 == null) {
            l.a("setUsernameInclude");
        }
        EditText editText4 = ((InputWithIndicator) linearLayout2.findViewById(R.id.bpw)).getEditText();
        this.f117086j = editText4;
        if (editText4 == null) {
            l.a("etUserName");
        }
        editText4.setNextFocusDownId(editText4.getId());
        editText4.setHint(getString(R.string.arg));
        RecyclerView recyclerView = this.f117083g;
        if (recyclerView == null) {
            l.a("setUsernameRv");
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = new com.ss.android.ugc.aweme.account.login.v2.ui.f(recyclerView, null, new e(this));
        this.f117084h = fVar;
        fVar.f65069a = true;
        this.f117087k.a(new f(this), TimeUnit.MILLISECONDS);
        EditText editText5 = this.f117086j;
        if (editText5 == null) {
            l.a("etUserName");
        }
        editText5.addTextChangedListener(new g(this));
        EditText editText6 = this.f117086j;
        if (editText6 == null) {
            l.a("etUserName");
        }
        editText6.setText(this.t);
        EditText editText7 = this.f117086j;
        if (editText7 == null) {
            l.a("etUserName");
        }
        EditText editText8 = this.f117086j;
        if (editText8 == null) {
            l.a("etUserName");
        }
        editText7.setSelection(editText8.getText().length());
        EditText editText9 = this.f117086j;
        if (editText9 == null) {
            l.a("etUserName");
        }
        editText9.setFocusable(true);
        EditText editText10 = this.f117086j;
        if (editText10 == null) {
            l.a("etUserName");
        }
        editText10.setFocusableInTouchMode(true);
        EditText editText11 = this.f117086j;
        if (editText11 == null) {
            l.a("etUserName");
        }
        editText11.requestFocus();
        com.ss.android.ugc.aweme.account.login.v2.a.d dVar = this.f117089m;
        if (dVar != null) {
            a(dVar);
        }
        return a2;
    }
}
