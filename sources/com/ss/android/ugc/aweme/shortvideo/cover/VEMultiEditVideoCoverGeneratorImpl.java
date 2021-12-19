package com.ss.android.ugc.aweme.shortvideo.cover;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.vesdk.x;

public class VEMultiEditVideoCoverGeneratorImpl extends VEVideoCoverGeneratorImpl implements au {

    /* renamed from: a  reason: collision with root package name */
    public int f125220a;

    static {
        Covode.recordClassIndex(82238);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl
    public final int[] a(int i2, int i3) {
        int[] iArr = new int[i3];
        int i4 = i2 / i3;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = (i4 * i5) + this.f125220a;
        }
        return iArr;
    }

    public VEMultiEditVideoCoverGeneratorImpl(g gVar, m mVar, int i2, int i3, int i4, x.a aVar) {
        super(gVar, mVar, i2, aVar, "choose_cover");
        this.f125223c = i3;
        this.f125220a = i4;
    }
}
