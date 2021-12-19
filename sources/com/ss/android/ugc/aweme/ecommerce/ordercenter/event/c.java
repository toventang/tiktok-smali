package com.ss.android.ugc.aweme.ecommerce.ordercenter.event;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class c extends com.ss.android.ugc.aweme.ecommerce.track.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86234b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private long f86235a;

    static {
        Covode.recordClassIndex(53957);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53958);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return new HashMap<>();
    }

    public final c b() {
        this.f86235a = SystemClock.uptimeMillis();
        return this;
    }

    public final c c() {
        if (this.f86235a > 0) {
            this.f87523k.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f86235a));
            this.f86235a = 0;
        }
        return this;
    }

    public final c a(String str) {
        l.d(str, "");
        this.f87523k.put("previous_page", str);
        return this;
    }

    public final c b(String str) {
        l.d(str, "");
        this.f87523k.put("tab_name", str);
        return this;
    }

    public final c c(String str) {
        l.d(str, "");
        this.f87523k.put("tab_id", str);
        return this;
    }

    public final c d(String str) {
        l.d(str, "");
        this.f87523k.put("button_for", str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        l.d(str, "");
        LinkedHashMap<String, Object> linkedHashMap = this.f87523k;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "ecommerce_centre_page");
    }
}
