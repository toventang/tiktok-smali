package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;

public final class ReferenceInfoHint implements Serializable {
    @c(a = "content")
    private final String content;
    @c(a = "refmsg_content")
    private final String refmsg_content;
    @c(a = "refmsg_sec_uid")
    private final String refmsg_sec_uid;
    @c(a = "refmsg_type")
    private final int refmsg_type;
    @c(a = "refmsg_uid")
    private final String refmsg_uid;

    static {
        Covode.recordClassIndex(64056);
    }

    public ReferenceInfoHint() {
        this(null, null, null, 0, null, 31, null);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRefmsg_content() {
        return this.refmsg_content;
    }

    public final String getRefmsg_sec_uid() {
        return this.refmsg_sec_uid;
    }

    public final int getRefmsg_type() {
        return this.refmsg_type;
    }

    public final String getRefmsg_uid() {
        return this.refmsg_uid;
    }

    public final BaseContent getParsedContent() {
        long j2;
        b.f fVar = b.Companion;
        int i2 = this.refmsg_type;
        String str = this.refmsg_content;
        Long g2 = p.g(this.refmsg_uid);
        if (g2 != null) {
            j2 = g2.longValue();
        } else {
            j2 = 0;
        }
        return fVar.a(i2, str, false, j2);
    }

    public ReferenceInfoHint(String str, String str2, String str3, int i2, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.content = str;
        this.refmsg_uid = str2;
        this.refmsg_sec_uid = str3;
        this.refmsg_type = i2;
        this.refmsg_content = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReferenceInfoHint(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r3 = r9
            r4 = r10
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001b
            r0 = -1
            r4 = -1
        L_0x001b:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0024
        L_0x001f:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0024:
            r5 = r11
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, h.f.b.g):void");
    }
}
