package com.ss.android.ugc.aweme.im.sdk.chat.ui.d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2518a f101204d = new C2518a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f101205a;

    /* renamed from: b  reason: collision with root package name */
    public List<View.OnTouchListener> f101206b;

    /* renamed from: c  reason: collision with root package name */
    public final View f101207c;

    static {
        Covode.recordClassIndex(64747);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a$a  reason: collision with other inner class name */
    public static final class C2518a {
        static {
            Covode.recordClassIndex(64748);
        }

        private C2518a() {
        }

        public /* synthetic */ C2518a(byte b2) {
            this();
        }

        public static a a(View view) {
            l.d(view, "");
            return new a(view, (byte) 0);
        }
    }

    private a(View view) {
        this.f101207c = view;
        this.f101206b = new ArrayList();
    }

    public final void a(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            com.ss.android.ugc.aweme.im.service.m.a.d("ContentViewContainer", "ContentViewContainer setOnClick null? why?");
        }
        this.f101205a = onClickListener;
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        this.f101207c.setOnLongClickListener(onLongClickListener);
    }

    public final void a(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            List<View.OnTouchListener> list = this.f101206b;
            if (!list.contains(onTouchListener)) {
                list.add(onTouchListener);
            }
        }
    }

    public /* synthetic */ a(View view, byte b2) {
        this(view);
    }

    public final void a(int i2, Object obj) {
        this.f101207c.setTag(i2, obj);
    }

    public static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GestureDetector f101209b;

        static {
            Covode.recordClassIndex(64749);
        }

        public b(a aVar, GestureDetector gestureDetector) {
            this.f101208a = aVar;
            this.f101209b = gestureDetector;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean onTouchEvent = this.f101209b.onTouchEvent(motionEvent);
            Iterator<T> it = this.f101208a.f101206b.iterator();
            while (it.hasNext()) {
                it.next().onTouch(view, motionEvent);
            }
            return onTouchEvent;
        }
    }
}
