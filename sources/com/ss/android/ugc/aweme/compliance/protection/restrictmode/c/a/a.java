package com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

public class a extends com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a {

    /* renamed from: a  reason: collision with root package name */
    TuxTextCell f78005a;

    /* renamed from: b  reason: collision with root package name */
    TuxTextCell f78006b;

    static {
        Covode.recordClassIndex(48357);
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a
    public final int c() {
        return R.layout.ue;
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a
    public final void d() {
        r.a("open_teen_mode", new d().f66730a);
        super.d();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        this.f78005a = (TuxTextCell) view.findViewById(R.id.eim);
        this.f78006b = (TuxTextCell) view.findViewById(R.id.ein);
        super.onViewCreated(view, bundle);
        this.f78005a.setTitle(getString(R.string.fn2));
        this.f78006b.setTitle(getString(R.string.fn3));
        if (h()) {
            String str = g().getValue().f78095b.f78098c;
            if (!TextUtils.isEmpty(str)) {
                this.f78017c.setText(getString(R.string.bry, str));
            } else {
                this.f78017c.setText(getString(R.string.brx));
            }
            this.f78005a.setTitle(getString(R.string.fn2));
            this.f78006b.setTitle(getString(R.string.brz));
        }
    }
}
