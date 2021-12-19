package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.f.e;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public class bc extends a<ShareUserContent> {

    /* renamed from: a  reason: collision with root package name */
    protected RemoteImageView f101392a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101393b;
    private TuxTextView x;
    private TextView y;

    static {
        Covode.recordClassIndex(64837);
    }

    /* access modifiers changed from: protected */
    public final RemoteImageView i() {
        RemoteImageView remoteImageView = this.f101392a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        return remoteImageView;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.o = a.C2518a.a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        l.b(findViewById2, "");
        this.f101392a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById3, "");
        this.f101393b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ei7);
        l.b(findViewById5, "");
        this.y = (TextView) findViewById5;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void bE_() {
        e b2 = e.b();
        RemoteImageView remoteImageView = this.f101392a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) remoteImageView.getHierarchy();
        l.b(aVar, "");
        aVar.a(b2);
        View view = this.itemView;
        l.b(view, "");
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lm);
        RemoteImageView remoteImageView2 = this.f101392a;
        if (remoteImageView2 == null) {
            l.a("iconView");
        }
        remoteImageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.ej_);
        l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = 0;
        int i2 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart(0);
        layoutParams2.gravity = 16;
        linearLayout.setLayoutParams(layoutParams2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.o.a(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnLongClickListener onLongClickListener) {
        l.d(onLongClickListener, "");
        this.o.a(onLongClickListener);
    }

    /* access modifiers changed from: protected */
    public void a(ShareUserContent shareUserContent) {
        l.d(shareUserContent, "");
        IMUser a2 = g.a(shareUserContent.getUid(), shareUserContent.getSecUid());
        if (a2 == null || a2.getAvatarThumb() == null) {
            RemoteImageView remoteImageView = this.f101392a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            com.ss.android.ugc.aweme.base.e.a(remoteImageView, 2131232324);
            return;
        }
        RemoteImageView remoteImageView2 = this.f101392a;
        if (remoteImageView2 == null) {
            l.a("iconView");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView2, a2.getAvatarThumb(), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareUserContent shareUserContent, int i2) {
        l.d(aiVar, "");
        l.d(shareUserContent, "");
        super.a(aiVar, aiVar2, (BaseContent) shareUserContent, i2);
        TuxTextView tuxTextView = this.f101393b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        tuxTextView.setText(shareUserContent.getName());
        TuxTextView tuxTextView2 = this.x;
        if (tuxTextView2 == null) {
            l.a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.x;
        if (tuxTextView3 == null) {
            l.a("descView");
        }
        tuxTextView3.setText("@" + shareUserContent.getDesc());
        TextView textView = this.y;
        if (textView == null) {
            l.a("tagView");
        }
        textView.setText(R.string.cjg);
        a(shareUserContent);
        this.o.a(50331648, 21);
        this.o.a(67108864, this.s);
    }
}
