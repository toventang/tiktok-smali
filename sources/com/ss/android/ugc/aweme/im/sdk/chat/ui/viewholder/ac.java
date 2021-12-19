package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class ac extends a<ShareCompilationContent> {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101329a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101330b;
    private TuxTextView x;
    private TextView y;

    static {
        Covode.recordClassIndex(64803);
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
        this.f101329a = (RemoteImageView) a3;
        Object a4 = a(R.id.title_tv);
        l.b(a4, "");
        this.f101330b = (TuxTextView) a4;
        Object a5 = a(R.id.akl);
        l.b(a5, "");
        this.x = (TuxTextView) a5;
        Object a6 = a(R.id.ei7);
        l.b(a6, "");
        this.y = (TextView) a6;
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
    public ac(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareCompilationContent shareCompilationContent, int i2) {
        long j2;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) shareCompilationContent, i2);
        if (shareCompilationContent != null) {
            TuxTextView tuxTextView = this.f101330b;
            if (tuxTextView == null) {
                l.a("titleView");
            }
            tuxTextView.setText(shareCompilationContent.getTitle());
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
            Long viewCount = shareCompilationContent.getViewCount();
            if (viewCount != null) {
                j2 = viewCount.longValue();
            } else {
                j2 = 0;
            }
            objArr[0] = k.a(j2);
            tuxTextView3.setText(resources.getString(R.string.as2, objArr));
            RemoteImageView remoteImageView = this.f101329a;
            if (remoteImageView == null) {
                l.a("iconView");
            }
            q.a(remoteImageView, shareCompilationContent.getCover(), 2131232858, 2131232858);
        }
        TextView textView = this.y;
        if (textView == null) {
            l.a("tagView");
        }
        textView.setText(R.string.as7);
        this.o.a(50331648, 38);
        this.o.a(67108864, this.s);
    }
}
