package com.bytedance.android.live.broadcast.preview;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f8462a;

    static {
        Covode.recordClassIndex(4341);
    }

    z(v vVar) {
        this.f8462a = vVar;
    }

    public final void run() {
        MethodCollector.i(7186);
        v vVar = this.f8462a;
        ViewGroup viewGroup = (ViewGroup) vVar.f8295c.findViewById(R.id.dtf);
        viewGroup.addView(vVar.f8298f.f8302c);
        viewGroup.addView(vVar.f8299g.f8302c);
        vVar.f8297e.a();
        MethodCollector.o(7186);
    }
}
