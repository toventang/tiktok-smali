package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.concurrent.Executor;

public final class bv implements bk<bu> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<String> f52927a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<w> f52928b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<ay> f52929c;

    /* renamed from: d  reason: collision with root package name */
    private final bk<Context> f52930d;

    /* renamed from: e  reason: collision with root package name */
    private final bk<cg> f52931e;

    /* renamed from: f  reason: collision with root package name */
    private final bk<Executor> f52932f;

    static {
        Covode.recordClassIndex(32714);
    }

    public bv(bk<String> bkVar, bk<w> bkVar2, bk<ay> bkVar3, bk<Context> bkVar4, bk<cg> bkVar5, bk<Executor> bkVar6) {
        this.f52927a = bkVar;
        this.f52928b = bkVar2;
        this.f52929c = bkVar3;
        this.f52930d = bkVar4;
        this.f52931e = bkVar5;
        this.f52932f = bkVar6;
    }

    private static File a(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ bu a() {
        String a2 = this.f52927a.a();
        w a3 = this.f52928b.a();
        ay a4 = this.f52929c.a();
        Context a5 = df.a(((df) this.f52930d).f53039a);
        cg a6 = this.f52931e.a();
        return new bu(a2 != null ? new File(a(a5), a2) : a(a5), a3, a4, a5, a6, bi.b(this.f52932f));
    }
}
