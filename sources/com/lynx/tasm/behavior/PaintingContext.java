package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.c.a.a;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.e;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.utils.m;
import java.util.Map;

public final class PaintingContext {

    /* renamed from: a  reason: collision with root package name */
    public final a f55780a;

    /* renamed from: b  reason: collision with root package name */
    private final q f55781b;

    static {
        Covode.recordClassIndex(34886);
    }

    public final void flush() {
        this.f55780a.a();
    }

    public final void FinishLayoutOperation(long j2) {
        this.f55780a.b(j2);
    }

    public final void FinishTasmOperation(long j2) {
        this.f55780a.a(j2);
    }

    public final void onAnimatedNodeReady(int i2) {
        this.f55780a.b(i2);
    }

    public final void validate(int i2) {
        this.f55780a.a(i2);
    }

    public final void onCollectExtraUpdates(int i2) {
        ShadowNode b2 = this.f55781b.f55933c.b(i2);
        if (b2 != null) {
            b2.a(this);
        }
    }

    public final void setKeyframes(ReadableMap readableMap) {
        if (this.f55781b.f55933c.q) {
            this.f55781b.f55933c.a(readableMap.getMap("keyframes"));
        } else {
            this.f55780a.a(readableMap);
        }
    }

    public final float[] getBoundingClientOrigin(int i2) {
        float[] fArr = {0.0f, 0.0f};
        LynxBaseUI a2 = this.f55781b.a(i2);
        if (a2 != null) {
            Rect boundingClientRect = a2.getBoundingClientRect();
            fArr[0] = (float) boundingClientRect.left;
            fArr[1] = (float) boundingClientRect.top;
        }
        return fArr;
    }

