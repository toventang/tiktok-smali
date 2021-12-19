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

public final class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final View f45503a;

    /* renamed from: b  reason: collision with root package name */
    private d.b f45504b;

    static {
        Covode.recordClassIndex(27700);
    }

    public final d.b getAction() {
        return this.f45504b;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ d.b $it;

        static {
            Covode.recordClassIndex(27701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d.b bVar) {
            super(1);
            this.$it = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$it.f45495a;
            aVar2.f44753e = Integer.valueOf(this.$it.f45496b);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, R.attr.cg);
        l.c(context, "");
        MethodCollector.i(8778);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.z, this, true);
        this.f45503a = a2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw}, R.attr.cg, 0);
        l.a((Object) obtainStyledAttributes, "");
        try {
            l.a((Object) a2, "");
            ((TuxTextView) a2.findViewById(R.id.text)).setTuxFont(g.b(obtainStyledAttributes));
            l.a((Object) a2, "");
            ((TuxTextView) a2.findViewById(R.id.text)).setTextColor(g.b(obtainStyledAttributes, 3));
        } catch (IllegalArgumentException unused) {
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(8778);
    }

    public final void setAction(d.b bVar) {
        this.f45504b = bVar;
        if (bVar != null) {
            if (bVar.f45495a != 0) {
                View view = this.f45503a;
                l.a((Object) view, "");
                ImageView imageView = (ImageView) view.findViewById(R.id.bi7);
                l.a((Object) imageView, "");
                imageView.setVisibility(0);
                View view2 = this.f45503a;
                l.a((Object) view2, "");
                com.bytedance.tux.c.a a2 = c.a(new a(bVar));
                Context context = getContext();
                l.a((Object) context, "");
                ((ImageView) view2.findViewById(R.id.bi7)).setImageDrawable(a2.a(context));
            } else {
                View view3 = this.f45503a;
                l.a((Object) view3, "");
                ImageView imageView2 = (ImageView) view3.findViewById(R.id.bi7);
                l.a((Object) imageView2, "");
                imageView2.setVisibility(8);
            }
            if (bVar.f45497c != 0) {
                View view4 = this.f45503a;
                l.a((Object) view4, "");
                TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.text);
                l.a((Object) tuxTextView, "");
                tuxTextView.setText(getResources().getString(bVar.f45497c));
            } else {
                View view5 = this.f45503a;
                l.a((Object) view5, "");
                TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.text);
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setText(bVar.f45498d);
            }
            if (bVar.f45499e != -1) {
                View view6 = this.f45503a;
                l.a((Object) view6, "");
                ((TuxTextView) view6.findViewById(R.id.text)).setTextColorRes(bVar.f45499e);
            }
            this.f45503a.setOnClickListener(bVar.f45500f);
        }
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }
}
