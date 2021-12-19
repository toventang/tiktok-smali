package com.ss.texturerender.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.l;
import com.ss.texturerender.o;

public final class p extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f151812i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f151813j;

    /* renamed from: k  reason: collision with root package name */
    private int f151814k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f151815l = true;

    /* renamed from: m  reason: collision with root package name */
    private o f151816m;
    private float[] n;
    private int o = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(101242);
    }

    public p() {
        super(5);
        l.a("TR_VideoOCLSREffect", "new VideoOCLSREffect");
        this.f151775c = 5;
    }

    @Override // com.ss.texturerender.a.a
    public final a a() {
        if (this.f151816m != null) {
            l.a("TR_VideoOCLSREffect", "release video sr");
            this.f151816m.b();
            this.f151816m = null;
        }
        return super.a();
    }

    private f a(f fVar) {
        this.f151776d.setOption(6, 0);
        return fVar;
    }

    @Override // com.ss.texturerender.a.a
    public final int a(Bundle bundle) {
        boolean z;
        super.a(bundle);
        int i2 = bundle.getInt("srAlgType");
        int i3 = bundle.getInt("texture_type");
        String string = bundle.getString("moduleName");
        boolean z2 = true;
        boolean z3 = bundle.getBoolean("srIsMaliSync", true);
        if (this.f151812i == i2 && this.f151774b == i3 && this.f151815l == z3) {
            return 0;
        }
        this.f151774b = i3;
        if (this.f151774b == 36197 && this.n == null) {
            this.n = new float[16];
        }
        this.f151813j = bundle.getInt("srMaxSizeWidth");
        this.f151814k = bundle.getInt("srMaxSizeHeight");
        String str = (String) bundle.getSerializable("kernelBinPath");
        if (TextUtils.isEmpty(str)) {
            l.a("TR_VideoOCLSREffect", "sr config is empty");
            return -1;
        }
        if (this.f151816m != null) {
            l.a("TR_VideoOCLSREffect", "release prev SR instance");
            this.f151816m.b();
            this.f151816m = null;
        }
        l.a("TR_VideoOCLSREffect", "start init sr");
        o oVar = new o();
        this.f151816m = oVar;
        if (this.f151813j <= 0 || this.f151814k <= 0) {
            if (this.f151774b != 36197) {
                z2 = false;
            }
            if (!oVar.a(str, i2, z2, string)) {
                l.a("TR_VideoOCLSREffect", "sr init failed");
                this.f151816m.b();
                this.f151816m = null;
                return -1;
            }
        } else {
            if (this.f151774b == 36197) {
                z = true;
            } else {
                z = false;
            }
            if (!oVar.a(str, i2, z, z3, this.f151814k, this.f151813j, string)) {
                l.a("TR_VideoOCLSREffect", "sr init set max texture size failed");
                this.f151816m.b();
                this.f151816m = null;
                return -1;
            }
        }
        this.f151812i = i2;
        this.f151815l = z3;
        l.a("TR_VideoOCLSREffect", "init sr success, texTarget:" + i3 + " bundle:" + bundle.toString());
        return 0;
    }

    @Override // com.ss.texturerender.a.a
    public final f a(f fVar, i iVar) {
        int a2;
        if (this.f151776d == null) {
            return fVar;
        }
        if (this.f151816m == null) {
            return a(fVar);
        }
        if (this.f151812i < 0 || this.f151776d.getUseSr() != 1) {
            return a(fVar);
        }
        int i2 = fVar.f151797c;
        int i3 = fVar.f151798d;
        if (!this.f151776d.supportProcessResolution(i2, i3)) {
            return a(fVar);
        }
        if (this.f151774b == 36197) {
            this.f151776d.getTransformMatrix(this.n);
            a2 = this.f151816m.a(fVar.f151795a, i2, i3, this.n);
        } else {
            a2 = this.f151816m.a(fVar.f151795a, i2, i3);
        }
        if (a2 == -1) {
            if (this.o != -1) {
                l.a("TR_VideoOCLSREffect", "sr process failed,width:" + i2 + ",height:" + i3);
                this.o = -1;
            }
            this.f151776d.notifyError(2);
            return a(fVar);
        }
        int a3 = this.f151816m.a();
        this.f151776d.setOption(6, 1);
        if (this.o != 0) {
            l.a("TR_VideoOCLSREffect", "sr process success,sr tex:" + a3 + ",width:" + (i2 * 2) + ",height:" + (i3 * 2));
            this.o = 0;
        }
        fVar.a();
        return new f(null, a3, i2 * 2, i3 * 2, 3553);
    }
}
