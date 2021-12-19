package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class ar extends a<ShareQnAContent> {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101376a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101377b;
    private TuxTextView x;

    static {
        Covode.recordClassIndex(64824);
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
        this.f101376a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById3, "");
        this.f101377b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
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
            RemoteImageView remoteImageView = this.f101376a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            b.a(remoteImageView, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        RemoteImageView remoteImageView2 = this.f101376a;
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
        super.a(onLongClickListener);
        this.o.a(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareQnAContent shareQnAContent, int i2) {
        String str;
        long j2;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) shareQnAContent, i2);
        androidx.core.f.a a2 = androidx.core.f.a.a();
        TuxTextView tuxTextView = this.f101377b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        if (shareQnAContent != null) {
            str = shareQnAContent.getQuestionName();
        } else {
            str = null;
        }
        tuxTextView.setText(str);
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
        if (shareQnAContent != null) {
            j2 = (long) shareQnAContent.getUserCount();
        } else {
            j2 = 0;
        }
        objArr[0] = a2.b(k.a(j2));
        tuxTextView3.setText(resources.getString(R.string.cg_, objArr));
        RemoteImageView remoteImageView = this.f101376a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, 2131232831);
        this.o.a(50331649, Boolean.valueOf(t.b(aiVar, shareQnAContent)));
        this.o.a(50331648, 49);
        this.o.a(67108864, this.s);
    }
}
