package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.components.sticker.a;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.i;

final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i.AnonymousClass4 f98024a;

    /* renamed from: b  reason: collision with root package name */
    private final a f98025b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98026c;

    static {
        Covode.recordClassIndex(62311);
    }

    ah(i.AnonymousClass4 r1, a aVar, String str) {
        this.f98024a = r1;
        this.f98025b = aVar;
        this.f98026c = str;
    }

    public final void run() {
        i.AnonymousClass4 r3 = this.f98024a;
        a aVar = this.f98025b;
        String str = this.f98026c;
        i.this.N.a();
        if (aVar != null && !TextUtils.isEmpty(str)) {
            aVar.f97894b.setPin(true);
        }
        i.this.f98069d.f98000g.b(aVar);
    }
}
