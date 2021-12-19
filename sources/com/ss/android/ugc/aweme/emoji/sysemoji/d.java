package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.ss.android.ugc.aweme.emoji.sysemoji.p;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class d implements RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public long f89371a;

    /* renamed from: b  reason: collision with root package name */
    private final int f89372b = 150;

    /* renamed from: c  reason: collision with root package name */
    private int f89373c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float f89374d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f89375e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private final float f89376f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f89377g;

    /* renamed from: h  reason: collision with root package name */
    private final c f89378h;

    /* renamed from: i  reason: collision with root package name */
    private final SwipeControlledViewPager f89379i;

    /* renamed from: j  reason: collision with root package name */
    private final List<a> f89380j;

    static {
        Covode.recordClassIndex(56159);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a(boolean z) {
    }

    private final void a(SwipeControlledViewPager swipeControlledViewPager) {
        if (a((View) swipeControlledViewPager) != null) {
            swipeControlledViewPager.setSwipeEnabled(true);
            this.f89373c = -1;
        }
    }

    private static Activity a(View view) {
        Context context = view.getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        l.d(recyclerView, "");
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f89378h.isShowing()) {
                    a(this.f89379i);
                    this.f89378h.dismiss();
                }
            } else if (this.f89378h.isShowing()) {
                c cVar = this.f89378h;
                com.ss.android.ugc.aweme.emoji.g.a aVar = this.f89380j.get(this.f89373c).f89106d;
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                cVar.a((i) aVar, motionEvent);
            }
        } else if (this.f89378h.isShowing()) {
            c cVar2 = this.f89378h;
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = this.f89380j.get(this.f89373c).f89106d;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
            cVar2.a((i) aVar2, motionEvent);
            a(this.f89379i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View a2;
        int absoluteAdapterPosition;
        l.d(recyclerView, "");
        l.d(motionEvent, "");
        if (!(recyclerView instanceof SwipeControlledRecycleView) || (a2 = recyclerView.a(motionEvent.getX(), motionEvent.getY())) == null) {
            return false;
        }
        l.b(a2, "");
        RecyclerView.ViewHolder a3 = recyclerView.a(a2);
        if (!(a3 instanceof p.a) || (absoluteAdapterPosition = a3.getAbsoluteAdapterPosition()) == -1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f89374d = motionEvent.getRawX();
            this.f89375e = motionEvent.getRawY();
            this.f89371a = System.currentTimeMillis();
            this.f89373c = absoluteAdapterPosition;
            this.f89377g = false;
        } else if (action == 1) {
            a(this.f89379i);
        } else if (action == 2) {
            if (Math.abs(motionEvent.getRawX() - this.f89374d) > this.f89376f || Math.abs(motionEvent.getRawY() - this.f89375e) > this.f89376f) {
                this.f89377g = true;
            }
            if (this.f89377g) {
                return false;
            }
            int i2 = this.f89373c;
            if (i2 != absoluteAdapterPosition) {
                this.f89373c = -1;
                return false;
            } else if (i2 != -1 && this.f89371a != 0 && System.currentTimeMillis() - this.f89371a > ((long) this.f89372b) && !this.f89378h.isShowing() && this.f89373c == absoluteAdapterPosition) {
                a2.performHapticFeedback(0);
                c cVar = this.f89378h;
                com.ss.android.ugc.aweme.emoji.g.a aVar = this.f89380j.get(absoluteAdapterPosition).f89106d;
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                cVar.a((i) aVar, motionEvent);
                c cVar2 = this.f89378h;
                cVar2.getContentView().measure(c.a(cVar2.getWidth()), c.a(cVar2.getHeight()));
                c cVar3 = this.f89378h;
                l.d(a2, "");
                Rect rect = new Rect();
                a2.getGlobalVisibleRect(rect);
                com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", "anchor  ".concat(String.valueOf(rect)));
                com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", "contentRect  ".concat(String.valueOf(new Rect())));
                Rect rect2 = new Rect();
                Window window = cVar3.f89365b.getWindow();
                l.b(window, "");
                window.getDecorView().getGlobalVisibleRect(rect2);
                com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", "decorView  ".concat(String.valueOf(rect2)));
                com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", "contentView.measuredWidth  " + cVar3.a());
                int i3 = (-(cVar3.a() - a2.getMeasuredWidth())) / 2;
                int i4 = -a2.getMeasuredHeight();
                View contentView = cVar3.getContentView();
                l.b(contentView, "");
                int measuredHeight = i4 - contentView.getMeasuredHeight();
                com.ss.android.ugc.aweme.im.service.m.a.b("EmojiPopUpWindow", "showAsDropDown   " + i3 + "  " + measuredHeight);
                cVar3.showAsDropDown(a2, i3, measuredHeight - 12);
                this.f89379i.setSwipeEnabled(false);
                return true;
            }
        } else if (action == 3 && this.f89378h.isShowing()) {
            a(this.f89379i);
            this.f89378h.dismiss();
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.emoji.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c cVar, SwipeControlledViewPager swipeControlledViewPager, List<? extends a> list, int i2) {
        l.d(cVar, "");
        l.d(swipeControlledViewPager, "");
        l.d(list, "");
        this.f89378h = cVar;
        this.f89379i = swipeControlledViewPager;
        this.f89380j = list;
        this.f89376f = ((float) i2) / 2.0f;
    }
}
