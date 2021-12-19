package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f127794a;

    /* renamed from: b  reason: collision with root package name */
    private final int f127795b;

    /* renamed from: c  reason: collision with root package name */
    private final int f127796c;

    /* renamed from: d  reason: collision with root package name */
    private final h f127797d;

    static {
        Covode.recordClassIndex(83769);
    }

    y(i iVar, int i2, int i3, h hVar) {
        this.f127794a = iVar;
        this.f127795b = i2;
        this.f127796c = i3;
        this.f127797d = hVar;
    }

    public final void run() {
        i iVar = this.f127794a;
        iVar.a(this.f127795b, this.f127796c, this.f127797d);
        iVar.i();
    }
}
