package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class f extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84777a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final long f84778b;

    /* renamed from: c  reason: collision with root package name */
    private final long f84779c;

    /* renamed from: d  reason: collision with root package name */
    private final int f84780d;

    static {
        Covode.recordClassIndex(52984);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52985);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.i
    public final HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> a2 = super.a();
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        hashMap.put("duration", Long.valueOf(this.f84778b));
        hashMap.put("api_duration", Long.valueOf(this.f84779c));
        hashMap.put("retry_count", Integer.valueOf(this.f84780d));
        return hashMap;
    }

    public f(long j2, long j3, int i2) {
        super("rd_tiktokec_anchor_order_submit_duration");
        this.f84778b = j2;
        this.f84779c = j3;
        this.f84780d = i2;
    }
}
