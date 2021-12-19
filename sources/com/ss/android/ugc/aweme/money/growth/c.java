package com.ss.android.ugc.aweme.money.growth;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.ss.android.ugc.aweme.views.o;
import h.f.b.l;

public final class c extends o {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f110831c = true;

    /* renamed from: d  reason: collision with root package name */
    public static c f110832d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f110833e = "MoneyGrowthDialog";

    /* renamed from: f  reason: collision with root package name */
    public static boolean f110834f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f110835g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f110836a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f110837b;

    public static final class a {
        static {
            Covode.recordClassIndex(71123);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.money.growth.c$a$a  reason: collision with other inner class name */
        public static final class RunnableC2831a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f110844a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ UgChannelPopup f110845b;

            static {
                Covode.recordClassIndex(71124);
            }

            public RunnableC2831a(Context context, UgChannelPopup ugChannelPopup) {
                this.f110844a = context;
                this.f110845b = ugChannelPopup;
            }

            public final void run() {
                a.a(this.f110844a, this.f110845b);
            }
        }

        private static c a() {
            c cVar = c.f110832d;
            if (cVar == null) {
                l.a("dialog");
            }
            return cVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(c cVar) {
            l.d(cVar, "");
            c.f110832d = cVar;
        }

        public static void a(Context context, UgChannelPopup ugChannelPopup) {
            l.d(context, "");
            l.d(ugChannelPopup, "");
            if (!c.f110834f) {
                c.f110834f = true;
                try {
                    a(new c(context, ugChannelPopup));
                } catch (Exception e2) {
                    e2.getMessage();
                }
                a().show();
            }
        }
    }

    public enum b {
        SMALL(1),
        BANNER(2);
        
        private final int style;

        public final int getStyle() {
            return this.style;
        }

        static {
            Covode.recordClassIndex(71125);
        }

        private b(int i2) {
            this.style = i2;
        }
    }

    static {
        Covode.recordClassIndex(71118);
    }

    public final void show() {
        if (this.f110836a) {
            try {
                super.show();
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                if (this.f110837b) {
                    r.a("toast_show", new d().a("toast_type", "coupon_fission").f66730a);
                }
                e.f110853g.f110856b.a(2);
            } catch (com.bytedance.ies.a unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        r2 = r0.getH5Link();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r7, com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r8) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.money.growth.c.<init>(android.content.Context, com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup):void");
    }
}
