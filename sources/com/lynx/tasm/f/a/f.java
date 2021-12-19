package com.lynx.tasm.f.a;

import android.graphics.Canvas;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    private RenderNode f56618b;

    static {
        Covode.recordClassIndex(35306);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.f.a.a
    public final void a() {
        this.f56618b = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.f.a.a
    public final boolean b() {
        return this.f56618b.isValid();
    }

    @Override // com.lynx.tasm.f.a.a
    public final void b(Canvas canvas) {
        this.f56618b.end((DisplayListCanvas) canvas);
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f56618b);
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(int i2, int i3) {
        this.f56618b.setLeftTopRightBottom(0, 0, i2, i3);
    }

    @Override // com.lynx.tasm.f.a.a
    public final /* synthetic */ Canvas b(int i2, int i3) {
        return this.f56618b.start(i2, i3);
    }
}
