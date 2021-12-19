package com.bytedance.android.livesdk.manage.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.c;

public final class a extends com.ss.ugc.live.a.a.c.a {
    private com.ss.ugc.live.a.a.b.a mDownloadRequest;
    private int mErrorCode;

    static {
        Covode.recordClassIndex(11227);
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // com.ss.ugc.live.a.a.c.a
    public final String getMessage() {
        return this.mDownloadRequest.toString() + "\n" + super.getMessage();
    }

    public a(String str, Throwable th, c cVar, int i2, com.ss.ugc.live.a.a.b.a aVar) {
        super(str, th, cVar);
        this.mErrorCode = i2;
        this.mDownloadRequest = aVar;
    }
}
