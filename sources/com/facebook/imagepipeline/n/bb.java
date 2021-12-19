package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;

public final class bb implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    private final bc<e>[] f48294a;

    static {
        Covode.recordClassIndex(29142);
    }

    /* access modifiers changed from: package-private */
    public class a extends n<e, e> {

        /* renamed from: b  reason: collision with root package name */
        private final al f48296b;

        /* renamed from: c  reason: collision with root package name */
        private final int f48297c;

        /* renamed from: d  reason: collision with root package name */
        private final d f48298d;

        static {
            Covode.recordClassIndex(29143);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(Throwable th) {
            if (!bb.this.a(this.f48297c + 1, this.f48362e, this.f48296b)) {
                this.f48362e.b(th);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar = (e) obj;
            if (eVar != null && (b(i2) || bd.a(eVar, this.f48298d))) {
                this.f48362e.b(eVar, i2);
            } else if (a(i2)) {
                e.d(eVar);
                if (!bb.this.a(this.f48297c + 1, this.f48362e, this.f48296b)) {
                    this.f48362e.b(null, 1);
                }
            }
        }

        public a(k<e> kVar, al alVar, int i2) {
            super(kVar);
            this.f48296b = alVar;
            this.f48297c = i2;
            this.f48298d = alVar.a().mResizeOptions;
        }
    }

    public bb(bc<e>... bcVarArr) {
        bc<e>[] bcVarArr2 = (bc[]) i.a(bcVarArr);
        this.f48294a = bcVarArr2;
        i.a(0, bcVarArr2.length);
    }

    private int a(int i2, d dVar) {
        while (true) {
            bc<e>[] bcVarArr = this.f48294a;
            if (i2 >= bcVarArr.length) {
                return -1;
            }
            if (bcVarArr[i2].a(dVar)) {
                return i2;
            }
            i2++;
        }
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        if (alVar.a().mResizeOptions == null) {
            kVar.b(null, 1);
        } else if (!a(0, kVar, alVar)) {
            kVar.b(null, 1);
        }
    }

    public final boolean a(int i2, k<e> kVar, al alVar) {
        int a2 = a(i2, alVar.a().mResizeOptions);
        if (a2 == -1) {
            return false;
        }
        this.f48294a[a2].a(new a(kVar, alVar, a2), alVar);
        return true;
    }
}
