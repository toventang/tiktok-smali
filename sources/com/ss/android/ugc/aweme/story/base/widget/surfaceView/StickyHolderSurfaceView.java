package com.ss.android.ugc.aweme.story.base.widget.surfaceView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class StickyHolderSurfaceView extends SurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private a f136941a;

    static {
        Covode.recordClassIndex(89504);
    }

    public StickyHolderSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final SurfaceHolder getHolder() {
        if (this.f136941a == null) {
            SurfaceHolder holder = super.getHolder();
            l.b(holder, "");
            this.f136941a = new a(holder);
        }
        a aVar = this.f136941a;
        if (aVar == null) {
            l.b();
        }
        return aVar;
    }

    private /* synthetic */ StickyHolderSurfaceView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickyHolderSurfaceView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1885);
        MethodCollector.o(1885);
    }
}
