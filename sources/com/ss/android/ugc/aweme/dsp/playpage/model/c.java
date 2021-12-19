package com.ss.android.ugc.aweme.dsp.playpage.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f83738a;

    static {
        Covode.recordClassIndex(52240);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && this.f83738a == ((c) obj).f83738a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f83738a;
    }

    public final String toString() {
        return "MDQueueCurrentTitleItem(from=" + this.f83738a + ")";
    }

    public c(int i2) {
        this.f83738a = i2;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }
}
