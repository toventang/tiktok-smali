package com.ss.android.ugc.aweme.shortvideo.h;

import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.bytedance.als.g;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.gamora.recorder.quickupload.InterceptMotionEventsFrameLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.h;
import h.k.i;
import h.u;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f128536a = {new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final l<Boolean> f128537b = new l<>(true);

    /* renamed from: c  reason: collision with root package name */
    public final l<Boolean> f128538c = new com.bytedance.als.d(false);

    /* renamed from: d  reason: collision with root package name */
    public final l<Boolean> f128539d = new com.bytedance.als.d(false);

    /* renamed from: e  reason: collision with root package name */
    public final k<u<Integer, Integer, Intent>> f128540e = new k<>();

    /* renamed from: f  reason: collision with root package name */
    public final k<Boolean> f128541f = new k<>();

    /* renamed from: g  reason: collision with root package name */
    public long f128542g = -1;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.scene.group.b f128543h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f128544i;

    /* renamed from: j  reason: collision with root package name */
    private InterceptMotionEventsFrameLayout f128545j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.fragment.app.e f128546k = ((androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f128547l = ((com.bytedance.creativex.recorder.b.a.d) getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null));

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f128548m = com.bytedance.o.b.a.a(getDiContainer(), m.class);
    private final h.h.d n = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.m.a.class);
    private final h o = h.i.a((h.f.a.a) e.f128553a);
    private final f p;
    private final Integer q;

    static {
        Covode.recordClassIndex(84277);
    }

    private final m h() {
        return (m) this.f128548m.a(this, f128536a[0]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.h a() {
        return this.f128537b;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final /* bridge */ /* synthetic */ g b() {
        return this.f128541f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.h c() {
        return this.f128538c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.h d() {
        return this.f128539d;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final /* bridge */ /* synthetic */ g e() {
        return this.f128540e;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final boolean g() {
        return this.f128544i;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.p;
    }

    static final class e extends h.f.b.m implements h.f.a.a<Cif> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f128553a = new e();

        static {
            Covode.recordClassIndex(84282);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Cif invoke() {
            return new Cif();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final boolean f() {
        if (!getLifecycle().a().isAtLeast(i.b.CREATED)) {
            return false;
        }
        String str = null;
        com.ss.android.ugc.gamora.recorder.b.b bVar = (com.ss.android.ugc.gamora.recorder.b.b) getDiContainer().b(com.ss.android.ugc.gamora.recorder.b.b.class, null);
        if (bVar != null) {
            str = bVar.getCurrentBottomTag();
        }
        return TextUtils.equals(str, this.f128546k.getString(R.string.f_b));
    }

    @Override // com.bytedance.als.j
    public final void onResume() {
        super.onResume();
        if (this.f128542g != -1) {
            ((Cif) this.o.getValue()).a("click_back_in_edit", System.currentTimeMillis() - this.f128542g, false);
            this.f128542g = -1;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        InterceptMotionEventsFrameLayout interceptMotionEventsFrameLayout;
        super.onCreate();
        h().k().a(this, new a(this));
        h().h().a(this, new C3354b(this));
        this.f128547l.ai().a(this, new c(this));
        Integer num = this.q;
        if (num != null) {
            interceptMotionEventsFrameLayout = (InterceptMotionEventsFrameLayout) this.f128543h.b(num.intValue());
        } else {
            interceptMotionEventsFrameLayout = null;
        }
        this.f128545j = interceptMotionEventsFrameLayout;
        this.f128540e.a(this, new d(this));
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f128549a;

        static {
            Covode.recordClassIndex(84278);
        }

        a(b bVar) {
            this.f128549a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128549a.a(true, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b$b  reason: collision with other inner class name */
    static final class C3354b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f128550a;

        static {
            Covode.recordClassIndex(84279);
        }

        C3354b(b bVar) {
            this.f128550a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128550a.a(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void a(boolean z) {
        this.f128544i = z;
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f128551a;

        static {
            Covode.recordClassIndex(84280);
        }

        c(b bVar) {
            this.f128551a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            if (!lVar.f28196a) {
                this.f128551a.a(lVar.f28197b, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void b(boolean z) {
        a(z, false);
        this.f128541f.a(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void c(boolean z) {
        this.f128538c.b(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void d(boolean z) {
        this.f128539d.b(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void b(com.ss.android.ugc.gamora.recorder.quickupload.f fVar) {
        h.f.b.l.d(fVar, "");
        InterceptMotionEventsFrameLayout interceptMotionEventsFrameLayout = this.f128545j;
        if (interceptMotionEventsFrameLayout != null) {
            h.f.b.l.d(fVar, "");
            interceptMotionEventsFrameLayout.f148185a.remove(fVar);
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f128552a;

        static {
            Covode.recordClassIndex(84281);
        }

        d(b bVar) {
            this.f128552a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar = (u) obj;
            if (uVar != null && ((Number) uVar.getFirst()).intValue() == 12344) {
                b bVar = this.f128552a;
                Intent intent = (Intent) uVar.getThird();
                long j2 = -1;
                if (intent != null) {
                    j2 = intent.getLongExtra("edit_to_record_time", -1);
                }
                bVar.f128542g = j2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void a(com.ss.android.ugc.gamora.recorder.quickupload.f fVar) {
        h.f.b.l.d(fVar, "");
        InterceptMotionEventsFrameLayout interceptMotionEventsFrameLayout = this.f128545j;
        if (interceptMotionEventsFrameLayout != null) {
            h.f.b.l.d(fVar, "");
            interceptMotionEventsFrameLayout.f148185a.add(fVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void a(boolean z, boolean z2) {
        this.f128537b.b(Boolean.valueOf(z));
        com.ss.android.ugc.gamora.recorder.m.a aVar = (com.ss.android.ugc.gamora.recorder.m.a) this.n.a(this, f128536a[1]);
        if (aVar != null) {
            aVar.a(z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.h.a
    public final void a(int i2, int i3, Intent intent) {
        this.f128540e.a(new u<>(Integer.valueOf(i2), Integer.valueOf(i3), intent));
    }

    public b(com.bytedance.scene.group.b bVar, f fVar, Integer num) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f128543h = bVar;
        this.p = fVar;
        this.q = num;
    }
}
