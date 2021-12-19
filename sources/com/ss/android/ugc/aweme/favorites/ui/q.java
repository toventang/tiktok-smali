package com.ss.android.ugc.aweme.favorites.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.favorites.a.e;
import com.ss.android.ugc.aweme.favorites.d.b;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class q extends a implements i, j {

    /* renamed from: k  reason: collision with root package name */
    private boolean f90930k;

    static {
        Covode.recordClassIndex(57154);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(372, new g(q.class, "onStickerCollectEvent", b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final f n() {
        return new e();
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f90930k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void l() {
        if (this.f90813j != null) {
            this.f90813j.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.favorites.e.g());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f90930k) {
            this.f90930k = false;
            c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void c() {
        if (this.f90813j != null) {
            this.f90813j.a(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void k() {
        if (this.f90813j != null) {
            this.f90813j.a(4);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void q() {
        a aVar = new a();
        aVar.f44749a = R.raw.icon_large_bookmark;
        aVar.f44753e = Integer.valueOf((int) R.attr.bd);
        this.f90809b.setStatus(new TuxStatusView.c().a(aVar).a(getString(R.string.bsp)).a((CharSequence) getString(R.string.bso)));
        this.f90809b.setVisibility(0);
    }

    @r
    public void onStickerCollectEvent(b bVar) {
        if (ab_()) {
            List items = ((com.ss.android.ugc.aweme.common.e.a) this.f90813j.f76396h).getItems();
            com.ss.android.ugc.aweme.sticker.model.g gVar = bVar.f90595a;
            if (items != null && !items.isEmpty() && gVar != null) {
                if (!gVar.isFavorite) {
                    int size = items.size();
                    Iterator it = items.iterator();
                    while (it.hasNext()) {
                        com.ss.android.ugc.aweme.sticker.model.g gVar2 = (com.ss.android.ugc.aweme.sticker.model.g) it.next();
                        if (gVar2 != null && TextUtils.equals(gVar2.id, gVar.id)) {
                            this.f90930k = false;
                            it.remove();
                        }
                    }
                    if (size != items.size()) {
                        this.f90810c.notifyDataSetChanged();
                    } else {
                        this.f90930k = true;
                    }
                    if (items.isEmpty()) {
                        f();
                        return;
                    }
                    return;
                }
                this.f90930k = true;
            }
        }
    }
}
