package com.bytedance.ies.bullet.kit.lynx.model;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.api.a;
import com.bytedance.ies.bullet.kit.lynx.api.e;
import com.bytedance.ies.bullet.kit.lynx.api.g;
import com.bytedance.ies.bullet.kit.lynx.api.h;
import com.bytedance.ies.bullet.kit.lynx.api.i;
import com.bytedance.ies.bullet.kit.lynx.model.b;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.q;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c;
import h.f.b.l;
import h.w;

public final class LynxBehaviorFactoryKt$transform$3 extends LynxUI<T> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f32364a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f32365b;

    static {
        Covode.recordClassIndex(19009);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        if (this.f32364a != null) {
            l.a((Object) this.mView, "");
        }
        if (this.f32364a != null) {
            getSign();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final T createView(Context context) {
        l.c(context, "");
        i iVar = this.f32364a;
        if (iVar != null) {
            return (T) iVar.c();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        super.updateExtraData(obj);
        if ((obj instanceof q) && this.f32364a != null) {
            q qVar = (q) obj;
            l.c(qVar, "");
            new g(qVar.f56042a, qVar.f56043b);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(v vVar) {
        h a2;
        Object obj;
        super.afterPropsUpdated(vVar);
        i iVar = this.f32364a;
        if (iVar != null && (a2 = iVar.a()) != null) {
            if (vVar == null) {
                l.a();
            }
            ReadableMapKeySetIterator keySetIterator = vVar.f56468a.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                l.a((Object) nextKey, "");
                l.c(vVar, "");
                l.c(nextKey, "");
                b.a aVar = new b.a(vVar);
                b.C0693b bVar = new b.C0693b(vVar);
                b.c cVar = new b.c(vVar);
                b.d dVar = new b.d(vVar);
                b.e eVar = new b.e(vVar);
                b.f fVar = new b.f(vVar);
                b.g gVar = new b.g(vVar);
                if (vVar.a(nextKey)) {
                    obj = aVar.invoke(nextKey);
                    if (obj == null && (obj = bVar.invoke(nextKey)) == null && (obj = cVar.invoke(nextKey)) == null && (obj = dVar.invoke(nextKey)) == null && (obj = eVar.invoke(nextKey)) == null && (obj = fVar.invoke(nextKey)) == null) {
                        obj = gVar.invoke(nextKey);
                    }
                    new StringBuilder("StylesDiffMap.get() called with: key = [").append(nextKey).append("], value=[").append(obj).append(']');
                } else {
                    obj = null;
                }
                a2.a(nextKey, obj);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final T createView(Context context, Object obj) {
        l.c(context, "");
        i iVar = this.f32364a;
        if (iVar != null) {
            return (T) iVar.d();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxBehaviorFactoryKt$transform$3(i<T> iVar, j jVar, j jVar2) {
        super(jVar2);
        this.f32364a = iVar;
        this.f32365b = jVar;
        if (iVar != null) {
            e eVar = ((a) iVar).f32311a;
            AnonymousClass1 r1 = new com.bytedance.ies.bullet.kit.lynx.api.b(this) {
                /* class com.bytedance.ies.bullet.kit.lynx.model.LynxBehaviorFactoryKt$transform$3.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public final c f32366a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ LynxBehaviorFactoryKt$transform$3 f32367b;

                static {
                    Covode.recordClassIndex(19010);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f32367b = r2;
                    j jVar = r2.f32365b;
                    if (jVar == null) {
                        l.a();
                    }
                    this.f32366a = jVar.f55897e;
                }
            };
            l.c(r1, "");
            eVar.f32314a = r1;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        super.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        super.updateLayoutInfo(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}
