package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ClickSearchResponse {
    @c(a = "log_pb")
    public final LogPbBean logPbBean;
    @c(a = "sug_word_list")
    public final List<ClickSearchWord> wordsList;

    static {
        Covode.recordClassIndex(50986);
    }

    public ClickSearchResponse() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClickSearchResponse copy$default(ClickSearchResponse clickSearchResponse, List list, LogPbBean logPbBean2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = clickSearchResponse.wordsList;
        }
        if ((i2 & 2) != 0) {
            logPbBean2 = clickSearchResponse.logPbBean;
        }
        return clickSearchResponse.copy(list, logPbBean2);
    }

    public final ClickSearchResponse copy(List<ClickSearchWord> list, LogPbBean logPbBean2) {
        return new ClickSearchResponse(list, logPbBean2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickSearchResponse)) {
            return false;
        }
        ClickSearchResponse clickSearchResponse = (ClickSearchResponse) obj;
        return l.a(this.wordsList, clickSearchResponse.wordsList) && l.a(this.logPbBean, clickSearchResponse.logPbBean);
    }

    public final int hashCode() {
        List<ClickSearchWord> list = this.wordsList;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean2 = this.logPbBean;
        if (logPbBean2 != null) {
            i2 = logPbBean2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ClickSearchResponse(wordsList=" + this.wordsList + ", logPbBean=" + this.logPbBean + ")";
    }

    public ClickSearchResponse(List<ClickSearchWord> list, LogPbBean logPbBean2) {
        this.wordsList = list;
        this.logPbBean = logPbBean2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClickSearchResponse(List list, LogPbBean logPbBean2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : logPbBean2);
    }
}
