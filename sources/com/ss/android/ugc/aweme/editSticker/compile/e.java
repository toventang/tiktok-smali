package com.ss.android.ugc.aweme.editSticker.compile;

import android.graphics.Bitmap;
import android.view.View;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.c;
import java.io.File;

final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f88113a;

    /* renamed from: b  reason: collision with root package name */
    private final View f88114b;

    static {
        Covode.recordClassIndex(55390);
    }

    e(String str, View view) {
        this.f88113a = str;
        this.f88114b = view;
    }

    @Override // b.g
    public final Object then(i iVar) {
        String str = this.f88113a;
        b bVar = c.a(((g) iVar.d()).f88119a, new File(str), 100, Bitmap.CompressFormat.PNG) ? new b(str, ((g) iVar.d()).f88120b.intValue(), this.f88114b.hashCode()) : null;
        c.a(((g) iVar.d()).f88119a);
        return bVar;
    }
}
