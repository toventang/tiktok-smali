package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.Map;

public final class SchemaPageHelperImpl implements SchemaPageHelper {
    static {
        Covode.recordClassIndex(93258);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final String a() {
        String str = d.s;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static SchemaPageHelper b() {
        MethodCollector.i(1636);
        Object a2 = b.a(SchemaPageHelper.class, false);
        if (a2 != null) {
            SchemaPageHelper schemaPageHelper = (SchemaPageHelper) a2;
            MethodCollector.o(1636);
            return schemaPageHelper;
        }
        if (b.eB == null) {
            synchronized (SchemaPageHelper.class) {
                try {
                    if (b.eB == null) {
                        b.eB = new SchemaPageHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1636);
                    throw th;
                }
            }
        }
        SchemaPageHelperImpl schemaPageHelperImpl = (SchemaPageHelperImpl) b.eB;
        MethodCollector.o(1636);
        return schemaPageHelperImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final Intent a(Context context, Uri uri) {
        return e.a(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final Intent b(Context context, Uri uri) {
        l.d(context, "");
        return d.a.a(context, uri, false, false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        d.a.a(context, str, "", false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    public final boolean a(Context context, String str, String str2, Map<String, String> map) {
        l.d(context, "");
        l.d(str2, "");
        return w.a(context, str, str2, true, map);
    }
}
