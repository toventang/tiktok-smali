package com.ss.android.ugc.aweme.livewallpaper.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public final class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private String f108895a;

    static {
        Covode.recordClassIndex(69737);
    }

    public b(String str) {
        this.f108895a = str;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.d.a
    public final void a(boolean z, String str) {
        if (z) {
            new a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.he_).a();
            f.a(0, "");
        } else {
            f.a(1, str);
        }
        String str2 = this.f108895a;
        if (str2 != null) {
            f.a(str2, "share", z, str);
        }
        d.f108899e.a("video_share");
    }
}
