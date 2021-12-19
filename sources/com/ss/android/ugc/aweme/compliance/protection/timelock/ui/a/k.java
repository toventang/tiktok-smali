package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.compliance.api.c.g;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.zhiliaoapp.musically.R;

public abstract class k extends j implements g {

    /* renamed from: c  reason: collision with root package name */
    protected boolean f78045c;

    /* renamed from: d  reason: collision with root package name */
    protected a f78046d;

    /* renamed from: e  reason: collision with root package name */
    protected TuxStatusView f78047e;

    /* renamed from: j  reason: collision with root package name */
    private View f78048j;

    static {
        Covode.recordClassIndex(48389);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g
    public void a() {
        g();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g
    public void b() {
        g();
    }

    private void g() {
        TuxStatusView tuxStatusView;
        if (ab_() && (tuxStatusView = this.f78047e) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        TuxStatusView tuxStatusView = this.f78047e;
        if (tuxStatusView != null) {
            tuxStatusView.a();
            this.f78047e.setVisibility(0);
        }
    }

    public final int d() {
        return ((SetLockParamViewModel) ae.a(getActivity(), (ad.b) null).a(SetLockParamViewModel.class)).f78092a.getValue().f78094a;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f78046d != null && ab_()) {
            this.f78046d.f78000a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.qb);
        this.f78048j = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48390);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                k.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f78045c = arguments.getBoolean("from_change_pwd", false);
        }
        a aVar = new a();
        this.f78046d = aVar;
        aVar.a(this);
    }
}
