package com.ss.avframework.mixer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.JavaI420Buffer;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvConverter;
import java.nio.ByteBuffer;

public class VideoMixer extends NativeMixer implements TextureBufferImpl.ToI420Interface {
    public static int TEXTURE_TYPE_2D = 1;
    public static int TEXTURE_TYPE_OES = 2;
    public static int TEXTURE_TYPE_UNKNOWN;
    public static int TEXTURE_TYPE_YUV = 3;
    private boolean mHaveNativeObj;
    private final long mWeakNativeThis;
    private YuvConverter mYuvConverter;

    private native void nativeAddVideoSink(VideoSink videoSink);

    private native void nativeCreate();

    private native void nativeRemoveVideoSink(VideoSink videoSink);

    private native void nativeSetIsGameMixer(boolean z);

    private native void nativeSetWPublishMode(boolean z);

    private native VideoMixerTexture nativeUploadI420ImageToTexture(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6);

    private native void nativeVideoMixerRelease(long j2);

    @Override // com.ss.avframework.mixer.Mixer
    public boolean isAudioMixer() {
        return false;
    }

    /* access modifiers changed from: protected */
    public native int nativeMixFrame(boolean z, int i2, VideoFrame videoFrame);

    /* access modifiers changed from: protected */
    public native int nativeMixFrameTex(boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, float[] fArr);

    public native void nativeReleaseTexture();

    public static class VideoMixerDescription {
        public float bottom;
        public long flags;
        public float left;
        public float right;
        public float top;
        public int zOrder;

        static {
            Covode.recordClassIndex(100516);
        }

        public float getBottom() {
            return this.bottom;
        }

        public long getFlags() {
            return this.flags;
        }

        public float getLeft() {
            return this.left;
        }

        public float getRight() {
            return this.right;
        }

        public float getTop() {
            return this.top;
        }

        public int getzOrder() {
            return this.zOrder;
        }

        public static VideoMixerDescription builder() {
            return new VideoMixerDescription();
        }

        public static VideoMixerDescription FILL() {
            return new VideoMixerDescription(0.0f, 0.0f, 1.0f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription LEFT_DOWN() {
            return new VideoMixerDescription(0.0f, 0.5f, 0.5f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription LEFT_HALF() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription LEFT_UP() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 0.5f, 1, 1);
        }

        public static VideoMixerDescription RIGHT_HALF() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription RIGHT_UP() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 0.5f, 1, 1);
        }

        public int getMode() {
            if ((this.flags & 1) != 0) {
                return 1;
            }
            return 2;
        }

        public boolean isEnableAlphaMode() {
            if ((this.flags & 16) == 0) {
                return true;
            }
            return false;
        }

        public boolean isVisible() {
            if ((this.flags & 8) == 0) {
                return true;
            }
            return false;
        }

        public VideoMixerDescription() {
            this.flags = 1;
            this.right = 1.0f;
            this.bottom = 1.0f;
            this.zOrder = 1;
        }

        public static VideoMixerDescription CENTER() {
            return new VideoMixerDescription(0.25f, 0.25f, 0.75f, 0.75f, 1, 1);
        }

        public static VideoMixerDescription RIGHT_DOWN() {
            return new VideoMixerDescription(0.5f, 0.5f, 1.0f, 1.0f, 1, 1);
        }

        public String toString() {
            return "VideoDescription(this:" + super.toString() + ",l:" + this.left + ",r:" + this.right + ",t:" + this.top + ",b:" + this.bottom + ",z:" + this.zOrder + ",f:" + this.flags + ")";
        }

        public VideoMixerDescription setBottom(float f2) {
            this.bottom = f2;
            return this;
        }

        public VideoMixerDescription setLeft(float f2) {
            this.left = f2;
            return this;
        }

        public VideoMixerDescription setRight(float f2) {
            this.right = f2;
            return this;
        }

        public VideoMixerDescription setTop(float f2) {
            this.top = f2;
            return this;
        }

        public VideoMixerDescription setzOrder(int i2) {
            this.zOrder = i2;
            return this;
        }

        public void copy(VideoMixerDescription videoMixerDescription) {
            this.left = videoMixerDescription.left;
            this.right = videoMixerDescription.right;
            this.top = videoMixerDescription.top;
            this.bottom = videoMixerDescription.bottom;
            this.zOrder = videoMixerDescription.zOrder;
            this.flags = videoMixerDescription.flags;
        }

