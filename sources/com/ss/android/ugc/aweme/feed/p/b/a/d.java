package com.ss.android.ugc.aweme.feed.p.b.a;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.experiment.i;
import com.ss.android.ugc.aweme.feed.p.b;
import com.ss.android.ugc.aweme.feed.p.b.a.c;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1 f93651a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f93652b;

    static {
        Covode.recordClassIndex(59592);
    }

    d(c.AnonymousClass1 r1, Boolean bool) {
        this.f93651a = r1;
        this.f93652b = bool;
    }

    public final void run() {
        MethodCollector.i(9058);
        c.AnonymousClass1 r4 = this.f93651a;
        Boolean bool = this.f93652b;
        if (c.this.f93645a == null || c.this.f93645a.isFinishing() || c.this.f93646b == null) {
            MethodCollector.o(9058);
        } else if (!bool.booleanValue()) {
            c.this.b();
            MethodCollector.o(9058);
        } else if (i.f93067a) {
            new a(c.this.f93645a).a(R.string.ad7).a();
            MethodCollector.o(9058);
        } else {
            if (c.this.f93647c == null) {
                c.this.f93647c = new a((Context) c.this.f93645a, (char) 0);
                if (c.this.f93646b instanceof FrameLayout) {
                    ((FrameLayout) c.this.f93646b).addView(c.this.f93647c);
                }
            }
            c cVar = c.this;
            if (cVar.f93647c != null) {
                a aVar = cVar.f93647c;
                if (b.a()) {
                    FrameLayout frameLayout = aVar.f93643a;
                    l.b(frameLayout, "");
                    frameLayout.setVisibility(0);
                }
            }
            MethodCollector.o(9058);
        }
    }
}
