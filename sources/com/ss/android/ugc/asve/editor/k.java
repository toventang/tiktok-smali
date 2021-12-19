package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class k extends i {

    /* renamed from: a  reason: collision with root package name */
    public int[] f62018a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f62019b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f62020c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f62021d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f62022e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f62023f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f62024g;

    /* renamed from: h  reason: collision with root package name */
    public ROTATE_DEGREE[] f62025h;

    /* renamed from: i  reason: collision with root package name */
    public x.l f62026i = x.l.VIDEO_OUT_RATIO_ORIGINAL;

    /* renamed from: j  reason: collision with root package name */
    public String[] f62027j;

    static {
        Covode.recordClassIndex(38134);
    }

    public final void a(x.l lVar) {
        l.d(lVar, "");
        this.f62026i = lVar;
    }

    public k(String[] strArr) {
        l.d(strArr, "");
        this.f62027j = strArr;
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        int[] iArr;
        l.d(xVar, "");
        int[] iArr2 = this.f62018a;
        if (iArr2 == null || (iArr = this.f62019b) == null) {
            return xVar.a(this.f62027j, this.f62020c, this.f62021d, this.f62026i);
        }
        String[] strArr = this.f62027j;
        String[] strArr2 = this.f62020c;
        String[] strArr3 = this.f62021d;
        int[] iArr3 = this.f62022e;
        int[] iArr4 = this.f62023f;
        float[] fArr = this.f62024g;
        return xVar.a(strArr, iArr2, iArr, strArr2, strArr3, iArr3, iArr4, fArr, fArr, this.f62025h, this.f62026i);
    }
}
