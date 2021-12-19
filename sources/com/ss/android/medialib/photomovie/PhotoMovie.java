package com.ss.android.medialib.photomovie;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.c;
import com.ss.android.medialib.d;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;

public final class PhotoMovie implements d {
    private static final String TAG = PhotoMovie.class.getSimpleName();
    private static a mPhotoMovieListener;
    protected static volatile PhotoMovie mSingleton = null;
    private c mAVCEncoderMark;

    public interface ProgressCallback {
        static {
            Covode.recordClassIndex(36922);
        }

        void onProgress(int i2);
    }

    public interface a {
        static {
            Covode.recordClassIndex(36923);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String[] f59752a;

        /* renamed from: b  reason: collision with root package name */
        public String f59753b;

        /* renamed from: c  reason: collision with root package name */
        public String f59754c;

        /* renamed from: d  reason: collision with root package name */
        public String[] f59755d;

        /* renamed from: e  reason: collision with root package name */
        public String[] f59756e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f59757f;

        /* renamed from: g  reason: collision with root package name */
        public int f59758g;

        /* renamed from: h  reason: collision with root package name */
        public String f59759h;

        /* renamed from: i  reason: collision with root package name */
        public String f59760i;

        /* renamed from: j  reason: collision with root package name */
        public float f59761j;

        /* renamed from: k  reason: collision with root package name */
        public final a f59762k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressCallback f59763l;

        static {
            Covode.recordClassIndex(36924);
        }
    }

    private static native int nativeSynthetise(String[] strArr, String str, String str2, String[] strArr2, String[] strArr3, int[] iArr, int i2, String str3, String str4, float f2, int i3, int i4, int i5, ProgressCallback progressCallback);

    private native void onWriteFile(byte[] bArr, int i2, int i3, int i4, int i5);

    private native int setCodecConfig(byte[] bArr, int i2);

    private native int setColorFormat(int i2);

    private native int setHardEncoderMarkStatus(boolean z);

    private static native void setMarkParams(String[] strArr, String str, boolean z, int i2, int i3, int i4, int i5, int i6, int i7);

    private native void swapGlBuffer();

    public final void onInitMarkHardEncoderRet(int i2) {
    }

    public final void onMarkEncoderData(ByteBuffer byteBuffer, int i2, boolean z) {
    }

    public final void onMarkEncoderData(byte[] bArr, int i2, boolean z) {
    }

    public PhotoMovie() {
        mSingleton = this;
    }

    public static void onNativeCallback_UninitMarkHardEncoder() {
        if (mSingleton != null) {
            mSingleton.onUninitMarkHardEncoder();
        }
    }

    @Override // com.ss.android.medialib.d
    public final void onMarkSwapGlBuffers() {
        MethodCollector.i(5153);
        swapGlBuffer();
        MethodCollector.o(5153);
    }

    static {
        Covode.recordClassIndex(36921);
        com.ss.android.ttve.nativePort.d.c();
    }

