package com.ss.android.ugc.aweme.ecommerce.ordercenter.event;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class i extends com.ss.android.ugc.aweme.ecommerce.track.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86241a = new a((byte) 0);

    static {
        Covode.recordClassIndex(53969);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53970);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        l.d(str, "");
        LinkedHashMap<String, Object> linkedHashMap = this.f87523k;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "Personal_Home_Page");
    }
}
