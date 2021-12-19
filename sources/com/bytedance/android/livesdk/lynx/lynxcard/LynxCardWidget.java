package com.bytedance.android.livesdk.lynx.lynxcard;

import android.animation.Animator;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ao;
import com.bytedance.android.livesdk.ax;
import com.bytedance.android.livesdk.bj;
import com.bytedance.android.livesdk.browser.g;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public final class LynxCardWidget extends LiveRecyclableWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18783c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final List<d> f18784a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f18785b;

    static {
        Covode.recordClassIndex(11118);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bch;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11119);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        View a2;
        MethodCollector.i(8154);
        for (d dVar : this.f18784a) {
            String str = dVar.f18793a;
            if (!TextUtils.isEmpty(str) && (a2 = g.b.f14420a.a(str)) != null) {
                LinearLayout linearLayout = this.f18785b;
                if (linearLayout == null) {
                    l.a("container");
                }
                linearLayout.removeView(a2);
            }
        }
        g.b.f14420a.f14417a.clear();
        this.f18784a.clear();
        MethodCollector.o(8154);
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxCardWidget f18786a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f18787b;

        static {
            Covode.recordClassIndex(11123);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f18787b;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.ui.LynxCardView");
            ((com.bytedance.android.livesdk.container.k.c) view).setAnimatorFinished(false);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(7957);
            View view = this.f18787b;
            if (view != null) {
                ((com.bytedance.android.livesdk.container.k.c) view).setAnimatorFinished(true);
                LinearLayout linearLayout = this.f18786a.f18785b;
                if (linearLayout == null) {
                    l.a("container");
                }
                linearLayout.removeView(this.f18787b);
                MethodCollector.o(7957);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.container.ui.LynxCardView");
            MethodCollector.o(7957);
            throw nullPointerException;
        }

        e(LynxCardWidget lynxCardWidget, View view) {
            this.f18786a = lynxCardWidget;
            this.f18787b = view;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<h, z> {
        final /* synthetic */ LynxCardWidget this$0;

        static {
            Covode.recordClassIndex(11122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LynxCardWidget lynxCardWidget) {
            super(1);
            this.this$0 = lynxCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            String str = hVar2.f18800a;
            Map<String, Object> map = hVar2.f18801b;
            View a2 = g.b.f14420a.a(str);
            if (a2 != null) {
                View f2 = ((com.bytedance.android.livesdk.container.k.c) a2).getHybridView().getComponent().f();
                Objects.requireNonNull(f2, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
                ((LynxView) f2).updateData(map);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.dataChannel.a((m) this, ao.class, (h.f.a.b) new b(this));
        DataChannelGlobal.f34575d.a(this, this, ax.class, new c(this));
        DataChannelGlobal.f34575d.a(this, this, bj.class, new d(this));
    }

    static final class c extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ LynxCardWidget this$0;

        static {
            Covode.recordClassIndex(11121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LynxCardWidget lynxCardWidget) {
            super(1);
            this.this$0 = lynxCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.lang.String r9) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        ViewParent viewParent = null;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.width = y.a((float) LynxCardConfig.INSTANCE.getWidgetWidth());
            layoutParams.height = y.a((float) LynxCardConfig.INSTANCE.getWidgetHeight());
        }
        View view2 = getView();
        if (view2 != null) {
            viewParent = view2.getParent();
        }
        Objects.requireNonNull(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup.LayoutParams layoutParams2 = ((ViewGroup) viewParent).getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = y.a((float) LynxCardConfig.INSTANCE.getWidgetTopMargin());
        marginLayoutParams.setMarginStart(y.a((float) LynxCardConfig.INSTANCE.getWidgetStartMargin()));
        marginLayoutParams.setMarginEnd(y.a((float) LynxCardConfig.INSTANCE.getWidgetEndMargin()));
        View view3 = getView();
        if (view3 == null) {
            l.b();
        }
        View findViewById = view3.findViewById(R.id.ad7);
        l.b(findViewById, "");
        this.f18785b = (LinearLayout) findViewById;
    }

    static final class b extends h.f.b.m implements h.f.a.b<c, z> {
        final /* synthetic */ LynxCardWidget this$0;

        static {
            Covode.recordClassIndex(11120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxCardWidget lynxCardWidget) {
            super(1);
            this.this$0 = lynxCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            MethodCollector.i(8891);
            c cVar2 = cVar;
            l.d(cVar2, "");
            LynxCardWidget lynxCardWidget = this.this$0;
            com.bytedance.android.livesdk.container.k.c cVar3 = cVar2.f18791a;
            int i2 = cVar2.f18792b;
            if (!cVar3.getInitFinished()) {
                cVar3.a();
            }
            if (cVar3.getParent() == null || !(cVar3.getParent() instanceof ViewGroup)) {
                HashMap hashMap = new HashMap();
                hashMap.put("list_size", Integer.valueOf(lynxCardWidget.f18784a.size()));
                String stackTraceString = Log.getStackTraceString(new Throwable(""));
                l.b(stackTraceString, "");
                hashMap.put("stack_trace", stackTraceString);
                int i3 = 0;
                com.bytedance.android.live.core.d.c.a("ttlive_lynx_card_widget_success_message", 0, hashMap);
                if (lynxCardWidget.f18784a.isEmpty()) {
                    lynxCardWidget.f18784a.add(new d(cVar3.getContainerId(), i2));
                    LinearLayout linearLayout = lynxCardWidget.f18785b;
                    if (linearLayout == null) {
                        l.a("container");
                    }
                    linearLayout.addView(cVar3);
                } else {
                    int size = lynxCardWidget.f18784a.size();
                    while (true) {
                        if (i3 >= size) {
                            lynxCardWidget.f18784a.add(new d(cVar3.getContainerId(), i2));
                            LinearLayout linearLayout2 = lynxCardWidget.f18785b;
                            if (linearLayout2 == null) {
                                l.a("container");
                            }
                            linearLayout2.addView(cVar3);
                        } else if (i2 <= lynxCardWidget.f18784a.get(i3).f18794b) {
                            lynxCardWidget.f18784a.add(i3, new d(cVar3.getContainerId(), i2));
                            LinearLayout linearLayout3 = lynxCardWidget.f18785b;
                            if (linearLayout3 == null) {
                                l.a("container");
                            }
                            linearLayout3.addView(cVar3, i3);
                        } else {
                            i3++;
                        }
                    }
                }
            } else {
                HashMap hashMap2 = new HashMap();
                String name = cVar3.getParent().getClass().getName();
                l.b(name, "");
                hashMap2.put("old_parent", name);
                LinearLayout linearLayout4 = lynxCardWidget.f18785b;
                if (linearLayout4 == null) {
                    l.a("container");
                }
                String name2 = linearLayout4.getClass().getName();
                l.b(name2, "");
                hashMap2.put("container", name2);
                ViewParent parent = cVar3.getParent();
                LinearLayout linearLayout5 = lynxCardWidget.f18785b;
                if (linearLayout5 == null) {
                    l.a("container");
                }
                hashMap2.put("is_equal", Boolean.valueOf(l.a(parent, linearLayout5)));
                hashMap2.put("list_size", Integer.valueOf(lynxCardWidget.f18784a.size()));
                String stackTraceString2 = Log.getStackTraceString(new Throwable(""));
                l.b(stackTraceString2, "");
                hashMap2.put("stack_trace", stackTraceString2);
                com.bytedance.android.live.core.d.c.a("ttlive_lynx_card_widget_error_message", 1, hashMap2);
            }
            z zVar = z.f158842a;
            MethodCollector.o(8891);
            return zVar;
        }
    }
}
