package com.bytedance.platform.godzilla.b;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.a;
import java.lang.reflect.Field;

public final class b extends a {
    static {
        Covode.recordClassIndex(25639);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "ProviderInstalledFailedPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a() {
        super.a();
        if (!com.bytedance.platform.godzilla.b.a.b.a.f41966a) {
            try {
                Object a2 = com.bytedance.platform.godzilla.a.a.a();
                Field declaredField = a2.getClass().getDeclaredField("mInstrumentation");
                declaredField.setAccessible(true);
                if (!(declaredField.get(a2) instanceof com.bytedance.platform.godzilla.b.a.b.a)) {
                    declaredField.set(a2, new com.bytedance.platform.godzilla.b.a.b.a());
                    g.a(g.a.DEBUG);
                    com.bytedance.platform.godzilla.b.a.b.a.f41966a = true;
                }
            } catch (Exception e2) {
                e2.getMessage();
                g.a(g.a.DEBUG);
            }
        }
        g.a(g.a.ERROR);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a(Application application) {
        super.a(application);
        com.bytedance.platform.godzilla.b.a.b.a.a(new com.bytedance.platform.godzilla.b.a.b.b.a());
        com.bytedance.platform.godzilla.b.a.b.a.a(new com.bytedance.platform.godzilla.b.a.b.b.b());
    }
}
