package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.dt;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class PreviewStickerWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8427a = true;

    /* renamed from: b  reason: collision with root package name */
    public final b<Boolean, z> f8428b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<e> f8429c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8430d = R.string.e8j;

    /* renamed from: e  reason: collision with root package name */
    private final int f8431e = 2131234582;

    /* renamed from: f  reason: collision with root package name */
    private final a f8432f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    private final FrameLayout f8433g;

    static {
        Covode.recordClassIndex(4320);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8430d;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8431e;
    }

    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewStickerWidget f8434a;

        /* renamed from: b  reason: collision with root package name */
        private String f8435b;

        static {
            Covode.recordClassIndex(4321);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(PreviewStickerWidget previewStickerWidget) {
            this.f8434a = previewStickerWidget;
        }

        @Override // com.bytedance.android.livesdkapi.host.n
        public final void b(String str) {
            l.d(str, "");
            e invoke = this.f8434a.f8429c.invoke();
            if (invoke != null) {
                invoke.a(str);
                this.f8434a.f8428b.invoke(true);
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.n
        public final void c(String str) {
            if (this.f8434a.f8427a) {
                this.f8434a.f8427a = false;
                return;
            }
            this.f8435b = str;
            b.a.a("livesdk_pm_live_sticker_tab_change").a(this.f8434a.dataChannel).a("tab", str).b();
        }

        @Override // com.bytedance.android.livesdkapi.host.n
        public final void a(String str) {
            l.d(str, "");
            e invoke = this.f8434a.f8429c.invoke();
            if (invoke != null) {
                invoke.b(str);
                this.f8434a.f8428b.invoke(false);
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.n
        public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar) {
            ImageView imageView;
            ImageView imageView2;
            l.d(aVar, "");
            e invoke = this.f8434a.f8429c.invoke();
            if (invoke != null) {
                invoke.a(aVar, com.bytedance.android.live.effect.api.a.f9637b);
                d.e().a(com.bytedance.android.live.effect.api.a.f9637b);
                View view = this.f8434a.getView();
                if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.fmh)) == null || (imageView2 = (ImageView) imageView.findViewById(R.id.fmh)) == null)) {
                    imageView2.setImageResource(2131234582);
                }
                LivePerformanceManager.getInstance().onModuleStop("sticker");
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.n
        public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
            String str;
            String str2;
            ImageView imageView;
            User owner;
            String str3 = "";
            l.d(aVar, str3);
            e invoke = this.f8434a.f8429c.invoke();
            if (invoke != null) {
                invoke.b(aVar, com.bytedance.android.live.effect.api.a.f9637b);
                com.bytedance.android.live.effect.api.a.e e2 = d.e();
                ImageModel imageModel = null;
                e2.c(null);
                e2.d(null);
                e2.a(com.bytedance.android.live.effect.api.a.f9637b);
                e2.a(com.bytedance.android.live.effect.api.a.f9637b, aVar);
                PreviewStickerWidget previewStickerWidget = this.f8434a;
                String str4 = this.f8435b;
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                com.bytedance.android.livesdk.ab.b c2 = b.a.a("live_take_sticker_select").a(previewStickerWidget.dataChannel).b("live_take").c("click");
                if (room == null || (owner = room.getOwner()) == null) {
                    str = null;
                } else {
                    str = owner.getIdStr();
                }
                com.bytedance.android.livesdk.ab.b a2 = c2.g(str).a("sticker_id", aVar.f22995a);
                if (aVar.w) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                a2.a("is_video_sticker", str2).a("tab", str4).a("is_live_take_default", 1).b();
                c.a.a("ttlive_change_sticker").b("preview").a("select_sticker_id", Long.valueOf(aVar.f22995a)).a("select_sticker_name", aVar.f22999e).a();
                DataChannelGlobal.f34575d.a(dt.class, new com.bytedance.android.live.broadcast.api.model.d(com.bytedance.android.live.effect.api.a.f9637b, aVar, this.f8435b));
                View view = this.f8434a.getView();
                if (view != null) {
                    imageView = (ImageView) view.findViewById(R.id.fmh);
                } else {
                    imageView = null;
                }
                com.bytedance.android.live.base.model.b bVar = aVar.f22998d;
                if (bVar != null) {
                    imageModel = bVar.a();
                }
                p.a(imageView, imageModel, 2131234582);
                HashMap hashMap = new HashMap();
                hashMap.put("id", String.valueOf(aVar.f22995a));
                String str5 = aVar.f22999e;
                if (str5 != null) {
                    str3 = str5;
                }
                hashMap.put(StringSet.name, str3);
                LivePerformanceManager.getInstance().onModuleStart("sticker", hashMap);
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.n
        public final int a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            e invoke = this.f8434a.f8429c.invoke();
            if (invoke == null) {
                return -1;
            }
            int a2 = invoke.a(str, str2);
            com.bytedance.android.live.effect.api.a.e e2 = d.e();
            e2.c(str);
            e2.d(str2);
            return a2;
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        l.d(view, "");
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp != null && !iHostApp.isShowStickerView()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.broadcast.ac.class);
            }
            androidx.fragment.app.e a2 = com.bytedance.android.livesdk.utils.p.a(this.context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.fragment.app.e a3 = com.bytedance.android.livesdk.utils.p.a(this.context);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            iHostApp.showStickerView((androidx.appcompat.app.d) a2, a3.getSupportFragmentManager(), com.bytedance.android.live.effect.api.a.f9637b, this.f8433g, this.f8432f);
            b.a.a("pm_live_sticker_click").a(this.dataChannel).b("live_take").c("click").b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewStickerWidget(FrameLayout frameLayout, h.f.a.b<? super Boolean, z> bVar, h.f.a.a<? extends e> aVar) {
        l.d(frameLayout, "");
        l.d(bVar, "");
        l.d(aVar, "");
        this.f8433g = frameLayout;
        this.f8428b = bVar;
        this.f8429c = aVar;
    }
}
