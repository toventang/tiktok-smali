package com.lynx.tasm.behavior;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.c;
import com.lynx.tasm.c.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public com.lynx.tasm.behavior.a.a f56469a;

    /* renamed from: b  reason: collision with root package name */
    public com.lynx.tasm.behavior.a.a f56470b;

    /* renamed from: c  reason: collision with root package name */
    public float f56471c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f56472d;

    /* renamed from: e  reason: collision with root package name */
    final HashSet<Integer> f56473e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private q f56474f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector f56475g = new GestureDetector(this.f56474f.f55933c, new a(this, (byte) 0), new Handler(Looper.getMainLooper()));

    /* renamed from: h  reason: collision with root package name */
    private LinkedList<com.lynx.tasm.behavior.a.a> f56476h = new LinkedList<>();

    /* renamed from: i  reason: collision with root package name */
    private PointF f56477i = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);

    /* renamed from: j  reason: collision with root package name */
    private boolean f56478j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56479k;

    /* renamed from: l  reason: collision with root package name */
    private PointF f56480l;

    static {
        Covode.recordClassIndex(35239);
    }

    private c c() {
        return this.f56474f.f55933c.f55897e;
    }

    private void b() {
        Iterator<com.lynx.tasm.behavior.a.a> it = this.f56476h.iterator();
        while (it.hasNext()) {
            it.next().offResponseChain();
        }
        this.f56476h.clear();
        this.f56473e.clear();
    }

    private void a() {
        this.f56476h.clear();
        com.lynx.tasm.behavior.a.a aVar = this.f56469a;
        if (aVar != null) {
            do {
                this.f56476h.push(aVar);
                aVar = aVar.parent();
            } while (aVar != null);
            while (!this.f56476h.isEmpty() && (this.f56476h.getLast().getEvents() == null || !this.f56476h.getLast().getEvents().containsKey("click"))) {
                this.f56476h.removeLast();
            }
            Iterator<com.lynx.tasm.behavior.a.a> it = this.f56476h.iterator();
            while (it.hasNext()) {
                it.next().onResponseChain();
            }
            if (this.f56476h.isEmpty()) {
                this.f56479k = true;
            } else {
                this.f56479k = false;
            }
        }
    }

    class a extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(35240);
        }

        private a() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (w.this.f56469a != null) {
                w wVar = w.this;
                if (wVar.a(wVar.f56469a)) {
                    w wVar2 = w.this;
                    wVar2.a(wVar2.f56469a, "longpress", motionEvent.getX(), motionEvent.getY());
                }
            }
            super.onLongPress(motionEvent);
        }

        /* synthetic */ a(w wVar, byte b2) {
            this();
        }
    }

    public w(q qVar) {
        this.f56474f = qVar;
    }

    private void d(MotionEvent motionEvent) {
        if (this.f56472d || this.f56478j || !a(this.f56469a)) {
            LLog.b("Lynx", "not tap:" + this.f56472d + this.f56478j);
        } else {
            a(this.f56469a, "tap", motionEvent.getX(), motionEvent.getY());
        }
    }

    private void c(MotionEvent motionEvent) {
        Object obj;
        if (this.f56479k || this.f56472d || this.f56476h.isEmpty() || this.f56476h.getLast() == null || !a(this.f56476h.getLast())) {
            StringBuilder append = new StringBuilder("not click:").append(this.f56479k).append(this.f56472d);
            LinkedList<com.lynx.tasm.behavior.a.a> linkedList = this.f56476h;
            if (linkedList != null) {
                obj = Boolean.valueOf(linkedList.isEmpty());
            } else {
                obj = "";
            }
            LLog.b("Lynx", append.append(obj).toString());
            return;
        }
        a(this.f56476h.getLast(), "click", motionEvent.getX(), motionEvent.getY());
    }

    private boolean e(MotionEvent motionEvent) {
        q qVar = this.f56474f;
        if (qVar == null || qVar.f55932b == null) {
            return true;
        }
        LinkedList linkedList = new LinkedList();
        for (com.lynx.tasm.behavior.a.a b2 = b(motionEvent, this.f56474f.f55932b); b2 != null; b2 = b2.parent()) {
            linkedList.push(b2);
        }
        if (linkedList.size() < this.f56476h.size()) {
            return true;
        }
        for (int i2 = 0; i2 < this.f56476h.size(); i2++) {
            com.lynx.tasm.behavior.a.a aVar = this.f56476h.get(i2);
            if (aVar == null || aVar != linkedList.get(i2)) {
                return true;
            }
        }
        return false;
    }

    private void a(MotionEvent motionEvent) {
        this.f56478j = false;
        this.f56477i = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f56472d = false;
        this.f56480l = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f56473e.clear();
    }

    private boolean b(MotionEvent motionEvent) {
        PointF pointF = this.f56480l;
        if (pointF == null) {
            this.f56480l = new PointF(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        boolean z = false;
        if (pointF.x == motionEvent.getX() && this.f56480l.y == motionEvent.getY()) {
            return false;
        }
        PointF pointF2 = this.f56477i;
        if (pointF2 == null || Math.abs(pointF2.x - motionEvent.getX()) > this.f56471c || Math.abs(this.f56477i.y - motionEvent.getY()) > this.f56471c) {
            this.f56478j = true;
        }
        if (this.f56472d || ((!this.f56476h.isEmpty() && !a(this.f56476h.getLast())) || this.f56479k || e(motionEvent))) {
            z = true;
        }
        this.f56479k = z;
        this.f56480l.x = motionEvent.getX();
        this.f56480l.y = motionEvent.getY();
        return true;
    }

    public final boolean a(com.lynx.tasm.behavior.a.a aVar) {
        if (aVar == null) {
            return false;
        }
        HashSet<Integer> hashSet = this.f56473e;
        if (hashSet == null || hashSet.isEmpty()) {
            return true;
        }
        Boolean bool = true;
        while (true) {
            if (aVar.parent() != aVar) {
                if (!this.f56473e.contains(Integer.valueOf(aVar.getSign()))) {
                    aVar = aVar.parent();
                    if (aVar == null) {
                        break;
                    }
                } else {
                    bool = false;
                    break;
                }
            } else {
                break;
            }
        }
        return bool.booleanValue();
    }

    private com.lynx.tasm.behavior.a.a b(MotionEvent motionEvent, UIGroup uIGroup) {
        if (uIGroup == null) {
            uIGroup = this.f56474f.f55932b;
        }
        return uIGroup.hitTest(motionEvent.getX(), motionEvent.getY());
    }

    private i.a a(com.lynx.tasm.behavior.a.a aVar, i.a aVar2) {
        if (!(aVar instanceof LynxBaseUI)) {
            return aVar2;
        }
        Rect boundingClientRect = this.f56474f.f55932b.getBoundingClientRect();
        Rect boundingClientRect2 = ((LynxBaseUI) aVar).getBoundingClientRect();
        return new i.a(((float) (boundingClientRect.left - boundingClientRect2.left)) + aVar2.f56500a, ((float) (boundingClientRect.top - boundingClientRect2.top)) + aVar2.f56501b);
    }

    public final boolean a(MotionEvent motionEvent, UIGroup uIGroup) {
        boolean z;
        boolean z2;
        q qVar;
        if (motionEvent.getActionMasked() == 0) {
            this.f56469a = b(motionEvent, uIGroup);
            a(motionEvent);
            a();
            a(this.f56469a, "touchstart", motionEvent.getX(), motionEvent.getY());
        } else if (this.f56469a != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (!this.f56469a.ignoreFocus() && !this.f56472d && a(this.f56469a)) {
                    com.lynx.tasm.behavior.a.a aVar = this.f56470b;
                    com.lynx.tasm.behavior.a.a aVar2 = this.f56469a;
                    this.f56470b = aVar2;
                    if (aVar2 != aVar) {
                        if (aVar2 != null && aVar2.isFocusable()) {
                            com.lynx.tasm.behavior.a.a aVar3 = this.f56469a;
                            if (aVar == null || !aVar.isFocusable()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            aVar3.onFocusChanged(true, z2);
                        }
                        if (aVar != null && aVar.isFocusable()) {
                            com.lynx.tasm.behavior.a.a aVar4 = this.f56469a;
                            if (aVar4 == null || !aVar4.isFocusable()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            aVar.onFocusChanged(false, z);
                        }
                    }
                }
                a(this.f56469a, "touchend", motionEvent.getX(), motionEvent.getY());
                c(motionEvent);
                d(motionEvent);
                b();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    a(this.f56469a, "touchcancel", motionEvent.getX(), motionEvent.getY());
                    b();
                }
            } else if (b(motionEvent)) {
                a(this.f56469a, "touchmove", motionEvent.getX(), motionEvent.getY());
            }
        }
        this.f56475g.onTouchEvent(motionEvent);
        com.lynx.tasm.behavior.a.a aVar5 = this.f56469a;
        if (aVar5 == null || (qVar = this.f56474f) == null || aVar5 == qVar.f55932b) {
            return false;
        }
        return true;
    }

    public final void a(com.lynx.tasm.behavior.a.a aVar, String str, float f2, float f3) {
        if (c() != null) {
            i.a aVar2 = new i.a(f2, f3);
            c().a(new i(aVar.getSign(), str, aVar2, aVar2, a(aVar, aVar2)));
            return;
        }
        LLog.a(4, "Lynx", "sendTouchEvent: eventEmitter null");
    }
}
