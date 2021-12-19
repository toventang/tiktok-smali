package com.ss.android.ugc.aweme.ecommerce.address.candinput.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.candinput.b;
import com.ss.android.ugc.aweme.ecommerce.address.dto.d;
import h.f.b.l;

public abstract class a extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public b f84292a;

    static {
        Covode.recordClassIndex(52556);
    }

    public abstract void a(d dVar, int i2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f84292a;
        if (bVar != null) {
            bVar.a(getLayoutPosition());
        }
    }
}
