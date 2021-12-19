package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.ab;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

public final class b extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: b  reason: collision with root package name */
    public static final c f102743b = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f102744a;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102745c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f102746d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$b  reason: collision with other inner class name */
    public static final class C2592b extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final C2592b INSTANCE = new C2592b();

        static {
            Covode.recordClassIndex(65824);
        }

        public C2592b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b invoke(com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65822);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(65825);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class d implements com.bytedance.assem.arch.extensions.c, Serializable {
        private final String conversationId;
        private final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a entry;
        private final Collection<IMUser> groupMembers;
        private final Collection<IMUser> selectedContacts;

        static {
            Covode.recordClassIndex(65826);
        }

        public d() {
            this(null, null, null, null, 15, null);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a getEntry() {
            return this.entry;
        }

        public final Collection<IMUser> getGroupMembers() {
            return this.groupMembers;
        }

        public final Collection<IMUser> getSelectedContacts() {
            return this.selectedContacts;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Collection<? extends IMUser> collection, Collection<? extends IMUser> collection2, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a aVar, String str) {
            l.d(collection, "");
            l.d(collection2, "");
            l.d(aVar, "");
            l.d(str, "");
            this.selectedContacts = collection;
            this.groupMembers = collection2;
            this.entry = aVar;
            this.conversationId = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(Collection collection, Collection collection2, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a aVar, String str, int i2, g gVar) {
            this((i2 & 1) != 0 ? z.INSTANCE : collection, (i2 & 2) != 0 ? z.INSTANCE : collection2, (i2 & 4) != 0 ? com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.CREATE_GROUP : aVar, (i2 & 8) != 0 ? "" : str);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f102746d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65823);
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

    public b() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ContactListViewModel.class);
        a aVar = new a(a2);
        C2592b bVar2 = C2592b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f102745c = bVar;
    }

    static final class e extends m implements h.f.a.b<Assembler, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(65828);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    d dVar = this.this$0.this$0.f102744a;
                    if (dVar == null) {
                        l.a("config");
                    }
                    iVar2.a(dVar);
                    iVar2.f25573b = "init_config";
                    return h.z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f102747a);
            assembler2.b(this.this$0, AnonymousClass3.f102748a);
            assembler2.b(this.this$0, AnonymousClass4.f102749a);
            assembler2.b(this.this$0, AnonymousClass5.f102750a);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("init_config");
        } else {
            serializable = null;
        }
        d dVar = (d) serializable;
        if (dVar == null) {
            dVar = new d(null, null, null, null, 15, null);
        }
        this.f102744a = dVar;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((ContactListViewModel) this.f102745c.getValue()).j().g();
        d dVar = this.f102744a;
        if (dVar == null) {
            l.a("config");
        }
        com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a entry = dVar.getEntry();
        if (this.f102746d == null) {
            this.f102746d = new HashMap();
        }
        View view2 = (View) this.f102746d.get(Integer.valueOf((int) R.id.em8));
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.em8);
                this.f102746d.put(Integer.valueOf((int) R.id.em8), view2);
            }
        }
        ImTextTitleBar imTextTitleBar = (ImTextTitleBar) view2;
        l.b(imTextTitleBar, "");
        entry.setupTitleBar(imTextTitleBar, this);
        com.bytedance.assem.arch.extensions.d.a(this, new e(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4s, viewGroup, false);
    }
}