        public boolean isMirror(boolean z) {
            long j2 = this.flags;
            if (z) {
                if ((j2 & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((j2 & 4) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public void setAutoFillOnFit(boolean z) {
            if (z) {
                this.flags |= 32;
            } else {
                this.flags &= -33;
            }
        }

        public VideoMixerDescription setEnableAlphaMode(boolean z) {
            if (z) {
                this.flags &= -17;
            } else {
                this.flags |= 16;
            }
            return this;
        }

        public VideoMixerDescription setMode(int i2) {
            if (i2 == 1) {
                this.flags |= 1;
            } else if (i2 == 2) {
                this.flags &= -2;
            }
            return this;
        }

        public VideoMixerDescription setVisibility(boolean z) {
            if (z) {
                this.flags &= -9;
            } else {
                this.flags |= 8;
            }
            return this;
        }

        public VideoMixerDescription setMirror(boolean z, boolean z2) {
            if (z) {
                if (z2) {
                    this.flags |= 2;
                } else {
                    this.flags &= -3;
                }
            } else if (z2) {
                this.flags |= 4;
            } else {
                this.flags &= -5;
            }
            return this;
        }

        public VideoMixerDescription(float f2, float f3, float f4, float f5, int i2, long j2) {
            this.flags = 1;
            this.left = f2;
            this.top = f3;
            this.right = f4;
            this.bottom = f5;
            this.zOrder = i2;
            this.flags = j2;
        }
    }

    public static class VideoMixerTexture {
        int height;
        int rotation;
        float[] texMatrix;
        int[] textures;
        int type;
        int width;

        static {
            Covode.recordClassIndex(100517);
        }

        public VideoMixerTexture() {
        }

        public int getHeight() {
            return this.height;
        }

        public int getRotation() {
            return this.rotation;
        }

        public float[] getTexMatrix() {
            return this.texMatrix;
        }

        public int[] getTextures() {
            return this.textures;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public VideoMixerTexture(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr) {
            this.textures = iArr;
            this.width = i2;
            this.height = i3;
            this.rotation = i4;
            this.type = i5;
            if (i4 != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                if (i4 % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
                    this.width = i3;
                    this.height = i2;
                }
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate((float) (-i4));
                matrix.preTranslate(-0.5f, -0.5f);
                if (fArr != null) {
                    matrix.preConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
                }
                this.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
                return;
            }
            this.texMatrix = fArr == null ? RendererCommon.identityMatrix() : fArr;
        }
    }

    private boolean isHaveNativeObj() {
        return this.mHaveNativeObj;
    }

    static {
        Covode.recordClassIndex(100513);
    }

    public int createTrack() {
        return super.nativeCreateTrack(VideoMixerDescription.builder());
    }

    public VideoMixer() {
        MethodCollector.i(13369);
        this.mHaveNativeObj = true;
        nativeCreate();
        this.mWeakNativeThis = this.mNativeObj;
        MethodCollector.o(13369);
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(13529);
        if (this.mHaveNativeObj) {
            super.release();
        } else if (this.mNativeObj != 0) {
            nativeVideoMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
        MethodCollector.o(13529);
    }

    public int createTrack(VideoMixerDescription videoMixerDescription) {
        return super.nativeCreateTrack(videoMixerDescription);
    }

    public VideoMixerDescription getDescription(int i2) {
        return (VideoMixerDescription) super.nativeGetDescription(i2);
    }

    public VideoMixer(long j2) {
        setNativeObj(j2);
        this.mWeakNativeThis = j2;
    }

    public void AddVideoSink(VideoSink videoSink) {
        MethodCollector.i(13593);
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
        MethodCollector.o(13593);
    }

    public void RemoveVideoSink(VideoSink videoSink) {
        MethodCollector.i(13671);
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
        MethodCollector.o(13671);
    }

    public void addVideoSink(VideoSink videoSink) {
        MethodCollector.i(13668);
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
        MethodCollector.o(13668);
    }

    public void removeVideoSink(VideoSink videoSink) {
        MethodCollector.i(13672);
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
        MethodCollector.o(13672);
    }

    public void setIsGameMixer(boolean z) {
        MethodCollector.i(13741);
        nativeSetIsGameMixer(z);
        MethodCollector.o(13741);
    }

    public void setWPublishMode(boolean z) {
        MethodCollector.i(13790);
        nativeSetWPublishMode(z);
        MethodCollector.o(13790);
    }

    @Override // com.ss.avframework.mixer.Mixer
    public boolean isEnable(int i2) {
        VideoMixerDescription description = getDescription(i2);
        if (description == null || (description.flags & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        if (this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        return this.mYuvConverter.convert(textureBuffer);
    }

    /* access modifiers changed from: protected */
    public VideoFrame.Buffer wrapperTextureBuffer(VideoMixerTexture videoMixerTexture) {
        Matrix matrix;
        if (videoMixerTexture.texMatrix != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoMixerTexture.texMatrix);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        return new TextureBufferImpl(videoMixerTexture.width, videoMixerTexture.height, VideoFrame.TextureBuffer.Type.RGB, videoMixerTexture.getTextures()[0], matrix, this, new Runnable() {
            /* class com.ss.avframework.mixer.VideoMixer.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100514);
            }

            public void run() {
                MethodCollector.i(11885);
                VideoMixer.this.nativeReleaseTexture();
                MethodCollector.o(11885);
            }
        });
    }

    /* access modifiers changed from: protected */
    public VideoMixerTexture getVideoMixerTexture(VideoFrame videoFrame) {
        int i2;
        MethodCollector.i(13446);
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        VideoMixerTexture videoMixerTexture = new VideoMixerTexture();
        if (buffer instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                i2 = TEXTURE_TYPE_OES;
            } else {
                i2 = TEXTURE_TYPE_2D;
            }
            videoMixerTexture.type = i2;
            videoMixerTexture.width = buffer.getWidth();
            videoMixerTexture.height = buffer.getHeight();
            videoMixerTexture.rotation = videoFrame.getRotation();
            videoMixerTexture.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
            videoMixerTexture.textures = new int[1];
            videoMixerTexture.textures[0] = textureBuffer.getTextureId();
            MethodCollector.o(13446);
            return videoMixerTexture;
        } else if (buffer instanceof JavaI420Buffer) {
            JavaI420Buffer javaI420Buffer = (JavaI420Buffer) buffer;
            VideoMixerTexture nativeUploadI420ImageToTexture = nativeUploadI420ImageToTexture(this.mWeakNativeThis, javaI420Buffer.getWidth(), javaI420Buffer.getHeight(), javaI420Buffer.getDataY(), javaI420Buffer.getStrideY(), javaI420Buffer.getDataU(), javaI420Buffer.getStrideU(), javaI420Buffer.getDataV(), javaI420Buffer.getStrideV());
            if (nativeUploadI420ImageToTexture != null) {
                nativeUploadI420ImageToTexture.texMatrix = RendererCommon.multiplyMatrices(nativeUploadI420ImageToTexture.texMatrix, RendererCommon.verticalFlipMatrix());
            }
            MethodCollector.o(13446);
            return nativeUploadI420ImageToTexture;
        } else {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("No implement.");
            MethodCollector.o(13446);
            throw androidRuntimeException;
        }
    }

    public void updateDescription(int i2, VideoMixerDescription videoMixerDescription) {
        super.nativeUpdateDescription(i2, videoMixerDescription);
    }

    public int mixFrame(int i2, VideoFrame videoFrame) {
        MethodCollector.i(13740);
        int nativeMixFrame = nativeMixFrame(this.mHaveNativeObj, i2, videoFrame);
        MethodCollector.o(13740);
        return nativeMixFrame;
    }

    @Override // com.ss.avframework.mixer.Mixer
    public void setEnable(int i2, boolean z) {
        VideoMixerDescription description = getDescription(i2);
        if (description != null) {
            if (z) {
                description.flags &= -9;
            } else {
                description.flags |= 8;
            }
            updateDescription(i2, description);
        }
    }

    public int mixFrame(int i2, VideoMixerTexture videoMixerTexture) {
        MethodCollector.i(13674);
        if (videoMixerTexture.rotation != 0) {
            videoMixerTexture = new VideoMixerTexture(videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
        }
        int nativeMixFrameTex = nativeMixFrameTex(this.mHaveNativeObj, i2, videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
        MethodCollector.o(13674);
        return nativeMixFrameTex;
    }

    /* access modifiers changed from: protected */
    public VideoFrame wrapperTextureBuffer(int i2, int i3, int i4, int i5, int i6, long j2) {
        return wrapperTextureBuffer(i2, i3, i4, i5, i6, null, j2);
    }

    /* access modifiers changed from: protected */
    public VideoFrame wrapperTextureBuffer(int i2, int i3, int i4, int i5, int i6, float[] fArr, long j2) {
        Matrix matrix;
        if (fArr != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        return new VideoFrame(new TextureBufferImpl(i2, i3, VideoFrame.TextureBuffer.Type.RGB, i6, matrix, this, new Runnable() {
            /* class com.ss.avframework.mixer.VideoMixer.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100515);
            }

            public void run() {
                MethodCollector.i(11881);
                VideoMixer.this.nativeReleaseTexture();
                MethodCollector.o(11881);
            }
        }), i4, j2);
    }
}
