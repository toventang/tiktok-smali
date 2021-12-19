package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.tools.c;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a f130018a;

    static {
        Covode.recordClassIndex(85317);
    }

    b(a aVar) {
        this.f130018a = aVar;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        MethodCollector.i(11106);
        a aVar = this.f130018a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            if (!g.a().e().getReactionTipShow(false)) {
                if (aVar.f130010d == null) {
                    if (aVar.f130009c.getReactionPosMarginInViewPixel() == null) {
                        e.a("getReactionPosMarginInViewPixel return null");
                    } else {
                        aVar.f130010d = new f(aVar.f130009c);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.f130008b.F().getLayoutParams();
                        int[] reactionCameraPosInViewPixel = aVar.f130009c.getReactionCameraPosInViewPixel();
                        if (reactionCameraPosInViewPixel != null) {
                            if (c.a(aVar.f130007a)) {
                                int i2 = Build.VERSION.SDK_INT;
                                aVar.f130010d.a((dh.b(aVar.f130007a) - (reactionCameraPosInViewPixel[0] + Math.min(layoutParams.getMarginStart(), layoutParams.rightMargin))) - reactionCameraPosInViewPixel[2], reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                            } else {
                                int i3 = Build.VERSION.SDK_INT;
                                aVar.f130010d.a(reactionCameraPosInViewPixel[0] + Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin), reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                            }
                        }
                    }
                }
                if (aVar.f130010d != null) {
                    f fVar = aVar.f130010d;
                    if (fVar.f130024c == null) {
                        fVar.f130024c = new TextView(fVar.f130022a);
                        fVar.f130024c.setTextSize(14.0f);
                        fVar.f130024c.setGravity(17);
                        fVar.f130024c.setTextColor(fVar.f130022a.getResources().getColor(R.color.a9));
                        fVar.f130024c.setTextColor(-16777216);
                        fVar.f130023b.addView(fVar.f130024c, new ViewGroup.MarginLayoutParams(-2, -2));
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f130024c.getLayoutParams();
                    marginLayoutParams.width = fVar.f130027f;
                    if (c.a(fVar.f130022a)) {
                        marginLayoutParams.setMargins(0, fVar.f130026e, fVar.f130025d, 0);
                    } else {
                        marginLayoutParams.setMargins(fVar.f130025d, fVar.f130026e, 0, 0);
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    marginLayoutParams.setMarginStart(fVar.f130025d);
                    fVar.f130024c.requestLayout();
                    fVar.f130024c.setText(R.string.f89);
                    fVar.f130024c.setVisibility(0);
                    g.a().e().setReactionTipShow(true);
                    new SafeHandler(aVar.f130007a).postDelayed(new e(aVar), 5000);
                }
            }
            if (!aVar.f130012f) {
                new a(aVar.f130007a).a(R.string.f8_).a();
                aVar.f130012f = true;
            }
        }
        MethodCollector.o(11106);
    }
}
