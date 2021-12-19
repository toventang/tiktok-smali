package com.ss.android.ugc.aweme.services.story.event;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class StoryPublishEvent implements b {
    private final List<ScheduleInfo> scheduleList;
    private final boolean switch2FeedTab;

    static {
        Covode.recordClassIndex(79830);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.services.story.event.StoryPublishEvent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryPublishEvent copy$default(StoryPublishEvent storyPublishEvent, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = storyPublishEvent.scheduleList;
        }
        if ((i2 & 2) != 0) {
            z = storyPublishEvent.switch2FeedTab;
        }
        return storyPublishEvent.copy(list, z);
    }

    public final List<ScheduleInfo> component1() {
        return this.scheduleList;
    }

    public final boolean component2() {
        return this.switch2FeedTab;
    }

    public final StoryPublishEvent copy(List<ScheduleInfo> list, boolean z) {
        l.d(list, "");
        return new StoryPublishEvent(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryPublishEvent)) {
            return false;
        }
        StoryPublishEvent storyPublishEvent = (StoryPublishEvent) obj;
        return l.a(this.scheduleList, storyPublishEvent.scheduleList) && this.switch2FeedTab == storyPublishEvent.switch2FeedTab;
    }

    public final int hashCode() {
        List<ScheduleInfo> list = this.scheduleList;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.switch2FeedTab;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public final String toString() {
        return "StoryPublishEvent(scheduleList=" + this.scheduleList + ", switch2FeedTab=" + this.switch2FeedTab + ")";
    }

    public final List<ScheduleInfo> getScheduleList() {
        return this.scheduleList;
    }

    public final boolean getSwitch2FeedTab() {
        return this.switch2FeedTab;
    }

    public StoryPublishEvent(List<ScheduleInfo> list, boolean z) {
        l.d(list, "");
        this.scheduleList = list;
        this.switch2FeedTab = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryPublishEvent(List list, boolean z, int i2, g gVar) {
        this(list, (i2 & 2) != 0 ? true : z);
    }
}
