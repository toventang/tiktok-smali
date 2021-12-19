package com.ss.avframework.livestreamv2.core;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.effect.EffectWrapper;
import com.ss.avframework.livestreamv2.CanvasRenderView;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.core.DirectVideoMixer;
import com.ss.avframework.livestreamv2.core.IGameEngineExt;
import com.ss.avframework.livestreamv2.core.ILayerControl;
import com.ss.avframework.livestreamv2.core.ILayerControlExt;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class LayerControl implements View.OnTouchListener, ILayerControlExt {
    private static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    private final String TAG = "LayerControl";
    private LayerEventListener mLayerEventListener;
    private List<ILayerControlExt.ILayerExt> mLayers;
    private String mOriginName;
    private RenderView mRenderView;
    private SurfaceHolder mSurfaceHolder;
    public DirectVideoMixer mVideoMixer;

    public interface LayerEventListener {
        static {
            Covode.recordClassIndex(100082);
        }

        void onHide();

        void onShow();

        boolean onTouch(View view, MotionEvent motionEvent);
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer[] getLayers() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public class GameLayer extends Layer {
        private EffectWrapper.AlgorithmResult mAlgorithmResult;
        public CountDownLatch mFrameFence = new CountDownLatch(1);
        private GlRenderDrawer mGlDrawer;
        private int mRandStreamId = LayerControl.getStreamId();
        private boolean mRelease = false;
        private TextureBufferImpl mTextureBuffer;
        private GlTextureFrameBuffer mTextureFrameBuffer;
        private IGameEngineExt.GameVideoSink mVideoSink;
        private int[] mYuvTex = {0, 0, 0};

        static {
            Covode.recordClassIndex(100075);
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public void dispose() {
        }

        public int getRtcId() {
            return this.mRandStreamId;
        }

        /* access modifiers changed from: private */
        /* renamed from: releaseTextureOnGlThread */
        public void lambda$release$2$LayerControl$GameLayer() {
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
            this.mRelease = true;
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

        @Override // com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public void release() {
            super.dispose();
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new LayerControl$GameLayer$$Lambda$2(this));
            EffectWrapper.AlgorithmResult algorithmResult = this.mAlgorithmResult;
            if (algorithmResult != null) {
                algorithmResult.release();
                this.mAlgorithmResult = null;
            }
        }

        public void setVideoFrameCallback(IGameEngineExt.GameVideoSink gameVideoSink) {
            this.mVideoSink = gameVideoSink;
        }

        private ByteBuffer toDirectBuffer(ByteBuffer byteBuffer) {
            if (byteBuffer == null || byteBuffer.isDirect()) {
                return byteBuffer;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.put(byteBuffer);
            return allocateDirect;
        }

        private void createTexture(int i2, int i3) {
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new LayerControl$GameLayer$$Lambda$1(this, i2, i3));
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$createTexture$1$LayerControl$GameLayer(int i2, int i3) {
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
                int i4 = (i2 + 1) >> 1;
                int i5 = (i3 + 1) >> 1;
                releaseYuvTexturesOnGlThread();
                this.mYuvTex[0] = genTextureWithInit(33984, i2, i3);
                this.mYuvTex[1] = genTextureWithInit(33985, i4, i5);
                this.mYuvTex[2] = genTextureWithInit(33986, i4, i5);
                this.mWidth = i2;
                this.mHeight = i3;
            }
        }

        private boolean loadYuvAndDraw(ByteBuffer byteBuffer, int i2, int i3) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
                return atomicBoolean.get();
            }
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new LayerControl$GameLayer$$Lambda$0(this, byteBuffer, i2, i3, atomicBoolean));
            return atomicBoolean.get();
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

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$loadYuvAndDraw$0$LayerControl$GameLayer(ByteBuffer byteBuffer, int i2, int i3, AtomicBoolean atomicBoolean) {
            if (!this.mRelease) {
                int i4 = i2 * i3;
                if (byteBuffer.capacity() >= (i4 * 3) / 2) {
                    int i5 = i4 / 4;
                    byteBuffer.position(0);
                    byteBuffer.limit(i4);
                    ByteBuffer slice = byteBuffer.slice();
                    byteBuffer.position(i4);
                    int i6 = i4 + i5;
                    byteBuffer.limit(i6);
                    ByteBuffer slice2 = byteBuffer.slice();
                    byteBuffer.position(i6);
                    byteBuffer.limit(i6 + i5);
                    updateI420Image(this.mYuvTex, i2, i3, slice, slice2, byteBuffer.slice(), null);
                    this.mTextureFrameBuffer.setSize(i2, i3);
                    GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
                    this.mGlDrawer.drawYuv(this.mYuvTex, RendererCommon.identityMatrix(), RendererCommon.identityMatrix(), 0, 0, i2, i3, 0);
                    GLES20.glFinish();
                    GLES20.glBindFramebuffer(36160, 0);
                    atomicBoolean.set(true);
                }
            }
        }

        public void onByteBufferVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
            onByteBufferVideoFrame(byteBuffer, i2, i3, i4, j2, null);
        }

        private void updateTexSubImage(int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, i3);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i4, i5, 6409, 5121, byteBuffer);
        }

        public GameLayer(String str, int i2, int i3, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i2, i3, videoMixerDescription);
        }

        public void onTextureVideoFrame(int i2, int i3, int i4, float[] fArr, int i5, long j2) {
            onTextureVideoFrame(i2, i3, i4, fArr, i5, j2, null);
        }

        private void drawYuvAndRender(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, ByteBuffer byteBuffer2) {
            GlTextureFrameBuffer glTextureFrameBuffer;
            if (loadYuvAndDraw(byteBuffer, i2, i3) && (glTextureFrameBuffer = this.mTextureFrameBuffer) != null) {
                onTextureVideoFrame(glTextureFrameBuffer.getTextureId(), i2, i3, null, i4, j2, byteBuffer2);
            }
        }

        public void onByteBufferVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, ByteBuffer byteBuffer2) {
            if (!(this.mGlDrawer != null && i2 == this.mWidth && i3 == this.mHeight)) {
                createTexture(i2, i3);
            }
            drawYuvAndRender(toDirectBuffer(byteBuffer), i2, i3, i4, j2, toDirectBuffer(byteBuffer2));
        }

        private void updateI420Image(int[] iArr, int i2, int i3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int[] iArr2) {
            int i4 = (i2 + 1) >> 1;
            int i5 = (i3 + 1) >> 1;
            updateTexSubImage(33984, iArr[0], i2, i3, byteBuffer);
            updateTexSubImage(33985, iArr[1], i4, i5, byteBuffer2);
            updateTexSubImage(33986, iArr[2], i4, i5, byteBuffer3);
        }

        public void onTextureVideoFrame(int i2, int i3, int i4, float[] fArr, int i5, long j2, ByteBuffer byteBuffer) {
            VideoFrame videoFrame;
            renderFrame(new VideoMixer.VideoMixerTexture(i3, i4, LiveFeedRefreshTimeSetting.DEFAULT, VideoMixer.TEXTURE_TYPE_2D, new int[]{i2, 0, 0}, null));
            if (this.mVideoSink != null && !this.mRelease) {
                TextureBufferImpl textureBufferImpl = this.mTextureBuffer;
                if (textureBufferImpl == null || textureBufferImpl.getTextureId() != i2) {
                    this.mTextureBuffer = new TextureBufferImpl(i3, i4, VideoFrame.TextureBuffer.Type.RGB, i2, new Matrix(), new TextureBufferImpl.ToI420Interface() {
                        /* class com.ss.avframework.livestreamv2.core.LayerControl.GameLayer.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(100079);
                        }

                        @Override // com.ss.avframework.buffer.TextureBufferImpl.ToI420Interface
                        public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
                            return null;
                        }
                    }, new Runnable() {
                        /* class com.ss.avframework.livestreamv2.core.LayerControl.GameLayer.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(100080);
                        }

                        public void run() {
                            GameLayer.this.mFrameFence.countDown();
                        }
                    });
                    videoFrame = new VideoFrame(this.mTextureBuffer, 0, j2 * 1000 * 1000);
                } else {
                    this.mTextureBuffer.retain();
                    this.mFrameFence = new CountDownLatch(1);
                    videoFrame = new VideoFrame(this.mTextureBuffer, 0, j2 * 1000 * 1000);
                }
                if (byteBuffer != null) {
                    EffectWrapper.AlgorithmResult parseParcel = EffectWrapper.AlgorithmResult.parseParcel(i3, i4, toDirectBuffer(byteBuffer), this.mAlgorithmResult);
                    this.mTextureBuffer.updateExtraData(parseParcel);
                    if (parseParcel != null) {
                        this.mAlgorithmResult = parseParcel;
                    }
                }
                this.mVideoSink.onVideoFrame(this.mRandStreamId, videoFrame, 2);
                videoFrame.release();
                try {
                    this.mFrameFence.await();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class Layer implements ILayerControlExt.ILayerExt {
        private int mAnimationMode;
        private FrameAnimationBase mCurrentAnimation;
        private boolean mFirstFrame = true;
        protected int mHeight;
        protected String mName;
        private FrameAnimationBase mNextAnimation;
        protected boolean mPause;
        protected int mTrackId;
        protected VideoMixer.VideoMixerDescription mVideoMixerDescription;
        protected int mWidth;

        static {
            Covode.recordClassIndex(100081);
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public int getRealFps() {
            return 0;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public Canvas lockCanvas() {
            return null;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void pause() {
            this.mPause = true;
        }

        public void release() {
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void resume() {
            this.mPause = false;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void unlockCanvasAndPost(Canvas canvas, long j2) {
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public int getHeight() {
            return this.mHeight;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public VideoMixer.VideoMixerDescription getLayerDescription() {
            return this.mVideoMixerDescription;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public int getWidth() {
            return this.mWidth;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public String name() {
            return this.mName;
        }

        /* access modifiers changed from: protected */
        public void createMixerTrack() {
            if (LayerControl.this.mVideoMixer != null) {
                this.mTrackId = LayerControl.this.mVideoMixer.createTrack();
                this.mVideoMixerDescription = LayerControl.this.mVideoMixer.getDescription(this.mTrackId);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void dispose() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.removeTrack(this.mTrackId);
                LayerControl.this.removeLayer(this);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public int getMixerOutHeight() {
            if (LayerControl.this.mVideoMixer != null) {
                return LayerControl.this.mVideoMixer.getHeight();
            }
            return -1;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public int getMixerOutWidth() {
            if (LayerControl.this.mVideoMixer != null) {
                return LayerControl.this.mVideoMixer.getWidth();
            }
            return -1;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public boolean isEnable() {
            if (LayerControl.this.mVideoMixer == null || !LayerControl.this.mVideoMixer.isEnable(this.mTrackId)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void setVisibility(int i2) {
            throw new AndroidRuntimeException("Support later version");
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void setEnable(boolean z) {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.setEnable(this.mTrackId, z);
            }
        }

        private void animationUpdateOnPerFrame(VideoFrame videoFrame) {
            if (this.mNextAnimation != null) {
                FrameAnimationBase frameAnimationBase = this.mCurrentAnimation;
                if (frameAnimationBase != null) {
                    frameAnimationBase.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            FrameAnimationBase frameAnimationBase2 = this.mCurrentAnimation;
            if (frameAnimationBase2 == null) {
                return;
            }
            if (frameAnimationBase2.valid()) {
                this.mCurrentAnimation.update(videoFrame);
                return;
            }
            this.mCurrentAnimation.restore();
            this.mCurrentAnimation = null;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoFrame videoFrame) {
            animationUpdateOnPerFrame(videoFrame);
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (this.mFirstFrame) {
                updateFrameInfo(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                this.mFirstFrame = false;
            }
            if (!this.mPause && directVideoMixer != null) {
                directVideoMixer.onFrame(this.mTrackId, videoFrame);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            VideoMixer.VideoMixerDescription videoMixerDescription2;
            MethodCollector.i(14089);
            if (!(videoMixerDescription == null || (videoMixerDescription2 = this.mVideoMixerDescription) == null)) {
                videoMixerDescription2.copy(videoMixerDescription);
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (directVideoMixer != null) {
                    synchronized (directVideoMixer) {
                        try {
                            directVideoMixer.updateDescription(this.mTrackId, this.mVideoMixerDescription);
                        } finally {
                            MethodCollector.o(14089);
                        }
                    }
                    return;
                }
            }
            MethodCollector.o(14089);
        }

        private void animationUpdateOnPerFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            if (this.mNextAnimation != null) {
                FrameAnimationBase frameAnimationBase = this.mCurrentAnimation;
                if (frameAnimationBase != null) {
                    frameAnimationBase.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            FrameAnimationBase frameAnimationBase2 = this.mCurrentAnimation;
            if (frameAnimationBase2 == null) {
                return;
            }
            if (frameAnimationBase2.valid()) {
                this.mCurrentAnimation.update(videoMixerTexture);
                return;
            }
            this.mCurrentAnimation.restore();
            this.mCurrentAnimation = null;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            animationUpdateOnPerFrame(videoMixerTexture);
            if (this.mFirstFrame) {
                updateFrameInfo(videoMixerTexture.getWidth(), videoMixerTexture.getHeight());
                this.mFirstFrame = false;
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (!this.mPause && directVideoMixer != null) {
                directVideoMixer.onFrame(this.mTrackId, videoMixerTexture);
            }
        }

        private void updateFrameInfo(int i2, int i3) {
            this.mWidth = i2;
            this.mHeight = i3;
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void setAnimationMode(int i2, long j2, RectF rectF) {
            this.mNextAnimation = FrameAnimationFactory.create(i2, this, j2, rectF, 30);
            this.mAnimationMode = i2;
        }

        public Layer(String str, int i2, int i3, VideoMixer.VideoMixerDescription videoMixerDescription) {
            this.mName = str;
            this.mWidth = i2;
            this.mHeight = i3;
            createMixerTrack();
            updateDescription(videoMixerDescription);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public RenderView getRenderView() {
        return this.mRenderView;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public VideoMixer getVideoMixer() {
        return this.mVideoMixer;
    }

    public static int getStreamId() {
        return mAtomicInteger.incrementAndGet();
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer getLocalOriginLayer() {
        return findLayer(this.mOriginName);
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public int layerSize() {
        return this.mLayers.size();
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public void pause() {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            layerEventListener.onHide();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public void resume() {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            layerEventListener.onShow();
        }
    }

    /* access modifiers changed from: package-private */
    public class DirectLayer extends Layer {
        static {
            Covode.recordClassIndex(100074);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public void createMixerTrack() {
            this.mTrackId = -1;
            this.mVideoMixerDescription = VideoMixer.VideoMixerDescription.FILL();
            setEnable(false);
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public void dispose() {
            if (LayerControl.this.mVideoMixer != null) {
                LayerControl.this.mVideoMixer.enableDirectRender(false);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public boolean isEnable() {
            if (this.mVideoMixerDescription == null || (this.mVideoMixerDescription.flags & 8) != 0) {
                return false;
            }
            return true;
        }

        @Override // com.ss.avframework.livestreamv2.core.LayerControl.Layer, com.ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            throw new AndroidRuntimeException("later support");
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            if (videoMixerDescription != null) {
                this.mVideoMixerDescription.copy(videoMixerDescription);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.LayerControl.Layer, com.ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoFrame videoFrame) {
            if (isEnable()) {
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (!this.mPause && directVideoMixer != null) {
                    directVideoMixer.onDirectFrame(videoFrame);
                }
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.ss.avframework.livestreamv2.core.LayerControl.Layer
        public void setEnable(boolean z) {
            if (this.mVideoMixerDescription != null) {
                if (z) {
                    this.mVideoMixerDescription.flags &= -9;
                } else {
                    this.mVideoMixerDescription.flags |= 8;
                }
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.enableDirectRender(z);
            }
        }

        public DirectLayer(String str, int i2, int i3, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i2, i3, videoMixerDescription);
        }
    }

    static {
        Covode.recordClassIndex(100072);
    }

    private void releaseSurface() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            this.mSurfaceHolder = null;
            renderView.release();
            this.mRenderView = null;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public float getRealRenderFps() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.getRealRatePerSeconds();
        }
        return 0.0f;
    }

    public boolean isDirectRenderMode() {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            return directVideoMixer.isDirectRenderMode();
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public boolean isFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        return false;
    }

    LayerControl() {
        AVLog.ioi("LayerControl", "Construct ".concat(String.valueOf(this)));
        this.mLayers = new ArrayList();
    }

    public void dump() {
        MethodCollector.i(10668);
        synchronized (this.mLayers) {
            try {
                for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                    AVLog.ioi("LayerControl", "Dump Layer(name:" + iLayerExt.name() + ",w:" + iLayerExt.getWidth() + ",h:" + iLayerExt.getHeight() + "," + iLayerExt.getLayerDescription().toString());
                }
            } finally {
                MethodCollector.o(10668);
            }
        }
    }

    public void release() {
        MethodCollector.i(10991);
        AVLog.ioi("LayerControl", "Release ".concat(String.valueOf(this)));
        dump();
        synchronized (this.mLayers) {
            try {
                Iterator<ILayerControlExt.ILayerExt> it = this.mLayers.iterator();
                while (it.hasNext()) {
                    ((Layer) it.next()).release();
                }
                this.mLayers.clear();
            } finally {
                MethodCollector.o(10991);
            }
        }
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
            this.mRenderView = null;
        }
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            synchronized (directVideoMixer) {
                try {
                    this.mVideoMixer.release();
                    this.mVideoMixer = null;
                } finally {
                    MethodCollector.o(10991);
                }
            }
            return;
        }
        MethodCollector.o(10991);
    }

    public void setEventListener(LayerEventListener layerEventListener) {
        this.mLayerEventListener = layerEventListener;
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public void setLocalOrigin(String str) {
        this.mOriginName = str;
    }

    private void removeLayer(String str) {
        removeLayer(findLayer(str));
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer getLayer(String str) {
        return findLayer(str);
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public void setFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public boolean isMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public void setOriginTriggering(String str) {
        ILayerControlExt.ILayerExt findLayer = findLayer(str);
        if (findLayer != null) {
            this.mVideoMixer.setOriginTrackIndex(((Layer) findLayer).mTrackId);
        }
    }

    private ILayerControlExt.ILayerExt findLayer(String str) {
        MethodCollector.i(10350);
        if (str == null) {
            MethodCollector.o(10350);
            return null;
        }
        synchronized (this.mLayers) {
            try {
                for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                    if (iLayerExt.name().equals(str)) {
                        return iLayerExt;
                    }
                }
                MethodCollector.o(10350);
                return null;
            } finally {
                MethodCollector.o(10350);
            }
        }
    }

    private void addLayer(ILayerControlExt.ILayerExt iLayerExt) {
        MethodCollector.i(10183);
        synchronized (this.mLayers) {
            try {
                AVLog.ioi("LayerControl", "Create Layer(name:" + iLayerExt.name() + ",w:" + iLayerExt.getWidth() + ",h:" + iLayerExt.getHeight() + ")");
                if (!this.mLayers.contains(iLayerExt)) {
                    this.mLayers.add(iLayerExt);
                } else {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                    MethodCollector.o(10183);
                    throw androidRuntimeException;
                }
            } finally {
                MethodCollector.o(10183);
            }
        }
    }

    public void removeLayer(ILayerControlExt.ILayerExt iLayerExt) {
        MethodCollector.i(10512);
        if (iLayerExt != null) {
            synchronized (this.mLayers) {
                try {
                    AVLog.ioi("LayerControl", "Remove Layer(name:" + iLayerExt.name() + ",w:" + iLayerExt.getWidth() + ",h:" + iLayerExt.getHeight() + ")");
                    this.mLayers.remove(iLayerExt);
                } finally {
                    MethodCollector.o(10512);
                }
            }
            return;
        }
        MethodCollector.o(10512);
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public void setMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            return layerEventListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public void setDisplay(View view, long j2) {
        RenderView canvasRenderView;
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer == null) {
            DirectVideoMixer directVideoMixer2 = new DirectVideoMixer();
            this.mVideoMixer = directVideoMixer2;
            directVideoMixer2.setEnable(false);
            directVideoMixer = this.mVideoMixer;
        }
        if (view == null) {
            directVideoMixer.updateView(null);
            releaseSurface();
            return;
        }
        if ((j2 & 1) != 0) {
            canvasRenderView = new DirectVideoMixer.SurfaceViewWithoutCallback(view, directVideoMixer);
        } else if ((j2 & 16) == 0 && (j2 & 32) == 0 && (j2 & 64) == 0 && (j2 & 128) == 0) {
            canvasRenderView = new DirectVideoMixer.MixerRenderView(view, directVideoMixer);
        } else if (view instanceof SurfaceView) {
            canvasRenderView = new CanvasRenderView((SurfaceView) view);
        } else {
            throw new AndroidRuntimeException("BUG!Can only support canvas render for SurfaceView");
        }
        if ((j2 & 2) == 0 && (j2 & 32) == 0) {
            canvasRenderView.setFitMode(false);
        } else {
            canvasRenderView.setFitMode(true);
        }
        if ((j2 & 4) == 0 && (j2 & 64) == 0) {
            canvasRenderView.setMirror(false, true);
        } else {
            canvasRenderView.setMirror(true, true);
        }
        if ((j2 & 8) == 0 && (j2 & 128) == 0) {
            canvasRenderView.setMirror(false, false);
        } else {
            canvasRenderView.setMirror(true, false);
        }
        if (view instanceof SurfaceView) {
            this.mSurfaceHolder = ((SurfaceView) view).getHolder();
        }
        directVideoMixer.updateView(canvasRenderView);
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
        }
        this.mRenderView = canvasRenderView;
        view.setOnTouchListener(this);
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer createLayer(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i2, int i3) {
        return createLayerExt(str, videoMixerDescription, i2, i3, 1);
    }

    /* access modifiers changed from: package-private */
    public class CanvasLayer extends Layer {
        static {
            Covode.recordClassIndex(100073);
        }

        public CanvasLayer(String str, int i2, int i3, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i2, i3, videoMixerDescription);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.ILayerControlExt
    public ILayerControlExt.ILayerExt createLayerExt(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i2, int i3, int i4) {
        ILayerControlExt.ILayerExt canvasLayer;
        if (findLayer(str) != null) {
            InvalidParameterException invalidParameterException = new InvalidParameterException("Layer name '" + str + "' already exist.");
            AVLog.ioe("LayerControl", invalidParameterException.getMessage(), invalidParameterException);
            return null;
        }
        if (i4 == 1) {
            canvasLayer = new CanvasLayer(str, i2, i3, videoMixerDescription);
        } else if (i4 == 3) {
            canvasLayer = new GameLayer(str, i2, i3, videoMixerDescription);
        } else if (i4 != 4) {
            canvasLayer = new Layer(str, i2, i3, videoMixerDescription);
        } else {
            canvasLayer = new DirectLayer(str, i2, i3, videoMixerDescription);
        }
        addLayer(canvasLayer);
        return canvasLayer;
    }
}
