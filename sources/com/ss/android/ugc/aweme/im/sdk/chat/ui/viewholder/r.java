package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class r extends a<TextContent> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f101458a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f101459b;
    private final TextView x;

    static {
        Covode.recordClassIndex(64879);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        this.x.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f101458a = view.getContext();
        View findViewById = view.findViewById(R.id.ddq);
        l.b(findViewById, "");
        this.f101459b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cze);
        l.b(findViewById2, "");
        this.x = (TextView) findViewById2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final /* synthetic */ void a(ai aiVar, ai aiVar2, TextContent textContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, textContent, i2);
        this.f101459b.setText("");
        TextView textView = this.x;
        Context context = this.f101458a;
        l.b(context, "");
        textView.setText(context.getResources().getText(R.string.sn));
        this.x.setTag(50331648, 41);
        this.x.setTag(67108864, this.s);
    }
}
