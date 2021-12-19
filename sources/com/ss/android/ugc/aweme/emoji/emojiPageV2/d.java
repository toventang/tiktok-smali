package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.aweme.emoji.views.c;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public float f89154a;

    /* renamed from: b  reason: collision with root package name */
    public long f89155b;

    /* renamed from: c  reason: collision with root package name */
    public long f89156c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f89157d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f89158e;

    /* renamed from: f  reason: collision with root package name */
    public int f89159f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f89160g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public final int f89161h = 500;

    /* renamed from: i  reason: collision with root package name */
    public float f89162i;

    /* renamed from: j  reason: collision with root package name */
    public float f89163j;

    /* renamed from: k  reason: collision with root package name */
    c f89164k;

    /* renamed from: l  reason: collision with root package name */
    private final int f89165l = 9;

    /* renamed from: m  reason: collision with root package name */
    private final int f89166m = 120;
    private final int n = 56;
    private final int o = 27;
    private final float p = 0.32f;
    private final float q = 1.42f;

    static {
        Covode.recordClassIndex(56066);
    }

    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f89167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f89168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView f89169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f89170d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SwipeControlledViewPager f89171e;

        static {
            Covode.recordClassIndex(56067);
        }

        public a(d dVar, List list, RecyclerView recyclerView, List list2, SwipeControlledViewPager swipeControlledViewPager) {
            this.f89167a = dVar;
            this.f89168b = list;
            this.f89169c = recyclerView;
            this.f89170d = list2;
            this.f89171e = swipeControlledViewPager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (r1 != 3) goto L_0x001c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(final android.view.View r14, android.view.MotionEvent r15) {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.emojiPageV2.d.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r17, com.ss.android.ugc.aweme.base.model.UrlModel r18, android.view.View r19, android.content.Context r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.emojiPageV2.d.a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    public final void a(float f2, float f3, List<? extends View> list, List<? extends com.ss.android.ugc.aweme.emoji.b.a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        int i2;
        View findViewById;
        int i3 = 0;
        for (View view2 : list) {
            if (f2 <= ((float) view2.getLeft()) || f2 >= ((float) view2.getRight()) || f3 >= ((float) view2.getBottom()) || f3 <= ((float) view2.getTop())) {
                i3++;
            } else {
                if (this.f89159f != i3 && System.currentTimeMillis() - this.f89158e > ((long) this.f89161h) && Math.abs(f2 - this.f89154a) < 20.0f) {
                    this.f89157d = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f89160g.removeCallbacksAndMessages(null);
                }
                int i4 = this.f89159f;
                if (!(i4 < 0 || i3 == i4 || (findViewById = ((View) list.get(i4)).findViewById(R.id.av9)) == null)) {
                    findViewById.setBackground(new ColorDrawable(0));
                }
                if (!this.f89157d && i3 < list2.size()) {
                    View findViewById2 = ((View) list.get(i3)).findViewById(R.id.av9);
                    com.ss.android.ugc.aweme.emoji.b.a aVar = (com.ss.android.ugc.aweme.emoji.b.a) list2.get(i3);
                    if (!(!aVar.a() || (i2 = aVar.f89103a) == 2131231984 || i2 == 2131231993 || findViewById2 == null)) {
                        com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
                        l.b(aVar2, "");
                        if (aVar2.getStickerType() == 1) {
                            String str = "file://" + com.ss.android.ugc.aweme.emoji.utils.c.b(aVar.f89106d);
                            com.ss.android.ugc.aweme.emoji.g.a aVar3 = aVar.f89106d;
                            l.b(aVar3, "");
                            UrlModel animateUrl = aVar3.getAnimateUrl();
                            if (new File(str).exists()) {
                                animateUrl = new UrlModel();
                                animateUrl.setUri(str);
                                animateUrl.setUrlList(n.a(str));
                            }
                            l.b(animateUrl, "");
                            Context context = view.getContext();
                            l.b(context, "");
                            com.ss.android.ugc.aweme.emoji.g.a aVar4 = aVar.f89106d;
                            l.b(aVar4, "");
                            a(i3, animateUrl, findViewById2, context, com.ss.android.ugc.aweme.emoji.d.a.a.c(aVar4));
                            return;
                        }
                        com.ss.android.ugc.aweme.emoji.g.a aVar5 = aVar.f89106d;
                        l.b(aVar5, "");
                        UrlModel animateUrl2 = aVar5.getAnimateUrl();
                        l.b(animateUrl2, "");
                        Context context2 = view.getContext();
                        l.b(context2, "");
                        com.ss.android.ugc.aweme.emoji.g.a aVar6 = aVar.f89106d;
                        l.b(aVar6, "");
                        a(i3, animateUrl2, findViewById2, context2, com.ss.android.ugc.aweme.emoji.d.a.a.c(aVar6));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
