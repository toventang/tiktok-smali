package com.ss.android.ugc.aweme.emoji.i.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.emoji.views.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f89350a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b  reason: collision with root package name */
    private static boolean f89351b = false;

    /* renamed from: c  reason: collision with root package name */
    private static a f89352c = new a();

    static {
        Covode.recordClassIndex(56144);
    }

    public static int a(String str) {
        int i2 = 0;
        if (!TextUtils.isEmpty(str)) {
            while (f89350a.matcher(str).find()) {
                i2++;
            }
        }
        return i2;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> a2 = a((Context) null, str);
        if (com.bytedance.common.utility.collection.b.a((Collection) a2)) {
            return 0;
        }
        int i2 = 0;
        for (String str2 : a2) {
            i2 += str2.length();
        }
        if (str.length() > i2) {
            return 2;
        }
        if (str.length() == i2) {
            return 1;
        }
        return 0;
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((String) arrayList.get(i2)).length();
            }
            Matcher matcher2 = Pattern.compile("(\\[)([^\\[\\]]+)(])").matcher(str);
            while (matcher2.find()) {
                String group = matcher2.group();
                if (f89352c.a(f.j(), group) != null) {
                    arrayList.add(group);
                }
            }
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                i3 += ((String) arrayList.get(i4)).length();
            }
            if (i3 == 0) {
                return 0;
            }
            if (i3 == str.length()) {
                return 1;
            }
            return 2;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void a(TextView textView) {
        int i2;
        boolean z;
        if (!f89351b) {
            f89351b = true;
            CharSequence text = textView.getText();
            List<String> a2 = a(textView.getContext(), text.toString());
            int size = a2.size();
            if (TextUtils.isEmpty(text) || size <= 0) {
                f89351b = false;
                return;
            }
            SpannableString spannableString = new SpannableString(text);
            a[] aVarArr = (a[]) spannableString.getSpans(0, text.length(), a.class);
            if (aVarArr != null && aVarArr.length > 0) {
                if (aVarArr.length != size) {
                    z = true;
                } else {
                    z = false;
                }
                int length = aVarArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    a aVar = aVarArr[i3];
                    spannableString.removeSpan(aVar);
                    if (i3 < size && !z && !TextUtils.equals(aVar.a(), a2.get(i3))) {
                        z = true;
                    }
                }
                if (!z) {
                    f89351b = false;
                    return;
                }
            }
            boolean z2 = textView instanceof EditText;
            if (z2) {
                i2 = textView.getSelectionStart();
            } else {
                i2 = 0;
            }
            Matcher matcher = f89350a.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String group = matcher.group();
                Drawable a3 = f89352c.a(textView.getContext(), group);
                if (a3 != null) {
                    int lineHeight = textView.getLineHeight();
                    a3.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a3.getIntrinsicWidth()) + 0.0f) / ((float) a3.getIntrinsicHeight()))) + 0.5f), lineHeight);
                    spannableString.setSpan(new a(a3, Integer.valueOf(end - start), group), start, end, 33);
                    if (i2 > start && i2 < end && z2) {
                        ((EditText) textView).setSelection(end);
                    }
                }
            }
            if (z2) {
                Editable editableText = textView.getEditableText();
                if (editableText != null) {
                    editableText.replace(0, text.length(), spannableString);
                }
            } else {
                textView.setText(spannableString);
            }
            f89351b = false;
        }
    }

    public static void a(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.emoji.b.a aVar) {
        f89352c.a(remoteImageView, aVar);
    }

    public static List<String> a(Context context, String str) {
        if ((context == null && (context = f.j()) == null) || TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f89350a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (f89352c.a(context, group) != null) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }
}
