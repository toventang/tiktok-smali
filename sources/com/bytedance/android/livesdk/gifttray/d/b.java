package com.bytedance.android.livesdk.gifttray.d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gifttray.a.a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPerformanceSettings;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18076a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(10023);
    }

    public static long c(a aVar) {
        y yVar;
        com.bytedance.android.livesdkapi.h.b bVar;
        if (aVar == null || (yVar = aVar.C) == null || (bVar = yVar.O) == null) {
            return 0;
        }
        return bVar.f23209a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r2 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(com.bytedance.android.livesdk.gifttray.a.a r2) {
        /*
            r1 = 0
            if (r2 == 0) goto L_0x0011
            com.bytedance.android.livesdk.model.message.y r0 = r2.C
            if (r0 == 0) goto L_0x0011
            com.bytedance.android.livesdk.model.u r0 = r0.t
            if (r0 == 0) goto L_0x0011
            int r0 = r0.f19763f
        L_0x000d:
            int r1 = r2.f17997d
        L_0x000f:
            int r0 = r0 * r1
            return r0
        L_0x0011:
            r0 = 0
            if (r2 == 0) goto L_0x000f
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.d.b.b(com.bytedance.android.livesdk.gifttray.a.a):int");
    }

    public static boolean a(a aVar) {
        y yVar;
        u uVar;
        Integer valueOf;
        if (aVar == null) {
            return false;
        }
        if (aVar.f17996c == a.EnumC0374a.VIDEO_ONLY) {
            return true;
        }
        if (aVar.f17996c == a.EnumC0374a.TRAY_ONLY || (yVar = aVar.C) == null || (uVar = yVar.t) == null || (valueOf = Integer.valueOf(uVar.f19762e)) == null || (valueOf.intValue() != 2 && valueOf.intValue() != 8)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r2 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence a(com.bytedance.android.livesdk.model.message.c.b r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0044
            java.lang.String r0 = r5.f19421a
        L_0x0005:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x003c
            com.bytedance.android.livesdk.i18n.b r1 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r0 = r5.f19421a
            java.lang.String r0 = r1.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003e
            com.bytedance.android.livesdk.i18n.b r1 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r0 = r5.f19421a
            java.lang.String r2 = r1.a(r0)
            h.f.b.l.b(r2, r3)
        L_0x0026:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0046
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.f.c.a(r2, r5, r4)
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.f.c.f15496a
            if (r1 == r0) goto L_0x0046
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.f.c.a(r2, r5, r4)
            h.f.b.l.b(r0, r3)
            return r0
        L_0x003c:
            if (r5 == 0) goto L_0x0042
        L_0x003e:
            java.lang.String r2 = r5.f19422b
            if (r2 != 0) goto L_0x0026
        L_0x0042:
            r2 = r3
            goto L_0x0026
        L_0x0044:
            r0 = r4
            goto L_0x0005
        L_0x0046:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.d.b.a(com.bytedance.android.livesdk.model.message.c.b):java.lang.CharSequence");
    }

    public static String d(a aVar) {
        Long l2;
        Long l3;
        Long l4;
        User user;
        User user2;
        l.d(aVar, "");
        StringBuffer stringBuffer = new StringBuffer();
        y yVar = aVar.C;
        Long l5 = null;
        if (yVar != null) {
            l2 = Long.valueOf(yVar.f19707i);
        } else {
            l2 = null;
        }
        stringBuffer.append(l2);
        y yVar2 = aVar.C;
        if (yVar2 == null || (user2 = yVar2.f19705g) == null) {
            l3 = null;
        } else {
            l3 = Long.valueOf(user2.getId());
        }
        stringBuffer.append(l3);
        y yVar3 = aVar.C;
        if (yVar3 == null || (user = yVar3.f19706h) == null) {
            l4 = null;
        } else {
            l4 = Long.valueOf(user.getId());
        }
        stringBuffer.append(l4);
        if (!aVar.A || LiveGiftPerformanceSettings.INSTANCE.useNewSelfQueue()) {
            y yVar4 = aVar.C;
            if (yVar4 != null) {
                l5 = Long.valueOf(yVar4.p);
            }
            stringBuffer.append(l5);
        }
        String stringBuffer2 = stringBuffer.toString();
        l.b(stringBuffer2, "");
        return stringBuffer2;
    }

    public static boolean a(a aVar, a aVar2) {
        if (aVar == null || aVar2 == null || !l.a((Object) d(aVar), (Object) d(aVar2)) || a(aVar) || a(aVar2)) {
            return false;
        }
        return true;
    }
}
