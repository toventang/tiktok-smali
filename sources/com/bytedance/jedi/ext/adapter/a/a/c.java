package com.bytedance.jedi.ext.adapter.a.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;

public final class c extends d implements com.bytedance.jedi.ext.adapter.a.c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39594a = {new y(ab.a(c.class), "content", "getContent()Landroid/view/View;")};

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f39595b;

    /* renamed from: c  reason: collision with root package name */
    private final h f39596c;

    @Override // com.bytedance.jedi.ext.adapter.a.c
    public final View a() {
        return (View) this.f39596c.getValue();
    }

    static {
        Covode.recordClassIndex(24381);
    }

    static final class a extends m implements h.f.a.a<View> {
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(24382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, ViewGroup viewGroup) {
            super(0);
            this.this$0 = cVar;
            this.$parent = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View a2 = e.a(this.$parent, R.layout.vj);
            this.this$0.a(a2, R.id.eus, R.id.eur);
            h.f.a.a<z> aVar = this.this$0.f39595b;
            if (aVar != null) {
                this.this$0.a(R.id.eus, a2).setOnClickListener(new View$OnClickListenerC0970a(aVar));
            }
            return a2;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.a.c$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC0970a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f39598a;

            static {
                Covode.recordClassIndex(24383);
            }

            View$OnClickListenerC0970a(h.f.a.a aVar) {
                this.f39598a = aVar;
            }

            public final void onClick(View view) {
                this.f39598a.invoke();
            }
        }
    }

    public /* synthetic */ c(ViewGroup viewGroup) {
        this(viewGroup, null);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.c
    public final void a(int i2) {
        switch (i2) {
            case 241:
                b();
                return;
            case 242:
                b(R.id.eur);
                return;
            case 243:
                b(R.id.eus);
                return;
            default:
                return;
        }
    }

    public c(ViewGroup viewGroup, h.f.a.a<z> aVar) {
        l.c(viewGroup, "");
        this.f39595b = aVar;
        this.f39596c = h.i.a((h.f.a.a) new a(this, viewGroup));
    }
}
