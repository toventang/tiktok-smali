package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i;

final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i.AnonymousClass4 f127107a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f127108b;

    /* renamed from: c  reason: collision with root package name */
    private final String f127109c;

    static {
        Covode.recordClassIndex(83391);
    }

    ah(i.AnonymousClass4 r1, aj ajVar, String str) {
        this.f127107a = r1;
        this.f127108b = ajVar;
        this.f127109c = str;
    }

    public final void run() {
        i.AnonymousClass4 r3 = this.f127107a;
        aj ajVar = this.f127108b;
        String str = this.f127109c;
        i.this.O.b();
        if (ajVar != null && !TextUtils.isEmpty(str)) {
            ajVar.f127114c.setPin(true);
        }
        i.this.f127155d.f127073g.b(ajVar);
    }
}
