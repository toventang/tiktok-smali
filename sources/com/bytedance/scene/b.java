package com.bytedance.scene;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class b implements z {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f42742a;

    static {
        Covode.recordClassIndex(26243);
    }

    public b(Activity activity) {
        this.f42742a = activity;
    }

    @Override // com.bytedance.scene.z
    public final <T extends View> T a(int i2) {
        T t = (T) this.f42742a.findViewById(i2);
        if (t != null) {
            return t;
        }
        try {
            throw new IllegalArgumentException(" " + this.f42742a.getResources().getResourceName(i2) + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i2 + " view not found");
        }
    }
}
