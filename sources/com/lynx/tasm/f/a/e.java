package com.lynx.tasm.f.a;

import android.graphics.Canvas;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    private static Method f56616c;

    /* renamed from: b  reason: collision with root package name */
    private RenderNode f56617b;

    static {
        Covode.recordClassIndex(35305);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.f.a.a
    public final void a() {
        this.f56617b = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.f.a.a
    public final boolean b() {
        return this.f56617b.isValid();
    }

    @Override // com.lynx.tasm.f.a.a
    public final void b(Canvas canvas) {
        this.f56617b.end((HardwareCanvas) canvas);
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(Canvas canvas) {
        ((HardwareCanvas) canvas).drawRenderNode(this.f56617b);
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(int i2, int i3) {
        this.f56617b.setLeftTopRightBottom(0, 0, i2, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public HardwareCanvas b(int i2, int i3) {
        try {
            if (f56616c == null) {
                Method declaredMethod = RenderNode.class.getDeclaredMethod("start", Integer.TYPE, Integer.TYPE);
                f56616c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return (HardwareCanvas) f56616c.invoke(this.f56617b, Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
