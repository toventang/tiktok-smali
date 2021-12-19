package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f127798a;

    /* renamed from: b  reason: collision with root package name */
    private final int f127799b;

    /* renamed from: c  reason: collision with root package name */
    private final int f127800c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f127801d;

    static {
        Covode.recordClassIndex(83770);
    }

    public z(i iVar, int i2, int i3, int[] iArr) {
        this.f127798a = iVar;
        this.f127799b = i2;
        this.f127800c = i3;
        this.f127801d = iArr;
    }

    public final void run() {
        i iVar = this.f127798a;
        int i2 = this.f127799b;
        int i3 = this.f127800c;
        int[] iArr = this.f127801d;
        if (i2 != 0 && i3 != 0 && iArr != null) {
            iVar.F = new Rect(0, iArr[1], i2, i3 + iArr[1]);
        }
    }
}
