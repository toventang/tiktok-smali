package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z.b f88777a;

    static {
        Covode.recordClassIndex(55847);
    }

    ab(z.b bVar) {
        this.f88777a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        z.b bVar = this.f88777a;
        int adapterPosition = bVar.getAdapterPosition();
        if (-1 != adapterPosition) {
            z.this.f89005a.a(5, adapterPosition, z.this.f88774c.get(adapterPosition));
        }
    }
}
