package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;

public final class aw<T> implements ak<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final ak<T> f48248a;

    static {
        Covode.recordClassIndex(29127);
    }

    public aw(ak<T> akVar) {
        this.f48248a = akVar;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<Void> kVar, al alVar) {
        this.f48248a.a(new n<T, Void>(kVar) {
            /* class com.facebook.imagepipeline.n.aw.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29128);
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.b
            public final void a(T t, int i2) {
                if (a(i2)) {
                    this.f48362e.b(null, i2);
                }
            }
        }, alVar);
    }
}
