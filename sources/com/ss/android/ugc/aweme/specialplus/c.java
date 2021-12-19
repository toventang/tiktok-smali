package com.ss.android.ugc.aweme.specialplus;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f134644b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Keva f134645a;

    static {
        Covode.recordClassIndex(87974);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87975);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int b() {
        return this.f134645a.getInt("special_plus_effect_version", 0);
    }

    public final long c() {
        return this.f134645a.getLong("quick_promo_plus_shown_time", 0);
    }

    public c() {
        Keva repo = Keva.getRepo("special_plus_keva");
        l.b(repo, "");
        this.f134645a = repo;
    }

    public final Effect a() {
        String string = this.f134645a.getString("special_plus_effect", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Effect) com.ss.android.ugc.aweme.port.in.c.f115623b.a(string, Effect.class);
    }

    public final void a(long j2) {
        this.f134645a.storeLong("quick_promo_plus_shown_time", j2);
    }
}
