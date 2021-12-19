package com.ss.avframework.livestreamv2.core.interact;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.livestreamv2.IInputVideoStream;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.core.ILayerControl;
import com.ss.avframework.livestreamv2.core.ILayerControlExt;
import com.ss.avframework.livestreamv2.core.InteractEngine;
import com.ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSink;
import com.ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class InteractVideoSink implements TextureBufferImpl.ToI420Interface, VideoSink {
    private boolean fixRemoteYuvProjection = true;
    private boolean isRenderAble = true;
    long lastTime;
    public final InteractEngineBuilder mBuilder;
    private GlRenderDrawer mGlDrawer;
    private boolean mGlFinishAfterDrawYuv = true;
    protected int mHeight;
    private String mInteractId;
    private IInputVideoStream mOutVideoStream;
    private float[] mProj;
    private VideoDumpProxy.RawVideoDumperProxy mRawVideoDumper;
    private boolean mRelease;
    public ILayerControl.ILayer mRenderLayer;
    public RenderView mRenderSink;
    private GlTextureFrameBuffer mTextureFrameBuffer;
    private VideoDumpProxy.RawVideoDumperProxy mTextureVideoDumper;
    private boolean mUseRenderview = true;
    public View mView;
    protected int mWidth;
    private ByteBuffer mYuvBuffer;
    private int[] mYuvTex = {0, 0, 0};
    int repeatTimes;
    boolean reset;
    private boolean sinkValid;

    static {
        Covode.recordClassIndex(100225);
    }

    private void dump2DTextureFrame(int i2, int i3, int i4, int i5, float[] fArr, String str) {
    }

    private void dumpYuvFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, String str) {
    }

    static final /* synthetic */ void lambda$onTextureVideoFrameInternal$2$InteractVideoSink() {
    }

    private void releaseRawVideoDumper() {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public String getInteractId() {
        return this.mInteractId;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public ILayerControl.ILayer getRenderLayer() {
        return this.mRenderLayer;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public boolean isValid() {
        return this.sinkValid;
    }

    public IInputVideoStream getOutVideoStream() {
        createOutVideoStream();
        return this.mOutVideoStream;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public SurfaceView getSurfaceView() {
        View view = this.mView;
        if (view != null && (view instanceof SurfaceView)) {
            return (SurfaceView) view;
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public int getTextureID() {
        GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            return glTextureFrameBuffer.getTextureId();
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public TextureView getTextureView() {
        View view = this.mView;
        if (view != null && (view instanceof TextureView)) {
            return (TextureView) view;
        }
        return null;
    }

    public final /* synthetic */ void lambda$release$0$InteractVideoSink() {
        AVLog.ioi("InteractVideoSink", "Release Yuv texture on InteractVideoSink.");
        releaseTextureOnGlThread();
    }

    public void releaseOutVideoStream() {
        IInputVideoStream iInputVideoStream = this.mOutVideoStream;
        if (iInputVideoStream != null) {
            iInputVideoStream.stop();
            this.mOutVideoStream.release();
            this.mOutVideoStream = null;
        }
    }

    private void releaseTextureOnGlThread() {
        releaseYuvTexturesOnGlThread();
        GlRenderDrawer glRenderDrawer = this.mGlDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mGlDrawer = null;
        }
        GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mTextureFrameBuffer = null;
        }
    }

    private void releaseYuvTexturesOnGlThread() {
        int[] iArr = this.mYuvTex;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.mYuvTex;
                if (i2 < iArr2.length) {
                    iArr2[i2] = 0;
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void createOutVideoStream() {
        LiveCore liveCore;
        if (this.mOutVideoStream == null && (liveCore = this.mBuilder.getLiveCore()) != null) {
            IInputVideoStream createInputVideoStream = liveCore.createInputVideoStream();
            this.mOutVideoStream = createInputVideoStream;
            if (createInputVideoStream != null) {
                createInputVideoStream.start();
            }
        }
    }

    public void release() {
        AVLog.ioi("InteractVideoSink", "begin release [" + this + "]");
        this.mRelease = true;
        this.sinkValid = false;
        if (!(this.mGlDrawer == null && this.mTextureFrameBuffer == null)) {
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new InteractVideoSink$$Lambda$0(this));
        }
        RenderView renderView = this.mRenderSink;
        if (renderView != null) {
            renderView.release();
            this.mRenderSink = null;
        }
        releaseOutVideoStream();
        ILayerControl.ILayer iLayer = this.mRenderLayer;
        if (iLayer != null) {
            iLayer.dispose();
            this.mRenderLayer = null;
        }
        releaseRawVideoDumper();
        AVLog.ioi("InteractVideoSink", "end release [" + this + "]");
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    private int align(int i2) {
        return (((i2 + 8) - 1) / 8) * 8;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void setFitMode(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.interact.InteractVideoSink.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100231);
            }

            public void run() {
                RenderView renderView = InteractVideoSink.this.mRenderSink;
                if (renderView != null) {
                    renderView.setFitMode(z);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void setRenderAble(boolean z) {
        AVLog.ioi("InteractVideoSink", "render old state:" + this.isRenderAble + ", new state:" + z);
        this.isRenderAble = z;
    }

    private void createTexture(int i2, int i3) {
        ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new InteractVideoSink$$Lambda$3(this, i2, i3));
    }

    public final /* synthetic */ void lambda$createTexture$4$InteractVideoSink(int i2, int i3) {
        if (!this.mRelease) {
            if (this.mGlDrawer == null) {
                this.mGlDrawer = new GlRenderDrawer();
            }
            GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
            if (glTextureFrameBuffer != null) {
                glTextureFrameBuffer.setSize(i2, i3);
            } else {
                GlTextureFrameBuffer glTextureFrameBuffer2 = new GlTextureFrameBuffer(6408);
                this.mTextureFrameBuffer = glTextureFrameBuffer2;
                glTextureFrameBuffer2.setSize(i2, i3);
            }
            int align = align(i2);
            int i4 = (align + 1) >> 1;
            int i5 = (i3 + 1) >> 1;
            releaseYuvTexturesOnGlThread();
            this.mYuvTex[0] = genTextureWithInit(33984, align, i3);
            this.mYuvTex[1] = genTextureWithInit(33985, i4, i5);
            this.mYuvTex[2] = genTextureWithInit(33986, i4, i5);
            this.mWidth = i2;
            this.mHeight = i3;
            this.mProj = null;
        }
    }

    private int genTextureWithInit(int i2, int i3, int i4) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i2);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, (float) GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10240, (float) GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i3, i4, 0, 6409, 5121, null);
        return iArr[0];
    }

    private /* synthetic */ void lambda$onTextureVideoFrameInternal$1(int i2, int i3, int i4, float[] fArr) {
        dump2DTextureFrame(i2, i3, i4, 15, fArr, "RtcOutputTexture_" + this.mInteractId);
    }

    private void updateTexSubImage(int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i2);
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i4, i5, 6409, 5121, byteBuffer);
    }

    private boolean loadYuvAndDraw(ByteBuffer byteBuffer, int i2, int i3, Config.VideoOutputFormat videoOutputFormat, int i4) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
            return atomicBoolean.get();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new InteractVideoSink$$Lambda$2(this, byteBuffer, i2, i3, videoOutputFormat, i4, atomicBoolean));
        return atomicBoolean.get();
    }

    InteractVideoSink(final String str, final boolean z, boolean z2, final boolean z3, InteractEngine interactEngine) {
        this.mInteractId = str;
        InteractEngineBuilder builder = interactEngine.getBuilder();
        this.mBuilder = builder;
        this.mUseRenderview = !z2 ? !builder.isRenderOffInFMMode() : z2;
        try {
            this.fixRemoteYuvProjection = builder.getLiveCore().getBuilder().getPushBase().isFixRemoteYuvProjection;
            this.mGlFinishAfterDrawYuv = builder.getLiveCore().getBuilder().getPushBase().interactVideoSinkUseGlFinish;
        } catch (Exception unused) {
        }
        if (this.mBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
            createOutVideoStream();
        }
        if (this.mUseRenderview) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mBuilder.getWorkThreadHandler(), new Runnable() {
                /* class com.ss.avframework.livestreamv2.core.interact.InteractVideoSink.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100230);
                }

                public void run() {
                    ILayerControl layerControl;
                    MethodCollector.i(13383);
                    if (!z3) {
                        Context context = InteractVideoSink.this.mBuilder.getLiveCoreBuilder().getContext();
                        if (context == null) {
                            AVLog.iow("InteractVideoSink", "Maybe livecore is being released.");
                            MethodCollector.o(13383);
                        } else if (z) {
                            InteractVideoSink.this.mView = new TextureView(context);
                            MethodCollector.o(13383);
                        } else {
                            InteractVideoSink.this.mView = new SurfaceView(context);
                            MethodCollector.o(13383);
                        }
                    } else {
                        LiveCore liveCore = InteractVideoSink.this.mBuilder.getLiveCore();
                        if (!(liveCore == null || (layerControl = liveCore.getLayerControl()) == null)) {
                            InteractVideoSink interactVideoSink = InteractVideoSink.this;
                            interactVideoSink.mRenderLayer = layerControl.createLayer(str, null, interactVideoSink.mBuilder.getLiveCoreBuilder().getVideoCaptureWidth(), InteractVideoSink.this.mBuilder.getLiveCoreBuilder().getVideoCaptureHeight());
                        }
                        MethodCollector.o(13383);
                    }
                }
            });
        }
        if (this.mView != null) {
            this.mRenderSink = new RenderView(this.mView, true);
        }
        this.sinkValid = true;
        AVLog.ioi("InteractVideoSink", "new interactvideosink[useRenderView:" + this.mUseRenderview + "]: uid " + str + ", view " + this.mView + ", renderSink " + this.mRenderSink);
    }

    public final /* synthetic */ void lambda$loadYuvAndDraw$3$InteractVideoSink(ByteBuffer byteBuffer, int i2, int i3, Config.VideoOutputFormat videoOutputFormat, int i4, AtomicBoolean atomicBoolean) {
        ByteBuffer slice;
        ByteBuffer slice2;
        ByteBuffer slice3;
        if (!this.mRelease) {
            int i5 = i2 * i3;
            int i6 = (i5 * 3) / 2;
            if (byteBuffer.capacity() >= i6 && videoOutputFormat == Config.VideoOutputFormat.PIXEL_FORMAT_I420) {
                int align = align(i2);
                if (align != i2 || !byteBuffer.isDirect()) {
                    int i7 = align * i3;
                    int i8 = (i7 * 3) / 2;
                    ByteBuffer byteBuffer2 = this.mYuvBuffer;
                    if (byteBuffer2 == null || byteBuffer2.capacity() < i8) {
                        this.mYuvBuffer = ByteBuffer.allocateDirect(i8);
                    }
                    byteBuffer.position(0);
                    this.mYuvBuffer.position(0);
                    this.mYuvBuffer.limit(i7);
                    slice = this.mYuvBuffer.slice();
                    if (align == i2) {
                        byteBuffer.limit(i5);
                        slice.put(byteBuffer);
                    } else {
                        for (int i9 = 0; i9 < i3; i9++) {
                            byteBuffer.limit(byteBuffer.position() + i2);
                            slice.put(byteBuffer);
                            if (this.fixRemoteYuvProjection) {
                                slice.position((slice.position() + align) - i2);
                            } else {
                                byteBuffer.position(byteBuffer.limit() - (align - i2));
                                slice.put(byteBuffer);
                            }
                        }
                    }
                    slice.position(0);
                    this.mYuvBuffer.position(i7);
                    int i10 = (i7 * 5) / 4;
                    this.mYuvBuffer.limit(i10);
                    slice2 = this.mYuvBuffer.slice();
                    if (align == i2) {
                        byteBuffer.limit((i5 * 5) / 4);
                        slice2.put(byteBuffer);
                    } else {
                        for (int i11 = 0; i11 < i3 / 2; i11++) {
                            byteBuffer.limit(byteBuffer.position() + (i2 / 2));
                            slice2.put(byteBuffer);
                            if (this.fixRemoteYuvProjection) {
                                slice2.position(slice2.position() + ((align - i2) / 2));
                            } else {
                                byteBuffer.position(byteBuffer.limit() - ((align - i2) / 2));
                                slice2.put(byteBuffer);
                            }
                        }
                    }
                    slice2.position(0);
                    this.mYuvBuffer.position(i10);
                    this.mYuvBuffer.limit(i8);
                    slice3 = this.mYuvBuffer.slice();
                    if (align == i2) {
                        byteBuffer.limit(i6);
                        slice3.put(byteBuffer);
                    } else {
                        for (int i12 = 0; i12 < i3 / 2; i12++) {
                            byteBuffer.limit(byteBuffer.position() + (i2 / 2));
                            slice3.put(byteBuffer);
                            if (this.fixRemoteYuvProjection) {
                                slice3.position(slice3.position() + ((align - i2) / 2));
                            } else {
                                byteBuffer.position(byteBuffer.limit() - ((align - i2) / 2));
                                slice3.put(byteBuffer);
                            }
                        }
                    }
                    slice3.position(0);
                } else {
                    byteBuffer.position(0);
                    byteBuffer.limit(i5);
                    slice = byteBuffer.slice();
                    byteBuffer.position(i5);
                    int i13 = (i5 * 5) / 4;
                    byteBuffer.limit(i13);
                    slice2 = byteBuffer.slice();
                    byteBuffer.position(i13);
                    byteBuffer.limit(i6);
                    slice3 = byteBuffer.slice();
                }
                updateI420Image(this.mYuvTex, align, i3, slice, slice2, slice3, null);
                this.mTextureFrameBuffer.setSize(i2, i3);
                GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
                if (this.mProj == null) {
                    float[] identityMatrix = RendererCommon.identityMatrix();
                    this.mProj = identityMatrix;
                    if (align != i2 && this.fixRemoteYuvProjection) {
                        Matrix.orthoM(identityMatrix, 0, -1.0f, ((((((float) i2) * 1.0f) - 0.45f) / ((float) align)) * 2.0f) - 1.0f, -1.0f, 1.0f, 1.0f, -1.0f);
                    }
                }
                this.mGlDrawer.drawYuv(this.mYuvTex, this.mProj, RendererCommon.identityMatrix(), 0, 0, i2, i3, i4);
                if (this.mGlFinishAfterDrawYuv) {
                    GLES20.glFinish();
                } else {
                    GLES20.glFlush();
                }
                GLES20.glBindFramebuffer(36160, 0);
                atomicBoolean.set(true);
            }
        }
    }

    private void drawYuvAndRender(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, int i5, long j2) {
        GlTextureFrameBuffer glTextureFrameBuffer;
        if (loadYuvAndDraw(byteBuffer, i3, i4, videoOutputFormat, i2) && (glTextureFrameBuffer = this.mTextureFrameBuffer) != null) {
            onTextureVideoFrameInternal(glTextureFrameBuffer.getTextureId(), Config.VideoOutputFormat.TEXTURE_2D, i3, i4, null, i5, j2);
        }
    }

    private void updateI420Image(int[] iArr, int i2, int i3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int[] iArr2) {
        int i4 = (i2 + 1) >> 1;
        int i5 = (i3 + 1) >> 1;
        updateTexSubImage(33984, iArr[0], i2, i3, byteBuffer);
        updateTexSubImage(33985, iArr[1], i4, i5, byteBuffer2);
        updateTexSubImage(33986, iArr[2], i4, i5, byteBuffer3);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public int consumeDualGameVideoFrame(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, int i5, long j2) {
        if (!(this.mGlDrawer != null && i3 == this.mWidth && i4 == this.mHeight)) {
            createTexture(i3, i4);
        }
        if (loadYuvAndDraw(byteBuffer, i3, i4, videoOutputFormat, i2)) {
            return this.mTextureFrameBuffer.getTextureId();
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void onByteBufferVideoFrame(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, int i5, long j2) {
        AVLog.logToIODevice2(4, "InteractVideoSink", "onByteBufferVideoFrame from interact id " + this.mInteractId + ",width:" + i3 + ",height:" + i4 + ", enableRender:" + this.isRenderAble, null, "InteractVideoSink.onByteBufferVideoFrame", 10000);
        dumpYuvFrame(byteBuffer, i3, i4, 15, "RtcOutput_" + this.mInteractId);
        if (!(this.mGlDrawer != null && i3 == this.mWidth && i4 == this.mHeight)) {
            createTexture(i3, i4);
        }
        drawYuvAndRender(byteBuffer, videoOutputFormat, i2, i3, i4, i5, j2);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void onTextureVideoFrame(int i2, Config.VideoOutputFormat videoOutputFormat, int i3, int i4, float[] fArr, int i5, long j2) {
        AVLog.logToIODevice2(4, "InteractVideoSink", "onTextureVideoFrame from interact id " + this.mInteractId + ",width:" + i3 + ",height:" + i4 + ", enableRender:" + this.isRenderAble, null, "InteractVideoSink.onTextureVideoFrame", 10000);
        onTextureVideoFrameInternal(i2, videoOutputFormat, i3, i4, fArr, i5, j2);
    }

    private void onTextureVideoFrameInternal(int i2, Config.VideoOutputFormat videoOutputFormat, int i3, int i4, float[] fArr, int i5, long j2) {
        boolean z;
        android.graphics.Matrix convertMatrixToAndroidGraphicsMatrix;
        android.graphics.Matrix convertMatrixToAndroidGraphicsMatrix2;
        if (this.reset) {
            this.repeatTimes = 0;
            this.reset = false;
        }
        this.repeatTimes++;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastTime >= 30000) {
            this.lastTime = currentTimeMillis;
            this.reset = true;
            z = true;
        } else {
            z = false;
        }
        RenderView renderView = this.mRenderSink;
        ILayerControlExt.ILayerExt iLayerExt = (ILayerControlExt.ILayerExt) this.mRenderLayer;
        if (this.isRenderAble) {
            if (fArr == null) {
                convertMatrixToAndroidGraphicsMatrix = new android.graphics.Matrix();
            } else {
                convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
            }
            convertMatrixToAndroidGraphicsMatrix.preTranslate(0.0f, 0.5f);
            convertMatrixToAndroidGraphicsMatrix.preScale(1.0f, -1.0f);
            convertMatrixToAndroidGraphicsMatrix.preTranslate(0.0f, -0.5f);
            if (z) {
                AVLog.ioi("InteractVideoSink", "[repeat " + this.repeatTimes + " times] renderSink.onFrame: uid " + this.mInteractId + ", view " + this.mView + ", renderSink " + renderView + ", width " + i3 + ", height " + i4);
            }
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i3, i4, VideoFrame.TextureBuffer.Type.RGB, i2, convertMatrixToAndroidGraphicsMatrix, this, InteractVideoSink$$Lambda$1.$instance);
            textureBufferImpl.updateCaptureMs(TimeUtils.currentTimeMs());
            VideoFrame videoFrame = new VideoFrame(textureBufferImpl, i5, 1000000 * j2);
            if (renderView != null) {
                renderView.onFrame(videoFrame);
            } else if (iLayerExt != null) {
                iLayerExt.renderFrame(videoFrame);
            }
            IInputVideoStream iInputVideoStream = this.mOutVideoStream;
            if (iInputVideoStream != null && this.mBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
                if (z) {
                    AVLog.ioi("InteractVideoSink", "[repeat " + this.repeatTimes + " times] outVideoStream.pushVideoFrame: uid " + this.mInteractId + ", width " + i3 + ", height " + i4);
                }
                if (fArr == null) {
                    convertMatrixToAndroidGraphicsMatrix2 = new android.graphics.Matrix();
                } else {
                    convertMatrixToAndroidGraphicsMatrix2 = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
                }
                convertMatrixToAndroidGraphicsMatrix2.preTranslate(0.5f, 0.5f);
                convertMatrixToAndroidGraphicsMatrix2.preRotate((float) (i5 + LiveFeedRefreshTimeSetting.DEFAULT));
                convertMatrixToAndroidGraphicsMatrix2.preScale(-1.0f, 1.0f);
                convertMatrixToAndroidGraphicsMatrix2.preTranslate(-0.5f, -0.5f);
                iInputVideoStream.pushVideoFrame(i2, false, i3, i4, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix2), j2 * 1000);
            }
        } else if (z) {
            AVLog.iow("InteractVideoSink", "[repeat " + this.repeatTimes + " times] onTextureVideoFrameInternal isRenderAble is false");
        }
    }
}
