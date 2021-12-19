package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

public class NativeCallbacks {

    public interface IAudioCaptureCallback {
        static {
            Covode.recordClassIndex(37697);
        }

        void onReceive(ByteBuffer byteBuffer);
    }

    public interface ICameraFrameCallback {
        static {
            Covode.recordClassIndex(37698);
        }

        void onResult(ByteBuffer byteBuffer, int i2, int i3, long j2);
    }

    public interface IFrameEffectCallback {
        static {
            Covode.recordClassIndex(37699);
        }

        void onResult(long j2);
    }

    public interface IGetFrameCallback {
        static {
            Covode.recordClassIndex(37700);
        }

        void onResult(int[] iArr, int i2, int i3, long j2);
    }

    public interface ILensCallback {
        static {
            Covode.recordClassIndex(37701);
        }

        void onError(int i2, int i3, String str);

        void onInfo(int i2, int i3, int i4, String str);

        void onSuccess(int i2, float f2, int i3);
    }

    public interface OnARTextBitmapCallback {
        static {
            Covode.recordClassIndex(37702);
        }

        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    public interface OnARTextContentCallback {
        static {
            Covode.recordClassIndex(37703);
        }

        void onResult(String[] strArr);
    }

    public interface a {
        static {
            Covode.recordClassIndex(37704);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(37705);
        }

        void a(float f2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(37706);
        }

        int a(byte[] bArr, int i2, int i3, boolean z);
    }

    public interface d {
        static {
            Covode.recordClassIndex(37707);
        }

        int a(byte[] bArr, int i2, int i3);
    }

    public interface e {
        static {
            Covode.recordClassIndex(37708);
        }

        void a(int i2, int i3, int i4);

        void a(int i2, int i3, String str);
    }

    public interface f {
        static {
            Covode.recordClassIndex(37709);
        }

        void a();
    }

    public interface g {
        static {
            Covode.recordClassIndex(37710);
        }

        int a();

        int b();

        int c();

        int d();
    }

    public interface h {
        static {
            Covode.recordClassIndex(37711);
        }

        int a(int i2);

        int a(int i2, double d2);

        int b(int i2);
    }

    static {
        Covode.recordClassIndex(37696);
    }
}
