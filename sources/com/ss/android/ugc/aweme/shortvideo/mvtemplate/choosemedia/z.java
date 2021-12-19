package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.f.b.l;

public final class z implements u {

    /* renamed from: a  reason: collision with root package name */
    public AVChallenge f129201a;

    static {
        Covode.recordClassIndex(84813);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.u
    public final Bundle a() {
        if (this.f129201a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key_mv_challenge", this.f129201a);
        return bundle;
    }

    static final class a<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f129202a;

        static {
            Covode.recordClassIndex(84814);
        }

        a(z zVar) {
            this.f129202a = zVar;
        }

        @Override // androidx.core.g.a
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            this.f129202a.f129201a = (AVChallenge) obj;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.u
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        String string = bundle.getString("Key_challenge_id");
        if (string == null) {
            l.b();
        }
        c.f115625d.a(string, new a(this));
    }
}
