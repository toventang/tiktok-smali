package com.bytedance.android.live.liveinteract.platform.common.d;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.platform.common.e.a.b;
import com.bytedance.android.live.liveinteract.platform.common.e.a.c;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.livesetting.linkmic.InteractSeiUidEnableSetting;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f11915a;

    /* renamed from: b  reason: collision with root package name */
    private long f11916b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0250a f11917c;

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.d.a$a  reason: collision with other inner class name */
    public interface AbstractC0250a {
        static {
            Covode.recordClassIndex(6518);
        }

        void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar);

        boolean b(int i2);
    }

    static {
        Covode.recordClassIndex(6517);
    }

    public a(AbstractC0250a aVar) {
        this.f11917c = aVar;
    }

    private static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        bVar.f11927c = jSONObject.optInt("width");
        bVar.f11926b = jSONObject.optInt("height");
        bVar.f11925a = jSONObject.optString("background");
        return bVar;
    }

    public final void b(String str) {
        com.bytedance.android.live.liveinteract.platform.common.e.a.a c2;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data") && (c2 = c(jSONObject.getString("app_data").replaceAll("\\\\", ""))) != null) {
                    this.f11917c.a(c2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    private com.bytedance.android.live.liveinteract.platform.common.e.a.a c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        long optLong = jSONObject.optLong("timestamp");
        if (optLong == this.f11915a || !jSONObject.has("ver")) {
            return null;
        }
        int optInt = jSONObject.optInt("ver");
        if (!this.f11917c.b(optInt)) {
            return null;
        }
        this.f11915a = optLong;
        com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar = new com.bytedance.android.live.liveinteract.platform.common.e.a.a();
        aVar.f11921c = optLong;
        aVar.f11920b = optInt;
        aVar.f11919a = jSONObject.optString("vendor");
        aVar.f11922d = jSONObject.optString("channel_id");
        aVar.f11923e = a(new JSONArray(jSONObject.optString("grids")));
        aVar.f11924f = a(jSONObject.optJSONObject("canvas"));
        return aVar;
    }

    private static List<c> a(JSONArray jSONArray) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
            c cVar = new c();
            cVar.f11928a = jSONObject.optInt(StringSet.type);
            if (jSONObject.has("x")) {
                cVar.f11933f = jSONObject.optDouble("x");
            }
            if (jSONObject.has("y")) {
                cVar.f11934g = jSONObject.optDouble("y");
            }
            if (jSONObject.has("w")) {
                cVar.f11931d = jSONObject.optDouble("w");
            }
            if (jSONObject.has("h")) {
                cVar.f11932e = jSONObject.optDouble("h");
            }
            try {
                cVar.f11929b = jSONObject.optLong("account");
            } catch (Exception unused) {
                cVar.f11929b = 0;
            }
            if (jSONObject.has("uid")) {
                cVar.f11937j = jSONObject.opt("uid").toString();
            }
            if (jSONObject.has("uid_str")) {
                cVar.f11938k = jSONObject.optString("uid_str");
            }
            if (jSONObject.has("talk")) {
                cVar.f11939l = jSONObject.optInt("talk");
            }
            if (jSONObject.has("mute_audio")) {
                cVar.f11940m = jSONObject.optInt("mute_audio");
            }
            boolean z2 = true;
            if (jSONObject.has("mute_a")) {
                if (jSONObject.optInt("mute_a") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.o = z;
            }
            if (jSONObject.has("mute_v")) {
                if (jSONObject.optInt("mute_v") != 1) {
                    z2 = false;
                }
                cVar.p = z2;
            }
            if (jSONObject.has("p")) {
                cVar.n = jSONObject.optInt("p");
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final long a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("app_data").replaceAll("\\\\", ""));
                    if (jSONObject2.optLong("timestamp") > 0 && jSONObject2.has("ver")) {
                        this.f11916b = System.currentTimeMillis();
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (this.f11916b == 0) {
            return 0;
        }
        return System.currentTimeMillis() - this.f11916b;
    }

    public static FrameLayout.LayoutParams a(int i2, int i3, int i4, int i5, c cVar) {
        int i6;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        float f2 = (float) i2;
        float f3 = (float) i4;
        float f4 = (float) i3;
        float f5 = (float) i5;
        float max = Math.max(f2 / f3, f4 / f5);
        float f6 = f3 * max;
        float f7 = f5 * max;
        double d2 = (double) f6;
        double d3 = cVar.f11933f;
        Double.isNaN(d2);
        double d4 = (double) ((f6 - f2) / 2.0f);
        Double.isNaN(d4);
        int i7 = (int) (((d3 * d2) + 0.5d) - d4);
        double d5 = (double) f7;
        double d6 = cVar.f11934g;
        Double.isNaN(d5);
        double d7 = (double) ((f7 - f4) / 2.0f);
        Double.isNaN(d7);
        double d8 = cVar.f11931d;
        Double.isNaN(d2);
        double d9 = cVar.f11932e;
        Double.isNaN(d5);
        layoutParams.width = (int) ((d2 * d8) + 0.5d);
        layoutParams.height = (int) ((d5 * d9) + 0.5d);
        layoutParams.leftMargin = i7;
        layoutParams.topMargin = (int) (((d6 * d5) + 0.5d) - d7);
        if (com.bytedance.android.live.uikit.c.a.a(y.e())) {
            i6 = 8388613;
        } else {
            i6 = 8388611;
        }
        layoutParams.gravity = i6;
        return layoutParams;
    }

    public static JSONObject a(LiveCore.InteractConfig interactConfig, List<Region> list, int i2, int i3, Map<String, Integer> map, boolean z) {
        int i4;
        int i5;
        int i6;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", interactConfig.getSeiVersion());
            jSONObject.put("timestamp", System.currentTimeMillis());
            if (!interactConfig.getRtcExtInfo().equals("")) {
                JSONObject optJSONObject = new JSONObject(interactConfig.getRtcExtInfo()).optJSONObject("live_rtc_engine_config");
                jSONObject.put("vendor", optJSONObject.optString("rtc_vendor"));
                jSONObject.put("channel_id", optJSONObject.optString("rtc_channel_id"));
            }
            JSONArray jSONArray = new JSONArray();
            for (Region region : list) {
                if (region.needWriteToSei()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(StringSet.type, region.getMediaType());
                    int i7 = 1;
                    jSONObject2.put("alpha", 1);
                    jSONObject2.put("w", region.getWidth());
                    jSONObject2.put("h", region.getHeight());
                    jSONObject2.put("x", region.getX());
                    jSONObject2.put("y", region.getY());
                    if (InteractSeiUidEnableSetting.INSTANCE.getValue()) {
                        jSONObject2.put("account", region.getUserId());
                    } else {
                        jSONObject2.put("account", 0);
                    }
                    jSONObject2.put("uid", ah.a(region.getInteractId()));
                    jSONObject2.put("uid_str", region.getInteractId());
                    jSONObject2.put("zorder", 0);
                    if (region.isTalking()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    jSONObject2.put("talk", i4);
                    if (region.isMuteAudio()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jSONObject2.put("mute_audio", i5);
                    if (region.isMuteAudio()) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    jSONObject2.put("mute_a", i6);
                    if (region.getInteractId().equals(d.a().f14185f)) {
                        if (!z) {
                            i7 = 0;
                        }
                        jSONObject2.put("mute_v", i7);
                    } else {
                        if (!region.isMuteVideo()) {
                            i7 = 0;
                        }
                        jSONObject2.put("mute_v", i7);
                    }
                    if (map != null && map.containsKey(region.getInteractId())) {
                        jSONObject2.put("p", map.get(region.getInteractId()));
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", i2);
            jSONObject3.put("height", i3);
            jSONObject3.put("background", "#303342");
            jSONObject.put("canvas", jSONObject3);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
