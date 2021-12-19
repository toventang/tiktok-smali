package com.ss.texturerender.a;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.texturerender.l;

public final class b extends a {

    /* renamed from: i  reason: collision with root package name */
    private c f151781i;

    /* renamed from: j  reason: collision with root package name */
    private int f151782j = 1920;

    /* renamed from: k  reason: collision with root package name */
    private int f151783k = 1080;

    /* renamed from: l  reason: collision with root package name */
    private int f151784l;

    /* renamed from: m  reason: collision with root package name */
    private int f151785m;
    private float n = -1.0f;
    private float o = -1.0f;
    private float p = -1.0f;
    private int q = -1;
    private float[] r;
    private boolean s;
    private int t = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(101227);
    }

    public b() {
        super(1);
        l.a("TR_AdaptiveSharpenEffect", "new AdaptiveSharpenEffect");
        this.f151775c = 10;
    }

    @Override // com.ss.texturerender.a.a
    public final a a() {
        c cVar = this.f151781i;
        if (cVar != null) {
            cVar.a();
            this.f151781i = null;
            l.a("TR_AdaptiveSharpenEffect", "sharpen released");
        }
        return super.a();
    }

    @Override // com.ss.texturerender.a.a
    public final int a(int i2) {
        switch (i2) {
            case 10001:
                return this.f151782j;
            case 10002:
                return this.f151783k;
            case 10003:
                return this.f151784l;
            case 10004:
                return this.f151774b;
            default:
                return super.a(i2);
        }
    }

    @Override // com.ss.texturerender.a.a
    public final int a(Bundle bundle) {
        boolean z;
        Object a2;
        super.a(bundle);
        int i2 = bundle.getInt("texture_type");
        if (!((this.f151784l == bundle.getInt("power_level") && this.f151774b == i2) || this.f151781i == null)) {
            l.a("TR_AdaptiveSharpenEffect", "release prev sharpen instance");
            this.f151781i.a();
            this.f151781i = null;
        }
        int i3 = 0;
        if (this.f151781i == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f151774b = i2;
            if (this.f151774b == 36197 && this.r == null) {
                this.r = new float[16];
            }
            this.f151782j = bundle.getInt("max_width");
            this.f151783k = bundle.getInt("max_height");
            this.f151784l = bundle.getInt("power_level");
            c cVar = new c();
            this.f151781i = cVar;
            if (this.f151774b == 36197) {
                z = true;
            } else {
                z = false;
            }
            int i4 = this.f151782j;
            int i5 = this.f151783k;
            int i6 = this.f151784l;
            if (cVar.f151786a == null || cVar.f151787b == null || (a2 = c.a(cVar.f151787b, cVar.f151786a, Boolean.valueOf(z), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6))) == null || !((Boolean) a2).booleanValue()) {
                i3 = -1;
            }
            l.a("TR_AdaptiveSharpenEffect", "init sharpen, ret:" + i3 + ",cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            if (i3 != 0) {
                this.s = true;
                this.f151781i.a();
                this.f151781i = null;
                l.a("TR_AdaptiveSharpenEffect", "init sharpen fail, release");
            }
        }
        l.a("TR_AdaptiveSharpenEffect", "sharpen init,ret:".concat(String.valueOf(i3)));
        return i3;
    }

    @Override // com.ss.texturerender.a.a
    public final void a(int i2, float f2) {
        switch (i2) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                this.n = f2;
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                this.o = f2;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                this.p = f2;
                break;
            default:
                super.a(i2, f2);
                break;
        }
        l.a("TR_AdaptiveSharpenEffect", "setOption float, key:" + i2 + ",value:" + f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0168  */
    @Override // com.ss.texturerender.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.texturerender.a.f a(com.ss.texturerender.a.f r19, com.ss.texturerender.a.i r20) {
        /*
        // Method dump skipped, instructions count: 455
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.a.b.a(com.ss.texturerender.a.f, com.ss.texturerender.a.i):com.ss.texturerender.a.f");
    }

    @Override // com.ss.texturerender.a.a
    public final void a(int i2, int i3) {
        if (i2 == 14) {
            this.q = i3;
            l.a("TR_AdaptiveSharpenEffect", "set DiffImgSmoothEnable:".concat(String.valueOf(i3)));
        } else if (i2 != 17) {
            super.a(i2, i3);
        } else {
            this.f151785m = i3;
            l.a("TR_AdaptiveSharpenEffect", "set SceneMode:".concat(String.valueOf(i3)));
        }
    }
}
