package com.ss.android.ugc.aweme.inbox.widget.multi.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public abstract class f<T extends k> extends RecyclerView.ViewHolder implements com.ss.android.ugc.aweme.inbox.widget.a {

    /* renamed from: e  reason: collision with root package name */
    final h f104435e = i.a((h.f.a.a) new a(this));

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f104436f;

    /* renamed from: g  reason: collision with root package name */
    public T f104437g;

    /* renamed from: h  reason: collision with root package name */
    public MultiViewModel f104438h;

    /* renamed from: i  reason: collision with root package name */
    public Fragment f104439i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.inbox.widget.b f104440j;

    static {
        Covode.recordClassIndex(66880);
    }

    public abstract void a(T t);

    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
    }

    public void bJ_() {
    }

    public final T c() {
        T t = this.f104437g;
        if (t == null) {
            l.a("data");
        }
        return t;
    }

    public final MultiViewModel d() {
        MultiViewModel multiViewModel = this.f104438h;
        if (multiViewModel == null) {
            l.a("multiViewModel");
        }
        return multiViewModel;
    }

    public final Fragment e() {
        Fragment fragment = this.f104439i;
        if (fragment == null) {
            l.a("fragment");
        }
        return fragment;
    }

    static final class a extends m implements h.f.a.a<com.bytedance.tux.sheet.a.a> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(66881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.sheet.a.a invoke() {
            return new a.b().a(new a.e().a(R.string.b5g).b(1).a(new h.f.a.b<View, z>(this) {
                /* class com.ss.android.ugc.aweme.inbox.widget.multi.a.f.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(66882);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(View view) {
                    l.d(view, "");
                    h.f.a.a<z> aVar = this.this$0.this$0.f104436f;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.this$0.this$0.d().a(this.this$0.this$0.c());
                    return z.f158842a;
                }
            })).b();
        }
    }

    static final class b implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f104441a;

        static {
            Covode.recordClassIndex(66883);
        }

        b(f fVar) {
            this.f104441a = fVar;
        }

        public final boolean onLongClick(View view) {
            ((d) this.f104441a.f104435e.getValue()).show(this.f104441a.e().requireFragmentManager(), "MultiBaseVH");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.a
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        if (!l.a(this.f104440j, bVar)) {
            this.f104440j = bVar;
            b(bVar);
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f104436f = aVar;
        this.itemView.setOnLongClickListener(new b(this));
    }
}
