package com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.session.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.p;
import com.zhiliaoapp.musically.R;

public class b extends f {

    /* renamed from: d  reason: collision with root package name */
    private TuxTextCell f78007d;

    /* renamed from: e  reason: collision with root package name */
    private TuxTextCell f78008e;

    static {
        Covode.recordClassIndex(48358);
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f
    public final int a() {
        return R.layout.uf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        r.a("close_teen_mode", new d().f66730a);
        if (d()) {
            a(1);
            return;
        }
        Fragment b2 = p.b(1);
        c.a().a("TimeLockEnterFragmentV2").a(b2).a(this, new com.ss.android.ugc.aweme.base.ui.session.b() {
            /* class com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48359);
            }

            @Override // com.ss.android.ugc.aweme.base.ui.session.b
            public final void a() {
                a aVar = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b;
                if (aVar != null) {
                    aVar.setRestrictModeSelf(false);
                }
                if (com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a()) {
                    com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.CLOSE);
                }
                r.a("close_teen_mode_finish", new d().f66730a);
                com.ss.android.ugc.aweme.compliance.protection.common.a.e();
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.fef).a();
                com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b);
                com.ss.android.ugc.aweme.compliance.protection.common.a.a(null);
            }
        });
        a(b2);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78007d = (TuxTextCell) view.findViewById(R.id.eim);
        this.f78008e = (TuxTextCell) view.findViewById(R.id.ein);
        this.f78007d.setTitle(getString(R.string.fn2));
        this.f78008e.setTitle(getString(R.string.fn4));
        this.f78027b.setOnClickListener(new c(this));
        if (d()) {
            this.f78026a.setVisibility(8);
            this.f78027b.setBackgroundResource(R.drawable.cbl);
            this.f78027b.setTextColor(androidx.core.content.b.c(getContext(), R.color.on));
            String str = c().getValue().f78095b.f78098c;
            if (!TextUtils.isEmpty(str)) {
                this.f78027b.setText(getString(R.string.brw, str));
            } else {
                this.f78027b.setText(getString(R.string.brv));
            }
            this.f78007d.setTitle(getString(R.string.fn2));
            this.f78008e.setTitle(getString(R.string.brz));
        }
    }
}
