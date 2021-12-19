package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.utils.g;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.aweme.emoji.views.c;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    String f89250a;

    /* renamed from: b  reason: collision with root package name */
    int f89251b;

    /* renamed from: c  reason: collision with root package name */
    g<String, f> f89252c;

    /* renamed from: d  reason: collision with root package name */
    float f89253d;

    /* renamed from: e  reason: collision with root package name */
    long f89254e;

    /* renamed from: f  reason: collision with root package name */
    long f89255f;

    /* renamed from: g  reason: collision with root package name */
    boolean f89256g;

    /* renamed from: h  reason: collision with root package name */
    long f89257h;

    /* renamed from: i  reason: collision with root package name */
    int f89258i;

    /* renamed from: j  reason: collision with root package name */
    Handler f89259j;

    /* renamed from: k  reason: collision with root package name */
    float f89260k;

    /* renamed from: l  reason: collision with root package name */
    float f89261l;

    /* renamed from: m  reason: collision with root package name */
    c f89262m;

    static {
        Covode.recordClassIndex(56099);
    }

    public i() {
        this(0);
    }

    public i(int i2) {
        this.f89256g = true;
        this.f89258i = -1;
        this.f89259j = new Handler(Looper.getMainLooper());
        this.f89251b = i2;
        this.f89252c = new g<>(5);
        this.f89250a = d.a().getString(R.string.bn1);
    }

    static <T extends o> View a(ViewGroup viewGroup, T t) {
        MethodCollector.i(1293);
        View a2 = t.a(viewGroup);
        if (viewGroup.indexOfChild(a2) < 0) {
            viewGroup.addView(a2);
        }
        MethodCollector.o(1293);
        return a2;
    }

    private void a(GridView gridView, SwipeControlledViewPager swipeControlledViewPager, List<a> list) {
        gridView.setOnTouchListener(new k(this, new ArrayList(), gridView, list, swipeControlledViewPager));
    }

    private static void a(f fVar, List<a> list, p pVar, m mVar, int i2) {
        fVar.f89233b.setOnItemClickListener(new j(list, pVar, mVar, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r16, com.ss.android.ugc.aweme.base.model.UrlModel r17, android.view.View r18, android.content.Context r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.emojichoose.i.a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3, List<View> list, List<a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        int i2;
        View findViewById;
        int i3 = 0;
        for (View view2 : list) {
            if (f2 <= ((float) view2.getLeft()) || f2 >= ((float) view2.getRight()) || f3 >= ((float) view2.getBottom()) || f3 <= ((float) view2.getTop())) {
                i3++;
            } else {
                if (this.f89258i != i3 && System.currentTimeMillis() - this.f89257h > 500 && Math.abs(f2 - this.f89253d) < 20.0f) {
                    this.f89256g = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f89259j.removeCallbacksAndMessages(null);
                }
                int i4 = this.f89258i;
                if (!(i4 < 0 || i3 == i4 || (findViewById = list.get(i4).findViewById(R.id.av9)) == null)) {
                    findViewById.setBackground(new ColorDrawable(0));
                }
                if (!this.f89256g && i3 < list2.size()) {
                    View findViewById2 = list.get(i3).findViewById(R.id.av9);
                    a aVar = list2.get(i3);
                    if (!(!aVar.a() || (i2 = aVar.f89103a) == 2131231984 || i2 == 2131231993 || findViewById2 == null)) {
                        if (aVar.f89106d.getStickerType() == 1) {
                            String str = "file://" + com.ss.android.ugc.aweme.emoji.utils.c.b(aVar.f89106d);
                            UrlModel animateUrl = aVar.f89106d.getAnimateUrl();
                            if (new File(str).exists()) {
                                animateUrl = new UrlModel();
                                animateUrl.setUri(str);
                                animateUrl.setUrlList(Collections.singletonList(str));
                            }
                            a(i3, animateUrl, findViewById2, view.getContext(), com.ss.android.ugc.aweme.emoji.d.a.a.c(aVar.f89106d));
                            return;
                        }
                        a(i3, aVar.f89106d.getAnimateUrl(), findViewById2, view.getContext(), com.ss.android.ugc.aweme.emoji.d.a.a.c(aVar.f89106d));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar, List<a> list, f fVar2, p pVar, SwipeControlledViewPager swipeControlledViewPager, m mVar, int i2) {
        fVar.a(list);
        if (fVar2.j() == 2 || fVar2.j() == 4 || fVar2.j() == 3) {
            fVar.f89233b.setSelector(new ColorDrawable(0));
            a(fVar.f89233b, swipeControlledViewPager, list);
        }
        a(fVar, list, pVar, mVar, i2);
    }
}
