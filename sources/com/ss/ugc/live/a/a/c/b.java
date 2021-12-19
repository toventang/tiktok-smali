package com.ss.ugc.live.a.a.c;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.c;

public final class b extends a {
    private String mMd5;

    static {
        Covode.recordClassIndex(102705);
    }

    @Override // com.ss.ugc.live.a.a.c.a
    public final String getMessage() {
        return "md5:" + this.mMd5 + "\n" + super.getMessage();
    }

    public b(c cVar, String str) {
        super(cVar);
        this.mMd5 = str;
    }

    public b(String str, c cVar, String str2) {
        super(str, cVar);
        this.mMd5 = str2;
    }

    public b(String str, Throwable th, c cVar, String str2) {
        super(str, th, cVar);
        this.mMd5 = str2;
    }
}
