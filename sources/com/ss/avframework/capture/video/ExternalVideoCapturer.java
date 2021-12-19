package com.ss.avframework.capture.video;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.JavaI420Buffer;
import com.ss.avframework.buffer.RoiInfo;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;

public class ExternalVideoCapturer extends VideoCapturer implements TextureBufferImpl.ToI420Interface {
    protected boolean mBufferAlreadyReturn = true;
    protected int mFps;
    public Handler mHandler;
    protected boolean mHorizontalMirror;
    public int mOutHeight;
    public int mOutWidth;
    public boolean mSigBufferMode;
    protected int mStatus;
    protected boolean mVerticalMirror;
    private VideoCapturer.VideoCapturerObserver mVideoCapturerObserver;
    public YuvConverter mYuvConverter;

    static {
        Covode.recordClassIndex(99719);
    }

    /* access modifiers changed from: protected */
    public void blockingWaitBufferReturn(String str) {
    }

    /* access modifiers changed from: protected */
    public boolean isSigBufferMode() {
        return this.mSigBufferMode;
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    /* access modifiers changed from: protected */
    public void returnTexture() {
        this.mBufferAlreadyReturn = true;
        if (this.mStatus != 1) {
            stop();
        }
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void stop() {
        this.mStatus = 2;
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mVideoCapturerObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCapturerStoped();
        }
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(14538);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99730);
            }

