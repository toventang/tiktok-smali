package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class VEListener {

    public interface VEEditorEffectListener {
        static {
            Covode.recordClassIndex(99145);
        }
    }

    public interface VEInfoStickerBufferListener {
        static {
            Covode.recordClassIndex(99146);
        }

        Bitmap onGetBuffer(int i2);
    }

    public interface a {
        static {
            Covode.recordClassIndex(99147);
        }

        void a(String str, int i2, byte[] bArr);
    }

    public interface aa {
        static {
            Covode.recordClassIndex(99148);
        }

        void a();
    }

    public interface ab {
        static {
            Covode.recordClassIndex(99149);
        }

        int a();

        int b();

        int c();

        int d();
    }

    public interface ac {
        static {
            Covode.recordClassIndex(99150);
        }

        void a(String str, JSONObject jSONObject);
    }

    public interface ad {
        static {
            Covode.recordClassIndex(99151);
        }

        VESize a();
    }

    public interface ae {
        static {
            Covode.recordClassIndex(99152);
        }
    }

    public interface af {
        static {
            Covode.recordClassIndex(99153);
        }
    }

    public interface ag {
        static {
            Covode.recordClassIndex(99154);
        }
    }

    public interface ah extends ai {
        static {
            Covode.recordClassIndex(99155);
        }

        void a(int i2, int i3, String str);

        void a(int i2, String str);
    }

    public interface ai {
        static {
            Covode.recordClassIndex(99156);
        }

        void a(int i2);

        void a(boolean z);
    }

    public interface aj {
        static {
            Covode.recordClassIndex(99157);
        }
    }

    public interface ak {
        static {
            Covode.recordClassIndex(99158);
        }

        String a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(99159);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(99160);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(99161);
        }

        void a(String str, JSONObject jSONObject, String str2);
    }

    public interface e {
        static {
            Covode.recordClassIndex(99162);
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(99163);
        }
    }

    public interface g {
        static {
            Covode.recordClassIndex(99164);
        }
    }

    public interface h {
        static {
            Covode.recordClassIndex(99165);
        }
    }

    public interface i {
        static {
            Covode.recordClassIndex(99166);
        }

        void a(float f2);
    }

    public interface j {
        static {
            Covode.recordClassIndex(99167);
        }

        void a(int i2);
    }

    public interface k extends l {
        static {
            Covode.recordClassIndex(99168);
        }

        void a(int i2, int i3, String str);

        void a(int i2, String str);
    }

    public interface l {
        static {
            Covode.recordClassIndex(99169);
        }

        void a();

        void a(int i2);
    }

    public interface m {
        static {
            Covode.recordClassIndex(99170);
        }

        void a(int i2, int i3, float f2, int i4, int i5, int i6, int i7, int i8, float f3, int i9, int i10, double d2);
    }

    public interface n {
        static {
            Covode.recordClassIndex(99171);
        }

        void a(int i2, int i3, float f2, float f3, int i4, int i5, int i6, int i7, int i8, float f4, int i9, int i10, double d2);
    }

    public interface o {
        static {
            Covode.recordClassIndex(99172);
        }

        void a(int i2, String str, String str2);
    }

    public interface p {
        static {
            Covode.recordClassIndex(99173);
        }

        void a();

        void b();
    }

    public interface q {
        static {
            Covode.recordClassIndex(99174);
        }

        void onCompileDone();

        void onCompileError(int i2, int i3, float f2, String str);

        void onCompileProgress(float f2);
    }

    public interface r {
        static {
            Covode.recordClassIndex(99175);
        }

        void a(int i2);
    }

    public interface s {
        static {
            Covode.recordClassIndex(99176);
        }

        void a();
    }

    public interface t {
        static {
            Covode.recordClassIndex(99177);
        }

        void a(byte[] bArr, int i2, int i3, boolean z);
    }

    public interface u {
        static {
            Covode.recordClassIndex(99178);
        }

        void a(Throwable th);
    }

    public interface v {
        static {
            Covode.recordClassIndex(99179);
        }

        void a();
    }

    public interface w {
        static {
            Covode.recordClassIndex(99180);
        }

        int a(byte[] bArr, int i2, int i3);
    }

    public interface x {
        static {
            Covode.recordClassIndex(99181);
        }
    }

    public interface y {
        static {
            Covode.recordClassIndex(99182);
        }
    }

    public interface z {
        static {
            Covode.recordClassIndex(99183);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(99144);
    }
}
