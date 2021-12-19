package com.ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f110847d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f110848a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f110849b;

    /* renamed from: c  reason: collision with root package name */
    public String f110850c = "";

    /* renamed from: e  reason: collision with root package name */
    private final Keva f110851e;

    static {
        Covode.recordClassIndex(71126);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71127);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d() {
        Keva repo = Keva.getRepo("money_growth");
        l.b(repo, "");
        this.f110851e = repo;
        a(repo.getInt("deepLinkDialogShown", 0));
        a(repo.getBoolean("has_showed_pop", false));
        String string = repo.getString("activity_id_for_deeplink", "");
        if (string != null) {
            a(string);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f110850c = str;
        this.f110851e.storeString("activity_id_for_deeplink", str);
    }

    public final void a(int i2) {
        this.f110848a = i2;
        this.f110851e.storeInt("deepLinkDialogShown", i2);
        if (i2 == 2) {
            this.f110851e.storeString("activity_id_for_deeplink", "");
        }
    }

    public final void a(boolean z) {
        this.f110849b = z;
        this.f110851e.storeBoolean("has_showed_pop", z);
    }
}
