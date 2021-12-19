package com.ss.android.ugc.aweme.im.sdk.relations.ui.b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f;
import com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c;
import com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.RelationViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.en;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements c.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C2620a f103253b = new C2620a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c f103254a;

    /* renamed from: c  reason: collision with root package name */
    private View f103255c;

    /* renamed from: d  reason: collision with root package name */
    private SharePackage f103256d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f103257e;

    /* renamed from: j  reason: collision with root package name */
    private LinkedHashSet<IMContact> f103258j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f103259k;

    /* renamed from: l  reason: collision with root package name */
    private BaseContent f103260l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f103261m;
    private String n = "";
    private int o = -1;
    private RelationViewModel p;
    private HashMap q;

    static {
        Covode.recordClassIndex(66190);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a$a  reason: collision with other inner class name */
    public static final class C2620a {
        static {
            Covode.recordClassIndex(66191);
        }

        private C2620a() {
        }

        public /* synthetic */ C2620a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c.b
    public final void a() {
        RelationViewModel relationViewModel = this.p;
        if (relationViewModel != null) {
            relationViewModel.f103349c.h();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar = this.f103254a;
        if (cVar != null) {
            cVar.m();
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar2 = this.f103254a;
        if (cVar2 != null) {
            cVar2.r = null;
        }
        RelationViewModel relationViewModel = this.p;
        if (relationViewModel != null) {
            relationViewModel.f103349c.d();
            relationViewModel.f103349c.m();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar = this.f103254a;
        if (cVar != null) {
            cVar.g();
        }
        RelationViewModel relationViewModel = this.p;
        if (relationViewModel != null) {
            List<IMContact> e2 = relationViewModel.f103349c.e();
            relationViewModel.f103347a.setValue(new a.c(e2));
            if (!e2.isEmpty()) {
                Objects.requireNonNull(e2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
                relationViewModel.a(ad.d(e2), relationViewModel.f103349c.f());
                return;
            }
            relationViewModel.f103349c.g();
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103264a;

        static {
            Covode.recordClassIndex(66193);
        }

        c(a aVar) {
            this.f103264a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a) obj;
            if (aVar instanceof a.c) {
                return;
            }
            if (aVar instanceof a.d) {
                com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar = this.f103264a.f103254a;
                if (cVar != null) {
                    a.d dVar = (a.d) aVar;
                    cVar.a((List) dVar.f102463a.getFirst(), (CharSequence) dVar.f102463a.getSecond());
                }
            } else if (aVar instanceof a.b) {
                Object obj2 = ((a.b) aVar).f102460a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Throwable");
                com.ss.android.ugc.aweme.im.service.m.a.a((Throwable) obj2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c.b
    public final void a(String str) {
        l.d(str, "");
        RelationViewModel relationViewModel = this.p;
        if (relationViewModel != null) {
            l.d(str, "");
            if (str.length() == 0) {
                relationViewModel.f103347a.setValue(new a.d(relationViewModel.f103349c.e()));
            } else {
                relationViewModel.f103349c.a(str.toString());
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RelationViewModel f103262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f103263b;

        static {
            Covode.recordClassIndex(66192);
        }

        b(RelationViewModel relationViewModel, a aVar) {
            this.f103262a = relationViewModel;
            this.f103263b = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a) obj;
            if (aVar instanceof a.c) {
                com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar = this.f103263b.f103254a;
                if (cVar != null) {
                    cVar.l();
                }
            } else if (aVar instanceof a.d) {
                com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar2 = this.f103263b.f103254a;
                if (cVar2 != null) {
                    cVar2.a(this.f103262a.a(), this.f103262a.b());
                }
                com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar3 = this.f103263b.f103254a;
                if (cVar3 != null) {
                    cVar3.a((List<? extends IMContact>) ((a.d) aVar).f102463a);
                }
            } else if (aVar instanceof a.b) {
                Object obj2 = ((a.b) aVar).f102460a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Throwable");
                com.ss.android.ugc.aweme.im.service.m.a.a((Throwable) obj2);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SharePackage sharePackage = (SharePackage) arguments.getParcelable("share_package");
            this.f103256d = sharePackage;
            if (sharePackage != null) {
                com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, this.f103256d, null, true, null, 0, null, null, 120);
                SharePackage sharePackage2 = this.f103256d;
                if (sharePackage2 == null) {
                    l.b();
                }
                String string = sharePackage2.f124595i.getString("author_user_name", "");
                l.b(string, "");
                this.n = string;
                SharePackage sharePackage3 = this.f103256d;
                if (sharePackage3 == null) {
                    l.b();
                }
                this.o = sharePackage3.f124595i.getInt("share_im_limit_tip_type", -1);
            }
            this.f103260l = (BaseContent) arguments.getSerializable("share_content");
            this.f103257e = arguments.getBoolean("key_relation_list_use_sort", false);
            BaseContent.wrapForward(this.f103260l, arguments.getLong("forward_origin_msgid"));
            this.f103259k = arguments.getBoolean("extra_no_title");
            this.f103258j = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
        }
        boolean b2 = en.b();
        this.f103261m = b2;
        SharePackage sharePackage4 = this.f103256d;
        boolean z = this.f103257e;
        l.d(this, "");
        ac a2 = ae.a(this, new com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.a(sharePackage4, z, b2)).a(RelationViewModel.class);
        l.b(a2, "");
        RelationViewModel relationViewModel = (RelationViewModel) a2;
        this.p = relationViewModel;
        if (relationViewModel != null) {
            relationViewModel.f103349c.a((d<IMContact>) relationViewModel);
            relationViewModel.f103349c.a((com.ss.android.ugc.aweme.im.sdk.relations.data.core.d) relationViewModel);
        }
        RelationViewModel relationViewModel2 = this.p;
        if (relationViewModel2 != null) {
            relationViewModel2.f103347a.observe(this, new b(relationViewModel2, this));
            relationViewModel2.f103348b.observe(this, new c(this));
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        LinkedHashSet<IMContact> linkedHashSet;
        String str;
        String str2;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar;
        List<Integer> list;
        List<String> list2;
        MethodCollector.i(7980);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View view2 = this.f103255c;
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar = null;
        if (f.a(getActivity()) && view2 != null) {
            if (this.f103261m) {
                e activity = getActivity();
                if (activity != null) {
                    boolean z = this.f103259k;
                    RelationViewModel relationViewModel = this.p;
                    if (relationViewModel != null) {
                        list = relationViewModel.a();
                    } else {
                        list = null;
                    }
                    RelationViewModel relationViewModel2 = this.p;
                    if (relationViewModel2 != null) {
                        list2 = relationViewModel2.b();
                    } else {
                        list2 = null;
                    }
                    cVar = new com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b(activity, view2, z, list, list2);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    MethodCollector.o(7980);
                    throw nullPointerException;
                }
            } else {
                e activity2 = getActivity();
                if (activity2 != null) {
                    cVar = new com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c(activity2, view2, this.f103259k);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    MethodCollector.o(7980);
                    throw nullPointerException2;
                }
            }
            this.f103254a = cVar;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar2 = this.f103254a;
        if (cVar2 != null) {
            cVar2.r = this;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar3 = this.f103254a;
        if (cVar3 != null) {
            cVar3.f103322g = this.f103256d;
            SharePackage sharePackage = cVar3.f103322g;
            if (sharePackage == null || (bundle5 = sharePackage.f124595i) == null) {
                str = null;
            } else {
                str = bundle5.getString("multi_share_msg");
            }
            cVar3.p = str;
            SharePackage sharePackage2 = cVar3.f103322g;
            if (sharePackage2 == null || (bundle4 = sharePackage2.f124595i) == null || (str2 = bundle4.getString("aid", "")) == null) {
                str2 = "";
            }
            cVar3.q = str2;
            SharePackage sharePackage3 = cVar3.f103322g;
            if (!(sharePackage3 == null || (bundle3 = sharePackage3.f124595i) == null)) {
                bundle3.remove("multi_share_msg");
            }
            SharePackage sharePackage4 = cVar3.f103322g;
            if (!(sharePackage4 == null || (bundle2 = sharePackage4.f124595i) == null)) {
                bundle2.remove("aid");
            }
            cVar3.i();
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar4 = this.f103254a;
        if (cVar4 != null) {
            cVar4.f103323h = this.f103260l;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c cVar5 = this.f103254a;
        if (!(cVar5 == null || (linkedHashSet = this.f103258j) == null)) {
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = cVar5.o;
            if (aVar != null) {
                aVar.f103178f = linkedHashSet;
            }
            cVar5.j();
            cVar5.h();
            cVar5.g();
        }
        if (this.o > 0 && !TextUtils.isEmpty(this.n)) {
            e activity3 = getActivity();
            if (activity3 != null) {
                l.b(activity3, "");
                bVar = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b(activity3, (byte) 0);
            }
            View view3 = this.f103255c;
            if (!(view3 == null || (frameLayout = (FrameLayout) view3.findViewById(R.id.e13)) == null)) {
                frameLayout.addView(bVar);
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c cVar6 = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c(this.n, this.o);
            if (bVar != null) {
                bVar.a(cVar6);
                MethodCollector.o(7980);
                return;
            }
        }
        MethodCollector.o(7980);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        l.d(layoutInflater, "");
        if (this.f103261m) {
            a2 = com.a.a(layoutInflater, R.layout.a4z, viewGroup, false);
        } else {
            a2 = com.a.a(layoutInflater, R.layout.a4y, viewGroup, false);
        }
        this.f103255c = a2;
        return a2;
    }
}
