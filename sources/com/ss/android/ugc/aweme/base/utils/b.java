package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.zhiliaoapp.musically.R;
import java.lang.Character;
import java.util.Collection;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f68427a = "&";

    static {
        Covode.recordClassIndex(42127);
    }

    private static boolean a(char c2) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c2);
        if (of == Character.UnicodeBlock.BASIC_LATIN || of == Character.UnicodeBlock.LATIN_1_SUPPLEMENT || of == Character.UnicodeBlock.LATIN_EXTENDED_A || of == Character.UnicodeBlock.LATIN_EXTENDED_B || of == Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) {
            return true;
        }
        return false;
    }

    public static boolean b(String str, int i2) {
        if (i2 >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i2);
        if (Character.isDigit(charAt)) {
            return true;
        }
        if (!Character.isLowerCase(charAt) || !a(charAt)) {
            return false;
        }
        return true;
    }

    public static int a(String str, int i2) {
        int charAt;
        char charAt2 = str.charAt(i2);
        if (55296 <= charAt2 && charAt2 <= 56319) {
            int i3 = i2 + 1;
            if (i3 >= str.length() || 118784 > (charAt = ((charAt2 - 55296) * 1024) + (str.charAt(i3) - 56320) + 65536) || charAt > 128895) {
                return -1;
            }
            return 2;
        } else if (8448 <= charAt2 && charAt2 <= 10239) {
            return 1;
        } else {
            if (11013 <= charAt2 && charAt2 <= 11015) {
                return 1;
            }
            if (10548 <= charAt2 && charAt2 <= 10549) {
                return 1;
            }
            if ((12951 <= charAt2 && charAt2 <= 12953) || charAt2 == 169 || charAt2 == 174 || charAt2 == 12349 || charAt2 == 12336 || charAt2 == 11093 || charAt2 == 11036 || charAt2 == 11035 || charAt2 == 11088) {
                return 1;
            }
            int i4 = i2 + 1;
            if (i4 >= str.length() || str.charAt(i4) != 8419) {
                return -1;
            }
            return 2;
        }
    }

    public static SpannableString a(Context context, String str, List<Position> list) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        for (Position position : list) {
            if (position != null) {
                int end = position.getEnd() + 1 + 0;
                int c2 = androidx.core.content.b.c(context, R.color.ng);
                int max = Math.max(0, position.getBegin() + 0);
                if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(c2), max, end, 17);
                }
            }
        }
        return spannableString;
    }

    public static String a(String str, int i2, String str2) {
        int i3;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i2 <= 0) {
            return "";
        }
        if (str.length() <= i2) {
            return str;
        }
        int i4 = -1;
        float f2 = 0.0f;
        do {
            float f3 = 1.0f;
            i3 = i4 + 1;
            if (i3 >= str.length()) {
                break;
            }
            int i5 = 2;
            if (a(str, i3) != 2) {
                if (b(str, i3)) {
                    f3 = 0.5f;
                }
                i5 = 1;
            }
            i4 += i5;
            if (i4 >= str.length()) {
                break;
            }
            f2 += f3;
        } while (f2 <= ((float) i2) + 0.01f);
        if (i3 >= str.length()) {
            return str;
        }
        return str.substring(0, i3) + str2;
    }
}
