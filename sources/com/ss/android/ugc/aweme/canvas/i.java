package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ar;
import h.f.b.l;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public long f69700a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f69701b;

    /* renamed from: c  reason: collision with root package name */
    private final int f69702c;

    static {
        Covode.recordClassIndex(42983);
    }

    public final void a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) ((System.currentTimeMillis() - this.f69700a) / ((long) this.f69702c)));
        ar a2 = new ar().a("pictureCount", Integer.valueOf(this.f69702c));
        if (this.f69701b) {
            str = "story";
        } else {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
                str = "lightening";
            } else {
                str = "main";
            }
        }
        q.a("aweme_photo_canvas_generate_duration", jSONObject, a2.a("business", str).a());
    }

    public /* synthetic */ i(boolean z) {
        this(z, 1);
    }

    public i(boolean z, int i2) {
        this.f69701b = z;
        this.f69702c = i2;
    }
}
