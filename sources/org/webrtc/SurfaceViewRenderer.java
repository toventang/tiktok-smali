package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, RendererCommon.RendererEvents, VideoSink {
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private float radius;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();

    static {
        Covode.recordClassIndex(106676);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
        if (rendererEvents2 != null) {
            rendererEvents2.onFirstFrameRendered();
        }
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) getWidth()) / ((float) getHeight());
        int i2 = this.rotatedFrameWidth;
        int i3 = this.rotatedFrameHeight;
        if (((float) i2) / ((float) i3) > width) {
            i2 = (int) (((float) i3) * width);
        } else {
            i3 = (int) (((float) i2) / width);
        }
        int min = Math.min(getWidth(), i2);
        int min2 = Math.min(getHeight(), i3);
        logD("updateSurfaceSize. Layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (min != this.surfaceWidth || min2 != this.surfaceHeight) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            getHolder().setFixedSize(min, min2);
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setFpsReduction(float f2) {
        this.eglRenderer.setFpsReduction(f2);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setRadius(float f2) {
        this.radius = Math.max(0.0f, f2);
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    private void logD(String str) {
        Logging.i("SurfaceViewRenderer", this.resourceName + ": " + str);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
        this.eglRenderer.setRenderModel(scalingType);
    }

    public void draw(Canvas canvas) {
        if (this.radius > 0.0f) {
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            float f2 = this.radius;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CCW);
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        MethodCollector.i(12576);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName2);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
        MethodCollector.o(12576);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f2) {
        this.eglRenderer.addFrameListener(frameListener, f2);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onFrameResolutionChanged$0$SurfaceViewRenderer(int i2, int i3) {
        this.rotatedFrameWidth = i2;
        this.rotatedFrameHeight = i3;
        updateSurfaceSize();
        requestLayout();
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i2, i3, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD("onMeasure(). New size: " + measure.x + "x" + measure.y);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12815);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName2);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
        MethodCollector.o(12815);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f2, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f2, glDrawer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        postOrRun(new org.webrtc.SurfaceViewRenderer$$Lambda$0(r2, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r5 != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r5 == 180) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r4;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrameResolutionChanged(int r3, int r4, int r5) {
        /*
            r2 = this;
            org.webrtc.RendererCommon$RendererEvents r0 = r2.rendererEvents
            if (r0 == 0) goto L_0x0007
            r0.onFrameResolutionChanged(r3, r4, r5)
        L_0x0007:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L_0x000d
            if (r5 != r0) goto L_0x001c
        L_0x000d:
            r1 = r3
            if (r5 == 0) goto L_0x0012
        L_0x0010:
            if (r5 != r0) goto L_0x0013
        L_0x0012:
            r3 = r4
        L_0x0013:
            org.webrtc.SurfaceViewRenderer$$Lambda$0 r0 = new org.webrtc.SurfaceViewRenderer$$Lambda$0
            r0.<init>(r2, r1, r3)
            r2.postOrRun(r0)
            return
        L_0x001c:
            r1 = r4
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceViewRenderer.onFrameResolutionChanged(int, int, int):void");
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio(((float) (i4 - i2)) / ((float) (i5 - i3)));
        updateSurfaceSize();
    }
}
