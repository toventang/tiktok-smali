package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.core.h.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.reveal.a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.c;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;

public class LynxRevealView extends UISimpleView<a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37412b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f37413a;

    /* renamed from: c  reason: collision with root package name */
    private a f37414c;

    static {
        Covode.recordClassIndex(22494);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22497);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxRevealView f37415a;

        static {
            Covode.recordClassIndex(22498);
        }

        @Override // com.bytedance.ies.xelement.reveal.a.b
        public final void a() {
            if (this.f37415a.f37413a) {
                j jVar = this.f37415a.mContext;
                l.a((Object) jVar, "");
                c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37415a.getSign(), "state");
                cVar2.a("state", "closed");
                cVar.a(cVar2);
            }
        }

        @Override // com.bytedance.ies.xelement.reveal.a.b
        public final void b() {
            if (this.f37415a.f37413a) {
                j jVar = this.f37415a.mContext;
                l.a((Object) jVar, "");
                c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37415a.getSign(), "state");
                cVar2.a("state", "opened");
                cVar.a(cVar2);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(LynxRevealView lynxRevealView) {
            this.f37415a = lynxRevealView;
        }
    }

    public LynxRevealView(j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null && map.containsKey("state")) {
            this.f37413a = true;
        }
    }

    @m(a = "mode", e = 0)
    public final void setRevealLayoutMode(String str) {
        l.c(str, "");
        Locale locale = Locale.ROOT;
        l.a((Object) locale, "");
        String lowerCase = str.toLowerCase(locale);
        l.a((Object) lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1394648469) {
            if (hashCode == -1039745817 && lowerCase.equals("normal")) {
                a aVar = this.f37414c;
                if (aVar == null) {
                    l.a("mRevealLayout");
                }
                aVar.setMode$x_element_reveal_view_release(0);
            }
        } else if (lowerCase.equals("same_level")) {
            a aVar2 = this.f37414c;
            if (aVar2 == null) {
                l.a("mRevealLayout");
            }
            aVar2.setMode$x_element_reveal_view_release(1);
        }
    }

    @p
    public final void toggleActive(ReadableMap readableMap) {
        l.c(readableMap, "");
        if (readableMap.hasKey("state")) {
            String string = readableMap.getString("state");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != 3417674) {
                    if (hashCode == 94756344 && string.equals("close")) {
                        a aVar = this.f37414c;
                        if (aVar == null) {
                            l.a("mRevealLayout");
                        }
                        aVar.b(true);
                    }
                } else if (string.equals("open")) {
                    a aVar2 = this.f37414c;
                    if (aVar2 == null) {
                        l.a("mRevealLayout");
                    }
                    aVar2.a(true);
                }
            }
        } else {
            a aVar3 = this.f37414c;
            if (aVar3 == null) {
                l.a("mRevealLayout");
            }
            if (aVar3.f37425j == 2) {
                a aVar4 = this.f37414c;
                if (aVar4 == null) {
                    l.a("mRevealLayout");
                }
                aVar4.b(true);
                return;
            }
            a aVar5 = this.f37414c;
            if (aVar5 == null) {
                l.a("mRevealLayout");
            }
            aVar5.a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public a createView(Context context) {
        Class<?> cls;
        Field declaredField;
        if (context == null) {
            return null;
        }
        a aVar = new a(context);
        this.f37414c = aVar;
        aVar.n = 2;
        aVar.f37424i = 300;
        aVar.f37426k = 1;
        Context context2 = aVar.getContext();
        l.a((Object) context2, "");
        l.c(context2, "");
        Resources resources = context2.getResources();
        l.a((Object) resources, "");
        aVar.f37420e = (int) ((resources.getDisplayMetrics().density * 1.0f) + 0.5f);
        aVar.o = androidx.customview.a.a.a(aVar, 1.0f, aVar.r);
        try {
            androidx.customview.a.a aVar2 = aVar.o;
            if (!(aVar2 == null || (cls = aVar2.getClass()) == null || (declaredField = cls.getDeclaredField("mScroller")) == null)) {
                declaredField.setAccessible(true);
                declaredField.set(aVar.o, new b(aVar.getContext(), new a.c()));
            }
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        androidx.customview.a.a aVar3 = aVar.o;
        if (aVar3 != null) {
            aVar3.f2661j = 15;
        }
        aVar.p = new d(aVar.getContext(), aVar.s);
        a aVar4 = this.f37414c;
        if (aVar4 == null) {
            l.a("mRevealLayout");
        }
        aVar4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        a aVar5 = this.f37414c;
        if (aVar5 == null) {
            l.a("mRevealLayout");
        }
        aVar5.setSwipeListener(new b(this));
        a aVar6 = this.f37414c;
        if (aVar6 == null) {
            l.a("mRevealLayout");
        }
        return aVar6;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i2, lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxRevealInnerLeft) {
                a aVar = this.f37414c;
                if (aVar == null) {
                    l.a("mRevealLayout");
                }
                com.lynx.tasm.behavior.ui.view.a aVar2 = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
                l.a((Object) aVar2, "");
                aVar.a(aVar2);
                a aVar3 = this.f37414c;
                if (aVar3 == null) {
                    l.a("mRevealLayout");
                }
                aVar3.setDragEdge(1);
            } else if (lynxBaseUI instanceof LynxRevealInnerRight) {
                a aVar4 = this.f37414c;
                if (aVar4 == null) {
                    l.a("mRevealLayout");
                }
                com.lynx.tasm.behavior.ui.view.a aVar5 = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
                l.a((Object) aVar5, "");
                aVar4.a(aVar5);
                a aVar6 = this.f37414c;
                if (aVar6 == null) {
                    l.a("mRevealLayout");
                }
                aVar6.setDragEdge(2);
            } else if (lynxBaseUI instanceof LynxRevealInnerTop) {
                a aVar7 = this.f37414c;
                if (aVar7 == null) {
                    l.a("mRevealLayout");
                }
                com.lynx.tasm.behavior.ui.view.a aVar8 = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
                l.a((Object) aVar8, "");
                aVar7.a(aVar8);
                a aVar9 = this.f37414c;
                if (aVar9 == null) {
                    l.a("mRevealLayout");
                }
                aVar9.setDragEdge(4);
            } else if (lynxBaseUI instanceof LynxRevealInnerBottom) {
                a aVar10 = this.f37414c;
                if (aVar10 == null) {
                    l.a("mRevealLayout");
                }
                com.lynx.tasm.behavior.ui.view.a aVar11 = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
                l.a((Object) aVar11, "");
                aVar10.a(aVar11);
                a aVar12 = this.f37414c;
                if (aVar12 == null) {
                    l.a("mRevealLayout");
                }
                aVar12.setDragEdge(8);
            } else {
                a aVar13 = this.f37414c;
                if (aVar13 == null) {
                    l.a("mRevealLayout");
                }
                T t = lynxUI.mView;
                l.a((Object) t, "");
                l.c(t, "");
                if (aVar13.f37416a != null) {
                    aVar13.removeView(aVar13.f37416a);
                }
                aVar13.f37416a = t;
                aVar13.addView(t);
            }
        }
    }
}
