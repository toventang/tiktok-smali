package com.ss.android.ugc.aweme.qrcode.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.ss.android.ugc.aweme.utils.cy;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119703a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77757);
    }

    public static QRCodeFragment a(e eVar) {
        l.d(eVar, "");
        Fragment a2 = cy.a(eVar);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
        return (QRCodeFragment) a2;
    }
}
