package com.bytedance.ies.xelement.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.i;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import h.f.b.l;
import h.w;

public final class f {
    public static final a q = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final j f37145a;

    /* renamed from: b  reason: collision with root package name */
    ViewTreeObserver.OnGlobalLayoutListener f37146b;

    /* renamed from: c  reason: collision with root package name */
    public c f37147c;

    /* renamed from: d  reason: collision with root package name */
    public i f37148d;

    /* renamed from: e  reason: collision with root package name */
    public Rect f37149e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f37150f;

    /* renamed from: g  reason: collision with root package name */
    String f37151g = "end";

    /* renamed from: h  reason: collision with root package name */
    public boolean f37152h = true;

    /* renamed from: i  reason: collision with root package name */
    int f37153i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37154j;

    /* renamed from: k  reason: collision with root package name */
    public int f37155k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f37156l = -1;

    /* renamed from: m  reason: collision with root package name */
    boolean f37157m = true;
    public boolean n;
    public boolean o;
    public LynxBaseInputView p;

    static {
        Covode.recordClassIndex(22345);
    }

    public static final class a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.xelement.input.f$a$a  reason: collision with other inner class name */
        public enum EnumC0916a {
            NONE,
            IMMERSIVE,
            NORMAL,
            NOTHING;

            static {
                Covode.recordClassIndex(22348);
            }
        }

