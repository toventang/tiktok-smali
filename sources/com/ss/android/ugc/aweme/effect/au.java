package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.themechange.base.a;
import com.ss.android.ugc.tools.view.widget.d;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import dmt.av.video.p;
import h.f.b.l;
import java.util.List;

final /* synthetic */ class au implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88820a;

    /* renamed from: b  reason: collision with root package name */
    private final List f88821b;

    /* renamed from: c  reason: collision with root package name */
    private final a f88822c;

    static {
        Covode.recordClassIndex(55874);
    }

    au(ac acVar, List list, a aVar) {
        this.f88820a = acVar;
        this.f88821b = list;
        this.f88822c = aVar;
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        ClickAgent.onClick(view);
        ac acVar = this.f88820a;
        List list = this.f88821b;
        a aVar = this.f88822c;
        p value = acVar.f88781d.getValue();
        if (value == null || value.f156931g != 0) {
            int intValue = ((Integer) view.getTag()).intValue();
            ((EffectCategoryResponse) list.get(intValue)).getKey();
            if (acVar.f88779b.captionStruct == null || intValue != acVar.J.getCount() - 1 || !acVar.a()) {
                acVar.u.setCurrentItem(intValue);
                if (acVar.J.f88958a != null && (acVar.J.f88958a instanceof y)) {
                    if (acVar.f88779b.captionStruct == null) {
                        z = true;
                        if (acVar.W.f88721b) {
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    ((y) acVar.J.f88958a).a(z2, z);
                }
                if (l.a((Object) "motion", (Object) ((EffectCategoryResponse) list.get(intValue)).getKey()) && acVar.ab && acVar.e(true).booleanValue()) {
                    aVar.a(false);
                    acVar.ab = false;
                    return;
                }
                return;
            }
            d.c(acVar.L, R.string.y2).b();
        }
    }
}
