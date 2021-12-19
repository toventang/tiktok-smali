package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final g f136846a;

    /* renamed from: b  reason: collision with root package name */
    public final a f136847b;

    static {
        Covode.recordClassIndex(89435);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f136846a, eVar.f136846a) && l.a(this.f136847b, eVar.f136847b);
    }

    public final int hashCode() {
        g gVar = this.f136846a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        a aVar = this.f136847b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StoryEvent(type=" + this.f136846a + ", params=" + this.f136847b + ")";
    }

    public /* synthetic */ e(g gVar) {
        this(gVar, null);
    }

    public e(g gVar, a aVar) {
        l.d(gVar, "");
        this.f136846a = gVar;
        this.f136847b = aVar;
    }
}
