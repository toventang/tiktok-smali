package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f98105a;

    /* renamed from: b  reason: collision with root package name */
    private final int f98106b;

    /* renamed from: c  reason: collision with root package name */
    private final int f98107c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f98108d;

    static {
        Covode.recordClassIndex(62359);
    }

    z(i iVar, int i2, int i3, int[] iArr) {
        this.f98105a = iVar;
        this.f98106b = i2;
        this.f98107c = i3;
        this.f98108d = iArr;
    }

    public final void run() {
        i iVar = this.f98105a;
        int i2 = this.f98106b;
        int i3 = this.f98107c;
        int[] iArr = this.f98108d;
        if (i2 != 0 && i3 != 0 && iArr != null) {
            iVar.E = new Rect(0, iArr[1], i2, i3 + iArr[1]);
        }
    }
}
