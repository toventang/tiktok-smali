package com.lynx.tasm.f.a;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import com.bytedance.covode.number.Covode;

public final class g extends a {

    /* renamed from: b  reason: collision with root package name */
    private RenderNode f56619b;

    static {
        Covode.recordClassIndex(35307);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.f.a.a
    public final void a() {
        this.f56619b = new RenderNode("");
    }

    @Override // com.lynx.tasm.f.a.a
    public final boolean b() {
        return this.f56619b.hasDisplayList();
    }

    @Override // com.lynx.tasm.f.a.a
    public final void b(Canvas canvas) {
        this.f56619b.endRecording();
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(Canvas canvas) {
        ((RecordingCanvas) canvas).drawRenderNode(this.f56619b);
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(int i2, int i3) {
        this.f56619b.setPosition(0, 0, i2, i3);
    }

    @Override // com.lynx.tasm.f.a.a
    public final /* synthetic */ Canvas b(int i2, int i3) {
        return this.f56619b.beginRecording();
    }
}
