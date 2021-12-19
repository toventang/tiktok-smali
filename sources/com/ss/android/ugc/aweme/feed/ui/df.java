package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.experiment.gm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import f.a.d.k;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class df extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f94564b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f94565a;

    /* renamed from: c  reason: collision with root package name */
    private final String f94566c = "isShowVideoDuet";

    /* renamed from: d  reason: collision with root package name */
    private final String f94567d = "uistate";

    /* renamed from: e  reason: collision with root package name */
    private TuxButton f94568e;

    /* renamed from: f  reason: collision with root package name */
    private View f94569f;

    /* renamed from: g  reason: collision with root package name */
    private View f94570g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f94571h;

    static {
        Covode.recordClassIndex(60029);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60030);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f94572a;

        static {
            Covode.recordClassIndex(60031);
        }

        b(df dfVar) {
            this.f94572a = dfVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            Aweme aweme = (Aweme) obj;
            l.d(aweme, "");
            return this.f94572a.a(aweme);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f94573a;

        static {
            Covode.recordClassIndex(60032);
        }

        c(df dfVar) {
            this.f94573a = dfVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94573a.Q.a("video_duet_click", (Object) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        return g.a(bVar, new b(this));
    }

    private static boolean b(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
            l.b(interactStickerStruct, "");
            if (interactStickerStruct.getType() == 16) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        TuxButton tuxButton;
        this.f94569f = view;
        Context context = this.R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        View a2 = com.a.b.c.a((Activity) context, (int) R.layout.t3);
        this.f94570g = a2;
        if (a2 != null) {
            tuxButton = (TuxButton) a2.findViewById(R.id.aq9);
        } else {
            tuxButton = null;
        }
        this.f94568e = tuxButton;
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new c(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!l.a((Object) bVar.f67014a, (Object) "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Aweme aweme = this.L;
        l.b(aweme, "");
        hashMap.put("aweme_state", aweme);
        hashMap.put(this.f94566c, Boolean.valueOf(a(aweme)));
        return new com.ss.android.ugc.aweme.arch.widgets.base.b(this.f94567d, hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.df.c(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public final boolean a(Aweme aweme) {
        if (aweme != null && gm.a() && c(aweme)) {
            if (this.f94571h) {
                return true;
            }
            if (!b(aweme) || gm.b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(8617);
        if (!this.K) {
            View view = this.f94569f;
            if (view instanceof FrameLayout) {
                if (view != null) {
                    ((FrameLayout) view).addView(this.f94570g);
                    this.K = true;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.o(8617);
                    throw nullPointerException;
                }
            }
        }
        if (bVar == null) {
            MethodCollector.o(8617);
            return;
        }
        Object obj = ((Map) bVar.a()).get("aweme_state");
        Aweme aweme = null;
        if (!(obj instanceof Aweme)) {
            obj = null;
        }
        if (obj == null) {
            StringBuilder sb = new StringBuilder("duet Aweme null and content visible ");
            View view2 = this.T;
            l.b(view2, "");
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDuetView", sb.append(view2.getVisibility()).toString());
            MethodCollector.o(8617);
            return;
        }
        Object a2 = bVar.a();
        l.b(a2, "");
        Map map = (Map) a2;
        Object obj2 = map.get(this.f94566c);
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            Object obj3 = map.get("aweme_state");
            if (obj3 instanceof Aweme) {
                aweme = obj3;
            }
            Aweme aweme2 = aweme;
            if (aweme2 == null) {
                MethodCollector.o(8617);
            } else if (bool.booleanValue()) {
                View view3 = this.f94570g;
                if (view3 != null && view3.getVisibility() == 8) {
                    r.a("duet_button_show", new d().a("enter_from", this.M).a("author_id", aweme2.getAuthorUid()).a("group_id", aweme2.getAid()).f66730a);
                }
                View view4 = this.f94570g;
                if (view4 != null) {
                    view4.setVisibility(0);
                    MethodCollector.o(8617);
                    return;
                }
                MethodCollector.o(8617);
            } else {
                View view5 = this.f94570g;
                if (view5 != null) {
                    view5.setVisibility(8);
                    MethodCollector.o(8617);
                    return;
                }
                MethodCollector.o(8617);
            }
        } else {
            MethodCollector.o(8617);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public df(View view, Bundle bundle) {
        super(view, ((Boolean) bv.f89647e.getValue()).booleanValue());
        l.d(bundle, "");
        this.f94565a = bundle;
        this.f94571h = bundle.getBoolean("isDuetChain");
    }
}
