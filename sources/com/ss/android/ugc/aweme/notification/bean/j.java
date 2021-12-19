package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f113250c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f113251a;

    /* renamed from: b  reason: collision with root package name */
    public final List<MusNotice> f113252b = new ArrayList();

    static {
        Covode.recordClassIndex(72818);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72819);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(MusNotice musNotice) {
        l.d(musNotice, "");
        this.f113252b.add(musNotice);
    }

    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113253a = new b();

        static {
            Covode.recordClassIndex(72820);
        }

        b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
                int r2 = r9.priority
                int r0 = r8.priority
                int r2 = r2 - r0
                int r1 = r8.priority
                int r0 = r9.priority
                r6 = -1
                r5 = 1
                if (r1 != r0) goto L_0x001d
                long r3 = r9.createTime
                long r0 = r8.createTime
                long r3 = r3 - r0
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
            L_0x001c:
                return r5
            L_0x001d:
                if (r2 <= 0) goto L_0x0020
                goto L_0x001c
            L_0x0020:
                if (r2 >= 0) goto L_0x0023
            L_0x0022:
                return r6
            L_0x0023:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.bean.j.b.compare(java.lang.Object, java.lang.Object):int");
        }
    }
}
