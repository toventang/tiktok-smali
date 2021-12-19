package com.ss.android.ugc.aweme.inbox.widget.multi;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.inbox.f.a;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import h.f.b.l;
import h.h;
import h.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class MultiAdapterWidget extends InboxAdapterWidget implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    private final h f104386a;

    /* renamed from: b  reason: collision with root package name */
    private final h f104387b;

    /* renamed from: c  reason: collision with root package name */
    private final h f104388c = h.i.a((h.f.a.a) b.f104389a);

    static {
        Covode.recordClassIndex(66842);
    }

    public final MultiViewModel b() {
        return (MultiViewModel) this.f104386a.getValue();
    }

    public final j c() {
        return (j) this.f104387b.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(389, new g(MultiAdapterWidget.class, "onRedPointUpdate", m.class, ThreadMode.MAIN, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        h();
    }

    static final class a extends h.f.b.m implements h.f.a.a<j> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(66843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new j(this.$fragment);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<MultiViewModel> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(66845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MultiViewModel invoke() {
            return MultiViewModel.a.a(this.$fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<Boolean> e() {
        return b().f104397f;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<InboxAdapterWidget.b> f() {
        return b().f104395d;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final RecyclerView.a<?> g() {
        return c();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }

    static final class b extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104389a = new b();

        static {
            Covode.recordClassIndex(66844);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void h() {
        com.ss.android.ugc.aweme.inbox.d.g.a();
        b().b();
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        b().f104393b.observe(this, new d(this));
        EventBus.a(EventBus.a(), this);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiAdapterWidget f104391a;

        static {
            Covode.recordClassIndex(66847);
        }

        e(MultiAdapterWidget multiAdapterWidget) {
            this.f104391a = multiAdapterWidget;
        }

        public final void run() {
            MultiViewModel b2 = this.f104391a.b();
            a.e.a();
            p<Integer, Boolean> d2 = MultiViewModel.d();
            if (b2.f104404m.getFirst().intValue() != d2.getFirst().intValue() || b2.f104404m.getSecond().booleanValue() != d2.getSecond().booleanValue()) {
                b2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiAdapterWidget f104390a;

        static {
            Covode.recordClassIndex(66846);
        }

        d(MultiAdapterWidget multiAdapterWidget) {
            this.f104390a = multiAdapterWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104390a.c().a((List) obj);
        }
    }

    @r(a = ThreadMode.MAIN, b = true)
    public final void onRedPointUpdate(m mVar) {
        l.d(mVar, "");
        ((Handler) this.f104388c.getValue()).post(new e(this));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int a(int i2) {
        List<k> value = b().f104393b.getValue();
        if (value == null) {
            return -1;
        }
        l.b(value, "");
        if (i2 < 0) {
            return -1;
        }
        int size = value.size();
        while (i2 < size) {
            if (value.get(i2).a()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void a(int i2, com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        j c2 = c();
        l.d(bVar, "");
        c2.f104490b.put(i2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiAdapterWidget(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        super(fragment, liveData);
        l.d(fragment, "");
        l.d(liveData, "");
        this.f104386a = h.i.a((h.f.a.a) new c(fragment));
        this.f104387b = h.i.a((h.f.a.a) new a(fragment));
    }
}
