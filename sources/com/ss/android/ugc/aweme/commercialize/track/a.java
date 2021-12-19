package com.ss.android.ugc.aweme.commercialize.track;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl;
import h.f.b.l;
import h.z;

public final class a implements IAdTrackDepend {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75356a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAdTrackDepend f75357b;

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final int a(Exception exc) {
        l.d(exc, "");
        return this.f75357b.a(exc);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String a() {
        return this.f75357b.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f75357b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final void a(boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f75357b.a(z, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final SharedPreferences b() {
        return this.f75357b.b();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final boolean c() {
        return this.f75357b.c();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String d() {
        return this.f75357b.d();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String e() {
        return this.f75357b.e();
    }

    static {
        Covode.recordClassIndex(46503);
    }

    private a() {
        IAdTrackDepend f2 = AdTrackDependImpl.f();
        l.b(f2, "");
        this.f75357b = f2;
    }
}
