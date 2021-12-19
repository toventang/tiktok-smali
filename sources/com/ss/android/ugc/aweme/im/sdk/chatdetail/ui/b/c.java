package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import com.airbnb.epoxy.q;
import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.h.d;
import h.k.i;

public abstract class c extends q {

    /* renamed from: g  reason: collision with root package name */
    public View f101655g;

    static final class a<V> implements d<c, V> {

        /* renamed from: a  reason: collision with root package name */
        private Object f101656a = C2529a.f101658a;

        /* renamed from: b  reason: collision with root package name */
        private final m<c, i<?>, V> f101657b;

        static {
            Covode.recordClassIndex(65015);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c$a$a  reason: collision with other inner class name */
        static final class C2529a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2529a f101658a = new C2529a();

            private C2529a() {
            }

            static {
                Covode.recordClassIndex(65016);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c, ? super h.k.i<?>, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m<? super c, ? super i<?>, ? extends V> mVar) {
            l.d(mVar, "");
            this.f101657b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.k.i] */
        @Override // h.h.d
        public final /* synthetic */ Object a(c cVar, i iVar) {
            l.d(cVar, "");
            l.d(iVar, "");
            if (l.a(this.f101656a, C2529a.f101658a)) {
                this.f101656a = this.f101657b.invoke(cVar, iVar);
            }
            return this.f101656a;
        }
    }

    static {
        Covode.recordClassIndex(65014);
    }

    public final View a() {
        View view = this.f101655g;
        if (view == null) {
            l.a("view");
        }
        return view;
    }

    @Override // com.airbnb.epoxy.q
    public void a(View view) {
        l.d(view, "");
        this.f101655g = view;
    }

    protected static <V extends View> d<c, V> a(int i2) {
        return new a(new b(i2));
    }

    static final class b extends h.f.b.m implements m<c, i<?>, V> {
        final /* synthetic */ int $id;

        static {
            Covode.recordClassIndex(65017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(2);
            this.$id = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(c cVar, i<?> iVar) {
            c cVar2 = cVar;
            i<?> iVar2 = iVar;
            l.d(cVar2, "");
            l.d(iVar2, "");
            View view = cVar2.f101655g;
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
