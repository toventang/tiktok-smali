package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class n extends i {

    /* renamed from: a  reason: collision with root package name */
    public String f62042a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f62043b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f62044c;

    /* renamed from: d  reason: collision with root package name */
    public String f62045d;

    /* renamed from: e  reason: collision with root package name */
    public int f62046e;

    /* renamed from: f  reason: collision with root package name */
    public int f62047f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f62048g;

    /* renamed from: h  reason: collision with root package name */
    public int f62049h;

    static {
        Covode.recordClassIndex(38137);
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        l.d(xVar, "");
        if (z) {
            return xVar.a(this.f62042a, this.f62043b, this.f62044c);
        }
        return xVar.a(this.f62042a, this.f62043b, this.f62044c, this.f62045d, this.f62046e, this.f62047f);
    }

    private n(String str, String[] strArr, String[] strArr2, String str2, int i2, int i3) {
        l.d(str, "");
        l.d(strArr, "");
        l.d(strArr2, "");
        this.f62042a = str;
        this.f62043b = strArr;
        this.f62044c = strArr2;
        this.f62045d = str2;
        this.f62046e = i2;
        this.f62047f = i3;
        this.f62048g = false;
        this.f62049h = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, String[] strArr, String[] strArr2, String str2, int i2, int i3, int i4) {
        this(str, strArr, strArr2, (i4 & 8) != 0 ? null : str2, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3);
    }
}
