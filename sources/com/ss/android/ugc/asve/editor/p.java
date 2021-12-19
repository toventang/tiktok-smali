package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEMVParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class p extends i {

    /* renamed from: a  reason: collision with root package name */
    public String f62052a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f62053b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f62054c;

    /* renamed from: d  reason: collision with root package name */
    public String f62055d;

    /* renamed from: e  reason: collision with root package name */
    public int f62056e;

    /* renamed from: f  reason: collision with root package name */
    public int f62057f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f62058g;

    /* renamed from: h  reason: collision with root package name */
    public int f62059h;

    /* renamed from: i  reason: collision with root package name */
    public VEMVParams.a f62060i;

    /* renamed from: j  reason: collision with root package name */
    public VESize f62061j;

    static {
        Covode.recordClassIndex(38150);
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        l.d(xVar, "");
        VEMVParams vEMVParams = new VEMVParams();
        vEMVParams.mvPath = this.f62052a;
        vEMVParams.resourcesFilePaths = this.f62053b;
        vEMVParams.resourcesTypes = this.f62054c;
        vEMVParams.bgmPath = this.f62055d;
        vEMVParams.bgmTrimIn = this.f62056e;
        vEMVParams.bgmTrimOut = this.f62057f;
        vEMVParams.resMV = this.f62060i;
        vEMVParams.customRenderRes = this.f62061j;
        if (z) {
            return xVar.b(vEMVParams);
        }
        return xVar.a(vEMVParams);
    }

    private p(String str, String[] strArr, String[] strArr2, VEMVParams.a aVar, VESize vESize) {
        l.d(str, "");
        l.d(strArr, "");
        l.d(strArr2, "");
        l.d(aVar, "");
        this.f62052a = str;
        this.f62053b = strArr;
        this.f62054c = strArr2;
        this.f62055d = null;
        this.f62056e = 0;
        this.f62057f = 0;
        this.f62058g = false;
        this.f62059h = 0;
        this.f62060i = aVar;
        this.f62061j = vESize;
    }

    public /* synthetic */ p(String str, String[] strArr, String[] strArr2, VEMVParams.a aVar, VESize vESize, byte b2) {
        this(str, strArr, strArr2, aVar, vESize);
    }
}
