package com.ss.android.ugc.aweme.infoSticker;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f104595a;

    static {
        Covode.recordClassIndex(67009);
    }

    c(a aVar) {
        this.f104595a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f104595a;
        a aVar2 = (a) obj;
        if (aVar2 != null && aVar2.f69569b == a.EnumC1574a.SUCCESS) {
            aVar.a(aVar2.f69568a);
        }
    }
}
