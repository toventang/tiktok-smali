package com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationSearchApi;
import com.ss.android.ugc.gamora.editor.sticker.donation.api.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class OrganizationListViewModel extends JediViewModel<OrganizationListState> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f146588f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f146589a;

    /* renamed from: b  reason: collision with root package name */
    public int f146590b = 1;

    /* renamed from: c  reason: collision with root package name */
    public List<com.ss.android.ugc.gamora.editor.sticker.donation.c.c> f146591c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f146592d;

    /* renamed from: e  reason: collision with root package name */
    public List<com.ss.android.ugc.gamora.editor.sticker.donation.c.e> f146593e = new ArrayList();

    static {
        Covode.recordClassIndex(96469);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96470);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        g();
        a(false);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ OrganizationListState d() {
        return new OrganizationListState(null, 1, null);
    }

    public final void b() {
        c(i.f146602a);
        a();
    }

    public final void g() {
        this.f146591c.clear();
        this.f146589a = 0;
        this.f146590b = 1;
        this.f146592d = null;
        this.f146593e.clear();
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrganizationListViewModel f146596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f146597b;

        static {
            Covode.recordClassIndex(96475);
        }

        d(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f146596a = organizationListViewModel;
            this.f146597b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.df.e.a((Throwable) obj);
            this.f146596a.c(new h.f.a.b<OrganizationListState, OrganizationListState>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(96476);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    l.d(organizationListState2, "");
                    List<com.ss.android.ugc.gamora.editor.sticker.donation.c.c> list = this.this$0.f146596a.f146591c;
                    boolean z2 = this.this$0.f146597b;
                    if (this.this$0.f146596a.f146590b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new a(null, false, null, list, null, null, false, false, z2, z, LiveFeedRefreshTimeSetting.DEFAULT));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrganizationListViewModel f146600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f146601b;

        static {
            Covode.recordClassIndex(96481);
        }

        g(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f146600a = organizationListViewModel;
            this.f146601b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.df.e.a((Throwable) obj);
            this.f146600a.c(new h.f.a.b<OrganizationListState, OrganizationListState>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(96482);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    l.d(organizationListState2, "");
                    List<com.ss.android.ugc.gamora.editor.sticker.donation.c.e> list = this.this$0.f146600a.f146593e;
                    String str = this.this$0.f146600a.f146592d;
                    boolean z2 = this.this$0.f146601b;
                    if (this.this$0.f146600a.f146590b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new a(str, true, list, null, null, null, false, false, z2, z, 184));
                }
            });
        }
    }

    public static final class h extends m implements h.f.a.b<OrganizationListState, z> {
        final /* synthetic */ OrganizationListViewModel this$0;

        static {
            Covode.recordClassIndex(96483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(OrganizationListViewModel organizationListViewModel) {
            super(1);
            this.this$0 = organizationListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(OrganizationListState organizationListState) {
            OrganizationListState organizationListState2 = organizationListState;
            l.d(organizationListState2, "");
            a result = organizationListState2.getResult();
            if (result == null || !result.f146604b) {
                this.this$0.a(true);
            } else {
                this.this$0.b(true);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<OrganizationListState, OrganizationListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f146602a = new i();

        static {
            Covode.recordClassIndex(96484);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
            OrganizationListState organizationListState2 = organizationListState;
            l.d(organizationListState2, "");
            return organizationListState2.copy(new a(null, false, null, null, null, null, false, true, false, false, 56));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<OrganizationListState, OrganizationListState> {
        final /* synthetic */ boolean $isLoadMore;
        final /* synthetic */ OrganizationListViewModel this$0;

        static {
            Covode.recordClassIndex(96471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OrganizationListViewModel organizationListViewModel, boolean z) {
            super(1);
            this.this$0 = organizationListViewModel;
            this.$isLoadMore = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
            boolean z;
            OrganizationListState organizationListState2 = organizationListState;
            l.d(organizationListState2, "");
            List<com.ss.android.ugc.gamora.editor.sticker.donation.c.c> list = this.this$0.f146591c;
            boolean z2 = this.$isLoadMore;
            if (this.this$0.f146590b == 1) {
                z = true;
            } else {
                z = false;
            }
            return organizationListState2.copy(new a(null, false, null, list, null, null, true, false, z2, z, 181));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrganizationListViewModel f146594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f146595b;

        static {
            Covode.recordClassIndex(96472);
        }

        c(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f146594a = organizationListViewModel;
            this.f146595b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.gamora.editor.sticker.donation.c.d dVar = (com.ss.android.ugc.gamora.editor.sticker.donation.c.d) obj;
            if (dVar.error_code == 0) {
                this.f146594a.f146589a = dVar.f146545a;
                this.f146594a.f146590b = dVar.f146546b;
                List<com.ss.android.ugc.gamora.editor.sticker.donation.c.c> list = dVar.f146549e;
                if (list != null) {
                    this.f146594a.f146591c.addAll(list);
                }
                this.f146594a.c(new h.f.a.b<OrganizationListState, OrganizationListState>(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(96473);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                        boolean z;
                        OrganizationListState organizationListState2 = organizationListState;
                        l.d(organizationListState2, "");
                        List<com.ss.android.ugc.gamora.editor.sticker.donation.c.c> list = this.this$0.f146594a.f146591c;
                        String str = dVar.f146547c;
                        com.ss.android.ugc.gamora.editor.sticker.donation.c.a aVar = dVar.f146548d;
                        boolean z2 = this.this$0.f146595b;
                        if (this.this$0.f146594a.f146590b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return organizationListState2.copy(new a(null, false, null, list, str, aVar, false, true, z2, z, 4));
                    }
                });
                return;
            }
            this.f146594a.c(new h.f.a.b<OrganizationListState, OrganizationListState>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(96474);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    l.d(organizationListState2, "");
                    List<com.ss.android.ugc.gamora.editor.sticker.donation.c.c> list = this.this$0.f146594a.f146591c;
                    boolean z2 = this.this$0.f146595b;
                    if (this.this$0.f146594a.f146590b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new a(null, false, null, list, null, null, false, false, z2, z, LiveFeedRefreshTimeSetting.DEFAULT));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<OrganizationListState, OrganizationListState> {
        final /* synthetic */ boolean $isLoadMore;
        final /* synthetic */ OrganizationListViewModel this$0;

        static {
            Covode.recordClassIndex(96477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(OrganizationListViewModel organizationListViewModel, boolean z) {
            super(1);
            this.this$0 = organizationListViewModel;
            this.$isLoadMore = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
            boolean z;
            OrganizationListState organizationListState2 = organizationListState;
            l.d(organizationListState2, "");
            List<com.ss.android.ugc.gamora.editor.sticker.donation.c.e> list = this.this$0.f146593e;
            String str = this.this$0.f146592d;
            boolean z2 = this.$isLoadMore;
            if (this.this$0.f146590b == 1) {
                z = true;
            } else {
                z = false;
            }
            return organizationListState2.copy(new a(str, true, list, null, null, null, true, false, z2, z, 184));
        }
    }

    public final void a(boolean z) {
        c(new b(this, z));
        com.ss.android.ugc.gamora.editor.sticker.donation.api.a.a(new com.ss.android.ugc.gamora.editor.sticker.donation.api.b(this.f146589a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, z), new d(this, z));
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrganizationListViewModel f146598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f146599b;

        static {
            Covode.recordClassIndex(96478);
        }

        f(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f146598a = organizationListViewModel;
            this.f146599b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int intValue;
            com.ss.android.ugc.gamora.editor.sticker.donation.c.f fVar = (com.ss.android.ugc.gamora.editor.sticker.donation.c.f) obj;
            if (fVar.error_code == 0) {
                OrganizationListViewModel organizationListViewModel = this.f146598a;
                int i2 = 0;
                if (fVar.f146550a == null) {
                    intValue = 0;
                } else {
                    intValue = fVar.f146550a.intValue();
                }
                organizationListViewModel.f146589a = intValue;
                OrganizationListViewModel organizationListViewModel2 = this.f146598a;
                if (fVar.f146551b != null && !l.a((Object) fVar.f146551b, (Object) false)) {
                    i2 = 1;
                }
                organizationListViewModel2.f146590b = i2;
                List<com.ss.android.ugc.gamora.editor.sticker.donation.c.e> list = fVar.f146552c;
                if (list != null) {
                    this.f146598a.f146593e.addAll(list);
                }
                this.f146598a.c(new h.f.a.b<OrganizationListState, OrganizationListState>(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(96479);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                        boolean z;
                        OrganizationListState organizationListState2 = organizationListState;
                        l.d(organizationListState2, "");
                        List<com.ss.android.ugc.gamora.editor.sticker.donation.c.e> list = this.this$0.f146598a.f146593e;
                        String str = this.this$0.f146598a.f146592d;
                        boolean z2 = this.this$0.f146599b;
                        if (this.this$0.f146598a.f146590b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return organizationListState2.copy(new a(str, true, list, null, null, null, false, true, z2, z, 56));
                    }
                });
                return;
            }
            this.f146598a.c(new h.f.a.b<OrganizationListState, OrganizationListState>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.f.AnonymousClass2 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(96480);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    l.d(organizationListState2, "");
                    List<com.ss.android.ugc.gamora.editor.sticker.donation.c.e> list = this.this$0.f146598a.f146593e;
                    String str = this.this$0.f146598a.f146592d;
                    boolean z2 = this.this$0.f146599b;
                    if (this.this$0.f146598a.f146590b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new a(str, true, list, null, null, null, false, false, z2, z, 184));
                }
            });
        }
    }

    public final void b(boolean z) {
        c(new e(this, z));
        c.a aVar = new c.a();
        if (z) {
            aVar.f146529a = this.f146589a;
        }
        aVar.f146531c = this.f146592d;
        OrganizationSearchApi.a.a(aVar.a()).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this, z), new g(this, z));
    }
}
