package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a;
import com.zhiliaoapp.musically.R;

public abstract class d extends c implements a {

    /* renamed from: d  reason: collision with root package name */
    protected boolean f106961d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a f106962e;

    /* renamed from: j  reason: collision with root package name */
    protected TuxStatusView f106963j;

    /* renamed from: k  reason: collision with root package name */
    private View f106964k;

    static {
        Covode.recordClassIndex(68420);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public void a() {
        e();
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public void b() {
        e();
    }

    private void e() {
        TuxStatusView tuxStatusView;
        if (ab_() && (tuxStatusView = this.f106963j) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        TuxStatusView tuxStatusView = this.f106963j;
        if (tuxStatusView != null) {
            tuxStatusView.a();
            this.f106963j.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f106962e != null && ab_()) {
            this.f106962e.f106924a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.qb);
        this.f106964k = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68421);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                d.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f106961d = arguments.getBoolean("from_change_pwd", false);
        }
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a aVar = new com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a();
        this.f106962e = aVar;
        aVar.a(this);
    }
}
