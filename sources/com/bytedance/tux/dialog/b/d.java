package com.bytedance.tux.dialog.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.internal.f;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f44827b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f44828a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f44829c = new ArrayList();

    static {
        Covode.recordClassIndex(27369);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27370);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        int i2;
        TuxButton a2;
        MethodCollector.i(8655);
        LinearLayout linearLayout = new LinearLayout(this.f44902f);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        int i3 = 0;
        for (T t : this.f44828a) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            T t2 = t;
            a aVar = this.f44829c.get(i3);
            if (t2.f44839e != 1) {
                a2 = a(new TuxButton(this.f44902f, null, 0, 6));
                a2.setTextColor(this.f44900d.f44913k);
                a2.setTuxFont(this.f44900d.f44908f);
                a2.setButtonVariant(this.f44900d.t);
            } else {
                a2 = a(new f(this.f44902f));
                a2.setTextColor(this.f44900d.f44912j);
                a2.setTuxFont(this.f44900d.f44907e);
            }
            a2.setText(t2.f44838d);
            a2.setOnClickListener(new b(t2, aVar, i3, linearLayout, this));
            a2.setEnabled(t2.f44837c);
            h.f.a.b<? super TuxButton, z> bVar = t2.f44836b;
            if (bVar != null) {
                bVar.invoke(a2);
            }
            t2.f44835a.add(a2);
            linearLayout.addView(a2);
            i3 = i4;
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a3 = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a4 = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics()));
        int size = this.f44828a.size();
        if (size == 0) {
            i2 = 0;
        } else if (size != 1) {
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            i2 = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system3.getDisplayMetrics()));
        } else {
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            i2 = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system4.getDisplayMetrics()));
        }
        linearLayout.setPadding(a3, 0, a4, i2);
        MethodCollector.o(8655);
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.c(context, "");
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f44830a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f44831b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f44832c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LinearLayout f44833d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f44834e;

        static {
            Covode.recordClassIndex(27371);
        }

        b(f fVar, a aVar, int i2, LinearLayout linearLayout, d dVar) {
            this.f44830a = fVar;
            this.f44831b = aVar;
            this.f44832c = i2;
            this.f44833d = linearLayout;
            this.f44834e = dVar;
        }

        public final void onClick(View view) {
            h.f.a.b<a, z> bVar = this.f44830a.f44840f;
            if (bVar != null) {
                bVar.invoke(this.f44831b);
            }
            if (this.f44831b.f44816b) {
                this.f44834e.c().a(Integer.valueOf(this.f44832c));
            }
        }
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final void a(com.bytedance.tux.dialog.a aVar) {
        l.c(aVar, "");
        super.a(aVar);
        Iterator<T> it = this.f44829c.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    private static TuxButton a(TuxButton tuxButton) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, h.g.a.a(TypedValue.applyDimension(1, 44.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        int a3 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        int a4 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
        Resources system5 = Resources.getSystem();
        l.a((Object) system5, "");
        layoutParams.setMargins(a2, a3, a4, h.g.a.a(TypedValue.applyDimension(1, 2.0f, system5.getDisplayMetrics())));
        tuxButton.setLayoutParams(layoutParams);
        tuxButton.setButtonSize(2);
        tuxButton.setGravity(17);
        return tuxButton;
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

    public final void b(CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        l.c(charSequence, "");
        a(1, charSequence, bVar);
    }

    public final void a(CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        l.c(charSequence, "");
        a(0, charSequence, bVar);
    }

    private final void a(int i2, CharSequence charSequence, h.f.a.b<? super a, z> bVar) {
        this.f44829c.add(new a(this.f44829c.size()));
        this.f44828a.add(new f(this.f44900d, i2, charSequence, bVar));
    }
}
