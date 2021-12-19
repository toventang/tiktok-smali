package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ah.e;
import com.ss.android.ugc.aweme.df.h;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class gr {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f143023a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f143024b = true;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f143025c = true;

    /* renamed from: d  reason: collision with root package name */
    public static ae f143026d;

    /* renamed from: e  reason: collision with root package name */
    public static final gr f143027e = new gr();

    public static final void a(String str, String str2) {
        a(str, str2, (String) null, (String) null, 12);
    }

    public static final void a(String str, String str2, String str3) {
        a(str, str2, str3, (String) null, 8);
    }

    private gr() {
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, int i2) {
        if ((i2 & 2) != 0) {
            str2 = "-1";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 8) != 0) {
            str4 = "";
        }
        a(str, str2, str3, str4);
    }

    public static final void a() {
        f143023a = true;
        f143024b = true;
        f143025c = true;
    }

    public static final void b() {
        f143023a = false;
        f143024b = false;
        f143025c = false;
    }

    private static void c() {
        if (f143026d == null) {
            throw new IllegalStateException("behavior reporter not init");
        }
    }

    static {
        Covode.recordClassIndex(93605);
    }

    public static final void a(String str) {
        l.d(str, "");
        g(str);
    }

    public static final void b(String str) {
        l.d(str, "");
        g(str);
    }

    public static final void c(String str) {
        l.d(str, "");
        a("-1", BehaviorType.FAILED, "CK", str, null, 16);
    }

    public static final void d(String str) {
        l.d(str, "");
        a(str, BehaviorType.SUCCESS, "UP", null, null, 24);
    }

    public static final void e(String str) {
        l.d(str, "");
        a(str, BehaviorType.SUCCESS, "CA", null, null, 24);
    }

    public static final void f(String str) {
        l.d(str, "");
        a(str, BehaviorType.EVENT, "CP", null, null, 24);
    }

    private static void g(String str) {
        c();
        try {
            ae aeVar = f143026d;
            if (aeVar == null) {
                l.b();
            }
            aeVar.a(str);
            q.a("RuntimeBehaviorManager---> EventType : ".concat(String.valueOf(str)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a(str, BehaviorType.SUCCESS, "AK", "", str2);
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a(str, BehaviorType.START, "SN", "", str2);
    }

    public static final void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a(str, BehaviorType.SUCCESS, "SN", "", str2);
    }

    public static final void a(String str, int i2, String str2) {
        l.d(str, "");
        BehaviorType behaviorType = BehaviorType.FAILED;
        String valueOf = String.valueOf(i2);
        if (str2 == null) {
            str2 = "";
        }
        a(str, behaviorType, "SN", valueOf, str2);
    }

    public static final void b(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a(str, BehaviorType.FAILED, "UP", String.valueOf(i2), str2);
    }

    public static final void c(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a(str, BehaviorType.FAILED, "CA", e.a(i2), null, 16);
    }

    private static void b(String str, String str2, String str3) {
        try {
            ae aeVar = f143026d;
            if (aeVar == null) {
                l.b();
            }
            aeVar.a(str, str2);
            q.a("RuntimeBehaviorManager---> EventType : " + str + " , code : " + str2 + " , msg : " + str3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void a(String str, int i2, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        BehaviorType behaviorType = BehaviorType.FAILED;
        String valueOf = String.valueOf(i2);
        if (str3 == null) {
            str3 = "";
        }
        a(str, behaviorType, "AK", valueOf, str3);
    }

    private static void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (str4 == null || str4.length() == 0) {
            b(str, str2, str3);
        } else {
            b(str, str2 + '-' + str4, str3);
        }
    }

    public static void a(String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        try {
            ae aeVar = f143026d;
            if (aeVar == null) {
                l.b();
            }
            String b2 = h.a().b(new PublishBehaviorModel(System.currentTimeMillis(), str, behaviorType, str2, str3, str4));
            l.b(b2, "");
            aeVar.a("publish", b2);
            q.a("RuntimeBehaviorManager|id:" + str + " type:" + behaviorType + " stage:" + str2 + " code:" + str3 + " info:" + str4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void a(String str, BehaviorType behaviorType, String str2, String str3, String str4, int i2) {
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        a(str, behaviorType, str2, str3, str4);
    }
}
