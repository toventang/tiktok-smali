package com.ss.android.ugc.aweme.im.sdk.common.data.a;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a<T> extends r<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final C2571a f102455b = new C2571a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<T> f102456a;

    /* renamed from: c  reason: collision with root package name */
    private final h f102457c = i.a((h.f.a.a) b.f102464a);

    static {
        Covode.recordClassIndex(65596);
    }

    public final Handler a() {
        return (Handler) this.f102457c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a$a  reason: collision with other inner class name */
    public static final class C2571a {
        static {
            Covode.recordClassIndex(65598);
        }

        private C2571a() {
        }

        public /* synthetic */ C2571a(byte b2) {
            this();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final T getValue() {
        return this.f102456a.getValue();
    }

    static final class b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102464a = new b();

        static {
            Covode.recordClassIndex(65599);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f102466b;

        static {
            Covode.recordClassIndex(65600);
        }

        public c(a aVar, h.f.a.a aVar2) {
            this.f102465a = aVar;
            this.f102466b = aVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            this.f102465a.f102456a.setValue(this.f102466b.invoke());
        }
    }

    public final void a(T t) {
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void postValue(T t) {
        super.postValue(t);
        this.f102456a.postValue(t);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        super.setValue(t);
        this.f102456a.setValue(t);
    }

    public a(t<T> tVar) {
        l.d(tVar, "");
        this.f102456a = tVar;
        a(tVar, new u(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.data.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f102458a;

            static {
                Covode.recordClassIndex(65597);
            }

            {
                this.f102458a = r1;
            }

            @Override // androidx.lifecycle.u
            public final void onChanged(T t) {
                this.f102458a.a(t);
            }
        });
    }
}
