package com.ss.android.ugc.aweme.autoplay.player.live;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f67535a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f67536b = i.a((h.f.a.a) b.f67537a);

    static {
        Covode.recordClassIndex(41574);
    }

    /* access modifiers changed from: package-private */
    public final List<b> m() {
        return (List) this.f67536b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41575);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<ArrayList<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67537a = new b();

        static {
            Covode.recordClassIndex(41576);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<b> invoke() {
            return new ArrayList();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onFirstFrame");
            t.a();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void b() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onPause");
            t.b();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void c() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onIdle");
            t.c();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void d() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onInit");
            t.d();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void e() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onAttachWindow");
            t.e();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void f() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onBind");
            t.f();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void g() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onRequestPlay");
            t.g();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void h() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onPlayPrepared");
            t.h();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void i() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onPlaying");
            t.i();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void j() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onFinish");
            t.j();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void k() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onDetachWindow");
            t.k();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void l() {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onDestroy");
            t.l();
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(String str) {
        l.d(str, "");
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" onError");
            t.a(str);
            arrayList.add(z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(View view, int i2, int i3) {
        List<b> m2 = m();
        ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
        for (T t : m2) {
            new StringBuilder().append((Object) t).append(" OnSizeChange ").append(i2).append(" : ").append(i3);
            t.a(view, i2, i3);
            arrayList.add(z.f158842a);
        }
    }
}
