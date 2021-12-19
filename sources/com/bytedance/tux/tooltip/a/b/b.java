package com.bytedance.tux.tooltip.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final View f45509a;

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.b<? super ImageView, z> f45510b;

    static {
        Covode.recordClassIndex(27703);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super android.widget.ImageView, h.z>, h.f.a.b<android.widget.ImageView, h.z> */
    public final h.f.a.b<ImageView, z> getCustomImage() {
        return this.f45510b;
    }

    public final View getView() {
        return this.f45509a;
    }

    public final void setCustomImage(h.f.a.b<? super ImageView, z> bVar) {
        this.f45510b = bVar;
        if (bVar != null) {
            ImageView imageView = (ImageView) this.f45509a.findViewById(R.id.bm4);
            l.a((Object) imageView, "");
            imageView.setVisibility(0);
            View findViewById = this.f45509a.findViewById(R.id.bm4);
            l.a((Object) findViewById, "");
            bVar.invoke(findViewById);
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $colorRes;
        final /* synthetic */ int $imageRes;

        static {
            Covode.recordClassIndex(27704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, int i3) {
            super(1);
            this.$imageRes = i2;
            this.$colorRes = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$imageRes;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            aVar2.f44753e = Integer.valueOf(this.$colorRes);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, R.attr.cg);
        l.c(context, "");
        MethodCollector.i(5428);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.a0, this, true);
        l.a((Object) a2, "");
        this.f45509a = a2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw}, R.attr.cg, 0);
        l.a((Object) obtainStyledAttributes, "");
        ((TuxTextView) a2.findViewById(R.id.clf)).setTextColor(obtainStyledAttributes.getColor(8, -1));
        ((TuxTextView) a2.findViewById(R.id.clf)).setTuxFont(obtainStyledAttributes.getInt(7, 0));
        obtainStyledAttributes.recycle();
        MethodCollector.o(5428);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
