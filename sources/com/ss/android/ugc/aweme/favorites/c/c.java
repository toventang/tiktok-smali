package com.ss.android.ugc.aweme.favorites.c;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import dagger.a.f;
import javax.a.a;

public final class c implements dagger.a.c<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    private final a<e> f90480a;

    static {
        Covode.recordClassIndex(56795);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f90480a.get());
    }

    public static Fragment a(e eVar) {
        return (Fragment) f.a(a.a(eVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
