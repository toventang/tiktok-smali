package com.ss.android.ugc.aweme.upvote.detail.panel;

import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.cg;
import h.a.n;
import h.f.b.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class UpvoteDetailPanelViewModel extends AssemViewModel<l> implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: j  reason: collision with root package name */
    private final h.h f142146j = h.i.a((h.f.a.a) e.f142159a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f142147k = h.i.a((h.f.a.a) k.f142166a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f142148l = h.i.a((h.f.a.a) d.f142158a);

    static {
        Covode.recordClassIndex(92909);
    }

    public final f.a.b.a g() {
        return (f.a.b.a) this.f142146j.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(147, new org.greenrobot.eventbus.g(UpvoteDetailPanelViewModel.class, "onUserBlocked", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final HashMap<String, a> h() {
        return (HashMap) this.f142147k.getValue();
    }

    public final HashSet<String> i() {
        return (HashSet) this.f142148l.getValue();
    }

    static final class d extends m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142158a = new d();

        static {
            Covode.recordClassIndex(92913);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    static final class e extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f142159a = new e();

        static {
            Covode.recordClassIndex(92914);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class k extends m implements h.f.a.a<HashMap<String, a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f142166a = new k();

        static {
            Covode.recordClassIndex(92920);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, a> invoke() {
            return new HashMap();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        super.c();
        cg.a(this);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ l f() {
        return new l(q.LOADING, true, 0.0f, new com.bytedance.assem.arch.extensions.a(false));
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        g().a();
        h().clear();
        i().clear();
        cg.b(this);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f142149a = true;

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.translation.a.c f142150b;

        static {
            Covode.recordClassIndex(92910);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f142149a == aVar.f142149a && h.f.b.l.a(this.f142150b, aVar.f142150b);
        }

        public final int hashCode() {
            boolean z = this.f142149a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            com.ss.android.ugc.aweme.translation.a.c cVar = this.f142150b;
            return i5 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "TranslationStatus(isShowTranslation=" + this.f142149a + ", translationResult=" + this.f142150b + ")";
        }

        public a(com.ss.android.ugc.aweme.translation.a.c cVar) {
            h.f.b.l.d(cVar, "");
            this.f142150b = cVar;
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.translation.ui.a f142165a;

        static {
            Covode.recordClassIndex(92919);
        }

        public j(com.ss.android.ugc.aweme.translation.ui.a aVar) {
            this.f142165a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.translation.ui.a aVar = this.f142165a;
            new Exception((Throwable) obj);
            aVar.a();
        }
    }

    @r
    public final void onUserBlocked(com.ss.android.ugc.aweme.profile.b.a aVar) {
        h.f.b.l.d(aVar, "");
        a(g.f142160a);
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvoteDetailPanelViewModel f142155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142157c;

        static {
            Covode.recordClassIndex(92912);
        }

        public c(UpvoteDetailPanelViewModel upvoteDetailPanelViewModel, String str, h.f.a.a aVar) {
            this.f142155a = upvoteDetailPanelViewModel;
            this.f142156b = str;
            this.f142157c = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f142155a.i().remove(this.f142156b);
            this.f142157c.invoke();
        }
    }

    static final class f extends m implements h.f.a.b<l, l> {
        final /* synthetic */ boolean $containsSelf;
        final /* synthetic */ q $toStatus;

        static {
            Covode.recordClassIndex(92915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(q qVar, boolean z) {
            super(1);
            this.$toStatus = qVar;
            this.$containsSelf = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, this.$toStatus, this.$containsSelf, 0.0f, null, 12);
        }
    }

    static final class g extends m implements h.f.a.b<l, l> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f142160a = new g();

        static {
            Covode.recordClassIndex(92916);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, null, false, 0.0f, new com.bytedance.assem.arch.extensions.a(true), 7);
        }
    }

    static final class h extends m implements h.f.a.b<l, l> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f142161a = new h();

        static {
            Covode.recordClassIndex(92917);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, q.LOADING, true, 0.0f, new com.bytedance.assem.arch.extensions.a(true), 4);
        }
    }

    static final class l extends m implements h.f.a.b<l, l> {
        final /* synthetic */ float $slideOffset;

        static {
            Covode.recordClassIndex(92921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(float f2) {
            super(1);
            this.$slideOffset = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            return l.a(lVar2, null, false, this.$slideOffset, null, 11);
        }
    }

    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        a aVar = h().get(str);
        if (aVar == null || !aVar.f142149a) {
            return false;
        }
        return true;
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvoteDetailPanelViewModel f142151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142152b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.upvote.c.h f142153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f142154d;

        static {
            Covode.recordClassIndex(92911);
        }

        public b(UpvoteDetailPanelViewModel upvoteDetailPanelViewModel, String str, com.ss.android.ugc.aweme.upvote.c.h hVar, boolean z) {
            this.f142151a = upvoteDetailPanelViewModel;
            this.f142152b = str;
            this.f142153c = hVar;
            this.f142154d = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            this.f142151a.i().remove(this.f142152b);
            this.f142153c.setUserLiked(this.f142154d);
            com.ss.android.ugc.aweme.upvote.c.h hVar = this.f142153c;
            int likeCount = hVar.getLikeCount();
            if (this.f142154d) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            hVar.setLikeCount(likeCount + i2);
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvoteDetailPanelViewModel f142162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142163b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.translation.ui.a f142164c;

        static {
            Covode.recordClassIndex(92918);
        }

        public i(UpvoteDetailPanelViewModel upvoteDetailPanelViewModel, String str, com.ss.android.ugc.aweme.translation.ui.a aVar) {
            this.f142162a = upvoteDetailPanelViewModel;
            this.f142163b = str;
            this.f142164c = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.translation.a.a aVar = (com.ss.android.ugc.aweme.translation.a.a) obj;
            h.f.b.l.b(aVar, "");
            List<com.ss.android.ugc.aweme.translation.a.c> list = aVar.f141008a;
            if (list != null && !list.isEmpty()) {
                List<com.ss.android.ugc.aweme.translation.a.c> list2 = aVar.f141008a;
                h.f.b.l.b(list2, "");
                com.ss.android.ugc.aweme.translation.a.c cVar = (com.ss.android.ugc.aweme.translation.a.c) n.g((List) list2);
                HashMap<String, a> h2 = this.f142162a.h();
                String str = this.f142163b;
                h.f.b.l.b(cVar, "");
                h2.put(str, new a(cVar));
                this.f142164c.a(cVar);
            }
        }
    }
}
