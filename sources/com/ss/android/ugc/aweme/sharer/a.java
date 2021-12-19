package com.ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.sharer.b;
import h.f.b.l;
import h.n;

public abstract class a implements b {
    static {
        Covode.recordClassIndex(81768);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean c() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public float d() {
        return 0.34f;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean b(Context context) {
        l.d(context, "");
        l.d(context, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public void a(RemoteImageView remoteImageView, boolean z) {
        l.d(remoteImageView, "");
        b.a.a(this, remoteImageView);
    }

    public boolean a(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(h hVar, Context context) {
        l.d(hVar, "");
        l.d(context, "");
        if (hVar instanceof k) {
            return a((k) hVar, context);
        }
        if (hVar instanceof m) {
            return a((m) hVar, context);
        }
        if (hVar instanceof l) {
            return a((l) hVar, context);
        }
        if (hVar instanceof n) {
            return a((n) hVar, context);
        }
        throw new n();
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(k kVar, Context context) {
        l.d(kVar, "");
        l.d(context, "");
        return a((m) kVar, context);
    }
}
