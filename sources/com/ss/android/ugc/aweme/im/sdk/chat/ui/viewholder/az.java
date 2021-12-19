package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public class az extends a<ShareStickerContent> {
    private RemoteImageView A;

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101385a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101386b;
    private TuxTextView x;
    private RemoteImageView y;
    private RemoteImageView z;

    static {
        Covode.recordClassIndex(64832);
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
        this.f101385a = (RemoteImageView) a3;
        Object a4 = a(R.id.title_tv);
        l.b(a4, "");
        this.f101386b = (TuxTextView) a4;
        Object a5 = a(R.id.akl);
        l.b(a5, "");
        this.x = (TuxTextView) a5;
        Object a6 = a(R.id.bml);
        l.b(a6, "");
        this.y = (RemoteImageView) a6;
        Object a7 = a(R.id.bmm);
        l.b(a7, "");
        this.z = (RemoteImageView) a7;
        Object a8 = a(R.id.bmn);
        l.b(a8, "");
        this.A = (RemoteImageView) a8;
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
                l.a("coverFirstView");
            }
            b.a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.A;
            if (remoteImageView2 == null) {
                l.a("coverThirdView");
            }
            b.a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.y;
        if (remoteImageView3 == null) {
            l.a("coverFirstView");
        }
        b.a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.A;
        if (remoteImageView4 == null) {
            l.a("coverThirdView");
        }
        b.a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        this.o.a(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnLongClickListener onLongClickListener) {
        super.a(onLongClickListener);
        this.o.a(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareStickerContent shareStickerContent, int i2) {
        long j2;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) shareStickerContent, i2);
        if (shareStickerContent != null) {
            androidx.core.f.a a2 = androidx.core.f.a.a();
            TuxTextView tuxTextView = this.f101386b;
            if (tuxTextView == null) {
                l.a("titleView");
            }
            tuxTextView.setText(shareStickerContent.getTitle());
            TuxTextView tuxTextView2 = this.x;
            if (tuxTextView2 == null) {
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
            objArr[0] = a2.b(k.a(j2));
            tuxTextView2.setText(resources.getString(R.string.aro, objArr));
            TuxTextView tuxTextView3 = this.x;
            if (tuxTextView3 == null) {
                l.a("descView");
            }
            tuxTextView3.setVisibility(0);
            List<UrlModel> awemeCoverList = shareStickerContent.getAwemeCoverList();
            if (awemeCoverList != null && !awemeCoverList.isEmpty() && awemeCoverList.size() >= 3) {
                RemoteImageView remoteImageView = this.y;
                if (remoteImageView == null) {
                    l.a("coverFirstView");
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, awemeCoverList.get(0), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
                RemoteImageView remoteImageView2 = this.z;
                if (remoteImageView2 == null) {
                    l.a("coverSecondView");
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView2, awemeCoverList.get(1), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
                RemoteImageView remoteImageView3 = this.A;
                if (remoteImageView3 == null) {
                    l.a("coverThirdView");
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView3, awemeCoverList.get(2), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
            }
            RemoteImageView remoteImageView4 = this.f101385a;
            if (remoteImageView4 == null) {
                l.a("iconView");
            }
            e.a(remoteImageView4, 2131232868);
        }
        this.o.a(50331648, 39);
        this.o.a(67108864, this.s);
    }
}
