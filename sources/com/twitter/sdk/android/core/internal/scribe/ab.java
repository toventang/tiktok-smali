package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class ab extends v {
    @c(a = "language")

    /* renamed from: f  reason: collision with root package name */
    public final String f156047f;
    @c(a = "event_info")

    /* renamed from: g  reason: collision with root package name */
    public final String f156048g;
    @c(a = "external_ids")

    /* renamed from: h  reason: collision with root package name */
    public final a f156049h;

    static {
        Covode.recordClassIndex(103671);
    }

    public class a {
        @c(a = "6")

        /* renamed from: a  reason: collision with root package name */
        public final String f156050a;

        static {
            Covode.recordClassIndex(103672);
        }

        public a(String str) {
            this.f156050a = str;
        }
    }

    public ab(e eVar, String str, long j2, String str2, String str3, List<Object> list) {
        super("tfw_client_event", eVar, j2, list);
        this.f156047f = str2;
        this.f156048g = str;
        this.f156049h = new a(str3);
    }
}
