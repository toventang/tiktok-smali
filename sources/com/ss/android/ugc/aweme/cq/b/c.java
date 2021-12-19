package com.ss.android.ugc.aweme.cq.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.LynxAudio;
import com.bytedance.ies.xelement.LynxBounceView;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.bytedance.ies.xelement.LynxRefreshFooter;
import com.bytedance.ies.xelement.LynxRefreshHeader;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.ies.xelement.LynxSeekerManager;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.blockevent.LynxBlockTouchView;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxInputView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import com.bytedance.ies.xelement.pickview.LynxPickView;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import com.bytedance.ies.xelement.text.inlineimage.LynxInlineImageShadowNode;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextUI;
import com.bytedance.ies.xelement.viewpager.LynxFoldView;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.xelement.experiment.richtext.ExperimentRichTextUI;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.lynx.tasm.ui.image.FrescoInlineImageShadowNode;
import com.lynx.tasm.ui.image.UIFilterImage;
import com.lynx.tasm.ui.image.UIImage;
import com.ss.android.ugc.tiktok.spark_base.R$drawable;
import h.f.b.z;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f78291a = new c();

    public static final class ai extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48558);
        }

        public static final class a implements com.bytedance.ies.xelement.c.a {
            static {
                Covode.recordClassIndex(48559);
            }

            a() {
            }

            @Override // com.bytedance.ies.xelement.c.a
            public final Map<String, String> a() {
                return h.a.ag.a(h.v.a("confirm", "confirm"), h.v.a("cancel", "cancel"), h.v.a("wheel_text_bound_text", "Week"));
            }
        }

        ai(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxPickerViewColumn(jVar, new a());
        }
    }

    public static final class aj extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48560);
        }

        public static final class a implements com.bytedance.ies.xelement.c.a {
            static {
                Covode.recordClassIndex(48561);
            }

            a() {
            }

            @Override // com.bytedance.ies.xelement.c.a
            public final Map<String, String> a() {
                return h.a.ag.a(h.v.a("confirm", "confirm"), h.v.a("cancel", "cancel"), h.v.a("wheel_text_bound_text", "Week"));
            }
        }

        aj(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxPickerViewColumn(jVar, new a());
        }
    }

    private c() {
    }

    public static final class af extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48553);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new AutoHeightInputShadowNode();
        }

        af(String str) {
            super(str);
        }

        static final class a extends h.f.b.m implements h.f.a.b<Context, a> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f78293a = new a();

            static {
                Covode.recordClassIndex(48554);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ a invoke(Context context) {
                Context context2 = context;
                h.f.b.l.d(context2, "");
                return new a(context2);
            }
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            LynxTextAreaView lynxTextAreaView = new LynxTextAreaView(jVar);
            lynxTextAreaView.a(a.f78293a);
            return lynxTextAreaView;
        }
    }

    public static final class ag extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48555);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new AutoHeightInputShadowNode();
        }

        ag(String str) {
            super(str);
        }

        static final class a extends h.f.b.m implements h.f.a.b<Context, a> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f78294a = new a();

            static {
                Covode.recordClassIndex(48556);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ a invoke(Context context) {
                Context context2 = context;
                h.f.b.l.d(context2, "");
                return new a(context2);
            }
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            LynxTextAreaView lynxTextAreaView = new LynxTextAreaView(jVar);
            lynxTextAreaView.a(a.f78294a);
            return lynxTextAreaView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cq.b.c$c  reason: collision with other inner class name */
    public static final class C1821c extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48581);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new FrescoInlineImageShadowNode();
        }

        C1821c(String str) {
            super(str);
        }
    }

    public static final class v extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48601);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new LynxInlineTextShadowNode();
        }

        v(String str) {
            super(str);
        }
    }

    public static final class x extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48603);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new LynxInlineImageShadowNode();
        }

        x(String str) {
            super(str);
        }
    }

    public static final class y extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48604);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new LynxInlineTruncationShadowNode();
        }

        y(String str) {
            super(str);
        }
    }

    public static final class u extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48599);
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            LynxTextShadowNode lynxTextShadowNode = new LynxTextShadowNode();
            a aVar = a.f78301a;
            h.f.b.l.c(aVar, "");
            lynxTextShadowNode.f37449a = aVar;
            return lynxTextShadowNode;
        }

        u(String str) {
            super(str);
        }

        static final class a extends h.f.b.m implements h.f.a.b<Context, a> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f78301a = new a();

            static {
                Covode.recordClassIndex(48600);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ a invoke(Context context) {
                Context context2 = context;
                h.f.b.l.d(context2, "");
                return new a(context2);
            }
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTextUI(jVar);
        }
    }

    static {
        Covode.recordClassIndex(48546);
    }

    public static final class aa extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48548);
        }

        aa(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new LynxPullRefreshView(jVar);
        }
    }

    public static final class ab extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48549);
        }

        ab(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxRefreshHeader(jVar);
        }
    }

    public static final class ac extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48550);
        }

        ac(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxRefreshFooter(jVar);
        }
    }

    public static final class ad extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48551);
        }

        ad(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxInputView(jVar);
        }
    }

    public static final class ae extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48552);
        }

        ae(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxInputView(jVar);
        }
    }

    public static final class ah extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48557);
        }

        ah(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            if (jVar == null) {
                h.f.b.l.b();
            }
            return new LynxFoldHeader(jVar);
        }
    }

    public static final class ak extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48562);
        }

        ak(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxPickView(jVar);
        }
    }

    public static final class al extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48563);
        }

        al(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxPickView(jVar);
        }
    }

    public static final class am extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48564);
        }

        am(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxBlockTouchView(jVar);
        }
    }

    public static final class an extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48565);
        }

        an(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new UISvg(jVar);
        }
    }

    public static final class ao extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48566);
        }

        ao(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new ExperimentRichTextUI(jVar);
        }
    }

    public static final class ap extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48567);
        }

        ap(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTabBarView(jVar);
        }
    }

    public static final class aq extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48568);
        }

        aq(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTabbarItem(jVar);
        }
    }

    public static final class ar extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48569);
        }

        ar(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxViewPager(jVar);
        }
    }

    public static final class as extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48570);
        }

        as(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new LynxViewPager(jVar);
        }
    }

    public static final class at extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48571);
        }

        at(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxViewpagerItem(jVar);
        }
    }

    public static final class au extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48572);
        }

        au(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTabBarView(jVar);
        }
    }

    public static final class av extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48573);
        }

        av(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTabbarItem(jVar);
        }
    }

    public static final class aw extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48574);
        }

        aw(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxViewPager(jVar);
        }
    }

    public static final class ax extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48575);
        }

        ax(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxViewpagerItem(jVar);
        }
    }

    public static final class ay extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48576);
        }

        ay(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            if (jVar == null) {
                h.f.b.l.b();
            }
            return new LynxViewpagerItem(jVar);
        }
    }

    public static final class az extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48577);
        }

        az(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTabBarView(jVar);
        }
    }

    public static final class b extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48578);
        }

        b(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new UIFilterImage(jVar);
        }
    }

    public static final class ba extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48579);
        }

        ba(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxTabbarItem(jVar);
        }
    }

    public static final class d extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48582);
        }

        d(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxScrollView(jVar);
        }
    }

    public static final class e extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48583);
        }

        e(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxImpressionView(jVar);
        }
    }

    public static final class f extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48584);
        }

        f(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxBounceView(jVar);
        }
    }

    public static final class g extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48585);
        }

        g(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new LynxVideoManager(jVar);
        }
    }

    public static final class i extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48587);
        }

        i(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new LynxSeekerManager(jVar);
        }
    }

    public static final class j extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48588);
        }

        j(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            com.bytedance.ies.xelement.b.e player;
            LynxAudio lynxAudio = new LynxAudio(jVar);
            com.bytedance.ies.xelement.defaultimpl.player.impl.c cVar = new com.bytedance.ies.xelement.defaultimpl.player.impl.c();
            cVar.f36996a = new com.ss.android.ugc.aweme.cq.b.a.a();
            cVar.f36997b = new com.ss.android.ugc.aweme.cq.b.a.c();
            cVar.f36998c = R$drawable.icon;
            h.f.b.l.c(cVar, "");
            lynxAudio.f36518a = cVar;
            com.bytedance.ies.xelement.b.i iVar = (com.bytedance.ies.xelement.b.i) lynxAudio.mView;
            if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
                player.a(cVar);
            }
            return lynxAudio;
        }
    }

    public static final class k extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48589);
        }

        k(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return com.ss.android.ugc.aweme.search.h.f121133a.a(jVar);
        }
    }

    public static final class l extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48590);
        }

        l(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new LynxFoldView(jVar);
        }
    }

    public static final class m extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48591);
        }

        m(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return com.ss.android.ugc.aweme.search.h.f121133a.c(jVar);
        }
    }

    public static final class n extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48592);
        }

        n(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return com.ss.android.ugc.aweme.search.h.f121133a.b(jVar);
        }
    }

    public static final class q extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48595);
        }

        q(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxSwiperView(jVar);
        }
    }

    public static final class r extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48596);
        }

        r(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxSwiperView(jVar);
        }
    }

    public static final class s extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48597);
        }

        s(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new UIView(jVar);
        }
    }

    public static final class t extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48598);
        }

        t(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new UIView(jVar);
        }
    }

    public static final class w extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48602);
        }

        w(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            if (jVar == null) {
                h.f.b.l.b();
            }
            return new LynxFoldToolbar(jVar);
        }
    }

    public static final class z extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48605);
        }

        z(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            return new LynxOverlayViewProxy(jVar);
        }
    }

    public static final class bb extends com.lynx.tasm.behavior.a {
        static {
            Covode.recordClassIndex(48580);
        }

        bb(String str) {
            super(str, true);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            return new UIImage(jVar);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxFlattenUI b(com.lynx.tasm.behavior.j jVar) {
            return new FlattenUIImage(jVar);
        }
    }

    public static final class a implements com.bytedance.ies.xelement.text.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.emoji.i.b.a f78292a = new com.ss.android.ugc.aweme.emoji.i.b.a();

        static {
            Covode.recordClassIndex(48547);
        }

        public a(Context context) {
            h.f.b.l.d(context, "");
        }

        @Override // com.bytedance.ies.xelement.text.a.b
        public final Drawable a(Context context, String str) {
            return this.f78292a.a(context, str);
        }
    }

    public static final class o extends com.lynx.tasm.behavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f78297a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f78298d;

        static {
            Covode.recordClassIndex(48593);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(jVar);
            if (this.f78297a && this.f78298d.element != null) {
                lynxBytedLottieView.a((com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c>) this.f78298d.element);
            }
            return lynxBytedLottieView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(boolean z, z.e eVar, String str) {
            super(str);
            this.f78297a = z;
            this.f78298d = eVar;
        }
    }

    public static final class p extends com.lynx.tasm.behavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f78299a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f78300d;

        static {
            Covode.recordClassIndex(48594);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            h.f.b.l.d(jVar, "");
            LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(jVar);
            if (this.f78299a && this.f78300d.element != null) {
                lynxBytedLottieView.a((com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c>) this.f78300d.element);
            }
            return lynxBytedLottieView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(boolean z, z.e eVar, String str) {
            super(str);
            this.f78299a = z;
            this.f78300d = eVar;
        }
    }

    public static final class h extends com.lynx.tasm.behavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f78295a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f78296d;

        static {
            Covode.recordClassIndex(48586);
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
            if (jVar == null) {
                h.f.b.l.b();
            }
            LynxAlphaVideo lynxAlphaVideo = new LynxAlphaVideo(jVar, "");
            if (this.f78295a && this.f78296d.element != null) {
                T t = this.f78296d.element;
                h.f.b.l.c(t, "");
                lynxAlphaVideo.f36590e = t;
            }
            lynxAlphaVideo.f36589d = false;
            return lynxAlphaVideo;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z, z.e eVar, String str) {
            super(str);
            this.f78295a = z;
            this.f78296d = eVar;
        }
    }

    public static final List<com.lynx.tasm.behavior.a> a(boolean z2) {
        z.e eVar = new z.e();
        eVar.element = null;
        z.e eVar2 = new z.e();
        eVar2.element = null;
        if (z2) {
            eVar.element = (T) new a(new com.bytedance.lynx.hybrid.resource.config.j());
            com.bytedance.lynx.hybrid.resource.config.j jVar = new com.bytedance.lynx.hybrid.resource.config.j();
            com.bytedance.lynx.hybrid.resource.config.a aVar = new com.bytedance.lynx.hybrid.resource.config.a(true);
            aVar.a(h.a.n.c(com.bytedance.lynx.hybrid.resource.config.f.GECKO, com.bytedance.lynx.hybrid.resource.config.f.BUILTIN));
            jVar.a(aVar);
            eVar2.element = (T) new a(jVar);
        }
        return h.a.n.c(new l("x-foldview-pro"), new w("x-foldview-toolbar-pro"), new ah("x-foldview-header-pro"), new as("x-viewpager-pro"), new ay("x-viewpager-item-pro"), new az("x-tabbar-pro"), new ba("x-tabbar-item-pro"), new bb("image"), new b("filter-image"), new C1821c("inline-image"), new d("x-scroll-view"), new e("x-impression-view"), new f("x-bounce-view"), new g("x-video"), new h(z2, eVar, "x-alpha-video"), new i("x-video-seek"), new j("x-audio"), new k("search-video"), new m("search-live"), new n("search-horizontal"), new o(z2, eVar2, "x-lottie"), new p(z2, eVar, "lottie-view"), new q("x-swiper"), new r("swiper"), new s("x-swiper-item"), new t("swiper-item"), new u("x-text"), new v("x-inline-text"), new x("x-inline-image"), new y("x-inline-truncation"), new z("x-overlay"), new aa("x-refresh-view"), new ab("x-refresh-header"), new ac("x-refresh-footer"), new ad("x-input"), new ae("input"), new af("x-textarea"), new ag("textarea"), new ai("x-picker-view-column"), new aj("picker-view-column"), new ak("x-picker-view"), new al("picker-view"), new am("x-block-touch"), new an("x-svg"), new ao("experiment-x-rich-text"), new ap("x-tabbar"), new aq("x-tabbar-item"), new ar("x-viewpager"), new at("x-viewpager-item"), new au("x-tabbar"), new av("x-tabbar-item"), new aw("x-viewpager"), new ax("x-viewpager-item"), com.lynx.component.svg.c.a());
    }
}
