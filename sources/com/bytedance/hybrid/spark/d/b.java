package com.bytedance.hybrid.spark.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import h.f.b.l;
import h.z;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<z> f31129a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.lynx.a.a.b.b f31130b;

    /* renamed from: c  reason: collision with root package name */
    private final View f31131c;

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31132a = new a();

        static {
            Covode.recordClassIndex(18081);
        }

        a() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(18080);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        if (this.f31130b.getDisableMaskClose()) {
            this.f31131c.setOnClickListener(a.f31132a);
        } else {
            this.f31131c.setOnClickListener(new View$OnClickListenerC0656b(this));
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0656b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f31133a;

        static {
            Covode.recordClassIndex(18082);
        }

        View$OnClickListenerC0656b(b bVar) {
            this.f31133a = bVar;
        }

        public final void onClick(View view) {
            h.f.a.a<z> aVar = this.f31133a.f31129a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public b(com.bytedance.lynx.a.a.b.b bVar, View view, h.f.a.a<z> aVar) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31130b = bVar;
        this.f31131c = view;
        this.f31129a = aVar;
    }
}
