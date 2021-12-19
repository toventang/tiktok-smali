package com.ss.android.ugc.aweme.discover.widget;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.a.b;
import com.ss.android.ugc.aweme.discover.model.CorrectPosition;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82826a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(51621);
    }

    public static void a(TextView textView, String str) {
        l.d(textView, "");
        l.d(str, "");
        String string = textView.getResources().getString(R.string.fhx, "");
        l.b(string, "");
        int length = string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) (" “" + str + (char) 8221));
        int i2 = length + 1;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.c4)), 0, i2, 33);
        spannableStringBuilder.setSpan(new b(61, true), 0, i2, 33);
        textView.setText(spannableStringBuilder);
    }

    public static void a(TextView textView, String str, int i2, List<CorrectPosition> list) {
        l.d(textView, "");
        l.d(str, "");
        l.d(list, "");
        String string = textView.getResources().getString(R.string.fhy, "");
        l.b(string, "");
        int length = string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) "“");
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new b(41, true), 0, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.c4)), 0, length, 33);
        for (CorrectPosition correctPosition : list) {
            if (correctPosition.isValid()) {
                int i3 = length + 1;
                try {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), correctPosition.getBegin() + i3, i3 + correctPosition.getEnd() + 1, 33);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        spannableStringBuilder.append((CharSequence) "”");
        textView.setText(spannableStringBuilder);
    }
}
