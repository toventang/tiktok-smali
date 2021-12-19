package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.b.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SearchResultListCell extends BaseContactListCell<d> {
    static {
        Covode.recordClassIndex(65857);
    }

    /* access modifiers changed from: private */
    public void a(d dVar) {
        l.d(dVar, "");
        super.a((b) dVar);
        View findViewById = this.itemView.findViewById(R.id.csg);
        l.b(findViewById, "");
        e.a((TextView) findViewById, dVar.f102762a.getDisplayName(), dVar.f102765c);
        View findViewById2 = this.itemView.findViewById(R.id.al5);
        l.b(findViewById2, "");
        e.a((TextView) findViewById2, dVar.f102762a.getUniqueId(), dVar.f102765c);
    }
}
