package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public class SSRenderSurfaceView extends d implements SurfaceHolder.Callback {

    /* renamed from: c  reason: collision with root package name */
    private static ArrayList<h> f58724c = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private a f58725a;

    /* renamed from: b  reason: collision with root package name */
    private h f58726b;

    public View getView() {
        return this;
    }

    static {
        Covode.recordClassIndex(36384);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        a aVar = this.f58725a;
        if (aVar != null) {
            aVar.a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        a aVar = this.f58725a;
        if (aVar != null) {
            aVar.b(surfaceHolder);
        }
    }

    public final void a(a aVar) {
        this.f58725a = aVar;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<h> it = f58724c.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (next.f58817a.get() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f58726b);
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h hVar = new h(this);
        this.f58726b = hVar;
        f58724c.add(hVar);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        a aVar = this.f58725a;
        if (aVar != null) {
            aVar.a(surfaceHolder, i2, i3, i4);
        }
    }
}
