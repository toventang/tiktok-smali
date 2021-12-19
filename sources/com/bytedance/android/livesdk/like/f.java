package com.bytedance.android.livesdk.like;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LikeHelper f18332a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f18333b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18334c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18335d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18336e;

    /* renamed from: f  reason: collision with root package name */
    private final DataChannel f18337f;

    static {
        Covode.recordClassIndex(10321);
    }

    f(LikeHelper likeHelper, Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
        this.f18332a = likeHelper;
        this.f18333b = room;
        this.f18334c = z;
        this.f18335d = z2;
        this.f18336e = z3;
        this.f18337f = dataChannel;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return this.f18332a.a(this.f18333b, this.f18334c, this.f18335d, this.f18336e, this.f18337f, (Room) obj);
    }
}
