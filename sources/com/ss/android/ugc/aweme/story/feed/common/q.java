package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f137680a;

    /* renamed from: b  reason: collision with root package name */
    public r f137681b;

    static {
        Covode.recordClassIndex(90098);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f137680a, qVar.f137680a) && l.a(this.f137681b, qVar.f137681b);
    }

    public final int hashCode() {
        String str = this.f137680a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        r rVar = this.f137681b;
        if (rVar != null) {
            i2 = rVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StoryLoadingData(aid=" + this.f137680a + ", status=" + this.f137681b + ")";
    }

    private /* synthetic */ q() {
        this("", r.UNLOADING);
    }

    public final void a(r rVar) {
        l.d(rVar, "");
        this.f137681b = rVar;
    }

    public q(String str, r rVar) {
        l.d(str, "");
        l.d(rVar, "");
        this.f137680a = str;
        this.f137681b = rVar;
    }
}
