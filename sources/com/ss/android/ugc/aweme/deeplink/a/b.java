package com.ss.android.ugc.aweme.deeplink.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.r;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f79430a = new HashMap() {
        /* class com.ss.android.ugc.aweme.deeplink.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(49329);
        }

        {
            put("(?:share/)?@.*/video/(\\w+)/?", 0);
            put("(?:share/)?@.*/live/(\\w+)/?", 1);
            put("(?:share/)?@([\\w\\.]+)/?", 2);
            put("(?:share/)?tag/([^/?]+)", 3);
            put("(?:share/)?music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 4);
            put("(?:share/)?playlist-music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 25);
            put("(?:share/)?stickers?/(?:detail/)?(?:.*-)?(\\w+)/?", 5);
            put("(?:share/)?question/[^/?]*-(\\d+)(?=(?:[?/]|$))", 23);
            put("(?:share/)?discover/([^/?]+)", 24);
        }
    };

    static {
        Covode.recordClassIndex(49328);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.a.a
    public final Uri a(Uri uri) {
        String str;
        String str2;
        if (uri != null) {
            String[] a2 = r.a.a();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                str = "";
                if (i3 >= 34) {
                    str2 = str;
                    break;
                } else if (TextUtils.equals(a2[i3], uri.getHost())) {
                    str2 = a2[i3];
                    break;
                } else {
                    i3++;
                }
            }
            if (!str2.isEmpty()) {
                String uri2 = uri.toString();
                if (TextUtils.equals(uri.getPath(), "/") && uri.getQueryParameterNames().isEmpty()) {
                    return Uri.parse("musically://feed");
                }
                if (TextUtils.isEmpty(uri.getPath()) && uri.getQueryParameterNames().isEmpty()) {
                    return Uri.parse("musically://feed");
                }
                if (Pattern.compile("@([\\w\\.]+)/live").matcher(uri.toString()).find()) {
                    return a(uri, 18, uri.getPathSegments().get(0));
                }
                if (Pattern.compile("(?:share/)?discover/([^/?]+)").matcher(uri.toString()).find()) {
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments != null && pathSegments.size() > 1) {
                        str = pathSegments.get(1);
                    }
                    return a(uri, 24, str);
                } else if (Pattern.compile("api/social/invitation/redirect/").matcher(uri.toString()).find() || (Pattern.compile("(?:share/)?@([\\w\\.]+)/?").matcher(uri.toString()).find() && !TextUtils.isEmpty(uri.getQueryParameter("invitation_code")))) {
                    return a(uri, 22, str);
                } else {
                    if (Pattern.compile("ask-on-tiktok-2021").matcher(uri.toString()).find()) {
                        String a3 = EOYServiceImpl.b().a();
                        if (a3 == null || a3.isEmpty()) {
                            return null;
                        }
                        return Uri.parse(a3);
                    }
                    Iterator<String> it = f79430a.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        Matcher matcher = Pattern.compile("https://" + str2 + "/" + next).matcher(uri2);
                        if (matcher.find()) {
                            if (matcher.groupCount() > 0) {
                                str = matcher.group(1);
                            }
                            i2 = f79430a.get(next).intValue();
                        }
                    }
                    return a(uri, i2, str);
                }
            }
        }
        return null;
    }
}
