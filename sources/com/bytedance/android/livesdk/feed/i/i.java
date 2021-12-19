package com.bytedance.android.livesdk.feed.i;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f17519a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f17520b;

    static {
        Covode.recordClassIndex(9704);
    }

    i(a aVar, Room room) {
        this.f17519a = aVar;
        this.f17520b = room;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f17519a.a(this.f17520b);
    }
}
