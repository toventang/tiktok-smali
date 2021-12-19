package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public abstract class f extends c implements a {

    /* renamed from: d  reason: collision with root package name */
    private TuxStatusView f106974d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a f106975e;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f106976j;

    static {
        Covode.recordClassIndex(68426);
    }

    public abstract void d();

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public final void a() {
        e();
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public void b() {
        e();
        d();
    }

    private final void e() {
        TuxStatusView tuxStatusView;
        if (ab_() && (tuxStatusView = this.f106974d) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a aVar = this.f106975e;
        if (aVar != null) {
            aVar.f106924a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f106976j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxStatusView tuxStatusView = this.f106974d;
            if (tuxStatusView != null) {
                tuxStatusView.a();
            }
            TuxStatusView tuxStatusView2 = this.f106974d;
            if (tuxStatusView2 != null) {
                tuxStatusView2.setVisibility(0);
            }
            com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a aVar = this.f106975e;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.a(str);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f106974d = (TuxStatusView) view.findViewById(R.id.e_o);
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a aVar = new com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a();
        this.f106975e = aVar;
        aVar.a(this);
    }
}
