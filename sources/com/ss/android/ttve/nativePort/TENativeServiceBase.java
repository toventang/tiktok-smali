package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.common.b;
import com.ss.android.ttve.nativePort.NativeCallbacks;

public class TENativeServiceBase {
    protected NativeCallbacks.a mAudioExtendToFileCallback;
    protected NativeCallbacks.c mEncoderDataCallback;
    protected NativeCallbacks.b mExtractFrameProcessCallback;
    protected NativeCallbacks.d mGetImageCallback;
    protected NativeCallbacks.e mKeyFrameCallback;
    protected NativeCallbacks.f mMVInitedCallback;
    protected NativeCallbacks.g mMattingCallback;
    protected b mOnErrorListener;
    protected b mOnInfoListener;
    protected NativeCallbacks.h mOpenGLCallback;
    protected NativeCallbacks.d mSeekFrameCallback;

    static {
        Covode.recordClassIndex(37728);
    }

    public void nativeCallback_onAudioExtendToFileCancel() {
    }

    public void nativeCallback_onAudioExtendToFileFinish(boolean z) {
    }

    public void nativeCallback_onAudioExtendToFileProcess(float f2) {
    }

    public void nativeCallback_onOpenGLDrawBefore(int i2, double d2) {
    }

    public void nativeCallback_onPreviewSurface(int i2) {
    }

    public NativeCallbacks.c getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public b getErrorListener() {
        return this.mOnErrorListener;
    }

    public b getInfoListener() {
        return this.mOnInfoListener;
    }

    public NativeCallbacks.h getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onMVInited() {
        NativeCallbacks.f fVar = this.mMVInitedCallback;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void nativeCallback_onMattingStartedCallback() {
        NativeCallbacks.g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.b();
        }
    }

    public void setAudioExtendToFileCallback(NativeCallbacks.a aVar) {
        this.mAudioExtendToFileCallback = aVar;
    }

    public void setEncoderDataListener(NativeCallbacks.c cVar) {
        this.mEncoderDataCallback = cVar;
    }

    public void setErrorListener(b bVar) {
        this.mOnErrorListener = bVar;
    }

    public void setExtractFrameProcessCallback(NativeCallbacks.b bVar) {
        this.mExtractFrameProcessCallback = bVar;
    }

    public void setGetImageCallback(NativeCallbacks.d dVar) {
        this.mGetImageCallback = dVar;
    }

    public void setGetSeekFrameCallback(NativeCallbacks.d dVar) {
        this.mGetImageCallback = dVar;
    }

    public void setInfoListener(b bVar) {
        this.mOnInfoListener = bVar;
    }

    public void setKeyFrameCallback(NativeCallbacks.e eVar) {
        this.mKeyFrameCallback = eVar;
    }

    public void setMattingCallback(NativeCallbacks.g gVar) {
        this.mMattingCallback = gVar;
    }

    public void setOpenGLListeners(NativeCallbacks.h hVar) {
        this.mOpenGLCallback = hVar;
    }

    public void setSeekFrameCallback(NativeCallbacks.d dVar) {
        this.mSeekFrameCallback = dVar;
    }

    public void setmMVInitedCallback(NativeCallbacks.f fVar) {
        this.mMVInitedCallback = fVar;
    }

    public void nativeCallback_onExtractFrameProcess(float f2) {
        NativeCallbacks.b bVar = this.mExtractFrameProcessCallback;
        if (bVar != null) {
            bVar.a(f2);
        }
    }

    public void nativeCallback_onMattingDoneCallback(float f2) {
        NativeCallbacks.g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.c();
        }
    }

    public void nativeCallback_onOpenGLCreate(int i2) {
        NativeCallbacks.h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.a(i2);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i2) {
        NativeCallbacks.h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.b(i2);
        }
    }

    public void nativeCallback_onOpenGLDrawAfter(int i2, double d2) {
        NativeCallbacks.h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.a(i2, d2);
        }
    }

    public void nativeCallback_onDisplayCallback(int i2, int i3, int i4) {
        NativeCallbacks.e eVar = this.mKeyFrameCallback;
        if (eVar != null) {
            eVar.a(i2, i3, i4);
        }
    }

    public void nativeCallback_onMattingErrorCallback(int i2, int i3, float f2) {
        NativeCallbacks.g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void nativeCallback_onProcessCallback(int i2, int i3, String str) {
        NativeCallbacks.e eVar = this.mKeyFrameCallback;
        if (eVar != null) {
            eVar.a(i2, i3, str);
        }
    }

    public void nativeCallback_onInfoListener(int i2, int i3, float f2) {
        b bVar = this.mOnInfoListener;
        if (bVar != null) {
            bVar.a(i2, i3, f2, null);
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, int i2, int i3, boolean z) {
        NativeCallbacks.c cVar = this.mEncoderDataCallback;
        if (cVar != null) {
            cVar.a(bArr, i2, i3, z);
        }
    }

    public void nativeCallback_onErrorListener(int i2, int i3, float f2, String str) {
        b bVar = this.mOnErrorListener;
        if (bVar != null) {
            bVar.a(i2, i3, f2, str);
        }
    }

    public void nativeCallback_onMattingProgressCallback(int i2, float f2, float f3, boolean z) {
        NativeCallbacks.g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.d();
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i2, int i3, int i4, float f2) {
        NativeCallbacks.d dVar = this.mGetImageCallback;
        if (dVar != null) {
            return dVar.a(bArr, i3, i4);
        }
        return 0;
    }

    public int nativeCallback_onSeekFrameData(byte[] bArr, int i2, int i3, int i4, float f2) {
        NativeCallbacks.d dVar = this.mSeekFrameCallback;
        if (dVar != null) {
            return dVar.a(bArr, i3, i4);
        }
        return 0;
    }
}
