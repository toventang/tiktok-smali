package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class SuggestWordResponse implements d, g {
    @c(a = "data")
    public final List<TypeWords> data;
    @c(a = "errno")
    public final int errno;
    @c(a = "extra")
    public Extra extra;
    @c(a = "log_id")
    public String logId;
    @c(a = "msg")
    public final String msg;
    private String requestId = "";
    private a<?> requestInfo;

    static {
        Covode.recordClassIndex(50989);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final i getRequestLog() {
        return h.a(this);
    }

    public static final class Extra implements Serializable {
        @c(a = "call_per_refresh")
        private String callPerRefresh;

        static {
            Covode.recordClassIndex(50990);
        }

        public final String getCallPerRefresh() {
            return this.callPerRefresh;
        }

        public final void setCallPerRefresh(String str) {
            this.callPerRefresh = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final a<?> getRequestInfo() {
        return this.requestInfo;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final void setRequestInfo(a<?> aVar) {
        this.requestInfo = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SuggestWordResponse) && l.a(this.data, ((SuggestWordResponse) obj).data)) {
            return true;
        }
        return false;
    }
}
