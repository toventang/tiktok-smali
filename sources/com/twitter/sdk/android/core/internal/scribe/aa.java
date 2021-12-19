package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class aa extends v {
    @c(a = "external_ids")

    /* renamed from: f  reason: collision with root package name */
    public final a f156042f;
    @c(a = "device_id_created_at")

    /* renamed from: g  reason: collision with root package name */
    public final long f156043g = 0;
    @c(a = "language")

    /* renamed from: h  reason: collision with root package name */
    public final String f156044h;

    static {
        Covode.recordClassIndex(103669);
    }

    public class a {
        @c(a = "AD_ID")

        /* renamed from: a  reason: collision with root package name */
        public final String f156045a;

        static {
            Covode.recordClassIndex(103670);
        }

        public a(String str) {
            this.f156045a = str;
        }
    }

    public aa(e eVar, long j2, String str, String str2, List<Object> list) {
        super("syndicated_sdk_impression", eVar, j2, list);
        this.f156044h = str;
        this.f156042f = new a(str2);
    }
}
