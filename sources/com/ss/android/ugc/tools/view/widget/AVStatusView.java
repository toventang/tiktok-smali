package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.view.widget.a;
import java.util.ArrayList;
import java.util.List;

public class AVStatusView extends FrameLayout implements com.ss.android.ugc.tools.view.d.a, l {

    /* renamed from: a  reason: collision with root package name */
    List<View> f150217a;

    /* renamed from: b  reason: collision with root package name */
    public int f150218b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f150219c;

    /* renamed from: d  reason: collision with root package name */
    private int f150220d;

    static {
        Covode.recordClassIndex(98851);
    }

    public final void b() {
        setVisibility(0);
        setStatus(0);
    }

    public final void c() {
        setVisibility(0);
        setStatus(1);
    }

    public final void d() {
        setVisibility(0);
        setStatus(2);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f150221a;

        /* renamed from: b  reason: collision with root package name */
        View f150222b;

        /* renamed from: c  reason: collision with root package name */
        public View f150223c;

        /* renamed from: d  reason: collision with root package name */
        View f150224d;

        /* renamed from: e  reason: collision with root package name */
        View f150225e;

        /* renamed from: f  reason: collision with root package name */
        View f150226f;

        /* renamed from: g  reason: collision with root package name */
        public int f150227g = -1;

        static {
            Covode.recordClassIndex(98852);
        }

        private a a() {
            AVLoadingLayout aVLoadingLayout = new AVLoadingLayout(this.f150221a);
            aVLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f150222b = aVLoadingLayout;
            aVLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public static a a(Context context) {
            return new a(context).a();
        }

        private a(Context context) {
            if (context != null) {
                this.f150221a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        private a a(a aVar) {
            b bVar = new b(this.f150221a);
            bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            bVar.setStatus(aVar);
            this.f150223c = bVar;
            return this;
        }

        public final a a(int i2) {
            return a(new a.C4050a(this.f150221a).a(i2).f150336a);
        }

        public final a a(View view) {
            this.f150224d = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }
    }

    public final void a() {
        int i2 = this.f150218b;
        if (i2 != -1) {
            View b2 = b(i2);
            if (b2 != null) {
                b2.setVisibility(4);
            }
            setVisibility(4);
            this.f150218b = -1;
        }
    }

    @Override // com.ss.android.ugc.tools.view.d.a
    public final void a(int i2) {
        c(i2);
    }

    public AVStatusView(Context context) {
        this(context, null);
    }

    private View b(int i2) {
        if (i2 < 0 || i2 >= this.f150217a.size()) {
            return null;
        }
        return this.f150217a.get(i2);
    }

    public void setStatus(int i2) {
        View b2;
        int i3 = this.f150218b;
        if (i3 != i2) {
            if (i3 >= 0 && (b2 = b(i3)) != null) {
                b2.setVisibility(4);
            }
            if (i2 >= 0) {
                setVisibility(0);
                View b3 = b(i2);
                if (b3 != null) {
                    b3.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f150218b = i2;
        }
    }

    private void c(int i2) {
        if (i2 >= 0 && this.f150220d != i2) {
            this.f150220d = i2;
            View view = this.f150217a.get(0);
            if (view instanceof AVLoadingLayout) {
                ((AVLoadingLayout) view).a(this.f150220d);
            }
            View view2 = this.f150217a.get(1);
            if (view2 instanceof com.ss.android.ugc.tools.view.d.a) {
                ((com.ss.android.ugc.tools.view.d.a) view2).a(this.f150220d);
            }
            View view3 = this.f150217a.get(2);
            if (view3 instanceof b) {
                ((b) view3).a(this.f150220d);
            }
            View view4 = this.f150217a.get(3);
            if (view4 instanceof b) {
                ((b) view4).a(this.f150220d);
            }
            View view5 = this.f150217a.get(4);
            if (view5 instanceof b) {
                ((b) view5).a(this.f150220d);
            }
        }
    }

    public void setBuilder(a aVar) {
        if (aVar == null) {
            aVar = a.a(getContext());
        }
        this.f150217a.clear();
        this.f150217a.add(aVar.f150222b);
        this.f150217a.add(aVar.f150223c);
        this.f150217a.add(aVar.f150224d);
        this.f150217a.add(aVar.f150225e);
        this.f150217a.add(aVar.f150226f);
        if (aVar.f150227g < 0) {
            aVar.f150227g = g.a().E().a();
        }
        c(aVar.f150227g);
        removeAllViews();
        for (int i2 = 0; i2 < this.f150217a.size(); i2++) {
            View view = this.f150217a.get(i2);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.l
    public void setUseScreenHeight(int i2) {
        View view = this.f150217a.get(0);
        if (view instanceof l) {
            ((l) view).setUseScreenHeight(i2);
        }
        View view2 = this.f150217a.get(1);
        if (view2 instanceof l) {
            ((l) view2).setUseScreenHeight(i2);
        }
        View view3 = this.f150217a.get(2);
        if (view3 instanceof l) {
            ((l) view3).setUseScreenHeight(i2);
        }
        View view4 = this.f150217a.get(3);
        if (view4 instanceof l) {
            ((l) view4).setUseScreenHeight(i2);
        }
        View view5 = this.f150217a.get(4);
        if (view5 instanceof l) {
            ((l) view5).setUseScreenHeight(i2);
        }
    }

    public AVStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AVStatusView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7238);
        this.f150217a = new ArrayList(5);
        this.f150218b = -1;
        this.f150220d = -1;
        this.f150219c = false;
        MethodCollector.o(7238);
    }
}
