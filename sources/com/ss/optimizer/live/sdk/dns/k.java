package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f151760a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f151761b;

    /* renamed from: c  reason: collision with root package name */
    public final long f151762c = 0;

    static {
        Covode.recordClassIndex(101218);
    }

    public final String toString() {
        String str = "\"" + this.f151760a + "\":[";
        if (this.f151761b != null) {
            for (int i2 = 0; i2 < this.f151761b.size(); i2++) {
                str = str + "\"" + this.f151761b.get(i2) + "\"";
                if (i2 != this.f151761b.size() - 1) {
                    str = str + ",";
                }
            }
        }
        return str + "]";
    }

    public k(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.f151761b = arrayList;
        this.f151760a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
