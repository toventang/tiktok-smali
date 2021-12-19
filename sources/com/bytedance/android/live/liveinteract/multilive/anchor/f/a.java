package com.bytedance.android.live.liveinteract.multilive.anchor.f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import i.a.a.a.a.b;

public final class a extends g {
    static {
        Covode.recordClassIndex(6330);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd3;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final int b() {
        return R.layout.bcw;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.FLOATING_FIX;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.a$a  reason: collision with other inner class name */
    static final class RunnableC0239a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11644a;

        static {
            Covode.recordClassIndex(6331);
        }

        RunnableC0239a(a aVar) {
            this.f11644a = aVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            Integer valueOf;
            View findViewById;
            View findViewById2;
            ViewGroup.LayoutParams layoutParams;
            View findViewById3;
            View findViewById4;
            ViewGroup.LayoutParams layoutParams2;
            View findViewById5;
            View findViewById6;
            ViewGroup.LayoutParams layoutParams3;
            ViewGroup viewGroup = this.f11644a.f11783d;
            if (viewGroup != null && (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62)) != null && (valueOf = Integer.valueOf(frameLayout.getHeight())) != null) {
                int intValue = valueOf.intValue();
                ViewGroup viewGroup2 = this.f11644a.f11783d;
                if (!(viewGroup2 == null || (findViewById6 = viewGroup2.findViewById(R.id.anr)) == null || (layoutParams3 = findViewById6.getLayoutParams()) == null)) {
                    double d2 = (double) intValue;
                    Double.isNaN(d2);
                    layoutParams3.width = (int) (d2 * 0.004424778761061947d);
                }
                ViewGroup viewGroup3 = this.f11644a.f11783d;
                if (!(viewGroup3 == null || (findViewById5 = viewGroup3.findViewById(R.id.anr)) == null)) {
                    findViewById5.requestLayout();
                }
                ViewGroup viewGroup4 = this.f11644a.f11783d;
                if (!(viewGroup4 == null || (findViewById4 = viewGroup4.findViewById(R.id.ang)) == null || (layoutParams2 = findViewById4.getLayoutParams()) == null)) {
                    double d3 = (double) intValue;
                    Double.isNaN(d3);
                    layoutParams2.height = (int) (d3 * 0.004424778761061947d);
                }
                ViewGroup viewGroup5 = this.f11644a.f11783d;
                if (!(viewGroup5 == null || (findViewById3 = viewGroup5.findViewById(R.id.ang)) == null)) {
                    findViewById3.requestLayout();
                }
                ViewGroup viewGroup6 = this.f11644a.f11783d;
                if (!(viewGroup6 == null || (findViewById2 = viewGroup6.findViewById(R.id.anh)) == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    double d4 = (double) intValue;
                    Double.isNaN(d4);
                    layoutParams.height = (int) (d4 * 0.004424778761061947d);
                }
                ViewGroup viewGroup7 = this.f11644a.f11783d;
                if (!(viewGroup7 == null || (findViewById = viewGroup7.findViewById(R.id.anh)) == null)) {
                    findViewById.requestLayout();
                }
                this.f11644a.n();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.f.g, com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        super.a(viewGroup);
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            viewGroup2.post(new RunnableC0239a(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            return -1;
        }
        int c2 = c(i2);
        int i3 = 3;
        if (c2 == 1) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d63);
            l.b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.avx);
            l.b(frameLayout2, "");
            a(frameLayout, frameLayout2, view);
            i3 = 1;
        } else if (c2 == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d64);
            l.b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.avy);
            l.b(frameLayout4, "");
            a(frameLayout3, frameLayout4, view);
            i3 = 2;
        } else if (c2 != 3) {
            i3 = super.a(view, i2);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d65);
            l.b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.avz);
            l.b(frameLayout6, "");
            a(frameLayout5, frameLayout6, view);
        }
        p();
        return i3;
    }

    private static void a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.i(7525);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, o());
            b.a(viewGroup2);
        }
        MethodCollector.o(7525);
    }
}
