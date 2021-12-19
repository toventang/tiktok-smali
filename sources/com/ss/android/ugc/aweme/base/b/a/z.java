package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.j;

public final class z implements j {

    /* renamed from: a  reason: collision with root package name */
    private Context f68038a;

    /* renamed from: b  reason: collision with root package name */
    private Keva f68039b;

    static {
        Covode.recordClassIndex(41907);
    }

    public z(Context context) {
        this.f68038a = context;
        this.f68039b = Keva.getRepoFromSp(context, "PrivateAlbumSp", 0);
    }
}
