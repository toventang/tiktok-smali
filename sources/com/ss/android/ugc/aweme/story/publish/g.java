package com.ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduleInfo f138140a;

    /* renamed from: b  reason: collision with root package name */
    public final e f138141b;

    static {
        Covode.recordClassIndex(90337);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f138140a, gVar.f138140a) && l.a(this.f138141b, gVar.f138141b);
    }

    public final int hashCode() {
        ScheduleInfo scheduleInfo = this.f138140a;
        int i2 = 0;
        int hashCode = (scheduleInfo != null ? scheduleInfo.hashCode() : 0) * 31;
        e eVar = this.f138141b;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StoryPublishScheduleInfo(scheduleInfo=" + this.f138140a + ", data=" + this.f138141b + ")";
    }

    public /* synthetic */ g(ScheduleInfo scheduleInfo) {
        this(scheduleInfo, new e());
    }

    private g(ScheduleInfo scheduleInfo, e eVar) {
        l.d(scheduleInfo, "");
        l.d(eVar, "");
        this.f138140a = scheduleInfo;
        this.f138141b = eVar;
    }
}
