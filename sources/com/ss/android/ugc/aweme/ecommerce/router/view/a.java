package com.ss.android.ugc.aweme.ecommerce.router.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.b;
import h.f.b.l;

public abstract class a extends FrameLayout {
    static {
        Covode.recordClassIndex(54734);
    }

    public abstract void a(Activity activity, Bundle bundle);

    public abstract void a(b bVar);

    public abstract boolean a();

    public abstract void b(Activity activity, Bundle bundle);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
    }
}
