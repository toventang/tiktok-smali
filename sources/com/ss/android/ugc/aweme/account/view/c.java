package com.ss.android.ugc.aweme.account.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountTipsViewDelegate;
import h.f.b.l;

public final class c implements IPrivateAccountTipsView {

    /* renamed from: a  reason: collision with root package name */
    public static final c f65516a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IPrivateAccountTipsView f65517b;

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return this.f65517b.a(layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void a() {
        this.f65517b.a();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void a(Bundle bundle) {
        this.f65517b.a(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void a(View view, b bVar) {
        l.d(view, "");
        l.d(bVar, "");
        this.f65517b.a(view, bVar);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void b() {
        this.f65517b.b();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void c() {
        this.f65517b.c();
    }

    static {
        Covode.recordClassIndex(40297);
    }

    private c() {
        IPrivateAccountTipsView d2 = PrivateAccountTipsViewDelegate.d();
        l.b(d2, "");
        this.f65517b = d2;
    }
}
