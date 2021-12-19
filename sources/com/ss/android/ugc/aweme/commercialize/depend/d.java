package com.ss.android.ugc.aweme.commercialize.depend;

import android.os.Build;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.c;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.ay;
import com.ss.android.ugc.aweme.commercialize.feed.bf;
import com.ss.android.ugc.aweme.commercialize.i.a;
import com.ss.android.ugc.aweme.commercialize.i.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d implements com.ss.android.ugc.aweme.ad.preload.d {
    static {
        Covode.recordClassIndex(45417);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final void a() {
        b.a();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final void a(AwemeRawAd awemeRawAd) {
        String str;
        l.d(awemeRawAd, "");
        if (Build.VERSION.SDK_INT >= 21) {
            String g2 = AdLandPagePreloadServiceImpl.f().g("feed");
            String channelName = awemeRawAd.getChannelName();
            if (TextUtils.isEmpty(g2) || TextUtils.isEmpty(channelName)) {
                str = "";
            } else {
                str = dc.b(g2, channelName);
            }
            if (str != null && str.length() != 0) {
                l.d(str, "");
                File file = new File(str, "resource.android.html");
                if (file.exists() && file.isFile()) {
                    Long creativeId = awemeRawAd.getCreativeId();
                    l.b(creativeId, "");
                    long longValue = creativeId.longValue();
                    String absolutePath = file.getAbsolutePath();
                    l.b(absolutePath, "");
                    String webUrl = awemeRawAd.getWebUrl();
                    String a2 = k.f145061a.a(g2);
                    l.b(a2, "");
                    a aVar = new a(a2, channelName, "feed");
                    l.d(absolutePath, "");
                    if (Build.VERSION.SDK_INT >= 21) {
                        int incrementAndGet = b.f74451a.incrementAndGet();
                        i.a(500).a(new b.C1679b(incrementAndGet, absolutePath)).a(new b.c(incrementAndGet, longValue, webUrl, aVar), i.f4826c, null);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final void a(List<? extends Aweme> list) {
        l.d(list, "");
        l.d(list, "");
        if (!list.isEmpty()) {
            i.b(new bf.a(list), i.f4824a);
        }
        l.d(list, "");
        if (!list.isEmpty()) {
            i.b(new ay.a(list), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final boolean a(String str, String str2) {
        return dc.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final long a(long j2, long j3) {
        if (j2 == b.f74454d && b.f74455e != -1) {
            return j3 - b.f74455e;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final void a(List<String> list, String str, String str2) {
        l.d(str2, "");
        a(list, str, new com.ss.android.ugc.aweme.web.d());
    }

    private static void a(List<String> list, String str, com.bytedance.geckox.f.a aVar) {
        if (list != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = it.next();
                arrayList.add(targetChannel);
            }
            if (str != null) {
                hashMap.put(str, arrayList);
                c a2 = dc.a(str);
                if (a2 != null) {
                    a2.a(hashMap, aVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final void a(String str, String str2, String str3) {
        l.d(str3, "");
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = str;
        arrayList.add(targetChannel);
        if (str2 != null) {
            hashMap.put(str2, arrayList);
            c a2 = dc.a(str2);
            if (a2 != null) {
                a2.a(hashMap, new com.ss.android.ugc.aweme.web.d());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.d
    public final void a(Aweme aweme, List<String> list, String str, String str2) {
        l.d(str2, "");
        if (aweme != null) {
            a(list, str, new com.ss.android.ugc.aweme.web.c(aweme));
        }
    }
}
