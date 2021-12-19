package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ShareReportResult {
    @c(a = "delta_intimacy")
    private long deltaIntimacy;
    @c(a = "display_text")
    private b displayText;

    static {
        Covode.recordClassIndex(8665);
    }

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public b getDisplayText() {
        return this.displayText;
    }

    @c(a = "delta_intimacy")
    public void setDeltaIntimacy(long j2) {
        this.deltaIntimacy = j2;
    }

    @c(a = "display_text")
    public void setDisplayText(b bVar) {
        this.displayText = bVar;
    }
}
