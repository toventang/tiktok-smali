package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.h;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class AwemeCommentBubbleList extends PowerList implements i, j {
    public static final a U = new a((byte) 0);
    final View P;
    public boolean Q;
    boolean R;
    public int S;
    public boolean T;
    private f.a.b.b V;
    private com.ss.android.ugc.aweme.comment.barrage.c.a W;
    private com.ss.android.ugc.aweme.comment.barrage.a aa;
    private boolean ab;
    private int ac;

    static {
        Covode.recordClassIndex(44078);
    }

    public AwemeCommentBubbleList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean canScrollVertically(int i2) {
        return false;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(313, new g(AwemeCommentBubbleList.class, "onDiggEvent", com.ss.android.ugc.aweme.o.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(314, new g(AwemeCommentBubbleList.class, "onBlockUser", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(315, new g(AwemeCommentBubbleList.class, "onCommentEvent", com.ss.android.ugc.aweme.o.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44080);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final com.ss.android.ugc.aweme.comment.barrage.c.a getBubbleListManager() {
        return this.W;
    }

    public final boolean getForbidAppendItem() {
        return this.ab;
    }

    public final com.ss.android.ugc.aweme.comment.barrage.a getMMobEventParam() {
        return this.aa;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeCommentBubbleList f71662a;

        static {
            Covode.recordClassIndex(44081);
        }

        b(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f71662a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f71662a.r();
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeCommentBubbleList f71665a;

        static {
            Covode.recordClassIndex(44084);
        }

        e(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f71665a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f71665a.r();
        }
    }

    public final int getFirstDataPositionInState() {
        if (this.R) {
            return 1;
        }
        return 0;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeCommentBubbleList f71663a;

        static {
            Covode.recordClassIndex(44082);
        }

        c(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f71663a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f71663a.r();
            this.f71663a.T = false;
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeCommentBubbleList f71664a;

        static {
            Covode.recordClassIndex(44083);
        }

        d(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f71664a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f71664a.b(0);
            AwemeCommentBubbleList awemeCommentBubbleList = this.f71664a;
            awemeCommentBubbleList.S = awemeCommentBubbleList.getFirstDataPositionInState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.a.b.b bVar = this.V;
        if (bVar != null) {
            bVar.dispose();
        }
        this.V = null;
    }

    public final void s() {
        com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "dz[stopAutoScroll]");
        f.a.b.b bVar = this.V;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final void q() {
        this.ac = -1;
        this.S = getFirstDataPositionInState();
        this.ab = true;
        this.T = false;
        setVisibility(4);
        s();
        b(0);
        getState().a();
    }

    public final void r() {
        com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "dz[startAutoScroll]");
        this.ab = false;
        f.a.b.b bVar = this.V;
        if (bVar == null || bVar.isDisposed()) {
            setVisibility(0);
            this.V = h.a(TimeUnit.MILLISECONDS).b().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new f(this));
        }
    }

    public final void setBubbleListManager(com.ss.android.ugc.aweme.comment.barrage.c.a aVar) {
        this.W = aVar;
    }

    public final void setForbidAppendItem(boolean z) {
        this.ab = z;
    }

    public final void setMMobEventParam(com.ss.android.ugc.aweme.comment.barrage.a aVar) {
        this.aa = aVar;
    }

    @r(a = ThreadMode.MAIN)
    public final void onBlockUser(com.ss.android.ugc.aweme.profile.b.a aVar) {
        com.ss.android.ugc.aweme.comment.barrage.c.a aVar2 = this.W;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeCommentBubbleList f71666a;

        static {
            Covode.recordClassIndex(44085);
        }

        f(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f71666a = awemeCommentBubbleList;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!this.f71666a.T) {
                AwemeCommentBubbleList awemeCommentBubbleList = this.f71666a;
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                awemeCommentBubbleList.a(0, h.g.a.a(TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics())));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        l.d(motionEvent, "");
        if (getScrollState() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 0 || !z) {
            return onInterceptTouchEvent;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @r(a = ThreadMode.MAIN)
    public final void onCommentEvent(com.ss.android.ugc.aweme.o.a aVar) {
        l.d(aVar, "");
        Comment comment = aVar.f114490b;
        int i2 = aVar.f114489a;
        if (i2 == 1) {
            l.d(comment, "");
            com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "from outside comment");
            if (this.W != null) {
                setVisibility(0);
                s();
                if (this.S == 0 || (getState().b(this.S - 1) instanceof com.ss.android.ugc.aweme.comment.barrage.b.a) || (getState().b(this.S - 1) instanceof com.ss.android.ugc.aweme.comment.barrage.b.b)) {
                    getState().a(this.S, a.a(comment, this.aa));
                } else {
                    getState().a(getFirstDataPositionInState(), a.a(comment, this.aa));
                }
                postDelayed(new b(this), 80);
            }
        } else if (i2 == 2) {
            l.d(comment, "");
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            if (!TextUtils.isEmpty(fakeId)) {
                int i3 = 0;
                for (com.bytedance.ies.powerlist.b.a aVar2 : getState().c()) {
                    if (!(aVar2 instanceof com.ss.android.ugc.aweme.comment.barrage.b.a) || !l.a((Object) ((com.ss.android.ugc.aweme.comment.barrage.b.a) aVar2).f71545a.getFakeId(), (Object) fakeId)) {
                        i3++;
                    } else if (i3 >= 0) {
                        com.bytedance.ies.powerlist.b.a b2 = getState().b(i3);
                        if (b2 instanceof com.ss.android.ugc.aweme.comment.barrage.b.a) {
                            getState().b(i3, new com.ss.android.ugc.aweme.comment.barrage.b.a(comment, ((com.ss.android.ugc.aweme.comment.barrage.b.a) b2).f71546b, this.aa));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else if (i2 == 3) {
            l.d(comment, "");
            com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "onCommentDeleted");
            com.ss.android.ugc.aweme.comment.barrage.c.a aVar3 = this.W;
            if (aVar3 != null) {
                aVar3.c();
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDiggEvent(com.ss.android.ugc.aweme.o.b bVar) {
        l.d(bVar, "");
        if (bVar.f114492a == 1) {
            com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "diggSuccess");
            if (!this.ab && !this.T && getState() != null && getState().b() != 0) {
                com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "[diggSuccess size is: " + getState().b() + ", insert position: " + this.S + ']');
                setVisibility(0);
                this.T = true;
                s();
                this.ac = this.S;
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                getState().a(this.ac, a.a(curUser, this.aa));
                com.ss.android.ugc.aweme.comment.util.i.a("ReactionBubbleList", "[diggSuccess finish insert and state size is: " + getState().b() + ']');
                postDelayed(new c(this), 40);
            }
        }
    }

    private /* synthetic */ AwemeCommentBubbleList(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AwemeCommentBubbleList(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        EventBus.a(EventBus.a(), this);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        a(new com.ss.android.ugc.aweme.friends.a.d(0, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())), 1));
        setHasFixedSize(true);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.jj, this, false);
        l.b(a2, "");
        this.P = a2;
        a2.setTag(2);
        i(a2);
        View a3 = com.a.a(LayoutInflater.from(context), R.layout.jj, this, false);
        j(a3);
        l.b(a3, "");
        a3.setTag(2);
        setItemAnimator(null);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AwemeCommentBubbleList f71661a;

            static {
                Covode.recordClassIndex(44079);
            }

            {
                this.f71661a = r1;
            }

            public final void onGlobalLayout() {
                View view;
                View view2;
                int i2 = 0;
                RecyclerView.ViewHolder a2 = this.f71661a.a(0, false);
                RecyclerView.ViewHolder a3 = this.f71661a.a(1, false);
                AwemeCommentBubbleList awemeCommentBubbleList = this.f71661a;
                if (a2 != null && a3 != null && (a3 instanceof ReactionBubbleDescriptionCell) && !awemeCommentBubbleList.Q && (view = a2.itemView) != null) {
                    l.b(view, "");
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    int a4 = h.g.a.a(TypedValue.applyDimension(1, 256.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    int a5 = a4 - h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
                    if (!(a3 == null || (view2 = a3.itemView) == null)) {
                        i2 = view2.getMeasuredHeight();
                    }
                    int i3 = a5 - i2;
                    if (i3 >= 0) {
                        layoutParams.height = i3;
                        view.setLayoutParams(layoutParams);
                    }
                }
            }
        });
        this.ab = true;
        this.ac = -1;
        addOnAttachStateChangeListener(new com.bytedance.analytics.a.f());
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        int b2 = getState().b();
        if (b2 >= 0) {
            int i6 = 0;
            while (true) {
                View childAt = getChildAt(i6);
                if (childAt != null) {
                    float top = (float) childAt.getTop();
                    if (top <= 0.0f) {
                        childAt.setVisibility(4);
                        if (l.a(childAt.getTag(), (Object) 1)) {
                            childAt.setTag(0);
                        }
                    } else {
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        int i7 = -1;
                        if (top <= ((float) h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())))) {
                            childAt.setVisibility(0);
                            Resources system2 = Resources.getSystem();
                            l.a((Object) system2, "");
                            childAt.setAlpha(top / ((float) h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()))));
                            if (getLayoutManager() != null) {
                                i7 = RecyclerView.i.e(childAt);
                            }
                            if (i7 == getState().b()) {
                                getState().c().size();
                                this.ab = true;
                                s();
                                postDelayed(new d(this), 40);
                                postDelayed(new e(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                            }
                        } else {
                            Resources system3 = Resources.getSystem();
                            l.a((Object) system3, "");
                            if (top <= ((float) h.g.a.a(TypedValue.applyDimension(1, 188.0f, system3.getDisplayMetrics())))) {
                                childAt.setVisibility(0);
                                childAt.setAlpha(1.0f);
                            } else {
                                Resources system4 = Resources.getSystem();
                                l.a((Object) system4, "");
                                if (top <= ((float) h.g.a.a(TypedValue.applyDimension(1, 208.0f, system4.getDisplayMetrics())))) {
                                    childAt.setVisibility(0);
                                    if (l.a(childAt.getTag(), (Object) 1) || l.a(childAt.getTag(), (Object) 2)) {
                                        childAt.setAlpha(1.0f);
                                    } else {
                                        Resources system5 = Resources.getSystem();
                                        l.a((Object) system5, "");
                                        Resources system6 = Resources.getSystem();
                                        l.a((Object) system6, "");
                                        childAt.setAlpha((((float) h.g.a.a(TypedValue.applyDimension(1, 208.0f, system5.getDisplayMetrics()))) - top) / ((float) h.g.a.a(TypedValue.applyDimension(1, 20.0f, system6.getDisplayMetrics()))));
                                    }
                                    if (getLayoutManager() != null) {
                                        i7 = RecyclerView.i.e(childAt);
                                    }
                                    if (i7 >= getFirstDataPositionInState() + 1) {
                                        this.S = i7;
                                        if (i7 > getState().b()) {
                                            this.S = getState().b();
                                        }
                                    }
                                } else {
                                    childAt.setVisibility(4);
                                    childAt.setAlpha(0.0f);
                                    return;
                                }
                            }
                        }
                    }
                }
                if (i6 != b2) {
                    i6++;
                } else {
                    return;
                }
            }
        }
    }
}
