package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.bytedance.tux.sheet.sheet.a;

final /* synthetic */ class ap implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77860a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77861b;

    static {
        Covode.recordClassIndex(48250);
    }

    ap(a aVar, String str) {
        this.f77860a = aVar;
        this.f77861b = str;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Fragment fragment = this.f77860a;
        String str = this.f77861b;
        if (fragment.getParentFragment() instanceof a) {
            fragment = fragment.getParentFragment();
        }
        new b(fragment).a(str).b();
    }
}
