package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84781a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f84782b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f84783c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f84784d;

    static {
        Covode.recordClassIndex(52986);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52987);
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
        String str2 = this.f84782b;
        if (str2 != null) {
            hashMap.put("error_code", str2);
        }
        String str3 = "yes";
        if (this.f84783c) {
            str = str3;
        } else {
            str = "no";
        }
        hashMap.put("is_retry", str);
        if (!this.f84784d) {
            str3 = "no";
        }
        hashMap.put("is_first_enter", str3);
        return hashMap;
    }

    public g(String str, boolean z, boolean z2) {
        super("tiktokec_order_submit_load_fail");
        this.f84782b = str;
        this.f84783c = z;
        this.f84784d = z2;
    }
}