        static {
            Covode.recordClassIndex(22347);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean c() {
        Context baseContext = this.f37145a.getBaseContext();
        int i2 = Build.VERSION.SDK_INT;
        if (baseContext != null) {
            Window window = ((Activity) baseContext).getWindow();
            l.a((Object) window, "");
            View decorView = window.getDecorView();
            l.a((Object) decorView, "");
            if ((decorView.getSystemUiVisibility() & 1024) != 0) {
                return true;
            }
            return false;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final boolean a() {
        if (!this.f37157m || TextUtils.equals(this.f37151g, "none") || !(this.f37145a.getBaseContext() instanceof Activity) || d() == a.EnumC0916a.NONE || this.f37148d == null) {
            return false;
        }
        return true;
    }

    private final a.EnumC0916a d() {
        Context baseContext = this.f37145a.getBaseContext();
        if (!(baseContext instanceof Activity)) {
            return a.EnumC0916a.NONE;
        }
        Window window = ((Activity) baseContext).getWindow();
        l.a((Object) window, "");
        int i2 = window.getAttributes().softInputMode & 240 & 240;
        if (i2 != 16) {
            if (i2 == 32) {
                return a.EnumC0916a.NONE;
            }
            if (i2 != 48) {
                return a.EnumC0916a.NONE;
            }
            return a.EnumC0916a.NOTHING;
        } else if (c()) {
            return a.EnumC0916a.IMMERSIVE;
        } else {
            return a.EnumC0916a.NORMAL;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 686
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.f.b():void");
    }

    public f(LynxBaseInputView lynxBaseInputView) {
        l.c(lynxBaseInputView, "");
        this.p = lynxBaseInputView;
        j jVar = lynxBaseInputView.mContext;
        l.a((Object) jVar, "");
        this.f37145a = jVar;
        if (jVar.a() instanceof Activity) {
            this.f37148d = new i(jVar.a());
            c cVar = this.p.f37089a;
            if (cVar == null) {
                l.a("mEditText");
            }
            this.f37147c = cVar;
            if (d() != a.EnumC0916a.NONE) {
                this.f37146b = new ViewTreeObserver.OnGlobalLayoutListener(this) {
                    /* class com.bytedance.ies.xelement.input.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f37158a;

                    static {
                        Covode.recordClassIndex(22346);
                    }

                    {
                        this.f37158a = r1;
                    }

                    public final void onGlobalLayout() {
                        boolean z;
                        if (this.f37158a.a()) {
                            i iVar = this.f37158a.f37148d;
                            if (iVar == null) {
                                l.a();
                            }
                            iVar.a().getWindowVisibleDisplayFrame(this.f37158a.f37149e);
                            int i2 = this.f37158a.f37149e.bottom - this.f37158a.f37149e.top;
                            if (this.f37158a.f37150f == 0) {
                                f fVar = this.f37158a;
                                i iVar2 = fVar.f37148d;
                                if (iVar2 == null) {
                                    l.a();
                                }
                                View a2 = iVar2.a();
                                l.a((Object) a2, "");
                                fVar.f37150f = a2.getHeight();
                            }
                            int i3 = this.f37158a.f37150f;
                            double d2 = (double) i2;
                            double d3 = (double) i3;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            double d4 = d2 / d3;
                            if (d4 < 0.8d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d4 < 0.4d) {
                                i iVar3 = this.f37158a.f37148d;
                                if (iVar3 == null) {
                                    l.a();
                                }
                                iVar3.a().requestLayout();
                                return;
                            }
                            if (z != this.f37158a.f37154j || this.f37158a.n || this.f37158a.o) {
                                if (z) {
                                    this.f37158a.f37155k = i3 - i2;
                                    c cVar = this.f37158a.f37147c;
                                    if (cVar != null && cVar.isFocused()) {
                                        f fVar2 = this.f37158a;
                                        LynxBaseUI parentBaseUI = fVar2.p.getParentBaseUI();
                                        while (true) {
                                            if (parentBaseUI == null) {
                                                break;
                                            } else if (parentBaseUI instanceof AbsLynxUIScroll) {
                                                ViewGroup viewGroup = (ViewGroup) ((LynxUI) parentBaseUI).mView;
                                                l.a((Object) viewGroup, "");
                                                i2 -= viewGroup.getTop();
                                                break;
                                            } else {
                                                parentBaseUI = parentBaseUI.getParentBaseUI();
                                            }
                                        }
                                        fVar2.f37156l = i2;
                                        this.f37158a.b();
                                    }
                                } else if (this.f37158a.f37152h) {
                                    LynxBaseUI parentBaseUI2 = this.f37158a.p.getParentBaseUI();
                                    while (true) {
                                        if (parentBaseUI2 == null) {
                                            break;
                                        } else if (parentBaseUI2 instanceof AbsLynxUIScroll) {
                                            LynxUI lynxUI = (LynxUI) parentBaseUI2;
                                            View childAt = ((ViewGroup) lynxUI.mView).getChildAt(0);
                                            l.a((Object) childAt, "");
                                            if (childAt.getPaddingBottom() != 0) {
                                                ((ViewGroup) lynxUI.mView).getChildAt(0).setPadding(0, 0, 0, 0);
                                            }
                                        } else {
                                            parentBaseUI2 = parentBaseUI2.getParentBaseUI();
                                        }
                                    }
                                }
                            }
                            this.f37158a.f37154j = z;
                        }
                    }
                };
                i iVar = this.f37148d;
                if (iVar == null) {
                    l.a();
                }
                iVar.a(this.f37146b);
                i iVar2 = this.f37148d;
                if (iVar2 == null) {
                    l.a();
                }
                iVar2.b();
            }
        }
    }

    private final boolean a(Rect rect, View view) {
        int i2;
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        int[] iArr = {-1, -1};
        c cVar = this.f37147c;
        if (cVar != null) {
            cVar.getLocationInWindow(iArr);
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[0];
        c cVar2 = this.f37147c;
        if (cVar2 == null) {
            l.a();
        }
        int width = i5 + cVar2.getWidth();
        int i6 = iArr[1];
        c cVar3 = this.f37147c;
        if (cVar3 == null) {
            l.a();
        }
        Rect rect3 = new Rect(i3, i4, width, i6 + cVar3.getHeight());
        if (!TextUtils.equals(this.f37151g, "center")) {
            i2 = (rect2.bottom - rect3.bottom) - this.f37153i;
        } else if (this.f37156l == -1) {
            this.o = true;
            c cVar4 = this.f37147c;
            if (cVar4 == null) {
                l.a();
            }
            cVar4.requestLayout();
            i iVar = this.f37148d;
            if (iVar == null) {
                l.a();
            }
            iVar.a().requestLayout();
            return true;
        } else {
            this.o = false;
            i2 = (rect2.bottom - rect3.bottom) - ((this.f37156l - rect.height()) / 2);
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }
}
