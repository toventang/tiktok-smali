package com.ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.be.c;
import com.ss.android.ugc.aweme.be.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ButtonCell extends TuxCell<c, c.C1117c> {
    static {
        Covode.recordClassIndex(43052);
    }

    /* access modifiers changed from: private */
    public void a(com.ss.android.ugc.aweme.be.c cVar) {
        l.d(cVar, "");
        super.a((i) cVar);
        c.C1117c cVar2 = (c.C1117c) ((TuxCell) this).f69833a;
        if (cVar2 != null) {
            cVar2.a(cVar.f68552c);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ButtonCell f69820a;

        static {
            Covode.recordClassIndex(43053);
        }

        a(ButtonCell buttonCell) {
            this.f69820a = buttonCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.be.c cVar = (com.ss.android.ugc.aweme.be.c) this.f69820a.f34234d;
            if (cVar != null && (onClickListener = cVar.f68553d) != null) {
                View view2 = this.f69820a.itemView;
                l.b(view2, "");
                onClickListener.onClick(view2.findViewById(R.id.a3i));
            }
        }
    }

    /* Return type fixed from 'com.bytedance.tux.table.cell.c$b' to match base method */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final /* synthetic */ c.C1117c a(Context context) {
        l.d(context, "");
        c.C1117c cVar = new c.C1117c(context);
        cVar.f45441c.setOnClickListener(new a(this));
        return cVar;
    }
}
