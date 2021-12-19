package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class e extends com.bytedance.assem.arch.d.a implements h {

    /* renamed from: j  reason: collision with root package name */
    EditText f102708j;

    /* renamed from: k  reason: collision with root package name */
    public View f102709k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102710l;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(65779);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b invoke(com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65777);
    }

    public final ContactListViewModel u() {
        return (ContactListViewModel) this.f102710l.getValue();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65778);
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

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ g e() {
        return new g(null, new com.bytedance.assem.arch.extensions.a(false));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.h
    public final void v() {
        EditText editText = this.f102708j;
        if (editText == null) {
            l.a("searchEditText");
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        EditText editText2 = this.f102708j;
        if (editText2 == null) {
            l.a("searchEditText");
        }
        KeyboardUtils.c(editText2);
    }

    public e() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ContactListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f102710l = bVar;
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f102711a;

        static {
            Covode.recordClassIndex(65780);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        c(e eVar) {
            this.f102711a = eVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            ContactListViewModel u = this.f102711a.u();
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            u.j().a(str);
        }

        public final void onTextChanged(final CharSequence charSequence, int i2, int i3, int i4) {
            int i5;
            View view = this.f102711a.f102709k;
            if (view == null) {
                l.a("closeBtn");
            }
            if (charSequence == null || charSequence.length() == 0) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            e eVar = this.f102711a;
            AnonymousClass1 r5 = new h.f.a.b<g, g>() {
                /* class com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65781);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ g invoke(g gVar) {
                    String str;
                    g gVar2 = gVar;
                    if (gVar2 == null) {
                        return null;
                    }
                    CharSequence charSequence = charSequence;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    return g.a(gVar2, str, null, 2);
                }
            };
            Class<e> cls = e.class;
            Class<?>[] interfaces = cls.getInterfaces();
            l.a((Object) interfaces, "");
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
                        l.a((Object) interfaces2, "");
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
                    com.bytedance.assem.arch.core.e eVar2 = eVar.bx_().f25534g;
                    Object g2 = n.g((List) arrayList2);
                    if (g2 != null) {
                        eVar2.a((Class) g2, r5);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }

    static final class f extends m implements h.f.a.b<g, g> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f102713a = new f();

        static {
            Covode.recordClassIndex(65784);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            g gVar2 = gVar;
            if (gVar2 != null) {
                return g.a(gVar2, null, new com.bytedance.assem.arch.extensions.a(true), 1);
            }
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        String str;
        l.d(view, "");
        View s = s();
        if (s == null) {
            l.b();
        }
        DmtEditText dmtEditText = (DmtEditText) s.findViewById(R.id.dur);
        Context context = dmtEditText.getContext();
        if (context != null) {
            str = context.getString(R.string.fi_);
        } else {
            str = null;
        }
        dmtEditText.setHint(str);
        dmtEditText.addTextChangedListener(new c(this));
        l.b(dmtEditText, "");
        this.f102708j = dmtEditText;
        View s2 = s();
        if (s2 == null) {
            l.b();
        }
        TuxIconView tuxIconView = (TuxIconView) s2.findViewById(R.id.y0);
        tuxIconView.setOnClickListener(new d(this));
        l.b(tuxIconView, "");
        this.f102709k = tuxIconView;
        f.a.a(this, u(), f.f102714a, com.bytedance.assem.arch.viewModel.l.a(), new C2590e(this), 4);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f102712a;

        static {
            Covode.recordClassIndex(65782);
        }

        d(e eVar) {
            this.f102712a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e eVar = this.f102712a;
            View view2 = eVar.f102709k;
            if (view2 == null) {
                l.a("closeBtn");
            }
            view2.setVisibility(8);
            EditText editText = eVar.f102708j;
            if (editText == null) {
                l.a("searchEditText");
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            eVar.v();
            f fVar = f.f102713a;
            Class<e> cls = e.class;
            Class<?>[] interfaces = cls.getInterfaces();
            l.a((Object) interfaces, "");
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
                        l.a((Object) interfaces2, "");
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
                    com.bytedance.assem.arch.core.e eVar2 = eVar.bx_().f25534g;
                    Object g2 = n.g((List) arrayList2);
                    if (g2 != null) {
                        eVar2.a((Class) g2, fVar);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$e  reason: collision with other inner class name */
    static final class C2590e extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(65783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2590e(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            l.d(pVar, "");
            this.this$0.v();
            return z.f158842a;
        }
    }
}
