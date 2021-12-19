package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.zhiliaoapp.musically.R;

public class w extends m {

    /* renamed from: c  reason: collision with root package name */
    TextView f78080c;

    /* renamed from: d  reason: collision with root package name */
    TuxTextView f78081d;

    /* renamed from: e  reason: collision with root package name */
    private String f78082e;

    static {
        Covode.recordClassIndex(48407);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.m
    public final void b() {
        super.b();
        d();
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.m
    public final void d() {
        if (getActivity() != null) {
            getActivity().finish();
        }
        a(this.f78035a);
        a<Boolean> a2 = com.ss.android.ugc.aweme.compliance.protection.timelock.a.a();
        if (a2 != null) {
            Boolean.valueOf(true);
            a2.a();
        } else if (!TextUtils.equals(this.f78082e, "logout") && !TextUtils.equals(this.f78082e, "add_account") && !TextUtils.equals(this.f78082e, "switch_account")) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.ghf).a();
            SharePrefCache.inst().getLastUnlockTime().b(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        getActivity().finish();
        a(this.f78035a);
        a<Boolean> a2 = com.ss.android.ugc.aweme.compliance.protection.timelock.a.a();
        if (a2 != null) {
            Boolean.valueOf(true);
            a2.a();
            return;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.ghf).a();
        SharePrefCache.inst().getLastUnlockTime().b(Long.valueOf(System.currentTimeMillis()));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j
    public final void a(String str) {
        if (FamilyPiaringManager.a() == IFamilyPairingService.a.CHILD) {
            FamilyPairingApi.f77990b.verifyPassword(com.ss.android.ugc.aweme.compliance.protection.familypairing.b.a.a(str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new x(this), new y(this));
            return;
        }
        b(str);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.m, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        int i3;
        this.f78080c = (TextView) view.findViewById(R.id.fak);
        this.f78081d = (TuxTextView) view.findViewById(R.id.fb7);
        super.onViewCreated(view, bundle);
        a<Boolean> a2 = com.ss.android.ugc.aweme.compliance.protection.timelock.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = "";
        }
        this.f78082e = str;
        if (a2 != null) {
            boolean b2 = com.ss.android.ugc.aweme.compliance.protection.common.a.b();
            TextView textView = this.f78080c;
            if (!b2) {
                i2 = R.string.ghi;
            } else if (TextUtils.equals(this.f78082e, "add_account")) {
                i2 = R.string.p3;
            } else if (TextUtils.equals(this.f78082e, "switch_account")) {
                i2 = R.string.gb5;
            } else if (!b.g().isLogin()) {
                i2 = R.string.fnh;
            } else {
                i2 = R.string.ghh;
            }
            textView.setText(getString(i2));
            TuxTextView tuxTextView = this.f78081d;
            if (b2) {
                i3 = R.string.ghl;
            } else {
                i3 = R.string.ghm;
            }
            tuxTextView.setText(getString(i3));
            this.f78081d.a(26.0f);
            ImageView imageView = (ImageView) view.findViewById(R.id.elb);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.w.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48408);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (w.this.f78035a != null) {
                        w wVar = w.this;
                        wVar.a(wVar.f78035a);
                    }
                    if (w.this.getActivity() != null) {
                        w.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        this.f78080c.setText(getString(R.string.ghj, String.valueOf(com.ss.android.ugc.aweme.compliance.protection.common.a.c())));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ua, viewGroup, false);
    }
}
