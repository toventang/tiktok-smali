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
import java.util.HashMap;
import java.util.Objects;

public final class MobParamProvider extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f93687b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f93688a = new HashMap<>();

    static {
        Covode.recordClassIndex(59613);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59614);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static MobParamProvider a(Context context) {
            l.d(context, "");
            Activity a2 = o.a(context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a3 = ae.a((e) a2, (ad.b) null).a(MobParamProvider.class);
            l.b(a3, "");
            return (MobParamProvider) a3;
        }
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f93688a.put(str, str2);
    }
}
