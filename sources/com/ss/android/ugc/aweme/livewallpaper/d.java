package com.ss.android.ugc.aweme.livewallpaper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.livewallpaper.c;
import com.ss.android.ugc.aweme.livewallpaper.f.i;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.ax;

final class d implements ax {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f108870a;

    static {
        Covode.recordClassIndex(69719);
    }

    @Override // com.ss.ttvideoengine.ax
    public final void c(int i2) {
    }

    @Override // com.ss.ttvideoengine.ax
    public final void e(aj ajVar) {
    }

    public d(c.a aVar) {
        this.f108870a = aVar;
    }

    @Override // com.ss.ttvideoengine.ax
    public final void a(int i2) {
        i.a("TTPlayerEngineCallback", "onVideoStatusException ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.ttvideoengine.ax
    public final void b(int i2) {
        i.a("TTPlayerEngineCallback", "onBufferEnd ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.ttvideoengine.ax
    public final void c(aj ajVar) {
        i.a("TTPlayerEngineCallback", "onRenderStart ".concat(String.valueOf(ajVar)));
    }

    @Override // com.ss.ttvideoengine.ax
    public final void d(aj ajVar) {
        i.a("TTPlayerEngineCallback", "onCompletion ".concat(String.valueOf(ajVar)));
    }

    @Override // com.ss.ttvideoengine.ax
    public final void a(aj ajVar) {
        i.a("TTPlayerEngineCallback", "onPrepare ".concat(String.valueOf(ajVar)));
    }

    @Override // com.ss.ttvideoengine.ax
    public final void b(aj ajVar) {
        i.a("TTPlayerEngineCallback", "onPrepared " + ajVar + " isSystem " + ajVar.p());
    }

    @Override // com.ss.ttvideoengine.ax
    public final void a(com.ss.ttvideoengine.s.c cVar) {
        i.a("TTPlayerEngineCallback", "onError " + cVar.f153263d);
        this.f108870a.a(cVar);
    }

    @Override // com.ss.ttvideoengine.ax
    public final void b(aj ajVar, int i2) {
        i.a("TTPlayerEngineCallback", "onLoadStateChanged " + ajVar + " " + i2);
    }

    @Override // com.ss.ttvideoengine.ax
    public final void c(aj ajVar, int i2) {
        i.a("TTPlayerEngineCallback", "onBufferingUpdate " + ajVar + " " + i2);
    }

    @Override // com.ss.ttvideoengine.ax
    public final void d(aj ajVar, int i2) {
        i.a("TTPlayerEngineCallback", "onStreamChanged " + ajVar + " " + i2);
    }

    @Override // com.ss.ttvideoengine.ax
    public final void a(aj ajVar, int i2) {
        i.a("TTPlayerEngineCallback", "onPlaybackStateChanged " + ajVar + " " + i2);
        if (i2 == 1) {
            this.f108870a.a();
        }
    }

    @Override // com.ss.ttvideoengine.ax
    public final void a(int i2, int i3, int i4) {
        i.a("TTPlayerEngineCallback", "onBufferStart " + i2 + ", " + i3 + ", " + i4);
    }

    @Override // com.ss.ttvideoengine.ax
    public final void a(aj ajVar, int i2, int i3) {
        i.a("TTPlayerEngineCallback", "onVideoSizeChanged " + ajVar + " " + i2 + " " + i3);
    }
}
