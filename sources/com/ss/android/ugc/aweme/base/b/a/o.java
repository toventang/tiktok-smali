package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.a;

/* access modifiers changed from: package-private */
public final class o implements a {

    /* renamed from: b  reason: collision with root package name */
    private Context f68016b;

    /* renamed from: c  reason: collision with root package name */
    private Keva f68017c;

    static {
        Covode.recordClassIndex(41896);
    }

    @Override // com.ss.android.ugc.aweme.friends.a
    public final boolean a() {
        return this.f68017c.getBoolean("read_contact_denied", false);
    }

    @Override // com.ss.android.ugc.aweme.friends.a
    public final void a(boolean z) {
        this.f68017c.storeBoolean("read_contact_denied", z);
    }

    public o(Context context) {
        this.f68016b = context;
        this.f68017c = Keva.getRepoFromSp(context, "FriendsSharePreferences", 0);
    }
}
