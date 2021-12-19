package com.bytedance.android.livesdkapi.depend.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22960a = a.f22963c;

    static {
        Covode.recordClassIndex(13608);
    }

    Map<String, String> a();

    void a(String str, String str2);

    void a(JSONObject jSONObject);

    Map<String, String> b();

    void c();

    long d();

    void e();

    long f();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f22961a = {"player_start", "player_prepare_end", "player_sdk_dns_analysis_end", "player_prepare_block_end", "player_player_dns_analysis_end", "player_tfo_fall_back_time", "player_tcp_connect_end", "player_tcp_first_package_end", "player_first_video_package_end", "player_first_audio_package_end", "player_first_frame_from_player_core", "player_first_frame_render_end", "player_video_device_open_start", "player_video_device_open_end", "player_audio_device_open_start", "player_audio_device_open_end"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f22962b = {"start", "prepare_end", "sdk_dns_analysis_end", "prepare_block_end", "player_dns_analysis_end", "tfo_fall_back_time", "tcp_connect_end", "tcp_first_package_end", "first_video_package_end", "first_audio_package_end", "first_frame_from_player_core", "first_frame_render_end", "video_device_open_start", "video_device_open_end", "audio_device_open_start", "audio_device_open_end"};

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ a f22963c = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(13609);
        }
    }
}
