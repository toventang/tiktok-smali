package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84773a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f84774b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f84775c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f84776d = null;

    static {
        Covode.recordClassIndex(52981);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52982);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("button_for", this.f84774b);
        Boolean bool = this.f84775c;
        String str2 = "yes";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "no";
            }
            hashMap.put("is_address_deliverable", str);
        }
        Boolean bool2 = this.f84776d;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "no";
            }
            hashMap.put("is_delivery_info_complete", str2);
        }
        return hashMap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, Boolean bool, Boolean bool2) {
        super("tiktokec_order_submit_button_click");
        l.d(str, "");
        this.f84774b = str;
        this.f84775c = bool;
    }
}
