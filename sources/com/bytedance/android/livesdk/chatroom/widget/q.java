package com.bytedance.android.livesdk.chatroom.widget;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.widget.o;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final o.AnonymousClass2 f16669a;

    static {
        Covode.recordClassIndex(9247);
    }

    q(o.AnonymousClass2 r1) {
        this.f16669a = r1;
    }

    public final void run() {
        MethodCollector.i(2766);
        o.AnonymousClass2 r2 = this.f16669a;
        if (o.this.getParent() != null) {
            ((ViewGroup) o.this.getParent()).removeView(o.this);
        }
        MethodCollector.o(2766);
    }
}
