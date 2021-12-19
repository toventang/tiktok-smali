package com.ss.android.ugc.aweme.challenge.viewmodel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import h.f.b.l;
import h.p;

public final class ChallengeDetailViewModel extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f70244c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c<Integer> f70245a = new c<>();

    /* renamed from: b  reason: collision with root package name */
    public final c<p<Integer, com.ss.android.ugc.aweme.challenge.g.a>> f70246b = new c<>();

    static {
        Covode.recordClassIndex(43324);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43325);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ChallengeDetailViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(ChallengeDetailViewModel.class);
            l.b(a2, "");
            return (ChallengeDetailViewModel) a2;
        }
    }
}
