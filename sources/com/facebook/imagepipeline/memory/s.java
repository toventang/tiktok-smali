package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.g.d;
import com.facebook.imagepipeline.memory.a;

public abstract class s extends a<r> {

    /* renamed from: g  reason: collision with root package name */
    final int[] f48107g;

    static {
        Covode.recordClassIndex(29067);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final int d(int i2) {
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract r b(int i2);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ void b(r rVar) {
        r rVar2 = rVar;
        i.a(rVar2);
        rVar2.close();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ int c(r rVar) {
        r rVar2 = rVar;
        i.a(rVar2);
        return rVar2.getSize();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ boolean d(r rVar) {
        r rVar2 = rVar;
        i.a(rVar2);
        if (!rVar2.isClosed()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final int c(int i2) {
        if (i2 > 0) {
            int[] iArr = this.f48107g;
            for (int i3 : iArr) {
                if (i3 >= i2) {
                    return i3;
                }
            }
            return i2;
        }
        throw new a.b(Integer.valueOf(i2));
    }

    s(d dVar, ad adVar, ae aeVar) {
        super(dVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f48064c;
        this.f48107g = new int[sparseIntArray.size()];
        int i2 = 0;
        while (true) {
            int[] iArr = this.f48107g;
            if (i2 < iArr.length) {
                iArr[i2] = sparseIntArray.keyAt(i2);
                i2++;
            } else {
                a();
                return;
            }
        }
    }
}
