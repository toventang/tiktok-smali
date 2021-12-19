package com.ss.android.ugc.aweme.specact.pendant.c.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.specact.pendant.c.b;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class c implements com.ss.android.ugc.aweme.specact.pendant.c.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134178a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private k.C3494k f134179b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f134180c;

    /* renamed from: d  reason: collision with root package name */
    private Keva f134181d = Keva.getRepo("specact.pendant.bubble.VideoTaskPromptLongBubble");

    static {
        Covode.recordClassIndex(87757);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87758);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final int b() {
        return this.f134181d.getInt("_bubble_show_num", 0);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final void a(k.c cVar) {
        k.C3494k kVar;
        String str = null;
        if (cVar != null) {
            kVar = cVar.f134463k;
        } else {
            kVar = null;
        }
        this.f134179b = kVar;
        if (kVar != null) {
            str = kVar.f134492a;
        }
        if (str == null || str.length() == 0) {
            b.a("VideoTaskPromptLongBubble.onSettingSynced  something is null or empty");
            this.f134180c = false;
            return;
        }
        k.C3494k kVar2 = this.f134179b;
        if (kVar2 == null) {
            return;
        }
        if (b() >= kVar2.f134494c) {
            this.f134180c = false;
        } else if (((long) (com.ss.android.ugc.aweme.specact.pendant.h.k.a() - this.f134181d.getInt("_bubble_last_show_time", 0))) > TimeUnit.DAYS.toSeconds((long) kVar2.f134495d)) {
            this.f134180c = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.c.c
    public final boolean a(com.ss.android.ugc.aweme.specact.pendant.e.a aVar, int i2) {
        k.C3494k kVar = this.f134179b;
        if (kVar == null || !this.f134180c) {
            return false;
        }
        if (aVar != null) {
            String str = kVar.f134492a;
            if (str == null) {
                l.b();
            }
            aVar.d(str);
        }
        this.f134181d.storeInt("_bubble_show_num", b() + 1);
        this.f134181d.storeInt("_bubble_last_show_time", com.ss.android.ugc.aweme.specact.pendant.h.k.a());
        this.f134180c = false;
        return true;
    }
}
