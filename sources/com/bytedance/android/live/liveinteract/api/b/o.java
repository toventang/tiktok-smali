package com.bytedance.android.live.liveinteract.api.b;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public n f10003a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f10004b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10005c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10006d;

    /* renamed from: e  reason: collision with root package name */
    public int f10007e;

    /* renamed from: f  reason: collision with root package name */
    public int f10008f;

    /* renamed from: g  reason: collision with root package name */
    public int f10009g;

    /* renamed from: h  reason: collision with root package name */
    public int f10010h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10011i;

    static {
        Covode.recordClassIndex(5180);
    }

    private o(n nVar, FrameLayout frameLayout, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3) {
        l.d(nVar, "");
        this.f10003a = nVar;
        this.f10004b = frameLayout;
        this.f10005c = z;
        this.f10006d = z2;
        this.f10007e = i2;
        this.f10008f = i3;
        this.f10009g = i4;
        this.f10010h = i5;
        this.f10011i = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(n nVar, FrameLayout frameLayout, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3, int i6) {
        this(nVar, (i6 & 2) != 0 ? null : frameLayout, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? false : z2, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? true : z3);
    }
}
