package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

public final class ge {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f51669a = {"app_background", "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter", "session_start_with_rollout", "firebase_campaign"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f51670b = {"_ab", "_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep", "_ssr", "_cmp"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f51671c = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    static {
        Covode.recordClassIndex(32253);
    }

    public static String a(String str) {
        return ho.a(str, f51669a, f51670b);
    }
}
