package com.bytedance.creativex.recorder.a;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.e;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.service.c;
import com.ss.android.ugc.aweme.tools.beauty.service.d;
import com.ss.android.ugc.tools.utils.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f28051a;

    /* renamed from: b  reason: collision with root package name */
    public final c f28052b;

    /* renamed from: c  reason: collision with root package name */
    public List<BeautyComposerInfo> f28053c;

    /* renamed from: d  reason: collision with root package name */
    public m f28054d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28055e;

    /* renamed from: f  reason: collision with root package name */
    private final j f28056f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.filter.a.a f28057g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28058h;

    static {
        Covode.recordClassIndex(16426);
    }

    public abstract BeautyMetadata a();

    /* access modifiers changed from: protected */
    public abstract void b(m mVar);

    /* access modifiers changed from: package-private */
    public final void a(androidx.core.g.a<j> aVar) {
        j jVar = this.f28056f;
        if (jVar != null) {
            aVar.a(jVar);
        }
    }

    public final void a(m mVar) {
        if (!this.f28052b.a()) {
            return;
        }
        if (!this.f28055e) {
            this.f28052b.a(false, com.ss.android.ugc.aweme.tools.beauty.a.CUR);
            this.f28054d = mVar;
            if (this.f28052b.a()) {
                this.f28052b.d().a(mVar, new u<List<BeautyComposerInfo>>() {
                    /* class com.bytedance.creativex.recorder.a.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16427);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(List<BeautyComposerInfo> list) {
                        a.this.f28053c = list;
                        a.this.a(true);
                    }
                });
                this.f28052b.e().a(mVar, new b(this));
            }
            this.f28055e = true;
            return;
        }
        this.f28052b.c();
    }

    public final void a(final boolean z) {
        e eVar;
        try {
            if (this.f28052b.b().equals("record")) {
                this.f28051a.e(false);
                if (this.f28053c == null) {
                    this.f28053c = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (BeautyComposerInfo beautyComposerInfo : this.f28053c) {
                    arrayList.add(beautyComposerInfo.f79584a);
                    arrayList2.add(beautyComposerInfo.f79585b);
                    a(new c(beautyComposerInfo));
                }
                int indexOf = arrayList.indexOf("EFFECT_ID_TYPE_FILTER");
                com.bytedance.creativex.recorder.filter.a.a aVar = this.f28057g;
                if (aVar == null) {
                    eVar = null;
                } else {
                    eVar = aVar.getCurrentFilterSource().getValue();
                }
                if (indexOf >= 0 && indexOf < this.f28053c.size() && (eVar == null || !this.f28057g.isFilterDisable(eVar.f28226a))) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < indexOf; i2++) {
                        arrayList3.add(this.f28053c.get(i2));
                    }
                    final ArrayList arrayList4 = new ArrayList();
                    while (true) {
                        indexOf++;
                        if (indexOf >= this.f28053c.size()) {
                            break;
                        }
                        arrayList4.add(this.f28053c.get(indexOf));
                    }
                    if (this.f28052b.f()) {
                        if (this.f28058h) {
                            this.f28051a.b(arrayList3, 10000);
                        } else {
                            this.f28051a.a(arrayList3, 10000);
                        }
                    } else if (this.f28058h) {
                        this.f28051a.b(Collections.emptyList(), 10000);
                    } else {
                        this.f28051a.a(Collections.emptyList(), 10000);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.bytedance.creativex.recorder.a.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(16428);
                        }

                        public final void run() {
                            if (z) {
                                a aVar = a.this;
                                aVar.b(aVar.f28054d);
                            }
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                /* class com.bytedance.creativex.recorder.a.a.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(16429);
                                }

                                public final void run() {
                                    if (a.this.f28052b.f()) {
                                        a.this.f28051a.c(arrayList4, 10000);
                                    } else {
                                        a.this.f28051a.c(Collections.emptyList(), 10000);
                                    }
                                }
                            }, 50);
                        }
                    }, 250);
                } else if (this.f28052b.f()) {
                    if (!this.f28058h || z) {
                        this.f28051a.a(f.a(this.f28053c), 10000);
                    } else {
                        this.f28051a.b(f.a(this.f28053c), 10000);
                    }
                } else if (!this.f28058h || z) {
                    this.f28051a.a(Collections.emptyList(), 10000);
                } else {
                    this.f28051a.b(Collections.emptyList(), 10000);
                }
            }
        } catch (Exception e2) {
            if (!com.ss.android.ugc.tools.c.f149147b) {
                a(new d(e2));
                return;
            }
            throw new RuntimeException("thx to contact dengchong.999 ...", e2);
        }
    }

    public a(d dVar, c cVar, com.bytedance.creativex.recorder.filter.a.a aVar, j jVar, boolean z) {
        this.f28051a = dVar;
        this.f28052b = cVar;
        this.f28056f = jVar;
        this.f28057g = aVar;
        this.f28058h = z;
        dVar.o();
    }
}
