package com.ss.android.ugc.aweme.search.model;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import h.f.b.l;
import java.util.Objects;

public final class SearchResultParamProvider extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f121495b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f121496a;

    static {
        Covode.recordClassIndex(79150);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79151);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Context context, d dVar) {
            l.d(context, "");
            l.d(dVar, "");
            Activity a2 = o.a(context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a3 = ae.a((e) a2, (ad.b) null).a(SearchResultParamProvider.class);
            l.b(a3, "");
            ((SearchResultParamProvider) a3).f121496a = dVar;
        }
    }
}
