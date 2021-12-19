package com.bytedance.ies.bullet.service.popup.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.a;
import com.bytedance.ies.bullet.service.popup.round.RoundFrameLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class f extends FrameLayout implements g, i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f32862c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<z> f32863a;

    /* renamed from: b  reason: collision with root package name */
    public e f32864b;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f32865d;

    static {
        Covode.recordClassIndex(19629);
    }

    private View a(int i2) {
        if (this.f32865d == null) {
            this.f32865d = new HashMap();
        }
        View view = (View) this.f32865d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f32865d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19630);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static f a(Context context, View view, e eVar, h.f.a.a<z> aVar) {
            l.c(context, "");
            l.c(view, "");
            l.c(eVar, "");
            f fVar = new f(context, (byte) 0);
            fVar.a(eVar);
            fVar.a(context, view);
            fVar.f32863a = aVar;
            fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return fVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void c() {
        setVisibility(0);
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void d() {
        h.f.a.a<z> aVar = this.f32863a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void e() {
        setVisibility(4);
    }

    public final void a(e eVar) {
        l.c(eVar, "");
        this.f32864b = eVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f32866a;

        static {
            Covode.recordClassIndex(19631);
        }

        b(f fVar) {
            this.f32866a = fVar;
        }

        public final void onClick(View view) {
            h.f.a.a<z> aVar;
            a.b bVar = this.f32866a.f32864b.f32861f;
            if (bVar != null && bVar.a()) {
                f fVar = this.f32866a;
                if (fVar.f32863a != null && (aVar = fVar.f32863a) != null) {
                    aVar.invoke();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(10167);
        this.f32864b = new e();
        MethodCollector.o(10167);
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }

    public final void a(Context context, View view) {
        int i2;
        MethodCollector.i(10004);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        LayoutInflater.from(applicationContext).inflate(R.layout.m_, this);
        ((FrameLayout) a(R.id.ada)).setOnClickListener(new b(this));
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) a(R.id.adw);
        l.a((Object) roundFrameLayout, "");
        ViewGroup.LayoutParams layoutParams = roundFrameLayout.getLayoutParams();
        if (layoutParams != null) {
            int i3 = -1;
            if (this.f32864b.f32859d > 0) {
                i2 = this.f32864b.f32859d;
            } else {
                i2 = -1;
            }
            layoutParams.height = i2;
            if (this.f32864b.f32858c > 0) {
                i3 = this.f32864b.f32858c;
            }
            layoutParams.width = i3;
        }
        ((RoundFrameLayout) a(R.id.adw)).setRadius(this.f32864b.f32860e);
        ((RoundFrameLayout) a(R.id.adw)).addView(view);
        a(false, 0, null);
        MethodCollector.o(10004);
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.g
    public final void a(boolean z, int i2, Integer num) {
        h hVar;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        RoundFrameLayout roundFrameLayout;
        ViewGroup.LayoutParams layoutParams2;
        e eVar = this.f32864b;
        if (z) {
            hVar = eVar.f32856a;
        } else {
            hVar = eVar.f32857b;
        }
        RoundFrameLayout roundFrameLayout2 = (RoundFrameLayout) a(R.id.adw);
        l.a((Object) roundFrameLayout2, "");
        ViewGroup.LayoutParams layoutParams3 = roundFrameLayout2.getLayoutParams();
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams)) {
            layoutParams3 = null;
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (layoutParams4 != null) {
            String str = hVar.f32868a;
            int hashCode = str.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode != -1364013995) {
                    if (hashCode == 115029 && str.equals("top")) {
                        layoutParams4.gravity = 49;
                        layoutParams4.topMargin = hVar.f32869b;
                    }
                } else if (str.equals("center")) {
                    layoutParams4.gravity = 17;
                    layoutParams4.bottomMargin = 0;
                    layoutParams4.topMargin = 0;
                }
            } else if (str.equals("bottom")) {
                layoutParams4.gravity = 81;
                layoutParams4.bottomMargin = hVar.f32869b;
            }
        }
        if (!z) {
            RoundFrameLayout roundFrameLayout3 = (RoundFrameLayout) a(R.id.adw);
            if (!(roundFrameLayout3 == null || (layoutParams = roundFrameLayout3.getLayoutParams()) == null)) {
                if (this.f32864b.f32859d > 0) {
                    i3 = this.f32864b.f32859d;
                } else {
                    i3 = -1;
                }
                layoutParams.height = i3;
            }
        } else if (!(this.f32864b.f32859d <= 0 || num == null || (roundFrameLayout = (RoundFrameLayout) a(R.id.adw)) == null || (layoutParams2 = roundFrameLayout.getLayoutParams()) == null)) {
            layoutParams2.height = Math.min(num.intValue(), this.f32864b.f32859d);
        }
        setPadding(0, 0, 0, i2);
        requestLayout();
    }
}
