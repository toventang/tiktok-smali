package com.ss.android.ugc.aweme.tools.mvtemplate.view.preview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class ScrollListenerView extends HorizontalScrollView {

    /* renamed from: b  reason: collision with root package name */
    public static int f140970b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final a f140971c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f140972a;

    /* renamed from: d  reason: collision with root package name */
    private b f140973d;

    /* renamed from: e  reason: collision with root package name */
    private int f140974e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f140975f = new Handler(Looper.getMainLooper(), new c(this));

    public interface b {
        static {
            Covode.recordClassIndex(92037);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92036);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final b getOnScrollListener() {
        return this.f140973d;
    }

    public final void a() {
        this.f140975f.removeMessages(1);
        this.f140975f.sendEmptyMessageDelayed(1, 80);
    }

    static {
        Covode.recordClassIndex(92035);
    }

    public final void setOnScrollListener(b bVar) {
        this.f140973d = bVar;
    }

    public final void setScrollState(int i2) {
        if (this.f140974e != i2) {
            this.f140974e = i2;
        }
    }

    public static final class c implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollListenerView f140976a;

        /* renamed from: b  reason: collision with root package name */
        private int f140977b = Integer.MIN_VALUE;

        static {
            Covode.recordClassIndex(92038);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ScrollListenerView scrollListenerView) {
            this.f140976a = scrollListenerView;
        }

        public final boolean handleMessage(Message message) {
            l.d(message, "");
            if (message.what != 1) {
                return false;
            }
            int scrollY = this.f140976a.getScrollY();
            if (this.f140976a.f140972a || this.f140977b != scrollY) {
                this.f140977b = scrollY;
                this.f140976a.a();
            } else {
                this.f140977b = Integer.MIN_VALUE;
                this.f140976a.setScrollState(0);
            }
            return true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    private final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f140972a = false;
            a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            this.f140972a = true;
        }
        a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ScrollListenerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6661);
        MethodCollector.o(6661);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (this.f140972a) {
            setScrollState(1);
            return;
        }
        setScrollState(f140970b);
        a();
    }
}
