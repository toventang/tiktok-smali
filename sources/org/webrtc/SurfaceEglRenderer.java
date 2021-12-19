package org.webrtc;

import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock = new Object();
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    static {
        Covode.recordClassIndex(106662);
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        MethodCollector.i(11526);
        synchronized (this.layoutLock) {
            try {
                this.isRenderingPaused = false;
            } catch (Throwable th) {
                MethodCollector.o(11526);
                throw th;
            }
        }
        super.disableFpsReduction();
        MethodCollector.o(11526);
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        MethodCollector.i(11527);
        synchronized (this.layoutLock) {
            try {
                this.isRenderingPaused = true;
            } catch (Throwable th) {
                MethodCollector.o(11527);
                throw th;
            }
        }
        super.pauseVideo();
        MethodCollector.o(11527);
    }

    @Override // org.webrtc.EglRenderer
    public void release() {
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(SurfaceEglRenderer$$Lambda$1.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    private void logD(String str) {
        Logging.i("SurfaceEglRenderer", this.name + ": " + str);
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f2) {
        boolean z;
        MethodCollector.i(11363);
        synchronized (this.layoutLock) {
            if (f2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            try {
                this.isRenderingPaused = z;
            } catch (Throwable th) {
                MethodCollector.o(11363);
                throw th;
            }
        }
        super.setFpsReduction(f2);
        MethodCollector.o(11363);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(SurfaceEglRenderer$$Lambda$0.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        MethodCollector.i(11529);
        synchronized (this.layoutLock) {
            try {
                if (!this.isRenderingPaused) {
                    if (!this.isFirstFrameRendered) {
                        this.isFirstFrameRendered = true;
                        logD("Reporting first rendered frame.");
                        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                        if (rendererEvents2 != null) {
                            rendererEvents2.onFirstFrameRendered();
                        }
                    }
                    if (!(this.rotatedFrameWidth == videoFrame.getRotatedWidth() && this.rotatedFrameHeight == videoFrame.getRotatedHeight() && this.frameRotation == videoFrame.getRotation())) {
                        logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                        RendererCommon.RendererEvents rendererEvents3 = this.rendererEvents;
                        if (rendererEvents3 != null) {
                            rendererEvents3.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                        }
                        this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                        this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                        this.frameRotation = videoFrame.getRotation();
                    }
                    MethodCollector.o(11529);
                }
            } finally {
                MethodCollector.o(11529);
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        MethodCollector.i(11362);
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            try {
                this.rendererEvents = rendererEvents2;
                this.isFirstFrameRendered = false;
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                this.frameRotation = 0;
            } catch (Throwable th) {
                MethodCollector.o(11362);
                throw th;
            }
        }
        super.init(context, iArr, glDrawer);
        MethodCollector.o(11362);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i2 + " size: " + i3 + "x" + i4);
    }
}
