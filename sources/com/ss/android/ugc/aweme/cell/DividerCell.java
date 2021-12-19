package com.ss.android.ugc.aweme.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.setting.Divider;
import com.ss.android.ugc.aweme.be.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DividerCell extends BaseCell<e> {
    static {
        Covode.recordClassIndex(43056);
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ln, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: private */
    public void a(e eVar) {
        l.d(eVar, "");
        super.a((com.ss.android.ugc.aweme.be.a) eVar);
        Divider divider = (Divider) this.itemView.findViewById(R.id.ca6);
        if (divider != null) {
            if (eVar.f68574d) {
                divider.setVisibility(0);
            } else {
                divider.setVisibility(8);
            }
        }
        com.ss.android.ugc.aweme.setting.ui.Divider divider2 = (com.ss.android.ugc.aweme.setting.ui.Divider) this.itemView.findViewById(R.id.text);
        if (divider2 != null) {
            divider2.setLeftText(eVar.f68573c);
        }
    }
}
