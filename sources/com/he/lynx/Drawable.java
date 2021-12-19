package com.he.lynx;

import android.view.SurfaceHolder;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class Drawable {
    public final SurfaceHolder holder;
    public final long ptr;
    public final View view;

    static {
        Covode.recordClassIndex(34180);
    }

    public Drawable(long j2, View view2, SurfaceHolder surfaceHolder) {
        this.ptr = j2;
        this.view = view2;
        this.holder = surfaceHolder;
    }
}
