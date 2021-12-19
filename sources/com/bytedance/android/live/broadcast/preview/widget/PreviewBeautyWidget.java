package com.bytedance.android.live.broadcast.preview.widget;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;

public final class PreviewBeautyWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8329e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final f f8330a = com.bytedance.android.live.effect.d.a();

    /* renamed from: b  reason: collision with root package name */
    public final b f8331b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.b<Boolean, z> f8332c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<com.bytedance.android.livesdkapi.depend.model.a.e> f8333d;

    /* renamed from: f  reason: collision with root package name */
    private final int f8334f = R.string.eaf;

    /* renamed from: g  reason: collision with root package name */
    private final int f8335g = 2131234568;

    /* renamed from: h  reason: collision with root package name */
    private final c f8336h = new c(this);

    /* renamed from: i  reason: collision with root package name */
    private final i f8337i;

    static {
        Covode.recordClassIndex(4246);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4247);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8334f;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8335g;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.f8330a.a(this.f8331b);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f8330a.b(this.f8331b);
    }

    public static final class b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewBeautyWidget f8338a;

        static {
            Covode.recordClassIndex(4248);
        }

        @Override // com.bytedance.android.live.effect.api.f.a
        public final void a(FilterModel filterModel, float f2) {
            l.d(filterModel, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(PreviewBeautyWidget previewBeautyWidget) {
            this.f8338a = previewBeautyWidget;
        }

        @Override // com.bytedance.android.live.effect.api.f.a
        public final void a(int i2, boolean z, boolean z2) {
            String str;
            List<FilterModel> a2 = this.f8338a.f8330a.a();
            if (i2 < a2.size()) {
                str = a2.get(i2).getFilterId();
            } else {
                str = "";
            }
            if (!com.bytedance.common.utility.m.a(str) && (!l.a((Object) str, (Object) "0"))) {
                c.a.b("ttlive_click_change_filter").b("preview").a("select_filter_id", str).a("select_filter_position", Integer.valueOf(i2)).a();
            }
        }
    }

    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewBeautyWidget f8339a;

        static {
            Covode.recordClassIndex(4249);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(PreviewBeautyWidget previewBeautyWidget) {
            this.f8339a = previewBeautyWidget;
        }

        @Override // com.bytedance.android.live.effect.api.a.g
        public final void a(float f2) {
            com.bytedance.android.livesdkapi.depend.model.a.e invoke = this.f8339a.f8333d.invoke();
            if (invoke != null) {
                invoke.a(LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18948a * f2);
            }
        }

        @Override // com.bytedance.android.live.effect.api.a.g
        public final void b(float f2) {
            com.bytedance.android.livesdkapi.depend.model.a.e invoke = this.f8339a.f8333d.invoke();
            if (invoke != null) {
                invoke.b(LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18948a * f2);
            }
        }

        @Override // com.bytedance.android.live.effect.api.a.g
        public final void c(float f2) {
            com.bytedance.android.livesdkapi.depend.model.a.e invoke = this.f8339a.f8333d.invoke();
            if (invoke != null) {
                invoke.c(LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18948a * f2);
            }
        }
    }

    static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewBeautyWidget f8340a;

        static {
            Covode.recordClassIndex(4250);
        }

        d(PreviewBeautyWidget previewBeautyWidget) {
            this.f8340a = previewBeautyWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f8340a.f8332c.invoke(true);
        }
    }

    static final class e implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewBeautyWidget f8341a;

        static {
            Covode.recordClassIndex(4251);
        }

        e(PreviewBeautyWidget previewBeautyWidget) {
            this.f8341a = previewBeautyWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f8341a.f8332c.invoke(true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        l.d(view, "");
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            v b2 = com.bytedance.android.live.effect.d.b();
            b2.r = new d(this);
            if (!b2.isAdded() && !b2.n()) {
                b2.show(this.f8337i, "LiveBeautyFilterDialogFragment");
                this.f8332c.invoke(false);
            }
        } else {
            c cVar = this.f8336h;
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            v a2 = com.bytedance.android.live.effect.d.a(cVar, new com.bytedance.android.live.effect.model.b("", String.valueOf(b3.c()), "live_take_page"));
            a2.r = new e(this);
            if (!a2.isAdded() && !a2.n()) {
                a2.show(this.f8337i, "beautyDialogTag");
                this.f8332c.invoke(false);
            }
        }
        b.a.a("live_take_beauty_click").a(this.dataChannel).b("live_take").c("click").b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewBeautyWidget(h.f.a.b<? super Boolean, z> bVar, androidx.fragment.app.i iVar, h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> aVar) {
        l.d(bVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
        this.f8332c = bVar;
        this.f8337i = iVar;
        this.f8333d = aVar;
    }
}
