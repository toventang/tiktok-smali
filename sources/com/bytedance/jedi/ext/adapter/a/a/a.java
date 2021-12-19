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

public final class a extends d implements e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39584a = {new y(ab.a(a.class), "content", "getContent()Landroid/view/View;")};

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f39585b;

    /* renamed from: c  reason: collision with root package name */
    private final h f39586c;

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final View a() {
        return (View) this.f39586c.getValue();
    }

    static {
        Covode.recordClassIndex(24375);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a.a$a  reason: collision with other inner class name */
    static final class C0967a extends m implements h.f.a.a<View> {
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(24376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0967a(a aVar, ViewGroup viewGroup) {
            super(0);
            this.this$0 = aVar;
            this.$parent = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View a2 = e.a(this.$parent, R.layout.vh);
            this.this$0.a(a2, R.id.dby, R.id.euu, R.id.euy);
            h.f.a.a<z> aVar = this.this$0.f39585b;
            if (aVar != null) {
                this.this$0.a(R.id.euu, a2).setOnClickListener(new View$OnClickListenerC0968a(aVar));
            }
            return a2;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC0968a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f39588a;

            static {
                Covode.recordClassIndex(24377);
            }

            View$OnClickListenerC0968a(h.f.a.a aVar) {
                this.f39588a = aVar;
            }

            public final void onClick(View view) {
                this.f39588a.invoke();
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final void a(int i2) {
        switch (i2) {
            case 241:
                b();
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

    public a(ViewGroup viewGroup, h.f.a.a<z> aVar) {
        l.c(viewGroup, "");
        this.f39585b = aVar;
        this.f39586c = h.i.a((h.f.a.a) new C0967a(this, viewGroup));
    }
}
