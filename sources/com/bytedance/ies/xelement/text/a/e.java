package com.bytedance.ies.xelement.text.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.text.a.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f37441a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b  reason: collision with root package name */
    public static boolean f37442b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f37443c = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(22512);
    }

    public static CharSequence a(Context context, CharSequence charSequence, int i2) {
        c a2 = c.a.a();
        Matcher matcher = f37441a.matcher(charSequence);
        SpannableString spannableString = new SpannableString(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            Drawable a3 = a2.a(context, group);
            if (a3 != null) {
                a3.setBounds(0, 0, (int) ((((float) i2) * ((((float) a3.getIntrinsicWidth()) + 0.0f) / ((float) a3.getIntrinsicHeight()))) + 0.5f), i2);
                spannableString.setSpan(new d(a3, Integer.valueOf(end - start), group), start, end, 33);
            }
        }
        return spannableString;
    }
}
