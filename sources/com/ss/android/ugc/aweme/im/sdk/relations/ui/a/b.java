package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public abstract class b<T> extends com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.b<com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a<T>, T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f103202c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f103203a = ((int) n.b(d.a(), 40.0f));

    /* renamed from: b  reason: collision with root package name */
    public View f103204b;

    /* renamed from: d  reason: collision with root package name */
    private q<? super Integer, ? super Integer, ? super View, z> f103205d;

    /* renamed from: e  reason: collision with root package name */
    private final q<Integer, Integer, View, z> f103206e = new C2619b(this);

    /* renamed from: f  reason: collision with root package name */
    private boolean f103207f;

    static {
        Covode.recordClassIndex(66165);
    }

    public abstract com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a<T> b(ViewGroup viewGroup, int i2);

    /* access modifiers changed from: protected */
    public boolean b(T t) {
        return false;
    }

    public abstract SharePackage p();

    public static final class a {
        static {
            Covode.recordClassIndex(66166);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super android.view.View, h.z>, h.f.a.q<java.lang.Integer, java.lang.Integer, android.view.View, h.z> */
    /* access modifiers changed from: protected */
    public q<Integer, Integer, View, z> o() {
        return this.f103205d;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.b
    public final int m() {
        if (this.f103204b == null || !this.f103207f) {
            return 0;
        }
        return 1;
    }

    public final void r() {
        boolean z = this.f103207f;
        this.f103207f = false;
        if (this.f103204b != null && z) {
            notifyItemRemoved(0);
        }
    }

    public final void q() {
        boolean z = !this.f103207f;
        this.f103207f = true;
        if (this.f103204b != null && z) {
            notifyItemInserted(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public int c(int i2) {
        if (i2 < m()) {
            return Integer.MAX_VALUE;
        }
        return super.c(i2);
    }

    public final void c(View view) {
        l.d(view, "");
        View view2 = this.f103204b;
        if (view2 == null) {
            this.f103204b = view;
            this.f103207f = true;
            notifyItemInserted(0);
            return;
        }
        l.a(view2, view);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 != Integer.MAX_VALUE) {
            return b(viewGroup, i2);
        }
        View view = this.f103204b;
        if (view == null || view.getParent() == null) {
            View view2 = this.f103204b;
            if (view2 == null) {
                l.b();
            }
            return new com.ss.android.ugc.aweme.im.sdk.relations.ui.c.b(view2);
        }
        com.ss.android.ugc.aweme.im.service.m.a.a(new Exception("BaseSelectListAdapter Still get a un-detached header"));
        return new com.ss.android.ugc.aweme.im.sdk.relations.ui.c.b(new Space(viewGroup.getContext()));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (i2 >= m()) {
            com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a aVar = (com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a) viewHolder;
            l.d(aVar, "");
            View view = aVar.itemView;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.j jVar = (RecyclerView.j) layoutParams;
            if (i2 == getItemCount() - 1) {
                jVar.setMargins(jVar.leftMargin, jVar.topMargin, jVar.rightMargin, this.f103203a);
            } else {
                jVar.setMargins(jVar.leftMargin, jVar.topMargin, jVar.rightMargin, 0);
            }
            T a2 = a(i2);
            if (a2 != null) {
                aVar.a(a2, a(i2 - 1), i2 - m());
                aVar.a(b((Object) a2));
                aVar.f103265a = this.f103206e;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b$b  reason: collision with other inner class name */
    static final class C2619b extends m implements q<Integer, Integer, View, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(66167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2619b(b bVar) {
            super(3);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Integer num, Integer num2, View view) {
            final int intValue = num.intValue();
            final int intValue2 = num2.intValue();
            final View view2 = view;
            l.d(view2, "");
            SharePackage p = this.this$0.p();
            if (p != null) {
                Context context = view2.getContext();
                l.b(context, "");
                p.a(context, (com.ss.android.ugc.aweme.sharer.b) null, new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b.C2619b.AnonymousClass1 */
                    final /* synthetic */ C2619b this$0;

                    static {
                        Covode.recordClassIndex(66168);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        q<Integer, Integer, View, z> o = this.this$0.this$0.o();
                        if (o != null) {
                            o.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), view2);
                        }
                        return z.f158842a;
                    }
                });
            } else {
                q<Integer, Integer, View, z> o = this.this$0.o();
                if (o != null) {
                    o.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), view2);
                }
            }
            return z.f158842a;
        }
    }
}
