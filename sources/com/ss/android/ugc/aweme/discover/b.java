package com.ss.android.ugc.aweme.discover;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.lang.reflect.Type;
import java.util.List;

public final class b implements IDiscoveryService {

    /* renamed from: a  reason: collision with root package name */
    public static final b f80832a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IDiscoveryService f80833b;

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Fragment a() {
        return this.f80833b.a();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final g a(g gVar) {
        l.d(gVar, "");
        return this.f80833b.a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean a(Aweme aweme, int i2) {
        return this.f80833b.a(aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean a(User user, int i2) {
        return this.f80833b.a(user, i2);
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final c b() {
        return this.f80833b.b();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final List<Type> c() {
        return this.f80833b.c();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final String d() {
        return this.f80833b.d();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean e() {
        return this.f80833b.e();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean f() {
        return this.f80833b.f();
    }

    static {
        Covode.recordClassIndex(50255);
    }

    private b() {
        IDiscoveryService g2 = DiscoveryServiceImpl.g();
        l.b(g2, "");
        this.f80833b = g2;
    }
}
