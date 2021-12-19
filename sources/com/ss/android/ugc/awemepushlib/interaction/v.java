package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.PushBody;
import com.bytedance.push.c.m;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONObject;

final /* synthetic */ class v implements m {

    /* renamed from: a  reason: collision with root package name */
    static final m f145469a = new v();

    static {
        Covode.recordClassIndex(95125);
    }

    private v() {
    }

    @Override // com.bytedance.push.c.m
    public final JSONObject a(Context context, int i2, PushBody pushBody) {
        MessageShowHandler.a(context, pushBody.a(), i2);
        return null;
    }
}
