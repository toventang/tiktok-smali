package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public class z extends a<ShareChallengeContent> {
    private RemoteImageView A;
    private Drawable B;

    /* renamed from: a  reason: collision with root package name */
    private TuxIconView f101472a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101473b;
    private TuxTextView x;
    private RemoteImageView y;
    private RemoteImageView z;

    static {
        Covode.recordClassIndex(64890);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void bE_() {
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.li);
        if (r.a()) {
            RemoteImageView remoteImageView = this.y;
            if (remoteImageView == null) {
                l.a("img1View");
            }
            b.a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.A;
            if (remoteImageView2 == null) {
                l.a("img3View");
            }
            b.a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.y;
        if (remoteImageView3 == null) {
            l.a("img1View");
        }
        b.a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.A;
        if (remoteImageView4 == null) {
            l.a("img3View");
        }
        b.a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.o = a.C2518a.a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.bji);
        l.b(findViewById2, "");
        this.f101472a = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.icon_iv);
        l.b(findViewById3, "");
        ((RemoteImageView) findViewById3).setVisibility(8);
        View findViewById4 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById4, "");
        this.f101473b = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById5, "");
        this.x = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bml);
        l.b(findViewById6, "");
        this.y = (RemoteImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.bmm);
        l.b(findViewById7, "");
        this.z = (RemoteImageView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.bmn);
        l.b(findViewById8, "");
        this.A = (RemoteImageView) findViewById8;
        e a2 = f.a(a.f101474a);
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        this.B = a2.a(context);
        TuxIconView tuxIconView = this.f101472a;
        if (tuxIconView == null) {
            l.a("iconView");
        }
        Drawable drawable = this.B;
        if (drawable == null) {
            l.a("iconShapeDrawable");
        }
        tuxIconView.setBackground(drawable);
        TuxIconView tuxIconView2 = this.f101472a;
        if (tuxIconView2 == null) {
            l.a("iconView");
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        tuxIconView2.setIconHeight(h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
        TuxIconView tuxIconView3 = this.f101472a;
        if (tuxIconView3 == null) {
            l.a("iconView");
        }
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        tuxIconView3.setIconWidth(h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics())));
        TuxIconView tuxIconView4 = this.f101472a;
        if (tuxIconView4 == null) {
            l.a("iconView");
        }
        tuxIconView4.setTintColorRes(R.attr.bj);
        TuxIconView tuxIconView5 = this.f101472a;
        if (tuxIconView5 == null) {
            l.a("iconView");
        }
        tuxIconView5.setIconRes(R.raw.icon_number);
        TuxIconView tuxIconView6 = this.f101472a;
        if (tuxIconView6 == null) {
            l.a("iconView");
        }
        tuxIconView6.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f101474a = new a();

        static {
            Covode.recordClassIndex(64891);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44780f = Integer.valueOf((int) R.attr.al);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf((float) h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            eVar2.f44778d = 1;
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareChallengeContent shareChallengeContent, int i2) {
        l.d(aiVar, "");
        l.d(shareChallengeContent, "");
        super.a(aiVar, aiVar2, (BaseContent) shareChallengeContent, i2);
        androidx.core.f.a a2 = androidx.core.f.a.a();
        TuxTextView tuxTextView = this.f101473b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        tuxTextView.setText(shareChallengeContent.getTitle());
        TuxTextView tuxTextView2 = this.x;
        if (tuxTextView2 == null) {
            l.a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.x;
        if (tuxTextView3 == null) {
            l.a("descView");
        }
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        tuxTextView3.setText(context.getResources().getString(R.string.cdn, a2.b(k.a(shareChallengeContent.getUserCount()))));
        RemoteImageView remoteImageView = this.y;
        if (remoteImageView == null) {
            l.a("img1View");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, shareChallengeContent.getCoverUrl().get(0), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        RemoteImageView remoteImageView2 = this.z;
        if (remoteImageView2 == null) {
            l.a("img2View");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView2, shareChallengeContent.getCoverUrl().get(1), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        RemoteImageView remoteImageView3 = this.A;
        if (remoteImageView3 == null) {
            l.a("img3View");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView3, shareChallengeContent.getCoverUrl().get(2), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        this.o.a(50331648, 18);
        this.o.a(67108864, shareChallengeContent.getChallengeId());
        this.o.a(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
