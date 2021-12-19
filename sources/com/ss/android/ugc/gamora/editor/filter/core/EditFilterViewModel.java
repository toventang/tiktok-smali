package com.ss.android.ugc.gamora.editor.filter.core;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.p;
import java.util.List;

public class EditFilterViewModel extends LifecycleAwareViewModel<EditFilterState> implements com.bytedance.o.a, a, b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f145856a = {new y(EditFilterViewModel.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final LiveData<Boolean> f145857b;

    /* renamed from: c  reason: collision with root package name */
    public final o f145858c;

    /* renamed from: d  reason: collision with root package name */
    public final b f145859d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f145860e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);

    /* renamed from: f  reason: collision with root package name */
    private final h f145861f = h.i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f145862g = h.i.a((h.f.a.a) new c(this));

    /* renamed from: l  reason: collision with root package name */
    private final t<Boolean> f145863l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.o.f f145864m;

    static {
        Covode.recordClassIndex(95844);
    }

    private final n h() {
        return (n) this.f145861f.getValue();
    }

    private final k i() {
        return (k) this.f145862g.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a g() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f145860e.a(this, f145856a[0]);
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.f145864m;
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.a
    public final void a() {
        c(g.f145867a);
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.a
    public final void f() {
        g().o();
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.a
    public final void b() {
        c(new f());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditFilterState(null, null, null, null, null, 31, null);
    }

    static final class b extends m implements h.f.a.a<n> {
        final /* synthetic */ EditFilterViewModel this$0;

        static {
            Covode.recordClassIndex(95846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(EditFilterViewModel editFilterViewModel) {
            super(0);
            this.this$0 = editFilterViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            n value = this.this$0.g().k().getValue();
            if (value == null) {
                l.b();
            }
            return value;
        }
    }

    static final class c extends m implements h.f.a.a<k> {
        final /* synthetic */ EditFilterViewModel this$0;

        static {
            Covode.recordClassIndex(95847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EditFilterViewModel editFilterViewModel) {
            super(0);
            this.this$0 = editFilterViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            k value = this.this$0.g().l().getValue();
            if (value == null) {
                l.b();
            }
            return value;
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        this.f145858c.f().c().observe(this, new d(this));
        this.f145858c.a();
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.a
    public final void e() {
        g().b(false);
        c(a.f145865a);
        this.f145859d.a(null, false, null);
    }

    static final class d<T> implements u<List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditFilterViewModel f145866a;

        static {
            Covode.recordClassIndex(95848);
        }

        d(EditFilterViewModel editFilterViewModel) {
            this.f145866a = editFilterViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list) {
            final List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list2 = list;
            this.f145866a.d(new h.f.a.b<EditFilterState, EditFilterState>() {
                /* class com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95849);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
                    EditFilterState editFilterState2 = editFilterState;
                    l.d(editFilterState2, "");
                    return EditFilterState.copy$default(editFilterState2, null, null, null, com.ss.android.ugc.aweme.filter.repository.a.a.a.b(list2), null, 23, null);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.b
    public final void a(float f2) {
        this.f145859d.a(f2);
    }

    static final class a extends m implements h.f.a.b<EditFilterState, EditFilterState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f145865a = new a();

        static {
            Covode.recordClassIndex(95845);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            l.d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, null, new com.bytedance.jedi.arch.d(null), new com.bytedance.jedi.arch.p(), null, null, 25, null);
        }
    }

    static final class e extends m implements h.f.a.b<EditFilterState, EditFilterState> {
        final /* synthetic */ FilterBean $filterBean;

        static {
            Covode.recordClassIndex(95850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FilterBean filterBean) {
            super(1);
            this.$filterBean = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            l.d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, null, new com.bytedance.jedi.arch.d(this.$filterBean), null, null, null, 29, null);
        }
    }

    static final class f extends m implements h.f.a.b<EditFilterState, EditFilterState> {
        final /* synthetic */ boolean $show = true;

        static {
            Covode.recordClassIndex(95851);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            l.d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, new com.bytedance.jedi.arch.k(this.$show), null, null, null, null, 30, null);
        }
    }

    static final class g extends m implements h.f.a.b<EditFilterState, EditFilterState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f145867a = new g();

        static {
            Covode.recordClassIndex(95852);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            l.d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, null, null, null, null, new a.b(), 15, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.b
    public final void a(String str) {
        l.d(str, "");
        this.f145859d.a(str);
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.a
    public final void a(boolean z) {
        this.f145863l.setValue(Boolean.valueOf(z));
    }

    public final void a(FilterBean filterBean, int i2) {
        l.d(filterBean, "");
        h().a(filterBean, i2);
        g().a(new com.ss.android.ugc.aweme.filter.c.a(false, filterBean));
        b bVar = this.f145859d;
        k i3 = i();
        l.b(i3, "");
        bVar.a(com.ss.android.ugc.aweme.filter.c.a(filterBean, i2, i3));
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.b
    public final void a(boolean z, FilterBean filterBean) {
        this.f145859d.a(z, filterBean);
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.core.b
    public final void a(FilterBean filterBean, boolean z, Context context) {
        this.f145859d.a(filterBean, z, context);
    }

    public EditFilterViewModel(com.bytedance.o.f fVar, o oVar, b bVar) {
        l.d(fVar, "");
        l.d(oVar, "");
        l.d(bVar, "");
        this.f145864m = fVar;
        this.f145858c = oVar;
        this.f145859d = bVar;
        t<Boolean> tVar = new t<>();
        this.f145863l = tVar;
        this.f145857b = tVar;
    }

    public final void b(FilterBean filterBean, boolean z, Context context) {
        if (filterBean != null) {
            g().a(new com.ss.android.ugc.aweme.filter.c.a(false, filterBean, false, this.f145858c.g().c(filterBean.getId())));
            this.f145859d.a(filterBean, z, context);
            b bVar = this.f145859d;
            n h2 = h();
            l.b(h2, "");
            k i2 = i();
            l.b(i2, "");
            bVar.a(com.ss.android.ugc.aweme.filter.c.a(filterBean, h2, i2));
        } else {
            this.f145859d.a(null, z, context);
        }
        c(new e(filterBean));
    }
}
