package com.appsflyer.internal.referrer;

import android.content.Context;
import com.appsflyer.internal.ContentFetcher;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class HuaweiReferrer extends ContentFetcher<Map<String, Object>> {
    public Map<String, Object> map;

    /* renamed from: Ι  reason: contains not printable characters */
    private Runnable f293;

    static {
        Covode.recordClassIndex(2759);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f0, code lost:
        if (0 == 0) goto L_0x00f5;
     */
    @Override // com.appsflyer.internal.ContentFetcher
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> query() {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.referrer.HuaweiReferrer.query():java.util.Map");
    }

    public HuaweiReferrer(Runnable runnable, Context context) {
        super(context, "com.huawei.appmarket.commondata", "ffe391e0ea186d0734ed601e4e70e3224b7309d48e2075bac46d8c667eae7212", 0);
        this.f293 = runnable;
    }
}
