package com.ss.android.ugc.aweme.notification.vm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.e.a;
import com.ss.android.ugc.aweme.notification.vm.d;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class e extends d {

    /* renamed from: k  reason: collision with root package name */
    public static final a f114284k = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public volatile long f114285j;

    /* renamed from: l  reason: collision with root package name */
    private volatile long f114286l;

    /* renamed from: m  reason: collision with root package name */
    private volatile long f114287m;
    private volatile boolean n = true;
    private boolean o;

    static {
        Covode.recordClassIndex(73480);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73481);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(73482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e.super.i();
            return z.f158842a;
        }
    }

    public final boolean n() {
        List<MusNotice> value = a().getValue();
        if ((value == null || value.isEmpty()) && this.f114286l <= 0 && !d() && ((d) this).f114258h == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        if ((java.lang.System.currentTimeMillis() - r10.f114287m) >= com.ss.android.ugc.aweme.notification.e.a.a().f113382i) goto L_0x00cb;
     */
    @Override // com.ss.android.ugc.aweme.notification.vm.c, com.ss.android.ugc.aweme.notification.vm.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vm.e.i():boolean");
    }

    public final boolean a(a.g gVar) {
        l.d(gVar, "");
        f.b("NotificationTLPreload", "preload, reason:".concat(String.valueOf(gVar)));
        if (gVar == a.g.TAB_CLICK && this.f114287m <= 0) {
            return super.a(d.b.PRELOAD_REFRESH_CLICK);
        }
        if (gVar == a.g.BOOT_LAZY || gVar == a.g.POST_UNREAD) {
            if (System.currentTimeMillis() - this.f114286l >= com.ss.android.ugc.aweme.notification.e.a.a().f113381h) {
                return super.a(d.b.PRELOAD_REFRESH_EXCEPT_REC);
            }
        }
        f.b("NotificationTLPreload", "preload blocked, reason:" + gVar + ", lastTs:" + this.f114286l + ", lastFullTs:" + this.f114287m + ", lastJanusTs:" + this.f114285j);
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.vm.d
    public final void b(d.b bVar) {
        l.d(bVar, "");
        f.b("NotificationTLPreload", "onDataCombinedEnd, reason:" + bVar + ", refreshAgain:" + this.o);
        if (bVar == d.b.REFRESH || bVar == d.b.PRELOAD_REFRESH_CLICK) {
            this.f114287m = System.currentTimeMillis();
        } else if (this.o) {
            com.ss.android.ugc.aweme.notification.e.d.b(new b(this));
        }
        this.o = false;
        if (k().contains(bVar)) {
            this.f114285j = System.currentTimeMillis();
            this.f114286l = this.f114285j;
        }
    }
}
