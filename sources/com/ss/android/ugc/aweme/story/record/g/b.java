package com.ss.android.ugc.aweme.story.record.g;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.t;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.port.in.aw;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public final class b extends j<a> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f138290a;

    /* renamed from: b  reason: collision with root package name */
    public final e f138291b;

    /* renamed from: c  reason: collision with root package name */
    public final e f138292c;

    /* renamed from: d  reason: collision with root package name */
    public final int f138293d;

    /* renamed from: e  reason: collision with root package name */
    public final f f138294e;

    /* renamed from: f  reason: collision with root package name */
    private final h f138295f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f138296g;

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.scene.group.b f138297h;

    static {
        Covode.recordClassIndex(90461);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.record.g.a
    public final void a() {
        this.f138291b.b();
    }

    static final class d extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            e eVar = this.this$0.f138292c;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(eVar).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.bytedance.als.j
    public final void onResume() {
        super.onResume();
        if (this.f138296g && d.a(this.f138292c)) {
            c();
        }
    }

    public final void b() {
        this.f138291b.a(true);
        e eVar = this.f138292c;
        c cVar = new c(this);
        l.d(eVar, "");
        l.d(cVar, "");
        if (com.ss.android.ugc.aweme.port.in.l.f115658a.c().a()) {
            com.ss.android.ugc.aweme.port.in.l.f115658a.c().a(eVar, cVar, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    public final void c() {
        this.f138290a.setValue(true);
        if (this.f138296g && this.f138297h.b(this.f138291b) != null) {
            this.f138297h.c(this.f138291b);
            this.f138296g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.b$b  reason: collision with other inner class name */
    static final class C3644b extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3644b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            aw awVar = null;
            if (com.ss.android.ugc.aweme.port.in.l.f115658a.c().a()) {
                String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        bVar.b();
                        break;
                    }
                    String str = strArr[i2];
                    if (com.ss.android.ugc.aweme.port.in.l.f115658a.c().a((Context) bVar.f138292c, str) == 0 || com.ss.android.ugc.aweme.port.in.l.f115658a.c().a((Activity) bVar.f138292c, str)) {
                        i2++;
                    } else {
                        v b2 = g.a().b();
                        if (b2 instanceof aw) {
                            awVar = b2;
                        }
                        aw awVar2 = (aw) awVar;
                        if (awVar2 != null) {
                            awVar2.d(bVar.f138292c);
                        }
                    }
                }
            } else {
                v b3 = g.a().b();
                if (b3 instanceof aw) {
                    awVar = b3;
                }
                aw awVar3 = awVar;
                if (awVar3 != null) {
                    awVar3.d(bVar.f138292c);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        f.a.b.b unused = ((StoryRecordBaseViewModel) this.f138295f.getValue()).a(this, c.f138299a, new ah(), new a(this));
        Collection<Integer> values = d.b(this.f138292c).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != 0) {
                    this.f138297h.a(this.f138293d, this.f138291b, "StoryRecordPermissionScene");
                    this.f138296g = true;
                    return;
                }
            }
        }
    }

    public static final class c implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138298a;

        static {
            Covode.recordClassIndex(90464);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f138298a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.v.a
        public final void a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0 && strArr != null && strArr.length != 0) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        this.f138298a.c();
                        break;
                    } else if (iArr[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                this.f138298a.f138291b.a(false);
            }
        }
    }

    static final class a extends m implements h.f.a.b<p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            if (com.ss.android.ugc.aweme.port.in.l.f115658a.c().a() && !d.a(this.this$0.f138292c)) {
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    public /* synthetic */ b(e eVar, com.bytedance.scene.group.b bVar, f fVar) {
        this(eVar, bVar, R.id.ec5, fVar, false);
    }

    public b(e eVar, com.bytedance.scene.group.b bVar, int i2, f fVar, boolean z) {
        l.d(eVar, "");
        l.d(bVar, "");
        l.d(fVar, "");
        this.f138292c = eVar;
        this.f138297h = bVar;
        this.f138293d = i2;
        this.f138294e = fVar;
        this.f138290a = new t<>();
        this.f138295f = i.a((h.f.a.a) new d(this));
        this.f138291b = new e(z, new C3644b(this));
    }
}
