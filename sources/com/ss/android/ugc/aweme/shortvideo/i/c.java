package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.a.a;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.port.in.g;
import java.util.List;
import java.util.Map;

public class c implements b {
    static {
        Covode.recordClassIndex(84287);
    }

    public int c() {
        return g.a().e().getBackCameraFilter(-1);
    }

    public int d() {
        return g.a().e().getFrontCameraFilter(-1);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.b
    public void b(int i2) {
        g.a().e().setFrontCameraFilter(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.b
    public final int a(int i2) {
        int d2;
        if (i2 == 0) {
            d2 = c();
        } else {
            d2 = d();
        }
        if (d2 != -1) {
            return d2;
        }
        return a(i2, g.a().r().d());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.b
    public void c(int i2) {
        g.a().e().setBackCameraFilter(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.b
    public final void a(int i2, int i3) {
        if (i2 == 0) {
            c(i3);
        } else {
            b(i3);
        }
    }

    /* access modifiers changed from: protected */
    public int a(int i2, o oVar) {
        Map b2 = a.b(com.ss.android.ugc.aweme.port.in.c.c().c().getValue());
        FilterBean filterBean = null;
        if (b2 != null) {
            FilterBean filterBean2 = null;
            int i3 = 0;
            for (Map.Entry entry : b2.entrySet()) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        break;
                    } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                        filterBean2 = (FilterBean) ((List) entry.getValue()).get(0);
                    }
                } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                    filterBean = (FilterBean) ((List) entry.getValue()).get(0);
                }
                i3++;
            }
            if (!(filterBean2 == null || i2 != 0 || com.ss.android.ugc.aweme.filter.repository.a.a.c.b(oVar.f(), filterBean2.getId()) == null)) {
                return filterBean2.getId();
            }
            if (!(filterBean == null || i2 != 1 || com.ss.android.ugc.aweme.filter.repository.a.a.c.b(oVar.f(), filterBean.getId()) == null)) {
                return filterBean.getId();
            }
        }
        return com.ss.android.ugc.aweme.filter.repository.a.a.c.a(oVar.f(), 0).getId();
    }
}
