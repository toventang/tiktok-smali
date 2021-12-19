package com.lynx.tasm.behavior;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.h;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.c;
import com.lynx.tasm.behavior.shadow.e;
import com.lynx.tasm.behavior.shadow.j;
import com.lynx.tasm.c.a;

public class t extends LayoutContext {

    /* renamed from: c  reason: collision with root package name */
    final u f56049c = new u();

    /* renamed from: d  reason: collision with root package name */
    private j f56050d;

    /* renamed from: e  reason: collision with root package name */
    private final c f56051e;

    /* renamed from: f  reason: collision with root package name */
    private final c f56052f;

    /* renamed from: g  reason: collision with root package name */
    private final PaintingContext f56053g;

    /* renamed from: h  reason: collision with root package name */
    private final h f56054h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56055i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56056j;

    static {
        Covode.recordClassIndex(35018);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final DisplayMetrics a() {
        return this.f56050d.p;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.LayoutContext
    public void updateDataWithoutChange() {
        if (!this.f56056j) {
            this.f56056j = true;
            return;
        }
        h hVar = this.f56054h;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayoutFinish() {
        if (this.f56055i) {
            this.f56055i = false;
            h hVar = this.f56054h;
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        h hVar2 = this.f56054h;
        if (hVar2 != null) {
            hVar2.b();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void detachNativePtr() {
        SparseArray<ShadowNode> sparseArray;
        super.detachNativePtr();
        u uVar = this.f56049c;
        if (!(uVar == null || (sparseArray = uVar.f56059a) == null || sparseArray.size() <= 0)) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray.valueAt(i2).f55962m = true;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayoutBefore(int i2) {
        this.f56049c.a(i2).c();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void scheduleLayout(final long j2) {
        if (!this.f55779b) {
            this.f56051e.a(new Runnable() {
                /* class com.lynx.tasm.behavior.t.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35019);
                }

                public final void run() {
                    t tVar = t.this;
                    long j2 = j2;
                    if (tVar.f55778a != 0) {
                        tVar.nativeTriggerLayout(tVar.f55778a, j2);
                    }
                }
            });
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void setFontFaces(ReadableMap readableMap) {
        this.f56050d.f55896d = readableMap.getMap("fontfaces");
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void destroyNodes(int[] iArr) {
        for (int i2 : iArr) {
            u uVar = this.f56049c;
            uVar.f56059a.remove(i2);
            uVar.f56059a.get(i2).f55962m = true;
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void updateProps(int i2, ReadableMap readableMap) {
        ShadowNode a2 = this.f56049c.a(i2);
        if (a2 == null) {
            throw new RuntimeException("Trying to update non-existent view with tag ".concat(String.valueOf(i2)));
        } else if (readableMap != null) {
            v vVar = new v(readableMap);
            if (this.f56050d.q) {
                a2.b(vVar);
            } else {
                a2.a(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void insertNode(int i2, int i3, int i4) {
        this.f56049c.a(i2).a(this.f56049c.a(i3), i4);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void removeNode(int i2, int i3, int i4) {
        this.f56049c.a(i2).a(i4);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void moveNode(int i2, int i3, int i4, int i5) {
        ShadowNode a2 = this.f56049c.a(i2);
        ShadowNode a3 = this.f56049c.a(i3);
        a2.a(i4);
        a2.a(a3, i5);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void setTextStyleData(int i2, int[] iArr, double[] dArr, String str) {
        ShadowNode a2 = this.f56049c.a(i2);
        if (a2 != null) {
            a2.a(iArr, dArr, str);
            return;
        }
        throw new RuntimeException("Trying to setTextStyleData non-existent view with tag ".concat(String.valueOf(i2)));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayout(int i2, int i3, int i4, int i5, int i6) {
        this.f56049c.a(i2).a(i3, i4, i5, i6);
    }

    public t(j jVar, c cVar, PaintingContext paintingContext, c cVar2, h hVar) {
        this.f56050d = jVar;
        this.f56052f = cVar;
        this.f56053g = paintingContext;
        this.f56051e = cVar2;
        this.f56054h = hVar;
        this.f56055i = true;
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public long measure(int i2, float f2, int i3, float f3, int i4) {
        long a2;
        ShadowNode a3 = this.f56049c.a(i2);
        if (a3 != null) {
            a3.c();
            e fromInt = e.fromInt(i3);
            e fromInt2 = e.fromInt(i4);
            if (a3.f55954f == null) {
                a2 = 0;
            } else {
                a2 = a3.f55954f.a(a3, f2, fromInt, f3, fromInt2);
            }
            a3.a(this.f56053g);
            return a2;
        }
        throw new RuntimeException("Trying to measure non-existent view with tag ".concat(String.valueOf(i2)));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public int createNode(int i2, String str, ReadableMap readableMap, long j2, ReadableArray readableArray) {
        int i3;
        a a2 = this.f56052f.a(str);
        ShadowNode a3 = a2.a();
        if (a2.f55783c) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        if (a3 == null) {
            return i3 | 1;
        }
        int i4 = i3 | 4;
        a3.f55957h = i2;
        a3.f55958i = str;
        a3.a(this.f56050d);
        a3.a(a.a(readableArray));
        this.f56049c.f56059a.put(a3.f55957h, a3);
        if (!this.f55779b) {
            a3.f55952d = j2;
            a3.f55955g = new j(a3);
            if (!a3.f55953e && a3.f55954f != null) {
                a3.a(a3.f55954f);
            }
        }
        if (readableMap != null) {
            a3.a(new v(readableMap));
        }
        if (a3.a()) {
            return i4 | 2;
        }
        return i4;
    }
}
