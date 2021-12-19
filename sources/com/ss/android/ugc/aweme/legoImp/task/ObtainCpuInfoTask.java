package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.jato.boost.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.cm;
import h.f.b.m;
import h.z;
import java.util.List;

public final class ObtainCpuInfoTask implements w {
    static {
        Covode.recordClassIndex(69076);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class a extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107848a = new a();

        static {
            Covode.recordClassIndex(69077);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            if (!com.ss.android.ugc.aweme.ca.a.b() && c.a()) {
                int[] iArr = c.f26792b;
                if (iArr != null) {
                    i2 = iArr.length;
                } else {
                    i2 = 0;
                }
                Keva.getRepo("ab_repo_cold_boot").storeInt("key_big_core_count", i2);
                Keva.getRepo("ab_repo_cold_boot").storeBoolean("key_has_fetched_big_core_count", true);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        cm.f142777a.a("ObtainCpuInfoTask", a.f107848a);
    }
}
