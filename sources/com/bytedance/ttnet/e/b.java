package com.bytedance.ttnet.e;

import com.bytedance.covode.number.Covode;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f44595a;

    /* renamed from: b  reason: collision with root package name */
    public int f44596b;

    /* renamed from: c  reason: collision with root package name */
    public String f44597c = UUID.randomUUID().toString();

    /* renamed from: d  reason: collision with root package name */
    public CountDownLatch f44598d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    public c f44599e;

    static {
        Covode.recordClassIndex(27283);
    }

    public b(String str, int i2) {
        this.f44595a = str;
        this.f44596b = i2;
    }
}