    public static PhotoMovie getInstance() {
        MethodCollector.i(4894);
        synchronized (PhotoMovie.class) {
            try {
                if (mSingleton == null) {
                    synchronized (PhotoMovie.class) {
                        try {
                            if (mSingleton == null) {
                                mSingleton = new PhotoMovie();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.o(4894);
            }
        }
        PhotoMovie photoMovie = mSingleton;
        MethodCollector.o(4894);
        return photoMovie;
    }

    public final void onUninitMarkHardEncoder() {
        MethodCollector.i(5131);
        an.a(TAG, "onUninitMarkHardEncoder == enter");
        c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            synchronized (cVar) {
                try {
                    if (cVar.f59710i != 0 && cVar.f59707f != null) {
                        if (cVar.f59710i == 2) {
                            try {
                                cVar.f59707f.stop();
                            } catch (Exception unused) {
                                an.d(c.f59702a, "MediaCodec Exception");
                            }
                        }
                        try {
                            cVar.f59707f.release();
                        } catch (Exception unused2) {
                        }
                        cVar.f59707f = null;
                        if (cVar.f59708g != null) {
                            cVar.f59708g.release();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5131);
                    throw th;
                }
            }
            this.mAVCEncoderMark = null;
            an.a(TAG, "====== uninitAVCEncoder ======");
        }
        an.a(TAG, "onUninitMarkHardEncoder == exit");
        MethodCollector.o(5131);
    }

    public static void setPhotoMovieListener(a aVar) {
        mPhotoMovieListener = aVar;
    }

    public static PhotoMoviePlayer createPlayer(Context context) {
        return new PhotoMoviePlayer(context);
    }

    public static int calulateDuration(b bVar) {
        if (bVar.f59752a.length == 0) {
            return 0;
        }
        return (bVar.f59752a.length * 2500) - 500;
    }

    public static void onNativeCallback_InitMarkHardEncoderRet(int i2) {
        if (mSingleton != null) {
            mSingleton.onInitMarkHardEncoderRet(i2);
        }
    }

    @Override // com.ss.android.medialib.d
    public final void onMarkSetCodecConfig(byte[] bArr) {
        MethodCollector.i(5157);
        setCodecConfig(bArr, bArr.length);
        MethodCollector.o(5157);
    }

    @Override // com.ss.android.medialib.d
    public final void setColorFormatMark(int i2) {
        MethodCollector.i(5033);
        setColorFormat(i2);
        MethodCollector.o(5033);
    }

    public final int synthetise(b bVar) {
        MethodCollector.i(4900);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            int nativeSynthetise = nativeSynthetise(bVar.f59752a, bVar.f59753b, bVar.f59754c, bVar.f59755d, bVar.f59756e, bVar.f59757f, bVar.f59758g, bVar.f59759h, bVar.f59760i, bVar.f59761j, bVar.f59762k.f59766a, bVar.f59762k.f59767b, bVar.f59762k.f59768c, bVar.f59763l);
            MethodCollector.o(4900);
            return nativeSynthetise;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Don't synthetise photomovie in main thread");
        MethodCollector.o(4900);
        throw illegalStateException;
    }

    @Override // com.ss.android.medialib.d
    public final void onMarkWriteFile(byte[] bArr, int i2, int i3, int i4) {
        MethodCollector.i(5144);
        onWriteFile(bArr, bArr.length, i2, i3, i4);
        an.b(TAG, "onEncoderData: ...");
        MethodCollector.o(5144);
    }

    public static int onNativeCallback_MarkencodeTexture(int i2, int i3, int i4, int i5, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onMarkEncodeData(i2, i3, i4, i5, z);
        }
        return 0;
    }

    public final Surface onInitMarkHardEncoder(int i2, int i3, int i4, int i5, boolean z) {
        return onInitMarkHardEncoder(i2, i3, i4, 1, 1, i5, z);
    }

    public final int onMarkEncodeData(int i2, int i3, int i4, int i5, boolean z) {
        c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            return cVar.a(i2, i3, i4, i5, z);
        }
        return 0;
    }

    public final int onMarkEncoderData(int i2, int i3, int i4, int i5, boolean z) {
        c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            return cVar.a(i2, i3, i4, i5, z);
        }
        return 0;
    }

    public static Surface onNativeCallback_InitMarkHardEncoder(int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onInitMarkHardEncoder(i2, i3, i4, i5, i6, z);
        }
        return null;
    }

    public final Surface onInitMarkHardEncoder(int i2, int i3, int i4, int i5, int i6, boolean z) {
        MethodCollector.i(4998);
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new c();
        }
        c.f59703b = this;
        Surface a2 = this.mAVCEncoderMark.a(i2, i3, i4, z);
        if (a2 == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            MethodCollector.o(4998);
            return null;
        }
        an.a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        MethodCollector.o(4998);
        return a2;
    }

    public final Surface onInitMarkHardEncoder(int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        MethodCollector.i(5122);
        String str = TAG;
        an.a(str, "onInitMarkHardEncoder == enter");
        an.a(str, "width = " + i2 + "\theight = " + i3);
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new c();
        }
        c.f59703b = this;
        Surface a2 = this.mAVCEncoderMark.a(i2, i3, i4, z);
        if (a2 == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            MethodCollector.o(5122);
            return null;
        }
        an.a(str, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        an.a(str, "onInitMarkHardEncoder == exit");
        MethodCollector.o(5122);
        return a2;
    }

    public static void onNativeCallback_MarkParam(float f2, int i2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (mSingleton != null) {
            mSingleton.onMarkParam(f2, i2, f3, f4, f5, f6, f7, f8);
        }
    }

    public final void onMarkParam(float f2, int i2, float f3, float f4, float f5, float f6, float f7, float f8) {
        c cVar = this.mAVCEncoderMark;
        if (cVar != null) {
            cVar.f59712k = f2;
            cVar.f59713l = i2;
            cVar.f59714m = f3;
            cVar.n = f4;
            cVar.o = f5;
            cVar.p = f6;
            cVar.q = f7;
            cVar.r = f8;
            if (cVar.f59709h != null) {
                cVar.f59709h.b(cVar.f59712k);
                cVar.f59709h.a(cVar.f59714m, cVar.n, cVar.o, cVar.p);
            }
        }
    }

    public final void setMarkParam(String[] strArr, String str, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.i(4989);
        setMarkParams(strArr, str, z, i2, i3, i4, i5, i6, i7);
        MethodCollector.o(4989);
    }
}
