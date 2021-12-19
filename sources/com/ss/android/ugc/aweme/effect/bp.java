package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.bo;

final /* synthetic */ class bp implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bo.b f88891a;

    static {
        Covode.recordClassIndex(55915);
    }

    bp(bo.b bVar) {
        this.f88891a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bo.b bVar = this.f88891a;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            boolean z = false;
            boolean z2 = bo.this.f88884a.get(adapterPosition).isEnabled;
            if (bo.this.f88885b != null) {
                z = bo.this.f88885b.a(adapterPosition, z2);
            }
            if (z2 && z) {
                bo.this.f88886c = adapterPosition;
                bo.this.notifyDataSetChanged();
            }
        }
    }
}
