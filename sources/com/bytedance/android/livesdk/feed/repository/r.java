package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository.a f17642a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17643b;

    static {
        Covode.recordClassIndex(9782);
    }

    r(FeedRepository.a aVar, boolean z) {
        this.f17642a = aVar;
        this.f17643b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a.EnumC0361a aVar;
        String str;
        FeedRepository.a aVar2 = this.f17642a;
        boolean z = this.f17643b;
        Throwable th = (Throwable) obj;
        a aVar3 = aVar2.f17619i;
        if (z) {
            aVar = a.EnumC0361a.REFRESH;
            str = aVar2.f17613c;
        } else {
            aVar = a.EnumC0361a.LOAD_MORE;
            str = aVar2.f17614d;
        }
        aVar3.a(aVar, str, th);
    }
}
