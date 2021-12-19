package com.ss.android.ugc.aweme.dsp.playpage.base;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspViewModel;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.d;
import com.ss.android.ugc.aweme.utils.cg;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.r;

public abstract class BasePlayerViewModel extends BaseMusicDspViewModel implements j, q, i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f83679a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f83680b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<z> f83681c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<z> f83682d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final t<z> f83683e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public final t<z> f83684f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f83685g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f83686h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f83687i = "";

    static {
        Covode.recordClassIndex(52212);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    public abstract com.ss.android.ugc.aweme.dsp.playerservice.f.a e();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(353, new g(BasePlayerViewModel.class, "onExpiredPlayableEvent", com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public abstract void i();

    /* access modifiers changed from: protected */
    public final void h() {
        this.f83681c.postValue(null);
    }

    public final void g() {
        this.f83679a.setValue(true);
        i();
    }

    @Override // androidx.lifecycle.ac, com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspViewModel
    public void onCleared() {
        com.ss.android.ugc.aweme.dsp.playerservice.f.a e2 = e();
        if (e2 != null) {
            e2.b((j) this);
        }
        com.ss.android.ugc.aweme.dsp.playerservice.f.a e3 = e();
        if (e3 != null) {
            e3.b((q) this);
        }
        cg.b(this);
        super.onCleared();
    }

    public final void f() {
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w;
        com.ss.android.ugc.aweme.dsp.playerservice.e.a.a e2;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a e3 = e();
        if (e3 != null && (w = e3.m()) != null && (e2 = w.e()) != null && !e2.a()) {
            f.a.b.b a2 = e2.c().a(new a(this), new b(this));
            l.b(a2, "");
            a(a2);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BasePlayerViewModel f83689a;

        static {
            Covode.recordClassIndex(52214);
        }

        b(BasePlayerViewModel basePlayerViewModel) {
            this.f83689a = basePlayerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f83689a.f83684f.setValue(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public void b(c cVar) {
        l.d(cVar, "");
        h();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
        h();
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BasePlayerViewModel f83688a;

        static {
            Covode.recordClassIndex(52213);
        }

        a(BasePlayerViewModel basePlayerViewModel) {
            this.f83688a = basePlayerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            List<? extends c> list = (List) obj;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                com.ss.android.ugc.aweme.dsp.playerservice.f.a e2 = this.f83688a.e();
                if (e2 != null) {
                    e2.a(list, (Integer) null);
                }
                this.f83688a.h();
            }
            this.f83688a.f83684f.setValue(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @r(a = ThreadMode.MAIN)
    public final void onExpiredPlayableEvent(com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.a aVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w;
        l.d(aVar, "");
        if (com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b() || aVar.f83578a) {
            h();
        }
        com.ss.android.ugc.aweme.dsp.playerservice.f.a e2 = e();
        if (e2 == null || (w = e2.m()) == null) {
            copyOnWriteArrayList = null;
        } else {
            copyOnWriteArrayList = w.f83535c;
        }
        if (!aVar.f83578a) {
            return;
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        l.d(fVar, "");
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    public void a(String str) {
        l.d(str, "");
        this.f83687i = str;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a e2 = e();
        if (e2 != null) {
            e2.a((j) this);
        }
        com.ss.android.ugc.aweme.dsp.playerservice.f.a e3 = e();
        if (e3 != null) {
            e3.a((q) this);
        }
        cg.a(this);
    }
}
