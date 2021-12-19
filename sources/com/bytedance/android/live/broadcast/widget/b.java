package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.d.a;
import com.bytedance.android.live.broadcast.api.e;
import com.bytedance.android.live.broadcast.stream.capture.f;
import com.bytedance.android.live.broadcast.stream.capture.g;
import com.bytedance.android.live.broadcast.utils.c;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import javax.microedition.khronos.egl.EGLContext;

public class b extends GLSurfaceView implements com.bytedance.android.live.broadcast.api.e.b, f, g.a, com.bytedance.android.livesdk.chatroom.interact.b {

    /* renamed from: a  reason: collision with root package name */
    g f8765a;

    /* renamed from: b  reason: collision with root package name */
    c f8766b;

    /* renamed from: c  reason: collision with root package name */
    private final a f8767c;

    /* renamed from: d  reason: collision with root package name */
    private EGLContext f8768d;

    static {
        Covode.recordClassIndex(4483);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a(boolean z, PrivacyCert privacyCert) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void a_(PrivacyCert privacyCert) {
        onPause();
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void b_(PrivacyCert privacyCert) {
        onResume();
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.b
    public final Client a(LiveCore.InteractConfig interactConfig) {
        return this.f8767c.a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.b
    public void setOutputFormat(int i2) {
        this.f8765a.a(i2);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.a
    public final void c(PrivacyCert privacyCert) {
        c cVar = this.f8766b;
        if (cVar != null) {
            cVar.quitSafely();
        }
        DataChannelGlobal.f34575d.c(e.class);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.g.a
    public final void a(Surface surface) {
        c cVar = new c(surface, Config.VideoQuality.GUEST_NORMAL.getWidth(), Config.VideoQuality.GUEST_NORMAL.getHeight());
        this.f8766b = cVar;
        cVar.start();
    }

    public b(a aVar, Context context) {
        this(aVar, context, (byte) 0);
    }

    private b(a aVar, Context context, byte b2) {
        super(context, null);
        MethodCollector.i(8086);
        this.f8767c = aVar;
        DataChannelGlobal.f34575d.a(e.class, aVar);
        g gVar = new g(this);
        this.f8765a = gVar;
        gVar.f8548b = this;
        this.f8765a.a(this);
        MethodCollector.o(8086);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.f
    public final void a(EGLContext eGLContext, int i2, int i3, int i4, long j2) {
        if (this.f8767c != null) {
            EGLContext eGLContext2 = this.f8768d;
            if (eGLContext2 != null && !eGLContext2.equals(eGLContext)) {
                com.bytedance.android.live.core.c.a.a(5, b.class.getSimpleName(), "eglContext changed");
            }
            this.f8768d = eGLContext;
            com.bytedance.android.live.core.c.a.a(4, b.class.getSimpleName(), "eglContext=" + eGLContext.hashCode());
            this.f8767c.a(i2, i3, i4, j2);
        }
    }
}
