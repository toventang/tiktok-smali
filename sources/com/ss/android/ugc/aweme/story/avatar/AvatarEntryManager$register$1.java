package com.ss.android.ugc.aweme.story.avatar;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import java.util.Iterator;
import java.util.Set;

public final class AvatarEntryManager$register$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f136759a;

    static {
        Covode.recordClassIndex(89347);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Integer num;
        m mVar = this.f136759a;
        StringBuilder append = new StringBuilder("target: ").append(mVar).append(", views: ");
        Set<f> set = a.f136767c.get(mVar);
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        append.append(num);
        Set<f> set2 = a.f136767c.get(mVar);
        if (set2 != null) {
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                a.f136768d.a((f) it.next());
            }
        }
        a.f136767c.remove(mVar);
    }

    AvatarEntryManager$register$1(m mVar) {
        this.f136759a = mVar;
    }
}
