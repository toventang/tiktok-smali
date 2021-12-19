package com.bytedance.android.live.banner;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.livesdk.model.message.ah;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.d.f;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class InRoomBannerManager implements au, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    static m f7351a;

    /* renamed from: b  reason: collision with root package name */
    static long f7352b = -1;

    /* renamed from: c  reason: collision with root package name */
    static boolean f7353c;

    /* renamed from: d  reason: collision with root package name */
    static f.a.l.b<a> f7354d;

    /* renamed from: e  reason: collision with root package name */
    public static final InRoomBannerManager f7355e = new InRoomBannerManager();

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7361a = new e();

        static {
            Covode.recordClassIndex(3565);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    private InRoomBannerManager() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f7356a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.android.livesdk.model.message.c f7357b;

        static {
            Covode.recordClassIndex(3561);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7356a == aVar.f7356a && l.a(this.f7357b, aVar.f7357b);
        }

        public final String toString() {
            return "Data(roomId=" + this.f7356a + ", data=" + this.f7357b + ")";
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f7356a;
            int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            com.bytedance.android.livesdk.model.message.c cVar = this.f7357b;
            if (cVar != null) {
                i2 = cVar.hashCode();
            } else {
                i2 = 0;
            }
            return i3 + i2;
        }

        public a(long j2, com.bytedance.android.livesdk.model.message.c cVar) {
            l.d(cVar, "");
            this.f7356a = j2;
            this.f7357b = cVar;
        }
    }

    static {
        Covode.recordClassIndex(3560);
        f.a.l.b<a> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        f7354d = bVar;
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType(), this);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        i lifecycle;
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        m mVar = f7351a;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.b(this);
        }
        f7351a = null;
        f7352b = -1;
        f7353c = false;
        f.a.l.b<a> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        f7354d = bVar;
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7359a = new c();

        static {
            Covode.recordClassIndex(3563);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            InRoomBannerManager.a(InRoomBannerManager.f7352b, InRoomBannerManager.f7353c);
        }
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Long f7358a;

        static {
            Covode.recordClassIndex(3562);
        }

        b(Long l2) {
            this.f7358a = l2;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            a aVar = (a) obj;
            l.d(aVar, "");
            long j2 = aVar.f7356a;
            Long l2 = this.f7358a;
            if (l2 != null && j2 == l2.longValue()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7360a;

        static {
            Covode.recordClassIndex(3564);
        }

        d(long j2) {
            this.f7360a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.l.b<a> bVar = InRoomBannerManager.f7354d;
            long j2 = this.f7360a;
            Object obj2 = ((com.bytedance.android.live.network.response.d) obj).data;
            l.b(obj2, "");
            bVar.onNext(new a(j2, (com.bytedance.android.livesdk.model.message.c) obj2));
        }
    }

    public static t<a> a(Long l2) {
        t<a> a2 = f7354d.a(new b(l2));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j2;
        if (iMessage != null && iMessage.getIntType() == com.bytedance.android.livesdk.model.message.a.a.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType() && (iMessage instanceof ah)) {
            ah ahVar = (ah) iMessage;
            if (ahVar.f19132a > 0) {
                c cVar = (c) com.bytedance.android.live.t.a.a(c.class);
                com.bytedance.android.livesdkapi.h.b bVar = ahVar.O;
                if (bVar != null) {
                    j2 = bVar.f23211c;
                } else {
                    j2 = 0;
                }
                if (cVar.shouldShowBanner(j2)) {
                    ((z) t.b((Object) 1).e((long) new Random().nextInt(ahVar.f19132a), TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((f) c.f7359a).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(f7351a))).a();
                }
            }
        }
    }

    public static void a(long j2, boolean z) {
        int i2;
        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) com.bytedance.android.live.network.e.a().a(BannerRetrofitApi.class);
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        ((z) bannerRetrofitApi.queryLiveRoomBanner(j2, i2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(f7351a))).a(new d(j2), e.f7361a);
    }
}
