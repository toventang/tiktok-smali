package com.lynx.tasm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.lynx.devtoolwrapper.LynxInspectorManager;
import com.lynx.jsbridge.CallbackImpl;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.jsbridge.Promise;
import com.lynx.jsbridge.PromiseImpl;
import com.lynx.jsbridge.e;
import com.lynx.jsbridge.f;
import com.lynx.jsbridge.g;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.a.a.b;
import com.lynx.tasm.base.CalledByNative;
import com.lynx.tasm.base.SystemMessageHandler;
import com.lynx.tasm.base.SystemThread;
import com.lynx.tasm.base.c;
import com.lynx.tasm.base.h;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.c.k;
import com.lynx.tasm.behavior.d;
import com.lynx.tasm.behavior.n;
import com.lynx.tasm.behavior.o;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.s;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.j;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.shadow.text.i;
import com.lynx.tasm.behavior.shadow.text.p;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.behavior.t;
import com.lynx.tasm.behavior.u;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.a;
import com.lynx.tasm.behavior.ui.image.AbsUIImage;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.scroll.a;
import com.lynx.tasm.behavior.ui.text.AndroidText;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.behavior.utils.LynxUISetter;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.behavior.utils.Settable;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.behavior.w;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.core.a;
import com.lynx.tasm.provider.b;
import com.lynx.tasm.provider.l;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.ValueUtils;
import com.ss.android.ugc.aweme.lancet.m;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f55740a;

    static {
        Covode.recordClassIndex(34854);
    }

    public static void a() {
        if (!f55740a) {
            f55740a = true;
            a.a().execute(new Runnable() {
                /* class com.lynx.tasm.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(34856);
                }

                public final void run() {
                    SystemClock.uptimeMillis();
                    try {
                        Class.forName(com.lynx.tasm.provider.b.class.getName());
                        Class.forName(PropsHolderAutoRegister.class.getName());
                        Class.forName(d.class.getName());
                        Class.forName(com.lynx.tasm.behavior.a.class.getName());
                        Class.forName(LynxModuleManager.class.getName());
                        Class.forName(CallbackImpl.class.getName());
                        Class.forName(i.class.getName());
                        Class.forName(com.lynx.tasm.b.a.class.getName());
                        Class.forName(f.class.getName());
                        SystemClock.uptimeMillis();
                    } catch (Throwable unused) {
                    }
                }
            });
            a.a().execute(new Runnable() {
                /* class com.lynx.tasm.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(34857);
                }

                public final void run() {
                    try {
                        SystemClock.elapsedRealtime();
                        try {
                            Class.forName("com.lynx.devtool.LynxInspectorOwner");
                        } catch (ClassNotFoundException unused) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            Librarian.a("lynx");
                            m.a(uptimeMillis, "lynx");
                            SystemClock.elapsedRealtime();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
            a.a().execute(new Runnable() {
                /* class com.lynx.tasm.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(34858);
                }

                public final void run() {
                    SystemClock.uptimeMillis();
                    try {
                        Class.forName(com.lynx.jsbridge.a.class.getName());
                        Class.forName(com.lynx.jsbridge.d.class.getName());
                        Class.forName(e.class.getName());
                        Class.forName(LynxModule.class.getName());
                        Class.forName(LynxModuleWrapper.class.getName());
                        Class.forName(MethodDescriptor.class.getName());
                        Class.forName(NetworkingModule.class.getName());
                        Class.forName(Promise.class.getName());
                        Class.forName(g.a.class.getName());
                        Class.forName(g.class.getName());
                        Class.forName(Callback.class.getName());
                        Class.forName(com.lynx.react.bridge.a.class.getName());
                        Class.forName(com.lynx.react.bridge.d.class.getName());
                        Class.forName(com.lynx.react.bridge.e.class.getName());
                        Class.forName(ReadableArray.class.getName());
                        Class.forName(ReadableMap.class.getName());
                        Class.forName(ReadableMapKeySetIterator.class.getName());
                        Class.forName(ReadableType.class.getName());
                        Class.forName(b.class.getName());
                        Class.forName(c.class.getName());
                        Class.forName(d.class.getName());
                        Class.forName(f.class.getName());
                        Class.forName(g.class.getName());
                        Class.forName(LynxEnv.class.getName());
                        Class.forName(l.class.getName());
                        Class.forName(n.class.getName());
                        Class.forName(TemplateData.class.getName());
                        Class.forName(TemplateAssembler.a.class.getName());
                        Class.forName(r.class.getName());
                        Class.forName(c.class.getName());
                        Class.forName(CalledByNative.class.getName());
                        Class.forName(com.lynx.tasm.base.f.class.getName());
                        Class.forName(h.class.getName());
                        Class.forName(SystemMessageHandler.class.getName());
                        Class.forName(SystemThread.class.getName());
                        Class.forName(com.lynx.tasm.behavior.b.class.getName());
                        Class.forName(com.lynx.tasm.behavior.c.class.getName());
                        Class.forName(com.lynx.tasm.behavior.e.class.getName());
                        Class.forName(com.lynx.tasm.behavior.f.class.getName());
                        Class.forName(com.lynx.tasm.a.b.a.class.getName());
                        Class.forName(com.lynx.tasm.a.b.c.class.getName());
                        Class.forName(LayoutContext.class.getName());
                        Class.forName(b.a.class.getName());
                        Class.forName(com.lynx.tasm.a.a.b.class.getName());
                        Class.forName(com.lynx.tasm.a.a.a.class.getName());
                        Class.forName(com.lynx.tasm.a.a.c.class.getName());
                        Class.forName(com.lynx.tasm.behavior.m.class.getName());
                        Class.forName(n.class.getName());
                        Class.forName(o.class.getName());
                        Class.forName(q.class.getName());
                        Class.forName(PaintingContext.class.getName());
                        Class.forName(s.class.getName());
                        Class.forName(u.class.getName());
                        Class.forName(v.class.getName());
                        Class.forName(w.class.getName());
                        Class.forName(k.class.getName());
                        Class.forName(LayoutNode.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.c.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.d.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.e.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.f.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.g.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.h.class.getName());
                        Class.forName(j.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.b.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.c.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.e.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.g.class.getName());
                        Class.forName(i.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.k.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.m.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.n.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.o.class.getName());
                        Class.forName(p.a.class.getName());
                        Class.forName(p.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.text.q.class.getName());
                        Class.forName(r.a.class.getName());
                        Class.forName(r.class.getName());
                        Class.forName(UIComponent.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.view.b.class.getName());
                        Class.forName(a.AbstractC1260a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.class.getName());
                        Class.forName(LynxBaseUI.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.d.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.image.a.class.getName());
                        Class.forName(a.AbstractC1263a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.text.a.class.getName());
                        Class.forName(AndroidText.class.getName());
                        Class.forName(BackgroundDrawable.a.class.getName());
                        Class.forName(BackgroundDrawable.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.d.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.e.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.f.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.j.class.getName());
                        Class.forName(PropsUpdater.class.getName());
                        Class.forName(Settable.class.getName());
                        Class.forName(com.lynx.tasm.b.c.class.getName());
                        Class.forName(ResourceLoader.class.getName());
                        Class.forName(com.lynx.tasm.c.a.class.getName());
                        Class.forName(com.lynx.tasm.c.d.class.getName());
                        Class.forName(com.lynx.tasm.base.i.class.getName());
                        Class.forName(com.lynx.tasm.provider.a.class.getName());
                        Class.forName(b.a.class.getName());
                        Class.forName(ColorUtils.class.getName());
                        Class.forName(DisplayMetricsHolder.class.getName());
                        Class.forName(com.lynx.tasm.utils.c.class.getName());
                        Class.forName(com.lynx.tasm.utils.f.class.getName());
                        Class.forName(com.lynx.tasm.utils.g.class.getName());
                        Class.forName(com.lynx.tasm.utils.j.class.getName());
                        Class.forName(com.lynx.tasm.utils.m.class.getName());
                        Class.forName(com.lynx.tasm.utils.n.class.getName());
                        Class.forName(ValueUtils.class.getName());
                        Class.forName(com.lynx.tasm.utils.h.class.getName());
                        Class.forName(com.lynx.tasm.e.c.class.getName());
                        Class.forName(com.lynx.tasm.provider.k.class.getName());
                        Class.forName(l.class.getName());
                        Class.forName(com.lynx.tasm.g.a.class.getName());
                        Class.forName(NetworkingModule.class.getName());
                        Class.forName(PromiseImpl.class.getName());
                        Class.forName(com.lynx.react.bridge.b.class.getName());
                        Class.forName(com.lynx.react.bridge.c.class.getName());
                        Class.forName(WritableArray.class.getName());
                        Class.forName(WritableMap.class.getName());
                        Class.forName(LynxTemplateRender.d.class.getName());
                        Class.forName(o.class.getName());
                        Class.forName(TemplateAssembler.class.getName());
                        Class.forName(com.lynx.tasm.f.a.a.class.getName());
                        Class.forName(com.lynx.tasm.a.b.b.class.getName());
                        Class.forName(com.lynx.tasm.a.b.g.class.getName());
                        Class.forName(com.lynx.tasm.a.b.i.class.getName());
                        Class.forName(com.lynx.tasm.behavior.j.class.getName());
                        Class.forName(t.class.getName());
                        Class.forName(com.lynx.tasm.behavior.c.a.a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.b.class.getName());
                        Class.forName(ShadowNode.class.getName());
                        Class.forName(com.lynx.tasm.behavior.shadow.k.class.getName());
                        Class.forName(LynxFlattenUI.class.getName());
                        Class.forName(LynxUI.class.getName());
                        Class.forName(UIBody.a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.scroll.a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.c.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.utils.h.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.view.a.class.getName());
                        Class.forName(LynxUISetter.class.getName());
                        Class.forName(ShadowNodeSetter.class.getName());
                        Class.forName(com.lynx.tasm.utils.i.class.getName());
                        Class.forName(JSProxy.class.getName());
                        Class.forName(com.lynx.tasm.c.b.class.getName());
                        Class.forName(com.lynx.tasm.c.i.class.getName());
                        Class.forName(JavaOnlyArray.class.getName());
                        Class.forName(JavaOnlyMap.class.getName());
                        Class.forName(p.class.getName());
                        Class.forName(LynxView.class.getName());
                        Class.forName(com.lynx.tasm.a.b.d.class.getName());
                        Class.forName(com.lynx.tasm.a.b.e.class.getName());
                        Class.forName(com.lynx.tasm.a.c.a.class.getName());
                        Class.forName(com.lynx.tasm.a.b.class.getName());
                        Class.forName(com.lynx.tasm.a.c.class.getName());
                        Class.forName(AbsInlineImageShadowNode.class.getName());
                        Class.forName(BaseTextShadowNode.class.getName());
                        Class.forName(RawTextShadowNode.class.getName());
                        Class.forName(UIGroup.class.getName());
                        Class.forName(UIShadowProxy.c.class.getName());
                        Class.forName(AbsUIImage.class.getName());
                        Class.forName(FlattenUIText.class.getName());
                        Class.forName(UIText.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.d.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.c.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.a.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.e.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.i.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.a.f.class.getName());
                        Class.forName(com.lynx.tasm.d.c.class.getName());
                        Class.forName(com.lynx.tasm.c.e.class.getName());
                        Class.forName(InlineTextShadowNode.class.getName());
                        Class.forName(TextShadowNode.class.getName());
                        Class.forName(UIBody.class.getName());
                        Class.forName(UIShadowProxy.class.getName());
                        Class.forName(UISimpleView.class.getName());
                        Class.forName(UIScrollView.class.getName());
                        Class.forName(UIView.class.getName());
                        Class.forName(UIList.class.getName());
                        Class.forName(com.lynx.tasm.behavior.ui.list.i.class.getName());
                        Class.forName(com.lynx.devtoolwrapper.a.class.getName());
                        Class.forName(com.lynx.devtoolwrapper.c.class.getName());
                        Class.forName(com.lynx.devtoolwrapper.d.class.getName());
                        Class.forName(LynxInspectorManager.class.getName());
                        if (com.lynx.tasm.utils.f.f57033a == null) {
                            com.lynx.tasm.utils.f.f57033a = new com.lynx.tasm.utils.f();
                        }
                        SystemClock.uptimeMillis();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
