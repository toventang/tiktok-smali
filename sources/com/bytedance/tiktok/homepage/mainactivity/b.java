package com.bytedance.tiktok.homepage.mainactivity;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import h.f.b.l;
import h.m.d;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class b implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44142a = new a((byte) 0);

    static {
        Covode.recordClassIndex(27050);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(206, new g(b.class, "onReceivedMsgEvent", com.ss.android.ugc.aweme.common.net.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27051);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @r
    public final void onReceivedMsgEvent(com.ss.android.ugc.aweme.common.net.j jVar) {
        l.d(jVar, "");
        String.valueOf(jVar.f76476a.f151618e);
        try {
            if ((jVar.f76476a.f151618e == 20216 || jVar.f76476a.f151618e == 20173) && jVar.f76476a.f151617d == 1) {
                byte[] bArr = jVar.f76476a.f151615b;
                l.b(bArr, "");
                JSONObject jSONObject = new JSONObject(new String(bArr, d.f158808a));
                ReplaceMusicServiceImpl.a().showWindow(jSONObject, jSONObject.getBoolean("success"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
