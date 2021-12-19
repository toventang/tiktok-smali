package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a;

import android.view.View;
import com.airbnb.epoxy.q;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.h.d;
import h.k.i;

public abstract class a extends q {

    /* renamed from: b  reason: collision with root package name */
    public View f102351b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a$a  reason: collision with other inner class name */
    public static final class C2565a<V> implements d<a, V> {

        /* renamed from: a  reason: collision with root package name */
        private Object f102352a = C2566a.f102354a;

        /* renamed from: b  reason: collision with root package name */
        private final m<a, i<?>, V> f102353b;

        static {
            Covode.recordClassIndex(65515);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a$a$a  reason: collision with other inner class name */
        static final class C2566a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2566a f102354a = new C2566a();

            private C2566a() {
            }

            static {
                Covode.recordClassIndex(65516);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a, ? super h.k.i<?>, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public C2565a(m<? super a, ? super i<?>, ? extends V> mVar) {
            l.d(mVar, "");
            this.f102353b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.k.i] */
        @Override // h.h.d
        public final /* synthetic */ Object a(a aVar, i iVar) {
            l.d(aVar, "");
            l.d(iVar, "");
            if (l.a(this.f102352a, C2566a.f102354a)) {
                this.f102352a = this.f102353b.invoke(aVar, iVar);
            }
            return this.f102352a;
        }
    }

    static {
        Covode.recordClassIndex(65514);
    }

    @Override // com.airbnb.epoxy.q
    public final void a(View view) {
        l.d(view, "");
        this.f102351b = view;
    }

    public static final class b extends h.f.b.m implements m<a, i<?>, V> {
        final /* synthetic */ int $id = R.id.av9;

        static {
            Covode.recordClassIndex(65517);
        }

        public b() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(a aVar, i<?> iVar) {
            a aVar2 = aVar;
            i<?> iVar2 = iVar;
            l.d(aVar2, "");
            l.d(iVar2, "");
            View view = aVar2.f102351b;
            if (view == null) {
                l.a("view");
            }
            View findViewById = view.findViewById(this.$id);
            if (findViewById != null) {
                return findViewById;
            }
            throw new IllegalStateException("View ID " + this.$id + " for '" + iVar2.getName() + "' not found.");
        }
    }
}
