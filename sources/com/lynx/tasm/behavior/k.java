package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f55906a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<l> f55907b;

    /* renamed from: c  reason: collision with root package name */
    public LynxBaseUI f55908c;

    /* renamed from: d  reason: collision with root package name */
    public LynxBaseUI f55909d;

    /* renamed from: e  reason: collision with root package name */
    public LynxBaseUI f55910e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b> f55911f;

    /* renamed from: g  reason: collision with root package name */
    private float f55912g;

    /* renamed from: h  reason: collision with root package name */
    private float f55913h;

    /* renamed from: i  reason: collision with root package name */
    private float f55914i;

    /* renamed from: j  reason: collision with root package name */
    private float f55915j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Float> f55916k;

    /* renamed from: l  reason: collision with root package name */
    private float f55917l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f55918m;
    private boolean n;

    static {
        Covode.recordClassIndex(34945);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Rect f55919a;

        /* renamed from: b  reason: collision with root package name */
        public Rect f55920b;

        /* renamed from: c  reason: collision with root package name */
        public Rect f55921c;

        /* renamed from: d  reason: collision with root package name */
        public float f55922d;

        /* renamed from: e  reason: collision with root package name */
        public double f55923e;

        /* renamed from: f  reason: collision with root package name */
        public String f55924f;

        static {
            Covode.recordClassIndex(34946);
        }

        private a() {
        }

        public final void a() {
            if (this.f55921c == null) {
                this.f55922d = 0.0f;
                return;
            }
            float width = (float) (this.f55920b.width() * this.f55920b.height());
            float width2 = (float) (this.f55921c.width() * this.f55921c.height());
            if (width > 0.0f) {
                this.f55922d = width2 / width;
            } else {
                this.f55922d = 0.0f;
            }
        }

        public final JavaOnlyMap b() {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putMap("relativeRect", a(this.f55919a));
            javaOnlyMap.putMap("boundingClientRect", a(this.f55920b));
            javaOnlyMap.putMap("intersectionRect", a(this.f55921c));
            javaOnlyMap.putDouble("intersectionRatio", (double) this.f55922d);
            javaOnlyMap.putDouble("time", this.f55923e);
            javaOnlyMap.putString("observerId", this.f55924f);
            return javaOnlyMap;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        private static JavaOnlyMap a(Rect rect) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (rect != null) {
                javaOnlyMap.putDouble("left", (double) Math.round((float) rect.left));
                javaOnlyMap.putDouble("right", (double) Math.round((float) rect.right));
                javaOnlyMap.putDouble("top", (double) Math.round((float) rect.top));
                javaOnlyMap.putDouble("bottom", (double) Math.round((float) rect.bottom));
            } else {
                javaOnlyMap.putDouble("left", 0.0d);
                javaOnlyMap.putDouble("right", 0.0d);
                javaOnlyMap.putDouble("top", 0.0d);
                javaOnlyMap.putDouble("bottom", 0.0d);
            }
            return javaOnlyMap;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public LynxBaseUI f55925a;

        /* renamed from: b  reason: collision with root package name */
        public int f55926b;

        /* renamed from: c  reason: collision with root package name */
        public a f55927c;

        static {
            Covode.recordClassIndex(34947);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a() {
        if (this.f55911f.size() != 0) {
            Rect b2 = b();
            Iterator<b> it = this.f55911f.iterator();
            while (it.hasNext()) {
                a(it.next(), b2, false);
            }
        }
    }

    public final Rect b() {
        Rect boundingClientRect;
        LynxBaseUI lynxBaseUI = this.f55910e;
        if (lynxBaseUI != null) {
            boundingClientRect = lynxBaseUI.getBoundingClientRect();
        } else {
            boundingClientRect = this.f55907b.get().a().f55901i.getBoundingClientRect();
        }
        boundingClientRect.left = (int) (((float) boundingClientRect.left) - this.f55912g);
        boundingClientRect.right = (int) (((float) boundingClientRect.right) + this.f55913h);
        boundingClientRect.top = (int) (((float) boundingClientRect.top) - this.f55914i);
        boundingClientRect.bottom = (int) (((float) boundingClientRect.bottom) + this.f55915j);
        return boundingClientRect;
    }

    public final void a(ReadableMap readableMap) {
        this.f55912g = (float) readableMap.getDouble("left", 0.0d);
        this.f55913h = (float) readableMap.getDouble("right", 0.0d);
        this.f55914i = (float) readableMap.getDouble("top", 0.0d);
        this.f55915j = (float) readableMap.getDouble("bottom", 0.0d);
    }

    private boolean a(a aVar, a aVar2) {
        float f2;
        boolean z;
        boolean z2;
        float f3 = -1.0f;
        if (aVar == null || aVar.f55921c == null) {
            f2 = -1.0f;
        } else {
            f2 = aVar.f55922d;
        }
        if (aVar2.f55921c != null) {
            f3 = aVar2.f55922d;
        }
        if (f2 == f3) {
            return false;
        }
        Iterator<Float> it = this.f55916k.iterator();
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            if (floatValue == f2 || floatValue == f3) {
                return true;
            }
            if (floatValue < f2) {
                z = true;
            } else {
                z = false;
            }
            if (floatValue < f3) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z != z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Rect a(com.lynx.tasm.behavior.ui.LynxBaseUI r11, android.graphics.Rect r12, android.graphics.Rect r13) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.k.a(com.lynx.tasm.behavior.ui.LynxBaseUI, android.graphics.Rect, android.graphics.Rect):android.graphics.Rect");
    }

    public k(l lVar, ReadableMap readableMap, LynxBaseUI lynxBaseUI) {
        this(lVar, -1, -1, readableMap);
        this.f55908c = lynxBaseUI;
        LynxBaseUI lynxBaseUI2 = null;
        String string = readableMap.getString("relativeToIdSelector", null);
        this.f55912g = (float) readableMap.getDouble("marginLeft", 0.0d);
        this.f55913h = (float) readableMap.getDouble("marginRight", 0.0d);
        this.f55914i = (float) readableMap.getDouble("marginTop", 0.0d);
        this.f55915j = (float) readableMap.getDouble("marginBottom", 0.0d);
        if (string != null && string.startsWith("#")) {
            q qVar = this.f55907b.get().a().f55902j.get();
            String substring = string.substring(1);
            LynxBaseUI lynxBaseUI3 = this.f55908c;
            while (true) {
                if (lynxBaseUI3 != null && lynxBaseUI3.mIdSelector != null && lynxBaseUI3.mIdSelector.equals(substring)) {
                    lynxBaseUI2 = lynxBaseUI3;
                    break;
                }
                if (!qVar.f55933c.r) {
                    lynxBaseUI3 = lynxBaseUI3 instanceof LynxFlattenUI ? lynxBaseUI3.getParentBaseUI() : lynxBaseUI3;
                    if (!(lynxBaseUI3 instanceof UIGroup)) {
                        break;
                    }
                }
                lynxBaseUI3 = lynxBaseUI3.getParentBaseUI();
            }
            this.f55910e = lynxBaseUI2;
        }
        this.n = true;
        b bVar = new b((byte) 0);
        bVar.f55925a = lynxBaseUI;
        this.f55911f.add(bVar);
        a(bVar, b(), true);
    }

    public final void a(b bVar, Rect rect, boolean z) {
        String str;
        l lVar = this.f55907b.get();
        if (this.f55907b != null) {
            Rect boundingClientRect = bVar.f55925a.getBoundingClientRect();
            Rect a2 = a(bVar.f55925a, boundingClientRect, rect);
            a aVar = new a((byte) 0);
            aVar.f55920b = boundingClientRect;
            aVar.f55919a = rect;
            aVar.f55921c = a2;
            aVar.f55923e = 0.0d;
            if (bVar.f55925a == null || bVar.f55925a.mIdSelector == null) {
                str = "";
            } else {
                str = bVar.f55925a.mIdSelector;
            }
            aVar.f55924f = str;
            aVar.a();
            a aVar2 = bVar.f55927c;
            bVar.f55927c = aVar;
            int i2 = bVar.f55926b;
            if (z) {
                if (this.f55917l >= aVar.f55922d) {
                    return;
                }
            } else if (!a(aVar2, aVar)) {
                return;
            }
            if (this.n) {
                lVar.a(this.f55908c.getSign(), aVar.b());
            } else {
                lVar.a(this.f55906a, i2, aVar.b());
            }
        }
    }

    public k(l lVar, int i2, int i3, ReadableMap readableMap) {
        LynxBaseUI lynxBaseUI;
        WeakReference<l> weakReference = new WeakReference<>(lVar);
        this.f55907b = weakReference;
        this.f55906a = i2;
        if (i3 != -1) {
            q qVar = weakReference.get().a().f55902j.get();
            if (qVar != null) {
                lynxBaseUI = qVar.b(i3);
            } else {
                lynxBaseUI = null;
            }
            this.f55909d = lynxBaseUI;
        } else {
            this.f55909d = weakReference.get().a().f55901i;
        }
        this.f55916k = new ArrayList<>();
        ReadableArray array = readableMap.getArray("thresholds");
        if (array != null) {
            for (int i4 = 0; i4 < array.size(); i4++) {
                this.f55916k.add(Float.valueOf((float) array.getDouble(i4)));
            }
        } else {
            this.f55916k.add(Float.valueOf(0.0f));
        }
        this.f55917l = (float) readableMap.getDouble("initialRatio", 0.0d);
        this.f55918m = readableMap.getBoolean("observeAll", false);
        this.f55911f = new ArrayList<>();
        this.n = false;
    }
}
