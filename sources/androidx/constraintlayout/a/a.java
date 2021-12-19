package androidx.constraintlayout.a;

import androidx.constraintlayout.a.h;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    int f1883a;

    /* renamed from: b  reason: collision with root package name */
    final b f1884b;

    /* renamed from: c  reason: collision with root package name */
    final c f1885c;

    /* renamed from: d  reason: collision with root package name */
    int[] f1886d = new int[8];

    /* renamed from: e  reason: collision with root package name */
    int[] f1887e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    float[] f1888f = new float[8];

    /* renamed from: g  reason: collision with root package name */
    int f1889g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f1890h = 8;

    /* renamed from: i  reason: collision with root package name */
    private h f1891i;

    /* renamed from: j  reason: collision with root package name */
    private int f1892j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1893k;

    static {
        Covode.recordClassIndex(577);
    }

    /* access modifiers changed from: package-private */
    public final void a(h hVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.f1889g;
            if (i2 == -1) {
                this.f1889g = 0;
                this.f1888f[0] = f2;
                this.f1886d[0] = hVar.f2018c;
                this.f1887e[this.f1889g] = -1;
                hVar.f2026k++;
                hVar.a(this.f1884b);
                this.f1883a++;
                if (!this.f1893k) {
                    int i3 = this.f1892j + 1;
                    this.f1892j = i3;
                    int[] iArr = this.f1886d;
                    if (i3 >= iArr.length) {
                        this.f1893k = true;
                        this.f1892j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f1883a) {
                if (this.f1886d[i2] == hVar.f2018c) {
                    float[] fArr = this.f1888f;
                    fArr[i2] = fArr[i2] + f2;
                    if (fArr[i2] == 0.0f) {
                        if (i2 == this.f1889g) {
                            this.f1889g = this.f1887e[i2];
                        } else {
                            int[] iArr2 = this.f1887e;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z) {
                            hVar.b(this.f1884b);
                        }
                        if (this.f1893k) {
                            this.f1892j = i2;
                        }
                        hVar.f2026k--;
                        this.f1883a--;
                        return;
                    }
                    return;
                }
                if (this.f1886d[i2] < hVar.f2018c) {
                    i5 = i2;
                }
                i2 = this.f1887e[i2];
                i4++;
            }
            int i6 = this.f1892j;
            int i7 = i6 + 1;
            if (this.f1893k) {
                int[] iArr3 = this.f1886d;
                if (iArr3[i6] != -1) {
                    i6 = iArr3.length;
                }
            } else {
                i6 = i7;
            }
            int[] iArr4 = this.f1886d;
            if (i6 >= iArr4.length && this.f1883a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f1886d;
                    if (i8 >= iArr5.length) {
                        break;
                    } else if (iArr5[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr6 = this.f1886d;
            if (i6 >= iArr6.length) {
                i6 = iArr6.length;
                int i9 = this.f1890h * 2;
                this.f1890h = i9;
                this.f1893k = false;
                this.f1892j = i6 - 1;
                this.f1888f = Arrays.copyOf(this.f1888f, i9);
                this.f1886d = Arrays.copyOf(this.f1886d, this.f1890h);
                this.f1887e = Arrays.copyOf(this.f1887e, this.f1890h);
            }
            this.f1886d[i6] = hVar.f2018c;
            this.f1888f[i6] = f2;
            if (i5 != -1) {
                int[] iArr7 = this.f1887e;
                iArr7[i6] = iArr7[i5];
                iArr7[i5] = i6;
            } else {
                this.f1887e[i6] = this.f1889g;
                this.f1889g = i6;
            }
            hVar.f2026k++;
            hVar.a(this.f1884b);
            this.f1883a++;
            if (!this.f1893k) {
                this.f1892j++;
            }
            int i10 = this.f1892j;
            int[] iArr8 = this.f1886d;
            if (i10 >= iArr8.length) {
                this.f1893k = true;
                this.f1892j = iArr8.length - 1;
            }
        }
    }

    public final void a() {
        int i2 = this.f1889g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1883a) {
            h hVar = this.f1885c.f1985c[this.f1886d[i2]];
            if (hVar != null) {
                hVar.b(this.f1884b);
            }
            i2 = this.f1887e[i2];
            i3++;
        }
        this.f1889g = -1;
        this.f1892j = -1;
        this.f1893k = false;
        this.f1883a = 0;
    }

    public final String toString() {
        int i2 = this.f1889g;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1883a) {
            str = ((str + " -> ") + this.f1888f[i2] + " : ") + this.f1885c.f1985c[this.f1886d[i2]];
            i2 = this.f1887e[i2];
            i3++;
        }
        return str;
    }

    static boolean a(h hVar) {
        if (hVar.f2026k <= 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final h a(int i2) {
        int i3 = this.f1889g;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f1883a) {
            if (i4 == i2) {
                return this.f1885c.f1985c[this.f1886d[i3]];
            }
            i3 = this.f1887e[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float b(int i2) {
        int i3 = this.f1889g;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f1883a) {
            if (i4 == i2) {
                return this.f1888f[i3];
            }
            i3 = this.f1887e[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float b(h hVar) {
        int i2 = this.f1889g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1883a) {
            if (this.f1886d[i2] == hVar.f2018c) {
                return this.f1888f[i2];
            }
            i2 = this.f1887e[i2];
            i3++;
        }
        return 0.0f;
    }

    a(b bVar, c cVar) {
        this.f1884b = bVar;
        this.f1885c = cVar;
    }

    public final float a(h hVar, boolean z) {
        if (this.f1891i == hVar) {
            this.f1891i = null;
        }
        int i2 = this.f1889g;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f1883a) {
            if (this.f1886d[i2] == hVar.f2018c) {
                if (i2 == this.f1889g) {
                    this.f1889g = this.f1887e[i2];
                } else {
                    int[] iArr = this.f1887e;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    hVar.b(this.f1884b);
                }
                hVar.f2026k--;
                this.f1883a--;
                this.f1886d[i2] = -1;
                if (this.f1893k) {
                    this.f1892j = i2;
                }
                return this.f1888f[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1887e[i2];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final h a(boolean[] zArr, h hVar) {
        int i2 = this.f1889g;
        int i3 = 0;
        h hVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.f1883a) {
            if (this.f1888f[i2] < 0.0f) {
                h hVar3 = this.f1885c.f1985c[this.f1886d[i2]];
                if ((zArr == null || !zArr[hVar3.f2018c]) && hVar3 != hVar && (hVar3.f2023h == h.a.SLACK || hVar3.f2023h == h.a.ERROR)) {
                    float f3 = this.f1888f[i2];
                    if (f3 < f2) {
                        hVar2 = hVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.f1887e[i2];
            i3++;
        }
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar, b bVar2) {
        int i2 = this.f1889g;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f1883a) {
                if (this.f1886d[i2] == bVar2.f1978a.f2018c) {
                    float f2 = this.f1888f[i2];
                    a(bVar2.f1978a, false);
                    a aVar = bVar2.f1981d;
                    int i4 = aVar.f1889g;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f1883a) {
                        a(this.f1885c.f1985c[aVar.f1886d[i4]], aVar.f1888f[i4] * f2, false);
                        i4 = aVar.f1887e[i4];
                        i5++;
                    }
                    bVar.f1979b += bVar2.f1979b * f2;
                    i2 = this.f1889g;
                } else {
                    i2 = this.f1887e[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar, b[] bVarArr) {
        int i2 = this.f1889g;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f1883a) {
                h hVar = this.f1885c.f1985c[this.f1886d[i2]];
                if (hVar.f2019d != -1) {
                    float f2 = this.f1888f[i2];
                    a(hVar, true);
                    b bVar2 = bVarArr[hVar.f2019d];
                    if (!bVar2.f1982e) {
                        a aVar = bVar2.f1981d;
                        int i4 = aVar.f1889g;
                        int i5 = 0;
                        while (i4 != -1 && i5 < aVar.f1883a) {
                            a(this.f1885c.f1985c[aVar.f1886d[i4]], aVar.f1888f[i4] * f2, true);
                            i4 = aVar.f1887e[i4];
                            i5++;
                        }
                    }
                    bVar.f1979b += bVar2.f1979b * f2;
                    bVar2.f1978a.b(bVar);
                    i2 = this.f1889g;
                } else {
                    i2 = this.f1887e[i2];
                    i3++;
                }
            }
            return;
        }
    }

    public final void a(h hVar, float f2) {
        if (f2 == 0.0f) {
            a(hVar, true);
            return;
        }
        int i2 = this.f1889g;
        if (i2 == -1) {
            this.f1889g = 0;
            this.f1888f[0] = f2;
            this.f1886d[0] = hVar.f2018c;
            this.f1887e[this.f1889g] = -1;
            hVar.f2026k++;
            hVar.a(this.f1884b);
            this.f1883a++;
            if (!this.f1893k) {
                int i3 = this.f1892j + 1;
                this.f1892j = i3;
                int[] iArr = this.f1886d;
                if (i3 >= iArr.length) {
                    this.f1893k = true;
                    this.f1892j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f1883a) {
            if (this.f1886d[i2] == hVar.f2018c) {
                this.f1888f[i2] = f2;
                return;
            }
            if (this.f1886d[i2] < hVar.f2018c) {
                i5 = i2;
            }
            i2 = this.f1887e[i2];
            i4++;
        }
        int i6 = this.f1892j;
        int i7 = i6 + 1;
        if (this.f1893k) {
            int[] iArr2 = this.f1886d;
            if (iArr2[i6] != -1) {
                i6 = iArr2.length;
            }
        } else {
            i6 = i7;
        }
        int[] iArr3 = this.f1886d;
        if (i6 >= iArr3.length && this.f1883a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f1886d;
                if (i8 >= iArr4.length) {
                    break;
                } else if (iArr4[i8] == -1) {
                    i6 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int[] iArr5 = this.f1886d;
        if (i6 >= iArr5.length) {
            i6 = iArr5.length;
            int i9 = this.f1890h * 2;
            this.f1890h = i9;
            this.f1893k = false;
            this.f1892j = i6 - 1;
            this.f1888f = Arrays.copyOf(this.f1888f, i9);
            this.f1886d = Arrays.copyOf(this.f1886d, this.f1890h);
            this.f1887e = Arrays.copyOf(this.f1887e, this.f1890h);
        }
        this.f1886d[i6] = hVar.f2018c;
        this.f1888f[i6] = f2;
        if (i5 != -1) {
            int[] iArr6 = this.f1887e;
            iArr6[i6] = iArr6[i5];
            iArr6[i5] = i6;
        } else {
            this.f1887e[i6] = this.f1889g;
            this.f1889g = i6;
        }
        hVar.f2026k++;
        hVar.a(this.f1884b);
        int i10 = this.f1883a + 1;
        this.f1883a = i10;
        if (!this.f1893k) {
            this.f1892j++;
        }
        int[] iArr7 = this.f1886d;
        if (i10 >= iArr7.length) {
            this.f1893k = true;
        }
        if (this.f1892j >= iArr7.length) {
            this.f1893k = true;
            this.f1892j = iArr7.length - 1;
        }
    }
}
