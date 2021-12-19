package com.ss.android.ugc.aweme.specact.pendant.c.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.specact.pendant.c.c;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134159a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private k.g f134160b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f134161c;

    /* renamed from: d  reason: collision with root package name */
    private Keva f134162d = Keva.getRepo("specact.pendant.bubble.StaticPendantLongBubble");

    static {
        Covode.recordClassIndex(87746);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87747);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean b() {
        return this.f134162d.getBoolean("_pendant_is_click", false);
    }

    private final int c() {
        return this.f134162d.getInt("_bubble_show_num", 0);
    }

    private final long d() {
        return this.f134162d.getLong("_bubble_first_show_time", 0);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "CLICK_STATIC_PENDANT") && this.f134160b != null) {
            this.f134162d.storeBoolean("_pendant_is_click", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(k.c cVar) {
        k.g gVar;
        String str = null;
        if (cVar != null) {
            gVar = cVar.f134458f;
        } else {
            gVar = null;
        }
        this.f134160b = gVar;
        if (gVar != null) {
            str = gVar.f134478b;
        }
        if (str == null || str.length() == 0) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced  something is null or empty");
            this.f134161c = false;
            return;
        }
        k.g gVar2 = this.f134160b;
        if (gVar2 != null) {
            int c2 = c();
            boolean b2 = b();
            if (c2 == 0) {
                this.f134161c = true;
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (b2) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ",  isPendentClick:" + b2 + ",  needShow:false");
            } else if (c2 != 1) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ",  needShow:false");
            } else if (System.currentTimeMillis() - d() > TimeUnit.DAYS.toMillis((long) gVar2.f134480d)) {
                this.f134161c = true;
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ", show!!!");
            } else {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ", Time is not,  needShow:false");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a(com.ss.android.ugc.aweme.specact.pendant.e.a aVar, int i2) {
        k.g gVar = this.f134160b;
        if (gVar == null) {
            return false;
        }
        if (c() != 0 && b()) {
            this.f134161c = false;
            return false;
        } else if (aVar != null && aVar.d()) {
            this.f134161c = false;
            return false;
        } else if (!this.f134161c) {
            return false;
        } else {
            if (i2 < gVar.f134479c) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("StaticPendantLongBubble.tryShowBubble, notShow, b: vv is:".concat(String.valueOf(i2)));
                return false;
            }
            if (aVar != null) {
                if (aVar.e()) {
                    com.ss.android.ugc.aweme.specact.pendant.c.b.a("StaticPendantLongBubble.tryShowBubble, notShow, b: staticPendantIsFold");
                    return false;
                }
                String str = gVar.f134478b;
                if (str == null) {
                    l.b();
                }
                aVar.b(str, "warmup_long_inform");
            }
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("StaticPendantLongBubble.tryShowBubble, Show!!!");
            this.f134162d.storeInt("_bubble_show_num", c() + 1);
            if (d() == 0) {
                this.f134162d.storeLong("_bubble_first_show_time", System.currentTimeMillis());
            }
            this.f134161c = false;
            return true;
        }
    }
}
