package com.ss.android.ugc.aweme.ecommerce.coupon.event;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class a extends com.ss.android.ugc.aweme.ecommerce.track.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2055a f85768a = new C2055a((byte) 0);

    static {
        Covode.recordClassIndex(53632);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.event.a$a  reason: collision with other inner class name */
    public static final class C2055a {
        static {
            Covode.recordClassIndex(53633);
        }

        private C2055a() {
        }

        public /* synthetic */ C2055a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return new HashMap<>();
    }

    public final a a(LinkedHashMap<String, Object> linkedHashMap) {
        l.d(linkedHashMap, "");
        this.f87523k.putAll(linkedHashMap);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        l.d(str, "");
        LinkedHashMap<String, Object> linkedHashMap = this.f87523k;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("coupon_zone", "actionsheet");
        linkedHashMap.put("is_fullscreen", 0);
    }
}
