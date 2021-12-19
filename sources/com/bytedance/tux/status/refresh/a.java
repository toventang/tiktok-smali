package com.bytedance.tux.status.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.g;
import com.bytedance.tux.status.loading.TuxDualBallView;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends FrameLayout implements com.bytedance.tux.widget.spring.b.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f45397a;

    /* renamed from: b  reason: collision with root package name */
    private final TuxDualBallView f45398b;

    /* renamed from: c  reason: collision with root package name */
    private float f45399c;

    /* renamed from: d  reason: collision with root package name */
    private int f45400d;

    /* renamed from: e  reason: collision with root package name */
    private final h f45401e;

    static {
        Covode.recordClassIndex(27642);
    }

    private final g getVibrationHelper() {
        return (g) this.f45401e.getValue();
    }

    /* renamed from: com.bytedance.tux.status.refresh.a$a  reason: collision with other inner class name */
    static final class C1114a extends m implements h.f.a.a<g> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(27643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1114a(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.$context);
        }
    }

    @Override // com.bytedance.tux.widget.spring.b.a
    public final int getActualHeight() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return h.g.a.a(TypedValue.applyDimension(1, 44.0f, system.getDisplayMetrics()));
    }

    @Override // com.bytedance.tux.widget.spring.b.a
    public final void a(boolean z) {
        this.f45397a = z;
        if (z) {
            this.f45398b.b();
        } else {
            this.f45398b.c();
        }
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        this.f45398b.setVisibility(i2);
    }

    @Override // com.bytedance.tux.widget.spring.b.a
    public final void b(boolean z) {
        if (z) {
            setVisibility(4);
            this.f45398b.c();
            return;
        }
        setVisibility(0);
        if (this.f45397a) {
            this.f45398b.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(7086);
        TuxDualBallView tuxDualBallView = new TuxDualBallView(context, (AttributeSet) null, 6);
        this.f45398b = tuxDualBallView;
        this.f45401e = i.a((h.f.a.a) new C1114a(context));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        addView(tuxDualBallView, new FrameLayout.LayoutParams(a2, h.g.a.a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics())), 17));
        MethodCollector.o(7086);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    @Override // com.bytedance.tux.widget.spring.b.a
    public final void a(int i2, boolean z) {
        boolean z2;
        if (!this.f45397a) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            float applyDimension = ((float) i2) / TypedValue.applyDimension(1, 44.0f, system.getDisplayMetrics());
            this.f45399c = applyDimension;
            int i3 = (int) applyDimension;
            TuxDualBallView tuxDualBallView = this.f45398b;
            float abs = Math.abs(applyDimension - ((float) i3));
            if ((i3 & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!tuxDualBallView.f45373c) {
                tuxDualBallView.a();
            }
            tuxDualBallView.f45371a = abs;
            tuxDualBallView.f45374d = false;
            tuxDualBallView.f45372b = false;
            tuxDualBallView.f45375e = z2;
            tuxDualBallView.postInvalidate();
            int min = Math.min(i2, this.f45400d);
            int max = Math.max(i2, this.f45400d);
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            int i4 = -h.g.a.a(TypedValue.applyDimension(1, 44.0f, system2.getDisplayMetrics()));
            if (min <= i4 && max >= i4 && !z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    getVibrationHelper().b();
                } else {
                    Context context = getContext();
                    l.a((Object) context, "");
                    new g(context).a();
                }
            }
        }
        this.f45400d = i2;
    }
}
