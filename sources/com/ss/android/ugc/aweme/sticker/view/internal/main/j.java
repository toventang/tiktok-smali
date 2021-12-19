package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.e;
import h.f.b.l;
import h.z;

public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    private final View f136309a;

    static {
        Covode.recordClassIndex(89026);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f136310a;

        static {
            Covode.recordClassIndex(89027);
        }

        a(h.f.a.a aVar) {
            this.f136310a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136310a.invoke();
        }
    }

    public j(View view) {
        l.d(view, "");
        this.f136309a = view;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.e
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f136309a.setOnClickListener(new a(aVar));
    }
}
