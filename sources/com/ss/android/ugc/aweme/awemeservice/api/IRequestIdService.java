package com.ss.android.ugc.aweme.awemeservice.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public interface IRequestIdService {
    static {
        Covode.recordClassIndex(41649);
    }

    a a(String str);

    String a(Aweme aweme, int i2);

    void a(String str, String str2, int i2);

    JSONObject b(Aweme aweme, int i2);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f67646a;

        /* renamed from: b  reason: collision with root package name */
        public final Integer f67647b;

        static {
            Covode.recordClassIndex(41650);
        }

        public a() {
        }

        public a(String str, int i2) {
            this.f67646a = str;
            this.f67647b = Integer.valueOf(i2);
        }
    }
}
