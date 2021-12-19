package com.ss.android.ugc.aweme.crossplatform.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MixActivityContainer f78558a;

    static {
        Covode.recordClassIndex(48786);
    }

    o(MixActivityContainer mixActivityContainer) {
        this.f78558a = mixActivityContainer;
    }

    public final void run() {
        MethodCollector.i(12769);
        MixActivityContainer mixActivityContainer = this.f78558a;
        if (mixActivityContainer.f78506b.f78745e.f78807b) {
            u uVar = new u(mixActivityContainer.f78505a);
            OpenURLHintLayout openURLHintLayout = mixActivityContainer.f78515k;
            String string = mixActivityContainer.f78505a.getString(R.string.gjb);
            l.d(openURLHintLayout, "");
            l.d(string, "");
            TextView textView = uVar.f78573b;
            if (textView != null) {
                textView.setText(string);
            }
            if (openURLHintLayout instanceof FrameLayout) {
                uVar.f78574c = openURLHintLayout;
                View view = uVar.f78572a;
                if (view != null) {
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    ViewGroup viewGroup = uVar.f78574c;
                    if (viewGroup != null) {
                        viewGroup.addView(view);
                        MethodCollector.o(12769);
                        return;
                    }
                    MethodCollector.o(12769);
                    return;
                }
            }
        }
        MethodCollector.o(12769);
    }
}
