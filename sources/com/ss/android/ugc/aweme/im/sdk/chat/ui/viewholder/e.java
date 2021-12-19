package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.service.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f101426a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f101427b;

    static {
        Covode.recordClassIndex(64858);
    }

    e(d dVar, RecyclerView recyclerView) {
        this.f101426a = dVar;
        this.f101427b = recyclerView;
    }

    public final void run() {
        d dVar = this.f101426a;
        RecyclerView recyclerView = this.f101427b;
        if (recyclerView.getAdapter() != null && !dVar.f101417a.isEmpty()) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int k2 = linearLayoutManager.k();
            int m2 = linearLayoutManager.m();
            for (int i2 = k2; i2 <= m2; i2++) {
                if (dVar.f101417a.get(Integer.valueOf(i2)) != null) {
                    dVar.f101417a.get(Integer.valueOf(i2));
                }
            }
            if (recyclerView.getAdapter().getItemCount() >= m2 && k2 != -1) {
                try {
                    int[] iArr = new int[2];
                    recyclerView.getLocationOnScreen(iArr);
                    String str = "";
                    while (k2 <= m2) {
                        int itemViewType = recyclerView.getAdapter().getItemViewType(k2);
                        if (itemViewType == b.SHARE_AWEME_RECEIVE.getViewType() || itemViewType == b.SHARE_AWEME_SEND.getViewType()) {
                            RecyclerView.ViewHolder f2 = recyclerView.f(k2);
                            if (f2 instanceof s) {
                                ai aiVar = ((s) f2).s;
                                d f3 = d.f();
                                String uuid = aiVar.getUuid();
                                f fVar = f3.f101418b.get(f3.f101419c);
                                if (TextUtils.equals(f3.f101419c, uuid) && fVar != null && fVar.b()) {
                                    if (f2 != null) {
                                        View view = f2.itemView;
                                        int[] iArr2 = new int[2];
                                        view.getLocationOnScreen(iArr2);
                                        Rect rect = new Rect();
                                        rect.set(iArr2[0], iArr2[1], iArr2[0] + view.getWidth(), iArr2[1] + view.getHeight());
                                        int i3 = (rect.top + rect.bottom) / 2;
                                        if (i3 < recyclerView.getTop() + iArr[1] || i3 > iArr[1] + recyclerView.getBottom()) {
                                            d f4 = d.f();
                                            f fVar2 = f4.f101418b.get(f4.f101419c);
                                            if (fVar2 != null && !TextUtils.isEmpty(f4.f101419c) && fVar2.b()) {
                                                fVar2.d();
                                            }
                                        }
                                    }
                                    str = aiVar.getUuid();
                                }
                            }
                        }
                        k2++;
                    }
                    if (str.equals(dVar.f101419c) && dVar.f101417a.get(str) != null) {
                        dVar.f101417a.get(str);
                    }
                    if (dVar.f101417a.get(dVar.f101419c) != null) {
                        dVar.f101417a.get(dVar.f101419c);
                    }
                    if (dVar.f101417a.get(str) != null) {
                        dVar.f101417a.get(str);
                        dVar.b(str);
                    }
                    dVar.f101420d = false;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
