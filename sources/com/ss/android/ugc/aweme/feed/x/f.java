package com.ss.android.ugc.aweme.feed.x;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.feed.x.r;
import h.f.b.l;

public final class f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f95326e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f95327a;

    /* renamed from: b  reason: collision with root package name */
    public int f95328b = i.c(this.f95330d);

    /* renamed from: c  reason: collision with root package name */
    public r.a f95329c;

    /* renamed from: d  reason: collision with root package name */
    public Context f95330d;

    static {
        Covode.recordClassIndex(60372);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60373);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f(r.a aVar, Context context) {
        l.d(context, "");
        this.f95329c = aVar;
        this.f95330d = context;
        this.f95327a = i.f(context) - (i.e(this.f95330d) * 2);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(x) > Math.abs(y)) {
            if (Math.abs(x) <= 100.0f || Math.abs(f2) <= 100.0f) {
                return false;
            }
            if (x > 0.0f) {
                r.a aVar = this.f95329c;
                if (aVar == null) {
                    return false;
                }
                aVar.a(4);
                return false;
            }
            r.a aVar2 = this.f95329c;
            if (aVar2 == null) {
                return false;
            }
            aVar2.a(3);
            return false;
        } else if (Math.abs(y) <= 100.0f || Math.abs(f3) <= 100.0f) {
            return false;
        } else {
            if (y > 0.0f) {
                r.a aVar3 = this.f95329c;
                if (aVar3 == null) {
                    return false;
                }
                aVar3.a(2);
                return false;
            }
            r.a aVar4 = this.f95329c;
            if (aVar4 == null) {
                return false;
            }
            aVar4.a(1);
            return false;
        }
    }
}
