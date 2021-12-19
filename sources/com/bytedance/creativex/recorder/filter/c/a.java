package com.bytedance.creativex.recorder.filter.c;

import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.filter.view.widget.CompositeFilterIndicator;
import com.bytedance.creativex.recorder.filter.a.c;
import com.bytedance.creativex.recorder.filter.a.e;
import com.bytedance.creativex.recorder.filter.a.l;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.zhiliaoapp.musically.R;
import h.h;
import h.i;
import h.m;
import h.p;
import java.util.Objects;

public class a extends j<c> implements c, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.filter.a.a f28252a = ((com.bytedance.creativex.recorder.filter.a.a) getDiContainer().a(com.bytedance.creativex.recorder.filter.a.a.class, (String) null));

    /* renamed from: b  reason: collision with root package name */
    private final h f28253b = i.a(m.NONE, new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.scene.group.b f28254c;

    /* renamed from: d  reason: collision with root package name */
    private final f f28255d;

    /* renamed from: e  reason: collision with root package name */
    private final int f28256e = R.id.dj5;

    static {
        Covode.recordClassIndex(16571);
    }

    public final c a() {
        return (c) this.f28253b.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ c getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f28255d;
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(16573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        this.f28254c.a(this.f28256e, a(), "FilterSwipeIndicatorScene");
        this.f28252a.getFilterSwitchEvent().a(this, new C0600a(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.c.a$a  reason: collision with other inner class name */
    static final class C0600a<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.filter.a.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f28257a;

        static {
            Covode.recordClassIndex(16572);
        }

        C0600a(a aVar) {
            this.f28257a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.filter.a.h hVar) {
            FilterBean filterBean;
            boolean z;
            String str;
            String name;
            com.bytedance.creativex.recorder.filter.a.h hVar2 = hVar;
            c a2 = this.f28257a.a();
            p<FilterBean, e> pVar = hVar2.f28230a;
            FilterBean filterBean2 = null;
            if (pVar != null) {
                filterBean = pVar.getFirst();
            } else {
                filterBean = null;
            }
            String a3 = b.a(hVar2.f28230a);
            p<FilterBean, e> pVar2 = hVar2.f28231b;
            if (pVar2 != null) {
                filterBean2 = pVar2.getFirst();
            }
            String a4 = b.a(hVar2.f28231b);
            if (hVar2.f28232c == l.RIGHT_TO_LEFT) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            if (a2.f28259a == null) {
                View findViewById = a2.p().findViewById(R.id.b2q);
                h.f.b.l.b(findViewById, str2);
                View a5 = ((ViewStubCompat) findViewById).a();
                Objects.requireNonNull(a5, "null cannot be cast to non-null type com.bytedance.creativex.filter.view.widget.CompositeFilterIndicator");
                a2.f28259a = (CompositeFilterIndicator) a5;
            }
            CompositeFilterIndicator compositeFilterIndicator = a2.f28259a;
            if (compositeFilterIndicator != null) {
                if (filterBean == null || (str = filterBean.getName()) == null) {
                    str = str2;
                }
                com.bytedance.creativex.filter.view.widget.b bVar = new com.bytedance.creativex.filter.view.widget.b(str, a3);
                if (!(filterBean2 == null || (name = filterBean2.getName()) == null)) {
                    str2 = name;
                }
                compositeFilterIndicator.a(bVar, new com.bytedance.creativex.filter.view.widget.b(str2, a4), z);
            }
        }
    }

    public a(com.bytedance.scene.group.b bVar, f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f28254c = bVar;
        this.f28255d = fVar;
    }
}
