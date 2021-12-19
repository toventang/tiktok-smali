package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class ba extends a<ShareUserContent> {
    private RemoteImageView A;
    private TextView B;

    /* renamed from: a  reason: collision with root package name */
    protected RemoteImageView f101389a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101390b;
    private TuxTextView x;
    private RemoteImageView y;
    private RemoteImageView z;

    static {
        Covode.recordClassIndex(64835);
    }

    /* access modifiers changed from: protected */
    public final RemoteImageView i() {
        RemoteImageView remoteImageView = this.f101389a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        return remoteImageView;
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
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        l.b(findViewById2, "");
        this.f101389a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById3, "");
        this.f101390b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.bml);
        l.b(findViewById5, "");
        this.y = (RemoteImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bmm);
        l.b(findViewById6, "");
        this.z = (RemoteImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.bmn);
        l.b(findViewById7, "");
        this.A = (RemoteImageView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.b80);
        l.b(findViewById8, "");
        this.B = (TextView) findViewById8;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnLongClickListener onLongClickListener) {
        l.d(onLongClickListener, "");
        this.o.a(onLongClickListener);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.o.a(onClickListener);
        TextView textView = this.B;
        if (textView == null) {
            l.a("mContentFollowTv");
        }
        textView.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public void a(ShareUserContent shareUserContent) {
        l.d(shareUserContent, "");
        IMUser a2 = g.a(shareUserContent.getUid(), shareUserContent.getSecUid());
        if (a2 == null || a2.getAvatarThumb() == null) {
            RemoteImageView remoteImageView = this.f101389a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            e.a(remoteImageView, 2131232324);
            return;
        }
        RemoteImageView remoteImageView2 = this.f101389a;
        if (remoteImageView2 == null) {
            l.a("iconView");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView2, a2.getAvatarThumb(), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareUserContent shareUserContent, int i2) {
        int i3;
        l.d(aiVar, "");
        l.d(shareUserContent, "");
        super.a(aiVar, aiVar2, (BaseContent) shareUserContent, i2);
        TuxTextView tuxTextView = this.f101390b;
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
        a(shareUserContent);
        RemoteImageView remoteImageView = this.y;
        if (remoteImageView == null) {
            l.a("img1View");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, shareUserContent.getAwemeCoverList().get(0), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        RemoteImageView remoteImageView2 = this.z;
        if (remoteImageView2 == null) {
            l.a("img2View");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView2, shareUserContent.getAwemeCoverList().get(1), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        RemoteImageView remoteImageView3 = this.A;
        if (remoteImageView3 == null) {
            l.a("img3View");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView3, shareUserContent.getAwemeCoverList().get(2), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        IMUser a2 = g.a(shareUserContent.getUid(), shareUserContent.getSecUid());
        if (a2 != null) {
            i3 = a2.getFollowStatus();
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            TextView textView = this.B;
            if (textView == null) {
                l.a("mContentFollowTv");
            }
            textView.setVisibility(0);
        } else {
            TextView textView2 = this.B;
            if (textView2 == null) {
                l.a("mContentFollowTv");
            }
            textView2.setVisibility(8);
        }
        this.o.a(50331648, 21);
        this.o.a(67108864, this.s);
        TextView textView3 = this.B;
        if (textView3 == null) {
            l.a("mContentFollowTv");
        }
        textView3.setTag(50331648, 5);
        TextView textView4 = this.B;
        if (textView4 == null) {
            l.a("mContentFollowTv");
        }
        textView4.setTag(67108864, aiVar);
    }
}
