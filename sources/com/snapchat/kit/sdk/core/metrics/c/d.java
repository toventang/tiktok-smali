package com.snapchat.kit.sdk.core.metrics.c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.b;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;

public final class d implements MetricQueue<ServerEvent> {

    /* renamed from: a  reason: collision with root package name */
    private final i f57173a;

    /* renamed from: b  reason: collision with root package name */
    private final b<ServerEvent> f57174b;

    static {
        Covode.recordClassIndex(35624);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.snapchat.kit.sdk.core.metrics.MetricQueue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void push(com.snapchat.kit.sdk.core.metrics.model.ServerEvent r8) {
        /*
            r7 = this;
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent r8 = (com.snapchat.kit.sdk.core.metrics.model.ServerEvent) r8
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder r6 = r8.newBuilder()
            com.snapchat.kit.sdk.core.metrics.c.i r2 = r7.f57173a
            long r4 = r2.f57183b
            r0 = 1
            long r4 = r4 + r0
            r2.f57183b = r4
            android.content.SharedPreferences r0 = r2.f57182a
            android.content.SharedPreferences$Editor r3 = r0.edit()
            long r1 = r2.f57183b
            java.lang.String r0 = "sequence_id_max"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            r0.apply()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder r1 = r6.sequence_id(r0)
            java.lang.String r0 = "Android"
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder r1 = r1.os_type(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = ""
        L_0x0034:
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder r0 = r1.os_version(r0)
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent r1 = r0.build()
            com.snapchat.kit.sdk.core.metrics.b<com.snapchat.kit.sdk.core.metrics.model.ServerEvent> r0 = r7.f57174b
            r0.push(r1)
            return
        L_0x0042:
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.c.d.push(java.lang.Object):void");
    }

    d(i iVar, b<ServerEvent> bVar) {
        this.f57173a = iVar;
        this.f57174b = bVar;
    }
}
