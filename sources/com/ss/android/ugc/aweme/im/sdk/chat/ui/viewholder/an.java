package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class an extends a<ShareMusicContent> {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101370a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101371b;
    private TuxTextView x;
    private TextView y;
    private View z;

    static {
        Covode.recordClassIndex(64820);
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
        this.f101370a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById3, "");
        this.f101371b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ei7);
        l.b(findViewById5, "");
        this.y = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.a2q);
        l.b(findViewById6, "");
        this.z = findViewById6;
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
            RemoteImageView remoteImageView = this.f101370a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            b.a(remoteImageView, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        RemoteImageView remoteImageView2 = this.f101370a;
        if (remoteImageView2 == null) {
            l.a("iconView");
        }
        b.a(remoteImageView2, new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f});
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareMusicContent shareMusicContent, int i2) {
        l.d(aiVar, "");
        l.d(shareMusicContent, "");
        super.a(aiVar, aiVar2, (BaseContent) shareMusicContent, i2);
        androidx.core.f.a a2 = androidx.core.f.a.a();
        TuxTextView tuxTextView = this.f101371b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        tuxTextView.setText(shareMusicContent.getMusicName());
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
        tuxTextView3.setText(context.getResources().getString(R.string.cg_, a2.b(k.a((long) shareMusicContent.getUserCount()))));
        TextView textView = this.y;
        if (textView == null) {
            l.a("tagView");
        }
        textView.setText(R.string.cg9);
        RemoteImageView remoteImageView = this.f101370a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        q.a(remoteImageView, shareMusicContent.getCoverThumb(), 2131232829, R.drawable.au2);
        this.o.a(50331648, 17);
        this.o.a(67108864, this.s);
    }
}
