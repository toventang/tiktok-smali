package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Map;

public final class j extends BaseResponse implements d {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public a f108405a;

    /* renamed from: b  reason: collision with root package name */
    private String f108406b;

    static {
        Covode.recordClassIndex(69452);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.f108406b;
    }

    public static class a {
        @c(a = "room_id")

        /* renamed from: a  reason: collision with root package name */
        public Map<Long, Long> f108407a;

        static {
            Covode.recordClassIndex(69453);
        }

        public final Map<Long, Long> a() {
            Map<Long, Long> map = this.f108407a;
            if (map == null) {
                return new HashMap(0);
            }
            return map;
        }
    }

    public final Map<Long, Long> a() {
        a aVar = this.f108405a;
        if (aVar == null) {
            return new HashMap(0);
        }
        return aVar.a();
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.f108406b = str;
    }
}
