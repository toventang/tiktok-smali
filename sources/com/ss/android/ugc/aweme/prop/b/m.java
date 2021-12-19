package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118255a;

    static {
        Covode.recordClassIndex(76796);
    }

    m(j jVar) {
        this.f118255a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        e activity = this.f118255a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
