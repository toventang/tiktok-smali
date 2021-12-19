package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class p {
    public static dq<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, al.f51333a);
    public static dq<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, ak.f51332a);
    public static dq<Integer> C = a("measurement.upload.retry_count", 6, 6, an.f51335a);
    public static dq<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, am.f51334a);
    public static dq<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, ap.f51337a);
    public static dq<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, ar.f51339a);
    public static dq<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static dq<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static dq<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static dq<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, aq.f51338a);
    public static dq<Boolean> K = a("measurement.test.boolean_flag", false, false, at.f51341a);
    public static dq<String> L = a("measurement.test.string_flag", "---", "---", as.f51340a);
    public static dq<Long> M = a("measurement.test.long_flag", -1L, -1L, av.f51343a);
    public static dq<Integer> N = a("measurement.test.int_flag", -2, -2, au.f51342a);
    public static dq<Double> O;
    public static dq<Integer> P = a("measurement.experiment.max_ids", 50, 50, aw.f51344a);
    public static dq<Integer> Q = a("measurement.max_bundles_per_iteration", 2, 2, az.f51347a);
    public static dq<Boolean> R = a("measurement.validation.internal_limits_internal_event_params", false, false, ay.f51346a);
    public static dq<Boolean> S = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", true, true, bb.f51351a);
    public static dq<Boolean> T = a("measurement.collection.firebase_global_collection_flag_enabled", true, true, be.f51354a);
    public static dq<Boolean> U = a("measurement.collection.efficient_engagement_reporting_enabled_2", true, true, bd.f51353a);
    public static dq<Boolean> V = a("measurement.collection.redundant_engagement_removal_enabled", false, false, bg.f51356a);
    public static dq<Boolean> W = a("measurement.client.freeride_engagement_fix", true, true, bf.f51355a);
    public static dq<Boolean> X = a("measurement.experiment.enable_experiment_reporting", true, true, bi.f51358a);
    public static dq<Boolean> Y = a("measurement.collection.log_event_and_bundle_v2", true, true, bh.f51357a);
    public static dq<Boolean> Z = a("measurement.quality.checksum", false, false, null);

    /* renamed from: a  reason: collision with root package name */
    static List<dq<?>> f52036a = Collections.synchronizedList(new ArrayList());
    public static dq<Boolean> aA = a("measurement.engagement_time_main_thread", true, true, cp.f51391a);
    public static dq<Boolean> aB = a("measurement.sdk.referrer.delayed_install_referrer_api", false, false, co.f51390a);
    public static dq<Boolean> aC = a("measurement.sdk.screen.disabling_automatic_reporting", false, false, cr.f51393a);
    public static dq<Boolean> aD = a("measurement.sdk.screen.manual_screen_view_logging", false, false, cq.f51392a);
    public static dq<Boolean> aE = a("measurement.gold.enhanced_ecommerce.format_logs", true, true, ct.f51395a);
    public static dq<Boolean> aF = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true, true, cs.f51394a);
    public static dq<Boolean> aG = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true, true, cu.f51396a);
    public static dq<Boolean> aH = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true, true, cx.f51399a);
    public static dq<Boolean> aI = a("measurement.gold.enhanced_ecommerce.updated_schema.client", true, true, cw.f51398a);
    public static dq<Boolean> aJ = a("measurement.gold.enhanced_ecommerce.updated_schema.service", true, true, cz.f51401a);
    public static dq<Boolean> aK = a("measurement.service.configurable_service_limits", true, true, db.f51408a);
    public static dq<Boolean> aL = a("measurement.client.configurable_service_limits", false, false, da.f51407a);
    public static dq<Boolean> aM = a("measurement.androidId.delete_feature", true, true, de.f51412a);
    public static dq<Boolean> aN = a("measurement.client.global_params.dev", false, false, dd.f51411a);
    public static dq<Boolean> aO = a("measurement.service.global_params", false, false, dg.f51414a);
    public static dq<Boolean> aP = a("measurement.service.global_params_in_payload", true, true, di.f51416a);
    public static dq<Boolean> aQ = a("measurement.client.string_reader", true, true, dh.f51415a);
    public static dq<Boolean> aR = a("measurement.sdk.attribution.cache", true, true, dk.f51418a);
    public static dq<Long> aS = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, dj.f51417a);
    public static dq<Boolean> aT = a("measurement.service.database_return_empty_collection", true, true, dm.f51420a);
    private static Set<dq<?>> aU = Collections.synchronizedSet(new HashSet());
    private static dq<Boolean> aV = a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, bo.f51364a);
    private static dq<Boolean> aW = a("measurement.collection.synthetic_data_mitigation", false, false, cy.f51400a);
    private static dq<Boolean> aX = a("measurement.service.ssaid_removal", true, true, dl.f51419a);
    private static dq<Boolean> aY = a("measurement.client.consent_state_v1.dev", false, false, Cdo.f51422a);
    private static dq<Boolean> aZ = a("measurement.service.consent_state_v1", false, false, dn.f51421a);
    public static dq<Boolean> aa = a("measurement.sdk.dynamite.allow_remote_dynamite2", false, false, bk.f51360a);
    public static dq<Boolean> ab = a("measurement.sdk.collection.validate_param_names_alphabetical", true, true, bj.f51359a);
    public static dq<Boolean> ac = a("measurement.collection.event_safelist", true, true, bm.f51362a);
    public static dq<Boolean> ad = a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, bn.f51363a);
    public static dq<Boolean> ae = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, bq.f51366a);
    public static dq<Boolean> af = a("measurement.audience.refresh_event_count_filters_timestamp", false, false, bp.f51365a);
    public static dq<Boolean> ag = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, bs.f51368a);
    public static dq<Boolean> ah = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, br.f51367a);
    public static dq<Boolean> ai = a("measurement.sdk.collection.last_deep_link_referrer2", true, true, bu.f51370a);
    public static dq<Boolean> aj = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, bt.f51369a);
    public static dq<Boolean> ak = a("measurement.sdk.collection.last_gclid_from_referrer2", false, false, bw.f51372a);
    public static dq<Boolean> al = a("measurement.sdk.collection.enable_extend_user_property_size", true, true, bv.f51371a);
    public static dq<Boolean> am = a("measurement.upload.file_lock_state_check", false, false, bx.f51373a);
    public static dq<Boolean> an = a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, ca.f51377a);
    public static dq<Boolean> ao = a("measurement.ga.ga_app_id", false, false, bz.f51375a);
    public static dq<Boolean> ap = a("measurement.lifecycle.app_backgrounded_tracking", true, true, cd.f51379a);
    public static dq<Boolean> aq = a("measurement.lifecycle.app_in_background_parameter", false, false, cc.f51378a);
    public static dq<Boolean> ar = a("measurement.integration.disable_firebase_instance_id", false, false, cf.f51381a);
    public static dq<Boolean> as = a("measurement.lifecycle.app_backgrounded_engagement", false, false, ce.f51380a);
    public static dq<Boolean> at = a("measurement.collection.service.update_with_analytics_fix", false, false, ch.f51383a);
    public static dq<Boolean> au = a("measurement.service.use_appinfo_modified", false, false, cg.f51382a);
    public static dq<Boolean> av = a("measurement.client.firebase_feature_rollout.v1.enable", true, true, cj.f51385a);
    public static dq<Boolean> aw = a("measurement.client.sessions.check_on_reset_and_enable2", true, true, cl.f51387a);
    public static dq<Boolean> ax = a("measurement.config.string.always_update_disk_on_set", true, true, ck.f51386a);
    public static dq<Boolean> ay = a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, cn.f51389a);
    public static dq<Boolean> az = a("measurement.upload.file_truncate_fix", false, false, cm.f51388a);

    /* renamed from: b  reason: collision with root package name */
    public static dq<Long> f52037b = a("measurement.ad_id_cache_time", 10000L, 10000L, s.f52050a);

    /* renamed from: c  reason: collision with root package name */
    public static dq<Long> f52038c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, r.f52049a);

    /* renamed from: d  reason: collision with root package name */
    public static dq<Long> f52039d = a("measurement.config.cache_time", 86400000L, 3600000L, af.f51327a);

    /* renamed from: e  reason: collision with root package name */
    public static dq<String> f52040e = a("measurement.config.url_scheme", "https", "https", ao.f51336a);

    /* renamed from: f  reason: collision with root package name */
    public static dq<String> f52041f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", bc.f51352a);

    /* renamed from: g  reason: collision with root package name */
    public static dq<Integer> f52042g = a("measurement.upload.max_bundles", 100, 100, bl.f51361a);

    /* renamed from: h  reason: collision with root package name */
    public static dq<Integer> f52043h = a("measurement.upload.max_batch_size", 65536, 65536, by.f51374a);

    /* renamed from: i  reason: collision with root package name */
    public static dq<Integer> f52044i = a("measurement.upload.max_bundle_size", 65536, 65536, ci.f51384a);

    /* renamed from: j  reason: collision with root package name */
    public static dq<Integer> f52045j = a("measurement.upload.max_events_per_bundle", 1000, 1000, cv.f51397a);

    /* renamed from: k  reason: collision with root package name */
    public static dq<Integer> f52046k = a("measurement.upload.max_events_per_day", 100000, 100000, df.f51413a);

    /* renamed from: l  reason: collision with root package name */
    public static dq<Integer> f52047l = a("measurement.upload.max_error_events_per_day", 1000, 1000, u.f52052a);

    /* renamed from: m  reason: collision with root package name */
    public static dq<Integer> f52048m = a("measurement.upload.max_public_events_per_day", 50000, 50000, t.f52051a);
    public static dq<Integer> n = a("measurement.upload.max_conversions_per_day", 10000, 10000, w.f52054a);
    public static dq<Integer> o = a("measurement.upload.max_realtime_events_per_day", 10, 10, v.f52053a);
    public static dq<Integer> p = a("measurement.store.max_stored_events_per_app", 100000, 100000, y.f52056a);
    public static dq<String> q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", x.f52055a);
    public static dq<Long> r = a("measurement.upload.backoff_period", 43200000L, 43200000L, ab.f51323a);
    public static dq<Long> s = a("measurement.upload.window_interval", 3600000L, 3600000L, aa.f51322a);
    public static dq<Long> t = a("measurement.upload.interval", 3600000L, 3600000L, ad.f51325a);
    public static dq<Long> u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, ac.f51324a);
    public static dq<Long> v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, ae.f51326a);
    public static dq<Long> w = a("measurement.upload.minimum_delay", 500L, 500L, ah.f51329a);
    public static dq<Long> x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, ag.f51328a);
    public static dq<Long> y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, aj.f51331a);
    public static dq<Long> z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, ai.f51330a);

    static {
        Covode.recordClassIndex(32376);
        Double valueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf, valueOf, ax.f51345a);
    }

    private static <V> dq<V> a(String str, V v2, V v3, dp<V> dpVar) {
        dq<V> dqVar = new dq<>(str, v2, v3, dpVar, (byte) 0);
        f52036a.add(dqVar);
        return dqVar;
    }
}
