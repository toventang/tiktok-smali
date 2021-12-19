package com.bytedance.hybrid.spark.d;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.view.RadiusLayout;
import com.bytedance.lynx.a.a.b.b;
import h.f.b.l;

public final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f31171a;

    /* renamed from: b  reason: collision with root package name */
    private final RadiusLayout f31172b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f31173c;

    static {
        Covode.recordClassIndex(18101);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        boolean z;
        if (this.f31173c) {
            RadiusLayout radiusLayout = this.f31172b;
            float radius = (float) this.f31171a.getRadius();
            float radius2 = (float) this.f31171a.getRadius();
            int i2 = Build.VERSION.SDK_INT;
            Resources resources = radiusLayout.getResources();
            l.a((Object) resources, "");
            Configuration configuration = resources.getConfiguration();
            l.a((Object) configuration, "");
            if (configuration.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            radiusLayout.f31266b = z ? new float[]{radius2, radius2, radius, radius, 0.0f, 0.0f, 0.0f, 0.0f} : new float[]{radius, radius, radius2, radius2, 0.0f, 0.0f, 0.0f, 0.0f};
            radiusLayout.invalidate();
            return;
        }
        this.f31172b.setRadius((float) this.f31171a.getRadius());
    }

    public q(b bVar, RadiusLayout radiusLayout, boolean z) {
        l.c(bVar, "");
        l.c(radiusLayout, "");
        this.f31171a = bVar;
        this.f31172b = radiusLayout;
        this.f31173c = z;
    }
}
