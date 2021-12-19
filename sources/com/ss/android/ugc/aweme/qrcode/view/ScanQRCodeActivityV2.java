package com.ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.p;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import com.ss.android.ugc.aweme.share.ah;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class ScanQRCodeActivityV2 extends com.bytedance.ies.foundation.activity.a implements View.OnClickListener, p, com.ss.android.ugc.aweme.qrcode.presenter.d, i, j {
    private FrameLayout A;
    private RelativeLayout B;
    private boolean C;
    private d D;
    private QrCodeScanService E;

    /* renamed from: a  reason: collision with root package name */
    public int f119812a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f119813b;

    /* renamed from: c  reason: collision with root package name */
    SurfaceView f119814c;

    /* renamed from: d  reason: collision with root package name */
    public IQRCodeScanner f119815d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qrcode.presenter.c f119816e;

    /* renamed from: f  reason: collision with root package name */
    com.ss.android.ugc.aweme.qrcode.presenter.b f119817f;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.profile.presenter.a f119818g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f119819h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f119820i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f119821j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f119822k;

    /* renamed from: l  reason: collision with root package name */
    ImageView f119823l;

    /* renamed from: m  reason: collision with root package name */
    public GestureDetector f119824m;
    public ScaleGestureDetector n;
    public GestureDetector o;
    public float p = 1.0f;
    public boolean q;
    IQRCodeScanner.OnEnigmaScanListener r = new IQRCodeScanner.OnEnigmaScanListener() {
        /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass1 */

        static {
            Covode.recordClassIndex(77855);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener
        public final void onFail(int i2) {
            if (ScanQRCodeActivityV2.this.f119822k && ScanQRCodeActivityV2.this.f119816e != null) {
                ScanQRCodeActivityV2.this.f119816e.a(ScanQRCodeActivityV2.this.f119819h);
            }
            if (ScanQRCodeActivityV2.this.f119819h && ScanQRCodeActivityV2.this.f119815d != null) {
                ScanQRCodeActivityV2.this.f119815d.stopPicScan();
            }
            ScanQRCodeActivityV2.this.f119819h = false;
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener
        public final void onSuccess(AVEnigmaResult aVEnigmaResult) {
            if (ScanQRCodeActivityV2.this.f119822k && !ScanQRCodeActivityV2.this.f119821j && ScanQRCodeActivityV2.this.f119816e != null && aVEnigmaResult != null) {
                if (aVEnigmaResult.getResult() != null && aVEnigmaResult.getResult().length > 0) {
                    ScanQRCodeActivityV2.this.f119821j = true;
                    AVEnigma[] result = aVEnigmaResult.getResult();
                    if (ScanQRCodeActivityV2.this.f119813b) {
                        Intent intent = new Intent();
                        intent.putExtra("scan_code_result", result[0].getText());
                        intent.putExtra("scan_code_type", result[0].getType());
                        ScanQRCodeActivityV2.this.setResult(-1, intent);
                        ScanQRCodeActivityV2.this.finish();
                        return;
                    }
                    result[0].getText();
                    ScanQRCodeActivityV2.this.f119816e.a(ScanQRCodeActivityV2.this.f119819h, result[0].getType(), result[0].getText(), ScanQRCodeActivityV2.this.f119812a);
                } else if (ScanQRCodeActivityV2.this.f119815d != null) {
                    ScanQRCodeActivityV2.this.f119815d.zoomByRatio(aVEnigmaResult.zoomFactor);
                }
            }
            ScanQRCodeActivityV2.this.f119819h = false;
        }
    };
    private TextView s;
    private TextTitleBar t;
    private a u;
    private boolean v;
    private TextView w;
    private boolean x;
    private TextView y;
    private TextView z;

    public interface b {
        static {
            Covode.recordClassIndex(77863);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(77854);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(AvatarUri avatarUri) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(Exception exc) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(129, new g(ScanQRCodeActivityV2.class, "onNetStateChangeEvent", com.ss.android.ugc.aweme.common.net.c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void c() {
        this.f119823l.clearAnimation();
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        ah.f123352a.b(this);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void b() {
        b.i.b(new h(this), b.i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void e() {
        a aVar = this.u;
        if (aVar != null && aVar.isShowing()) {
            this.u.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void f() {
        this.f119821j = false;
        IQRCodeScanner iQRCodeScanner = this.f119815d;
        if (iQRCodeScanner != null) {
            iQRCodeScanner.enableCameraScan(true, 65536);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object j() {
        MethodCollector.i(1231);
        synchronized (this) {
            try {
                IQRCodeScanner iQRCodeScanner = this.f119815d;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.stop();
                }
            } catch (Throwable th) {
                MethodCollector.o(1231);
                throw th;
            }
        }
        MethodCollector.o(1231);
        return null;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        if (this.x) {
            k();
        }
        this.f119814c.setVisibility(4);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", true);
        this.E.a();
        super.onResume();
        this.f119814c.setVisibility(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", false);
    }

    private void k() {
        IQRCodeScanner iQRCodeScanner = this.f119815d;
        if (iQRCodeScanner != null) {
            iQRCodeScanner.closeLight();
        }
        this.x = false;
        this.w.setAlpha(0.8f);
        this.w.setText(R.string.cw0);
        Drawable drawable = getResources().getDrawable(2131233539);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.w.setCompoundDrawables(null, drawable, null, null);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void d() {
        a aVar = this.u;
        if (aVar == null) {
            a a2 = a.a(this, "");
            this.u = a2;
            a2.setIndeterminate(false);
        } else if (!aVar.isShowing()) {
            this.u.show();
            this.u.a();
        }
    }

    public final void g() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.f119823l.getHeight()), (float) (this.A.getHeight() - n.a(20.0d)));
        translateAnimation.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.f119823l.startAnimation(translateAnimation);
    }

    public final void h() {
        MethodCollector.i(1226);
        if (!this.C) {
            d dVar = new d(this, (float) this.A.getLeft(), (float) this.A.getTop(), (float) this.A.getRight(), (float) this.A.getBottom());
            this.D = dVar;
            this.B.addView(dVar, 2);
            this.C = true;
        }
        MethodCollector.o(1226);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.qrcode.c.b.f119723b.a("", 0);
        com.ss.android.ugc.aweme.qrcode.presenter.c cVar = this.f119816e;
        if (cVar != null) {
            cVar.b();
        }
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f119818g;
        if (aVar != null) {
            aVar.d();
            this.f119818g.f116509c = null;
        }
        this.f119816e = null;
        b.i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass7 */

            static {
                Covode.recordClassIndex(77861);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                MethodCollector.i(1478);
                if (ScanQRCodeActivityV2.this.f119815d != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        try {
                            if (ScanQRCodeActivityV2.this.f119815d != null) {
                                ScanQRCodeActivityV2.this.f119815d.stop();
                                ScanQRCodeActivityV2.this.f119815d.release();
                                ScanQRCodeActivityV2.this.f119815d.setScanListener(null);
                                ScanQRCodeActivityV2.this.f119815d = null;
                            }
                        } finally {
                            MethodCollector.o(1478);
                        }
                    }
                }
                return null;
            }
        }, b.i.f4824a);
        GestureDetector gestureDetector = this.f119824m;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void a() {
        if (this.f119815d == null) {
            a((b) null);
        }
        final AVCameraParams aVCameraParams = new AVCameraParams(com.bytedance.ies.ugc.appcontext.d.a(), 1);
        final AVScanSettings aVScanSettings = new AVScanSettings();
        aVScanSettings.width = 1280;
        aVScanSettings.height = 720;
        float b2 = (float) com.ss.android.ugc.aweme.base.utils.i.b(this);
        float a2 = (float) com.ss.android.ugc.aweme.base.utils.i.a(this);
        aVScanSettings.detectRectLeft = this.A.getX() / b2;
        aVScanSettings.detectRectTop = this.A.getY() / a2;
        aVScanSettings.detectRectWidth = ((float) this.A.getWidth()) / b2;
        aVScanSettings.detectRectHeight = ((float) this.A.getHeight()) / a2;
        aVScanSettings.detectRequirement = 65536;
        aVScanSettings.buildChainFlag = 1;
        aVScanSettings.enableDetectRect = true;
        b.i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass6 */

            static {
                Covode.recordClassIndex(77860);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                MethodCollector.i(6689);
                synchronized (ScanQRCodeActivityV2.this) {
                    try {
                        if (ScanQRCodeActivityV2.this.f119815d != null && ScanQRCodeActivityV2.this.f119820i) {
                            IQRCodeScanner iQRCodeScanner = ScanQRCodeActivityV2.this.f119815d;
                            ScanQRCodeActivityV2 scanQRCodeActivityV2 = ScanQRCodeActivityV2.this;
                            iQRCodeScanner.startScan(scanQRCodeActivityV2, aVCameraParams, scanQRCodeActivityV2.f119814c.getHolder(), aVScanSettings);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6689);
                        throw th;
                    }
                }
                MethodCollector.o(6689);
                return null;
            }
        }, b.i.f4824a).a(new b.g<Object, Object>() {
            /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass5 */

            static {
                Covode.recordClassIndex(77859);
            }

            @Override // b.g
            public final Object then(b.i<Object> iVar) {
                MethodCollector.i(6685);
                synchronized (ScanQRCodeActivityV2.this) {
                    try {
                        if (ScanQRCodeActivityV2.this.f119815d != null && !ScanQRCodeActivityV2.this.f119820i) {
                            ScanQRCodeActivityV2.this.f119815d.stop();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6685);
                        throw th;
                    }
                }
                MethodCollector.o(6685);
                return null;
            }
        }, b.i.f4824a, null).a(new b.g<Object, Object>() {
            /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass4 */

            static {
                Covode.recordClassIndex(77858);
            }

            @Override // b.g
            public final Object then(b.i<Object> iVar) {
                ScanQRCodeActivityV2.this.f119824m = new GestureDetector(ScanQRCodeActivityV2.this, new a(ScanQRCodeActivityV2.this, (byte) 0));
                ScanQRCodeActivityV2.this.n = new ScaleGestureDetector(ScanQRCodeActivityV2.this, new c(ScanQRCodeActivityV2.this, (byte) 0));
                ScanQRCodeActivityV2.this.o = new GestureDetector(ScanQRCodeActivityV2.this, new d(ScanQRCodeActivityV2.this, (byte) 0));
                return null;
            }
        }, b.i.f4826c, null);
    }

    class d implements GestureDetector.OnGestureListener {
        static {
            Covode.recordClassIndex(77865);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        private d() {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ScanQRCodeActivityV2.this.f119815d.processTouchEvent(motionEvent.getX() / ((float) com.ss.android.ugc.aweme.base.utils.i.b(ScanQRCodeActivityV2.this)), motionEvent.getY() / ((float) com.ss.android.ugc.aweme.base.utils.i.a(ScanQRCodeActivityV2.this)));
            return true;
        }

        /* synthetic */ d(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b2) {
            this();
        }
    }

    class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        private final float f119835b;

        /* renamed from: c  reason: collision with root package name */
        private long f119836c;

        static {
            Covode.recordClassIndex(77862);
        }

        private a() {
            this.f119835b = 0.03f;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ScanQRCodeActivityV2.this.f119815d == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f119836c < 500) {
                return false;
            }
            this.f119836c = currentTimeMillis;
            if (ScanQRCodeActivityV2.this.p > 1.0f) {
                while (ScanQRCodeActivityV2.this.p > 1.0f) {
                    ScanQRCodeActivityV2.this.p -= 0.03f;
                    ScanQRCodeActivityV2.this.f119815d.zoomByRatio(ScanQRCodeActivityV2.this.p);
                }
            } else {
                while (ScanQRCodeActivityV2.this.p < 3.0f) {
                    ScanQRCodeActivityV2.this.p += 0.03f;
                    ScanQRCodeActivityV2.this.f119815d.zoomByRatio(ScanQRCodeActivityV2.this.p);
                }
            }
            return false;
        }

        /* synthetic */ a(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b2) {
            this();
        }
    }

    class c implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: b  reason: collision with root package name */
        private final float f119838b;

        static {
            Covode.recordClassIndex(77864);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        private c() {
            this.f119838b = 0.05f;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!(ScanQRCodeActivityV2.this.f119815d == null || scaleGestureDetector == null)) {
                if (scaleGestureDetector.getScaleFactor() >= 1.0f && ScanQRCodeActivityV2.this.p <= 3.0f) {
                    ScanQRCodeActivityV2.this.p += 0.05f;
                } else if (ScanQRCodeActivityV2.this.p >= 1.0f) {
                    ScanQRCodeActivityV2.this.p -= 0.05f;
                }
                ScanQRCodeActivityV2.this.f119815d.zoomByRatio(ScanQRCodeActivityV2.this.p);
            }
            return false;
        }

        /* synthetic */ c(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.d
    public final void a(int i2) {
        SurfaceView surfaceView = this.f119814c;
        if (surfaceView != null) {
            surfaceView.postDelayed(new i(this), (long) i2);
        }
    }

    public final void a(b bVar) {
        this.f119821j = false;
        AVExternalServiceImpl.a().abilityService().cameraService().getScanner(true, this, this.f119814c.getHolder(), new f(this, bVar));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(String str) {
        if (this.f119815d == null) {
            a(new k(this, str));
        } else {
            a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        AVScanSettings aVScanSettings = new AVScanSettings();
        aVScanSettings.width = 1280;
        aVScanSettings.height = 720;
        aVScanSettings.buildChainFlag = 1;
        aVScanSettings.detectModelDir = "";
        this.f119819h = true;
        this.f119815d.startPicScan(str, aVScanSettings, 1000);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d dVar = this.D;
        if (dVar != null) {
            float left = (float) this.A.getLeft();
            float top = (float) this.A.getTop();
            float right = (float) this.A.getRight();
            dVar.f119856a = top;
            dVar.f119857b = (float) this.A.getBottom();
            dVar.f119858c = left;
            dVar.f119859d = right;
            dVar.invalidate();
        }
    }

    @r
    public void onNetStateChangeEvent(com.ss.android.ugc.aweme.common.net.c cVar) {
        if (!isDestroyed()) {
            if (f.a.f68431a.c()) {
                this.y.setVisibility(8);
                this.f119822k = true;
                return;
            }
            this.y.setVisibility(0);
            this.f119822k = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f119824m;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector2 = this.o;
        if (gestureDetector2 != null && gestureDetector2.onTouchEvent(motionEvent)) {
            return true;
        }
        ScaleGestureDetector scaleGestureDetector = this.n;
        if (scaleGestureDetector == null || !scaleGestureDetector.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.f1w) {
            if (this.x) {
                k();
                return;
            }
            IQRCodeScanner iQRCodeScanner = this.f119815d;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.openLight();
            }
            this.x = true;
            this.w.setAlpha(1.0f);
            this.w.setText(R.string.cvz);
            Drawable drawable = getResources().getDrawable(2131233540);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.w.setCompoundDrawables(null, drawable, null, null);
        } else if (id == R.id.f3b && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                com.ss.android.ugc.aweme.login.c.a(this, "scan", "click_my_qr", (Bundle) null, new j(this));
            } else if (this.v) {
                finish();
            } else {
                i();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65556b = true;
        xVar.f65560f = R.attr.a1;
        xVar.f65562h = true;
        activityConfiguration(new e(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.c1);
        this.v = getIntent().getBooleanExtra("enter_from", false);
        this.f119812a = getIntent().getIntExtra("scan_page_from", 0);
        this.q = getIntent().getBooleanExtra("camera_only", false);
        this.f119813b = getIntent().getBooleanExtra("is_kill_self_after_scan", false);
        this.s = (TextView) findViewById(R.id.f3b);
        TextTitleBar textTitleBar = (TextTitleBar) findViewById(R.id.em8);
        this.t = textTitleBar;
        textTitleBar.getBackBtn().setImageResource(R.drawable.ajo);
        this.f119820i = false;
        this.f119814c = (SurfaceView) findViewById(R.id.efb);
        this.w = (TextView) findViewById(R.id.f1w);
        this.y = (TextView) findViewById(R.id.ewt);
        this.f119823l = (ImageView) findViewById(R.id.dsf);
        this.z = (TextView) findViewById(R.id.f58);
        this.A = (FrameLayout) findViewById(R.id.b6a);
        this.B = (RelativeLayout) findViewById(R.id.dqn);
        TextTitleBar textTitleBar2 = this.t;
        String str = "";
        l.d(textTitleBar2, str);
        textTitleBar2.getBackBtn().setImageResource(R.drawable.abl);
        this.f119814c.getHolder().addCallback(new SurfaceHolder.Callback() {
            /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass2 */

            static {
                Covode.recordClassIndex(77856);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            }

            /* access modifiers changed from: package-private */
            public final void a() {
                ScanQRCodeActivityV2.this.f119815d.enableCameraScan(true, 65536);
                ScanQRCodeActivityV2.this.a();
                ScanQRCodeActivityV2.this.g();
                ScanQRCodeActivityV2.this.h();
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                MethodCollector.i(1604);
                synchronized (this) {
                    try {
                        ScanQRCodeActivityV2.this.f119820i = true;
                    } catch (Throwable th) {
                        MethodCollector.o(1604);
                        throw th;
                    }
                }
                if (ScanQRCodeActivityV2.this.f119815d == null) {
                    ScanQRCodeActivityV2.this.a(new o(this));
                    MethodCollector.o(1604);
                    return;
                }
                a();
                MethodCollector.o(1604);
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                MethodCollector.i(1605);
                ScanQRCodeActivityV2.this.f119823l.clearAnimation();
                synchronized (this) {
                    try {
                        ScanQRCodeActivityV2.this.f119820i = false;
                    } finally {
                        MethodCollector.o(1605);
                    }
                }
                if (ScanQRCodeActivityV2.this.f119815d != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        try {
                            if (ScanQRCodeActivityV2.this.f119815d != null) {
                                ScanQRCodeActivityV2.this.f119815d.stop();
                                ScanQRCodeActivityV2.this.f119815d.release();
                            }
                        } finally {
                            MethodCollector.o(1605);
                        }
                    }
                    return;
                }
                MethodCollector.o(1605);
            }
        });
        this.t.f33523f.setVisibility(8);
        DmtTextView endText = this.t.getEndText();
        endText.setTextColor(androidx.core.content.b.c(endText.getContext(), R.color.a9));
        this.s.setOnClickListener(this);
        this.s.setText(getString(R.string.hfw));
        this.t.setTitle(getString(R.string.fgl));
        TextTitleBar textTitleBar3 = this.t;
        if (!this.q) {
            str = getString(R.string.rb);
        }
        textTitleBar3.setEndText(str);
        this.t.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.AnonymousClass3 */

            static {
                Covode.recordClassIndex(77857);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                ScanQRCodeActivityV2.this.finish();
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
                if (!ScanQRCodeActivityV2.this.q) {
                    com.ss.android.ugc.aweme.profile.presenter.a aVar = ScanQRCodeActivityV2.this.f119818g;
                    if (aVar.f116508b != null) {
                        aVar.f116508b.a(2);
                    }
                }
            }
        });
        this.E = QrCodeScanImpl.b();
        a((b) null);
        com.ss.android.ugc.aweme.qrcode.presenter.a.c cVar = new com.ss.android.ugc.aweme.qrcode.presenter.a.c(this, this);
        this.f119817f = cVar;
        cVar.a();
        this.f119816e = this.f119817f;
        com.ss.android.ugc.aweme.profile.presenter.a aVar = new com.ss.android.ugc.aweme.profile.presenter.a();
        this.f119818g = aVar;
        aVar.f116509c = this;
        this.f119818g.b(this, null);
        this.w.setOnClickListener(this);
        if (f.a.f68431a.c()) {
            this.y.setVisibility(8);
            this.f119822k = true;
        } else {
            this.f119822k = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", false);
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f119818g;
        if (aVar != null) {
            aVar.a(i2, i3, intent);
        }
    }
}
