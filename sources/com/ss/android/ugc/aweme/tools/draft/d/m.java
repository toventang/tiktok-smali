package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m extends c {

    /* renamed from: i  reason: collision with root package name */
    public String f139512i;

    /* renamed from: j  reason: collision with root package name */
    private final int f139513j;

    static {
        Covode.recordClassIndex(91218);
    }

    public m() {
        this(0, null, null, 0, null, null, 127);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.d.a
    public final int a() {
        return this.f139513j;
    }

    public final int hashCode() {
        return ((c) this).f139480c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (mVar.f139513j != this.f139513j || !l.a((Object) ((c) mVar).f139480c, (Object) ((c) this).f139480c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private m(int i2, String str, String str2, long j2, String str3, String str4) {
        super(str, str2, false, j2, str3, null, 32);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f139513j = i2;
        this.f139512i = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(int r9, java.lang.String r10, java.lang.String r11, long r12, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r6 = r14
            r1 = r9
            r3 = r11
            r2 = r10
            r4 = r12
            r0 = r16 & 1
            if (r0 == 0) goto L_0x000b
            r1 = 106(0x6a, float:1.49E-43)
        L_0x000b:
            r0 = r16 & 2
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0012
            r2 = r7
        L_0x0012:
            r0 = r16 & 4
            if (r0 == 0) goto L_0x0017
            r3 = r7
        L_0x0017:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x001d
            r4 = 0
        L_0x001d:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0022
            r6 = r7
        L_0x0022:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x002b
        L_0x0026:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return
        L_0x002b:
            r7 = r15
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.d.m.<init>(int, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int):void");
    }
}
