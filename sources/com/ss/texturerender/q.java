package com.ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.texturerender.VideoSurface;
import com.ss.texturerender.a.a;
import com.ss.texturerender.a.d;
import com.ss.texturerender.a.e;
import com.ss.texturerender.a.f;
import com.ss.texturerender.a.g;
import com.ss.texturerender.a.h;
import com.ss.texturerender.a.i;
import com.ss.texturerender.a.j;
import com.ss.texturerender.a.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public final class q extends n {
    private static q y;
    private a s = new h();
    private i t;
    private Queue<Integer> u = new LinkedList();
    private o v;
    private j w;
    private ByteBuffer x = null;

    static {
        Covode.recordClassIndex(101269);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.n
    public final void e() {
        for (a a2 = this.s.a(); a2 != null; a2 = a2.a()) {
        }
    }

    private void i() {
        if (this.t == null) {
            this.t = new i();
        }
        if (this.f151854m == null) {
            this.f151854m = new g();
        }
    }

    @Override // com.ss.texturerender.n
    public final synchronized void g() {
        MethodCollector.i(12250);
        super.g();
        y = null;
        MethodCollector.o(12250);
    }

    private void h() {
        try {
            j jVar = this.w;
            if (jVar != null) {
                jVar.a();
            }
            j jVar2 = (j) e.a(7);
            this.w = jVar2;
            jVar2.a((Bundle) null);
            this.w.f151778f = this;
        } catch (Exception e2) {
            a(e2.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.n
    public final void c() {
        if (this.f151849h != -1) {
            try {
                o oVar = this.v;
                if (oVar != null) {
                    oVar.a();
                }
                o oVar2 = (o) e.a(3);
                this.v = oVar2;
                oVar2.a((Bundle) null);
                this.v.f151778f = this;
            } catch (Exception e2) {
                a(e2.toString());
            }
            if (this.q.f151792a) {
                h();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.n
    public final void d() {
        l.a(f151842a, "delete program");
        o oVar = this.v;
        if (oVar != null) {
            oVar.a();
            this.v = null;
        }
        j jVar = this.w;
        if (jVar != null) {
            jVar.a();
            this.w = null;
        }
        i iVar = this.t;
        if (iVar != null) {
            g.a(iVar.f151802a);
            this.t = null;
        }
        if (this.f151854m != null) {
            g gVar = this.f151854m;
            while (!gVar.f151800a.isEmpty()) {
                f poll = gVar.f151800a.poll();
                g.b(poll.f151795a);
                l.a("TR_EffectTextureManager", "release delTex:".concat(String.valueOf(poll)));
            }
            this.f151854m = null;
        }
    }

    private a a(int i2) {
        for (a aVar = this.s.f151780h; aVar != null; aVar = aVar.f151780h) {
            if (aVar.a(10005) == i2) {
                return aVar;
            }
        }
        return null;
    }

    private int b(int i2) {
        a a2 = a(i2);
        if (a2 == null || a2.a(10004) == 3553) {
            return 0;
        }
        Bundle bundle = a2.f151777e;
        if (bundle != null) {
            bundle.putInt("texture_type", 3553);
        }
        int a3 = a2.a(bundle);
        l.a(f151842a, "reInit, effectType:" + i2 + ",texTarget:texture_2d");
        if (a3 == 0) {
            return 0;
        }
        a2.a();
        return a3;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.n
    public final void e(Message message) {
        MethodCollector.i(12268);
        Bundle data = message.getData();
        if (data != null) {
            p pVar = (p) data.getSerializable("texture");
            if (pVar != null) {
                boolean z = true;
                if (this.o != 0 && !pVar.isCurrentObject(this.o)) {
                    z = false;
                }
                if (pVar.handleSurfaceChange(z, this.f151846e)) {
                    this.o = pVar.getOjbectId();
                    l.a(f151842a, "texture switch surface & playing " + this.o);
                }
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        try {
                            obj.notify();
                        } catch (Throwable th) {
                            MethodCollector.o(12268);
                            throw th;
                        }
                    }
                }
                l.a(f151842a, "set surface done");
                MethodCollector.o(12268);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("update surface but missing texture");
            MethodCollector.o(12268);
            throw runtimeException;
        }
        RuntimeException runtimeException2 = new RuntimeException("update surface but missing bundle?");
        MethodCollector.o(12268);
        throw runtimeException2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.n
    public final void d(Message message) {
        int i2 = message.what;
        if (i2 != 12) {
            if (i2 == 25) {
                Bundle data = message.getData();
                Surface surface = (Surface) data.getParcelable("surface");
                p pVar = (p) data.getSerializable("texture");
                if (message.arg1 == 1) {
                    pVar.initExtraSurface(surface);
                    return;
                } else if (message.arg1 == 2) {
                    pVar.releaseExtraSurface(surface);
                    return;
                } else if (message.arg1 == 3) {
                    pVar.releaseAllExtraSurface();
                    return;
                } else {
                    return;
                }
            } else if (i2 != 26) {
                switch (i2) {
                    case 34:
                        int i3 = message.arg1;
                        int i4 = message.arg2;
                        if (i3 == 8 || i3 == 14 || i3 == 17) {
                            this.s.a(i3, i4);
                            return;
                        }
                        return;
                    case 35:
                        Bundle data2 = message.getData();
                        if (data2 != null) {
                            int i5 = message.arg1;
                            float f2 = data2.getFloat("float_value");
                            switch (i5) {
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                    this.s.a(i5, f2);
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            return;
                        }
                    case 36:
                        break;
                    default:
                        return;
                }
            } else {
                p pVar2 = (p) message.obj;
                if (pVar2 != null) {
                    pVar2.handleUpdateVideoState(message.arg1);
                    return;
                }
                return;
            }
        }
        l.a(f151842a, "setEffect bundle:" + message.getData() + " surfacetexture:" + message.obj);
        a(message.getData(), (p) message.obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.n
    public final void f(Message message) {
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer allocateDirect;
        p pVar = (p) message.obj;
        if (a(pVar, message.arg1)) {
            p pVar2 = (p) message.obj;
            Bundle data = message.getData();
            VideoSurface.c cVar = (VideoSurface.c) data.getSerializable("callback");
            if (cVar != null) {
                try {
                    int viewportWidth = pVar2.getViewportWidth();
                    int viewportHeight = pVar2.getViewportHeight();
                    float f2 = data.getFloat("width", -1.0f);
                    if (f2 > 0.0f) {
                        float f3 = (float) viewportWidth;
                        i3 = Math.round(f2 * f3);
                        float f4 = (float) viewportHeight;
                        i2 = Math.round(data.getFloat("height") * f4);
                        i4 = Math.round(data.getFloat("x") * f3);
                        i5 = Math.round(data.getFloat("y") * f4);
                    } else {
                        i2 = viewportHeight;
                        i3 = viewportWidth;
                        i4 = 0;
                        i5 = 0;
                    }
                    l.a(f151842a, "async saveframe = " + i3 + ", " + i2 + " viewW:" + viewportWidth + " viewH:" + viewportHeight);
                    int i6 = i3 * i2 * 4;
                    if (data.getBoolean("reuse_buffer")) {
                        ByteBuffer byteBuffer = this.x;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.x = ByteBuffer.allocateDirect(i6);
                        }
                        allocateDirect = this.x;
                    } else {
                        allocateDirect = ByteBuffer.allocateDirect(i6);
                    }
                    allocateDirect.rewind();
                    allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                    GLES20.glFinish();
                    GLES20.glReadPixels(i4, i5, i3, i2, 6408, 5121, allocateDirect);
                    g.a("handleSaveFrame");
                    allocateDirect.rewind();
                    int i7 = i3 * 4;
                    byte[] bArr = new byte[i7];
                    for (int i8 = 0; i8 < i2 / 2; i8++) {
                        allocateDirect.get(bArr);
                        System.arraycopy(allocateDirect.array(), allocateDirect.limit() - allocateDirect.position(), allocateDirect.array(), allocateDirect.position() - i7, i7);
                        System.arraycopy(bArr, 0, allocateDirect.array(), allocateDirect.limit() - allocateDirect.position(), i7);
                    }
                    allocateDirect.rewind();
                    cVar.onFrame(allocateDirect, i3, i2);
                } catch (Exception e2) {
                    l.a(f151842a, "save frame failed " + e2.getMessage());
                }
            }
            pVar.render();
        }
    }

    public q(d dVar, int i2) {
        super(dVar, i2);
    }

    private void a(Bundle bundle, p pVar) {
        if (bundle == null) {
            l.a(f151842a, "set effect but missing bundle?");
        } else if (bundle.getInt("action") != 21) {
            a a2 = a(bundle.getInt("effect_type"));
            if (a2 != null) {
                a2.b(bundle);
            }
        } else {
            b(bundle, pVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(android.os.Bundle r10, com.ss.texturerender.p r11) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.q.b(android.os.Bundle, com.ss.texturerender.p):int");
    }

    private boolean a(p pVar, int i2) {
        boolean z;
        if (pVar == null) {
            l.a(f151842a, "surface texture is null not draw");
            return false;
        }
        try {
            pVar.lock();
            if (pVar.isRelease()) {
                l.a(f151842a, "surface texture is released not draw");
                pVar.unlock();
                return false;
            }
            pVar.updateTexImage();
            pVar.unlock();
            while (!this.u.isEmpty()) {
                pVar.notifyError(this.u.poll().intValue());
            }
            if (!pVar.needDrop() && i2 != 0) {
                if (!pVar.isMakeCurrent()) {
                    if (pVar.getRenderSurface() == null) {
                        l.a(f151842a, "texture : " + pVar + " not set surface");
                        return false;
                    } else if (!this.f151847f.hasMessages(4)) {
                        l.a(f151842a, "texture : " + pVar + ", retry create");
                        if (!pVar.createEGLWindowSurface(false, false, EGL14.EGL_NO_SURFACE)) {
                            l.a(f151842a, "texture : " + pVar + ", retry failed");
                            return false;
                        }
                    }
                }
                CopyOnWriteArrayList<Bundle> paramList = pVar.getParamList();
                if (paramList != null) {
                    Iterator<Bundle> it = paramList.iterator();
                    while (it.hasNext()) {
                        a(it.next(), pVar);
                    }
                }
                b texId = pVar.getTexId();
                int c2 = texId.c();
                HashMap<Integer, Integer> hashMap = this.q.f151794c;
                d effectConfig = pVar.getEffectConfig();
                Iterator<Map.Entry<Integer, Integer>> it2 = hashMap.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    Map.Entry<Integer, Integer> next = it2.next();
                    if (next.getValue().intValue() == 1 && effectConfig.a(next.getKey().intValue())) {
                        z = true;
                        break;
                    }
                }
                f fVar = new f(null, c2, pVar.getTexWidth(), pVar.getTexHeight(), 36197);
                if (z) {
                    for (a aVar = this.s.f151780h; aVar != null; aVar = aVar.f151780h) {
                        int a2 = aVar.a(10005);
                        if (effectConfig.a(a2)) {
                            if (fVar.f151799e == 36197 && aVar.a(10004) == 3553) {
                                this.v.f151776d = pVar;
                                fVar = this.v.a(fVar, this.t);
                            }
                            aVar.f151776d = pVar;
                            fVar = aVar.a(fVar, this.t);
                        } else {
                            pVar.setOption(19, a2, 0);
                        }
                    }
                } else {
                    pVar.resetFlag();
                }
                boolean z2 = false;
                for (Map.Entry<Surface, EGLSurface> entry : pVar.getExtraRealSurfaces().entrySet()) {
                    EGLSurface value = entry.getValue();
                    pVar.makeCurrent(value);
                    a(fVar, pVar, pVar.getConsumerHeight(value), pVar.getConsumerWidth(value));
                    pVar.eglSwapBuffer(value);
                    z2 = true;
                }
                if (!pVar.isCurrentObject(this.o)) {
                    if (pVar.isMakeCurrent()) {
                        l.a(f151842a, "not active texture but already make current : ".concat(String.valueOf(pVar)));
                        pVar.makeCurrent();
                        this.o = pVar.getOjbectId();
                        l.a(f151842a, "texture switch surface & playing " + this.o);
                    } else {
                        l.a(f151842a, "tex: " + pVar + " not current object id " + this.o + ", " + pVar.getOjbectId());
                        texId.d();
                        return false;
                    }
                } else if (z2) {
                    pVar.makeCurrent();
                }
                a(fVar, pVar, pVar.getViewportHeight(), pVar.getViewportWidth());
                texId.d();
                if (GLES20.glGetError() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            pVar.unlock();
            throw th;
        }
    }

    private void a(f fVar, p pVar, int i2, int i3) {
        a aVar;
        if (fVar.f151799e == 3553) {
            aVar = this.w;
        } else {
            aVar = this.v;
        }
        if (aVar != null) {
            aVar.f151776d = pVar;
            aVar.a(26, pVar.mLayoutMode);
            aVar.a(27, pVar.mLayoutRatio);
            aVar.a(29, pVar.mRotationType);
            aVar.a(30, pVar.mIsMirrorHorizontal);
            aVar.a(31, pVar.mIsMirrorVertical);
            aVar.a(10006, i3);
            aVar.a(10007, i2);
            aVar.a(fVar, (i) null);
        }
    }
}
