package com.ss.android.ugc.aweme.recommend;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class RecommendUsersDialogViewModel extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f120056c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f120057a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f120058b = new t<>();

    static {
        Covode.recordClassIndex(78031);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78032);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static RecommendUsersDialogViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(RecommendUsersDialogViewModel.class);
            l.b(a2, "");
            return (RecommendUsersDialogViewModel) a2;
        }
    }

    public final boolean a() {
        Boolean value = this.f120057a.getValue();
        if (value == null || l.a((Object) value, (Object) true)) {
            return true;
        }
        return false;
    }
}
