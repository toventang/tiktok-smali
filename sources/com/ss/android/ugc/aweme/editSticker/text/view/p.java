package com.ss.android.ugc.aweme.editSticker.text.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.s;
import com.ss.android.ugc.tools.view.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f88697a;

    static {
        Covode.recordClassIndex(55804);
    }

    p(i iVar) {
        this.f88697a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f88697a;
        s a2 = s.a();
        a2.f88453b++;
        if (a2.f88453b == a2.f88452a.size()) {
            a2.f88453b = 0;
        }
        iVar.u.setBackground(a.a(s.a().b().f88448a, GradientDrawable.Orientation.TR_BL));
    }
}
