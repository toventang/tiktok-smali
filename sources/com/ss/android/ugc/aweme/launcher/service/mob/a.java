package com.ss.android.ugc.aweme.launcher.service.mob;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.launch.MobLaunchImpl;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class a implements IMobLaunchApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107296a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IMobLaunchApi f107297b;

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void a(String str) {
        this.f107297b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void a(String str, Uri uri, boolean z) {
        this.f107297b.a(str, uri, z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void a(boolean z) {
        this.f107297b.a(z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void b(String str) {
        this.f107297b.b(str);
    }

    static {
        Covode.recordClassIndex(68651);
    }

    private a() {
        IMobLaunchApi mobLaunchImpl;
        Object a2 = b.a(IMobLaunchApi.class, false);
        if (a2 != null) {
            mobLaunchImpl = (IMobLaunchApi) a2;
        } else {
            mobLaunchImpl = new MobLaunchImpl();
        }
        l.b(mobLaunchImpl, "");
        this.f107297b = mobLaunchImpl;
    }
}
