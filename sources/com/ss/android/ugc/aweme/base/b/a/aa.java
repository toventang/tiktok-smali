package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.profile.ad;

public final class aa implements ad {

    /* renamed from: a  reason: collision with root package name */
    private Context f67993a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f67994b;

    static {
        Covode.recordClassIndex(41880);
    }

    public aa(Context context) {
        this.f67993a = context;
        this.f67994b = d.a(context, "ProfilePreferences", 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.ad
    public final void a(String str) {
        SharedPreferences.Editor edit = this.f67994b.edit();
        edit.putString("profile_cache_post_list", str);
        edit.apply();
    }
}
