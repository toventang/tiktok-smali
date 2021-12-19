package com.ss.android.ugc.aweme.profile.widgets.g.c;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    private View f117873j;

    static {
        Covode.recordClassIndex(76383);
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        super.j();
        c(s());
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        c(view);
    }

    private final void c(View view) {
        ViewStub viewStub;
        MethodCollector.i(8768);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        if (curUser.isSecret()) {
            if (!(this.f117873j != null || view == null || (viewStub = (ViewStub) view.findViewById(R.id.dbk)) == null)) {
                this.f117873j = viewStub.inflate();
            }
            View view2 = this.f117873j;
            if (view2 != null) {
                view2.setVisibility(0);
                MethodCollector.o(8768);
                return;
            }
            MethodCollector.o(8768);
            return;
        }
        View view3 = this.f117873j;
        if (view3 != null) {
            view3.setVisibility(8);
            MethodCollector.o(8768);
            return;
        }
        MethodCollector.o(8768);
    }
}
