package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.h;

public final class FeedAdInteractiveClickView extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65894a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private float f65895b;

    /* renamed from: c  reason: collision with root package name */
    private float f65896c;

    static {
        Covode.recordClassIndex(40550);
    }

    public FeedAdInteractiveClickView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40551);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Integer.valueOf(motionEvent.getAction());
        }
        if (motionEvent == null) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && a(this.f65895b, this.f65896c, x, y)) {
                if (!h.a(getCoreAreaXRange(), this.f65895b) || !h.a(getCoreAreaYRange(), this.f65896c)) {
                    d interactiveListener = getInteractiveListener();
                    if (interactiveListener != null) {
                        interactiveListener.k();
                    }
                } else {
                    d interactiveListener2 = getInteractiveListener();
                    if (interactiveListener2 != null) {
                        interactiveListener2.h();
                    }
                }
            }
            return false;
        }
        this.f65895b = x;
        this.f65896c = y;
        return true;
    }

    private /* synthetic */ FeedAdInteractiveClickView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveClickView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
