package com.bytedance.z.a.b.c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b implements com.bytedance.z.a.c.b {

    /* renamed from: a  reason: collision with root package name */
    public List<LinkedHashMap<Long, Long>> f46281a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f46282b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f46283c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f46284d = 0;

    static {
        Covode.recordClassIndex(28257);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cputime:{deltaTime:").append(this.f46282b).append(" totaltime:").append(a()).append("}");
        return sb.toString();
    }

    public final long a() {
        if (this.f46284d == 0 && !this.f46281a.isEmpty()) {
            for (LinkedHashMap<Long, Long> linkedHashMap : this.f46281a) {
                for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                    this.f46284d += entry.getValue().longValue();
                }
            }
        }
        return this.f46284d;
    }
}
