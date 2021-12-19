package com.bytedance.tux.tooltip.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final View f45501a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f45502b;

    static {
        Covode.recordClassIndex(27698);
    }

    public final d.a getAction() {
        return this.f45502b;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ d.a $this_apply;

        static {
            Covode.recordClassIndex(27699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d.a aVar) {
            super(1);
            this.$this_apply = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$this_apply.f45489a;
            aVar2.f44753e = aVar2.f44753e;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(Context context) {
        super(context, null, R.attr.cg);
        l.c(context, "");
        MethodCollector.i(8809);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.y, this, true);
        this.f45501a = a2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw}, R.attr.cg, 0);
        l.a((Object) obtainStyledAttributes, "");
        try {
            l.a((Object) a2, "");
            ((TuxTextView) a2.findViewById(R.id.text)).setTuxFont(g.b(obtainStyledAttributes));
            l.a((Object) a2, "");
            ((ImageView) a2.findViewById(R.id.lu)).setImageResource(obtainStyledAttributes.getResourceId(4, 0));
            l.a((Object) a2, "");
            ((TuxTextView) a2.findViewById(R.id.text)).setTextColor(g.b(obtainStyledAttributes, 3));
        } catch (IllegalArgumentException unused) {
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(8809);
    }

    public final void setAction(d.a aVar) {
        this.f45502b = aVar;
        if (aVar != null) {
            if (aVar.f45489a != 0) {
                View view = this.f45501a;
                l.a((Object) view, "");
                com.bytedance.tux.c.a a2 = c.a(new a(aVar));
                Context context = getContext();
                l.a((Object) context, "");
                ((ImageView) view.findViewById(R.id.bm4)).setImageDrawable(a2.a(context));
                View view2 = this.f45501a;
                l.a((Object) view2, "");
                ImageView imageView = (ImageView) view2.findViewById(R.id.bm4);
                l.a((Object) imageView, "");
                imageView.setVisibility(0);
            } else if (aVar.f45491c != null) {
                b<? super ImageView, z> bVar = aVar.f45491c;
                if (bVar != null) {
                    View view3 = this.f45501a;
                    l.a((Object) view3, "");
                    View findViewById = view3.findViewById(R.id.bm4);
                    l.a((Object) findViewById, "");
                    bVar.invoke(findViewById);
                }
                View view4 = this.f45501a;
                l.a((Object) view4, "");
                ImageView imageView2 = (ImageView) view4.findViewById(R.id.bm4);
                l.a((Object) imageView2, "");
                imageView2.setVisibility(0);
            } else {
                View view5 = this.f45501a;
                l.a((Object) view5, "");
                ImageView imageView3 = (ImageView) view5.findViewById(R.id.bm4);
                l.a((Object) imageView3, "");
                imageView3.setVisibility(8);
            }
            if (aVar.f45492d != 0) {
                View view6 = this.f45501a;
                l.a((Object) view6, "");
                TuxTextView tuxTextView = (TuxTextView) view6.findViewById(R.id.text);
                l.a((Object) tuxTextView, "");
                tuxTextView.setText(getResources().getString(aVar.f45492d));
            } else {
                View view7 = this.f45501a;
                l.a((Object) view7, "");
                TuxTextView tuxTextView2 = (TuxTextView) view7.findViewById(R.id.text);
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setText(aVar.f45493e);
            }
            this.f45501a.setOnClickListener(aVar.f45494f);
        }
    }

    public /* synthetic */ e(Context context, byte b2) {
        this(context);
    }
}
