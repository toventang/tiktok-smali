package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.k.h;
import com.ss.android.ugc.aweme.shortvideo.k.i;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.video.hashtag.a;
import com.ss.android.ugc.tools.utils.d;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dj {

    /* renamed from: a  reason: collision with root package name */
    public static String f142825a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f142826b = "";

    static {
        Covode.recordClassIndex(93435);
    }

    public static String a() {
        if (!i.a()) {
            if (!TextUtils.isEmpty(h.a()) && TextUtils.isEmpty(f142826b)) {
                f142826b = "#($newHashTagRegexSetting)+";
            }
            if (!TextUtils.isEmpty(f142826b)) {
                return f142826b;
            }
            if (!TextUtils.isEmpty(f142825a)) {
                return f142825a;
            }
            return "#([\\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]|[\\uFF61-\\uFF9F\\uFFE8-\\uFFEE\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u3040-\\u309F\\u30A0-\\u30FF\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]|(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?]))+";
        } else if (!TextUtils.isEmpty(f142825a)) {
            return f142825a;
        } else {
            return "#([\\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]|[\\uFF61-\\uFF9F\\uFFE8-\\uFFEE\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u3040-\\u309F\\u30A0-\\u30FF\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]|(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?]))+";
        }
    }

    public static boolean a(String str) {
        return Pattern.compile(a() + "$").matcher(str).find();
    }

    public static ArrayList<String> a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static a b(String str, String str2) {
        a aVar = new a();
        aVar.f143394a = str.length();
        aVar.f143396c = "#" + str2 + " ";
        aVar.f143395b = aVar.f143394a + aVar.f143396c.length();
        return aVar;
    }

    public static boolean a(List<AVTextExtraStruct> list, String str) {
        if (!d.a(list) && !TextUtils.isEmpty(str)) {
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                if (TextUtils.equals(aVTextExtraStruct.getHashTagName(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
