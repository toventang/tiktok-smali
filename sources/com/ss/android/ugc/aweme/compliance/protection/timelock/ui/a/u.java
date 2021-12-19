package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l;

final /* synthetic */ class u implements androidx.lifecycle.u {

    /* renamed from: a  reason: collision with root package name */
    private final s f78078a;

    /* renamed from: b  reason: collision with root package name */
    private final c.f f78079b;

    static {
        Covode.recordClassIndex(48405);
    }

    u(s sVar, c.f fVar) {
        this.f78078a = sVar;
        this.f78079b = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        MethodCollector.i(8654);
        s sVar = this.f78078a;
        c.f fVar = this.f78079b;
        l.a aVar = (l.a) obj;
        for (int i2 = 0; i2 < sVar.f78073a.getChildCount(); i2++) {
            TuxTextCell tuxTextCell = (TuxTextCell) sVar.f78073a.getChildAt(i2);
            if (aVar.f78057b == ((Integer) tuxTextCell.getTag()).intValue()) {
                ViewParent parent = fVar.f45446c.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(fVar.f45446c);
                }
                tuxTextCell.setAccessory(fVar);
            } else {
                tuxTextCell.setAccessory(null);
            }
        }
        MethodCollector.o(8654);
    }
}
