package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.proto.ClientMetricType;
import java.util.Map;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public ClientMetricType f37813a;

    /* renamed from: b  reason: collision with root package name */
    public String f37814b;

    /* renamed from: c  reason: collision with root package name */
    public long f37815c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f37816d;

    static {
        Covode.recordClassIndex(22711);
    }

    public am(ClientMetricType clientMetricType, String str, long j2, Map<String, String> map) {
        this.f37813a = clientMetricType;
        this.f37814b = str;
        this.f37815c = j2;
        this.f37816d = map;
    }
}
