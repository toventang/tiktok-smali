package com.bytedance.push.f;

import android.app.NotificationChannel;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f42109a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42110b = true;

    /* renamed from: c  reason: collision with root package name */
    public String f42111c;

    /* renamed from: d  reason: collision with root package name */
    public String f42112d;

    /* renamed from: e  reason: collision with root package name */
    public int f42113e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42114f;

    /* renamed from: g  reason: collision with root package name */
    public int f42115g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42116h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f42117i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42118j;

    static {
        Covode.recordClassIndex(25741);
    }

    public a(NotificationChannel notificationChannel) {
        this.f42111c = notificationChannel.getId();
        this.f42112d = String.valueOf(notificationChannel.getName());
        this.f42113e = notificationChannel.getImportance();
        this.f42114f = notificationChannel.canBypassDnd();
        this.f42115g = notificationChannel.getLockscreenVisibility();
        this.f42116h = notificationChannel.shouldShowLights();
        this.f42117i = notificationChannel.shouldVibrate();
        this.f42118j = notificationChannel.canShowBadge();
        this.f42109a = notificationChannel.getDescription();
    }

    public a(JSONObject jSONObject) {
        this.f42111c = jSONObject.optString("id");
        this.f42112d = jSONObject.optString(StringSet.name);
        this.f42113e = jSONObject.optInt("importance", 3);
        this.f42114f = jSONObject.optBoolean("bypassDnd", true);
        this.f42115g = jSONObject.optInt("lockscreenVisibility", -1);
        this.f42116h = jSONObject.optBoolean("lights", true);
        this.f42117i = jSONObject.optBoolean("vibration", true);
        this.f42118j = jSONObject.optBoolean("showBadge", true);
        this.f42110b = jSONObject.optBoolean("enable", true);
        this.f42109a = jSONObject.optString("desc");
    }
}
