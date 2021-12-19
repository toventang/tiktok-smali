package com.bytedance.android.livesdk.lynx.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.LynxBounceView;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxNestedScrollView;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.bytedance.ies.xelement.LynxRefreshFooter;
import com.bytedance.ies.xelement.LynxRefreshHeader;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.blockevent.LynxBlockTouchView;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxInputView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import com.bytedance.ies.xelement.pickview.LynxPickView;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import com.bytedance.ies.xelement.reveal.LynxRevealInnerLeft;
import com.bytedance.ies.xelement.reveal.LynxRevealInnerRight;
import com.bytedance.ies.xelement.reveal.LynxRevealView;
import com.bytedance.ies.xelement.text.inlineimage.LynxInlineImageShadowNode;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextUI;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvas;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.lynx.tasm.ui.image.FrescoInlineImageShadowNode;
import com.lynx.tasm.ui.image.UIFilterImage;
import com.lynx.tasm.ui.image.UIImage;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18804a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f18805b = i.a((h.f.a.a) a.f18806a);

    public static List<com.lynx.tasm.behavior.a> a() {
        return (List) f18805b.getValue();
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(11137);
    }

    static final class a extends m implements h.f.a.a<List<com.lynx.tasm.behavior.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18806a = new a();

        static {
            Covode.recordClassIndex(11138);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.lynx.tasm.behavior.a> invoke() {
            return n.c(new com.lynx.tasm.behavior.a("filter-image") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(11139);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new UIFilterImage(jVar);
                }
            }, new com.lynx.tasm.behavior.a("inline-image") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(11142);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new FrescoInlineImageShadowNode();
                }
            }, new com.lynx.tasm.behavior.a("image") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass23 */

                static {
                    Covode.recordClassIndex(11155);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    return new UIImage(jVar);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxFlattenUI b(j jVar) {
                    return new FlattenUIImage(jVar);
                }
            }, new com.lynx.tasm.behavior.a("a") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass34 */

                static {
                    Covode.recordClassIndex(11168);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1(jVar, jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-svg") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass44 */

                static {
                    Covode.recordClassIndex(11179);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new UISvg(jVar);
                }
            }, new com.lynx.tasm.behavior.a("svg") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass45 */

                static {
                    Covode.recordClassIndex(11180);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new UISvg(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-lottie") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass46 */

                static {
                    Covode.recordClassIndex(11181);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxBytedLottieView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("lottie-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass47 */

                static {
                    Covode.recordClassIndex(11182);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxBytedLottieView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-swiper") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass48 */

                static {
                    Covode.recordClassIndex(11183);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxSwiperView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("swiper") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(11150);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxSwiperView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-swiper-item") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(11163);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new UIView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("swiper-item") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(11174);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new UIView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("textarea") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(11184);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new AutoHeightInputShadowNode();
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxTextAreaView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-textarea") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(11185);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new AutoHeightInputShadowNode();
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxTextAreaView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("input") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(11186);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxInputView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-refresh-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(11187);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    return new LynxPullRefreshView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-refresh-header") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(11188);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxRefreshHeader(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-refresh-footer") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(11140);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxRefreshFooter(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-input") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(11141);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxInputView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-scroll-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(11143);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxScrollView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-impression-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(11144);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxImpressionView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-bounce-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(11145);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxBounceView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-video") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass16 */

                static {
                    Covode.recordClassIndex(11146);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    return new LynxVideoManager(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-text") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass17 */

                static {
                    Covode.recordClassIndex(11147);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new LynxTextShadowNode();
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    if (jVar == null) {
                        l.b();
                    }
                    return new LynxTextUI(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-inline-text") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass18 */

                static {
                    Covode.recordClassIndex(11148);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new LynxInlineTextShadowNode();
                }
            }, new com.lynx.tasm.behavior.a("x-inline-image") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass19 */

                static {
                    Covode.recordClassIndex(11149);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new LynxInlineImageShadowNode();
                }
            }, new com.lynx.tasm.behavior.a("x-inline-truncation") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass20 */

                static {
                    Covode.recordClassIndex(11151);
                }

                @Override // com.lynx.tasm.behavior.a
                public final ShadowNode a() {
                    return new LynxInlineTruncationShadowNode();
                }
            }, new com.lynx.tasm.behavior.a("x-overlay") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass21 */

                static {
                    Covode.recordClassIndex(11152);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxOverlayViewProxy(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-picker-view-column") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(11153);
                }

                /* renamed from: com.bytedance.android.livesdk.lynx.ui.b$a$22$a  reason: collision with other inner class name */
                public static final class C0395a implements com.bytedance.ies.xelement.c.a {
                    static {
                        Covode.recordClassIndex(11154);
                    }

                    C0395a() {
                    }

                    @Override // com.bytedance.ies.xelement.c.a
                    public final Map<String, String> a() {
                        return ag.a(v.a("confirm", "confirm"), v.a("cancel", "cancel"), v.a("wheel_text_bound_text", "Week"));
                    }
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxPickerViewColumn(jVar, new C0395a());
                }
            }, new com.lynx.tasm.behavior.a("picker-view-column") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass24 */

                static {
                    Covode.recordClassIndex(11156);
                }

                /* renamed from: com.bytedance.android.livesdk.lynx.ui.b$a$24$a  reason: collision with other inner class name */
                public static final class C0396a implements com.bytedance.ies.xelement.c.a {
                    static {
                        Covode.recordClassIndex(11157);
                    }

                    C0396a() {
                    }

                    @Override // com.bytedance.ies.xelement.c.a
                    public final Map<String, String> a() {
                        return ag.a(v.a("confirm", "confirm"), v.a("cancel", "cancel"), v.a("wheel_text_bound_text", "Week"));
                    }
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxPickerViewColumn(jVar, new C0396a());
                }
            }, new com.lynx.tasm.behavior.a("x-picker-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass25 */

                static {
                    Covode.recordClassIndex(11158);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxPickView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("picker-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass26 */

                static {
                    Covode.recordClassIndex(11159);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxPickView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-block-touch") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass27 */

                static {
                    Covode.recordClassIndex(11160);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxBlockTouchView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-tabbar") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass28 */

                static {
                    Covode.recordClassIndex(11161);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxTabBarView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-tabbar-item") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass29 */

                static {
                    Covode.recordClassIndex(11162);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxTabbarItem(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-viewpager") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass30 */

                static {
                    Covode.recordClassIndex(11164);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxViewPager(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-viewpager-item") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass31 */

                static {
                    Covode.recordClassIndex(11165);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxViewpagerItem(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-tabbar") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass32 */

                static {
                    Covode.recordClassIndex(11166);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxTabBarView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-tabbar-item") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass33 */

                static {
                    Covode.recordClassIndex(11167);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxTabbarItem(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-viewpager") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass35 */

                static {
                    Covode.recordClassIndex(11169);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxViewPager(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-viewpager-item") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass36 */

                static {
                    Covode.recordClassIndex(11170);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxViewpagerItem(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-reveal-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass37 */

                static {
                    Covode.recordClassIndex(11171);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxRevealView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-reveal-view-inner-left") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass38 */

                static {
                    Covode.recordClassIndex(11172);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxRevealInnerLeft(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-reveal-view-inner-right") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass39 */

                static {
                    Covode.recordClassIndex(11173);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxRevealInnerRight(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-viewpager-pro") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass40 */

                static {
                    Covode.recordClassIndex(11175);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxViewPager(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-viewpager-item-pro") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass41 */

                static {
                    Covode.recordClassIndex(11176);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    l.d(jVar, "");
                    return new LynxViewpagerItem(jVar);
                }
            }, new com.lynx.tasm.behavior.a("x-nested-scroll-view") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass42 */

                static {
                    Covode.recordClassIndex(11177);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    return new LynxNestedScrollView(jVar);
                }
            }, new com.lynx.tasm.behavior.a("canvas") {
                /* class com.bytedance.android.livesdk.lynx.ui.b.a.AnonymousClass43 */

                static {
                    Covode.recordClassIndex(11178);
                }

                @Override // com.lynx.tasm.behavior.a
                public final LynxUI<?> a(j jVar) {
                    return new LynxHeliumCanvas(jVar);
                }
            });
        }
    }
}
