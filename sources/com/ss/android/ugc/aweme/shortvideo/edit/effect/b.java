package com.ss.android.ugc.aweme.shortvideo.edit.effect;

import android.app.Activity;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.ac;
import com.ss.android.ugc.aweme.effect.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class b extends com.bytedance.ui_component.b<EditEffectViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f127036a;

    /* renamed from: b  reason: collision with root package name */
    public final int f127037b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f127038c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditEffectViewModel> f127039d = C3300b.f127041a;

    /* renamed from: e  reason: collision with root package name */
    private final f f127040e;

    static {
        Covode.recordClassIndex(83350);
    }

    private final c a() {
        return (c) this.f127038c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditEffectViewModel> b() {
        return this.f127039d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f127036a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f127040e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.b$b  reason: collision with other inner class name */
    static final class C3300b extends m implements h.f.a.a<EditEffectViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3300b f127041a = new C3300b();

        static {
            Covode.recordClassIndex(83352);
        }

        C3300b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditEffectViewModel invoke() {
            return new EditEffectViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        a().b().W.c().setValue(false);
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(83351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c();
            Activity activity = this.this$0.f127036a.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.ss.android.ugc.aweme.effect.h hVar = new com.ss.android.ugc.aweme.effect.h((e) activity);
            l.d(hVar, "");
            ac b2 = cVar.b();
            b2.X = hVar;
            b2.W = (EditEffectVideoModel) ae.a(hVar.a(), (ad.b) null).a(EditEffectVideoModel.class);
            b2.W.a(b2.X);
            this.this$0.f127036a.a(this.this$0.f127037b, cVar, "EditEffectScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        c a2 = a();
        ac b2 = a2.b();
        boolean z = !a2.a().p();
        b2.W.c().setValue(true);
        b2.W.f88721b = z;
        if (b2.J.f88958a != null && (b2.J.f88958a instanceof y)) {
            if (b2.f88779b.captionStruct == null) {
                ((y) b2.J.f88958a).a(z, true);
            } else {
                b2.u.setCurrentItem(0);
            }
        }
        if (b2.f88779b.isMultiVideoEdit() && (b2.J.f88958a instanceof y)) {
            b2.f();
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f127040e = fVar;
        this.f127036a = bVar;
    }
}
