package com.ss.android.ugc.aweme.setting.page.authmanager;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.d;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.dc.c {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.model.c f122416a;

    /* renamed from: b  reason: collision with root package name */
    public final d f122417b;

    static {
        Covode.recordClassIndex(80272);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ d b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final d a() {
        String name = this.f122416a.getName();
        if (name == null) {
            name = "";
        }
        return new d(name, null, new a(this), null, false, null, null, true, null, false, null, false, null, 130810);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f122418a;

        static {
            Covode.recordClassIndex(80273);
        }

        a(c cVar) {
            this.f122418a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f122418a.f122417b.a(this.f122418a.f122416a);
        }
    }

    public c(com.ss.android.ugc.aweme.setting.model.c cVar, d dVar) {
        l.d(cVar, "");
        l.d(dVar, "");
        this.f122416a = cVar;
        this.f122417b = dVar;
    }
}
