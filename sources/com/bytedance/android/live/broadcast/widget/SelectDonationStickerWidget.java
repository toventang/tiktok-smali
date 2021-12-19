package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.livesdk.chatroom.c.ak;
import com.bytedance.android.livesdk.chatroom.ui.cy;
import com.bytedance.android.livesdk.j.Cdo;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.z;

public final class SelectDonationStickerWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    TextView f8719a;

    /* renamed from: b  reason: collision with root package name */
    boolean f8720b;

    /* renamed from: c  reason: collision with root package name */
    boolean f8721c;

    /* renamed from: d  reason: collision with root package name */
    private final f.a.b.a f8722d = new f.a.b.a();

    /* renamed from: e  reason: collision with root package name */
    private av f8723e;

    static {
        Covode.recordClassIndex(4462);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.f8721c = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f8722d.a();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f8720b) {
            super.show();
        }
        this.f8721c = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        TextView textView;
        super.onCreate();
        View view = getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.aod);
        } else {
            textView = null;
        }
        this.f8719a = textView;
        View view2 = getView();
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.f8722d.a(com.bytedance.android.livesdk.an.a.a().a(ak.class).d(new a(this)));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b((m) this, dg.class, (h.f.a.b) new b(this));
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectDonationStickerWidget f8724a;

        static {
            Covode.recordClassIndex(4463);
        }

        a(SelectDonationStickerWidget selectDonationStickerWidget) {
            this.f8724a = selectDonationStickerWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ak akVar = (ak) obj;
            if (akVar instanceof ak) {
                this.f8724a.onEvent(akVar);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectDonationStickerWidget f8725a;

        static {
            Covode.recordClassIndex(4465);
        }

        c(SelectDonationStickerWidget selectDonationStickerWidget) {
            this.f8725a = selectDonationStickerWidget;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.core.widget.a.a(p.a(this.f8725a.getContext()), new cy());
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<o, z> {
        final /* synthetic */ SelectDonationStickerWidget this$0;

        static {
            Covode.recordClassIndex(4464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SelectDonationStickerWidget selectDonationStickerWidget) {
            super(1);
            this.this$0 = selectDonationStickerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(o oVar) {
            int i2;
            o oVar2 = oVar;
            l.d(oVar2, "");
            SelectDonationStickerWidget selectDonationStickerWidget = this.this$0;
            View view = selectDonationStickerWidget.getView();
            if (view != null) {
                if (!oVar2.a() || selectDonationStickerWidget.f8721c) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
            if (oVar2.a()) {
                selectDonationStickerWidget.f8720b = true;
                TextView textView = selectDonationStickerWidget.f8719a;
                if (textView != null) {
                    textView.setOnClickListener(new c(selectDonationStickerWidget));
                }
            }
            return z.f158842a;
        }
    }

    public final void onEvent(ak akVar) {
        if (akVar.f15097a != null && akVar.f15098b != null) {
            this.f8723e = akVar.f15097a;
            TextView textView = this.f8719a;
            if (textView != null) {
                textView.setText(akVar.f15098b.f18987a);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                av avVar = this.f8723e;
                if (avVar == null) {
                    l.b();
                }
                dataChannel.b(Cdo.class, avVar);
            }
        }
    }
}
