package com.ss.android.ugc.aweme.ftc.components.effect;

import android.app.Activity;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class b extends com.bytedance.ui_component.b<FTCEditEffectViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f97828a;

    /* renamed from: b  reason: collision with root package name */
    public final int f97829b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f97830c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<FTCEditEffectViewModel> f97831d = C2363b.f97833a;

    /* renamed from: e  reason: collision with root package name */
    private final f f97832e;

    static {
        Covode.recordClassIndex(62177);
    }

    private final c a() {
        return (c) this.f97830c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditEffectViewModel> b() {
        return this.f97831d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97828a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97832e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.b$b  reason: collision with other inner class name */
    static final class C2363b extends m implements h.f.a.a<FTCEditEffectViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2363b f97833a = new C2363b();

        static {
            Covode.recordClassIndex(62179);
        }

        C2363b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditEffectViewModel invoke() {
            return new FTCEditEffectViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        a().a().W.c().setValue(false);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        f a2 = a().a();
        a2.W.c().setValue(true);
        if (a2.f97849b.isMultiVideoEdit() && (a2.J.f97841a instanceof y)) {
            a2.d();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62178);
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
            Activity activity = this.this$0.f97828a.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.ss.android.ugc.aweme.effect.h hVar = new com.ss.android.ugc.aweme.effect.h((e) activity);
            l.d(hVar, "");
            f a2 = cVar.a();
            a2.X = hVar;
            a2.W = (EditEffectVideoModel) ae.a(hVar.a(), (ad.b) null).a(EditEffectVideoModel.class);
            a2.W.a(a2.X);
            this.this$0.f97828a.a(this.this$0.f97829b, cVar, "FTCEditEffectScene");
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97832e = fVar;
        this.f97828a = bVar;
    }
}
