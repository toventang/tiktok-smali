package com.ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z.c f125447a;

    /* renamed from: b  reason: collision with root package name */
    private final z.c f125448b;

    static {
        Covode.recordClassIndex(82336);
    }

    ab(z.c cVar, z.c cVar2) {
        this.f125447a = cVar;
        this.f125448b = cVar2;
    }

    public final void onClick(View view) {
        int adapterPosition;
        ClickAgent.onClick(view);
        z.c cVar = this.f125447a;
        z.c cVar2 = this.f125448b;
        if (z.this.f126302d && (adapterPosition = cVar2.getAdapterPosition()) <= z.this.f126299a.size() && adapterPosition >= 0) {
            z.this.f126301c.a(adapterPosition, z.this.f126299a.get(adapterPosition).f125450b.a(true));
        }
    }
}
