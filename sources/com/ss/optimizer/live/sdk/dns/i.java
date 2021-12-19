package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import com.ss.optimizer.live.sdk.dns.a.a;
import java.util.List;

/* access modifiers changed from: package-private */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f151753a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f151754b;

    /* renamed from: c  reason: collision with root package name */
    public final float f151755c;

    /* renamed from: d  reason: collision with root package name */
    public final float f151756d;

    static {
        Covode.recordClassIndex(101216);
    }

    i(String str, List<a> list, int i2) {
        this.f151753a = str;
        this.f151754b = list;
        if (list == null || list.isEmpty()) {
            this.f151755c = 1.0f;
            this.f151756d = Float.MAX_VALUE;
            return;
        }
        this.f151755c = 1.0f - ((((float) list.size()) * 1.0f) / ((float) i2));
        float f2 = 0.0f;
        for (a aVar : list) {
            if (aVar != null) {
                f2 += aVar.f151721c;
            }
        }
        this.f151756d = f2 / ((float) list.size());
    }
}
