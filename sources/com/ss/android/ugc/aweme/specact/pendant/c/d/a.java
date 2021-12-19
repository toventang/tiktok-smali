package com.ss.android.ugc.aweme.specact.pendant.c.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.specact.pendant.c.b;
import com.ss.android.ugc.aweme.specact.pendant.c.c;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final C3482a f134163a = new C3482a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private k.d f134164b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f134165c;

    /* renamed from: d  reason: collision with root package name */
    private Keva f134166d = Keva.getRepo("specact.pendant.bubble.NewUserStaticLongBubble");

    static {
        Covode.recordClassIndex(87749);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.a$a  reason: collision with other inner class name */
    public static final class C3482a {
        static {
            Covode.recordClassIndex(87750);
        }

        private C3482a() {
        }

        public /* synthetic */ C3482a(byte b2) {
            this();
        }
    }

    private final int b() {
        return this.f134166d.getInt("_bubble_show_num", 0);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(k.c cVar) {
        k.d dVar;
        String str = null;
        if (cVar != null) {
            dVar = cVar.f134462j;
        } else {
            dVar = null;
        }
        this.f134164b = dVar;
        if (dVar != null) {
            str = dVar.f134464a;
        }
        if (str == null || str.length() == 0) {
            b.a("NewUserStaticLongBubble.onSettingSynced  something is null or empty");
            this.f134165c = false;
            return;
        }
        k.d dVar2 = this.f134164b;
        if (dVar2 == null) {
            return;
        }
        if (b() >= dVar2.f134466c) {
            this.f134165c = false;
        } else if (((long) (com.ss.android.ugc.aweme.specact.pendant.h.k.a() - this.f134166d.getInt("_bubble_last_show_time", 0))) > TimeUnit.DAYS.toSeconds((long) dVar2.f134467d)) {
            this.f134165c = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a(com.ss.android.ugc.aweme.specact.pendant.e.a aVar, int i2) {
        k.d dVar = this.f134164b;
        if (dVar == null || !this.f134165c || i2 < dVar.f134465b) {
            return false;
        }
        if (aVar != null) {
            if (aVar.e()) {
                return false;
            }
            String str = dVar.f134464a;
            if (str == null) {
                l.b();
            }
            aVar.b(str, "new_user_rewards");
        }
        this.f134166d.storeInt("_bubble_show_num", b() + 1);
        this.f134166d.storeInt("_bubble_last_show_time", com.ss.android.ugc.aweme.specact.pendant.h.k.a());
        this.f134165c = false;
        return true;
    }
}
