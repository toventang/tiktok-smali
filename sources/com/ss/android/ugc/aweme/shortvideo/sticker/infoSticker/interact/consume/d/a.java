package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d;

import android.app.Activity;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a implements View.OnTouchListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public float f130328a;

    /* renamed from: b  reason: collision with root package name */
    public float f130329b;

    /* renamed from: c  reason: collision with root package name */
    public int f130330c;

    /* renamed from: d  reason: collision with root package name */
    public int f130331d;

    /* renamed from: e  reason: collision with root package name */
    public int f130332e;

    /* renamed from: f  reason: collision with root package name */
    public int f130333f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f130334g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f130335h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f130336i;

    /* renamed from: j  reason: collision with root package name */
    public MotionEvent f130337j;

    /* renamed from: k  reason: collision with root package name */
    public MotionEvent f130338k;

    /* renamed from: l  reason: collision with root package name */
    public int f130339l = -1;

    /* renamed from: m  reason: collision with root package name */
    public WeakHandler f130340m = new WeakHandler(this);
    public final Activity n;
    public List<c> o;
    public j p;
    public g q;
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a r;

    static {
        Covode.recordClassIndex(85482);
    }

    public final void a(List<c> list) {
        l.d(list, "");
        this.o = list;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer valueOf;
        long j2;
        if (message != null && (valueOf = Integer.valueOf(message.what)) != null && valueOf.intValue() == 0) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a aVar = this.r;
            g gVar = this.q;
            if (gVar != null) {
                j2 = gVar.av();
            } else {
                j2 = 0;
            }
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.MotionEvent");
            aVar.a(j2, (MotionEvent) obj);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WeakHandler weakHandler;
        Message obtainMessage;
        long j2;
        long j3;
        WeakHandler weakHandler2;
        Integer num = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        }
        long j4 = 0;
        if (num != null) {
            if (num.intValue() == 0) {
                WeakHandler weakHandler3 = this.f130340m;
                if (!(weakHandler3 == null || !weakHandler3.hasMessages(0) || (weakHandler2 = this.f130340m) == null)) {
                    weakHandler2.removeMessages(0);
                }
                MotionEvent motionEvent2 = this.f130337j;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f130337j = MotionEvent.obtain(motionEvent);
                this.f130335h = true;
                this.f130334g = true;
                this.f130328a = motionEvent.getX();
                this.f130329b = motionEvent.getY();
                this.f130339l = -1;
                for (T t : this.o) {
                    e eVar = t.f130346d;
                    g gVar = this.q;
                    if (gVar != null) {
                        j3 = gVar.av();
                    } else {
                        j3 = 0;
                    }
                    if (eVar.a(j3, t.f130346d.b(), motionEvent.getX(), motionEvent.getY())) {
                        this.f130339l = t.f130346d.b();
                        j jVar = this.p;
                        if (!(jVar == null || jVar.o == null)) {
                            t.f130346d.b();
                        }
                        return true;
                    }
                }
                return false;
            } else if (num.intValue() == 2) {
                int x = (int) (motionEvent.getX() - this.f130328a);
                int y = (int) (motionEvent.getY() - this.f130329b);
                int i2 = (x * x) + (y * y);
                if (i2 > this.f130332e || Math.abs(x) >= this.f130331d) {
                    this.f130335h = false;
                    WeakHandler weakHandler4 = this.f130340m;
                    if (weakHandler4 != null) {
                        weakHandler4.removeMessages(0);
                    }
                }
                if (i2 > this.f130333f) {
                    this.f130334g = false;
                }
            } else if (num.intValue() == 1 && this.f130335h) {
                this.f130336i = false;
                MotionEvent motionEvent3 = this.f130337j;
                MotionEvent motionEvent4 = this.f130338k;
                if (!(motionEvent3 == null || motionEvent4 == null || motionEvent == null || !this.f130334g)) {
                    long eventTime = motionEvent.getEventTime() - motionEvent4.getEventTime();
                    if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                        int x2 = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                        int y2 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                        if ((x2 * x2) + (y2 * y2) < this.f130333f) {
                            this.f130336i = true;
                            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a aVar = this.r;
                            g gVar2 = this.q;
                            if (gVar2 != null) {
                                j2 = gVar2.av();
                            } else {
                                j2 = 0;
                            }
                            aVar.b(j2, this.f130337j);
                        }
                    }
                }
                if (!(this.f130336i || this.f130337j == null || motionEvent == null || !this.f130335h || (weakHandler = this.f130340m) == null || (obtainMessage = weakHandler.obtainMessage(0)) == null)) {
                    obtainMessage.obj = this.f130337j;
                    WeakHandler weakHandler5 = this.f130340m;
                    if (weakHandler5 != null) {
                        long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                        MotionEvent motionEvent5 = this.f130337j;
                        if (motionEvent5 != null) {
                            j4 = motionEvent5.getEventTime();
                        }
                        weakHandler5.sendMessageDelayed(obtainMessage, doubleTapTimeout + j4);
                    }
                }
                MotionEvent motionEvent6 = this.f130338k;
                if (motionEvent6 != null) {
                    motionEvent6.recycle();
                }
                this.f130338k = MotionEvent.obtain(motionEvent);
            }
        }
        return false;
    }

    public a(Activity activity, List<c> list, j jVar, g gVar, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a aVar) {
        l.d(activity, "");
        l.d(list, "");
        l.d(aVar, "");
        this.n = activity;
        this.o = list;
        this.p = jVar;
        this.q = gVar;
        this.r = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(activity);
        l.b(viewConfiguration, "");
        this.f130330c = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(activity);
        l.b(viewConfiguration2, "");
        int scaledTouchSlop = viewConfiguration2.getScaledTouchSlop() * 3;
        this.f130331d = scaledTouchSlop;
        this.f130332e = scaledTouchSlop * scaledTouchSlop;
        int i2 = this.f130330c;
        this.f130333f = i2 * i2;
    }
}
