package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.base.ui.session.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.a;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.HashMap;

public abstract class f extends a {

    /* renamed from: a  reason: collision with root package name */
    protected Button f78026a;

    /* renamed from: b  reason: collision with root package name */
    protected Button f78027b;

    /* renamed from: c  reason: collision with root package name */
    protected View f78028c;

    static {
        Covode.recordClassIndex(48377);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public final LiveData<com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.a> c() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) ae.a(getActivity(), (ad.b) null).a(SetLockParamViewModel.class)).f78092a;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        if (c() == null || c().getValue().f78095b == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        t<com.ss.android.ugc.aweme.compliance.protection.familypairing.a.a> dynamicPassword;
        String str = "";
        if (!d()) {
            d dVar = new d();
            if (c() != null) {
                if (c().getValue().f78094a == 0) {
                    str = "time_lock";
                } else {
                    str = "teen_mode";
                }
            }
            r.a("qa_enter_change_passport", dVar.a("enter_method", str).f66730a);
            Fragment b2 = p.b(2);
            c.a().a("TimeLockEnterFragmentV2").a(b2).a(this, new b<Boolean>() {
                /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(48379);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.session.b
                public final /* bridge */ /* synthetic */ void a() {
                    f.this.a(p.a(true));
                }
            });
            a(b2);
        } else if (c() != null && c().getValue() != null && c().getValue().f78095b != null) {
            String str2 = c().getValue().f78095b.f78096a;
            String str3 = c().getValue().f78095b.f78097b;
            Context context = getContext();
            l.d(str2, str);
            l.d(str3, str);
            l.d(context, str);
            if (!TextUtils.isEmpty(str2) && (dynamicPassword = FamilyPairingApi.f77990b.getDynamicPassword(str2, str3)) != null) {
                l.b(dynamicPassword, str);
                dynamicPassword.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new FamilyPiaringManager.a(context), new FamilyPiaringManager.b(context));
            }
        }
    }

    public final void a(Fragment fragment) {
        ((com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a) getActivity()).a(fragment);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        HashMap hashMap = new HashMap();
        if (i2 == 1) {
            hashMap.put("teen_mode", "0");
        } else {
            hashMap.put("screen_time_management", "0");
        }
        if (c() != null && c().getValue() != null && c().getValue().f78095b != null) {
            a.C1812a aVar = c().getValue().f78095b;
            t<BaseResponse> a2 = FamilyPairingApi.a(aVar.f78096a, aVar.f78097b, hashMap);
            if (a2 != null) {
                a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this, i2), new i(this));
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78026a = (Button) view.findViewById(R.id.z0);
        View findViewById = view.findViewById(R.id.qb);
        this.f78028c = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48378);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                f.this.getActivity().onBackPressed();
            }
        });
        this.f78027b = (Button) view.findViewById(R.id.yz);
        this.f78026a.setOnClickListener(new g(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, a(), viewGroup, false);
    }
}
