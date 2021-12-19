package com.ss.android.ugc.aweme.feed.param;

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

public final class FeedParamProvider extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f93685b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f93686a;

    static {
        Covode.recordClassIndex(59611);
    }

    public static final b a(Context context) {
        return a.a(context);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59612);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(Context context) {
            l.d(context, "");
            Activity a2 = o.a(context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a3 = ae.a((e) a2, (ad.b) null).a(FeedParamProvider.class);
            l.b(a3, "");
            b bVar = ((FeedParamProvider) a3).f93686a;
            if (bVar == null) {
                return new b();
            }
            return bVar;
        }
    }
}
