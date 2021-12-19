package com.bytedance.android.livesdk;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.gift.e.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f18856a;

    /* renamed from: b  reason: collision with root package name */
    private final long f18857b;

    /* renamed from: c  reason: collision with root package name */
    private final User f18858c;

    /* renamed from: d  reason: collision with root package name */
    private final long f18859d;

    /* renamed from: e  reason: collision with root package name */
    private final long f18860e;

    static {
        Covode.recordClassIndex(11209);
    }

    m(a aVar, long j2, User user, long j3, long j4) {
        this.f18856a = aVar;
        this.f18857b = j2;
        this.f18858c = user;
        this.f18859d = j3;
        this.f18860e = j4;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        k.lambda$sendGiftLocal$1$GiftService(this.f18856a, this.f18857b, this.f18858c, this.f18859d, this.f18860e, (d) obj);
    }
}
