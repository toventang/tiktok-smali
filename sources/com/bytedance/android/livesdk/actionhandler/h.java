package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class h implements f {
    static {
        Covode.recordClassIndex(7556);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("sign", uri.getHost());
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        Intent intent = new Intent();
        intent.putExtra("url", queryParameter);
        ((IHostAction) a.a(IHostAction.class)).openSignActivity(context, intent);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
