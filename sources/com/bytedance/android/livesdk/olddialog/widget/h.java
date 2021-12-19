package com.bytedance.android.livesdk.olddialog.widget;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.u;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.olddialog.giftpanellist.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class h implements u {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPageIndicatorWidget f20158a;

    static {
        Covode.recordClassIndex(11891);
    }

    h(LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget) {
        this.f20158a = liveNewGiftPageIndicatorWidget;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        MethodCollector.i(9923);
        LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = this.f20158a;
        a aVar = (a) obj;
        if (aVar != null) {
            boolean z = liveNewGiftPageIndicatorWidget.f20123c == aVar.f20036a;
            liveNewGiftPageIndicatorWidget.f20123c = aVar.f20036a;
            liveNewGiftPageIndicatorWidget.f20124d = aVar.f20037b;
            if (liveNewGiftPageIndicatorWidget.f20123c == 0 || liveNewGiftPageIndicatorWidget.f20123c == 1) {
                liveNewGiftPageIndicatorWidget.f20121a.setVisibility(4);
                MethodCollector.o(9923);
                return;
            } else if (!z) {
                liveNewGiftPageIndicatorWidget.f20121a.removeAllViews();
                liveNewGiftPageIndicatorWidget.f20121a.setVisibility(0);
                liveNewGiftPageIndicatorWidget.f20126f.clear();
                for (int i2 = 0; i2 < liveNewGiftPageIndicatorWidget.f20123c; i2++) {
                    ImageView imageView = new ImageView(liveNewGiftPageIndicatorWidget.getContext());
                    liveNewGiftPageIndicatorWidget.f20121a.addView(imageView);
                    liveNewGiftPageIndicatorWidget.f20126f.add(imageView);
                    LiveTextView liveTextView = new LiveTextView(liveNewGiftPageIndicatorWidget.getContext());
                    liveTextView.setTextSize(16.0f);
                    liveTextView.setText("  ");
                    liveNewGiftPageIndicatorWidget.f20121a.addView(liveTextView);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams.height = y.a(6.0f);
                    layoutParams.width = y.a(6.0f);
                    imageView.setBackground(y.c(2131234687));
                }
                ImageView imageView2 = liveNewGiftPageIndicatorWidget.f20126f.get(liveNewGiftPageIndicatorWidget.f20124d);
                if (imageView2 != null) {
                    imageView2.setBackground(y.c(2131234645));
                    liveNewGiftPageIndicatorWidget.f20125e = imageView2;
                }
                MethodCollector.o(9923);
                return;
            } else {
                ImageView imageView3 = null;
                try {
                    imageView3 = liveNewGiftPageIndicatorWidget.f20126f.get(liveNewGiftPageIndicatorWidget.f20124d);
                } catch (Exception unused) {
                }
                if (imageView3 != liveNewGiftPageIndicatorWidget.f20125e) {
                    if (liveNewGiftPageIndicatorWidget.f20125e != null) {
                        liveNewGiftPageIndicatorWidget.f20125e.setBackground(y.c(2131234687));
                    }
                    if (imageView3 != null) {
                        imageView3.setBackground(y.c(2131234645));
                        liveNewGiftPageIndicatorWidget.f20125e = imageView3;
                    }
                }
            }
        }
        MethodCollector.o(9923);
    }
}
