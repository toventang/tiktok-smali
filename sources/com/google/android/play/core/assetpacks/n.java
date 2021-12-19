package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;

final class n extends m<ParcelFileDescriptor> {
    static {
        Covode.recordClassIndex(32768);
    }

    n(r rVar, m<ParcelFileDescriptor> mVar) {
        super(rVar, mVar);
    }

    @Override // com.google.android.play.core.assetpacks.m, com.google.android.play.core.b.cc
    public final void b(Bundle bundle, Bundle bundle2) {
        super.b(bundle, bundle2);
        this.f53072a.a(bundle.getParcelable("chunk_file_descriptor"));
    }
}
