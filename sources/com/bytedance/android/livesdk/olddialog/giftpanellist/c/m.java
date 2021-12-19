package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class m extends b {

    /* renamed from: a  reason: collision with root package name */
    public final n f20086a;

    /* renamed from: b  reason: collision with root package name */
    private final View f20087b;

    static {
        Covode.recordClassIndex(11860);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(long j2) {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(b.a aVar) {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void b() {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void b(long j2) {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void d() {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void g() {
        this.f20059g = (LiveTextView) this.f20065m.findViewById(R.id.cul);
        LiveTextView liveTextView = this.f20059g;
        l.b(liveTextView, "");
        liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g));
        this.f20060h = (HSImageView) this.f20065m.findViewById(R.id.cuk);
        HSImageView hSImageView = this.f20060h;
        l.b(hSImageView, "");
        hSImageView.setVisibility(0);
    }

    static final class a extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(11861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.this$0.f20086a.a();
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(View view, n nVar) {
        super(view);
        l.d(view, "");
        l.d(nVar, "");
        this.f20087b = view;
        this.f20086a = nVar;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(com.bytedance.android.livesdk.gift.model.a.b<?> bVar, int i2) {
        ImageModel imageModel;
        String str;
        p.a(this.f20087b, new a(this));
        LiveTextView liveTextView = this.f20059g;
        if (liveTextView != null) {
            if (bVar == null || (str = bVar.a()) == null) {
                str = "";
            }
            liveTextView.setText(str);
        }
        HSImageView hSImageView = this.f20060h;
        if (bVar != null) {
            imageModel = bVar.c();
        } else {
            imageModel = null;
        }
        com.bytedance.android.live.core.f.p.a(hSImageView, imageModel, 2131234630);
    }
}
