package com.ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class TaskCandidate implements Serializable {
    @c(a = "cover_url")
    private final String coverUrl;
    @c(a = "subtitle_id")
    private final String subtitleId;

    static {
        Covode.recordClassIndex(58869);
    }

    public TaskCandidate() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ TaskCandidate copy$default(TaskCandidate taskCandidate, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = taskCandidate.coverUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = taskCandidate.subtitleId;
        }
        return taskCandidate.copy(str, str2);
    }

    public final String component1() {
        return this.coverUrl;
    }

    public final String component2() {
        return this.subtitleId;
    }

    public final TaskCandidate copy(String str, String str2) {
        return new TaskCandidate(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskCandidate)) {
            return false;
        }
        TaskCandidate taskCandidate = (TaskCandidate) obj;
        return l.a(this.coverUrl, taskCandidate.coverUrl) && l.a(this.subtitleId, taskCandidate.subtitleId);
    }

    public final int hashCode() {
        String str = this.coverUrl;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtitleId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TaskCandidate(coverUrl=" + this.coverUrl + ", subtitleId=" + this.subtitleId + ")";
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getSubtitleId() {
        return this.subtitleId;
    }

    public TaskCandidate(String str, String str2) {
        this.coverUrl = str;
        this.subtitleId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaskCandidate(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
