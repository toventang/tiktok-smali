package com.lynx.tasm.a.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.utils.g;
import com.lynx.tasm.behavior.ui.utils.h;
import com.lynx.tasm.behavior.ui.utils.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<LynxUI> f55604a;

    /* renamed from: b  reason: collision with root package name */
    HashMap<String, Object> f55605b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public ObjectAnimator[] f55606c = null;

    /* renamed from: d  reason: collision with root package name */
    public d f55607d = d.IDLE;

    /* renamed from: e  reason: collision with root package name */
    public com.lynx.tasm.a.b f55608e = null;

    /* renamed from: f  reason: collision with root package name */
    private e f55609f = new e((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f55610g;

    /* renamed from: h  reason: collision with root package name */
    private long f55611h = -1;

    /* renamed from: i  reason: collision with root package name */
    private b f55612i = null;

    /* renamed from: com.lynx.tasm.a.a.c$c  reason: collision with other inner class name */
    public interface AbstractC1256c {
        static {
            Covode.recordClassIndex(34819);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(34813);
    }

    static class f extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(34822);
        }

        private f() {
        }

        /* synthetic */ f(byte b2) {
            this();
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        long f55632a;

        static {
            Covode.recordClassIndex(34821);
        }

        private e() {
            this.f55632a = -1;
        }

        public final long a() {
            if (this.f55632a == -1) {
                return 0;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f55632a;
            this.f55632a = -1;
            return currentTimeMillis;
        }

        /* synthetic */ e(byte b2) {
            this();
        }
    }

    private View i() {
        return this.f55610g.get();
    }

    private BackgroundDrawable j() {
        com.lynx.tasm.behavior.ui.utils.a aVar;
        LynxUI c2 = c();
        if (c2 == null || (aVar = c2.mBackgroundManager) == null) {
            return null;
        }
        return aVar.f56412e;
    }

    public final boolean b() {
        if (this.f55607d == d.RUNNING) {
            return true;
        }
        return false;
    }

    public final LynxUI c() {
        return this.f55604a.get();
    }

    /* access modifiers changed from: package-private */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private static Map<String, Object> f55616b;

        /* renamed from: a  reason: collision with root package name */
        WeakReference<c> f55617a;

        static {
            Covode.recordClassIndex(34817);
            HashMap hashMap = new HashMap();
            f55616b = hashMap;
            hashMap.put("animation_type", "keyframe-animation");
            f55616b.put("animation_name", "");
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }

        public a(c cVar) {
            this.f55617a = new WeakReference<>(cVar);
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            if (animator != null) {
                animator.removeAllListeners();
            }
        }

        public final void onAnimationRepeat(Animator animator) {
            String str;
            super.onAnimationRepeat(animator);
            c cVar = this.f55617a.get();
            if (cVar != null) {
                com.lynx.tasm.a.b bVar = cVar.f55608e;
                if (bVar != null) {
                    str = bVar.f55633a;
                } else {
                    str = "";
                }
                a(cVar.c(), "animationiteration", str);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            String str;
            super.onAnimationEnd(animator);
            c cVar = this.f55617a.get();
            if (cVar != null) {
                com.lynx.tasm.a.b bVar = cVar.f55608e;
                if (bVar != null) {
                    str = bVar.f55633a;
                } else {
                    str = "";
                }
                if (cVar.b()) {
                    LynxUI c2 = cVar.c();
                    a(c2, "animationend", str);
                    b.f55602b = true;
                    for (String str2 : b.f55601a.keySet()) {
                        if (str.equals(str2)) {
                            b.f55601a.get(str2);
                        }
                    }
                    b.f55602b = false;
                    while (!b.f55603c.isEmpty()) {
                        b.f55603c.remove().run();
                    }
                    if (c2 != null) {
                        c2.onAnimationEnd(str);
                    }
                    cVar.f55607d = d.IDLE;
                }
                if (!(bVar == null || bVar.f55644l == 1 || bVar.f55644l == 3)) {
                    cVar.d();
                }
                cVar.f55606c = null;
            }
        }

        public static void a(LynxUI lynxUI, String str, String str2) {
            if (lynxUI != null && lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
                f55616b.put("animation_name", str2);
                lynxUI.mContext.f55897e.a(new com.lynx.tasm.c.b(lynxUI.getSign(), str, f55616b));
            }
        }
    }

    private boolean f() {
        LynxUI lynxUI = this.f55604a.get();
        if (!g() || lynxUI == null || !lynxUI.hasSizeChanged()) {
            return false;
        }
        return true;
    }

    private boolean g() {
        b bVar = this.f55612i;
        if (bVar != null && bVar.f55628k) {
            return true;
        }
        g gVar = c().mTransformOrigin;
        if (gVar == null || !gVar.e()) {
            return false;
        }
        return true;
    }

    public final void e() {
        int length;
        ObjectAnimator[] objectAnimatorArr = this.f55606c;
        if (objectAnimatorArr != null && (length = objectAnimatorArr.length) > 0) {
            objectAnimatorArr[length - 1].addListener(new a(this));
        }
    }

    /* renamed from: com.lynx.tasm.a.a.c$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55615a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 34816(0x8800, float:4.8788E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.tasm.a.a.c$d[] r0 = com.lynx.tasm.a.a.c.d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.a.a.c.AnonymousClass3.f55615a = r2
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.a.a.c.d.IDLE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.a.a.c.AnonymousClass3.f55615a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.a.a.c.d.CANCELED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.lynx.tasm.a.a.c.AnonymousClass3.f55615a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.a.a.c.d.PAUSED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.lynx.tasm.a.a.c.AnonymousClass3.f55615a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.a.a.c.d.RUNNING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.a.a.c.AnonymousClass3.<clinit>():void");
        }
    }

    private void h() {
        ObjectAnimator[] objectAnimatorArr = this.f55606c;
        if (objectAnimatorArr != null && objectAnimatorArr.length > 0) {
            int i2 = Build.VERSION.SDK_INT;
            for (ObjectAnimator objectAnimator : this.f55606c) {
                objectAnimator.cancel();
            }
        }
        this.f55608e = null;
        this.f55606c = null;
        this.f55607d = d.CANCELED;
    }

    public enum d {
        IDLE,
        RUNNING,
        PAUSED,
        CANCELED,
        DESTROYED;

        static {
            Covode.recordClassIndex(34820);
        }
    }

    public final void a() {
        h();
        d();
        this.f55607d = d.DESTROYED;
    }

    public final void d() {
        View i2 = i();
        LynxUI c2 = c();
        if (!(c2 == null || i2 == null)) {
            for (Map.Entry<String, Object> entry : this.f55605b.entrySet()) {
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1238332596:
                        if (!key.equals("Transform")) {
                            break;
                        } else {
                            c2.mBackgroundManager.a((List) entry.getValue());
                            break;
                        }
                    case 63357246:
                        if (!key.equals("Alpha")) {
                            break;
                        } else {
                            i2.setAlpha(((Float) entry.getValue()).floatValue());
                            break;
                        }
                    case 65290051:
                        if (!key.equals("Color")) {
                            break;
                        } else {
                            j().setColor(((Integer) entry.getValue()).intValue());
                            break;
                        }
                    case 290107061:
                        if (!key.equals("BackgroundColor")) {
                            break;
                        } else {
                            i2.setBackgroundColor(((Integer) entry.getValue()).intValue());
                            break;
                        }
                }
            }
        }
    }

    private void b(com.lynx.tasm.a.b bVar) {
        this.f55607d = d.PAUSED;
        if (this.f55606c != null) {
            int i2 = Build.VERSION.SDK_INT;
            for (ObjectAnimator objectAnimator : this.f55606c) {
                objectAnimator.pause();
            }
        }
        e eVar = this.f55609f;
        if (eVar.f55632a == -1) {
            eVar.f55632a = System.currentTimeMillis();
        }
        this.f55608e = bVar;
    }

    private void c(com.lynx.tasm.a.b bVar) {
        this.f55607d = d.RUNNING;
        if (this.f55606c != null) {
            int i2 = Build.VERSION.SDK_INT;
            for (ObjectAnimator objectAnimator : this.f55606c) {
                objectAnimator.resume();
            }
        }
        this.f55611h += this.f55609f.a();
        this.f55608e = bVar;
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<Keyframe> f55618a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<Keyframe> f55619b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Keyframe> f55620c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Keyframe> f55621d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<Keyframe> f55622e;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<Keyframe> f55623f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<Keyframe> f55624g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<Keyframe> f55625h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<Keyframe> f55626i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<Keyframe> f55627j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f55628k;

        /* renamed from: l  reason: collision with root package name */
        public boolean[] f55629l;

        /* renamed from: m  reason: collision with root package name */
        public boolean[] f55630m;
        PropertyValuesHolder[] n;
        PropertyValuesHolder[] o;

        static {
            Covode.recordClassIndex(34818);
        }

        private b() {
            this.f55618a = new ArrayList<>();
            this.f55619b = new ArrayList<>();
            this.f55620c = new ArrayList<>();
            this.f55621d = new ArrayList<>();
            this.f55622e = new ArrayList<>();
            this.f55623f = new ArrayList<>();
            this.f55624g = new ArrayList<>();
            this.f55625h = new ArrayList<>();
            this.f55626i = new ArrayList<>();
            this.f55627j = new ArrayList<>();
            this.f55628k = false;
            this.f55629l = new boolean[10];
            this.f55630m = new boolean[10];
        }

        /* synthetic */ b(c cVar, byte b2) {
            this();
        }
    }

    public final void a(com.lynx.tasm.a.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        PropertyValuesHolder[] propertyValuesHolderArr;
        long j2;
        View view;
        int i6;
        PropertyValuesHolder[] propertyValuesHolderArr2;
        PropertyValuesHolder a2;
        float f2;
        int i7;
        while (true) {
            if (this.f55608e != null) {
                bVar.f55633a.equals(this.f55608e.f55633a);
            }
            if (c() != null) {
                int i8 = AnonymousClass3.f55615a[this.f55607d.ordinal()];
                i2 = 3;
                i3 = 0;
                i4 = 1;
                if (i8 == 1 || i8 == 2) {
                    com.lynx.tasm.a.b bVar2 = this.f55608e;
                } else if (i8 != 3 && i8 != 4) {
                    return;
                } else {
                    if (!bVar.a(this.f55608e) || f()) {
                        com.lynx.tasm.a.b bVar3 = this.f55608e;
                        if (!bVar.b(bVar3) || bVar.n == bVar3.n) {
                            h();
                        } else if (this.f55607d == d.PAUSED) {
                            c(bVar);
                            return;
                        } else {
                            b(bVar);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        com.lynx.tasm.a.b bVar22 = this.f55608e;
        if ((bVar22 == null || !bVar.a(bVar22)) && bVar.f55634b > 0) {
            View i9 = i();
            LynxUI c2 = c();
            if (!(i9 == null || c2 == null)) {
                if (this.f55612i == null || f()) {
                    ReadableMap keyframes = c2.getKeyframes(bVar.f55633a);
                    if (keyframes != null) {
                        b bVar4 = new b(this, (byte) 0);
                        ReadableMapKeySetIterator keySetIterator = keyframes.keySetIterator();
                        loop1:
                        while (true) {
                            float f3 = 1.0f;
                            if (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                float parseFloat = Float.parseFloat(nextKey);
                                if (bVar.f55645m == i4 || bVar.f55645m == i2) {
                                    parseFloat = 1.0f - parseFloat;
                                }
                                ReadableMap map = keyframes.getMap(nextKey);
                                ReadableMapKeySetIterator keySetIterator2 = map.keySetIterator();
                                while (true) {
                                    if (keySetIterator2.hasNextKey()) {
                                        String nextKey2 = keySetIterator2.nextKey();
                                        if (nextKey2.equals("opacity")) {
                                            a("Alpha", Float.valueOf(i().getAlpha()));
                                            a(parseFloat, i3, bVar4);
                                            float f4 = (float) map.getDouble(nextKey2);
                                            if (f4 < 0.0f || f4 > f3) {
                                                break loop1;
                                            }
                                            bVar4.f55618a.add(Keyframe.ofFloat(parseFloat, f4));
                                        } else {
                                            if (nextKey2.equals("transform")) {
                                                a("Transform", c2.mTransformRaw);
                                                List<i> a3 = i.a(map.getArray(nextKey2));
                                                float latestWidth = (float) c2.mContext.f55901i.getLatestWidth();
                                                c2.mContext.f55901i.getLatestHeight();
                                                h a4 = h.a(a3, latestWidth, (float) c2.getLatestWidth(), (float) c2.getLatestHeight());
                                                if (a4 == null) {
                                                    break loop1;
                                                }
                                                if (i.a(a3)) {
                                                    i7 = 1;
                                                    bVar4.f55628k = true;
                                                } else {
                                                    i7 = 1;
                                                }
                                                for (i iVar : a3) {
                                                    int i10 = iVar.f56432a;
                                                    if (i10 != i7) {
                                                        if (i10 == 2) {
                                                            a(parseFloat, 1, bVar4);
                                                            bVar4.f55619b.add(Keyframe.ofFloat(parseFloat, a4.a()));
                                                        } else if (i10 == 4) {
                                                            a(parseFloat, 2, bVar4);
                                                            bVar4.f55620c.add(Keyframe.ofFloat(parseFloat, a4.b()));
                                                        } else if (i10 != 8) {
                                                            if (i10 != 16) {
                                                                if (i10 != 32) {
                                                                    if (i10 == 64) {
                                                                        a(parseFloat, 5, bVar4);
                                                                        bVar4.f55623f.add(Keyframe.ofFloat(parseFloat, a4.e()));
                                                                    } else if (i10 == 128) {
                                                                        a(parseFloat, 6, bVar4);
                                                                        bVar4.f55624g.add(Keyframe.ofFloat(parseFloat, a4.f()));
                                                                    } else if (i10 != 256) {
                                                                        if (i10 == 512) {
                                                                            a(parseFloat, 7, bVar4);
                                                                            bVar4.f55625h.add(Keyframe.ofFloat(parseFloat, a4.g()));
                                                                            a(parseFloat, 8, bVar4);
                                                                            bVar4.f55626i.add(Keyframe.ofFloat(parseFloat, a4.h()));
                                                                        } else if (i10 == 1024) {
                                                                            a(parseFloat, 7, bVar4);
                                                                            bVar4.f55625h.add(Keyframe.ofFloat(parseFloat, a4.g()));
                                                                        } else if (i10 == 2048) {
                                                                            a(parseFloat, 8, bVar4);
                                                                            bVar4.f55626i.add(Keyframe.ofFloat(parseFloat, a4.h()));
                                                                        }
                                                                    }
                                                                }
                                                                a(parseFloat, 4, bVar4);
                                                                bVar4.f55622e.add(Keyframe.ofFloat(parseFloat, a4.d()));
                                                            }
                                                        } else if (Build.VERSION.SDK_INT >= 21) {
                                                            a(parseFloat, 3, bVar4);
                                                            bVar4.f55621d.add(Keyframe.ofFloat(parseFloat, a4.c()));
                                                        }
                                                        i7 = 1;
                                                    }
                                                    a(parseFloat, 1, bVar4);
                                                    bVar4.f55619b.add(Keyframe.ofFloat(parseFloat, a4.a()));
                                                    a(parseFloat, 2, bVar4);
                                                    bVar4.f55620c.add(Keyframe.ofFloat(parseFloat, a4.b()));
                                                    if (Build.VERSION.SDK_INT >= 21) {
                                                        a(parseFloat, 3, bVar4);
                                                        bVar4.f55621d.add(Keyframe.ofFloat(parseFloat, a4.c()));
                                                        i7 = 1;
                                                    }
                                                    a(parseFloat, 4, bVar4);
                                                    bVar4.f55622e.add(Keyframe.ofFloat(parseFloat, a4.d()));
                                                    i7 = 1;
                                                }
                                            } else if (nextKey2.equals("background-color")) {
                                                if (j() == null) {
                                                    a("BackgroundColor", Integer.valueOf(c2.getBackgroundColor()));
                                                } else {
                                                    a("Color", Integer.valueOf(c2.getBackgroundColor()));
                                                }
                                                a(parseFloat, 9, bVar4);
                                                bVar4.f55627j.add(Keyframe.ofInt(parseFloat, map.getInt(nextKey2)));
                                            }
                                            f3 = 1.0f;
                                        }
                                        i2 = 3;
                                        i3 = 0;
                                        i4 = 1;
                                    }
                                }
                            } else {
                                if (j() != null) {
                                    i6 = 2;
                                } else {
                                    i6 = 1;
                                }
                                int i11 = 0;
                                do {
                                    View i12 = i();
                                    LynxUI c3 = c();
                                    if (i12 != null && c3 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        AnonymousClass2 r12 = new Comparator<Keyframe>() {
                                            /* class com.lynx.tasm.a.a.c.AnonymousClass2 */

                                            static {
                                                Covode.recordClassIndex(34815);
                                            }

                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                            @Override // java.util.Comparator
                                            public final /* synthetic */ int compare(Keyframe keyframe, Keyframe keyframe2) {
                                                return Float.compare(keyframe.getFraction(), keyframe2.getFraction());
                                            }
                                        };
                                        if (bVar4.f55618a.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[0]) {
                                                bVar4.f55618a.add(Keyframe.ofFloat(0.0f, i12.getAlpha()));
                                            }
                                            if (!bVar4.f55630m[0]) {
                                                bVar4.f55618a.add(Keyframe.ofFloat(1.0f, i12.getAlpha()));
                                            }
                                            Collections.sort(bVar4.f55618a, r12);
                                            arrayList.add(a(bVar4.f55618a, "Alpha"));
                                        }
                                        if (bVar4.f55619b.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[1]) {
                                                bVar4.f55619b.add(Keyframe.ofFloat(0.0f, i12.getTranslationX()));
                                            }
                                            if (!bVar4.f55630m[1]) {
                                                bVar4.f55619b.add(Keyframe.ofFloat(1.0f, i12.getTranslationX()));
                                            }
                                            Collections.sort(bVar4.f55619b, r12);
                                            arrayList.add(a(bVar4.f55619b, "TranslationX"));
                                        }
                                        if (bVar4.f55620c.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[2]) {
                                                bVar4.f55620c.add(Keyframe.ofFloat(0.0f, i12.getTranslationY()));
                                            }
                                            if (!bVar4.f55630m[2]) {
                                                bVar4.f55620c.add(Keyframe.ofFloat(1.0f, i12.getTranslationY()));
                                            }
                                            Collections.sort(bVar4.f55620c, r12);
                                            arrayList.add(a(bVar4.f55620c, "TranslationY"));
                                        }
                                        if (bVar4.f55621d.size() != 0 && i11 == 0) {
                                            if (Build.VERSION.SDK_INT >= 21) {
                                                f2 = i12.getTranslationZ();
                                            } else {
                                                f2 = 0.0f;
                                            }
                                            if (!bVar4.f55629l[3]) {
                                                bVar4.f55621d.add(Keyframe.ofFloat(0.0f, f2));
                                            }
                                            if (!bVar4.f55630m[3]) {
                                                bVar4.f55621d.add(Keyframe.ofFloat(1.0f, f2));
                                            }
                                            Collections.sort(bVar4.f55621d, r12);
                                            arrayList.add(a(bVar4.f55621d, "TranslationZ"));
                                        }
                                        if (bVar4.f55622e.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[4]) {
                                                bVar4.f55622e.add(Keyframe.ofFloat(0.0f, i12.getRotation()));
                                            }
                                            if (!bVar4.f55630m[4]) {
                                                bVar4.f55622e.add(Keyframe.ofFloat(1.0f, i12.getRotation()));
                                            }
                                            Collections.sort(bVar4.f55622e, r12);
                                            arrayList.add(a(bVar4.f55622e, "Rotation"));
                                        }
                                        if (bVar4.f55623f.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[5]) {
                                                bVar4.f55623f.add(Keyframe.ofFloat(0.0f, i12.getRotationX()));
                                            }
                                            if (!bVar4.f55630m[5]) {
                                                bVar4.f55623f.add(Keyframe.ofFloat(1.0f, i12.getRotationX()));
                                            }
                                            Collections.sort(bVar4.f55623f, r12);
                                            arrayList.add(a(bVar4.f55623f, "RotationX"));
                                        }
                                        if (bVar4.f55624g.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[6]) {
                                                bVar4.f55624g.add(Keyframe.ofFloat(0.0f, i12.getRotationY()));
                                            }
                                            if (!bVar4.f55630m[6]) {
                                                bVar4.f55624g.add(Keyframe.ofFloat(1.0f, i12.getRotationY()));
                                            }
                                            Collections.sort(bVar4.f55624g, r12);
                                            arrayList.add(a(bVar4.f55624g, "RotationY"));
                                        }
                                        if (bVar4.f55625h.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[7]) {
                                                bVar4.f55625h.add(Keyframe.ofFloat(0.0f, i12.getScaleX()));
                                            }
                                            if (!bVar4.f55630m[7]) {
                                                bVar4.f55625h.add(Keyframe.ofFloat(1.0f, i12.getScaleX()));
                                            }
                                            Collections.sort(bVar4.f55625h, r12);
                                            arrayList.add(a(bVar4.f55625h, "ScaleX"));
                                        }
                                        if (bVar4.f55626i.size() != 0 && i11 == 0) {
                                            if (!bVar4.f55629l[8]) {
                                                bVar4.f55626i.add(Keyframe.ofFloat(0.0f, i12.getScaleY()));
                                            }
                                            if (!bVar4.f55630m[8]) {
                                                bVar4.f55626i.add(Keyframe.ofFloat(1.0f, i12.getScaleY()));
                                            }
                                            Collections.sort(bVar4.f55626i, r12);
                                            arrayList.add(a(bVar4.f55626i, "ScaleY"));
                                        }
                                        if (bVar4.f55627j.size() != 0 && i11 + 1 == i6) {
                                            if (!bVar4.f55629l[9]) {
                                                bVar4.f55627j.add(Keyframe.ofInt(0.0f, c3.getBackgroundColor()));
                                            }
                                            if (!bVar4.f55630m[9]) {
                                                bVar4.f55627j.add(Keyframe.ofInt(1.0f, c3.getBackgroundColor()));
                                            }
                                            Collections.sort(bVar4.f55627j, r12);
                                            if (i11 == 0) {
                                                a2 = a(bVar4.f55627j, "BackgroundColor");
                                            } else {
                                                a2 = a(bVar4.f55627j, "Color");
                                            }
                                            a2.setEvaluator(new ArgbEvaluator());
                                            arrayList.add(a2);
                                        }
                                        if (!(arrayList.size() == 0 || (propertyValuesHolderArr2 = (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()])) == null)) {
                                            if (i11 == 0) {
                                                bVar4.n = propertyValuesHolderArr2;
                                            } else if (i11 == 1) {
                                                bVar4.o = propertyValuesHolderArr2;
                                            }
                                        }
                                    }
                                    i11++;
                                } while (i11 < i6);
                                this.f55612i = bVar4;
                            }
                        }
                    }
                    LLog.a(6, "Lynx", "Keyframes input error.");
                    return;
                }
                if (this.f55611h != -1 && bVar.n == 1) {
                    this.f55611h += this.f55609f.a();
                }
                BackgroundDrawable j3 = j();
                if (j3 != null) {
                    i5 = 2;
                } else {
                    i5 = 1;
                }
                ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[i5];
                int i13 = 0;
                int i14 = 0;
                do {
                    b bVar5 = this.f55612i;
                    if (i14 == 1) {
                        propertyValuesHolderArr = bVar5.o;
                    } else {
                        propertyValuesHolderArr = bVar5.n;
                    }
                    if (propertyValuesHolderArr != null) {
                        if (i14 == 1) {
                            view = j3;
                        } else {
                            view = i9;
                        }
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.lynx.tasm.a.a.c.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(34814);
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                LynxUI lynxUI = c.this.f55604a.get();
                                if (lynxUI != null && (lynxUI.mParent instanceof UIShadowProxy)) {
                                    ((UIShadowProxy) lynxUI.mParent).invalidate();
                                }
                            }
                        });
                        objectAnimatorArr[i14] = ofPropertyValuesHolder;
                        ofPropertyValuesHolder.setDuration(bVar.f55634b);
                        ofPropertyValuesHolder.setRepeatCount(bVar.f55643k);
                        if (bVar.f55645m == 2 || bVar.f55645m == 3) {
                            ofPropertyValuesHolder.setRepeatMode(2);
                        } else {
                            ofPropertyValuesHolder.setRepeatMode(1);
                        }
                        ofPropertyValuesHolder.setInterpolator(com.lynx.tasm.a.c.a(bVar));
                        if (bVar.f55635c != 0 && (bVar.f55644l == 2 || bVar.f55644l == 3)) {
                            ObjectAnimator clone = ofPropertyValuesHolder.clone();
                            clone.setDuration(10000000L);
                            clone.addListener(new f((byte) 0));
                            clone.start();
                        }
                        i13++;
                        ofPropertyValuesHolder.setStartDelay(bVar.f55635c);
                        if (this.f55611h != -1) {
                            long currentTimeMillis = System.currentTimeMillis() - this.f55611h;
                            if (currentTimeMillis < bVar.f55635c) {
                                ofPropertyValuesHolder.setStartDelay(bVar.f55635c - currentTimeMillis);
                            } else {
                                ofPropertyValuesHolder.setCurrentPlayTime(currentTimeMillis - bVar.f55635c);
                            }
                        }
                        ofPropertyValuesHolder.start();
                    }
                    i14++;
                } while (i14 < i5);
                int i15 = 0;
                if (i13 == 0) {
                    this.f55606c = null;
                } else if (i13 == i5) {
                    this.f55606c = objectAnimatorArr;
                } else {
                    this.f55606c = new ObjectAnimator[i13];
                    int i16 = 0;
                    do {
                        ObjectAnimator objectAnimator = objectAnimatorArr[i15];
                        if (objectAnimator != null) {
                            this.f55606c[i16] = objectAnimator;
                            i16++;
                        }
                        i15++;
                    } while (i15 < i5);
                }
                e();
                if (this.f55611h == -1) {
                    this.f55611h = System.currentTimeMillis();
                }
                if (((double) bVar.f55643k) >= 9.99999999E8d) {
                    j2 = Long.MAX_VALUE;
                } else {
                    j2 = (bVar.f55634b * ((long) (bVar.f55643k + 1))) + bVar.f55635c;
                }
                if (System.currentTimeMillis() - this.f55611h < j2) {
                    if (this.f55607d == d.IDLE) {
                        a.a(c2, "animationstart", bVar.f55633a);
                    }
                    if (bVar.n == 0) {
                        b(bVar);
                        this.f55607d = d.PAUSED;
                    } else if (bVar.n == 1) {
                        this.f55607d = d.RUNNING;
                    }
                }
                this.f55608e = bVar;
            }
        }
    }

    private void a(String str, Object obj) {
        if (!this.f55605b.containsKey(str)) {
            this.f55605b.put(str, obj);
        }
    }

    private static PropertyValuesHolder a(ArrayList<Keyframe> arrayList, String str) {
        return PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()]));
    }

    public c(View view, LynxUI lynxUI) {
        this.f55604a = new WeakReference<>(lynxUI);
        this.f55610g = new WeakReference<>(view);
    }

    private static void a(float f2, int i2, b bVar) {
        if (f2 == 0.0f) {
            bVar.f55629l[i2] = true;
        }
        if (f2 == 1.0f) {
            bVar.f55630m[i2] = true;
        }
    }
}
