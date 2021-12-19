package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class m extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f62030a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f62031b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f62032c;

    /* renamed from: d  reason: collision with root package name */
    private final VETransitionFilterParam[] f62033d = null;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f62034e = null;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f62035f = null;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f62036g = null;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f62037h;

    /* renamed from: i  reason: collision with root package name */
    private final VECanvasFilterParam[] f62038i;

    /* renamed from: j  reason: collision with root package name */
    private final x.l f62039j;

    /* renamed from: k  reason: collision with root package name */
    private final x.k f62040k;

    /* renamed from: l  reason: collision with root package name */
    private final x.m f62041l;

    static {
        Covode.recordClassIndex(38136);
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        l.d(xVar, "");
        return xVar.a(this.f62030a, this.f62031b, this.f62032c, this.f62033d, this.f62034e, this.f62035f, this.f62036g, this.f62037h, this.f62038i, this.f62039j);
    }

    public m(String[] strArr, int[] iArr, int[] iArr2, float[] fArr, VECanvasFilterParam[] vECanvasFilterParamArr, x.l lVar, x.k kVar, x.m mVar) {
        l.d(strArr, "");
        l.d(iArr, "");
        l.d(iArr2, "");
        l.d(fArr, "");
        l.d(lVar, "");
        l.d(kVar, "");
        l.d(mVar, "");
        this.f62030a = strArr;
        this.f62031b = iArr;
        this.f62032c = iArr2;
        this.f62037h = fArr;
        this.f62038i = vECanvasFilterParamArr;
        this.f62039j = lVar;
        this.f62040k = kVar;
        this.f62041l = mVar;
    }
}
