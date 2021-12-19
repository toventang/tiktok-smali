package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;

final /* synthetic */ class i implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity f132550a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f132551b;

    static {
        Covode.recordClassIndex(86749);
    }

    i(ChooseCoverActivity chooseCoverActivity, TextView textView) {
        this.f132550a = chooseCoverActivity;
        this.f132551b = textView;
    }

    @Override // com.ss.android.ugc.asve.editor.g.b
    public final void a(int i2) {
        ChooseCoverActivity chooseCoverActivity = this.f132550a;
        TextView textView = this.f132551b;
        String a2 = chooseCoverActivity.f132508i.a(i2);
        if (TextUtils.isEmpty(a2)) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        textView.setText(a2);
    }
}
