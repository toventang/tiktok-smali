package com.ss.android.ugc.aweme.qrcode.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class b implements c<QRCodeFragment> {

    /* renamed from: a  reason: collision with root package name */
    private final a<e> f119704a;

    static {
        Covode.recordClassIndex(77758);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f119704a.get());
    }

    public static QRCodeFragment a(e eVar) {
        return (QRCodeFragment) f.a(a.a(eVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
