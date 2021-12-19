package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.base.ui.session.c;
import com.ss.android.ugc.aweme.compliance.api.c.g;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.a;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.util.HashMap;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements g {

    /* renamed from: a  reason: collision with root package name */
    private TuxStatusView f78016a;

    /* renamed from: c  reason: collision with root package name */
    protected Button f78017c;

    /* renamed from: d  reason: collision with root package name */
    protected View f78018d;

    /* renamed from: e  reason: collision with root package name */
    protected TuxTextView f78019e;

    /* renamed from: j  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a f78020j;

    static {
        Covode.recordClassIndex(48371);
    }

    /* access modifiers changed from: protected */
    public abstract int c();

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g
    public final void a() {
        i();
    }

    private void i() {
        TuxStatusView tuxStatusView = this.f78016a;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g
    public final void b() {
        i();
        com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(getActivity(), e(), false);
    }

    public final int e() {
        return ((SetLockParamViewModel) ae.a(getActivity(), (ad.b) null).a(SetLockParamViewModel.class)).f78092a.getValue().f78094a;
    }

    /* access modifiers changed from: protected */
    public final LiveData<com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.a> g() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) ae.a(getActivity(), (ad.b) null).a(SetLockParamViewModel.class)).f78092a;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        if (g() == null || g().getValue().f78095b == null) {
            return false;
        }
        return true;
    }

    public void d() {
        Fragment b2;
        if (h()) {
            HashMap hashMap = new HashMap();
            if (e() == 0) {
                hashMap.put("screen_time_management", String.valueOf(((TimeLockOptionViewModel) ae.a(getActivity(), (ad.b) null).a(TimeLockOptionViewModel.class)).f78093a.getValue().f78057b));
            } else {
                hashMap.put("teen_mode", "1");
            }
            if (g() != null && g().getValue() != null && g().getValue().f78095b != null) {
                a.C1812a aVar = g().getValue().f78095b;
                t<BaseResponse> a2 = FamilyPairingApi.a(aVar.f78096a, aVar.f78097b, hashMap);
                if (a2 != null) {
                    a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), new e(this));
                    return;
                }
                return;
            }
            return;
        }
        if (!com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.e()) {
            b2 = p.a(false);
        } else {
            b2 = p.b(0);
            c.a().a("TimeLockEnterFragmentV2").a(b2).a(this, new b() {
                /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48372);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.session.b
                public final void a() {
                    com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(a.this.getActivity(), a.this.e(), false);
                }
            });
        }
        ((com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a) getActivity()).a(b2);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78017c = (Button) view.findViewById(R.id.z0);
        this.f78019e = (TuxTextView) view.findViewById(R.id.el2);
        View findViewById = view.findViewById(R.id.qb);
        this.f78018d = findViewById;
        findViewById.setOnClickListener(new b(this));
        this.f78017c.setOnClickListener(new c(this));
        this.f78016a = (TuxStatusView) view.findViewById(R.id.e_o);
        com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a aVar = new com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a();
        this.f78020j = aVar;
        aVar.a(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, c(), viewGroup, false);
    }
}
