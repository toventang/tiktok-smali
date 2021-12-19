package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.bm;
import com.ss.android.ugc.tools.utils.i;

final /* synthetic */ class bn implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm.b f88883a;

    static {
        Covode.recordClassIndex(55911);
    }

    bn(bm.b bVar) {
        this.f88883a = bVar;
    }

    public final void onClick(View view) {
        int i2;
        ClickAgent.onClick(view);
        bm.b bVar = this.f88883a;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            if (bm.this.f88877b == adapterPosition) {
                bm.this.f88877b = -1;
                i2 = 2;
            } else {
                if (i.a(bm.this.f88774c.get(adapterPosition).resDir)) {
                    bm.this.f88877b = adapterPosition;
                } else {
                    bm.this.f88877b = -1;
                }
                i2 = 1;
            }
            if (bm.this.f88876a != null) {
                bm.this.f88876a.a(bm.this.f88774c.get(bVar.getAdapterPosition()), i2, adapterPosition);
            }
            bm.this.notifyDataSetChanged();
        }
    }
}
