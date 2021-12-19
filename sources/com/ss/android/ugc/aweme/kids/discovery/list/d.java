package com.ss.android.ugc.aweme.kids.discovery.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(68055);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, final com.ss.android.ugc.aweme.kids.common.ui.a.d dVar) {
        super(view);
        l.d(view, "");
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.discovery.list.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68056);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                com.ss.android.ugc.aweme.kids.common.ui.a.d dVar = dVar;
                if (dVar != null) {
                    dVar.a(view, null, "view more");
                }
            }
        });
    }
}
