package com.ss.android.ugc.aweme.comment.util;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f72859a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(44880);
    }

    public static TuxTextView a(Context context) {
        l.d(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.bj);
        return tuxTextView;
    }

    public static void a(TextView textView, RelationDynamicLabel relationDynamicLabel) {
        String labelInfo;
        l.d(textView, "");
        if (relationDynamicLabel == null || (labelInfo = relationDynamicLabel.getLabelInfo()) == null || labelInfo.length() <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(labelInfo);
        textView.setVisibility(0);
    }
}
