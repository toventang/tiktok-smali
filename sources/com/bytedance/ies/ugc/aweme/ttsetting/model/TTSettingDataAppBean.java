package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class TTSettingDataAppBean {
    @com.google.gson.a.c(a = "aweme_live_podcast")
    private b awemeLivePodcast;
    @com.google.gson.a.c(a = "aweme_music_ailab")
    private c awemeMusicAilab;
    @com.google.gson.a.c(a = "aweme_push_monitor_config")
    private d awemePushMonitorConfig;
    @com.google.gson.a.c(a = "aweme_uniqueid_settings")
    private e awemeUniqueidSettings;
    @com.google.gson.a.c(a = "pre_download_delay_days")
    private Integer preDownloadDelayDays;
    @com.google.gson.a.c(a = "pre_download_delay_second")
    private Long preDownloadDelaySecond;
    @com.google.gson.a.c(a = "pre_download_start_time")
    private Integer preDownloadStartTime;
    @com.google.gson.a.c(a = "pre_download_version")
    private Integer preDownloadVersion;
    @com.google.gson.a.c(a = "teens_mode_alert_count")
    private Integer teensModeAlertCount;
    @com.google.gson.a.c(a = "teens_mode_match_alert_switch")
    private Boolean teensModeMatchAlertSwitch;
    @com.google.gson.a.c(a = "update_sdk")
    private Integer updateSdk;
    @com.google.gson.a.c(a = "user_badge_click_settings")
    private a userBadgeClickSettings;

    public static final class a {
        static {
            Covode.recordClassIndex(21097);
        }
    }

    public static final class b {
        @com.google.gson.a.c(a = "can_be_obs_live_podcast")

        /* renamed from: a  reason: collision with root package name */
        public Boolean f35201a;

        static {
            Covode.recordClassIndex(21098);
        }
    }

    public static final class c {
        @com.google.gson.a.c(a = "song_url_list")

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<String> f35202a;
        @com.google.gson.a.c(a = "frame_count")

        /* renamed from: b  reason: collision with root package name */
        public Integer f35203b;
        @com.google.gson.a.c(a = "song_uri")

        /* renamed from: c  reason: collision with root package name */
        public String f35204c;

        static {
            Covode.recordClassIndex(21099);
        }
    }

    public static final class d {
        @com.google.gson.a.c(a = "monitor_live_interval_second")

        /* renamed from: a  reason: collision with root package name */
        public Integer f35205a;
        @com.google.gson.a.c(a = "enable_upload_unactive_apps")

        /* renamed from: b  reason: collision with root package name */
        public Boolean f35206b;
        @com.google.gson.a.c(a = "upload_unactive_app_packages")

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<String> f35207c;
        @com.google.gson.a.c(a = "default_send_data_interval")

        /* renamed from: d  reason: collision with root package name */
        public Integer f35208d;
        @com.google.gson.a.c(a = "max_send_start_info_num")

        /* renamed from: e  reason: collision with root package name */
        public Integer f35209e;
        @com.google.gson.a.c(a = "is_monitor_alive_enable")

        /* renamed from: f  reason: collision with root package name */
        public Integer f35210f;

        static {
            Covode.recordClassIndex(21100);
        }
    }

    public static final class e {
        @com.google.gson.a.c(a = "other_info_enable")

        /* renamed from: a  reason: collision with root package name */
        public Integer f35211a;
        @com.google.gson.a.c(a = "get_phone_enable")

        /* renamed from: b  reason: collision with root package name */
        public Integer f35212b;
        @com.google.gson.a.c(a = "tt_get_mobile_retry_times")

        /* renamed from: c  reason: collision with root package name */
        public Integer f35213c;
        @com.google.gson.a.c(a = "enable_al")

        /* renamed from: d  reason: collision with root package name */
        public Integer f35214d;
        @com.google.gson.a.c(a = "get_mobile_delay")

        /* renamed from: e  reason: collision with root package name */
        public Integer f35215e;

        static {
            Covode.recordClassIndex(21101);
        }
    }

    static {
        Covode.recordClassIndex(21096);
    }

    public final b getAwemeLivePodcast() {
        return this.awemeLivePodcast;
    }

    public final c getAwemeMusicAilab() {
        return this.awemeMusicAilab;
    }

    public final d getAwemePushMonitorConfig() {
        return this.awemePushMonitorConfig;
    }

    public final e getAwemeUniqueidSettings() {
        return this.awemeUniqueidSettings;
    }

    public final Integer getPreDownloadDelayDays() {
        return this.preDownloadDelayDays;
    }

    public final Long getPreDownloadDelaySecond() {
        return this.preDownloadDelaySecond;
    }

    public final Integer getPreDownloadStartTime() {
        return this.preDownloadStartTime;
    }

    public final Integer getPreDownloadVersion() {
        return this.preDownloadVersion;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final Boolean getTeensModeMatchAlertSwitch() {
        return this.teensModeMatchAlertSwitch;
    }

    public final Integer getUpdateSdk() {
        return this.updateSdk;
    }

    public final a getUserBadgeClickSettings() {
        return this.userBadgeClickSettings;
    }

    public final void setAwemeLivePodcast(b bVar) {
        this.awemeLivePodcast = bVar;
    }

    public final void setAwemeMusicAilab(c cVar) {
        this.awemeMusicAilab = cVar;
    }

    public final void setAwemePushMonitorConfig(d dVar) {
        this.awemePushMonitorConfig = dVar;
    }

    public final void setAwemeUniqueidSettings(e eVar) {
        this.awemeUniqueidSettings = eVar;
    }

    public final void setPreDownloadDelayDays(Integer num) {
        this.preDownloadDelayDays = num;
    }

    public final void setPreDownloadDelaySecond(Long l2) {
        this.preDownloadDelaySecond = l2;
    }

    public final void setPreDownloadStartTime(Integer num) {
        this.preDownloadStartTime = num;
    }

    public final void setPreDownloadVersion(Integer num) {
        this.preDownloadVersion = num;
    }

    public final void setTeensModeAlertCount(Integer num) {
        this.teensModeAlertCount = num;
    }

    public final void setTeensModeMatchAlertSwitch(Boolean bool) {
        this.teensModeMatchAlertSwitch = bool;
    }

    public final void setUpdateSdk(Integer num) {
        this.updateSdk = num;
    }

    public final void setUserBadgeClickSettings(a aVar) {
        this.userBadgeClickSettings = aVar;
    }
}