            public void run() {
                ExternalVideoCapturer.this.mStatus = 2;
                if (ExternalVideoCapturer.this.mYuvConverter != null) {
                    ExternalVideoCapturer.this.mYuvConverter.release();
                    ExternalVideoCapturer.this.mYuvConverter = null;
                }
            }
        });
        super.release();
        MethodCollector.o(14538);
    }

    public void enableSigalMode(boolean z) {
        this.mSigBufferMode = z;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(final VideoFrame.TextureBuffer textureBuffer) {
        if (this.mStatus != 1) {
            return GetBlackFrameBuffer(textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        final VideoFrame.I420Buffer[] i420BufferArr = {null};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99720);
            }

            public void run() {
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    i420BufferArr[0] = ExternalVideoCapturer.this.GetBlackFrameBuffer(textureBuffer.getWidth(), textureBuffer.getHeight());
                    return;
                }
                if (ExternalVideoCapturer.this.mYuvConverter == null) {
                    ExternalVideoCapturer.this.mYuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = ExternalVideoCapturer.this.mYuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public void enableMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
    }

    public ExternalVideoCapturer(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler) {
        this.mVideoCapturerObserver = videoCapturerObserver;
        this.mHandler = handler;
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void start(int i2, int i3, int i4) {
        this.mOutHeight = i3;
        this.mOutWidth = i2;
        this.mFps = i4;
        this.mStatus = 1;
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mVideoCapturerObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCapturerStarted();
        }
    }

    public int pushVideoFrame(final ByteBuffer byteBuffer, final int i2, final int i3, int i4, final long j2, final long j3) {
        final JavaI420Buffer[] javaI420BufferArr = {null};
        final int i5 = (i2 + 1) / 2;
        int i6 = (i2 * i3) + 0;
        int i7 = ((i3 + 1) / 2) * i5;
        int i8 = i6 + i7;
        byteBuffer.position(0);
        byteBuffer.limit(i6);
        final ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i6);
        byteBuffer.limit(i8);
        final ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i8);
        byteBuffer.limit(i8 + i7);
        final ByteBuffer slice3 = byteBuffer.slice();
        final int[] iArr = {0};
        blockingWaitBufferReturn("Push ByteBuffer");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99721);
            }

            public void run() {
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    String str = "mStatus " + ExternalVideoCapturer.this.mStatus;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str)), null, "ExternalVideoCapturer.java:pushVideoFrame5: ".concat(String.valueOf(str)), 10000);
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    if (byteBuffer.isDirect()) {
                        JavaI420Buffer[] javaI420BufferArr = javaI420BufferArr;
                        int i2 = i2;
                        int i3 = i3;
                        ByteBuffer byteBuffer = slice;
                        ByteBuffer byteBuffer2 = slice2;
                        int i4 = i5;
                        javaI420BufferArr[0] = JavaI420Buffer.wrap(i2, i3, byteBuffer, i2, byteBuffer2, i4, slice3, i4, j3, new Runnable() {
                            /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(99722);
                            }

                            public void run() {
                                ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                    /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass2.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(99723);
                                    }

                                    public void run() {
                                        ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                                    }
                                });
                            }
                        });
                    } else {
                        javaI420BufferArr[0] = JavaI420Buffer.allocate(i2, i3);
                        javaI420BufferArr[0].getDataY().put(slice);
                        javaI420BufferArr[0].getDataU().put(slice2);
                        javaI420BufferArr[0].getDataV().put(slice3);
                        javaI420BufferArr[0].updateCaptureMs(j3);
                    }
                    if (javaI420BufferArr[0] == null) {
                        AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: buffer is null", null, "ExternalVideoCapturer.java:pushVideoFrame7", 10000);
                        iArr[0] = -3;
                        return;
                    }
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr[0] = ExternalVideoCapturer.this.onFrame(javaI420BufferArr[0], i2, i3, 0, j2);
                    javaI420BufferArr[0].release();
                } else {
                    String str2 = "!mBufferAlreadyReturn " + (true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn) + ", mSigBufferMode " + ExternalVideoCapturer.this.mSigBufferMode;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str2)), null, "ExternalVideoCapturer.java:pushVideoFrame6: ".concat(String.valueOf(str2)), 10000);
                    iArr[0] = -2;
                }
            }
        });
        return -1;
    }

    public int pushVideoFrame(final int i2, final boolean z, final int i3, final int i4, final Matrix matrix, final long j2, final Bundle bundle, final long j3) {
        final int[] iArr = {0};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99724);
            }

            public void run() {
                VideoFrame.TextureBuffer.Type type;
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    String str = "mStatus " + ExternalVideoCapturer.this.mStatus;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str)), null, "ExternalVideoCapturer.java:pushVideoFrame1: ".concat(String.valueOf(str)), 10000);
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    RoiInfo roiInfo = null;
                    if (bundle != null) {
                        roiInfo = new RoiInfo(((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_center_pos_x")).intValue(), ((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_center_pos_y")).intValue(), ((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_width")).intValue(), ((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_height")).intValue(), ((Float) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_yaw")).floatValue(), ((Float) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_pitch")).floatValue(), ((Float) com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_roll")).floatValue());
                    }
                    if (z) {
                        type = VideoFrame.TextureBuffer.Type.OES;
                    } else {
                        type = VideoFrame.TextureBuffer.Type.RGB;
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i3, i4, type, i2, matrix, this, new Runnable() {
                        /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99725);
                        }

                        public void run() {
                            ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass3.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(99726);
                                }

                                public void run() {
                                    ExternalVideoCapturer.this.returnTexture();
                                }
                            });
                        }
                    });
                    textureBufferImpl.updateCaptureMs(j3);
                    textureBufferImpl.setROIInfo(roiInfo);
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i3, i4, 0, j2);
                    textureBufferImpl.release();
                } else {
                    String str2 = "!mBufferAlreadyReturn " + (true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn) + ", mSigBufferMode " + ExternalVideoCapturer.this.mSigBufferMode;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str2)), null, "ExternalVideoCapturer.java:pushVideoFrame2: ".concat(String.valueOf(str2)), 10000);
                    iArr[0] = -2;
                }
            }

            public static Object com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }
        });
        return iArr[0];
    }

    public int pushVideoFrame(final int i2, final boolean z, final int i3, final int i4, final int i5, final float[] fArr, final long j2, final Bundle bundle, final long j3) {
        final int[] iArr = {0};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99727);
            }

            public void run() {
                Matrix matrix;
                int i2;
                float f2;
                VideoFrame.TextureBuffer.Type type;
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    String str = "mStatus " + ExternalVideoCapturer.this.mStatus;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str)), null, "ExternalVideoCapturer.java:pushVideoFrame3: ".concat(String.valueOf(str)), 10000);
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    float[] fArr = fArr;
                    RoiInfo roiInfo = null;
                    if (fArr != null) {
                        matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
                    } else {
                        matrix = null;
                    }
                    int i3 = i5;
                    Matrix matrix2 = new Matrix();
                    matrix2.reset();
                    int i4 = i3;
                    int i5 = i4;
                    if (i3 % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
                        i2 = i5;
                    } else {
                        i2 = i4;
                        i4 = i5;
                    }
                    matrix2.preTranslate(0.5f, 0.5f);
                    matrix2.preRotate((float) (-i3));
                    float f3 = -1.0f;
                    if (ExternalVideoCapturer.this.mHorizontalMirror) {
                        f2 = -1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (!ExternalVideoCapturer.this.mVerticalMirror) {
                        f3 = 1.0f;
                    }
                    matrix2.preScale(f2, f3);
                    matrix2.preTranslate(-0.5f, -0.5f);
                    if (matrix != null) {
                        matrix2.preConcat(matrix);
                    }
                    if (bundle != null) {
                        roiInfo = new RoiInfo(((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_center_pos_x")).intValue(), ((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_center_pos_y")).intValue(), ((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_width")).intValue(), ((Integer) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_height")).intValue(), ((Float) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_yaw")).floatValue(), ((Float) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_pitch")).floatValue(), ((Float) com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "roi_roll")).floatValue());
                    }
                    if (z) {
                        type = VideoFrame.TextureBuffer.Type.OES;
                    } else {
                        type = VideoFrame.TextureBuffer.Type.RGB;
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i2, i4, type, i2, matrix2, this, new Runnable() {
                        /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass4.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(99728);
                        }

                        public void run() {
                            ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                /* class com.ss.avframework.capture.video.ExternalVideoCapturer.AnonymousClass4.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(99729);
                                }

                                public void run() {
                                    ExternalVideoCapturer.this.returnTexture();
                                }
                            });
                        }
                    });
                    textureBufferImpl.setROIInfo(roiInfo);
                    textureBufferImpl.updateCaptureMs(j3);
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i2, i4, 0, j2);
                    textureBufferImpl.release();
                } else {
                    String str2 = "!mBufferAlreadyReturn " + (true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn) + ", mSigBufferMode " + ExternalVideoCapturer.this.mSigBufferMode;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str2)), null, "ExternalVideoCapturer.java:pushVideoFrame4: ".concat(String.valueOf(str2)), 10000);
                    iArr[0] = -2;
                }
            }

            public static Object com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }
        });
        return iArr[0];
    }
}
