package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.b.g;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class d implements f {
    static {
        Covode.recordClassIndex(7552);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        g gVar = (g) a.a(g.class);
        if (gVar != null) {
            return gVar.isContainerScheme(uri);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri) {
        g gVar = (g) a.a(g.class);
        if (gVar != null) {
            return gVar.handleScheme(uri, context);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
