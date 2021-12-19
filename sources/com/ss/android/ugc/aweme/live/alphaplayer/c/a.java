package com.ss.android.ugc.aweme.live.alphaplayer.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f108155a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f108156b;

    /* renamed from: c  reason: collision with root package name */
    public String f108157c;

    /* renamed from: d  reason: collision with root package name */
    public long f108158d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f108159e = true;

    /* renamed from: f  reason: collision with root package name */
    private b f108160f;

    /* renamed from: g  reason: collision with root package name */
    private b f108161g;

    static {
        Covode.recordClassIndex(69337);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c.a$a  reason: collision with other inner class name */
    public static final class C2775a {

        /* renamed from: a  reason: collision with root package name */
        public float f108162a;

        /* renamed from: b  reason: collision with root package name */
        public float f108163b;

        /* renamed from: c  reason: collision with root package name */
        public float f108164c;

        /* renamed from: d  reason: collision with root package name */
        public float f108165d;

        static {
            Covode.recordClassIndex(69338);
        }

        public C2775a() {
        }

        public final float a() {
            return this.f108164c - this.f108162a;
        }

        public final float b() {
            return this.f108165d - this.f108163b;
        }

        public final void c() {
            a(2.0f);
            b(2.0f);
        }

        public final void d() {
            this.f108163b = -this.f108163b;
            this.f108165d = -this.f108165d;
        }

        public final boolean e() {
            if (this.f108162a > this.f108164c || this.f108163b > this.f108165d) {
                return false;
            }
            return true;
        }

        public C2775a(int[] iArr) {
            this((float) iArr[0], (float) iArr[1], (float) (iArr[0] + iArr[2]), (float) (iArr[1] + iArr[3]));
        }

        public final void b(float f2) {
            if (f2 != 1.0f) {
                this.f108163b *= f2;
                this.f108165d *= f2;
            }
        }

        public final C2775a a(int[] iArr) {
            this.f108162a = (float) iArr[0];
            this.f108163b = (float) iArr[1];
            this.f108164c = (float) (iArr[0] + iArr[2]);
            this.f108165d = (float) (iArr[1] + iArr[3]);
            return this;
        }

        public final void a(float f2) {
            if (f2 != 1.0f) {
                this.f108162a *= f2;
                this.f108164c *= f2;
            }
        }

        public final C2775a a(float f2, float f3) {
            if (f2 == 0.0f || f3 == 0.0f) {
                return this;
            }
            return a(this.f108162a, this.f108163b, this.f108164c, this.f108165d, f2, f3);
        }

        public final void b(float f2, float f3) {
            this.f108162a += f2;
            this.f108163b += f3;
            this.f108164c += f2;
            this.f108165d += f3;
        }

        public final C2775a a(int[] iArr, float f2, float f3) {
            if (f2 == 0.0f || f3 == 0.0f || iArr == null || iArr.length != 4) {
                return this;
            }
            return a((float) iArr[0], (float) iArr[1], (float) (iArr[0] + iArr[2]), (float) (iArr[1] + iArr[3]), f2, f3);
        }

        public C2775a(float f2, float f3, float f4, float f5) {
            this.f108162a = f2;
            this.f108163b = f3;
            this.f108164c = f4;
            this.f108165d = f5;
        }

        public final C2775a a(float f2, float f3, float f4, float f5, float f6, float f7) {
            if (!(f6 == 0.0f || f7 == 0.0f)) {
                this.f108162a = f2 / f6;
                this.f108163b = f3 / f7;
                this.f108164c = f4 / f6;
                this.f108165d = f5 / f7;
            }
            return this;
        }
    }

    private void a() {
        this.f108155a = c(this.f108160f);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f108166a;

        /* renamed from: b  reason: collision with root package name */
        public d f108167b = d.ScaleAspectFill;

        /* renamed from: c  reason: collision with root package name */
        public int f108168c;

        /* renamed from: d  reason: collision with root package name */
        public C2775a f108169d;

        /* renamed from: e  reason: collision with root package name */
        public C2775a f108170e;

        /* renamed from: f  reason: collision with root package name */
        public int f108171f;

        /* renamed from: g  reason: collision with root package name */
        public int f108172g;

        /* renamed from: h  reason: collision with root package name */
        public int f108173h;

        /* renamed from: i  reason: collision with root package name */
        public int f108174i;

        /* renamed from: j  reason: collision with root package name */
        public int f108175j;

        /* renamed from: k  reason: collision with root package name */
        public Map<String, Map<String, c>> f108176k;

        static {
            Covode.recordClassIndex(69339);
        }

        public final boolean a() {
            if (this.f108175j != 1 || this.f108170e == null || this.f108169d == null) {
                return false;
            }
            return true;
        }

        public final boolean b() {
            Map<String, Map<String, c>> map;
            if (this.f108175j != 1 || (map = this.f108176k) == null || map.isEmpty()) {
                return false;
            }
            return true;
        }

        public final b a(Map<String, Map<String, c>> map) {
            this.f108176k = map;
            return this;
        }

        public final b b(int i2) {
            this.f108175j = i2;
            return this;
        }

        public final b c(int i2) {
            this.f108168c = i2;
            return this;
        }

        public final b d(int i2) {
            this.f108171f = i2;
            return this;
        }

        public final b e(int i2) {
            this.f108172g = i2;
            return this;
        }

        public final b f(int i2) {
            this.f108173h = i2;
            return this;
        }

        public final b g(int i2) {
            this.f108174i = i2;
            return this;
        }

        public final b a(int i2) {
            this.f108167b = d.convertFrom(i2);
            return this;
        }

        public b(String str) {
            this.f108166a = str;
        }

        public final b a(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.f108169d = new C2775a(iArr);
            }
            return this;
        }

        public final b b(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.f108170e = new C2775a(iArr);
            }
            return this;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f108177a;

        /* renamed from: b  reason: collision with root package name */
        public int f108178b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f108179c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f108180d;

        static {
            Covode.recordClassIndex(69340);
        }

        public final boolean a() {
            int[] iArr;
            int[] iArr2;
            int i2 = this.f108177a;
            if (i2 != 0 && i2 != 1) {
                return false;
            }
            int i3 = this.f108178b;
            if ((i3 == 0 || i3 == 1) && (iArr = this.f108179c) != null && iArr.length == 4 && (iArr2 = this.f108180d) != null && iArr2.length == 4) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return "Element{type=" + this.f108177a + ", fitType=" + this.f108178b + ", sourceFrame=" + Arrays.toString(this.f108179c) + ", renderFrame=" + Arrays.toString(this.f108180d) + '}';
        }
    }

    public enum d {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);
        
        int index;

        static {
            Covode.recordClassIndex(69341);
        }

        public static d convertFrom(int i2) {
            switch (i2) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return LeftFill;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return RightFill;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return TopFit;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return BottomFit;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return LeftFit;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        private d(int i2) {
            this.index = i2;
        }
    }

    public final a a(boolean z) {
        this.f108156b = z;
        return this;
    }

    public final a b(boolean z) {
        this.f108159e = z;
        return this;
    }

    public final a a(b bVar) {
        this.f108160f = bVar;
        a();
        return this;
    }

    public final a b(b bVar) {
        this.f108161g = bVar;
        a();
        return this;
    }

    public final b a(int i2) {
        if (1 == i2) {
            return this.f108160f;
        }
        return this.f108161g;
    }

    private boolean c(b bVar) {
        if (bVar == null) {
            this.f108157c = "dataInfo is null.";
            return false;
        } else if (TextUtils.isEmpty(bVar.f108166a)) {
            this.f108157c = "dataPath is empty.";
            return false;
        } else if (!new File(bVar.f108166a).exists()) {
            this.f108157c = "dataPath is not exist, path: " + bVar.f108166a;
            return false;
        } else if (bVar.f108175j <= 0) {
            return true;
        } else {
            if (bVar.f108169d == null || bVar.f108170e == null) {
                this.f108157c = "area is empty";
                return false;
            } else if (!bVar.f108169d.e() || !bVar.f108170e.e()) {
                this.f108157c = "area is invalid";
                return false;
            } else if (bVar.f108171f <= 0 || bVar.f108172g <= 0) {
                this.f108157c = "video size is wrong";
                return false;
            } else if (bVar.f108173h <= 0 || bVar.f108174i <= 0) {
                this.f108157c = "actual size is wrong";
                return false;
            } else if (bVar.f108170e.a() == ((float) bVar.f108173h) && bVar.f108170e.b() == ((float) bVar.f108174i)) {
                return true;
            } else {
                this.f108157c = "rgb area is not equal to actual size";
                return false;
            }
        }
    }
}
