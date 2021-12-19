package com.bytedance.ies.xbridge.platform.lynx.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.l;
import com.lynx.react.bridge.ReadableMapKeySetIterator;

public final class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMapKeySetIterator f36409a;

    static {
        Covode.recordClassIndex(21815);
    }

    @Override // com.bytedance.ies.xbridge.l
    public final boolean a() {
        return this.f36409a.hasNextKey();
    }

    @Override // com.bytedance.ies.xbridge.l
    public final String b() {
        String nextKey = this.f36409a.nextKey();
        h.f.b.l.a((Object) nextKey, "");
        return nextKey;
    }

    public c(ReadableMapKeySetIterator readableMapKeySetIterator) {
        h.f.b.l.c(readableMapKeySetIterator, "");
        this.f36409a = readableMapKeySetIterator;
    }
}
