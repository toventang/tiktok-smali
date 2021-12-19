package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.compliance.api.c.g;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class m extends j implements g {

    /* renamed from: c  reason: collision with root package name */
    private TuxStatusView f78058c;

    /* renamed from: d  reason: collision with root package name */
    private a f78059d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f78060e;

    static {
        Covode.recordClassIndex(48395);
    }

    public abstract void d();

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g
    public final void a() {
        e();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g
    public void b() {
        e();
        d();
    }

    private final void e() {
        TuxStatusView tuxStatusView;
        if (ab_() && (tuxStatusView = this.f78058c) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.f78059d;
        if (aVar != null) {
            aVar.f78000a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f78060e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxStatusView tuxStatusView = this.f78058c;
            if (tuxStatusView != null) {
                tuxStatusView.a();
            }
            TuxStatusView tuxStatusView2 = this.f78058c;
            if (tuxStatusView2 != null) {
                tuxStatusView2.setVisibility(0);
            }
            a aVar = this.f78059d;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.a(str);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f78058c = (TuxStatusView) view.findViewById(R.id.e_o);
        a aVar = new a();
        this.f78059d = aVar;
        aVar.a(this);
    }
}
