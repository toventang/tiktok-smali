package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

final class j implements Callable<i> {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f151757a;

    /* renamed from: b  reason: collision with root package name */
    private final String f151758b;

    /* renamed from: c  reason: collision with root package name */
    private final int f151759c = 10;

    static {
        Covode.recordClassIndex(101217);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5 A[SYNTHETIC, Splitter:B:36:0x00a5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.optimizer.live.sdk.dns.i call() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.optimizer.live.sdk.dns.j.call():com.ss.optimizer.live.sdk.dns.i");
    }

    j(String str) {
        this.f151758b = str;
        if (f151757a == null) {
            f151757a = Pattern.compile(".*?icmp_seq=(\\d+).*?ttl=(\\d+).*?time=([\\d^\\.]+|[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*).*?ms");
        }
    }
}
