package com.bytedance.jedi.ext.adapter.a.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;

public final class b extends d implements e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39589a = {new y(ab.a(b.class), "content", "getContent()Landroid/view/View;")};

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f39590b;

    /* renamed from: c  reason: collision with root package name */
    private final h f39591c;

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final View a() {
        return (View) this.f39591c.getValue();
    }

    static {
        Covode.recordClassIndex(24378);
    }

    static final class a extends m implements h.f.a.a<View> {
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(24379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, ViewGroup viewGroup) {
            super(0);
            this.this$0 = bVar;
            this.$parent = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View a2 = e.a(this.$parent, R.layout.vi);
            this.this$0.a(a2, R.id.euq, R.id.dby, R.id.euu, R.id.euy);
            h.f.a.a<z> aVar = this.this$0.f39590b;
            if (aVar != null) {
                this.this$0.a(R.id.euu, a2).setOnClickListener(new View$OnClickListenerC0969a(aVar));
            }
            return a2;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.a.b$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC0969a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f39593a;

            static {
                Covode.recordClassIndex(24380);
            }

            View$OnClickListenerC0969a(h.f.a.a aVar) {
                this.f39593a = aVar;
            }

            public final void onClick(View view) {
                this.f39593a.invoke();
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final void a(int i2) {
        switch (i2) {
            case 241:
                b(R.id.euq);
                return;
            case 242:
                b(R.id.dby);
                return;
            case 243:
                b(R.id.euy);
                return;
            case 244:
                b(R.id.euu);
                return;
            default:
                return;
        }
    }

    public b(ViewGroup viewGroup, h.f.a.a<z> aVar) {
        l.c(viewGroup, "");
        this.f39590b = aVar;
        this.f39591c = h.i.a((h.f.a.a) new a(this, viewGroup));
    }
}
