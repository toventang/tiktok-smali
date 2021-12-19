package com.ss.android.ugc.aweme.utils;

import android.app.Application;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import okhttp3.HttpUrl;

public final class fa {

    /* renamed from: a  reason: collision with root package name */
    public static final fa f142900a = new fa();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Integer> f142901b = new HashMap<>();

    private fa() {
    }

    static {
        Covode.recordClassIndex(93508);
    }

    private static String c(String str) {
        g.a().s();
        return str;
    }

    public static final String a(c cVar) {
        String str = "";
        l.d(cVar, str);
        String path = cVar.getPath();
        if (path != null) {
            str = path;
        }
        if (cVar.isNeedSetCookie()) {
            str = d(str);
        }
        return c(str);
    }

    private static String d(String str) {
        HttpUrl parse;
        l.d(str, "");
        if (p.b(str, "http://", false) || (parse = HttpUrl.parse(str)) == null || parse.queryParameter("ss_is_p_v_ss") != null) {
            return str;
        }
        HttpUrl.Builder newBuilder = parse.newBuilder();
        newBuilder.setQueryParameter("ss_is_p_v_ss", "1");
        String builder = newBuilder.toString();
        l.b(builder, "");
        return builder;
    }

    public static final int a(String str) {
        Integer valueOf;
        if (str == null) {
            return 0;
        }
        HashMap<String, Integer> hashMap = f142901b;
        Integer num = hashMap.get(str);
        if (num != null && num.intValue() > 0) {
            return num.intValue();
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            valueOf = Integer.valueOf(iArr[3]);
        } else {
            e.a("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ".concat(String.valueOf(audioFileInfo)));
            valueOf = Integer.valueOf(com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(str));
        }
        hashMap.put(str, valueOf);
        return valueOf.intValue();
    }

    public static int b(String str) {
        int floatValue;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (str != null) {
            try {
                String uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString();
                l.b(uri, "");
                if (p.b(str, uri, false)) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    l.b(createIAVServiceProxybyMonsterPlugin, "");
                    ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
                    l.b(applicationService, "");
                    Application c2 = applicationService.c();
                    l.b(c2, "");
                    mediaMetadataRetriever.setDataSource(c2, Uri.parse(str));
                    floatValue = (int) Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
                    mediaMetadataRetriever.release();
                    return floatValue;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                mediaMetadataRetriever.release();
                return -1;
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        mediaMetadataRetriever.setDataSource(str);
        floatValue = (int) Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
        try {
            mediaMetadataRetriever.release();
            return floatValue;
        } catch (Exception e4) {
            e4.printStackTrace();
            return floatValue;
        }
    }
}
