package com.ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.social.service.IRelationExtService;
import com.ss.android.ugc.b;

public final class RelationExtService implements IRelationExtService {
    static {
        Covode.recordClassIndex(87453);
    }

    public static IRelationExtService a() {
        MethodCollector.i(13822);
        Object a2 = b.a(IRelationExtService.class, false);
        if (a2 != null) {
            IRelationExtService iRelationExtService = (IRelationExtService) a2;
            MethodCollector.o(13822);
            return iRelationExtService;
        }
        if (b.ei == null) {
            synchronized (IRelationExtService.class) {
                try {
                    if (b.ei == null) {
                        b.ei = new RelationExtService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13822);
                    throw th;
                }
            }
        }
        RelationExtService relationExtService = (RelationExtService) b.ei;
        MethodCollector.o(13822);
        return relationExtService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r12 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        r6 = r0.component1();
        r7 = r0.component2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (r7.length() != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (h.m.p.a((java.lang.CharSequence) r6, (java.lang.CharSequence) "%s", false) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r9.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r14 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r8 = r14.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r8 >= 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        r9.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        r8 = r11.getMaxWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r1 = com.a.a(r6, java.util.Arrays.copyOf(new java.lang.Object[]{r7}, 1));
        h.f.b.l.b(r1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (com.ss.android.ugc.aweme.social.d.a.a(r11, r1, r8) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        h.f.b.l.d(r1, "");
        r9.a(new com.bytedance.ies.dmt.ui.d.a.C0730a().a(r1).f33382a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        b.i.b(new com.ss.android.ugc.aweme.social.d.a.c(r11, r6, r7, r8, r9), b.i.f4824a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    @Override // com.ss.android.ugc.aweme.social.service.IRelationExtService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.tux.input.TuxTextView r11, com.ss.android.ugc.aweme.profile.model.User r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.Integer r14) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.ext.RelationExtService.a(com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):void");
    }
}
