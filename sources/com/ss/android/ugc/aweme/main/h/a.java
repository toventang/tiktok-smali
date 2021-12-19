package com.ss.android.ugc.aweme.main.h;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.cb;
import com.ss.android.ugc.aweme.shortvideo.cq;

public final class a {
    static {
        Covode.recordClassIndex(69979);
    }

    public static boolean a() {
        if (!AVExternalServiceImpl.a().publishService().isPublishable()) {
            return true;
        }
        return false;
    }

    public static void b(e eVar) {
        if (eVar != null) {
            Fragment a2 = eVar.getSupportFragmentManager().a("publish");
            if (a2 instanceof cq) {
                ((cq) a2).b();
            } else if (a2 instanceof cb) {
                ((cb) a2).b();
            }
        }
    }

    public static void a(e eVar) {
        if (eVar != null) {
            IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
            if (publishService.isParallelPublishEnabled()) {
                if (publishService.getAllPublishModel().size() > 0) {
                    Fragment a2 = eVar.getSupportFragmentManager().a("publish");
                    if (a2 instanceof cq) {
                        ((cq) a2).a();
                    } else if (a2 instanceof cb) {
                        ((cb) a2).a();
                    }
                }
            } else if (a()) {
                Fragment a3 = eVar.getSupportFragmentManager().a("publish");
                if (a3 instanceof cq) {
                    ((cq) a3).a();
                } else if (a3 instanceof cb) {
                    ((cb) a3).a();
                }
            }
        }
    }
}
