package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.an;
import com.google.android.play.core.b.bk;

public final class df implements bk<Context> {

    /* renamed from: a  reason: collision with root package name */
    final da f53039a;

    static {
        Covode.recordClassIndex(32752);
    }

    public df(da daVar) {
        this.f53039a = daVar;
    }

    public static Context a(da daVar) {
        Context context = daVar.f53032a;
        an.a(context);
        return context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* bridge */ /* synthetic */ Context a() {
        return a(this.f53039a);
    }
}
