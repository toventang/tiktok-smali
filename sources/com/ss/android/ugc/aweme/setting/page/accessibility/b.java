package com.ss.android.ugc.aweme.setting.page.accessibility;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.dc.b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f122377a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f122378b;

    static {
        Covode.recordClassIndex(80240);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.b, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.b b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.b
    public final com.ss.android.ugc.aweme.be.b a() {
        return new com.ss.android.ugc.aweme.be.b(this.f122377a, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment) {
        super((byte) 0);
        l.d(fragment, "");
        this.f122378b = fragment;
        String string = fragment.getString(R.string.cz4);
        l.b(string, "");
        this.f122377a = string;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!a.a(view, 1200)) {
            r.a("live_photo_manage", new d().a("enter_from", "accessibility").f66730a);
            SmartRouter.buildRoute(this.f122378b, "//livewallpaper").open();
        }
    }
}
