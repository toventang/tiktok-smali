package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.ac;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.broadcast.v;
import com.bytedance.android.live.broadcast.widget.e;
import com.bytedance.android.live.broadcast.widget.h;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class PreviewCoverWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public e f8347a;

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.android.livesdk.ui.a f8348b;

    static {
        Covode.recordClassIndex(4259);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhe;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        g.f12827a.post(new c(this), this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.f8347a;
        if (eVar != null) {
            if (eVar.f8777d != null) {
                eVar.f8777d.b();
                eVar.f8777d = null;
            }
            eVar.f8778e = null;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewCoverWidget f8351a;

        static {
            Covode.recordClassIndex(4262);
        }

        c(PreviewCoverWidget previewCoverWidget) {
            this.f8351a = previewCoverWidget;
        }

        public final void run() {
            HSImageView hSImageView;
            PreviewCoverWidget previewCoverWidget = this.f8351a;
            e eVar = new e(previewCoverWidget.getView(), previewCoverWidget.f8348b, previewCoverWidget.dataChannel);
            View view = previewCoverWidget.getView();
            if (!(view == null || (hSImageView = (HSImageView) view.findViewById(R.id.ccc)) == null)) {
                hSImageView.setImageResource(R.drawable.bu_);
                hSImageView.setOnClickListener(new a(eVar, previewCoverWidget));
            }
            DataChannel dataChannel = previewCoverWidget.dataChannel;
            if (dataChannel != null) {
                dataChannel.b(v.class, eVar);
            }
            DataChannel dataChannel2 = previewCoverWidget.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.b((m) previewCoverWidget, dg.class, (h.f.a.b) new b(eVar));
            }
            previewCoverWidget.f8347a = eVar;
        }
    }

    public PreviewCoverWidget(com.bytedance.android.livesdk.ui.a aVar) {
        l.d(aVar, "");
        this.f8348b = aVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f8349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewCoverWidget f8350b;

        static {
            Covode.recordClassIndex(4260);
        }

        a(e eVar, PreviewCoverWidget previewCoverWidget) {
            this.f8349a = eVar;
            this.f8350b = previewCoverWidget;
        }

        public final void onClick(View view) {
            String str;
            com.bytedance.android.livesdkapi.depend.model.live.i iVar;
            DataChannel dataChannel = this.f8350b.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(ac.class);
            }
            this.f8349a.b();
            DataChannel dataChannel2 = this.f8350b.dataChannel;
            com.bytedance.android.livesdk.ab.b c2 = b.a.a("livesdk_cover_modify_click").c("click");
            if (dataChannel2 == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel2.b(x.class)) == null) {
                str = null;
            } else {
                str = j.a(iVar);
            }
            c2.a("live_type", str).b();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<o, z> {
        final /* synthetic */ e $controller;

        static {
            Covode.recordClassIndex(4261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.$controller = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            e eVar = this.$controller;
            int i2 = (int) oVar2.f7940b;
            ImageModel imageModel = oVar2.f7939a;
            boolean z = oVar2.f7950l;
            if (imageModel != null) {
                eVar.f8782i = e.a(imageModel);
            }
            boolean z2 = true;
            if (i2 == 0 || i2 == 1) {
                eVar.f8775b.setAlpha(1.0f);
                g.a(new com.bytedance.android.live.broadcast.widget.g(eVar, imageModel));
                if (z) {
                    eVar.f8780g.a(com.bytedance.android.live.broadcast.g.class, "head");
                } else {
                    eVar.f8780g.a(com.bytedance.android.live.broadcast.g.class, "last_cover");
                }
                eVar.f8781h = z;
            } else {
                com.bytedance.android.live.base.model.user.b a2 = u.a().b().a();
                if (a2 instanceof User) {
                    g.a(new h(eVar, a2));
                    eVar.f8775b.setAlpha(1.0f);
                    eVar.f8782i = e.a(a2.getAvatarThumb());
                    eVar.f8780g.a(com.bytedance.android.live.broadcast.g.class, "head");
                    eVar.f8781h = true;
                }
                z2 = false;
            }
            com.bytedance.android.livesdk.event.l lVar = new com.bytedance.android.livesdk.event.l();
            lVar.f17202a = 2;
            lVar.f17203b = z2;
            com.bytedance.android.livesdk.an.a.a().a(lVar);
            return z.f158842a;
        }
    }
}
