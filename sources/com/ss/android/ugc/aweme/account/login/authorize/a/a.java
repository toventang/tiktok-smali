package com.ss.android.ugc.aweme.account.login.authorize.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.s;
import com.ss.android.ugc.aweme.common.r;

public final class a {
    static {
        Covode.recordClassIndex(39038);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f63347a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 39039(0x987f, float:5.4705E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a[] r0 = com.ss.android.ugc.aweme.account.login.authorize.a.a.EnumC1407a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.account.login.authorize.a.a.AnonymousClass1.f63347a = r2
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a r0 = com.ss.android.ugc.aweme.account.login.authorize.a.a.EnumC1407a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.account.login.authorize.a.a.AnonymousClass1.f63347a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a r0 = com.ss.android.ugc.aweme.account.login.authorize.a.a.EnumC1407a.FAILURE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.account.login.authorize.a.a.AnonymousClass1.f63347a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a r0 = com.ss.android.ugc.aweme.account.login.authorize.a.a.EnumC1407a.CANCEL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.a.a.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.a$a  reason: collision with other inner class name */
    public enum EnumC1407a {
        SUCCESS,
        FAILURE,
        CANCEL;

        static {
            Covode.recordClassIndex(39040);
        }
    }

    public static void a(EnumC1407a aVar, String str, String str2) {
        int i2 = AnonymousClass1.f63347a[aVar.ordinal()];
        int i3 = 2;
        if (i2 == 2) {
            i3 = 0;
        } else if (i2 != 3) {
            i3 = 1;
        }
        r.a("token_response", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", s.f63678a).a("enter_from", s.f63679b).a("platform", str2).a("status", i3).a("fail_info", str).a("_perf_monitor", 1).f62575a);
    }
}
