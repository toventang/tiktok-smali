package com.bytedance.tux.dialog.a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.c;
import com.bytedance.tux.input.TuxTextView;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public String f44805a = "";

    /* renamed from: b  reason: collision with root package name */
    public boolean f44806b;

    /* renamed from: c  reason: collision with root package name */
    public final c f44807c;

    static {
        Covode.recordClassIndex(27360);
    }

    public final void b() {
        this.f44806b = true;
        this.f44807c.f45050b = true;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ b $clickListener;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(27361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, b bVar) {
            super(0);
            this.this$0 = dVar;
            this.$clickListener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.$clickListener;
            a aVar = new a();
            com.bytedance.tux.dialog.a c2 = this.this$0.c();
            l.c(c2, "");
            aVar.f44801a = c2;
            bVar.invoke(aVar);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        TuxTextView tuxTextView = new TuxTextView(this.f44902f, null, 0, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams);
        c cVar = this.f44807c;
        Context context = tuxTextView.getContext();
        l.a((Object) context, "");
        tuxTextView.setText(cVar.a(context));
        tuxTextView.setMovementMethod(com.bytedance.tux.f.b.f45048a);
        return tuxTextView;
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final void a(com.bytedance.tux.dialog.a aVar) {
        l.c(aVar, "");
        b(aVar);
    }

    public final void a(b<? super a, z> bVar) {
        l.c(bVar, "");
        this.f44807c.f45054f = new a(this, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.c(context, "");
        c a2 = new c().a(this.f44805a);
        a2.f45050b = this.f44806b;
        a2.f45052d = this.f44900d.v;
        a2.f45051c = this.f44900d.f44908f;
        this.f44807c = a2;
    }

    public final void a(String str) {
        l.c(str, "");
        this.f44805a = str;
        this.f44807c.a(str);
    }
}
