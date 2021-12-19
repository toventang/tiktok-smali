package com.ss.android.ugc.aweme.shortvideo.editcut;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ak.a;
import com.ss.android.ugc.aweme.ak.b;
import com.ss.android.ugc.aweme.ak.c;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.editcut.e;
import h.f.b.l;
import h.z;
import java.util.List;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class s implements b {
    static {
        Covode.recordClassIndex(84206);
    }

    @Override // com.ss.android.ugc.aweme.ak.b
    public final c a() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.ak.b
    public final a a(Activity activity, long j2, long j3) {
        l.d(activity, "");
        return new c(activity, j2, j3);
    }

    @Override // com.ss.android.ugc.aweme.ak.b
    public final void a(e eVar, List<? extends MediaModel> list, h.f.a.b<? super Boolean, z> bVar) {
        l.d(eVar, "");
        l.d(list, "");
        l.d(bVar, "");
        e eVar2 = new e(eVar);
        l.d(list, "");
        l.d(bVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.ies.abmock.b.a().a(true, "enable_dynamic_cut_optimized", false) || g.a().A().a() || !eVar2.b() || list.isEmpty()) {
            bVar.invoke(Boolean.valueOf(eVar2.b()));
        } else {
            bz unused = i.a(an.a(bf.f159041b), null, null, new e.b(eVar2, true, list, bVar, currentTimeMillis, null), 3);
        }
    }
}
