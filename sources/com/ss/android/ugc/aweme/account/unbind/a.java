package com.ss.android.ugc.aweme.account.unbind;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;

public final class a extends com.ss.android.ugc.aweme.account.login.v2.base.c {

    /* renamed from: b  reason: collision with root package name */
    public static final C1461a f65443b = new C1461a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f65444a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f65445c = h.i.a((h.f.a.a) new f(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f65446d = h.i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f65447e = h.i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f65448j = h.i.a((h.f.a.a) new c(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f65449k = h.i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f65450l = h.i.a((h.f.a.a) new i(this));

    /* renamed from: m  reason: collision with root package name */
    private HashMap f65451m;

    static {
        Covode.recordClassIndex(40230);
    }

    private boolean i() {
        return ((Boolean) this.f65449k.getValue()).booleanValue();
    }

    private String k() {
        return (String) this.f65450l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final String Z_() {
        return "UnbindConfirmFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void b_(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final View c(int i2) {
        if (this.f65451m == null) {
            this.f65451m = new HashMap();
        }
        View view = (View) this.f65451m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65451m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean e() {
        return ((Boolean) this.f65445c.getValue()).booleanValue();
    }

    public final ArrayList<String> g() {
        return (ArrayList) this.f65446d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void h() {
        HashMap hashMap = this.f65451m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.account.login.v2.base.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.a$a  reason: collision with other inner class name */
    public static final class C1461a {
        static {
            Covode.recordClassIndex(40231);
        }

        private C1461a() {
        }

        public /* synthetic */ C1461a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final boolean q() {
        a("go_back");
        return false;
    }

    static final class f extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(e.a(this.this$0));
        }
    }

    static final class b extends m implements h.f.a.a<ArrayList<String>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<String> invoke() {
            ArrayList<String> stringArrayList;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (stringArrayList = arguments.getStringArrayList("extra_eligible_login_methods")) == null) {
                return new ArrayList();
            }
            return stringArrayList;
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.g().contains("email"));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.g().contains("mobile"));
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (this.this$0.g().size() <= 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class i extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            ArrayList arrayList = new ArrayList(this.this$0.g());
            arrayList.remove("mobile");
            arrayList.remove("email");
            return n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
        }
    }

    public static final class h implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65453a;

        static {
            Covode.recordClassIndex(40240);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f65453a = aVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            androidx.fragment.app.e activity = this.f65453a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65452a;

        static {
            Covode.recordClassIndex(40237);
        }

        g(a aVar) {
            this.f65452a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f65452a.e()) {
                e.a(this.f65452a, "user_click", new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.account.unbind.a.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(40238);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f65452a.a("click_continue");
                        com.ss.android.ugc.aweme.account.login.v2.base.e.a((Fragment) this.this$0.f65452a, true);
                        a aVar = this.this$0.f65452a;
                        Bundle arguments = this.this$0.f65452a.getArguments();
                        if (arguments == null) {
                            l.b();
                        }
                        arguments.putInt("next_page", k.UNBIND_PHONE_VERIFY.getValue());
                        l.b(arguments, "");
                        aVar.a(arguments);
                        return z.f158842a;
                    }
                });
                return;
            }
            this.f65452a.a("click_continue");
            e.b(this.f65452a, "user_click", new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.account.unbind.a.g.AnonymousClass2 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(40239);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.ss.android.ugc.aweme.account.login.v2.base.e.a((Fragment) this.this$0.f65452a, true);
                    a aVar = this.this$0.f65452a;
                    Bundle arguments = this.this$0.f65452a.getArguments();
                    if (arguments == null) {
                        l.b();
                    }
                    arguments.putInt("next_page", k.UNBIND_EMAIL_VERIFY_USING_EMAIL.getValue());
                    l.b(arguments, "");
                    aVar.a(arguments);
                    return z.f158842a;
                }
            });
        }
    }

    public final void a(String str) {
        String str2;
        com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
        if (e()) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        aVar.a("unlink_type", str2);
        if (!e()) {
            aVar.a("is_email_verified", e.c(this) ? 1 : 0);
        }
        aVar.a("exit_method", str);
        r.a("exit_unlink_phone_email_confirm_page", aVar.f62575a);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        String str;
        super.onCreate(bundle);
        if (e()) {
            String string = getString(R.string.h5c);
            l.b(string, "");
            String string2 = getString(R.string.h5d);
            l.b(string2, "");
            String string3 = getString(R.string.h5e);
            l.b(string3, "");
            String string4 = getString(R.string.h5f);
            l.b(string4, "");
            String string5 = getString(R.string.h5g);
            l.b(string5, "");
            strArr = new String[]{string, string2, string3, string4, string5};
        } else {
            String string6 = getString(R.string.h4p);
            l.b(string6, "");
            String string7 = getString(R.string.h4q);
            l.b(string7, "");
            String string8 = getString(R.string.h4r);
            l.b(string8, "");
            String string9 = getString(R.string.h4s);
            l.b(string9, "");
            strArr = new String[]{string6, string7, string8, string9};
        }
        this.f65444a = new b(strArr);
        com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
        if (e()) {
            str = "phone";
        } else {
            str = "email";
        }
        aVar.a("unlink_type", str);
        if (!e()) {
            aVar.a("is_email_verified", e.c(this) ? 1 : 0);
        }
        r.a("show_unlink_phone_email_confirm_page", aVar.f62575a);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        new com.bytedance.tux.g.b(this).a(str).b();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        User f2 = cj.f();
        if (e()) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.fbh);
            l.b(tuxTextView, "");
            tuxTextView.setText(getString(R.string.h5l));
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.fbg);
            l.b(tuxTextView2, "");
            l.b(f2, "");
            tuxTextView2.setText(getString(R.string.h5k, f2.getBindPhone()));
            TuxTextView tuxTextView3 = (TuxTextView) c(R.id.fbd);
            l.b(tuxTextView3, "");
            String string3 = getString(R.string.a6w);
            l.b(string3, "");
            if (!((Boolean) this.f65448j.getValue()).booleanValue()) {
                string2 = getString(R.string.h5h, k());
            } else if (i()) {
                string2 = getString(R.string.h5i, string3, k());
            } else {
                string2 = getString(R.string.h5j, string3);
            }
            l.b(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            a(spannableString, string2, string3);
            a(spannableString, string2, k());
            tuxTextView3.setText(spannableString);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) c(R.id.fbh);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(getString(R.string.h4x));
            TuxTextView tuxTextView5 = (TuxTextView) c(R.id.fbg);
            l.b(tuxTextView5, "");
            l.b(f2, "");
            tuxTextView5.setText(getString(R.string.h4w, f2.getEmail()));
            TuxTextView tuxTextView6 = (TuxTextView) c(R.id.fbd);
            l.b(tuxTextView6, "");
            String string4 = getString(R.string.a6x);
            l.b(string4, "");
            if (!((Boolean) this.f65447e.getValue()).booleanValue()) {
                string = getString(R.string.h4t, k());
            } else if (i()) {
                string = getString(R.string.h4u, string4, k());
            } else {
                string = getString(R.string.h4v, string4);
            }
            l.b(string, "");
            SpannableString spannableString2 = new SpannableString(string);
            a(spannableString2, string, string4);
            a(spannableString2, string, k());
            tuxTextView6.setText(spannableString2);
        }
        RecyclerView recyclerView = (RecyclerView) c(R.id.fbf);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) c(R.id.fbf);
        l.b(recyclerView2, "");
        b bVar = this.f65444a;
        if (bVar == null) {
            l.a("detailItemAdapter");
        }
        recyclerView2.setAdapter(bVar);
        ((TuxTextView) c(R.id.fbe)).setOnClickListener(new g(this));
        ((NormalTitleBar) c(R.id.rq)).setOnTitleBarClickListener(new h(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.gg, viewGroup, false);
    }

    private static void a(SpannableString spannableString, String str, String str2) {
        int a2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (a2 = p.a((CharSequence) str, str2, 0, false, 6)) != -1) {
            spannableString.setSpan(new com.bytedance.tux.f.a.b(52, true), a2, str2.length() + a2, 33);
        }
    }
}
