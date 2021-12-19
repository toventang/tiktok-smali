package com.ss.android.ugc.aweme.relation.recommend;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.io.Serializable;

public final class g extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final c f120419d = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public m f120420a;

    /* renamed from: b  reason: collision with root package name */
    public String f120421b;

    /* renamed from: c  reason: collision with root package name */
    public String f120422c;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f120423e;

    /* renamed from: j  reason: collision with root package name */
    private final h f120424j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f120425k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.relation.viewmodel.b, com.ss.android.ugc.aweme.relation.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(78365);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.relation.viewmodel.b invoke(com.ss.android.ugc.aweme.relation.viewmodel.b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(78363);
    }

    private final RecFriendsListViewModel a() {
        return (RecFriendsListViewModel) this.f120423e.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(78366);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static g a(m mVar, String str, String str2) {
            l.d(mVar, "");
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putSerializable("recommendFriendsConfig", mVar);
            bundle.putString("platforms", str);
            bundle.putString("skip_platforms", str2);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    static final class e extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f120427a = new e();

        static {
            Covode.recordClassIndex(78370);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            return g2.getCurUserId();
        }
    }

    static final class f extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(78371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(this.this$0.getActivity());
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f120425k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78364);
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

    public g() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        f fVar = new f(this);
        h.k.c a2 = ab.a(RecFriendsListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), fVar, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), fVar, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f120423e = bVar;
        this.f120424j = h.i.a((h.f.a.a) e.f120427a);
        this.f120421b = "";
        this.f120422c = "";
    }

    static final class d extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(78367);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.relation.recommend.g.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(78368);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    m mVar = this.this$0.this$0.f120420a;
                    if (mVar == null) {
                        l.a("config");
                    }
                    iVar2.a(new f(mVar, this.this$0.this$0.f120421b, this.this$0.this$0.f120422c));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f120426a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str = "";
        l.d(view, str);
        super.onViewCreated(view, bundle);
        String str2 = (String) this.f120424j.getValue();
        if (str2 == null || str2.length() == 0) {
            a();
            RecFriendsListViewModel.a(getActivity());
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("recommendFriendsConfig");
            if (!(serializable instanceof m)) {
                serializable = null;
            }
            m mVar = (m) serializable;
            if (mVar == null) {
                a();
                RecFriendsListViewModel.a(getActivity());
                return;
            }
            this.f120420a = mVar;
            String string = arguments.getString("platforms");
            if (string == null) {
                string = str;
            }
            this.f120421b = string;
            String string2 = arguments.getString("skip_platforms");
            if (string2 != null) {
                str = string2;
            }
            this.f120422c = str;
        }
        com.bytedance.assem.arch.extensions.d.a(this, new d(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a29, viewGroup, false);
    }
}
