package com.ss.android.ugc.aweme.favorites.c;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class b implements c<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Fragment> f90479a;

    static {
        Covode.recordClassIndex(56794);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f90479a.get());
    }

    public static i a(Fragment fragment) {
        return (i) f.a(a.a(fragment), "Cannot return null from a non-@Nullable @Provides method");
    }
}
