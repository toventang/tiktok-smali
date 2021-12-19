package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.gift.e.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f19821a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19822b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19823c;

    static {
        Covode.recordClassIndex(11749);
    }

    n(a aVar, long j2, long j3) {
        this.f19821a = aVar;
        this.f19822b = j2;
        this.f19823c = j3;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        k.lambda$sendGiftLocal$2$GiftService(this.f19821a, this.f19822b, this.f19823c, (Throwable) obj);
    }
}
