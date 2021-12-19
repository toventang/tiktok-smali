package com.ss.android.ugc.aweme.specact.pendant.c.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.specact.pendant.c.c;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134124a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private k.f f134125b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f134126c;

    /* renamed from: d  reason: collision with root package name */
    private Keva f134127d = Keva.getRepo("specact.pendant.bubble.PendantClickTipBubble");

    static {
        Covode.recordClassIndex(87728);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87729);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean b() {
        return this.f134127d.getBoolean("_pendant_is_click", false);
    }

    private final int c() {
        return this.f134127d.getInt("_bubble_show_num", 0);
    }

    private final long d() {
        return this.f134127d.getLong("_bubble_first_show_time", 0);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "CLICK_STATIC_PENDANT") && this.f134125b != null) {
            this.f134127d.storeBoolean("_pendant_is_click", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(k.c cVar) {
        k.f fVar;
        String str = null;
        if (cVar != null) {
            fVar = cVar.f134457e;
        } else {
            fVar = null;
        }
        this.f134125b = fVar;
        if (fVar != null) {
            str = fVar.f134473a;
        }
        if (str == null || str.length() == 0) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced  something is null or empty");
            this.f134126c = false;
            return;
        }
        k.f fVar2 = this.f134125b;
        if (fVar2 != null) {
            int c2 = c();
            boolean b2 = b();
            if (c2 == 0) {
                this.f134126c = true;
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (b2) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ",  isPendentClick:" + b2 + ",  needShow:false");
            } else if (c2 == 1) {
                if (System.currentTimeMillis() - d() > TimeUnit.DAYS.toMillis((long) fVar2.f134475c)) {
                    this.f134126c = true;
                } else {
                    com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ", Time is not,  needShow:false");
                }
            } else if (c2 != 2) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ",  needShow:false");
            } else if (System.currentTimeMillis() - d() > TimeUnit.DAYS.toMillis((long) fVar2.f134476d)) {
                this.f134126c = true;
            } else {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.onSettingSynced showTimes:" + c2 + ", Time is not,  needShow:false");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a(com.ss.android.ugc.aweme.specact.pendant.e.a aVar, int i2) {
        k.f fVar = this.f134125b;
        if (fVar == null || !this.f134126c) {
            return false;
        }
        if (c() != 0 && b()) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.tryShowBubble, notShow, b: isClicked");
            this.f134126c = false;
            return false;
        } else if (i2 < fVar.f134474b) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.tryShowBubble, notShow, b: vv is:".concat(String.valueOf(i2)));
            return false;
        } else {
            if (aVar != null) {
                if (aVar.e()) {
                    com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.tryShowBubble, notShow, b: staticPendantIsFold");
                    return false;
                }
                String str = fVar.f134473a;
                if (str == null) {
                    l.b();
                }
                aVar.b(str);
            }
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantClickTipBubble.tryShowBubble, Show!!!");
            this.f134127d.storeInt("_bubble_show_num", c() + 1);
            if (d() == 0) {
                this.f134127d.storeLong("_bubble_first_show_time", System.currentTimeMillis());
            }
            this.f134126c = false;
            return true;
        }
    }
}
