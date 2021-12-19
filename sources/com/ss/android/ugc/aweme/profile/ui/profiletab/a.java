package com.ss.android.ugc.aweme.profile.ui.profiletab;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f117155a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f117156b;

    static {
        Covode.recordClassIndex(75666);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.profiletab.a$a  reason: collision with other inner class name */
    static final class CallableC2978a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC2978a f117157a = new CallableC2978a();

        static {
            Covode.recordClassIndex(75667);
        }

        CallableC2978a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            r.a("homepage_click", new HashMap());
            return null;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117158a;

        static {
            Covode.recordClassIndex(75668);
        }

        b(a aVar) {
            this.f117158a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            c.a(this.f117158a.f117155a, "personal_homepage", "click");
            return null;
        }
    }

    public a(Context context) {
        l.d(context, "");
        this.f117156b = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f117155a = (e) context;
    }
}
