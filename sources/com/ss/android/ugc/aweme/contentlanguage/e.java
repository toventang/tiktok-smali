package com.ss.android.ugc.aweme.contentlanguage;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f78167a;

    static {
        Covode.recordClassIndex(48468);
    }

    e(d dVar) {
        this.f78167a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f78167a;
        dVar.f78162a = (ArrayList) obj;
        dVar.notifyDataSetChanged();
    }
}
