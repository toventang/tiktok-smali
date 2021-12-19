package com.ss.android.ugc.aweme.web.jsbridge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final h f145037a;

    /* renamed from: b  reason: collision with root package name */
    private final int f145038b;

    /* renamed from: c  reason: collision with root package name */
    private final int f145039c;

    /* renamed from: d  reason: collision with root package name */
    private final int f145040d;

    /* renamed from: e  reason: collision with root package name */
    private final int f145041e;

    static {
        Covode.recordClassIndex(94831);
    }

    i(h hVar, int i2, int i3, int i4, int i5) {
        this.f145037a = hVar;
        this.f145038b = i2;
        this.f145039c = i3;
        this.f145040d = i4;
        this.f145041e = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.i(1511);
        h hVar = this.f145037a;
        int i2 = this.f145038b;
        int i3 = this.f145039c;
        int i4 = this.f145040d;
        int i5 = this.f145041e;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) (-i4), (float) (-i5));
        hVar.f145034b.f35513d.draw(canvas);
        MethodCollector.o(1511);
        return createBitmap;
    }
}
