package com.ss.android.ugc.aweme.tools.beauty.a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.b.a.d;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class e extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f138787d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final com.ss.android.ugc.aweme.tools.beauty.views.b f138788a = ((com.ss.android.ugc.aweme.tools.beauty.views.b) this.itemView.findViewById(R.id.bt1));

    /* renamed from: b  reason: collision with root package name */
    j f138789b;

    /* renamed from: c  reason: collision with root package name */
    public m<? super String, ? super Boolean, z> f138790c;

    /* renamed from: m  reason: collision with root package name */
    private final Context f138791m;

    static {
        Covode.recordClassIndex(90780);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90781);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f138793b;

        static {
            Covode.recordClassIndex(90782);
        }

        b(e eVar, j jVar) {
            this.f138792a = eVar;
            this.f138793b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<? super String, ? super Boolean, z> mVar = this.f138792a.f138790c;
            if (mVar != null) {
                mVar.invoke(this.f138793b.f138824c, false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, d dVar) {
        super(view, dVar);
        l.d(view, "");
        l.d(dVar, "");
        View view2 = this.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        l.b(context, "");
        this.f138791m = context;
    }
}
