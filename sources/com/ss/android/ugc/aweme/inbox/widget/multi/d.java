package com.ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;

public final class d extends k {

    /* renamed from: a  reason: collision with root package name */
    public final int f104453a;

    static {
        Covode.recordClassIndex(66887);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.k
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && this.f104453a == ((d) obj).f104453a;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.k
    public final int hashCode() {
        return this.f104453a;
    }

    public final String toString() {
        return "FollowRequestPod(followRequestTotal=" + this.f104453a + ")";
    }

    private /* synthetic */ d() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.k
    public final boolean a() {
        if (this.f104453a > 0) {
            return true;
        }
        return false;
    }

    public d(int i2) {
        super(13);
        this.f104453a = i2;
    }
}
