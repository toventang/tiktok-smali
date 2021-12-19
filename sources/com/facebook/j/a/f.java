package com.facebook.j.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;

final class f {

    /* renamed from: a  reason: collision with root package name */
    FileInputStream f48744a;

    /* renamed from: b  reason: collision with root package name */
    int f48745b;

    /* renamed from: c  reason: collision with root package name */
    int f48746c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f48747d = new byte[512];

    static {
        Covode.recordClassIndex(29381);
    }

    public final void a() {
        MethodCollector.i(729);
        if (this.f48745b >= this.f48746c) {
            this.f48746c = this.f48744a.read(this.f48747d);
            this.f48745b = 0;
        }
        while (true) {
            int i2 = this.f48746c;
            if (i2 == -1) {
                break;
            }
            byte[] bArr = this.f48747d;
            int i3 = this.f48745b;
            if (bArr[i3] == 10) {
                break;
            }
            int i4 = i3 + 1;
            this.f48745b = i4;
            if (i4 >= i2) {
                this.f48746c = this.f48744a.read(bArr);
                this.f48745b = 0;
            }
        }
        this.f48745b++;
        MethodCollector.o(729);
    }

    public final int a(byte[] bArr) {
        int i2;
        MethodCollector.i(725);
        if (this.f48745b >= this.f48746c) {
            this.f48746c = this.f48744a.read(this.f48747d);
            this.f48745b = 0;
        }
        int i3 = 0;
        while (true) {
            i2 = this.f48746c;
            if (i2 == -1 || i3 >= bArr.length) {
                break;
            }
            byte[] bArr2 = this.f48747d;
            int i4 = this.f48745b;
            if (bArr2[i4] == 10) {
                break;
            }
            bArr[i3] = bArr2[i4];
            int i5 = i4 + 1;
            this.f48745b = i5;
            if (i5 >= i2) {
                this.f48746c = this.f48744a.read(bArr2);
                this.f48745b = 0;
            }
            i3++;
        }
        this.f48745b++;
        if (i2 == -1) {
            MethodCollector.o(725);
            return -1;
        }
        MethodCollector.o(725);
        return i3;
    }
}
