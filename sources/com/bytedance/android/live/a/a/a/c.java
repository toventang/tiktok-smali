package com.bytedance.android.live.a.a.a;

import com.bytedance.android.live.network.response.b;
import com.bytedance.covode.number.Covode;

public final class c extends a {
    private b mResponse;

    static {
        Covode.recordClassIndex(3517);
    }

    public final b getResponse() {
        return this.mResponse;
    }

    public c() {
        super(-2);
    }

    @Override // com.bytedance.android.live.a.a.a, com.bytedance.android.live.a.a.a.a
    public final String getMessage() {
        return " TYPE = ResponseNoDataException " + super.getMessage();
    }

    public c(b bVar) {
        super(-2);
        this.mResponse = bVar;
    }
}
