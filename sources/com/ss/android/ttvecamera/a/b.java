package com.ss.android.ttvecamera.a;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.a.a;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class b extends com.ss.android.ttvecamera.e.b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f61391a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f61392b;

    /* renamed from: c  reason: collision with root package name */
    public a f61393c;

    /* renamed from: d  reason: collision with root package name */
    public long f61394d;

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(float f2, l.p pVar) {
        return -421;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(n nVar) {
        return -412;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a(boolean z) {
        return -416;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void a(String str) {
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void b(float f2, l.p pVar) {
    }

    @Override // com.ss.android.ttvecamera.e.a
    public final void b(int i2) {
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int e() {
        return -412;
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final int f() {
        return 0;
    }

    @Override // com.ss.android.ttvecamera.d.a.AbstractC1340a
    public final int g() {
        return 0;
    }

    public final void c() {
        a aVar = this.f61393c;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final Rect h() {
        return new Rect();
    }

    static {
        Covode.recordClassIndex(37809);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int a() {
        c cVar = this.z.t;
        if (this.C == null || cVar == null) {
            o.b(f61391a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        a aVar = this.f61393c;
        if (!(aVar == null || aVar.f61381f == null)) {
            CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(aVar.f61381f);
            cameraConfigFilter.setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
            List<CameraConfig> supportedCameraConfigs = aVar.f61381f.getSupportedCameraConfigs(cameraConfigFilter);
            if (!supportedCameraConfigs.isEmpty()) {
                aVar.f61382g = supportedCameraConfigs;
                if (Build.VERSION.SDK_INT >= 21) {
                    ArrayList arrayList = new ArrayList();
                    for (CameraConfig cameraConfig : supportedCameraConfigs) {
                        arrayList.add(new TEFrameSizei(cameraConfig.getTextureSize().getWidth(), cameraConfig.getTextureSize().getHeight()));
                    }
                    if (cVar.f61616b.f61610j) {
                        cVar.a(arrayList, (TEFrameSizei) null);
                        this.A.p = cVar.e();
                        if (this.A.p != null) {
                            this.y.a(50, 0, this.A.p.toString());
                        }
                    } else {
                        cVar.a(arrayList, this.A.p);
                        this.A.q = cVar.f();
                    }
                    this.f61393c.a(cVar.f61616b.f61608h);
                    if (cVar.a() == 1) {
                        if (cVar.d() == null) {
                            o.d(f61391a, "SurfaceTexture is null.");
                            return -100;
                        }
                        cVar.d().setDefaultBufferSize(this.A.p.f61374a, this.A.p.f61375b);
                    }
                    return 0;
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final void b() {
        MethodCollector.i(2257);
        if (this.aa && !this.U) {
            long currentTimeMillis = System.currentTimeMillis() - this.f61394d;
            a aVar = this.f61393c;
            if (aVar != null && currentTimeMillis > 0) {
                long d2 = aVar.d() - currentTimeMillis;
                if (d2 > 0) {
                    o.d(f61391a, "close session, but first preview not arrive...wait: ".concat(String.valueOf(d2)));
                    try {
                        Thread.sleep(d2);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        this.aa = false;
        this.f61392b = false;
        if (this.z.t == null || this.z.t.f61616b == null) {
            o.c(f61391a, "ProviderManager or Provider is null!");
        } else {
            this.z.t.f61616b.a((Object) null);
        }
        a aVar2 = this.f61393c;
        if (aVar2 != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (aVar2.f61381f != null) {
                aVar2.f61381f.pause();
            }
            o.a(a.f61376a, "pause consume = " + (System.currentTimeMillis() - currentTimeMillis2));
        }
        o.a(f61391a, "ARCore session paused");
        super.b();
        MethodCollector.o(2257);
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final int d() {
        List<Surface> asList;
        Handler handler;
        c cVar = this.z.t;
        if (this.C == null || cVar == null) {
            o.b(f61391a, "CameraDevice or ProviderManager is null!");
            return -100;
        } else if (this.f61393c == null) {
            return -1;
        } else {
            int a2 = a();
            if (a2 != 0) {
                return a2;
            }
            com.ss.android.ttvecamera.j.b bVar = cVar.f61616b;
            int i2 = bVar.i();
            if (i2 != -1) {
                a aVar = this.f61393c;
                if (aVar.f61381f != null) {
                    aVar.f61381f.setCameraTextureName(i2);
                }
            }
            a aVar2 = this.f61393c;
            bVar.a(aVar2.f61380e == null ? null : aVar2.f61380e.getSurfaceTexture());
            this.v = this.C.createCaptureRequest(3);
            int c2 = cVar.f61616b.c();
            if (c2 == 2) {
                asList = Arrays.asList(cVar.b());
            } else if (c2 != 8) {
                asList = null;
            } else {
                asList = Arrays.asList(cVar.c());
                if (asList.size() > 1) {
                    asList.remove(0);
                }
            }
            a aVar3 = this.f61393c;
            List<Surface> arCoreSurfaces = aVar3.f61380e == null ? null : aVar3.f61380e.getArCoreSurfaces();
            if (asList != null) {
                a aVar4 = this.f61393c;
                String str = this.A.F;
                if (aVar4.f61380e != null) {
                    aVar4.f61380e.setAppSurfaces(str, asList);
                }
                arCoreSurfaces.addAll(asList);
            }
            for (Surface surface : arCoreSurfaces) {
                this.v.addTarget(surface);
            }
            if (this.A.T) {
                this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a(new Range<>(Integer.valueOf(this.Q.f61371a / this.A.f61801d.f61373c), Integer.valueOf(this.Q.f61372b / this.A.f61801d.f61373c))));
            }
            this.U = false;
            this.V = System.currentTimeMillis();
            if (this.A.f61809l) {
                handler = x();
            } else {
                handler = this.D;
            }
            this.w = null;
            CameraCaptureSession.StateCallback r0 = new CameraCaptureSession.StateCallback() {
                /* class com.ss.android.ttvecamera.a.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37812);
                }

                public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                    b.this.a(cameraCaptureSession, 6, (Object) null);
                }

                public final void onClosed(CameraCaptureSession cameraCaptureSession) {
                    b.this.a(cameraCaptureSession, 5, (Object) null);
                }

                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    b.this.a(cameraCaptureSession, 1, (Object) null);
                    o.a(b.f61391a, "onConfigureFailed...");
                    b.this.z.f(4);
                }

                public final void onReady(CameraCaptureSession cameraCaptureSession) {
                    o.a(b.f61391a, "onReady...");
                    if (b.this.aa) {
                        b.this.a(cameraCaptureSession, 4, (Object) null);
                    } else {
                        o.d(b.f61391a, "onReady...session not alive");
                    }
                }

                public final void onActive(CameraCaptureSession cameraCaptureSession) {
                    o.a(b.f61391a, "onActive..." + b.this.aa);
                    if (!b.this.aa) {
                        o.d(b.f61391a, "onActive...session not alive");
                    } else if (b.this.f61393c != null && b.this.f61393c.f61381f != null) {
                        b.this.f61393c.a(b.this.ad);
                        b.this.f61392b = true;
                        b.this.z.t.f61616b.a(b.this.f61393c.f61381f);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    b.this.a(cameraCaptureSession, 0, (Object) null);
                    b.this.a(cameraCaptureSession, 3, (Object) null);
                    b.this.f61394d = System.currentTimeMillis();
                    o.a(b.f61391a, "onConfigured...createSessionConsume = ".concat(String.valueOf(b.this.f61394d - b.this.V)));
                    if (b.this.C == null) {
                        o.d(b.f61391a, "onConfigured...device has closed...");
                        cameraCaptureSession.close();
                        b.this.y();
                        return;
                    }
                    b.this.aa = true;
                    b.this.w = cameraCaptureSession;
                    try {
                        int m2 = b.this.m();
                        if (m2 != 0) {
                            b.this.y.a(m2, "updateCapture : something wrong.");
                            o.d(b.f61391a, "update capture failed, device: " + b.this.C);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                    b.this.a(cameraCaptureSession, 7, surface);
                }
            };
            this.ac = r0;
            a(arCoreSurfaces, r0, handler, false);
            if (this.w == null) {
                z();
            }
            return 0;
        }
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final Rect a(float f2) {
        return new Rect();
    }

    @Override // com.ss.android.ttvecamera.e.b
    public final String a(int i2) {
        String c2;
        a aVar = this.f61393c;
        if (aVar == null || (c2 = aVar.c()) == null) {
            return null;
        }
        this.t = this.x.getCameraCharacteristics(c2);
        l lVar = this.A;
        int i3 = 1;
        if (((Integer) this.t.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            i3 = 0;
        }
        lVar.f61802e = i3;
        return c2;
    }

    public final void a(Context context, Handler handler) {
        if (this.u.d()) {
            a aVar = a.C1337a.f61390a;
            this.f61393c = aVar;
            aVar.a(context, this.A);
            this.f61393c.f61378c = handler;
        }
    }

    public final void a(CameraCaptureSession cameraCaptureSession, int i2, Object obj) {
        a aVar;
        if (cameraCaptureSession != null && (aVar = this.f61393c) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.f61379d == null && aVar.f61380e != null && Build.VERSION.SDK_INT >= 21) {
                aVar.f61379d = aVar.f61380e.createARSessionStateCallback(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: IPUT  
                      (wrap: android.hardware.camera2.CameraCaptureSession$StateCallback : 0x0021: INVOKE  (r0v23 android.hardware.camera2.CameraCaptureSession$StateCallback) = 
                      (wrap: com.google.ar.core.SharedCamera : 0x0018: IGET  (r2v3 com.google.ar.core.SharedCamera) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.e com.google.ar.core.SharedCamera)
                      (wrap: com.ss.android.ttvecamera.a.a$1 : 0x001c: CONSTRUCTOR  (r1v4 com.ss.android.ttvecamera.a.a$1) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) call: com.ss.android.ttvecamera.a.a.1.<init>(com.ss.android.ttvecamera.a.a):void type: CONSTRUCTOR)
                      (wrap: android.os.Handler : 0x001f: IGET  (r0v22 android.os.Handler) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.c android.os.Handler)
                     type: VIRTUAL call: com.google.ar.core.SharedCamera.createARSessionStateCallback(android.hardware.camera2.CameraCaptureSession$StateCallback, android.os.Handler):android.hardware.camera2.CameraCaptureSession$StateCallback)
                      (r4v0 'aVar' com.ss.android.ttvecamera.a.a)
                     com.ss.android.ttvecamera.a.a.d android.hardware.camera2.CameraCaptureSession$StateCallback in method: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: INVOKE  (r0v23 android.hardware.camera2.CameraCaptureSession$StateCallback) = 
                      (wrap: com.google.ar.core.SharedCamera : 0x0018: IGET  (r2v3 com.google.ar.core.SharedCamera) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.e com.google.ar.core.SharedCamera)
                      (wrap: com.ss.android.ttvecamera.a.a$1 : 0x001c: CONSTRUCTOR  (r1v4 com.ss.android.ttvecamera.a.a$1) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) call: com.ss.android.ttvecamera.a.a.1.<init>(com.ss.android.ttvecamera.a.a):void type: CONSTRUCTOR)
                      (wrap: android.os.Handler : 0x001f: IGET  (r0v22 android.os.Handler) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) com.ss.android.ttvecamera.a.a.c android.os.Handler)
                     type: VIRTUAL call: com.google.ar.core.SharedCamera.createARSessionStateCallback(android.hardware.camera2.CameraCaptureSession$StateCallback, android.os.Handler):android.hardware.camera2.CameraCaptureSession$StateCallback in method: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r1v4 com.ss.android.ttvecamera.a.a$1) = (r4v0 'aVar' com.ss.android.ttvecamera.a.a) call: com.ss.android.ttvecamera.a.a.1.<init>(com.ss.android.ttvecamera.a.a):void type: CONSTRUCTOR in method: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttvecamera.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 167
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.a.b.a(android.hardware.camera2.CameraCaptureSession, int, java.lang.Object):void");
            }

            public final void a(CameraDevice cameraDevice, int i2, int i3) {
                a aVar;
                if (cameraDevice != null && (aVar = this.f61393c) != null) {
                    CameraDevice.StateCallback b2 = aVar.b();
                    if (b2 == null) {
                        o.c(f61391a, "on device proxy failed, state: " + i2 + ", arg1: " + i3);
                    } else if (i2 == 0) {
                        b2.onOpened(cameraDevice);
                    } else if (i2 == 1) {
                        b2.onDisconnected(cameraDevice);
                    } else if (i2 == 3) {
                        b2.onError(cameraDevice, i3);
                    } else if (i2 == 4) {
                        try {
                            b2.onClosed(cameraDevice);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }

            public b(e eVar, Context context, CameraManager cameraManager, Handler handler) {
                super(eVar, context, handler);
                this.x = cameraManager;
                this.ad = new CameraCaptureSession.CaptureCallback() {
                    /* class com.ss.android.ttvecamera.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37810);
                    }

                    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        MethodCollector.i(3355);
                        if (!b.this.U) {
                            b.this.y();
                            b.this.U = true;
                            o.a(b.f61391a, "first preview frame callback arrived! consume = ".concat(String.valueOf(System.currentTimeMillis() - b.this.X)));
                            if (b.this.f61393c != null) {
                                a aVar = b.this.f61393c;
                                long currentTimeMillis = System.currentTimeMillis() - aVar.f61384i;
                                synchronized (aVar.f61383h) {
                                    try {
                                        if (aVar.f61385j.size() > a.f61377b) {
                                            aVar.f61385j.remove(0);
                                        }
                                        aVar.f61385j.add(Long.valueOf(currentTimeMillis));
                                    } catch (Throwable th) {
                                        MethodCollector.o(3355);
                                        throw th;
                                    }
                                }
                            }
                        }
                        if (!b.this.f61392b) {
                            o.d(b.f61391a, "discardSurfaceTextureOnFrameAvailable");
                            MethodCollector.o(3355);
                            return;
                        }
                        if (!b.this.A.f61809l) {
                            b.this.z.t.f61616b.h();
                        } else if (b.this.D != null) {
                            b.this.D.post(new Runnable() {
                                /* class com.ss.android.ttvecamera.a.b.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(37811);
                                }

                                public final void run() {
                                    if (b.this.f61392b) {
                                        b.this.z.t.f61616b.h();
                                    } else {
                                        o.d(b.f61391a, "inner discardSurfaceTextureOnFrameAvailable");
                                    }
                                }
                            });
                            MethodCollector.o(3355);
                            return;
                        }
                        MethodCollector.o(3355);
                    }
                };
            }
        }
