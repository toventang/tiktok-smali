package androidx.constraintlayout.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static int f2014a = 1;

    /* renamed from: l  reason: collision with root package name */
    private static int f2015l = 1;

    /* renamed from: m  reason: collision with root package name */
    private static int f2016m = 1;
    private static int n = 1;
    private static int o = 1;

    /* renamed from: b  reason: collision with root package name */
    public String f2017b;

    /* renamed from: c  reason: collision with root package name */
    public int f2018c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f2019d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f2020e;

    /* renamed from: f  reason: collision with root package name */
    public float f2021f;

    /* renamed from: g  reason: collision with root package name */
    float[] f2022g = new float[7];

    /* renamed from: h  reason: collision with root package name */
    a f2023h;

    /* renamed from: i  reason: collision with root package name */
    b[] f2024i = new b[8];

    /* renamed from: j  reason: collision with root package name */
    int f2025j;

    /* renamed from: k  reason: collision with root package name */
    public int f2026k;

    static {
        Covode.recordClassIndex(612);
    }

    public final void a() {
        this.f2017b = null;
        this.f2023h = a.UNKNOWN;
        this.f2020e = 0;
        this.f2018c = -1;
        this.f2019d = -1;
        this.f2021f = 0.0f;
        this.f2025j = 0;
        this.f2026k = 0;
    }

    public final String toString() {
        return "" + this.f2017b;
    }

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;

        static {
            Covode.recordClassIndex(613);
        }
    }

    public h(a aVar) {
        this.f2023h = aVar;
    }

    public final void c(b bVar) {
        int i2 = this.f2025j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2024i[i3].f1981d.a(this.f2024i[i3], bVar);
        }
        this.f2025j = 0;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2025j;
            if (i2 >= i3) {
                b[] bVarArr = this.f2024i;
                if (i3 >= bVarArr.length) {
                    this.f2024i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2024i;
                int i4 = this.f2025j;
                bVarArr2[i4] = bVar;
                this.f2025j = i4 + 1;
                return;
            } else if (this.f2024i[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f2025j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f2024i[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.f2024i;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.f2025j--;
                return;
            }
        }
    }
}
