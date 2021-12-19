package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class ShareTextBoxViewModel extends ac implements com.ss.android.ugc.aweme.im.sdk.share.b.a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f103698l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LiveData<Integer> f103699a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<a> f103700b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<b> f103701c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<Float> f103702d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<Boolean> f103703e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<List<User>> f103704f;

    /* renamed from: g  reason: collision with root package name */
    final com.bytedance.android.widget.d<Boolean> f103705g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<Boolean> f103706h;

    /* renamed from: i  reason: collision with root package name */
    public final SharePackage f103707i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.a.a f103708j;

    /* renamed from: k  reason: collision with root package name */
    final t<Boolean> f103709k;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a f103710m;
    private final t<Integer> n;
    private final t<a> o;
    private final t<b> p;
    private final t<Float> q;
    private final t<Boolean> r;
    private final t<List<User>> s;
    private List<? extends IMContact> t;
    private final com.ss.android.ugc.aweme.im.service.share.a.b u;
    private final com.ss.android.ugc.aweme.im.sdk.share.b.a.b v;

    static {
        Covode.recordClassIndex(66439);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66440);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean c() {
        if (this.t.size() <= 15) {
            return true;
        }
        this.o.setValue(new a());
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements com.ss.android.ugc.aweme.im.sdk.share.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareTextBoxViewModel f103712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103713b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f103714c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f103715d;

        static {
            Covode.recordClassIndex(66443);
        }

        d(ShareTextBoxViewModel shareTextBoxViewModel, String str, List list, String str2) {
            this.f103712a = shareTextBoxViewModel;
            this.f103713b = str;
            this.f103714c = list;
            this.f103715d = str2;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.a
        public final void a() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel r0 = r3.f103712a
                com.ss.android.ugc.aweme.im.service.share.a.a r1 = r0.f103708j
                if (r1 == 0) goto L_0x000d
                com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel r0 = r3.f103712a
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r0.f103707i
                r1.a(r0)
            L_0x000d:
                com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel r0 = r3.f103712a
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r2 = r0.f103707i
                java.lang.String r1 = r3.f103713b
                java.util.List r0 = r3.f103714c
                com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(r2, r1, r0)
                java.util.List r0 = r3.f103714c
                int r1 = r0.size()
                r0 = 1
                if (r1 <= r0) goto L_0x002f
                com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel r0 = r3.f103712a
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r2 = r0.f103707i
                r1 = 0
                java.util.List r0 = r3.f103714c
                int r0 = r0.size()
                com.ss.android.ugc.aweme.im.sdk.share.a.a.a(r2, r1, r0)
            L_0x002f:
                java.lang.String r2 = r3.f103715d
                com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel r0 = r3.f103712a
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r0.f103707i
                java.util.List r0 = r3.f103714c
                java.util.List r0 = h.a.n.g(r0)
                com.ss.android.ugc.aweme.im.sdk.share.b.b.g.a(r2, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel.d.a():void");
        }
    }

    private List<IMContact> a() {
        List<? extends IMContact> list = this.t;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (!(t2 instanceof com.ss.android.ugc.aweme.social.c.a)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    private final void b() {
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar = this.f103710m;
        if (aVar != null && aVar.f103568b) {
            this.p.postValue(new b(R.string.c6y));
        } else if (this.t.size() <= 1) {
            this.p.postValue(new b(R.string.ci1));
        } else {
            this.p.postValue(new b(R.string.fku, this.t.size()));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void b(boolean z) {
        com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar = this.v;
        if (bVar != null) {
            bVar.b(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void c(boolean z) {
        com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar = this.v;
        if (bVar != null) {
            bVar.c(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void a(boolean z) {
        b();
        com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar = this.v;
        if (bVar != null) {
            bVar.a(z);
        }
    }

    public final void d(boolean z) {
        com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar = this.v;
        if (bVar != null) {
            bVar.c(z);
        }
        this.r.setValue(Boolean.valueOf(z));
        if (!z) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar = this.f103710m;
            if (aVar != null) {
                aVar.f103569c = false;
            }
            b();
        }
    }

    static final class c extends m implements h.f.a.b<h, z> {
        final /* synthetic */ boolean $sendWithUndo;
        final /* synthetic */ String $userInputText;
        final /* synthetic */ ShareTextBoxViewModel this$0;

        static {
            Covode.recordClassIndex(66442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ShareTextBoxViewModel shareTextBoxViewModel, String str, boolean z) {
            super(1);
            this.this$0 = shareTextBoxViewModel;
            this.$userInputText = str;
            this.$sendWithUndo = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h hVar) {
            h hVar2 = hVar;
            this.this$0.d(false);
            if (hVar2 != null) {
                this.this$0.f103707i.f124595i.putBoolean("is_new_group", true);
                this.this$0.a(n.c(e.b(hVar2)), this.$userInputText, this.$sendWithUndo);
            }
            return z.f158842a;
        }
    }

    private final void b(List<? extends IMContact> list) {
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (t2 instanceof com.ss.android.ugc.aweme.social.c.a) {
                arrayList.add(t2);
            }
        }
        List<com.ss.android.ugc.aweme.social.c.a> a2 = n.a((Iterable) arrayList, (Comparator) b.f103711a);
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) a2, 10));
        for (com.ss.android.ugc.aweme.social.c.a aVar : a2) {
            arrayList2.add(com.ss.android.ugc.aweme.social.c.b.a(aVar));
        }
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            if (!list.isEmpty()) {
                this.f103707i.f124595i.putBoolean("show_tips_until_cancel", true);
                this.s.postValue(arrayList3);
                return;
            }
            this.s.setValue(arrayList3);
        }
    }

    public final void a(List<? extends IMContact> list) {
        l.d(list, "");
        this.t = list;
        b();
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar = this.f103710m;
        if (aVar != null) {
            aVar.a(list);
        }
        List<? extends IMContact> list2 = this.t;
        if (list2 == null || list2.isEmpty()) {
            this.q.setValue(Float.valueOf(0.5f));
        } else {
            this.q.setValue(Float.valueOf(1.0f));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103711a = new b();

        static {
            Covode.recordClassIndex(66441);
        }

        b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((com.ss.android.ugc.aweme.social.c.a) obj).getSortIndex() - ((com.ss.android.ugc.aweme.social.c.a) obj2).getSortIndex();
        }
    }

    private final void a(SharePackage sharePackage, int i2) {
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar = this.f103710m;
        if (aVar == null || !aVar.f103568b) {
            sharePackage.f124595i.putInt("is_create_group_chat", 0);
        } else {
            sharePackage.f124595i.putInt("is_create_group_chat", 1);
        }
        sharePackage.f124595i.putInt("friends_shared_cnt", i2);
    }

    public final void a(String str, boolean z) {
        Boolean bool;
        List<? extends IMContact> list = this.t;
        if (list != null && !list.isEmpty()) {
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = this.u;
            if (bVar != null && !bVar.a(this.f103707i)) {
                com.ss.android.ugc.aweme.im.service.m.a.a("ShareTextBoxViewModel", "cancel share by callback");
            } else if (str == null || str.length() <= 6000) {
                com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar = this.f103710m;
                if (aVar != null && aVar.f103568b) {
                    com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar2 = this.f103710m;
                    if (aVar2 != null) {
                        bool = Boolean.valueOf(aVar2.a(new c(this, str, z)));
                    } else {
                        bool = null;
                    }
                    if (l.a((Object) bool, (Object) true)) {
                        d(true);
                    }
                } else if (c()) {
                    b(this.t);
                    List<IMContact> a2 = a();
                    if (!a2.isEmpty()) {
                        a(a2, str, z);
                    }
                }
            } else {
                this.n.setValue(Integer.valueOf((int) R.string.cfv));
            }
        }
    }

    public final void a(List<? extends IMContact> list, String str, boolean z) {
        boolean z2;
        l.d(list, "");
        this.f103709k.setValue(true);
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        com.ss.android.ugc.aweme.im.service.share.a.a aVar = this.f103708j;
        if (aVar != null) {
            aVar.b(this.f103707i);
        }
        com.ss.android.ugc.aweme.im.sdk.share.b.a.a(this.f103707i, list);
        a(this.f103707i, com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a.a(list));
        d dVar = new d(this, str, list, uuid);
        boolean z3 = !n.a((Iterable<?>) list, IMConversation.class).isEmpty();
        SharePackage sharePackage = this.f103707i;
        if (z3 || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a((List<IMContact>) list, str, sharePackage, uuid, z2, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) dVar);
        if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(this.f103707i)) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(list.size());
        }
    }

    public /* synthetic */ ShareTextBoxViewModel(SharePackage sharePackage, com.ss.android.ugc.aweme.im.service.share.a.b bVar, com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar2, t tVar, com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b bVar3) {
        this(sharePackage, null, bVar, bVar2, tVar, bVar3, false);
    }

    public ShareTextBoxViewModel(SharePackage sharePackage, com.ss.android.ugc.aweme.im.service.share.a.a aVar, com.ss.android.ugc.aweme.im.service.share.a.b bVar, com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar2, t<Boolean> tVar, com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b bVar3, boolean z) {
        l.d(sharePackage, "");
        l.d(tVar, "");
        l.d(bVar3, "");
        this.f103707i = sharePackage;
        this.f103708j = aVar;
        this.u = bVar;
        this.v = bVar2;
        this.f103709k = tVar;
        t<Integer> tVar2 = new t<>();
        this.n = tVar2;
        this.f103699a = tVar2;
        t<a> tVar3 = new t<>();
        this.o = tVar3;
        this.f103700b = tVar3;
        t<b> tVar4 = new t<>();
        this.p = tVar4;
        this.f103701c = tVar4;
        t<Float> tVar5 = new t<>();
        this.q = tVar5;
        this.f103702d = tVar5;
        t<Boolean> tVar6 = new t<>();
        this.r = tVar6;
        this.f103703e = tVar6;
        t<List<User>> tVar7 = new t<>();
        this.s = tVar7;
        this.f103704f = tVar7;
        com.bytedance.android.widget.d<Boolean> dVar = new com.bytedance.android.widget.d<>();
        this.f103705g = dVar;
        this.f103706h = dVar;
        this.t = h.a.z.INSTANCE;
        if (i.a()) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a(bVar3, sharePackage, this, z);
            aVar2.c();
            this.f103710m = aVar2;
        }
    }
}
