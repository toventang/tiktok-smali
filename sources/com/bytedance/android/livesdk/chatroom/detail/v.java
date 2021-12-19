package com.bytedance.android.livesdk.chatroom.detail;

import android.text.TextUtils;
import com.bytedance.android.d.a;
import com.bytedance.android.d.d;
import com.bytedance.android.live.u.g;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class v implements d {

    /* renamed from: h  reason: collision with root package name */
    static String[] f15313h = {"player_start", "player_prepare_end", "player_sdk_dns_analysis_end", "player_prepare_block_end", "player_player_dns_analysis_end", "player_tfo_fall_back_time", "player_tcp_connect_end", "player_tcp_first_package_end", "player_first_video_package_end", "player_first_audio_package_end", "player_first_frame_from_player_core", "player_first_frame_render_end", "player_video_device_open_start", "player_video_device_open_end", "player_audio_device_open_start", "player_audio_device_open_end"};

    /* renamed from: i  reason: collision with root package name */
    static String[] f15314i = {"start", "prepare_end", "sdk_dns_analysis_end", "prepare_block_end", "player_dns_analysis_end", "tfo_fall_back_time", "tcp_connect_end", "tcp_first_package_end", "first_video_package_end", "first_audio_package_end", "first_frame_from_player_core", "first_frame_render_end", "video_device_open_start", "video_device_open_end", "audio_device_open_start", "audio_device_open_end"};

    /* renamed from: a  reason: collision with root package name */
    Map<String, Long> f15315a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    Long f15316b;

    /* renamed from: c  reason: collision with root package name */
    a f15317c;

    /* renamed from: d  reason: collision with root package name */
    boolean f15318d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15319e;

    /* renamed from: f  reason: collision with root package name */
    boolean f15320f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f15321g = false;

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.f15321g && this.f15315a.containsKey("start") && this.f15315a.containsKey("first_frame")) {
            g.b(new w(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        long j2;
        Long l2 = this.f15315a.get("start");
        Long l3 = this.f15315a.get("first_frame");
        if (l2 == null || l3 == null) {
            j2 = 0;
        } else {
            j2 = l3.longValue() - l2.longValue();
        }
        a aVar = this.f15317c;
        if (aVar == null || !TextUtils.equals(aVar.f6836b, "draw") || j2 >= 0) {
            return j2;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(8466);
    }

    public final boolean c(String str) {
        return this.f15315a.containsKey(str);
    }

    public final long b(String str) {
        return this.f15315a.get(str).longValue();
    }

    @Override // com.bytedance.android.d.d
    public final void a(a aVar) {
        this.f15317c = aVar;
        if (aVar.f6842h != -1) {
            Long valueOf = Long.valueOf(this.f15317c.f6842h);
            this.f15316b = valueOf;
            a("start", valueOf);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!c(str)) {
            a(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void a(String str, Long l2) {
        if (str != null && l2 != null) {
            this.f15315a.put(str, l2);
        }
    }

    static void a(JSONObject jSONObject, String str, Object obj) {
        if (str != null && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }
}
