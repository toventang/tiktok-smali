package com.ss.android.ugc.aweme.comment.util;

import android.text.TextUtils;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;

public final class b {
    static {
        Covode.recordClassIndex(44860);
    }

    public static void b(Comment comment, TextView textView) {
        if (!TextUtils.isEmpty(comment.getLabelText())) {
            String a2 = a.a(textView.getResources().getString(R.string.akw), new Object[]{""});
            if (!TextUtils.isEmpty(a2)) {
                textView.setVisibility(0);
                textView.setText(a2);
                if (textView instanceof TuxTextView) {
                    ((TuxTextView) textView).setTuxFont(62);
                    return;
                }
                return;
            }
        }
        textView.setVisibility(8);
    }

    public static void a(Comment comment, TextView textView) {
        String labelText = comment.getLabelText();
        if (TextUtils.isEmpty(labelText) || comment.getLabelType() == 9) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(labelText);
        if (comment.getLabelType() == 1) {
            textView.setTextColor(textView.getResources().getColor(R.color.bh));
        } else {
            textView.setTextColor(textView.getResources().getColor(R.color.c5));
        }
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(72);
        }
    }
}
