package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f98101a;

    /* renamed from: b  reason: collision with root package name */
    private final int f98102b;

    /* renamed from: c  reason: collision with root package name */
    private final int f98103c;

    /* renamed from: d  reason: collision with root package name */
    private final h f98104d;

    static {
        Covode.recordClassIndex(62358);
    }

    y(i iVar, int i2, int i3, h hVar) {
        this.f98101a = iVar;
        this.f98102b = i2;
        this.f98103c = i3;
        this.f98104d = hVar;
    }

    public final void run() {
        i iVar = this.f98101a;
        iVar.a(this.f98102b, this.f98103c, this.f98104d);
        iVar.g();
    }
}
