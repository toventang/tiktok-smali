package com.ss.android.ugc.aweme.comment.barrage.a;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.anchor.multi.a.b;
import com.ss.android.ugc.aweme.comment.barrage.a.b;
import com.ss.android.ugc.aweme.comment.barrage.view.AnchorsFlowLayout;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.multi.d;
import h.a.n;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final b f71539a = new b();

    /* renamed from: b  reason: collision with root package name */
    private d f71540b;

    /* renamed from: c  reason: collision with root package name */
    private String f71541c;

    static {
        Covode.recordClassIndex(44015);
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.a.d
    public final void b(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
        l.d(commentMultiAnchorTagLayout, "");
        d dVar = this.f71540b;
        if (dVar != null) {
            l.d(dVar, "");
            try {
                Object g2 = n.g((List) dVar.f110896a);
                c cVar = (c) g2;
                c cVar2 = (c) n.h((List) dVar.f110896a);
                boolean z = true;
                if (cVar2 == null || cVar2.d() <= 1) {
                    z = false;
                }
                cVar.b(b.a(dVar, cVar, z));
                q.m223constructorimpl((c) g2);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
            Iterator<T> it = dVar.f110896a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.a.d
    public final void a(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
        MethodCollector.i(1129);
        l.d(commentMultiAnchorTagLayout, "");
        i.a.a.a.a.b.c(commentMultiAnchorTagLayout);
        d dVar = this.f71540b;
        if (dVar == null) {
            MethodCollector.o(1129);
        } else if (dVar.g() != 0) {
            l.d(dVar, "");
            l.d(commentMultiAnchorTagLayout, "");
            AnchorsFlowLayout flowView = commentMultiAnchorTagLayout.getFlowView();
            List<c> list = dVar.f110896a;
            b.a aVar = new b.a(commentMultiAnchorTagLayout);
            b.C1612b bVar = new b.C1612b(dVar);
            l.d(flowView, "");
            l.d(aVar, "");
            l.d(bVar, "");
            if (list == null || list.isEmpty()) {
                flowView.setVisibility(8);
            } else {
                flowView.setVisibility(0);
            }
            if (l.a(flowView.getTag(), list) || list == null) {
                flowView.setTag(list);
                MethodCollector.o(1129);
                return;
            }
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                View childAt = flowView.getChildAt(i2);
                if (childAt == null) {
                    View view = (View) aVar.invoke();
                    flowView.addView(view);
                    bVar.invoke(view, t, Integer.valueOf(i2));
                } else {
                    childAt.setVisibility(0);
                    bVar.invoke(childAt, t, Integer.valueOf(i2));
                }
                i2 = i3;
            }
            if (flowView.getChildCount() > list.size()) {
                int childCount = flowView.getChildCount();
                for (int size = list.size(); size < childCount; size++) {
                    View childAt2 = flowView.getChildAt(size);
                    l.b(childAt2, "");
                    childAt2.setVisibility(8);
                }
            }
            MethodCollector.o(1129);
        } else {
            i.a.a.a.a.b.a(commentMultiAnchorTagLayout);
            MethodCollector.o(1129);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.a.d
    public final void a(com.ss.android.ugc.aweme.comment.barrage.c cVar, Activity activity) {
        l.d(cVar, "");
        l.d(activity, "");
        Aweme aweme = cVar.getAweme();
        String str = cVar.getMobParams().eventType;
        l.b(str, "");
        JSONObject put = new JSONObject().put("request_id", cVar.getMobParams().requestId);
        l.b(put, "");
        d dVar = new d(aweme, activity, str, "comment_anchor", put, null, false);
        this.f71541c = cVar.getAweme().getAid();
        this.f71540b = dVar;
    }
}
