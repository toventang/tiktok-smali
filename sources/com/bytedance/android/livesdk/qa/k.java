package com.bytedance.android.livesdk.qa;

import android.view.View;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20498a;

    /* renamed from: b  reason: collision with root package name */
    private final af f20499b;

    static {
        Covode.recordClassIndex(12099);
    }

    k(i.f fVar, af afVar) {
        this.f20498a = fVar;
        this.f20499b = afVar;
    }

    public final void onClick(View view) {
        i.f fVar = this.f20498a;
        af afVar = this.f20499b;
        b.a.a("livesdk_anchor_qa_more_click").a(i.this.n).b();
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) i.this.n.b(ao.class);
        if (iVar != null) {
            i.this.n.a(au.class, "qa_board");
            i.this.n.a(ag.class, afVar);
            i.this.n.a(ao.class, (Object) true);
            new as().show(iVar, fVar.f20491d);
        }
    }
}
