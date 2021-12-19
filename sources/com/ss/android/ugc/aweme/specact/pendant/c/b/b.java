package com.ss.android.ugc.aweme.specact.pendant.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.specact.pendant.c.c;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134143a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private k.h f134144b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f134145c;

    /* renamed from: d  reason: collision with root package name */
    private Keva f134146d = Keva.getRepo("specact.pendant.bubble.PendantDynamicTipBubble");

    static {
        Covode.recordClassIndex(87737);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87738);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean b() {
        return this.f134146d.getBoolean("_pendant_is_click", false);
    }

    private final int c() {
        return this.f134146d.getInt("_bubble_show_num", 0);
    }

    private final long d() {
        return this.f134146d.getLong("_bubble_first_show_time", 0);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "CLICK_DYNAMIC_PENDANT") && this.f134144b != null) {
            this.f134146d.storeBoolean("_pendant_is_click", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(k.c cVar) {
        k.h hVar;
        String str = null;
        if (cVar != null) {
            hVar = cVar.f134461i;
        } else {
            hVar = null;
        }
        this.f134144b = hVar;
        if (hVar != null) {
            str = hVar.f134481a;
        }
        if (str == null || str.length() == 0) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.onSettingSynced  something is null or empty");
            this.f134145c = false;
            return;
        }
        k.h hVar2 = this.f134144b;
        if (hVar2 != null) {
            int c2 = c();
            boolean b2 = b();
            if (c2 == 0) {
                this.f134145c = true;
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (b2) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c2 + ",  isPendentClick:" + b2 + ",  needShow:false");
            } else if (c2 == 1) {
                if (System.currentTimeMillis() - d() > TimeUnit.DAYS.toMillis((long) hVar2.f134483c)) {
                    this.f134145c = true;
                } else {
                    com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c2 + ", Time is not,  needShow:false");
                }
            } else if (c2 != 2) {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c2 + ",  needShow:false");
            } else if (System.currentTimeMillis() - d() > TimeUnit.DAYS.toMillis((long) hVar2.f134484d)) {
                this.f134145c = true;
            } else {
                com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c2 + ", Time is not,  needShow:false");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a(com.ss.android.ugc.aweme.specact.pendant.e.a aVar, int i2) {
        k.h hVar = this.f134144b;
        if (hVar == null || !this.f134145c) {
            return false;
        }
        if (c() != 0 && b()) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.tryShowBubble, notShow, b: isClicked");
            this.f134145c = false;
            return false;
        } else if (i2 < hVar.f134482b) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.tryShowBubble, notShow, b: vv is:".concat(String.valueOf(i2)));
            return false;
        } else {
            if (aVar != null) {
                String str = hVar.f134481a;
                if (str == null) {
                    l.b();
                }
                aVar.c(str);
            }
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("PendantDynamicTipBubble.tryShowBubble, Show!!!");
            this.f134146d.storeInt("_bubble_show_num", c() + 1);
            if (d() == 0) {
                this.f134146d.storeLong("_bubble_first_show_time", System.currentTimeMillis());
            }
            this.f134145c = false;
            return true;
        }
    }
}
