package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.n.a;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import f.a.v;
import f.a.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bm implements w {

    /* renamed from: a  reason: collision with root package name */
    static final w f122871a = new bm();

    static {
        Covode.recordClassIndex(80657);
    }

    private bm() {
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        try {
            long c2 = DiskManagerPage.a.c();
            boolean z = true;
            if (a.a(true)) {
                if (c2 >= DiskManagerPage.a.b()) {
                    if (System.currentTimeMillis() - a.a().getLong("last_show_disk_manager_dot_time", 0) >= 2592000000L) {
                    }
                }
                z = false;
            }
            vVar.a(Boolean.valueOf(z));
            vVar.a();
        } catch (Exception e2) {
            vVar.a((Throwable) e2);
        }
    }
}
