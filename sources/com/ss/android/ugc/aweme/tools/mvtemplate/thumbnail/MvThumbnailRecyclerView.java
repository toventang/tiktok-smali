package com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.g;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class MvThumbnailRecyclerView extends RecyclerView {
    final int O;
    int P;

    static {
        Covode.recordClassIndex(92014);
    }

    public MvThumbnailRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getMScrollX() {
        return this.P;
    }

    public final int getCurrentPosition() {
        return this.P / this.O;
    }

    public final float getOffset() {
        int i2 = this.O;
        return (((float) this.P) % ((float) i2)) / ((float) i2);
    }

    public final void setMScrollX(int i2) {
        this.P = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            c.a(new g(g.b.START, g.a.ICON_LIST));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    public final void a(int i2, float f2, boolean z) {
        if (f2 > 0.99f) {
            f2 = 1.0f;
        }
        float f3 = ((((float) i2) + f2) * ((float) this.O)) - ((float) this.P);
        if (z) {
            a((int) f3, 0);
        } else {
            scrollBy((int) f3, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.O = b.a(context);
        int i2 = Build.VERSION.SDK_INT;
        setLayoutDirection(0);
        setLayoutManager(new LinearLayoutManager(0, false));
        a(new RecyclerView.n(this) {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MvThumbnailRecyclerView f140908a;

            static {
                Covode.recordClassIndex(92015);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f140908a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                l.d(recyclerView, "");
                super.a(recyclerView, i2);
                if (i2 == 0) {
                    MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f140908a;
                    int i3 = mvThumbnailRecyclerView.P % mvThumbnailRecyclerView.O;
                    if (i3 <= mvThumbnailRecyclerView.O / 2) {
                        mvThumbnailRecyclerView.a(-i3, 0);
                    } else {
                        mvThumbnailRecyclerView.a(mvThumbnailRecyclerView.O - i3, 0);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                l.d(recyclerView, "");
                super.a(recyclerView, i2, i3);
                MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f140908a;
                mvThumbnailRecyclerView.setMScrollX(mvThumbnailRecyclerView.getMScrollX() + i2);
                c.a(new g(g.b.SCROLL, g.a.ICON_LIST, this.f140908a.getCurrentPosition(), this.f140908a.getOffset()));
            }
        });
        addOnAttachStateChangeListener(new f());
    }
}
