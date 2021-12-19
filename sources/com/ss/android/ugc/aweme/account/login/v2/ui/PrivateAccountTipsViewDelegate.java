package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.account.login.v2.ui.n;
import com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import f.a.h.a;
import h.f.b.l;
import h.m.p;

public final class PrivateAccountTipsViewDelegate implements IPrivateAccountTipsView {

    /* renamed from: a  reason: collision with root package name */
    public n f64773a;

    static {
        Covode.recordClassIndex(39808);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void c() {
        this.f64773a = null;
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void b() {
        n nVar = this.f64773a;
        if (nVar == null) {
            l.b();
        }
        nVar.f65088a = System.currentTimeMillis();
    }

    public static IPrivateAccountTipsView d() {
        MethodCollector.i(8719);
        Object a2 = b.a(IPrivateAccountTipsView.class, false);
        if (a2 != null) {
            IPrivateAccountTipsView iPrivateAccountTipsView = (IPrivateAccountTipsView) a2;
            MethodCollector.o(8719);
            return iPrivateAccountTipsView;
        }
        if (b.E == null) {
            synchronized (IPrivateAccountTipsView.class) {
                try {
                    if (b.E == null) {
                        b.E = new PrivateAccountTipsViewDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8719);
                    throw th;
                }
            }
        }
        PrivateAccountTipsViewDelegate privateAccountTipsViewDelegate = (PrivateAccountTipsViewDelegate) b.E;
        MethodCollector.o(8719);
        return privateAccountTipsViewDelegate;
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void a() {
        if (f.f34637l) {
            d a2 = new d().a("result", "background");
            long currentTimeMillis = System.currentTimeMillis();
            n nVar = this.f64773a;
            if (nVar == null) {
                l.b();
            }
            r.a("private_notify_exit", a2.a("stay_time", currentTimeMillis - nVar.f65088a).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void a(Bundle bundle) {
        if (bundle == null) {
            r.onEventV3("private_notify_show");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void a(View view, com.ss.android.ugc.aweme.account.view.b bVar) {
        l.d(view, "");
        l.d(bVar, "");
        n nVar = new n(view, bVar);
        this.f64773a = nVar;
        nVar.f65090c.findViewById(R.id.bai).setOnClickListener(new n.c(nVar));
        Context context = nVar.f65090c.getContext();
        String string = context.getString(R.string.cwk);
        l.b(string, "");
        String string2 = context.getString(R.string.b6k, string);
        l.b(string2, "");
        SpannableString spannableString = new SpannableString(string2);
        int a2 = p.a((CharSequence) string2, string, 0, false, 6);
        spannableString.setSpan(new n.d(context, androidx.core.content.b.c(context, R.color.bx)), a2, string.length() + a2, 34);
        TextView textView = (TextView) nVar.f65090c.findViewById(R.id.els);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        textView.setHighlightColor(androidx.core.content.b.c(context, R.color.c9));
        ((PrivateAccountUserSettingsApi) nVar.f65089b.getValue()).setPrivatePolicyShow("minor_private_policy_status", "0").b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(n.e.f65096a, n.f.f65097a);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ge, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
