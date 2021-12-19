package com.ss.android.ugc.aweme.shortvideo.preview.a;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends SurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private b f129598a = new b(super.getHolder());

    static {
        Covode.recordClassIndex(85071);
    }

    public final SurfaceHolder getHolder() {
        return this.f129598a;
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(5617);
        MethodCollector.o(5617);
    }
}
