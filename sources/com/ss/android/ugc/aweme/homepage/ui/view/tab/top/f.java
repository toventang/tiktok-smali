package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.ui.b;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import h.f.b.l;
import java.util.Objects;

public final class f implements b, c {

    /* renamed from: a  reason: collision with root package name */
    public final b f99727a;

    /* renamed from: b  reason: collision with root package name */
    public final FlippableViewPagerExt f99728b;

    static {
        Covode.recordClassIndex(63565);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.c
    public final int a() {
        return this.f99728b.getCurrentItemCompat();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final boolean k() {
        return this.f99727a.k();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.c
    public final Fragment b() {
        PagerAdapter adapter = this.f99728b.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.MainPagerAdapter");
        return ((b) adapter).a();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final void b(int i2) {
        this.f99727a.b(i2);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final void a(int i2) {
        this.f99727a.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.c
    public final void a(boolean z) {
        this.f99728b.f99523a = z;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final boolean a(String str) {
        l.d(str, "");
        return this.f99727a.a(str);
    }

    public f(b bVar, FlippableViewPagerExt flippableViewPagerExt) {
        l.d(bVar, "");
        l.d(flippableViewPagerExt, "");
        this.f99727a = bVar;
        this.f99728b = flippableViewPagerExt;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.c
    public final void a(int i2, boolean z) {
        this.f99728b.a(i2, z);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final boolean a(boolean z, String str) {
        l.d(str, "");
        return this.f99727a.a(z, str);
    }
}
