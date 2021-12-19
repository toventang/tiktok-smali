package androidx.constraintlayout.a.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class j extends f {
    protected f[] ax = new f[4];
    protected int ay;

    static {
        Covode.recordClassIndex(594);
    }

    public final void z() {
        this.ay = 0;
    }

    public final void a(f fVar) {
        int i2 = this.ay + 1;
        f[] fVarArr = this.ax;
        if (i2 > fVarArr.length) {
            this.ax = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        f[] fVarArr2 = this.ax;
        int i3 = this.ay;
        fVarArr2[i3] = fVar;
        this.ay = i3 + 1;
    }
}
