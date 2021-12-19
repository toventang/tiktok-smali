package com.bytedance.android.live.liveinteract.cohost.a.a;

import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class d {

    public static abstract class b<T extends a> extends com.bytedance.android.livesdk.ui.a {

        /* renamed from: a  reason: collision with root package name */
        public e f10033a;

        /* renamed from: b  reason: collision with root package name */
        public T f10034b;

        /* renamed from: c  reason: collision with root package name */
        protected final com.bytedance.android.live.liveinteract.api.a.b f10035c = b.a.a();

        static {
            Covode.recordClassIndex(5228);
        }

        public abstract e.a d();
    }

    public static abstract class c {

        /* renamed from: c  reason: collision with root package name */
        public DataChannel f10036c;

        static {
            Covode.recordClassIndex(5229);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d$d  reason: collision with other inner class name */
    public interface AbstractC0159d {
        static {
            Covode.recordClassIndex(5230);
        }

        w.a d();

        void dismiss();

        boolean isVisible();

        void show(i iVar, String str);
    }

    public interface e {
        static {
            Covode.recordClassIndex(5231);
        }

        void a(w.a aVar, c cVar);

        void dismiss();

        m e();
    }

    static {
        Covode.recordClassIndex(5226);
    }

    public static abstract class a<V extends b> {

        /* renamed from: g  reason: collision with root package name */
        final String f10030g = getClass().getSimpleName();

        /* renamed from: h  reason: collision with root package name */
        public V f10031h;

        /* renamed from: i  reason: collision with root package name */
        protected final com.bytedance.android.live.liveinteract.api.a.b f10032i = b.a.a();

        static {
            Covode.recordClassIndex(5227);
        }

        public void g() {
        }

        /* access modifiers changed from: protected */
        public final <R> com.bytedance.android.livesdk.util.rxutils.autodispose.m<R> f() {
            return com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(com.bytedance.android.livesdk.util.rxutils.autodispose.a.a(this.f10031h.f10033a.e(), i.a.ON_DESTROY), new f());
        }

        public final void a(Throwable th) {
            com.bytedance.android.live.core.c.a.a(6, this.f10030g, th.getStackTrace());
        }

        public a(V v) {
            this.f10031h = v;
        }
    }
}
