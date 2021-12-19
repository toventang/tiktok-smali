package com.ss.android.ugc.aweme.specact.pendant.c.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.specact.pendant.c.b;
import com.ss.android.ugc.aweme.specact.pendant.c.c;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final C3484a f134182a = new C3484a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Keva f134183b = Keva.getRepo("specact.pendant.bubble.BubbleManager");

    /* renamed from: c  reason: collision with root package name */
    private k.e f134184c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f134185d;

    static {
        Covode.recordClassIndex(87759);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.a$a  reason: collision with other inner class name */
    public static final class C3484a {
        static {
            Covode.recordClassIndex(87760);
        }

        private C3484a() {
        }

        public /* synthetic */ C3484a(byte b2) {
            this();
        }
    }

    private final int a(k.e eVar) {
        return this.f134183b.getInt(eVar.f134468a + "_bubble_show_num", 0);
    }

    private final long b(k.e eVar) {
        return this.f134183b.getLong(eVar.f134468a + "_bubble_last_show_time", 0);
    }

    private final boolean c(k.e eVar) {
        return this.f134183b.getBoolean(eVar.f134468a + "_pendant_click_time", false);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(String str) {
        k.e eVar;
        l.d(str, "");
        if (l.a((Object) str, (Object) "CLICK_DYNAMIC_PENDANT") && (eVar = this.f134184c) != null) {
            this.f134183b.storeBoolean(eVar.f134468a + "_pendant_click_time", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(k.c cVar) {
        k.e eVar;
        String str;
        k.e eVar2;
        k.e eVar3;
        String str2;
        String str3;
        String str4 = null;
        if (cVar != null) {
            eVar = cVar.f134456d;
        } else {
            eVar = null;
        }
        this.f134184c = eVar;
        if (eVar != null) {
            str = eVar.f134468a;
        } else {
            str = null;
        }
        if ((str == null || str.length() == 0) && (((eVar2 = this.f134184c) == null || (str3 = eVar2.f134469b) == null || str3.length() == 0) && ((eVar3 = this.f134184c) == null || (str2 = eVar3.f134470c) == null || str2.length() == 0))) {
            b.a("V1Bubble.onSettingSynced  something is null or empty");
            this.f134185d = false;
            return;
        }
        k.e eVar4 = this.f134184c;
        if (eVar4 != null) {
            StringBuilder sb = new StringBuilder("V1Bubble.onSettingSynced :bubbleId:");
            k.e eVar5 = this.f134184c;
            if (eVar5 != null) {
                str4 = eVar5.f134468a;
            }
            b.a(sb.append(str4).toString());
            Keva keva = this.f134183b;
            l.b(keva, "");
            if (keva.getAll().size() > 1000) {
                long b2 = b(eVar4);
                int a2 = a(eVar4);
                boolean c2 = c(eVar4);
                this.f134183b.clear();
                b.a("V1Bubble.onSettingSynced clear keva");
                this.f134183b.storeInt(eVar4.f134468a + "_bubble_last_show_time", a2);
                this.f134183b.storeLong(eVar4.f134468a + "_pendant_click_time", b2);
                this.f134183b.storeBoolean(eVar4.f134468a + "_pendant_click_time", c2);
            }
            int a3 = a(eVar4);
            if (a3 == 0) {
                this.f134185d = true;
                b.a("V1Bubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (a3 != 1) {
                b.a("V1Bubble.onSettingSynced showTimes:" + a3 + ",  needShow:false");
            } else if (c(eVar4)) {
                b.a("V1Bubble.onSettingSynced  Have to click,  needShow:false");
            } else if (System.currentTimeMillis() - b(eVar4) > TimeUnit.DAYS.toMillis((long) eVar4.f134472e)) {
                this.f134185d = true;
                b.a("V1Bubble.onSettingSynced showTimes:1, Time is not,  needShow:true");
            } else {
                b.a("V1Bubble.onSettingSynced showTimes:1, Time is not,  needShow:false");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r1 == null) goto L_0x003b;
     */
    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.specact.pendant.e.a r8, int r9) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.pendant.c.e.a.a(com.ss.android.ugc.aweme.specact.pendant.e.a, int):boolean");
    }
}
