package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bl extends a<VideoUpdateTipsContent> {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101412a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f101413b;
    private TextView x;
    private View y;

    static {
        Covode.recordClassIndex(64855);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.agl);
        l.b(findViewById, "");
        this.f101412a = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById2, "");
        this.f101413b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.aei);
        l.b(findViewById3, "");
        this.x = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.adf);
        l.b(findViewById4, "");
        this.o = a.C2518a.a(findViewById4);
        View findViewById5 = this.itemView.findViewById(R.id.ago);
        l.b(findViewById5, "");
        this.y = findViewById5;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.o.a(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnLongClickListener onLongClickListener) {
        l.d(onLongClickListener, "");
        this.o.a(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final /* synthetic */ void a(ai aiVar, ai aiVar2, VideoUpdateTipsContent videoUpdateTipsContent, int i2) {
        VideoUpdateTipsContent videoUpdateTipsContent2 = videoUpdateTipsContent;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, videoUpdateTipsContent2, i2);
        if (videoUpdateTipsContent2 != null) {
            RemoteImageView remoteImageView = this.f101412a;
            if (remoteImageView == null) {
                l.a("coverIv");
            }
            e.a(remoteImageView, videoUpdateTipsContent2.getCover());
            TextView textView = this.f101413b;
            if (textView == null) {
                l.a("titleTv");
            }
            textView.setText(videoUpdateTipsContent2.getTitle());
            TextView textView2 = this.x;
            if (textView2 == null) {
                l.a("contentTv");
            }
            textView2.setText(videoUpdateTipsContent2.getContent());
            if (videoUpdateTipsContent2.isPhoto()) {
                View view = this.y;
                if (view == null) {
                    l.a("coverTipsV");
                }
                view.setVisibility(0);
            } else {
                View view2 = this.y;
                if (view2 == null) {
                    l.a("coverTipsV");
                }
                view2.setVisibility(8);
            }
        }
        this.o.a(50331648, 11);
        this.o.a(67108864, this.s);
    }
}
