package com.ss.android.ugc.aweme.cn.a;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cn.e;
import com.ss.android.ugc.aweme.cn.h;
import com.ss.android.ugc.aweme.cn.i;
import com.ss.android.ugc.tools.c;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f71201a = "type_scene_cover";

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f71202c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f71203d = new ReentrantLock(true);

    static {
        Covode.recordClassIndex(43823);
    }

    public final void a(String str, PrivacyCert privacyCert) {
        l.d(str, "");
        this.f71203d.lock();
        c.f149151f.d("qilan: SensitiveApiManagement: onSceneCoverShow: sceneName: " + str + ", curSceneSet: " + this.f71202c.toString());
        if (this.f71202c.isEmpty()) {
            a(new i(this.f71201a, new h(2, 2), new com.ss.android.ugc.aweme.cn.d("action_name_stop_preview", privacyCert, new e(false, false, false, null, null, false, null, false, 254))));
        }
        this.f71202c.add(str);
        this.f71203d.unlock();
    }

    public final void b(String str, PrivacyCert privacyCert) {
        l.d(str, "");
        this.f71203d.lock();
        c.f149151f.d("qilan: SensitiveApiManagement: onSceneCoverHide: sceneName: " + str + ", curSceneSet: " + this.f71202c.toString() + '}');
        this.f71202c.remove(str);
        if (this.f71202c.isEmpty()) {
            a(new i(this.f71201a, new h(1, 1), new com.ss.android.ugc.aweme.cn.d("action_name_start_preview", privacyCert, new e(false, false, false, null, null, false, null, false, 254))));
        }
        this.f71203d.unlock();
    }
}
