package com.bytedance.android.live.broadcast.f;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.broadcast.model.q;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.f.b;
import com.facebook.drawee.f.e;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.util.List;

public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f7865a;

    static {
        Covode.recordClassIndex(3890);
    }

    public d(a aVar) {
        this.f7865a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        boolean z;
        int a2;
        int a3;
        MethodCollector.i(6671);
        a aVar = this.f7865a;
        WaitingReviewInfo waitingReviewInfo = (WaitingReviewInfo) ((com.bytedance.android.live.network.response.d) obj).data;
        aVar.f7857f = Math.abs(waitingReviewInfo.getWaitingCount());
        aVar.f7858g = Math.abs(waitingReviewInfo.getWaitingTime()) / 60;
        if (aVar.f7858g <= 0) {
            aVar.f7858g++;
        }
        if (aVar.f7856e || !aVar.f7859h.o) {
            MethodCollector.o(6671);
            return;
        }
        aVar.f7859h.f7591f.setVisibility(8);
        aVar.f7859h.f7587b.setVisibility(0);
        aVar.f7859h.f7588c.setText(y.a((int) R.string.gvu));
        aVar.f7859h.f7589d.setText(y.a((int) R.string.gv6));
        if (aVar.f7857f <= 5) {
            aVar.f7855d = 5;
            aVar.f7859h.a(false, aVar.f7857f, aVar.f7858g);
            aVar.f7859h.a(true, (CharSequence) y.a((int) R.string.gpf));
        } else {
            aVar.f7855d = 4;
            aVar.f7859h.a(true, aVar.f7857f, aVar.f7858g);
            aVar.f7859h.a(false, (CharSequence) null);
        }
        List<q> waitingReviewRules = waitingReviewInfo.getWaitingReviewRules();
        if (waitingReviewRules != null && !waitingReviewRules.isEmpty()) {
            com.bytedance.android.live.broadcast.b.f fVar = aVar.f7859h;
            if (waitingReviewRules.isEmpty()) {
                MethodCollector.o(6671);
                return;
            }
            fVar.f7590e.setVisibility(0);
            fVar.f7592g = waitingReviewRules;
            if (fVar.f7590e.getChildCount() == fVar.f7592g.size()) {
                z = true;
            } else {
                z = false;
                fVar.f7590e.removeAllViews();
            }
            int i2 = 0;
            while (i2 < waitingReviewRules.size()) {
                q qVar = waitingReviewRules.get(i2);
                if (qVar != null && !TextUtils.isEmpty(qVar.f7955c)) {
                    String str = qVar.f7955c;
                    if (!z) {
                        HSImageView hSImageView = new HSImageView(fVar.f7586a);
                        hSImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        e b2 = e.b((float) y.a(4.0f));
                        b bVar = new b(y.a());
                        bVar.t = b2;
                        hSImageView.setHierarchy(bVar.a());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        layoutParams.weight = 1.0f;
                        boolean z2 = i2 == 0;
                        boolean z3 = i2 == fVar.f7592g.size() - 1;
                        if (z2) {
                            a2 = 0;
                        } else {
                            a2 = y.a(4.25f);
                        }
                        if (z3) {
                            a3 = 0;
                        } else {
                            a3 = y.a(4.25f);
                        }
                        layoutParams.setMargins(a2, 0, a3, 0);
                        hSImageView.setLayoutParams(layoutParams);
                        hSImageView.setOnClickListener(fVar);
                        hSImageView.setTag(Integer.valueOf(i2));
                        k.a(hSImageView, str);
                        fVar.f7590e.addView(hSImageView);
                    } else {
                        HSImageView hSImageView2 = (HSImageView) fVar.f7590e.getChildAt(i2);
                        if (hSImageView2 != null) {
                            k.a(hSImageView2, str);
                        }
                    }
                }
                i2++;
            }
        }
        MethodCollector.o(6671);
    }
}
