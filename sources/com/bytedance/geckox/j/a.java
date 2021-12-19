package com.bytedance.geckox.j;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import java.io.Serializable;

public final class a implements Serializable {
    public boolean allowUpdate;
    public long lastReadTimeStamp;

    static {
        Covode.recordClassIndex(17343);
    }

    public a(long j2, boolean z) {
        this.lastReadTimeStamp = j2;
        this.allowUpdate = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(long j2, boolean z, int i2, g gVar) {
        this(j2, (i2 & 2) != 0 ? true : z);
    }
}
