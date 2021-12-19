package com.bytedance.android.livesdk.qa;

import android.view.View;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20515a;

    static {
        Covode.recordClassIndex(12106);
    }

    r(i.f fVar) {
        this.f20515a = fVar;
    }

    public final boolean onLongClick(View view) {
        i.f fVar = this.f20515a;
        i.this.n.a(ad.class, fVar.f20488a);
        i.this.n.a(au.class, "qa_board");
        i.this.p = new at();
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) i.this.n.b(ao.class);
        if (iVar == null) {
            return false;
        }
        i.this.p.show(iVar, fVar.f20491d);
        return false;
    }
}
