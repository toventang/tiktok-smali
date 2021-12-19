package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.publish.a.a;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import java.util.Objects;

public final class ee extends RuntimeException {
    private a cancelCause = b.a.a().a();
    private final SynthetiseResult result;

    static {
        Covode.recordClassIndex(84208);
    }

    public final a getCancelCause() {
        return this.cancelCause;
    }

    public final SynthetiseResult getResult() {
        return this.result;
    }

    public final int getCode() {
        return this.result.ret;
    }

    public final void setCancelCause(a aVar) {
        this.cancelCause = (a) Objects.requireNonNull(aVar);
    }

    public ee(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.result = synthetiseResult;
    }

    public ee(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.result = synthetiseResult;
    }
}
