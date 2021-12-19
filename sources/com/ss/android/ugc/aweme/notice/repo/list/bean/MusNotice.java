package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public class MusNotice extends BaseNotice {
    private transient long generatedUniqueId;
    private transient long hackedUniqueId;
    private final transient boolean isMock;

    static {
        Covode.recordClassIndex(72533);
    }

    public MusNotice() {
        this(false, 1, null);
    }

    public final boolean isMock() {
        return this.isMock;
    }

    public final long getUniqueId() {
        long j2 = this.hackedUniqueId;
        if (j2 > 0) {
            return j2;
        }
        return getGeneratedUniqueId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 != 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long getGeneratedUniqueId() {
        /*
            r5 = this;
            long r1 = r5.generatedUniqueId
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = r5.nid
            if (r0 == 0) goto L_0x001f
            java.lang.Long r0 = h.m.p.g(r0)
            if (r0 == 0) goto L_0x001f
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
        L_0x001a:
            r5.generatedUniqueId = r1
        L_0x001c:
            long r0 = r5.generatedUniqueId
            return r0
        L_0x001f:
            int r0 = r5.hashCode()
            long r1 = (long) r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice.getGeneratedUniqueId():long");
    }

    public final void hackUniqueId(long j2) {
        this.hackedUniqueId = j2;
    }

    public MusNotice(boolean z) {
        this.isMock = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusNotice(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
