package com.ss.android.ugc.aweme.ecommerce.track;

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

public final class TrackerProvider extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f87520b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Object f87521a;

    static {
        Covode.recordClassIndex(55014);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55015);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static <T> void a(Context context, T t) {
            l.d(context, "");
            Activity a2 = o.a(context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a3 = ae.a((e) a2, (ad.b) null).a(TrackerProvider.class);
            l.b(a3, "");
            ((TrackerProvider) a3).f87521a = t;
        }
    }
}
