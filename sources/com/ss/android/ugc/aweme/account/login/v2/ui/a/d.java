package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.a.z;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import f.a.q;
import h.f.b.l;
import java.util.HashMap;

public final class d extends com.ss.android.ugc.aweme.account.l.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f64801b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f64802a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f64803e;

    /* renamed from: j  reason: collision with root package name */
    private String f64804j = "";

    /* renamed from: k  reason: collision with root package name */
    private long f64805k = System.currentTimeMillis();

    /* renamed from: l  reason: collision with root package name */
    private HashMap f64806l;

    static {
        Covode.recordClassIndex(39828);
    }

    @Override // com.ss.android.ugc.aweme.account.l.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64806l == null) {
            this.f64806l = new HashMap();
        }
        View view = (View) this.f64806l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64806l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.l.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64806l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.l.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39829);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void D() {
        this.f64803e = false;
        r.a("click_password_skip", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "sms_verification").f62575a);
        super.D();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (this.f64803e) {
            return true;
        }
        if (this.f64802a) {
            return false;
        }
        cj.a(13, 2, (Object) null);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.l.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        String string;
        String string2;
        String str;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (!i()) {
            string = getString(R.string.aox);
            l.b(string, "");
            string2 = getString(R.string.aqp);
            l.b(string2, "");
            str = "set_password";
        } else {
            string = getString(R.string.apn);
            l.b(string, "");
            string2 = getString(R.string.aph);
            l.b(string2, "");
            str = "reset_password";
        }
        bVar.f65047a = string;
        bVar.f65051e = string2;
        bVar.f65055i = str;
        boolean z = true;
        if (V_() == k.CREATE_PASSWORD_FOR_PHONE) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.containsKey("show_skip")) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    l.b();
                }
                if (arguments2.getBoolean("show_skip")) {
                    bVar.f65048b = getString(R.string.flo);
                    this.f64803e = true;
                }
            }
        }
        bVar.f65057k = true;
        if (A() == j.RECOVER_ACCOUNT) {
            z = false;
        }
        bVar.f65056j = z;
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.account.l.a
    public final void e() {
        boolean z;
        ((LoadingButton) c(R.id.agu)).a(true);
        String text = ((InputWithIndicator) c(R.id.agv)).getText();
        if (!b(text)) {
            if (TextUtils.isEmpty(text) || !l.a((Object) text, (Object) this.f64804j)) {
                z = false;
            } else {
                z = true;
            }
            int i2 = e.f64813a[V_().ordinal()];
            if (i2 == 1) {
                String g2 = g();
                l.d(this, "");
                l.d(text, "");
                l.d(g2, "");
                n b2 = n.a((q) new x.cl(this, text, g2)).d(new x.cm(this, text, z)).b(new x.cn(this, z));
                l.b(b2, "");
                z.a(this, b2).c();
            } else if (i2 == 2) {
                x.a(this, text).d(new e(this)).c();
            } else if (i2 == 3) {
                com.ss.android.ugc.aweme.account.n.a.a(getContext());
                if (com.ss.android.ugc.aweme.account.experiment.l.a()) {
                    String g3 = g();
                    l.d(this, "");
                    l.d(text, "");
                    l.d(g3, "");
                    n b3 = n.a((q) new x.al(this, text, g3)).d(new x.am(this)).b(new x.an(this));
                    l.b(b3, "");
                    z.a(this, b3).d(new b(this, text)).c();
                    return;
                }
                String a2 = com.ss.android.ugc.aweme.account.login.v2.base.e.a(this);
                l.d(this, "");
                Bundle arguments = getArguments();
                if (arguments == null) {
                    l.b();
                }
                l.b(arguments, "");
                l.d(arguments, "");
                boolean z2 = arguments.getBoolean("is_multi_account_same_user", false);
                l.d(this, "");
                l.d(a2, "");
                l.d(text, "");
                n b4 = n.a((q) new x.ah(this, text, a2, z2)).d(new x.ai(this)).b(new x.aj(this));
                l.b(b4, "");
                z.a(this, b4).d(new c(this, text)).c();
            } else if (i2 == 4) {
                String g4 = g();
                l.d(this, "");
                l.d(text, "");
                l.d(g4, "");
                n b5 = n.a((q) new x.bk(this, z, text, g4)).d(new x.bl(this, text, z)).b(new x.bm(this, z));
                l.b(b5, "");
                z.a(this, b5).d(new C1446d(this)).c();
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f64807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64808b;

        static {
            Covode.recordClassIndex(39830);
        }

        b(d dVar, String str) {
            this.f64807a = dVar;
            this.f64808b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64807a.a(this.f64808b);
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f64809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64810b;

        static {
            Covode.recordClassIndex(39831);
        }

        c(d dVar, String str) {
            this.f64809a = dVar;
            this.f64810b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64809a.a(this.f64810b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.d$d  reason: collision with other inner class name */
    static final class C1446d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f64811a;

        static {
            Covode.recordClassIndex(39832);
        }

        C1446d(d dVar) {
            this.f64811a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f64811a.getContext()).a(R.string.ab9).a();
        }
    }

    public final void a(String str) {
        l.d(str, "");
        if (A() == j.SIGN_UP || A() == j.LOGIN) {
            com.ss.android.ugc.aweme.account.n.e.b(com.ss.android.ugc.aweme.account.login.v2.base.e.a(this));
            com.ss.android.ugc.aweme.account.n.e.a(str);
            com.ss.android.ugc.aweme.account.n.e.c("email");
        }
        if (A() == j.SIGN_UP) {
            r.a("input_email_pwd_page", new com.ss.android.ugc.aweme.account.a.b.a().a("stay_time", System.currentTimeMillis() - this.f64805k).f62575a);
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f64812a;

        static {
            Covode.recordClassIndex(39833);
        }

        e(d dVar) {
            this.f64812a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            this.f64812a.f64802a = true;
            cj.a(13, 1, (Object) null);
            if (this.f64812a.A() == j.SIGN_UP || this.f64812a.A() == j.LOGIN) {
                Bundle arguments = this.f64812a.getArguments();
                if (arguments == null || (str = arguments.getString("gms_store_id")) == null) {
                    str = "";
                }
                com.ss.android.ugc.aweme.account.n.e.b(str);
                Bundle arguments2 = this.f64812a.getArguments();
                if (arguments2 == null || (str2 = arguments2.getString("gms_store_pwd")) == null) {
                    str2 = "";
                }
                com.ss.android.ugc.aweme.account.n.e.a(str2);
                Bundle arguments3 = this.f64812a.getArguments();
                if (arguments3 == null || (str3 = arguments3.getString("gms_store_platform")) == null) {
                    str3 = "";
                }
                com.ss.android.ugc.aweme.account.n.e.c(str3);
            }
            Bundle arguments4 = this.f64812a.getArguments();
            if (arguments4 == null) {
                l.b();
            }
            arguments4.putInt("next_page", k.FINISH.getValue());
            d dVar = this.f64812a;
            Bundle arguments5 = dVar.getArguments();
            if (arguments5 == null) {
                l.b();
            }
            l.b(arguments5, "");
            dVar.a(arguments5);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.l.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (i()) {
            String string = getString(R.string.aof);
            l.b(string, "");
            ((LoadingButton) c(R.id.agu)).setText(string);
        }
    }
}
