package com.ss.ugc.live.a.a.c;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.b.a;

public final class c extends a {
    private a mDownloadRequest;
    private int mErrorCode;

    static {
        Covode.recordClassIndex(102706);
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // com.ss.ugc.live.a.a.c.a
    public final String getMessage() {
        return this.mDownloadRequest.toString() + "\n" + super.getMessage();
    }

    public c(com.ss.ugc.live.a.a.c cVar, int i2, a aVar) {
        super(cVar);
        this.mErrorCode = i2;
        this.mDownloadRequest = aVar;
    }

    public c(String str, com.ss.ugc.live.a.a.c cVar, int i2, a aVar) {
        super(str, cVar);
        this.mErrorCode = i2;
        this.mDownloadRequest = aVar;
    }

    public c(String str, Throwable th, com.ss.ugc.live.a.a.c cVar, int i2, a aVar) {
        super(str, th, cVar);
        this.mErrorCode = i2;
        this.mDownloadRequest = aVar;
    }
}
