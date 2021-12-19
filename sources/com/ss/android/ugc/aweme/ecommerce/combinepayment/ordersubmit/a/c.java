package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class c extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84768a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f84769b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f84770c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f84771d;

    /* renamed from: e  reason: collision with root package name */
    private final String f84772e;

    static {
        Covode.recordClassIndex(52979);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52980);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.i
    public final HashMap<String, Object> a() {
        String str;
        String str2;
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> a2 = super.a();
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        String str3 = "yes";
        if (this.f84769b) {
            str = str3;
        } else {
            str = "no";
        }
        hashMap.put("is_retry", str);
        if (this.f84770c) {
            str2 = str3;
        } else {
            str2 = "no";
        }
        hashMap.put("is_success", str2);
        Boolean bool = this.f84771d;
        if (bool != null) {
            if (!bool.booleanValue()) {
                str3 = "no";
            }
            hashMap.put("is_incomplete_data", str3);
        }
        String str4 = this.f84772e;
        if (str4 != null) {
            hashMap.put("error_code", str4);
        }
        return hashMap;
    }

    public c(boolean z, boolean z2, Boolean bool, String str) {
        super("rd_tiktokec_first_bill_info_request_result");
        this.f84769b = z;
        this.f84770c = z2;
        this.f84771d = bool;
        this.f84772e = str;
    }
}
