package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class ay extends a<ShareStickerContent> {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101383a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101384b;
    private TuxTextView x;
    private TextView y;

    static {
        Covode.recordClassIndex(64831);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        Object a2 = a(R.id.adh);
        l.b(a2, "");
        this.o = a.C2518a.a((View) a2);
        Object a3 = a(R.id.icon_iv);
        l.b(a3, "");
        this.f101383a = (RemoteImageView) a3;
        Object a4 = a(R.id.title_tv);
        l.b(a4, "");
        this.f101384b = (TuxTextView) a4;
        Object a5 = a(R.id.akl);
        l.b(a5, "");
        this.x = (TuxTextView) a5;
        Object a6 = a(R.id.ei7);
        l.b(a6, "");
        this.y = (TextView) a6;
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
            RemoteImageView remoteImageView = this.f101383a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            b.a(remoteImageView, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        RemoteImageView remoteImageView2 = this.f101383a;
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
    public ay(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareStickerContent shareStickerContent, int i2) {
        long j2;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) shareStickerContent, i2);
        if (shareStickerContent != null) {
            TuxTextView tuxTextView = this.f101384b;
            if (tuxTextView == null) {
                l.a("titleView");
            }
            tuxTextView.setText(shareStickerContent.getTitle());
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
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            Long userCount = shareStickerContent.getUserCount();
            if (userCount != null) {
                j2 = userCount.longValue();
            } else {
                j2 = 0;
            }
            objArr[0] = k.a(j2);
            tuxTextView3.setText(resources.getString(R.string.aro, objArr));
            RemoteImageView remoteImageView = this.f101383a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            q.a(remoteImageView, shareStickerContent.getCover(), 2131232827, 2131232827);
        }
        TextView textView = this.y;
        if (textView == null) {
            l.a("tagView");
        }
        textView.setText(R.string.g71);
        this.o.a(50331648, 39);
        this.o.a(67108864, this.s);
    }
}
