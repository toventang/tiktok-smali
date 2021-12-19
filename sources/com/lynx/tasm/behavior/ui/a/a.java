package com.lynx.tasm.behavior.ui.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

public abstract class a extends c {

    /* renamed from: f  reason: collision with root package name */
    protected static float f56099f = -2.0f;

    /* renamed from: a  reason: collision with root package name */
    public Shader f56100a;

    /* renamed from: b  reason: collision with root package name */
    protected int f56101b;

    /* renamed from: c  reason: collision with root package name */
    protected int f56102c;

    /* renamed from: d  reason: collision with root package name */
    protected int[] f56103d = null;

    /* renamed from: e  reason: collision with root package name */
    protected float[] f56104e = null;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f56105h = new Paint(1);

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void a(int i2, int i3) {
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final boolean a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void d() {
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void e() {
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final int b() {
        return this.f56101b;
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final int c() {
        return this.f56102c;
    }

    static {
        Covode.recordClassIndex(35049);
    }

    public void draw(Canvas canvas) {
        if (this.f56100a == null) {
            LLog.a(6, "gradient", "BackgroundGradientLayer.draw() must be called after setBounds()");
        }
        this.f56105h.setShader(this.f56100a);
        if (this.f56106g != null) {
            canvas.drawPath(this.f56106g, this.f56105h);
        } else {
            canvas.drawRect(getBounds(), this.f56105h);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray2.size() == 0 || readableArray.size() == readableArray2.size()) {
            this.f56103d = new int[readableArray.size()];
            if (readableArray2.size() == readableArray.size()) {
                this.f56104e = new float[readableArray2.size()];
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f56103d;
                if (i2 < iArr.length) {
                    iArr[i2] = readableArray.getInt(i2);
                    float[] fArr = this.f56104e;
                    if (fArr != null) {
                        fArr[i2] = ((float) readableArray2.getDouble(i2)) / 100.0f;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            LLog.a(6, "Gradient", "native parser error, color and stop must have same size");
        }
    }
}
