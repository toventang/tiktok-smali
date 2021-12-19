package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    public final List<Fragment> f130302a = new ArrayList();

    static {
        Covode.recordClassIndex(85462);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f130302a.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(i iVar) {
        super(iVar);
        h.f.b.l.d(iVar, "");
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return this.f130302a.get(i2);
    }
}
