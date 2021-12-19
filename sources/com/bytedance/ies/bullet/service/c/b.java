package com.bytedance.ies.bullet.service.c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.r;
import com.bytedance.ies.bullet.service.base.b.a;
import com.bytedance.ies.bullet.service.base.h;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.bullet.service.base.p;
import com.bytedance.ies.bullet.service.base.q;
import h.f.b.l;

public final class b extends a implements q {

    /* renamed from: a  reason: collision with root package name */
    private final p f32663a;

    static {
        Covode.recordClassIndex(19422);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final FrameLayout.LayoutParams d() {
        return this.f32663a.b();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final FrameLayout.LayoutParams e() {
        return this.f32663a.c();
    }

    public b(p pVar) {
        l.c(pVar, "");
        this.f32663a = pVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final k a(Context context) {
        l.c(context, "");
        return this.f32663a.a(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final h b(Context context) {
        l.c(context, "");
        return this.f32663a.b(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final boolean a(Context context, Uri uri, r rVar) {
        l.c(context, "");
        l.c(uri, "");
        l.c(rVar, "");
        Class<Activity> a2 = this.f32663a.a();
        if (a2 == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, a2));
        intent.setData(uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtras(rVar.f32527a);
        if (rVar.f32528b == null) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return true;
        }
        Bundle bundle = rVar.f32528b;
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent, bundle);
        return true;
    }
}
