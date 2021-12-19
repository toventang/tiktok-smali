package com.ss.android.ugc.aweme.setting.viewmodel;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.n;
import com.bytedance.jedi.arch.ext.list.o;
import f.a.ab;
import f.a.d.g;
import f.a.x;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class AuthListViewModel extends JediViewModel<AuthInfoState> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f123056e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.m.c f123057a = new com.ss.android.ugc.aweme.setting.m.c();

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.setting.model.c> f123058b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f123059c = true;

    /* renamed from: d  reason: collision with root package name */
    public final ListMiddleware<AuthInfoState, com.ss.android.ugc.aweme.setting.model.c, o> f123060d = new ListMiddleware<>(new a(this), null, new e(this), n.a.f39457a);

    static {
        Covode.recordClassIndex(80819);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(80822);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ AuthInfoState d() {
        return new AuthInfoState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        ListMiddleware<AuthInfoState, com.ss.android.ugc.aweme.setting.model.c, o> listMiddleware = this.f123060d;
        listMiddleware.a(a.f123064a, c.f123062a);
        a(listMiddleware);
        this.f123060d.refresh();
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f123063a = new d();

        static {
            Covode.recordClassIndex(80824);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.setting.model.b bVar = (com.ss.android.ugc.aweme.setting.model.b) obj;
            l.d(bVar, "");
            return bVar.f122317a;
        }
    }

    public static final class a extends m implements h.f.a.b<AuthInfoState, f.a.t<p<? extends List<? extends com.ss.android.ugc.aweme.setting.model.c>, ? extends o>>> {
        final /* synthetic */ AuthListViewModel this$0;

        static {
            Covode.recordClassIndex(80820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuthListViewModel authListViewModel) {
            super(1);
            this.this$0 = authListViewModel;
        }

        public final f.a.t<p<List<com.ss.android.ugc.aweme.setting.model.c>, o>> invoke(AuthInfoState authInfoState) {
            l.c(authInfoState, "");
            this.this$0.f123059c = true;
            ab a2 = ab.a((x) this.this$0.f123057a.f122287b.c(z.f158842a));
            l.b(a2, "");
            ab c2 = a2.c(d.f123063a);
            l.b(c2, "");
            f.a.t<p<List<com.ss.android.ugc.aweme.setting.model.c>, o>> d2 = c2.d().d(AnonymousClass1.f123061a);
            l.a((Object) d2, "");
            return d2;
        }
    }

    public static final class f extends m implements h.f.a.b<AuthInfoState, AuthInfoState> {
        final /* synthetic */ String $clientKey;

        static {
            Covode.recordClassIndex(80826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.$clientKey = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AuthInfoState invoke(AuthInfoState authInfoState) {
            AuthInfoState authInfoState2 = authInfoState;
            l.d(authInfoState2, "");
            ListState<com.ss.android.ugc.aweme.setting.model.c, o> listState = authInfoState2.getListState();
            List<com.ss.android.ugc.aweme.setting.model.c> list = authInfoState2.getListState().getList();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!l.a((Object) t.getClientKey(), (Object) this.$clientKey)) {
                    arrayList.add(t);
                }
            }
            return authInfoState2.copy(ListState.copy$default(listState, null, arrayList, null, null, null, 29, null));
        }
    }

    static final class c extends m implements h.f.a.m<AuthInfoState, ListState<com.ss.android.ugc.aweme.setting.model.c, o>, AuthInfoState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123062a = new c();

        static {
            Covode.recordClassIndex(80823);
        }

        c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ AuthInfoState invoke(AuthInfoState authInfoState, ListState<com.ss.android.ugc.aweme.setting.model.c, o> listState) {
            AuthInfoState authInfoState2 = authInfoState;
            ListState<com.ss.android.ugc.aweme.setting.model.c, o> listState2 = listState;
            l.d(authInfoState2, "");
            l.d(listState2, "");
            return authInfoState2.copy(listState2);
        }
    }

    static final class e extends m implements h.f.a.m<List<? extends com.ss.android.ugc.aweme.setting.model.c>, List<? extends com.ss.android.ugc.aweme.setting.model.c>, List<? extends com.ss.android.ugc.aweme.setting.model.c>> {
        final /* synthetic */ AuthListViewModel this$0;

        static {
            Covode.recordClassIndex(80825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AuthListViewModel authListViewModel) {
            super(2);
            this.this$0 = authListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.setting.model.c> invoke(List<? extends com.ss.android.ugc.aweme.setting.model.c> list, List<? extends com.ss.android.ugc.aweme.setting.model.c> list2) {
            List<? extends com.ss.android.ugc.aweme.setting.model.c> list3 = list2;
            l.d(list, "");
            l.d(list3, "");
            if (!(!list3.isEmpty())) {
                return list;
            }
            list3.size();
            this.this$0.f123059c = false;
            return list3;
        }
    }
}
