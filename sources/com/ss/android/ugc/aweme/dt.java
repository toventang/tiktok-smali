package com.ss.android.ugc.aweme;

import android.content.Context;
import android.view.SurfaceHolder;
import androidx.core.app.d;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.model.Enigma;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.TdPoint;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ugc.asve.d.a;
import com.ss.android.ugc.asve.recorder.a;
import com.ss.android.ugc.asve.recorder.camera.b;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.property.ar;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.property.ds;
import com.ss.android.ugc.aweme.property.o;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVTdPoint;
import com.ss.android.ugc.aweme.setting.r;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.record.as;
import com.ss.android.ugc.aweme.shortvideo.ui.a.n;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.ba;
import com.ss.android.vesdk.runtime.VERuntime;

public final class dt implements IQRCodeScanner {

    /* renamed from: a  reason: collision with root package name */
    public a f84103a;

    /* renamed from: b  reason: collision with root package name */
    public IQRCodeScanner.OnEnigmaScanListener f84104b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f84105c = -1;

    static {
        Covode.recordClassIndex(52430);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void release() {
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.h().c();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stop() {
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.h().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stopPicScan() {
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.h().a();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void closeLight() {
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.c().b(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF.ordinal());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void openLight() {
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.c().b(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH.ordinal());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void pauseEffectAudio(boolean z) {
        this.f84103a.h().a(z);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void zoomByRatio(float f2) {
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.c().b(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void setScanListener(IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener) {
        this.f84104b = onEnigmaScanListener;
        a aVar = this.f84103a;
        if (aVar != null) {
            aVar.h().a(new a.b() {
                /* class com.ss.android.ugc.aweme.dt.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(52435);
                }

                @Override // com.ss.android.ugc.asve.d.a.b
                public final void a(int i2) {
                    if (dt.this.f84104b != null) {
                        dt.this.f84104b.onFail(i2);
                    }
                }

                @Override // com.ss.android.ugc.asve.d.a.b
                public final void a(EnigmaResult enigmaResult) {
                    AVTdPoint[] aVTdPointArr;
                    if (dt.this.f84104b != null) {
                        IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener = dt.this.f84104b;
                        AVEnigmaResult aVEnigmaResult = null;
                        if (enigmaResult != null) {
                            AVEnigmaResult aVEnigmaResult2 = new AVEnigmaResult();
                            aVEnigmaResult2.zoomFactor = enigmaResult.zoomFactor;
                            Enigma[] result = enigmaResult.getResult();
                            if (result != null) {
                                AVEnigma[] aVEnigmaArr = new AVEnigma[result.length];
                                for (int i2 = 0; i2 < result.length; i2++) {
                                    AVEnigma aVEnigma = new AVEnigma();
                                    aVEnigma.setText(result[i2].getText());
                                    aVEnigma.setType(result[i2].getType());
                                    TdPoint[] points = result[i2].getPoints();
                                    if (points == null) {
                                        aVTdPointArr = null;
                                    } else {
                                        aVTdPointArr = new AVTdPoint[points.length];
                                        for (int i3 = 0; i3 < points.length; i3++) {
                                            AVTdPoint aVTdPoint = new AVTdPoint();
                                            aVTdPoint.setX(points[i3].getX());
                                            aVTdPoint.setY(points[i3].getY());
                                            aVTdPointArr[i3] = aVTdPoint;
                                        }
                                    }
                                    aVEnigma.setPoints(aVTdPointArr);
                                    aVEnigmaArr[i2] = aVEnigma;
                                }
                                aVEnigmaResult2.setResult(aVEnigmaArr);
                            }
                            aVEnigmaResult = aVEnigmaResult2;
                        }
                        onEnigmaScanListener.onSuccess(aVEnigmaResult);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void processTouchEvent(float f2, float f3) {
        this.f84103a.h().a(f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void enableCameraScan(boolean z, long j2) {
        if (this.f84103a != null && !bn.a()) {
            this.f84103a.h().a(z, j2);
        }
    }

    public dt(Context context, final SurfaceHolder surfaceHolder) {
        com.ss.android.ugc.asve.recorder.a aVar;
        c.a(eq.a());
        b.f62211b = o.a();
        com.ss.android.ugc.asve.recorder.camera.c.f62254a = ar.a();
        com.ss.android.ugc.asve.recorder.camera.c.a a2 = new n().a();
        if (bn.a()) {
            VERuntime.a.INSTANCE.veRuntime.f151404i = true;
        }
        com.ss.android.ugc.asve.recorder.a a3 = a.C1355a.a((d) context, new com.ss.android.ugc.asve.context.b() {
            /* class com.ss.android.ugc.aweme.dt.AnonymousClass1 */

            static {
                Covode.recordClassIndex(52431);
            }

            @Override // com.ss.android.ugc.asve.context.b, com.ss.android.ugc.asve.context.h
            public final boolean c() {
                return true;
            }

            @Override // com.ss.android.ugc.asve.context.b, com.ss.android.ugc.asve.context.h
            public final boolean a() {
                return ds.f118463a;
            }

            @Override // com.ss.android.ugc.asve.context.b, com.ss.android.ugc.asve.context.h
            public final SurfaceHolder d() {
                return surfaceHolder;
            }

            @Override // com.ss.android.ugc.asve.context.b, com.ss.android.ugc.asve.context.h
            public final boolean b() {
                return r.a();
            }

            @Override // com.ss.android.ugc.asve.context.b, com.ss.android.ugc.asve.context.h
            public final com.ss.android.ugc.asve.context.c o() {
                return new com.ss.android.ugc.asve.context.a() {
                    /* class com.ss.android.ugc.aweme.dt.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(52432);
                    }

                    @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
                    public final com.ss.android.ugc.asve.b.c a() {
                        return com.ss.android.ugc.asve.b.c.AS_CAMERA_LENS_BACK;
                    }
                };
            }

            @Override // com.ss.android.ugc.asve.context.b, com.ss.android.ugc.asve.context.h
            public final boolean z() {
                return bn.a();
            }
        }, a2);
        this.f84103a = a3;
        a3.c().a(new as(""));
        this.f84103a.c().a(new com.ss.android.medialib.camera.a() {
            /* class com.ss.android.ugc.aweme.dt.AnonymousClass2 */

            static {
                Covode.recordClassIndex(52433);
            }

            @Override // com.ss.android.medialib.camera.a
            public final void a(int i2) {
            }

            @Override // com.ss.android.medialib.camera.a
            public final void a(int i2, int i3, String str) {
                if (dt.this.f84104b != null) {
                    dt.this.f84104b.onFail(-1000);
                }
            }
        });
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            /* class com.ss.android.ugc.aweme.dt.AnonymousClass3 */

            static {
                Covode.recordClassIndex(52434);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (dt.this.f84103a != null) {
                    dt.this.f84103a.c().a(com.ss.android.ugc.asve.b.c.AS_CAMERA_LENS_BACK.ordinal(), (com.ss.android.medialib.camera.a) null, (PrivacyCert) null);
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (dt.this.f84103a != null) {
                    dt.this.f84103a.c().a(false, (PrivacyCert) null);
                }
            }
        });
        if (surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid() && (aVar = this.f84103a) != null) {
            aVar.c().a(com.ss.android.ugc.asve.b.c.AS_CAMERA_LENS_BACK.ordinal(), (com.ss.android.medialib.camera.a) null, (PrivacyCert) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startPicScan(String str, AVScanSettings aVScanSettings, long j2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f84103a;
        if (aVar != null) {
            com.ss.android.ugc.asve.d.a h2 = aVar.h();
            ScanSettings scanSettings = new ScanSettings();
            scanSettings.width = aVScanSettings.width;
            scanSettings.height = aVScanSettings.height;
            scanSettings.detectModelDir = aVScanSettings.detectModelDir;
            scanSettings.detectRectLeft = aVScanSettings.detectRectLeft;
            scanSettings.detectRectTop = aVScanSettings.detectRectTop;
            scanSettings.detectRectWidth = aVScanSettings.detectRectWidth;
            scanSettings.detectRectHeight = aVScanSettings.detectRectHeight;
            scanSettings.enableDetectRect = aVScanSettings.enableDetectRect;
            scanSettings.detectRequirement = aVScanSettings.detectRequirement;
            scanSettings.buildChainFlag = aVScanSettings.buildChainFlag;
            h2.a(str, scanSettings, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void switchEffectWithTag(String str, int i2, int i3, String str2) {
        this.f84103a.h().a(str, i2, i3, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings) {
        c.d();
        ba.a(DownloadableModelSupport.getInstance().getResourceFinder());
        if (this.f84103a == null) {
            return;
        }
        if (bn.a()) {
            this.f84105c = Integer.valueOf(this.f84103a.h().b(aVScanSettings.detectRectLeft, aVScanSettings.detectRectTop, aVScanSettings.detectRectWidth, aVScanSettings.detectRectHeight));
        } else {
            this.f84103a.h().a(aVScanSettings.detectRectLeft, aVScanSettings.detectRectTop, aVScanSettings.detectRectWidth, aVScanSettings.detectRectHeight);
        }
    }
}
