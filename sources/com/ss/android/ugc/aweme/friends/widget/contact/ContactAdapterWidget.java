package com.ss.android.ugc.aweme.friends.widget.contact;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.friends.widget.contact.f;
import com.ss.android.ugc.aweme.friends.widget.contact.vm.InviteContactVM;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.List;

public final class ContactAdapterWidget extends InboxAdapterWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f97303a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f97304b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f97305c = h.i.a((h.f.a.a) e.f97310a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f97306i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f97307j;

    static {
        Covode.recordClassIndex(61808);
    }

    private final FrameLayout i() {
        return (FrameLayout) this.f97306i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int a(int i2) {
        return -1;
    }

    public final InviteContactVM a() {
        return (InviteContactVM) this.f97303a.getValue();
    }

    public final d b() {
        return (d) this.f97304b.getValue();
    }

    public final f c() {
        return (f) this.f97305c.getValue();
    }

    public final a.AnonymousClass1 d() {
        return (a.AnonymousClass1) this.f97307j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ ContactAdapterWidget this$0;

        static {
            Covode.recordClassIndex(61809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ContactAdapterWidget contactAdapterWidget) {
            super(0);
            this.this$0 = contactAdapterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new RecyclerView.n(this) {
                /* class com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f97308a;

                static {
                    Covode.recordClassIndex(61810);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f97308a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2, int i3) {
                    List<a> subList;
                    l.d(recyclerView, "");
                    RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    if (recyclerView.f(linearLayoutManager.k()) instanceof com.ss.android.ugc.aweme.friends.widget.contact.a.a) {
                        List<a> value = this.f97308a.this$0.a().f97359d.getValue();
                        if (value != null && (subList = value.subList(1, value.size() - 1)) != null) {
                            this.f97308a.this$0.c().a(subList);
                            return;
                        }
                        return;
                    }
                    this.f97308a.this$0.c().a();
                }
            };
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f97310a = new e();

        static {
            Covode.recordClassIndex(61814);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return f.a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<Boolean> e() {
        return a().f97363h;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<InboxAdapterWidget.b> f() {
        return a().f97361f;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final RecyclerView.a<?> g() {
        return b();
    }

    static final class b extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ ContactAdapterWidget this$0;

        static {
            Covode.recordClassIndex(61811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ContactAdapterWidget contactAdapterWidget, Fragment fragment) {
            super(0);
            this.this$0 = contactAdapterWidget;
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d(this.$fragment, this.this$0.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void h() {
        com.ss.android.ugc.aweme.inbox.d.g.c();
        a().b();
    }

    static final class c extends h.f.b.m implements h.f.a.a<InviteContactVM> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(61812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InviteContactVM invoke() {
            Fragment fragment = this.$fragment;
            l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(InviteContactVM.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(61815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            View view = this.$fragment.getView();
            if (view != null) {
                return view.findViewWithTag("INBOX_FRAGMENT_CONTAINER");
            }
            return null;
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        d b2 = b();
        g gVar = new g(this);
        l.d(gVar, "");
        b2.f97321b = gVar;
        d b3 = b();
        h hVar = new h(this);
        l.d(hVar, "");
        b3.f97322c = hVar;
        b().f97323d = new i(this);
        a().f97359d.observe(this, new d(this));
        h();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        Object obj;
        try {
            if (!c().isAdded() && this.f104370e.getChildFragmentManager().a("SearchContact_FM") == null && i() != null) {
                n a2 = this.f104370e.getChildFragmentManager().a();
                FrameLayout i2 = i();
                if (i2 == null) {
                    l.b();
                }
                a2.a(i2.getId(), c(), "SearchContact_FM").c(c()).f().c();
            }
            obj = q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        Throwable r2 = q.m226exceptionOrNullimpl(obj);
        if (r2 != null) {
            com.ss.android.ugc.aweme.common.f.a("InviteContact", "add search fragment error!", r2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactAdapterWidget f97309a;

        static {
            Covode.recordClassIndex(61813);
        }

        d(ContactAdapterWidget contactAdapterWidget) {
            this.f97309a = contactAdapterWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97309a.b().a((List) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<RecyclerView, z> {
        final /* synthetic */ ContactAdapterWidget this$0;

        static {
            Covode.recordClassIndex(61816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ContactAdapterWidget contactAdapterWidget) {
            super(1);
            this.this$0 = contactAdapterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            l.d(recyclerView2, "");
            recyclerView2.a(this.this$0.d());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<RecyclerView, z> {
        final /* synthetic */ ContactAdapterWidget this$0;

        static {
            Covode.recordClassIndex(61817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ContactAdapterWidget contactAdapterWidget) {
            super(1);
            this.this$0 = contactAdapterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            l.d(recyclerView2, "");
            recyclerView2.b(this.this$0.d());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactAdapterWidget f97311a;

        static {
            Covode.recordClassIndex(61818);
        }

        i(ContactAdapterWidget contactAdapterWidget) {
            this.f97311a = contactAdapterWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            InviteContactVM a2 = this.f97311a.a();
            l.b(bool, "");
            a2.f97362g.postValue(Boolean.valueOf(bool.booleanValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void a(int i2, com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        super.a(i2, bVar);
        d b2 = b();
        l.d(bVar, "");
        b2.f97324e.put(i2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAdapterWidget(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        super(fragment, liveData);
        l.d(fragment, "");
        l.d(liveData, "");
        this.f97303a = h.i.a((h.f.a.a) new c(fragment));
        this.f97304b = h.i.a((h.f.a.a) new b(this, fragment));
        this.f97306i = h.i.a((h.f.a.a) new f(fragment));
        this.f97307j = h.i.a((h.f.a.a) new a(this));
    }
}
