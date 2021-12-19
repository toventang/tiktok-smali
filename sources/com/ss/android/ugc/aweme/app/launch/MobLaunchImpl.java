package com.ss.android.ugc.aweme.app.launch;

import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class MobLaunchImpl implements IMobLaunchApi {
    static {
        Covode.recordClassIndex(41136);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void a(boolean z) {
        c.f66675a = z;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void a(String str) {
        T t;
        if (str != null) {
            try {
                CopyOnWriteArraySet<AssemInitTask.b> copyOnWriteArraySet = AssemInitTask.f107731b;
                Iterator<T> it = copyOnWriteArraySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (l.a((Object) t.f107739a, (Object) str)) {
                        break;
                    }
                }
                q.m223constructorimpl(Boolean.valueOf(copyOnWriteArraySet.remove(t)));
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void b(String str) {
        if (str != null) {
            try {
                if (AssemInitTask.f107731b.size() <= 50) {
                    AssemInitTask.f107731b.add(new AssemInitTask.b(str));
                    ((Handler) AssemInitTask.f107733d.getValue()).postDelayed(new AssemInitTask.c.a(str), 500);
                }
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void a(String str, Uri uri, boolean z) {
        c.a.a(str, uri);
    }
}
