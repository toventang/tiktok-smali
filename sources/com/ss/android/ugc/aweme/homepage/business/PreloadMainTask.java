package com.ss.android.ugc.aweme.homepage.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.lang.ref.WeakReference;
import java.util.List;

public class PreloadMainTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private volatile WeakReference<Hox> f99169a;

    static {
        Covode.recordClassIndex(63180);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public PreloadMainTask(Hox hox) {
        this.f99169a = new WeakReference<>(hox);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Hox hox = this.f99169a.get();
        if (hox != null) {
            hox.a("page_feed");
            hox.a("page_profile");
        }
    }
}
