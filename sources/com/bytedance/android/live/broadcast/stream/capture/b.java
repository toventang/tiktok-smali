package com.bytedance.android.live.broadcast.stream.capture;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.d.a;
import com.bytedance.android.live.broadcast.stream.capture.c;
import com.bytedance.android.live.broadcast.stream.f;
import com.bytedance.android.live.effect.model.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import h.f.b.l;
import javax.microedition.khronos.egl.EGLContext;

public final class b extends a implements ILiveStream.ILiveStreamErrorListener, ILiveStream.ILiveStreamInfoListener, ILiveStream.ITextureFrameAvailableListener, IFilterManager.EffectMsgListener, IFilterManager.FaceDetectListener {

    /* renamed from: d  reason: collision with root package name */
    public a f8537d;

    /* renamed from: e  reason: collision with root package name */
    private d f8538e;

    /* renamed from: f  reason: collision with root package name */
    private c.a f8539f;

    /* renamed from: g  reason: collision with root package name */
    private IFilterManager f8540g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8541h;

    /* renamed from: i  reason: collision with root package name */
    private int f8542i = 1;

    static {
        Covode.recordClassIndex(4381);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a
    public final void a() {
        this.f8537d.c();
    }

    private void c() {
        int videoCaptureDevice;
        if (this.f8537d.e() != null && this.f8537d.e().getBuilder() != null && (videoCaptureDevice = this.f8537d.e().getBuilder().getVideoCaptureDevice()) != 5) {
            this.f8542i = videoCaptureDevice;
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a
    public final void b() {
        this.f8537d.d(PrivacyCert.Builder.with("bpea-355").usage("").tag("start broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        f.a("capture_video");
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a
    public final void a(c.a aVar) {
        this.f8539f = aVar;
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a, com.bytedance.android.live.effect.api.c
    public final void a(com.bytedance.android.live.effect.model.a aVar) {
        aVar.f9874a = this.f8538e;
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a
    public final void b(PrivacyCert privacyCert) {
        if (!this.f8541h) {
            this.f8541h = true;
            this.f8537d.j(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a
    public final void a(PrivacyCert privacyCert) {
        this.f8536c = null;
        this.f8538e.b();
        this.f8537d.e(privacyCert);
        f.a("release_video");
        this.f8540g.setFaceDetectListener(null);
        this.f8540g.setEffectMsgListener(null);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener
    public final void onFaceDetectResultCallback(int i2) {
        if (this.f8534a != null) {
            for (int size = this.f8534a.size() - 1; size >= 0; size--) {
                ((IVideoEffectProcessor.FaceDetectListener) this.f8534a.get(size)).onFaceDetectResultCallback(i2);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.a
    public final void a(boolean z, PrivacyCert privacyCert) {
        com.bytedance.android.live.base.model.user.b a2;
        c();
        if (z) {
            this.f8537d.a(this.f8542i, privacyCert);
            return;
        }
        this.f8537d.a(5, privacyCert);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 != null && (a2 = b2.a()) != null && this.f8537d.e() != null && (a2 instanceof User)) {
            ((e) com.bytedance.android.live.t.a.a(e.class)).a(a2.getAvatarThumb(), new e.b() {
                /* class com.bytedance.android.live.broadcast.stream.capture.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4382);
                }

                @Override // com.bytedance.android.livesdkapi.host.e.b
                public final void a(Bitmap bitmap) {
                    MethodCollector.i(6790);
                    if (bitmap == null || bitmap.isRecycled()) {
                        MethodCollector.o(6790);
                        return;
                    }
                    l.d(bitmap, "");
                    float f2 = 0.1f;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width < 100 || height < 100) {
                        f2 = 0.6f;
                    } else if (width < 200 || height < 200) {
                        f2 = 0.3f;
                    }
                    int round = Math.round(((float) width) * f2);
                    int round2 = Math.round(((float) height) * f2);
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
                    Bitmap createBitmap = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                    com.bytedance.android.livesdk.utils.e.a(createScaledBitmap, createBitmap, 5);
                    createScaledBitmap.recycle();
                    if (createBitmap == null || createBitmap.isRecycled()) {
                        MethodCollector.o(6790);
                        return;
                    }
                    b.this.f8537d.e().setBackGroundPhotoPath(createBitmap);
                    MethodCollector.o(6790);
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i2, int i3, Exception exc) {
        c.a aVar = this.f8539f;
        if (aVar != null) {
            aVar.a(i2, i3);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener
    public final void onInfo(int i2, int i3, int i4) {
        if (i2 == 5) {
            this.f8541h = false;
        }
    }

    public b(SurfaceView surfaceView, a aVar, boolean z) {
        this.f8537d = aVar;
        aVar.a(surfaceView);
        this.f8537d.a((ILiveStream.ITextureFrameAvailableListener) this);
        this.f8537d.a((ILiveStream.ILiveStreamErrorListener) this);
        this.f8537d.a((ILiveStream.ILiveStreamInfoListener) this);
        IFilterManager b2 = this.f8537d.b();
        this.f8540g = b2;
        b2.enable(true);
        this.f8540g.setFaceDetectListener(this);
        this.f8540g.setEffectMsgListener(this);
        this.f8538e = new e(this.f8540g);
        if (z) {
            b();
        }
        c();
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener
    public final void onMessageReceived(int i2, int i3, int i4, String str) {
        c.a aVar;
        if (i2 == 2139095041 && (aVar = this.f8539f) != null) {
            aVar.a();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public final void onTextureFrameAvailable(EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr) {
        if (this.f8536c != null) {
            this.f8536c.a(eGLContext, i2, i3, i4, j2);
        }
    }
}
