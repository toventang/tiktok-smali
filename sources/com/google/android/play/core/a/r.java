package com.google.android.play.core.a;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.install.a;
import com.google.android.play.core.tasks.m;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

final class r extends p<a> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s f52724d;

    /* renamed from: e  reason: collision with root package name */
    private final String f52725e;

    static {
        Covode.recordClassIndex(32652);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(s sVar, m<a> mVar, String str) {
        super(sVar, new b("OnRequestInstallCallback"), mVar);
        this.f52724d = sVar;
        this.f52725e = str;
    }

    @Override // com.google.android.play.core.a.p, com.google.android.play.core.b.bx
    public final void a(Bundle bundle) {
        Integer valueOf;
        super.a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f52722b.b(new a(bundle.getInt("error.code", -2)));
            return;
        }
        m mVar = this.f52722b;
        s sVar = this.f52724d;
        String str = this.f52725e;
        int i2 = bundle.getInt("version.code", -1);
        int i3 = bundle.getInt("update.availability");
        int i4 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(bundle.getInt("client.version.staleness"));
        }
        int i5 = bundle.getInt("in.app.update.priority", 0);
        long j2 = bundle.getLong("bytes.downloaded");
        long j3 = bundle.getLong("total.bytes.to.download");
        long j4 = bundle.getLong("additional.size.required");
        Context context = sVar.f52730d.f52734a;
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        mVar.a(new w(str, i2, i3, i4, valueOf, i5, j2, j3, j4, u.a(new File(d.f107195c, "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
