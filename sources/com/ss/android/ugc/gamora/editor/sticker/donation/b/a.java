package com.ss.android.ugc.gamora.editor.sticker.donation.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146532a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(96420);
    }

    public static String a() {
        z zVar = (z) ServiceManager.get().getService(z.class);
        if (zVar != null) {
            return zVar.c();
        }
        return null;
    }
}
