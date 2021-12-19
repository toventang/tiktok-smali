package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class bg {

    /* renamed from: a  reason: collision with root package name */
    public String[] f151084a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f151085b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f151086c = null;

    /* renamed from: d  reason: collision with root package name */
    public String[] f151087d = null;

    /* renamed from: e  reason: collision with root package name */
    public int[] f151088e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f151089f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f151090g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f151091h;

    /* renamed from: i  reason: collision with root package name */
    public double[] f151092i;

    /* renamed from: j  reason: collision with root package name */
    public boolean[] f151093j;

    /* renamed from: k  reason: collision with root package name */
    public ROTATE_DEGREE[] f151094k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f151095l;

    static {
        Covode.recordClassIndex(99351);
    }

    public String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        try {
            String[] strArr = this.f151084a;
            if (strArr == null) {
                i2 = 0;
            } else {
                i2 = strArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int[] iArr = this.f151085b;
                if (iArr != null && iArr.length > i3) {
                    sb.append(" videoFileIndex: ").append(this.f151085b[i3]);
                }
                String[] strArr2 = this.f151084a;
                if (strArr2 != null && strArr2.length > i3) {
                    sb.append(" videoFilePath: ").append(this.f151084a[i3]);
                }
                int[] iArr2 = this.f151088e;
                if (iArr2 != null && iArr2.length > i3) {
                    sb.append(" vTrimIn: ").append(this.f151088e[i3]);
                }
                int[] iArr3 = this.f151089f;
                if (iArr3 != null && iArr3.length > i3) {
                    sb.append(" vTrimOut: ").append(this.f151089f[i3]);
                }
                int[] iArr4 = this.f151090g;
                if (iArr4 != null && iArr4.length > i3) {
                    sb.append(" aTrimIn: ").append(this.f151090g[i3]);
                }
                int[] iArr5 = this.f151091h;
                if (iArr5 != null && iArr5.length > i3) {
                    sb.append(" aTrimOut: ").append(this.f151091h[i3]);
                }
                double[] dArr = this.f151092i;
                if (dArr != null && dArr.length > i3) {
                    sb.append(" speed: ").append(this.f151092i[i3]);
                }
                boolean[] zArr = this.f151093j;
                if (zArr != null && zArr.length > i3) {
                    sb.append(" enable: ").append(this.f151093j[i3]);
                }
                ROTATE_DEGREE[] rotate_degreeArr = this.f151094k;
                if (rotate_degreeArr != null && rotate_degreeArr.length > i3) {
                    sb.append(" rotate: ").append(this.f151094k[i3]);
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    public bg(String[] strArr) {
        int length = strArr.length;
        this.f151084a = (String[]) strArr.clone();
        int[] iArr = new int[length];
        this.f151088e = iArr;
        Arrays.fill(iArr, 0);
        int[] iArr2 = new int[length];
        this.f151089f = iArr2;
        Arrays.fill(iArr2, -1);
        int[] iArr3 = new int[length];
        this.f151090g = iArr3;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = new int[length];
        this.f151091h = iArr4;
        Arrays.fill(iArr4, -1);
        double[] dArr = new double[length];
        this.f151092i = dArr;
        Arrays.fill(dArr, 1.0d);
        this.f151085b = new int[length];
        this.f151095l = new int[length];
        boolean[] zArr = new boolean[length];
        this.f151093j = zArr;
        Arrays.fill(zArr, true);
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[length];
        this.f151094k = rotate_degreeArr;
        Arrays.fill(rotate_degreeArr, ROTATE_DEGREE.ROTATE_NONE);
        for (int i2 = 0; i2 < length; i2++) {
            this.f151085b[i2] = i2;
            this.f151095l[i2] = i2;
        }
    }
}
