package com.ss.android.ugc.aweme.inbox.g;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.ad;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public abstract class g<T extends ad> extends RecyclerView.ViewHolder implements com.ss.android.ugc.aweme.inbox.widget.a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.inbox.widget.b f104265a;

    /* renamed from: b  reason: collision with root package name */
    final h f104266b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<z> f104267c;

    /* renamed from: d  reason: collision with root package name */
    public T f104268d;

    /* renamed from: e  reason: collision with root package name */
    public Fragment f104269e;

    /* renamed from: f  reason: collision with root package name */
    public RecommendUserVM f104270f;

    static {
        Covode.recordClassIndex(66767);
    }

    public void a() {
    }

    public abstract void a(T t);

    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
    }

    public final T c() {
        T t = this.f104268d;
        if (t == null) {
            l.a("data");
        }
        return t;
    }

    public final Fragment d() {
        Fragment fragment = this.f104269e;
        if (fragment == null) {
            l.a("fragment");
        }
        return fragment;
    }

    public final RecommendUserVM e() {
        RecommendUserVM recommendUserVM = this.f104270f;
        if (recommendUserVM == null) {
            l.a("recommendUserVM");
        }
        return recommendUserVM;
    }

    static final class a extends m implements h.f.a.a<com.bytedance.tux.sheet.a.a> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(66768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.sheet.a.a invoke() {
            return new a.b().a(new a.e().a(R.string.b5g).b(1).a(new h.f.a.b<View, z>(this) {
                /* class com.ss.android.ugc.aweme.inbox.g.g.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(66769);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(View view) {
                    l.d(view, "");
                    h.f.a.a<z> aVar = this.this$0.this$0.f104267c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.this$0.this$0.e().a(this.this$0.this$0.c());
                    return z.f158842a;
                }
            })).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f104271a;

        static {
            Covode.recordClassIndex(66770);
        }

        b(g gVar) {
            this.f104271a = gVar;
        }

        public final boolean onLongClick(View view) {
            ((d) this.f104271a.f104266b.getValue()).show(this.f104271a.d().requireFragmentManager(), "MultiBaseVH");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view) {
        super(view);
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.a
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        if (!l.a(this.f104265a, bVar)) {
            this.f104265a = bVar;
            b(bVar);
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f104267c = aVar;
        this.itemView.setOnLongClickListener(new b(this));
    }
}
