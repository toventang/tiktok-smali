package com.ss.android.ugc.aweme.livewallpaper.d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.livewallpaper.f.k;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f108879a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f108880b = i.a((h.f.a.a) a.f108881a);

    private static Keva c() {
        return (Keva) f108880b.getValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108881a = new a();

        static {
            Covode.recordClassIndex(69728);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("keva_repo_wallpaper_ab_info");
        }
    }

    static {
        Covode.recordClassIndex(69727);
    }

    public static String b() {
        try {
            JSONObject jSONObject = new JSONObject();
            a[] a2 = b.a();
            for (a aVar : a2) {
                String a3 = aVar.a();
                String b2 = aVar.b();
                jSONObject.put(a3, b2);
                c().storeString(a3, b2);
            }
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            return jSONObject2;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a() {
        MethodCollector.i(6622);
        if (!f.d()) {
            MethodCollector.o(6622);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            a[] a2 = b.a();
            for (a aVar : a2) {
                String string = c().getString(aVar.a(), "");
                String b2 = aVar.b();
                if (!l.a((Object) string, (Object) b2)) {
                    jSONObject.put(aVar.a(), b2);
                }
            }
            if (!jSONObject.keys().hasNext()) {
                MethodCollector.o(6622);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("ab_info", jSONObject.toString());
            d.a().getContentResolver().call(com.ss.android.ugc.aweme.livewallpaper.f.c.f108898c, "update_ab_info", "", bundle);
            Iterator<String> keys = jSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                c().storeString(next, jSONObject.getString(next));
            }
            MethodCollector.o(6622);
        } catch (Throwable unused) {
            MethodCollector.o(6622);
        }
    }

    public static LiveWallPaperBean a(String str) {
        LiveWallPaperBean buildEmptyBean = LiveWallPaperBean.buildEmptyBean();
        if (str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    buildEmptyBean.setVideoPath(jSONObject.optString(k.f108925a, ""));
                    buildEmptyBean.setWidth(jSONObject.optInt(k.f108926b, 0));
                    buildEmptyBean.setHeight(jSONObject.optInt(k.f108927c, 0));
                    buildEmptyBean.setVolume((float) jSONObject.optDouble(k.f108928d, 0.0d));
                    buildEmptyBean.setShouldMute(jSONObject.optBoolean(k.f108929e, true));
                    buildEmptyBean.setSource(jSONObject.optString(k.f108930f, ""));
                }
            } catch (Throwable unused) {
            }
        }
        l.b(buildEmptyBean, "");
        return buildEmptyBean;
    }

    public static String a(LiveWallPaperBean liveWallPaperBean) {
        if (liveWallPaperBean == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(k.f108926b, liveWallPaperBean.getWidth());
        jSONObject.put(k.f108927c, liveWallPaperBean.getHeight());
        jSONObject.put(k.f108928d, Float.valueOf(liveWallPaperBean.getVolume()));
        jSONObject.put(k.f108929e, liveWallPaperBean.isShouldMute());
        jSONObject.put(k.f108930f, liveWallPaperBean.getSource());
        if (!f.d()) {
            jSONObject.put("path", liveWallPaperBean.getVideoPath());
        }
        String jSONObject2 = jSONObject.toString();
        l.b(jSONObject2, "");
        return jSONObject2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.d.c.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
