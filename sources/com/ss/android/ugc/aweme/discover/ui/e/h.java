package com.ss.android.ugc.aweme.discover.ui.e;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h extends com.ss.android.ugc.aweme.discover.adapter.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82582b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f82583a;

    static {
        Covode.recordClassIndex(51409);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51410);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f82584a;

        static {
            Covode.recordClassIndex(51411);
        }

        b(h hVar) {
            this.f82584a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82584a.f82583a.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f82583a = bVar;
    }
}
