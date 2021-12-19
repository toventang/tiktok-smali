package com.bytedance.creativex.recorder.a;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.a;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.d;
import com.ss.android.ugc.aweme.tools.beauty.g.c;
import com.ss.android.ugc.tools.utils.j;
import java.util.Iterator;
import java.util.List;

public final class l extends a {

    /* renamed from: e  reason: collision with root package name */
    private final a f28154e;

    static {
        Covode.recordClassIndex(16485);
    }

    @Override // com.bytedance.creativex.recorder.a.a
    public final BeautyMetadata a() {
        boolean z;
        BeautyMetadata r = this.f28052b.g().r();
        StringBuilder sb = new StringBuilder();
        List<ComposerBeauty> s = this.f28052b.g().s();
        int size = s.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f28052b.g().b(s.get(i2).getCategoryId())) {
                s.get(i2).setEnable(true);
                if (!s.get(i2).isCollectionType()) {
                    if (d.f(s.get(i2))) {
                        a(s.get(i2));
                    }
                } else if (s.get(i2).getChildList() != null) {
                    List<ComposerBeauty> childList = s.get(i2).getChildList();
                    if (childList == null) {
                        h.f.b.l.b();
                    }
                    if (!childList.isEmpty()) {
                        List<ComposerBeauty> childList2 = s.get(i2).getChildList();
                        if (childList2 == null) {
                            h.f.b.l.b();
                        }
                        int size2 = childList2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            List<ComposerBeauty> childList3 = s.get(i2).getChildList();
                            if (childList3 == null) {
                                h.f.b.l.b();
                            }
                            ComposerBeauty composerBeauty = childList3.get(i3);
                            composerBeauty.setEnable(true);
                            if (d.f(composerBeauty)) {
                                a(composerBeauty);
                            }
                        }
                        List<ComposerBeauty> childList4 = s.get(i2).getChildList();
                        if (childList4 == null) {
                            h.f.b.l.b();
                        }
                        Iterator<ComposerBeauty> it = childList4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().getEnable()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        s.get(i2).setEnable(z);
                    }
                }
                if (!z2) {
                    sb.append(",");
                } else {
                    z2 = false;
                }
                sb.append(s.get(i2).getEnable() ? 1 : 0);
            }
        }
        String sb2 = sb.toString();
        h.f.b.l.b(sb2, "");
        r.setBeautyValid(sb2);
        r.getBeautyName();
        r.getBeautyStrength();
        r.getBeautyId();
        r.getBeautyRes();
        r.getBeautyValid();
        return r;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.creativex.recorder.a.a
    public final void b(m mVar) {
        h.f.b.l.d(mVar, "");
        a aVar = this.f28154e;
        if (aVar != null) {
            aVar.setFilterFromStore(true);
        }
    }

    private final void a(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().isNone()) {
            int[] a2 = this.f28051a.a(composerBeauty.getEffect().getUnzipPath(), "");
            if (a2.length == 2 && a2[0] == 0 && a2[1] == c.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
                return;
            }
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null) {
            h.f.b.l.b();
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            int[] a3 = this.f28051a.a(composerBeauty.getEffect().getUnzipPath(), itemsBean.component5());
            if (a3.length == 2 && a3[0] == 0 && a3[1] == c.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(com.ss.android.ugc.aweme.tools.beauty.service.d dVar, a aVar, com.ss.android.ugc.aweme.tools.beauty.service.c cVar, j jVar, boolean z) {
        super(dVar, cVar, aVar, jVar, z);
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(cVar, "");
        this.f28154e = aVar;
    }
}
