package com.ss.android.ugc.aweme.profile.ui.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ui.az;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116846a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(75462);
    }

    public static az a(e eVar) {
        l.d(eVar, "");
        az azVar = (az) eVar.getSupportFragmentManager().a("user_profile_edit_fragment");
        if (azVar == null) {
            return new az();
        }
        azVar.n = true;
        return azVar;
    }
}
