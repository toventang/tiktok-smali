package com.ss.android.ugc.gamora.editor.lightening.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.experiment.ce;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.property.cn;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.gamora.editor.toolbar.g;
import com.ss.android.ugc.gamora.editor.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class a extends g {
    private final boolean x = av.a();

    static {
        Covode.recordClassIndex(96057);
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.g
    public final List<y> E() {
        Serializable serializable;
        int i2;
        int i3;
        ArrayList<String> arrayList;
        Intent intent;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Activity activity = this.f42913m;
        d dVar = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            serializable = null;
        } else {
            serializable = intent.getSerializableExtra("key_mv_theme_data");
        }
        if (serializable instanceof d) {
            dVar = serializable;
        }
        d dVar2 = dVar;
        boolean z = false;
        if (!(dVar2 == null || (arrayList = dVar2.selectMediaList) == null || arrayList.size() <= 1)) {
            z = true;
        }
        int i4 = 2131232582;
        int i5 = 2131232588;
        if (!"slideshow".equals(es.c(G())) || !z) {
            if (!this.x) {
                i5 = 2131232587;
            }
            arrayList3.add(new y(3, i5, R.string.hfg));
            if (!this.x) {
                i4 = 2131232581;
            }
            arrayList3.add(new y(4, i4, R.string.g6x));
            if (this.x) {
                i2 = 2131232556;
            } else {
                i2 = 2131232555;
            }
            arrayList3.add(new y(2, i2, R.string.blj));
        } else {
            if (!this.x) {
                i5 = 2131232587;
            }
            arrayList3.add(new y(3, i5, R.string.hfg));
            if (!this.x) {
                i4 = 2131232581;
            }
            arrayList3.add(new y(4, i4, R.string.g6x));
            if (!cn.a()) {
                if (this.x) {
                    i3 = 2131232556;
                } else {
                    i3 = 2131232555;
                }
                arrayList3.add(new y(2, i3, R.string.blj));
            }
        }
        arrayList2.addAll(arrayList3);
        arrayList2.addAll(super.E());
        return arrayList2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (!G().mIsFromDraft || G().mOrigin != 0 || !ce.a()) {
            H().setImageResource(2131232196);
        } else {
            H().setImageResource(2131232429);
        }
    }
}
