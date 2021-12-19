package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class LiveMessage {
    @c(a = "live_message")
    public final List<CombineLiveNotice> liveNotice;

    static {
        Covode.recordClassIndex(72802);
    }

    public LiveMessage() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notification.bean.LiveMessage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveMessage copy$default(LiveMessage liveMessage, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = liveMessage.liveNotice;
        }
        return liveMessage.copy(list);
    }

    public final LiveMessage copy(List<CombineLiveNotice> list) {
        return new LiveMessage(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveMessage) && l.a(this.liveNotice, ((LiveMessage) obj).liveNotice);
        }
        return true;
    }

    public final int hashCode() {
        List<CombineLiveNotice> list = this.liveNotice;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LiveMessage(liveNotice=" + this.liveNotice + ")";
    }

    public LiveMessage(List<CombineLiveNotice> list) {
        this.liveNotice = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveMessage(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list);
    }
}
