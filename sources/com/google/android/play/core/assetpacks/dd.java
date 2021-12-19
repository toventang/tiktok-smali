package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.an;
import com.google.android.play.core.b.bk;

public final class dd implements bk<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<cw> f53034a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<Context> f53035b;

    static {
        Covode.recordClassIndex(32750);
    }

    public dd(bk<cw> bkVar, bk<Context> bkVar2) {
        this.f53034a = bkVar;
        this.f53035b = bkVar2;
    }

    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ Object a() {
        cw a2 = this.f53034a.a();
        Context a3 = df.a(((df) this.f53035b).f53039a);
        an.a(a3.getPackageManager(), new ComponentName(a3.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        an.a(a3.getPackageManager(), new ComponentName(a3.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        an.a(a2);
        return a2;
    }
}
