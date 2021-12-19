package com.ss.android.ugc.aweme.tools.beauty.a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.b.a.d;
import com.zhiliaoapp.musically.R;
import h.z;

public final class l extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f138827c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final com.ss.android.ugc.aweme.tools.beauty.views.b f138828a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f138829b;

    /* renamed from: d  reason: collision with root package name */
    private final Context f138830d;

    static {
        Covode.recordClassIndex(90798);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90799);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f138831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f138832b;

        static {
            Covode.recordClassIndex(90800);
        }

        b(l lVar, k kVar) {
            this.f138831a = lVar;
            this.f138832b = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Boolean, z> bVar = this.f138831a.f138829b;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f138832b.f138826c));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.a.h
    public final void a(boolean z) {
        float f2;
        View view = this.itemView;
        h.f.b.l.b(view, "");
        if (z) {
            f2 = 0.34f;
        } else {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(View view, d dVar) {
        super(view, dVar);
        h.f.b.l.d(view, "");
        h.f.b.l.d(dVar, "");
        this.f138828a = (com.ss.android.ugc.aweme.tools.beauty.views.b) view.findViewById(R.id.bt1);
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        this.f138830d = context;
    }
}
