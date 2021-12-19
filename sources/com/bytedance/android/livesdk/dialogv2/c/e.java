package com.bytedance.android.livesdk.dialogv2.c;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.d.g;
import com.bytedance.android.livesdk.gift.d.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e extends a {

    /* renamed from: l  reason: collision with root package name */
    private final View f17002l;

    static {
        Covode.recordClassIndex(9448);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void d() {
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void f() {
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void g() {
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void h() {
    }

    public static final class b implements p.a {
        static {
            Covode.recordClassIndex(9450);
        }

        b() {
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            com.bytedance.android.live.core.c.a.a("onLoadStarted");
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            com.bytedance.android.live.core.c.a.a("onLoadFailed");
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            com.bytedance.android.live.core.c.a.a("onLoadSuccess");
        }
    }

    static final class a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ DataChannel $dataChannel;

        static {
            Covode.recordClassIndex(9449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DataChannel dataChannel) {
            super(1);
            this.$dataChannel = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            DataChannel dataChannel = this.$dataChannel;
            if (dataChannel != null) {
                dataChannel.c(g.class, new j("gift"));
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(view);
        l.d(view, "");
        this.f17002l = view;
        this.f16961b = (LiveTextView) view.findViewById(R.id.cul);
        this.f16962c = (HSImageView) view.findViewById(R.id.cuk);
        LiveTextView liveTextView = this.f16961b;
        if (liveTextView != null) {
            liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void a(com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar, int i2, DataChannel dataChannel) {
        ImageModel imageModel;
        String str;
        com.bytedance.android.livesdk.utils.p.a(this.f17002l, new a(dataChannel));
        LiveTextView liveTextView = this.f16961b;
        if (liveTextView != null) {
            if (bVar == null || (str = bVar.a()) == null) {
                str = "";
            }
            liveTextView.setText(str);
        }
        HSImageView hSImageView = this.f16962c;
        if (bVar != null) {
            imageModel = bVar.c();
        } else {
            imageModel = null;
        }
        p.a(hSImageView, imageModel, 2131234630, new b());
    }
}
