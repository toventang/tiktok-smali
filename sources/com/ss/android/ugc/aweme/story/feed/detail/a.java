package com.ss.android.ugc.aweme.story.feed.detail;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.g;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class a implements aa {

    /* renamed from: e  reason: collision with root package name */
    public static final h f137683e = i.a((h.f.a.a) b.f137689a);

    /* renamed from: f  reason: collision with root package name */
    public static final C3619a f137684f = new C3619a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f137685a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public ad f137686b;

    /* renamed from: c  reason: collision with root package name */
    public List<Aweme> f137687c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f137688d;

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public int getPageType(int i2) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public Object getViewModel() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean init(Fragment fragment) {
        l.d(fragment, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.a$a  reason: collision with other inner class name */
    public static final class C3619a {
        static {
            Covode.recordClassIndex(90107);
        }

        private C3619a() {
        }

        public /* synthetic */ C3619a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isLoading() {
        return this.f137688d;
    }

    static final class b extends m implements h.f.a.a<HashMap<String, Aweme>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137689a = new b();

        static {
            Covode.recordClassIndex(90108);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Aweme> invoke() {
            return new HashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void unInit() {
        this.f137685a.dispose();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isDataEmpty() {
        List<Aweme> list = this.f137687c;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(90106);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void bindView(ad adVar) {
        l.d(adVar, "");
        this.f137686b = adVar;
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137691a;

        static {
            Covode.recordClassIndex(90110);
        }

        d(a aVar) {
            this.f137691a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f137691a.f137688d = false;
            this.f137691a.a(R.string.hav);
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137690a;

        static {
            Covode.recordClassIndex(90109);
        }

        c(a aVar) {
            this.f137690a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.detail.g.a aVar = (com.ss.android.ugc.aweme.detail.g.a) obj;
            this.f137690a.f137688d = false;
            l.b(aVar, "");
            List<Aweme> list = aVar.f79632a;
            l.b(list, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                l.b(t, "");
                arrayList.add(com.ss.android.ugc.aweme.story.d.a.l(t));
            }
            this.f137690a.a(arrayList);
        }
    }

    public final void a(int i2) {
        Fragment az_;
        e activity;
        ad adVar = this.f137686b;
        if (adVar != null && (az_ = adVar.az_()) != null && (activity = az_.getActivity()) != null) {
            String string = activity.getString(i2);
            l.b(string, "");
            l.b(activity, "");
            new com.bytedance.tux.g.b(activity).a(string).b();
        }
    }

    /* access modifiers changed from: protected */
    public void a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        l.d(bVar, "");
        f.a.b.b a2 = StoryApi.f136727a.queryBatchAwemeRx("[" + bVar.getAid() + "]", bVar.getEventType(), bVar.getPushParams(), 1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this));
        l.b(a2, "");
        f.a.j.a.a(a2, this.f137685a);
    }

    /* access modifiers changed from: protected */
    public final void a(List<? extends Aweme> list) {
        l.d(list, "");
        this.f137687c = n.g((Collection) list);
        ad adVar = this.f137686b;
        if (adVar != null) {
            adVar.a((List) list, false);
        }
        ad adVar2 = this.f137686b;
        if (adVar2 != null) {
            adVar2.a((Aweme) list.get(0));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        if (!g.f137757a.a()) {
            a(R.string.har);
            return;
        }
        this.f137688d = true;
        a(bVar);
    }
}
