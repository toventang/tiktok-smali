package com.ss.android.ugc.aweme.feed.interest.viewmodel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class InterestViewModel extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f93519b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<Aweme> f93520a = new t<>();

    static {
        Covode.recordClassIndex(59245);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59246);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static InterestViewModel a(e eVar) {
            l.c(eVar, "");
            ac a2 = ae.a(eVar).a(InterestViewModel.class);
            l.a((Object) a2, "");
            return (InterestViewModel) a2;
        }
    }
}
