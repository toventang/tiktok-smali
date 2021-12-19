package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.eh;
import com.ss.android.ugc.aweme.shortvideo.ui.cj;
import com.ss.android.ugc.aweme.shortvideo.util.ba;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cm implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131639a;

    static {
        Covode.recordClassIndex(86205);
    }

    cm(cj cjVar) {
        this.f131639a = cjVar;
    }

    public final void onGlobalLayout() {
        MethodCollector.i(9279);
        cj cjVar = this.f131639a;
        if (cjVar.t == null) {
            cjVar.t = View.inflate(cjVar.getContext(), R.layout.ah7, null);
            cjVar.s.addView(cjVar.t, cjVar.s.getWidth(), cjVar.s.getHeight());
            cjVar.t.setAlpha(0.196f);
            cjVar.D.setAlpha(0.196f);
            cjVar.t.setOnClickListener(ev.f131735a);
            cjVar.D.setOnClickListener(ew.f131736a);
            ba.a(cjVar.t);
            eh ehVar = cjVar.r;
            cj.AnonymousClass10 r2 = new KeyBoardMonitor.a() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(86187);
                }

                @Override // com.ss.android.ugc.aweme.utils.KeyBoardMonitor.a
                public final void b() {
                    cj.this.t.setVisibility(8);
                    if (cj.this.r.u) {
                        cj.this.D.setVisibility(8);
                    }
                }

                @Override // com.ss.android.ugc.aweme.utils.KeyBoardMonitor.a
                public final void a() {
                    if (cj.this.J.getVisibility() == 0) {
                        cj.this.t.setVisibility(8);
                    } else {
                        cj.this.t.setVisibility(0);
                    }
                    if (cj.this.r.u) {
                        cj.this.D.setVisibility(0);
                    }
                }
            };
            KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(ehVar.f128418b);
            keyBoardMonitor.f142567a = ehVar.f128419c.getRootView();
            keyBoardMonitor.f142568b = r2;
            if (keyBoardMonitor.f142567a != null) {
                keyBoardMonitor.f142567a.getViewTreeObserver().addOnGlobalLayoutListener(keyBoardMonitor);
            }
        }
        MethodCollector.o(9279);
    }
}
