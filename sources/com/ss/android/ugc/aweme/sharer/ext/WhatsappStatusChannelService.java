package com.ss.android.ugc.aweme.sharer.ext;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;
import h.f.b.l;

public final class WhatsappStatusChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81804);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "whatsapp_status";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        y yVar = null;
        if (!(dVar == null || dVar.f124525c == null)) {
            Drawable drawable = dVar.f124525c;
            if (drawable == null) {
                l.b();
            }
            yVar = new y(drawable);
        }
        return yVar;
    }
}
