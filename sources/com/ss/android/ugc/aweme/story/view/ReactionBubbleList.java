package com.ss.android.ugc.aweme.story.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.h;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class ReactionBubbleList extends PowerList implements a {
    public static final a S = new a((byte) 0);
    public int P;
    public int Q;
    public boolean R;
    private f.a.b.b T;
    private com.ss.android.ugc.aweme.story.interaction.c.a U;
    private final View V;
    private com.ss.android.ugc.aweme.story.interaction.b.g W;
    private boolean aa;
    private boolean ab;

    static {
        Covode.recordClassIndex(90609);
    }

    public ReactionBubbleList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean canScrollVertically(int i2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90610);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final com.ss.android.ugc.aweme.story.interaction.c.a getBubbleListManager() {
        return this.U;
    }

    public final boolean getForbidAppendItem() {
        return this.aa;
    }

    public final com.ss.android.ugc.aweme.story.interaction.b.g getMobEventParam() {
        return this.W;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleList f138518a;

        static {
            Covode.recordClassIndex(90612);
        }

        c(ReactionBubbleList reactionBubbleList) {
            this.f138518a = reactionBubbleList;
        }

        public final void run() {
            this.f138518a.r();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleList f138521a;

        static {
            Covode.recordClassIndex(90615);
        }

        f(ReactionBubbleList reactionBubbleList) {
            this.f138521a = reactionBubbleList;
        }

        public final void run() {
            this.f138521a.r();
        }
    }

    private void s() {
        f.a.b.b bVar = this.T;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final int getFirstDataPositionInState() {
        if (this.ab) {
            return 1;
        }
        return 0;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleList f138517a;

        static {
            Covode.recordClassIndex(90611);
        }

        b(ReactionBubbleList reactionBubbleList) {
            this.f138517a = reactionBubbleList;
        }

        public final void run() {
            ReactionBubbleList reactionBubbleList = this.f138517a;
            reactionBubbleList.d(reactionBubbleList.Q + 1);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleList f138519a;

        static {
            Covode.recordClassIndex(90613);
        }

        d(ReactionBubbleList reactionBubbleList) {
            this.f138519a = reactionBubbleList;
        }

        public final void run() {
            ReactionBubbleList reactionBubbleList = this.f138519a;
            reactionBubbleList.d(reactionBubbleList.Q + 1);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleList f138520a;

        static {
            Covode.recordClassIndex(90614);
        }

        e(ReactionBubbleList reactionBubbleList) {
            this.f138520a = reactionBubbleList;
        }

        public final void run() {
            this.f138520a.b(0);
            ReactionBubbleList reactionBubbleList = this.f138520a;
            reactionBubbleList.P = reactionBubbleList.getFirstDataPositionInState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.a.b.b bVar = this.T;
        if (bVar != null) {
            bVar.dispose();
        }
        this.T = null;
    }

    public final void q() {
        this.Q = -1;
        this.P = getFirstDataPositionInState();
        this.aa = true;
        this.R = false;
        setVisibility(4);
        s();
        b(0);
        getState().a();
    }

    public final void r() {
        this.aa = false;
        f.a.b.b bVar = this.T;
        if (bVar == null || bVar.isDisposed()) {
            setVisibility(0);
            this.T = h.a(TimeUnit.MILLISECONDS).b().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new g(this));
        }
    }

    public final void setBubbleListManager(com.ss.android.ugc.aweme.story.interaction.c.a aVar) {
        this.U = aVar;
    }

    public final void setForbidAppendItem(boolean z) {
        this.aa = z;
    }

    public final void setMobEventParam(com.ss.android.ugc.aweme.story.interaction.b.g gVar) {
        this.W = gVar;
    }

    @Override // com.ss.android.ugc.aweme.story.view.a
    public final void d(Comment comment) {
        l.d(comment, "");
        com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.U;
        if (aVar != null) {
            aVar.f137872c.q();
            aVar.f137871b.f34367c.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleList f138522a;

        static {
            Covode.recordClassIndex(90616);
        }

        g(ReactionBubbleList reactionBubbleList) {
            this.f138522a = reactionBubbleList;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!this.f138522a.R) {
                ReactionBubbleList reactionBubbleList = this.f138522a;
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                reactionBubbleList.a(0, h.g.a.a(TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics())));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.view.a
    public final boolean b(Comment comment) {
        l.d(comment, "");
        if (!this.R) {
            return false;
        }
        com.bytedance.ies.powerlist.b.a b2 = getState().b(this.Q);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.interaction.item.ReactionBubbleCommentItem");
        if (!((com.ss.android.ugc.aweme.story.interaction.b.a) b2).f137843b) {
            this.R = false;
            return false;
        }
        getState().b(this.Q, new com.ss.android.ugc.aweme.story.interaction.b.a(comment, true, this.W));
        r();
        this.Q = -1;
        this.R = false;
        return true;
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

    @Override // com.ss.android.ugc.aweme.story.view.a
    public final boolean a(Comment comment) {
        l.d(comment, "");
        com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.U;
        if (aVar == null || !aVar.a()) {
            return false;
        }
        setVisibility(0);
        s();
        if (this.P == 0 || (getState().b(this.P - 1) instanceof com.ss.android.ugc.aweme.story.interaction.b.a) || (getState().b(this.P - 1) instanceof com.ss.android.ugc.aweme.story.interaction.b.f)) {
            getState().a(this.P, com.ss.android.ugc.aweme.story.interaction.b.b.a(comment, this.W));
        } else {
            getState().a(getFirstDataPositionInState(), com.ss.android.ugc.aweme.story.interaction.b.b.a(comment, this.W));
        }
        postDelayed(new c(this), 80);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.view.a
    public final void b(String str) {
        l.d(str, "");
        if (this.R && getState() != null && getState().b() != 0) {
            com.bytedance.ies.powerlist.b.a b2 = getState().b(this.Q);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.interaction.item.ReactionBubbleCommentItem");
            com.ss.android.ugc.aweme.story.interaction.b.a aVar = (com.ss.android.ugc.aweme.story.interaction.b.a) b2;
            if (!aVar.f137843b) {
                this.R = false;
                return;
            }
            Comment comment = new Comment();
            comment.setUser(aVar.f137842a.getUser());
            comment.setText(aVar.f137842a.getText() + str);
            getState().b(this.Q, new com.ss.android.ugc.aweme.story.interaction.b.a(comment, true, this.W));
            postDelayed(new b(this), 40);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.view.a
    public final void c(Comment comment) {
        l.d(comment, "");
        String fakeId = comment.getFakeId();
        l.b(fakeId, "");
        if (!TextUtils.isEmpty(fakeId)) {
            int i2 = 0;
            for (com.bytedance.ies.powerlist.b.a aVar : getState().c()) {
                if (!(aVar instanceof com.ss.android.ugc.aweme.story.interaction.b.a) || !l.a((Object) ((com.ss.android.ugc.aweme.story.interaction.b.a) aVar).f137842a.getFakeId(), (Object) fakeId)) {
                    i2++;
                } else if (i2 >= 0) {
                    com.bytedance.ies.powerlist.b.a b2 = getState().b(i2);
                    if (b2 instanceof com.ss.android.ugc.aweme.story.interaction.b.a) {
                        getState().b(i2, new com.ss.android.ugc.aweme.story.interaction.b.a(comment, ((com.ss.android.ugc.aweme.story.interaction.b.a) b2).f137843b, this.W));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void d(boolean z) {
        this.ab = z;
        this.P = getFirstDataPositionInState();
        ViewGroup.LayoutParams layoutParams = this.V.getLayoutParams();
        if (z) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 192.0f, system.getDisplayMetrics()));
        } else {
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 240.0f, system2.getDisplayMetrics()));
        }
        this.V.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.story.view.a
    public final boolean a(String str) {
        l.d(str, "");
        if (this.aa || this.R) {
            return false;
        }
        getState().b();
        setVisibility(0);
        this.R = true;
        s();
        this.Q = this.P;
        Comment comment = new Comment();
        comment.setUser(in.c());
        comment.setText(str);
        getState().a(this.Q, new com.ss.android.ugc.aweme.story.interaction.b.a(comment, true, this.W));
        getState().b();
        postDelayed(new d(this), 40);
        return true;
    }

    private /* synthetic */ ReactionBubbleList(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ReactionBubbleList(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        a(new com.ss.android.ugc.aweme.friends.a.d(0, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())), 1));
        setHasFixedSize(true);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b2i, this, false);
        l.b(a2, "");
        this.V = a2;
        a2.setTag(2);
        i(a2);
        View a3 = com.a.a(LayoutInflater.from(context), R.layout.b2i, this, false);
        j(a3);
        l.b(a3, "");
        a3.setTag(2);
        setItemAnimator(null);
        this.aa = true;
        this.Q = -1;
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
                                this.aa = true;
                                s();
                                postDelayed(new e(this), 40);
                                postDelayed(new f(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
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
                                        this.P = i7;
                                        if (i7 > getState().b()) {
                                            this.P = getState().b();
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
