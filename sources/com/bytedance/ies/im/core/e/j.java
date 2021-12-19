package com.bytedance.ies.im.core.e;

import android.content.Context;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final int f34082a = 1;

    /* renamed from: b  reason: collision with root package name */
    static final int f34083b = 2;

    /* renamed from: c  reason: collision with root package name */
    static final int f34084c = 4;

    /* renamed from: d  reason: collision with root package name */
    static final h f34085d = i.a((h.f.a.a) a.f34087a);

    /* renamed from: e  reason: collision with root package name */
    public static final j f34086e = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(20295);
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34087a = new a();

        static {
            Covode.recordClassIndex(20296);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r1.is4GOrHigher() == false) goto L_0x004f;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r4 = this;
                com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.b.a()
                r3 = 1
                java.lang.String r1 = "im_options_parallel_send"
                r0 = 0
                int r1 = r2.a(r3, r1, r0)
                int r0 = com.bytedance.ies.im.core.e.j.f34084c
                if (r1 != r0) goto L_0x0015
            L_0x0010:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x0015:
                int r0 = com.bytedance.ies.im.core.e.j.f34083b
                java.lang.String r2 = ""
                if (r1 != r0) goto L_0x0037
                com.bytedance.ies.im.core.api.d.d r0 = com.bytedance.ies.im.core.api.a.a()
                android.content.Context r0 = r0.a()
                com.bytedance.common.utility.l$a r1 = a(r0)
                h.f.b.l.b(r1, r2)
                boolean r0 = r1.isWifi()
                if (r0 != 0) goto L_0x0010
                boolean r0 = r1.is4GOrHigher()
                if (r0 == 0) goto L_0x004f
                goto L_0x0010
            L_0x0037:
                int r0 = com.bytedance.ies.im.core.e.j.f34082a
                if (r1 != r0) goto L_0x004f
                com.bytedance.ies.im.core.api.d.d r0 = com.bytedance.ies.im.core.api.a.a()
                android.content.Context r0 = r0.a()
                com.bytedance.common.utility.l$a r0 = a(r0)
                h.f.b.l.b(r0, r2)
                boolean r3 = r0.isWifi()
                goto L_0x0010
            L_0x004f:
                r3 = 0
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.e.j.a.invoke():java.lang.Object");
        }

        private static l.a a(Context context) {
            if (com.ss.android.ugc.aweme.lancet.j.f107224c != l.a.UNKNOWN && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
                return com.ss.android.ugc.aweme.lancet.j.f107224c;
            }
            l.a d2 = l.d(context);
            com.ss.android.ugc.aweme.lancet.j.f107224c = d2;
            return d2;
        }
    }
}
