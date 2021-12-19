package com.bytedance.tux.dialog.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.internal.f;
import com.bytedance.tux.h.i;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f44818c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f44819a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f44820b;

    /* renamed from: g  reason: collision with root package name */
    private final List<a> f44821g = new ArrayList();

    static {
        Covode.recordClassIndex(27365);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27366);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        f a2;
        MethodCollector.i(8584);
        com.bytedance.tux.widget.b bVar = new com.bytedance.tux.widget.b(this.f44902f, (byte) 0);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bVar.setForceVertical(this.f44820b);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        bVar.setDividerLineSize(h.g.a.a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics())));
        bVar.setDividerLine(new ColorDrawable(this.f44900d.f44914l));
        Context context = bVar.getContext();
        l.a((Object) context, "");
        if (i.a(context)) {
            v.b((View) bVar, 0);
        } else {
            v.b((View) bVar, 1);
        }
        int i2 = 0;
        for (T t : this.f44819a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            a aVar = this.f44821g.get(i2);
            int i4 = t2.f44839e;
            if (i4 == 1) {
                a2 = a(this.f44902f);
                a2.setTextColor(this.f44900d.f44912j);
                a2.setTuxFont(this.f44900d.f44907e);
            } else if (i4 != 2) {
                a2 = a(this.f44902f);
                a2.setTextColor(this.f44900d.f44911i);
                a2.setTuxFont(this.f44900d.f44908f);
            } else {
                a2 = a(this.f44902f);
                a2.setTextColor(this.f44900d.f44915m);
                a2.setTuxFont(this.f44900d.f44908f);
            }
            a2.setText(t2.f44838d);
            a2.setOnClickListener(new View$OnClickListenerC1095b(t2, aVar, i2, bVar, this));
            a2.setEnabled(t2.f44837c);
            h.f.a.b<? super TuxButton, z> bVar2 = t2.f44836b;
            if (bVar2 != null) {
                bVar2.invoke(a2);
            }
            t2.f44835a.add(a2);
            bVar.addView(a2);
            i2 = i3;
        }
        LinearLayout linearLayout = new LinearLayout(this.f44902f);
        linearLayout.setOrientation(1);
        View view = new View(linearLayout.getContext());
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, h.g.a.a(TypedValue.applyDimension(1, 0.5f, system2.getDisplayMetrics()))));
        view.setBackground(new ColorDrawable(this.f44900d.f44914l));
        linearLayout.addView(view);
        linearLayout.addView(bVar);
        MethodCollector.o(8584);
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.c(context, "");
    }

    /* renamed from: com.bytedance.tux.dialog.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1095b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f44822a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f44823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f44824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.widget.b f44825d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f44826e;

        static {
            Covode.recordClassIndex(27367);
        }

        View$OnClickListenerC1095b(f fVar, a aVar, int i2, com.bytedance.tux.widget.b bVar, b bVar2) {
            this.f44822a = fVar;
            this.f44823b = aVar;
            this.f44824c = i2;
            this.f44825d = bVar;
            this.f44826e = bVar2;
        }

        public final void onClick(View view) {
            h.f.a.b<a, z> bVar = this.f44822a.f44840f;
            if (bVar != null) {
                bVar.invoke(this.f44823b);
            }
            if (this.f44823b.f44816b) {
                this.f44826e.c().a(Integer.valueOf(this.f44824c));
            }
        }
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final void a(com.bytedance.tux.dialog.a aVar) {
        l.c(aVar, "");
        super.a(aVar);
        Iterator<T> it = this.f44821g.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    private static f a(Context context) {
        f fVar = new f(context);
        fVar.setButtonSize(2);
        fVar.a();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        fVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, h.g.a.a(TypedValue.applyDimension(1, 47.5f, system.getDisplayMetrics()))));
        fVar.setGravity(17);
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        fVar.setPadding(a2, 0, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())), 0);
        return fVar;
    }

    public final void a(int i2, h.f.a.b<? super a, z> bVar) {
        CharSequence text = this.f44902f.getText(i2);
        l.a((Object) text, "");
        a(text, bVar);
    }

    public final void b(int i2, h.f.a.b<? super a, z> bVar) {
        CharSequence text = this.f44902f.getText(i2);
        l.a((Object) text, "");
        b(text, bVar);
    }

    public final void c(int i2, h.f.a.b<? super a, z> bVar) {
        CharSequence text = this.f44902f.getText(i2);
        l.a((Object) text, "");
        c(text, bVar);
    }

    public final void b(CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        l.c(charSequence, "");
        a(1, charSequence, bVar);
    }

    public final void c(CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        l.c(charSequence, "");
        a(2, charSequence, bVar);
    }

    public final void a(CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        l.c(charSequence, "");
        a(0, charSequence, bVar);
    }

    private final void a(int i2, CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        this.f44821g.add(new a(this.f44821g.size()));
        this.f44819a.add(new f(this.f44900d, i2, charSequence, bVar));
    }
}
