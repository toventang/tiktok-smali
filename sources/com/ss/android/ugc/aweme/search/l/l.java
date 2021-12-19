package com.ss.android.ugc.aweme.search.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import h.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static long f121431a;

    /* renamed from: b  reason: collision with root package name */
    public static final l f121432b = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(79112);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f121433a;

        static {
            Covode.recordClassIndex(79113);
        }

        public a(long j2) {
            this.f121433a = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost", this.f121433a);
            com.ss.android.common.c.a.a("search_page_launch_event", jSONObject);
            o.a("search_page_launch_event", jSONObject);
            return z.f158842a;
        }
    }
}
