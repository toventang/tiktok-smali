package com.ss.android.ugc.aweme.comment.page.tag.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class w extends com.bytedance.assem.arch.d.a implements d {

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.assem.arch.viewModel.b f72216j;

    /* renamed from: k  reason: collision with root package name */
    EditText f72217k;

    /* renamed from: l  reason: collision with root package name */
    public View f72218l;

    /* renamed from: m  reason: collision with root package name */
    public List<IMUser> f72219m;
    private final com.bytedance.assem.arch.viewModel.b n;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44500);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(44502);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c cVar) {
            h.f.b.l.c(cVar, "");
            return cVar;
        }
    }

    static {
        Covode.recordClassIndex(44498);
    }

    private final VideoTagFriendsListViewModel u() {
        return (VideoTagFriendsListViewModel) this.n.getValue();
    }

    static final class k extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f72222a = new k();

        static {
            Covode.recordClassIndex(44510);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ androidx.fragment.app.e $activity;

        static {
            Covode.recordClassIndex(44507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(androidx.fragment.app.e eVar) {
            super(0);
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$activity.finish();
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(44503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.page.tag.a.d
    public final void a() {
        EditText editText = this.f72217k;
        if (editText == null) {
            h.f.b.l.a("searchEditText");
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        EditText editText2 = this.f72217k;
        if (editText2 == null) {
            h.f.b.l.a("searchEditText");
        }
        KeyboardUtils.c(editText2);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ c e() {
        return new c(null, new com.bytedance.assem.arch.extensions.a(false));
    }

    public w() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.d dVar = i.d.f25721a;
        e eVar = new e(this);
        h.k.c a2 = ab.a(VideoTagFriendsListViewModel.class);
        a aVar = new a(a2);
        b bVar3 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), eVar, bVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), eVar, bVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), eVar, bVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
        i.d dVar2 = i.d.f25721a;
        h.k.c a3 = ab.a(VideoTagSearchListViewModel.class);
        c cVar = new c(a3);
        d dVar3 = d.INSTANCE;
        if (h.f.b.l.a(dVar2, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, dVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar2, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, dVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar2 == null || h.f.b.l.a(dVar2, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, dVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f72216j = bVar2;
        this.f72219m = new ArrayList();
    }

    public static final class f implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f72220a;

        static {
            Covode.recordClassIndex(44504);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        f(w wVar) {
            this.f72220a = wVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                String obj = editable.toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                ((VideoTagSearchListViewModel) this.f72220a.f72216j.getValue()).a(p.b((CharSequence) obj).toString(), this.f72220a.f72219m);
            }
        }

        public final void onTextChanged(final CharSequence charSequence, int i2, int i3, int i4) {
            int i5;
            View view = this.f72220a.f72218l;
            if (view == null) {
                h.f.b.l.a("closeBtn");
            }
            if (charSequence == null || charSequence.length() == 0) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            w wVar = this.f72220a;
            AnonymousClass1 r5 = new h.f.a.b<c, c>() {
                /* class com.ss.android.ugc.aweme.comment.page.tag.a.w.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(44505);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ c invoke(c cVar) {
                    String str;
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return null;
                    }
                    CharSequence charSequence = charSequence;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    return c.a(cVar2, str, null, 2);
                }
            };
            Class<w> cls = w.class;
            Class<?>[] interfaces = cls.getInterfaces();
            h.f.b.l.a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        h.f.b.l.a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    com.bytedance.assem.arch.core.e eVar = wVar.bx_().f25534g;
                    Object g2 = n.g((List) arrayList2);
                    if (g2 != null) {
                        eVar.a((Class) g2, r5);
                        return;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
            }
        }
    }

    static final class l extends m implements h.f.a.b<c, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f72223a = new l();

        static {
            Covode.recordClassIndex(44511);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            c cVar2 = cVar;
            if (cVar2 != null) {
                return c.a(cVar2, null, new com.bytedance.assem.arch.extensions.a(true), 1);
            }
            return null;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f72221a;

        static {
            Covode.recordClassIndex(44506);
        }

        g(w wVar) {
            this.f72221a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            w wVar = this.f72221a;
            View view2 = wVar.f72218l;
            if (view2 == null) {
                h.f.b.l.a("closeBtn");
            }
            view2.setVisibility(8);
            EditText editText = wVar.f72217k;
            if (editText == null) {
                h.f.b.l.a("searchEditText");
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            wVar.a();
            l lVar = l.f72223a;
            Class<w> cls = w.class;
            Class<?>[] interfaces = cls.getInterfaces();
            h.f.b.l.a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        h.f.b.l.a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    com.bytedance.assem.arch.core.e eVar = wVar.bx_().f25534g;
                    Object g2 = n.g((List) arrayList2);
                    if (g2 != null) {
                        eVar.a((Class) g2, lVar);
                        return;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        String str;
        h.f.b.l.d(view, "");
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            TuxNavBar tuxNavBar = (TuxNavBar) s().findViewById(R.id.em8);
            TuxNavBar.a a2 = new TuxNavBar.a().a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark).a((h.f.a.a<z>) new h(b2)));
            com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
            Context ar_ = ar_();
            if (ar_ == null || (str = ar_.getString(R.string.gbz)) == null) {
                str = "";
            }
            h.f.b.l.b(str, "");
            tuxNavBar.setNavActions(a2.a(gVar.a(str)));
            DmtEditText dmtEditText = (DmtEditText) s().findViewById(R.id.dur);
            dmtEditText.addTextChangedListener(new f(this));
            h.f.b.l.b(dmtEditText, "");
            this.f72217k = dmtEditText;
            TuxIconView tuxIconView = (TuxIconView) s().findViewById(R.id.y0);
            tuxIconView.setOnClickListener(new g(this));
            h.f.b.l.b(tuxIconView, "");
            this.f72218l = tuxIconView;
            f.a.a(this, u(), x.f72224a, com.bytedance.assem.arch.viewModel.l.a(), new i(this), 4);
            f.a.a(this, u(), y.f72225a, com.bytedance.assem.arch.viewModel.l.a(), new j(this), 4);
            CommentServiceImpl.e().a(b2, true, (h.f.a.a<z>) k.f72222a);
        }
    }

    static final class j extends m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(44509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(w wVar) {
            super(2);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.a();
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a>, z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(44508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(w wVar) {
            super(2);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.f72219m = n.g((Collection) t.f72317d);
            }
            return z.f158842a;
        }
    }
}
