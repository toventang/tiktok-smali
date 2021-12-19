package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.b;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.c.v;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableEffectSetting;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final VideoWidget2 f8817a;

    static {
        Covode.recordClassIndex(4500);
    }

    p(VideoWidget2 videoWidget2) {
        this.f8817a = videoWidget2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        VideoWidget2 videoWidget2 = this.f8817a;
        if (obj instanceof r) {
            videoWidget2.onEvent((r) obj);
        } else if (obj instanceof b) {
            if (!TestDisableEffectSetting.INSTANCE.getValue()) {
                videoWidget2.onEvent((b) obj);
            }
        } else if (obj instanceof v) {
            v vVar = (v) obj;
            if (videoWidget2.v != null) {
                videoWidget2.v.onEvent(vVar);
            }
        }
    }
}
