package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.a.n;
import h.a.z;
import h.p;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class ContactListViewModel extends AssemViewModel<b> implements com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d<IMContact>, com.ss.android.ugc.aweme.im.sdk.relations.data.core.d, com.ss.android.ugc.aweme.im.sdk.relations.data.core.d {

    /* renamed from: l  reason: collision with root package name */
    public static final b f102767l = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final IMUser f102768j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f102769k;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f102770m = new com.bytedance.assem.arch.extensions.i(true, new a(this, "init_config"));
    private final h.h n = h.i.a((h.f.a.a) new e(this));
    private final h.h o = h.i.a((h.f.a.a) new d(this));
    private final h.h p = h.i.a((h.f.a.a) new l(this));
    private final h.h q = h.i.a((h.f.a.a) new k(this));
    private final Comparator<IMUser> r = c.f102771a;

    static {
        Covode.recordClassIndex(65879);
    }

    private final Set<IMUser> o() {
        return (Set) this.n.getValue();
    }

    public final b.d g() {
        return (b.d) this.f102770m.getValue();
    }

    public final com.bytedance.im.core.d.h h() {
        return (com.bytedance.im.core.d.h) this.o.getValue();
    }

    public final LinkedHashSet<IMUser> i() {
        return (LinkedHashSet) this.p.getValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.relations.data.core.g j() {
        return (com.ss.android.ugc.aweme.im.sdk.relations.data.core.g) this.q.getValue();
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(65881);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Set<? extends IMUser>> {
        final /* synthetic */ ContactListViewModel this$0;

        static {
            Covode.recordClassIndex(65884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ContactListViewModel contactListViewModel) {
            super(0);
            this.this$0 = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<? extends IMUser> invoke() {
            return n.m(this.this$0.g().getGroupMembers());
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<LinkedHashSet<IMUser>> {
        final /* synthetic */ ContactListViewModel this$0;

        static {
            Covode.recordClassIndex(65891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ContactListViewModel contactListViewModel) {
            super(0);
            this.this$0 = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkedHashSet<IMUser> invoke() {
            return new LinkedHashSet(this.this$0.g().getSelectedContacts());
        }
    }

    public final List<IMUser> k() {
        return n.k(i());
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        j().d();
        j().m();
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.im.core.d.h> {
        final /* synthetic */ ContactListViewModel this$0;

        static {
            Covode.recordClassIndex(65883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ContactListViewModel contactListViewModel) {
            super(0);
            this.this$0 = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.im.core.d.h invoke() {
            return a.C0745a.a().a(this.this$0.g().getConversationId());
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.relations.data.core.g> {
        final /* synthetic */ ContactListViewModel this$0;

        static {
            Covode.recordClassIndex(65890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ContactListViewModel contactListViewModel) {
            super(0);
            this.this$0 = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.g invoke() {
            com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.b.c(true, 1);
            cVar.f102983d = true;
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.g gVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.g(cVar);
            gVar.a((com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d<IMContact>) this.this$0);
            gVar.a((com.ss.android.ugc.aweme.im.sdk.relations.data.core.d) this.this$0);
            return gVar;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ b f() {
        return new b(new com.bytedance.assem.arch.extensions.a(z.INSTANCE), null, new p(z.INSTANCE, ""));
    }

    public final int l() {
        if (i().contains(this.f102768j)) {
            return i().size() - 1;
        }
        return i().size();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<b.d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyData;

        static {
            Covode.recordClassIndex(65880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyData = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b.d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r0 = r0.f25687d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 != 0) goto L_0x000f
                h.f.b.l.a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$d> r1 = com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b.d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel.a.invoke():java.lang.Object");
        }
    }

    private final void p() {
        int i2 = a.f102786d[g().getEntry().ordinal()];
        if (i2 == 1) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.b();
        } else if (i2 == 2) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.c();
        } else {
            throw new h.n();
        }
    }

    public final List<IMUser> m() {
        if (i().size() != 2 || !i().contains(this.f102768j)) {
            return n.k(i());
        }
        List<IMUser> g2 = n.g((Collection) i());
        g2.remove(this.f102768j);
        return g2;
    }

    public ContactListViewModel() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
        IMUser fromUser = IMUser.fromUser(createIUserServicebyMonsterPlugin.getCurrentUser());
        h.f.b.l.b(fromUser, "");
        this.f102768j = fromUser;
    }

    public final boolean n() {
        int a2;
        int i2 = a.f102783a[g().getEntry().ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            int size = i().size() + o().size();
            com.bytedance.im.core.d.h h2 = h();
            if (h2 != null) {
                a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.d(h2);
            } else {
                a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.c.b.a();
            }
            if (size >= a2) {
                return true;
            }
            return false;
        }
        throw new h.n();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(Throwable th) {
        h.f.b.l.d(th, "");
        com.ss.android.ugc.aweme.im.service.m.a.a("ContactListViewModel onLoadError", th);
        a(g.f102772a);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.d
    public final void b(Throwable th) {
        h.f.b.l.d(th, "");
        com.ss.android.ugc.aweme.im.service.m.a.a("ContactListViewModel onSearchError", th);
        a(i.f102773a);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void c(Throwable th) {
        h.f.b.l.d(th, "");
        h.f.b.l.d(th, "");
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<b, b> {
        final /* synthetic */ IMUser $contact;

        static {
            Covode.recordClassIndex(65885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(IMUser iMUser) {
            super(1);
            this.$contact = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return b.a(bVar2, null, new com.bytedance.assem.arch.extensions.a(this.$contact), null, 5);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<b, b> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f102772a = new g();

        static {
            Covode.recordClassIndex(65886);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return b.a(bVar2, new com.bytedance.assem.arch.extensions.a(z.INSTANCE), null, null, 6);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<b, b> {
        final /* synthetic */ List $sortedFriends;

        static {
            Covode.recordClassIndex(65887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(List list) {
            super(1);
            this.$sortedFriends = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return b.a(bVar2, new com.bytedance.assem.arch.extensions.a(this.$sortedFriends), null, null, 6);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<b, b> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f102773a = new i();

        static {
            Covode.recordClassIndex(65888);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return b.a(bVar2, null, null, new p(z.INSTANCE, ""), 3);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<b, b> {
        final /* synthetic */ String $keyword;
        final /* synthetic */ List $list;

        static {
            Covode.recordClassIndex(65889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(List list, String str) {
            super(1);
            this.$list = list;
            this.$keyword = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return b.a(bVar2, null, null, new p(n.a((Iterable<?>) this.$list, IMUser.class), this.$keyword), 3);
        }
    }

    public final boolean b(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        return o().contains(iMUser);
    }

    public final boolean a(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        if (i().contains(iMUser) || o().contains(iMUser)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.d
    public final void a(List<IMContact> list, String str) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(str, "");
        a(new j(list, str));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void b(List<IMContact> list, boolean z) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(list, "");
    }

    public final void a(IMUser iMUser, boolean z) {
        h.f.b.l.d(iMUser, "");
        if (!this.f102769k && z != i().contains(iMUser)) {
            if (z) {
                i().add(iMUser);
                p();
            } else {
                i().remove(iMUser);
            }
            a(new f(iMUser));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(List<IMContact> list, boolean z) {
        h.f.b.l.d(list, "");
        List<IMUser> a2 = n.a((Iterable<?>) list, IMUser.class);
        for (IMUser iMUser : a2) {
            iMUser.setInitialLetter(com.ss.android.ugc.aweme.im.sdk.relations.b.b.a(iMUser.getDisplayName()));
        }
        a(new h(n.a((Iterable) a2, (Comparator) this.r)));
    }

    static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final c f102771a = new c();

        static {
            Covode.recordClassIndex(65882);
        }

        c() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            boolean z;
            IMUser iMUser = (IMUser) obj;
            IMUser iMUser2 = (IMUser) obj2;
            h.f.b.l.b(iMUser, "");
            String initialLetter = iMUser.getInitialLetter();
            h.f.b.l.b(initialLetter, "");
            Character j2 = h.m.p.j((CharSequence) initialLetter);
            boolean z2 = false;
            if (j2 != null) {
                z = Character.isLetter(j2.charValue());
            } else {
                z = false;
            }
            h.f.b.l.b(iMUser2, "");
            String initialLetter2 = iMUser2.getInitialLetter();
            h.f.b.l.b(initialLetter2, "");
            Character j3 = h.m.p.j((CharSequence) initialLetter2);
            if (j3 != null) {
                z2 = Character.isLetter(j3.charValue());
            }
            if (z) {
                if (!z2) {
                    return -1;
                }
            } else if (z2) {
                return 1;
            }
            if (h.f.b.l.a((Object) iMUser.getInitialLetter(), (Object) iMUser2.getInitialLetter())) {
                String displayName = iMUser.getDisplayName();
                h.f.b.l.b(displayName, "");
                Locale locale = Locale.ROOT;
                h.f.b.l.b(locale, "");
                Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = displayName.toLowerCase(locale);
                h.f.b.l.b(lowerCase, "");
                String displayName2 = iMUser2.getDisplayName();
                h.f.b.l.b(displayName2, "");
                Locale locale2 = Locale.ROOT;
                h.f.b.l.b(locale2, "");
                Objects.requireNonNull(displayName2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = displayName2.toLowerCase(locale2);
                h.f.b.l.b(lowerCase2, "");
                return lowerCase.compareTo(lowerCase2);
            }
            String initialLetter3 = iMUser.getInitialLetter();
            String initialLetter4 = iMUser2.getInitialLetter();
            h.f.b.l.b(initialLetter4, "");
            return initialLetter3.compareTo(initialLetter4);
        }
    }
}
