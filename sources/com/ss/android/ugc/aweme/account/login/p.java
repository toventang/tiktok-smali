package com.ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.google.gson.f;
import com.google.gson.o;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.util.d;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.util.s;
import com.ss.android.ugc.aweme.account.util.t;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.Locale;

public final class p implements l {

    /* renamed from: a  reason: collision with root package name */
    public String f63518a;

    /* renamed from: b  reason: collision with root package name */
    public final String f63519b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f63520c;

    /* renamed from: d  reason: collision with root package name */
    public final String f63521d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f63522e;

    /* renamed from: f  reason: collision with root package name */
    private final n f63523f;

    static {
        Covode.recordClassIndex(39151);
    }

    @Override // com.ss.android.ugc.aweme.account.login.l
    public final boolean a() {
        if (!TextUtils.isEmpty(this.f63518a)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.l
    public final void a(Activity activity) {
        d dVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "";
        l.d(activity, str5);
        if (!l.a((Object) this.f63522e, (Object) true)) {
            SmartRouter.buildRoute(activity, this.f63518a).open();
            return;
        }
        n nVar = this.f63523f;
        if (nVar != null) {
            dVar = nVar.f65496d;
        } else {
            dVar = null;
        }
        a.C0731a aVar = new a.C0731a(activity);
        if (dVar == null || (str = dVar.f65480a) == null) {
            str = str5;
        }
        aVar.f33401a = str;
        if (dVar == null || (str2 = dVar.f65481b) == null) {
            str2 = str5;
        }
        aVar.f33402b = str2;
        aVar.F = true;
        aVar.E = true;
        if (dVar == null || (str3 = dVar.f65482c) == null) {
            str3 = str5;
        }
        a.C0731a a2 = aVar.a(str3, (DialogInterface.OnClickListener) new a(this, activity), false);
        if (!(dVar == null || (str4 = dVar.f65483d) == null)) {
            str5 = str4;
        }
        a2.b(str5, (DialogInterface.OnClickListener) new b(activity), false).a().c();
        r.a("account_recover_notify", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f63521d).a("platform", this.f63519b).f62575a);
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f63526a;

        static {
            Covode.recordClassIndex(39153);
        }

        b(Activity activity) {
            this.f63526a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!this.f63526a.isFinishing()) {
                dialogInterface.dismiss();
            }
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f63524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f63525b;

        static {
            Covode.recordClassIndex(39152);
        }

        a(p pVar, Activity activity) {
            this.f63524a = pVar;
            this.f63525b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            SmartRouter.buildRoute(this.f63525b, this.f63524a.f63518a).open();
            r.a("account_recover_notify_confirm", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f63524a.f63521d).a("platform", this.f63524a.f63519b).f62575a);
            if (!this.f63525b.isFinishing()) {
                dialogInterface.dismiss();
            }
        }
    }

    public p(String str, boolean z, String str2) {
        com.google.gson.l lVar;
        String str3;
        l.d(str, "");
        l.d(str2, "");
        this.f63519b = str;
        this.f63520c = z;
        this.f63521d = str2;
        s a2 = t.a();
        l.d(str, "");
        f a3 = NetworkProxyAccount.f65195b.a();
        o oVar = a2.f65506e;
        Boolean bool = null;
        if (oVar != null) {
            Locale locale = Locale.ENGLISH;
            l.b(locale, "");
            String upperCase = str.toUpperCase(locale);
            l.b(upperCase, "");
            lVar = oVar.c(upperCase);
        } else {
            lVar = null;
        }
        n nVar = (n) a3.a(lVar, n.class);
        this.f63523f = nVar;
        if (z) {
            if (nVar != null) {
                str3 = nVar.f65494b;
            }
            str3 = null;
        } else {
            if (nVar != null) {
                str3 = nVar.f65495c;
            }
            str3 = null;
        }
        this.f63518a = str3;
        this.f63522e = nVar != null ? nVar.f65493a : bool;
    }
}
