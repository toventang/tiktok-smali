package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import com.bytedance.android.livesdk.container.a.a;
import com.bytedance.android.livesdk.container.j.c;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.lang.reflect.Field;

public final class ViewConfig extends HybridConfig {
    static {
        Covode.recordClassIndex(9296);
    }

    public ViewConfig() {
        this(null, 1, null);
    }

    public ViewConfig(Uri uri) {
        super(uri);
        String a2;
        String queryParameter;
        if (uri != null) {
            Class<ViewConfig> cls = ViewConfig.class;
            do {
                Field[] declaredFields = cls.getDeclaredFields();
                l.b(declaredFields, "");
                for (Field field : declaredFields) {
                    a aVar = (a) field.getAnnotation(a.class);
                    if (!(aVar == null || (queryParameter = uri.getQueryParameter((a2 = aVar.a()))) == null)) {
                        l.b(queryParameter, "");
                        l.b(field, "");
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        l.b(type, "");
                        field.set(this, c.a(uri, a2, queryParameter, type));
                    }
                }
                cls = cls.getSuperclass();
            } while (cls != null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewConfig(Uri uri, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : uri);
    }
}
