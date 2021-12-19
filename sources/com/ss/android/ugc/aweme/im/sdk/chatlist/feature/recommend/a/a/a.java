package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.i;
import com.ss.android.ugc.aweme.utils.bo;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f101963c = true;

    /* renamed from: d  reason: collision with root package name */
    public static final C2543a f101964d = new C2543a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f101965a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f101966b = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a$a  reason: collision with other inner class name */
    public static final class C2543a {
        static {
            Covode.recordClassIndex(65244);
        }

        private C2543a() {
        }

        public /* synthetic */ C2543a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65243);
    }

    public static void b() {
        a.C2542a.a().a(0);
        a.C2542a.a().a(0L);
        a.C2542a.a().b(0);
    }

    public static void a() {
        int i2;
        if (f101963c) {
            f101963c = false;
            i a2 = h.a();
            int i3 = 3;
            if (a2 != null) {
                i2 = a2.f102184c;
                i3 = a2.f102185d;
            } else {
                i2 = 3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a.C2542a.a().f101959a.getLong("last_session_time_ms", -1);
            int i4 = a.C2542a.a().f101959a.getInt("session_count", 0);
            if (bo.a(j2)) {
                int i5 = i4 + 1;
                a.C2542a.a().a(i5);
                if (i5 >= i2) {
                    a.C2542a.a().b(currentTimeMillis + (((long) i3) * 86400000));
                    return;
                }
                return;
            }
            a.C2542a.a().a(currentTimeMillis);
            a.C2542a.a().a(1);
        }
    }
}
