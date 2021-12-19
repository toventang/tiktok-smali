package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;

public final class PreviewSubscriptionWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8436c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f8437a = d.a(b.f8442a);

    /* renamed from: b  reason: collision with root package name */
    public final i f8438b;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.android.live.broadcast.preview.d.b f8439d = new com.bytedance.android.live.broadcast.preview.d.b();

    /* renamed from: e  reason: collision with root package name */
    private final int f8440e = R.string.enm;

    /* renamed from: f  reason: collision with root package name */
    private final int f8441f = 2131234688;

    static {
        Covode.recordClassIndex(4322);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4323);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8440e;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8441f;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.broadcast.preview.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8442a = new b();

        static {
            Covode.recordClassIndex(4324);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.broadcast.preview.d.a invoke() {
            return new com.bytedance.android.live.broadcast.preview.d.a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f8439d.a();
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ PreviewSubscriptionWidget this$0;

        static {
            Covode.recordClassIndex(4325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewSubscriptionWidget previewSubscriptionWidget) {
            super(0);
            this.this$0 = previewSubscriptionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.live.broadcast.preview.d.a aVar = (com.bytedance.android.live.broadcast.preview.d.a) this.this$0.f8437a.getValue();
            androidx.fragment.app.i iVar = this.this$0.f8438b;
            l.d(aVar, "");
            l.d(iVar, "");
            l.d("PreviewSubscriptionWidget", "");
            if (!aVar.n()) {
                aVar.show(iVar, "PreviewSubscriptionWidget");
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bC;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            d();
        }
        com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_subscribe_icon_show");
        f b2 = u.a().b();
        l.b(b2, "");
        a3.g(String.valueOf(b2.c())).a("show_entrance", "live_take_page").b();
    }

    public PreviewSubscriptionWidget(androidx.fragment.app.i iVar) {
        l.d(iVar, "");
        this.f8438b = iVar;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        l.d(view, "");
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bC;
        l.b(bVar, "");
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_subscribe_icon_click");
        f b2 = u.a().b();
        l.b(b2, "");
        a2.g(String.valueOf(b2.c())).a("click_position", "live_take_page").b();
        e();
        com.bytedance.android.live.broadcast.preview.d.b bVar2 = this.f8439d;
        Context context = this.context;
        l.b(context, "");
        bVar2.a(context, true, (h.f.a.a<z>) new c(this));
    }
}
