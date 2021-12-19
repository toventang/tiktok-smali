package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.base.ui.session.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.zhiliaoapp.musically.R;

public class q extends f {

    /* renamed from: d  reason: collision with root package name */
    private TuxTextCell f78067d;

    /* renamed from: e  reason: collision with root package name */
    private TuxTextCell f78068e;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextCell f78069j;

    /* renamed from: k  reason: collision with root package name */
    private int f78070k;

    static {
        Covode.recordClassIndex(48399);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f
    public final int a() {
        return R.layout.uh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        r.a("close_time_lock", new d().f66730a);
        if (d()) {
            a(0);
            return;
        }
        Fragment b2 = p.b(1);
        c.a().a("TimeLockEnterFragmentV2").a(b2).a(this, new b() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.q.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48400);
            }

            @Override // com.ss.android.ugc.aweme.base.ui.session.b
            public final void a() {
                e activity = q.this.getActivity();
                a aVar = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b;
                if (aVar != null) {
                    aVar.setTimeLockSelfInMin(0);
                }
                r.a("close_time_lock_finish", new d().f66730a);
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.ggw).a();
                if (activity != null) {
                    com.ss.android.ugc.aweme.compliance.protection.timelock.a.b(activity, 0);
                }
                com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b);
            }
        });
        a(b2);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78067d = (TuxTextCell) view.findViewById(R.id.el7);
        this.f78068e = (TuxTextCell) view.findViewById(R.id.el8);
        this.f78069j = (TuxTextCell) view.findViewById(R.id.el6);
        if (d()) {
            this.f78070k = ((TimeLockOptionViewModel) ae.a(getActivity(), (ad.b) null).a(TimeLockOptionViewModel.class)).f78093a.getValue().f78057b;
        } else {
            this.f78070k = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.d();
        }
        this.f78067d.setTitle(getString(R.string.ggj, Integer.valueOf(this.f78070k)));
        this.f78068e.setTitle(getString(R.string.bs4));
        this.f78027b.setOnClickListener(new r(this));
        if (d()) {
            this.f78026a.setText(getString(R.string.c4n));
            this.f78067d.setTitle(getString(R.string.do8, Integer.valueOf(this.f78070k)));
            this.f78068e.setTitle(getString(R.string.bs4));
            this.f78069j.setVisibility(0);
            this.f78069j.setTitle(getString(R.string.bs5));
            String str = c().getValue().f78095b.f78098c;
            if (!TextUtils.isEmpty(str)) {
                this.f78027b.setText(getString(R.string.bs2, str));
                return;
            }
            this.f78027b.setText(getString(R.string.bs1));
        }
    }
}