    public final float[] getRectToWindow(int i2) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI a2 = this.f55781b.a(i2);
        if (a2 != null) {
            Rect rectToWindow = a2.getRectToWindow();
            fArr[0] = (float) rectToWindow.left;
            fArr[1] = (float) rectToWindow.top;
            fArr[2] = (float) rectToWindow.width();
            fArr[3] = (float) rectToWindow.height();
        }
        return fArr;
    }

    public PaintingContext(q qVar, a aVar) {
        this.f55781b = qVar;
        this.f55780a = aVar;
    }

    public final void destroyNode(int i2, int i3) {
        this.f55780a.b(i2, i3);
    }

    public final void removeNode(int i2, int i3) {
        this.f55780a.a(i2, i3);
    }

    public final void updateFlattenStatus(int i2, boolean z) {
        this.f55780a.a(i2, z);
    }

    public final void setTransitionData(int i2, float[] fArr) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setTransitionData(fArr);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void insertNode(int i2, int i3, int i4) {
        this.f55780a.a(i2, i3, i4);
    }

    public final void updateProps(int i2, boolean z, ReadableMap readableMap) {
        this.f55780a.a(i2, z, readableMap);
    }

    public final void setAnimationData(int i2, String[] strArr, float[] fArr) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setAnimationData(strArr, fArr);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setAttributes(int i2, ReadableMap readableMap, ReadableArray readableArray) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                v vVar = null;
                if (readableMap != null) {
                    vVar = new v(readableMap);
                }
                LynxBaseUI c2 = q.c(lynxBaseUI);
                c2.setAttributes(vVar);
                if (readableArray != null) {
                    c2.setEvents(q.a(readableArray));
                    return;
                }
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setStringAttributes(int i2, String[] strArr, String[] strArr2) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                int length = strArr.length;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                for (int i3 = 0; i3 < length; i3++) {
                    javaOnlyMap.putString(strArr[i3], strArr2[i3]);
                }
                q.c(lynxBaseUI).setAttributes(new v(javaOnlyMap));
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setOutlineData(int i2, float f2, int i3, int i4) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setOutlineData(f2, i3, i4);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setTextStyleData(int i2, int[] iArr, double[] dArr, String str) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setTextStyleData(iArr, dArr, str);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void createNode(int i2, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        v vVar;
        a aVar = this.f55780a;
        if (readableMap != null) {
            vVar = new v(readableMap);
        } else {
            vVar = null;
        }
        Map<String, com.lynx.tasm.c.a> a2 = com.lynx.tasm.c.a.a(readableArray);
        TraceEvent.a(0, "UIOperationQueue.createNode.enqueueCreateView");
        aVar.a(i2, str, vVar, a2, z);
        TraceEvent.b(0, "UIOperationQueue.createNode.enqueueCreateView");
    }

    public final long measureText(int i2, float f2, int i3, float f3, int i4) {
        q qVar = this.f55781b;
        if (qVar == null) {
            return 0;
        }
        e fromInt = e.fromInt(i3);
        e fromInt2 = e.fromInt(i4);
        LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
        if (lynxBaseUI != null) {
            return lynxBaseUI.measureText(f2, fromInt, f3, fromInt2);
        }
        throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
    }

    public final void setTransformData(int i2, float f2, float f3, int[] iArr, float[] fArr) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setTransformData(f2, f3, iArr, fArr);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setSingleValueStyleData(int i2, int[] iArr, float f2, int i3, int i4, int i5) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setSingleValueStyleData(iArr, f2, i3, i4, i5);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void UpdateLayoutPatching(int[] iArr, int[][] iArr2, int[][] iArr3, int[][] iArr4, float[][] fArr, float[][] fArr2, int[] iArr5) {
        Rect rect;
        PaintingContext paintingContext = this;
        if (paintingContext.f55781b != null) {
            int length = iArr.length;
            char c2 = 0;
            int i2 = 0;
            while (i2 < length) {
                q qVar = paintingContext.f55781b;
                int i3 = iArr[i2];
                int i4 = iArr2[i2][c2];
                int i5 = iArr2[i2][1];
                int i6 = iArr2[i2][2];
                int i7 = iArr2[i2][3];
                int i8 = iArr3[i2][c2];
                int i9 = iArr3[i2][1];
                int i10 = iArr3[i2][2];
                int i11 = iArr3[i2][3];
                int i12 = iArr4[i2][c2];
                int i13 = iArr4[i2][1];
                int i14 = iArr4[i2][2];
                int i15 = iArr4[i2][3];
                if (fArr[i2] != null) {
                    rect = new Rect((int) fArr[i2][c2], (int) fArr[i2][1], (int) fArr[i2][2], (int) fArr[i2][3]);
                } else {
                    rect = null;
                }
                qVar.a(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, rect, fArr2[i2], iArr5[i2]);
                i2++;
                paintingContext = this;
                c2 = 0;
            }
        }
    }

    public final void setShadowData(int i2, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr, int[] iArr2) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                if (!(lynxBaseUI instanceof UIShadowProxy) && lynxBaseUI.mParent != null && !(lynxBaseUI.mParent instanceof UIShadowProxy)) {
                    LynxBaseUI lynxBaseUI2 = (LynxBaseUI) lynxBaseUI.mParent;
                    int index = lynxBaseUI2.getIndex(lynxBaseUI);
                    qVar.a(lynxBaseUI2.getSign(), lynxBaseUI.getSign());
                    LynxUI enclosingLynxUI = lynxBaseUI2.enclosingLynxUI();
                    qVar.f55935e.remove(Integer.valueOf(lynxBaseUI.getSign()));
                    UIShadowProxy uIShadowProxy = new UIShadowProxy(qVar.f55933c, lynxBaseUI);
                    qVar.f55935e.put(Integer.valueOf(uIShadowProxy.getSign()), uIShadowProxy);
                    qVar.b(enclosingLynxUI.getSign(), uIShadowProxy.getSign(), index);
                }
                lynxBaseUI.setShadowData(fArr, fArr2, fArr3, fArr4, iArr, iArr2);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setBackgroundData(int i2, int i3, ReadableMap readableMap, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int[] iArr3) {
        ReadableArray readableArray;
        q qVar = this.f55781b;
        if (qVar != null) {
            if (readableMap != null) {
                readableArray = readableMap.getArray("background-image");
            } else {
                readableArray = null;
            }
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setBackgroundData(i3, readableArray, fArr, fArr2, iArr, iArr2, iArr3);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void updateUITreeOperations(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, boolean[] zArr, boolean[] zArr2, int[] iArr4, int[] iArr5) {
        UIShadowProxy a2;
        q qVar = this.f55781b;
        if (qVar != null) {
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr4[i2];
                if (i3 == 0) {
                    int i4 = iArr[i2];
                    String str = strArr[i2];
                    boolean z = zArr[i2];
                    boolean z2 = zArr2[i2];
                    int i5 = iArr5[i2];
                    String concat = "UIOwner.createView.".concat(String.valueOf(str));
                    TraceEvent.a(0, concat);
                    m.b();
                    if (qVar.f55931a >= 0 || !str.equals("page")) {
                        a2 = qVar.a(str, z);
                    } else {
                        a2 = qVar.f55932b;
                        qVar.f55931a = i4;
                    }
                    a2.setSign(i4, str);
                    if (z2) {
                        a2 = new UIShadowProxy(qVar.f55933c, a2);
                    }
                    qVar.f55934d.add(str);
                    if (str.equals("component") && i5 != -1) {
                        qVar.f55936f.put(Integer.valueOf(i5), Integer.valueOf(i4));
                    }
                    qVar.f55935e.put(Integer.valueOf(i4), a2);
                    TraceEvent.b(0, concat);
                } else if (i3 == 1) {
                    qVar.b(iArr2[i2], iArr[i2], iArr3[i2]);
                } else if (i3 == 2) {
                    int i6 = iArr[i2];
                    if (qVar.f55935e.size() <= 0) {
                        continue;
                    } else {
                        LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i6));
                        if (lynxBaseUI != null) {
                            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                            if (parentBaseUI == null) {
                                LLog.c("LynxUIOwner", "parent is null for tag: " + i6 + ", the child may be recreated");
                            } else {
                                String str2 = "UIOwner.removeFiber." + parentBaseUI.mTagName + "." + lynxBaseUI.mTagName;
                                TraceEvent.a(0, str2);
                                parentBaseUI.removeChildFiber(lynxBaseUI);
                                TraceEvent.b(0, str2);
                            }
                        } else {
                            throw new RuntimeException("Trying to remove unknown ui signature: ".concat(String.valueOf(i6)));
                        }
                    }
                } else if (i3 == 3) {
                    qVar.c(iArr[i2]);
                } else if (i3 == 4) {
                    int i7 = iArr[i2];
                    boolean z3 = zArr[i2];
                    LynxBaseUI lynxBaseUI2 = qVar.f55935e.get(Integer.valueOf(i7));
                    String str3 = "UIOwner.updateFlatten." + lynxBaseUI2.mTagName;
                    TraceEvent.a(0, str3);
                    if (!(lynxBaseUI2 instanceof UIGroup)) {
                        lynxBaseUI2.destroy();
                    }
                    LynxBaseUI a3 = qVar.a(lynxBaseUI2.mTagName, z3);
                    a3.setSign(lynxBaseUI2.getSign(), lynxBaseUI2.mTagName);
                    a3.setAttributes(new v(lynxBaseUI2.getProps()));
                    qVar.f55935e.put(Integer.valueOf(lynxBaseUI2.getSign()), a3);
                    TraceEvent.b(0, str3);
                }
            }
        }
    }

    public final void setLayoutAnimationData(int i2, int i3, long j2, long j3, int i4, int i5, float f2, float f3, float f4, float f5, int i6) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setLayoutAnimationData(i3, j2, j3, i4, i5, f2, f3, f4, f5, i6);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }

    public final void setLayoutData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2, int i15) {
        Rect rect;
        q qVar = this.f55781b;
        if (qVar != null) {
            if (fArr != null) {
                rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
            } else {
                rect = null;
            }
            qVar.a(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, rect, fArr2, i15);
        }
    }

    public final void updateLayout(int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float[] fArr, float[] fArr2, float f18) {
        this.f55780a.a(i2, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, fArr, fArr2, f18);
    }

    public final void setBorderData(int i2, float f2, float f3, float f4, float f5, int i3, int i4, int i5, int i6, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i7, int i8, int i9, int i10) {
        q qVar = this.f55781b;
        if (qVar != null) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                q.c(lynxBaseUI).setBorderData(f2, f3, f4, f5, i3, i4, i5, i6, f6, f7, f8, f9, f10, f11, f12, f13, i7, i8, i9, i10);
                return;
            }
            throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
        }
    }
}
