package com.ss.android.ugc.aweme.deeplink.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ck.v;
import java.util.Set;

public abstract class a {
    static {
        Covode.recordClassIndex(49327);
    }

    public abstract Uri a(Uri uri);

    public static Uri a(Uri uri, int i2, String str) {
        Uri parse;
        if (!(!TextUtils.isEmpty(str) || i2 == 9 || i2 == 14 || i2 == 15 || i2 == 16 || i2 == 21 || i2 == 22)) {
            return null;
        }
        String str2 = "musically://search?";
        switch (i2) {
            case 0:
                str2 = "musically://detail?id=".concat(String.valueOf(str));
                break;
            case 1:
                str2 = "musically://live?room_id=".concat(String.valueOf(str));
                break;
            case 2:
                str2 = "musically://profile?unique_id=".concat(String.valueOf(str));
                break;
            case 3:
                str2 = "musically://challenge/detail/".concat(String.valueOf(str));
                break;
            case 4:
                str2 = "musically://music/detail/".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                str2 = "musically://stickers/detail/".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                str2 = "musically://profile?id=".concat(String.valueOf(str));
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter("sec_uid");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        str2 = str2 + "&sec_uid=" + queryParameter;
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                str2 = "musically://item?id=".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                str2 = "musically://tag?id=".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                str2 = "musically://game?game_id=".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                str2 = "musically://mix_video/detail/".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                String b2 = v.b(uri.toString(), "id");
                if (!TextUtils.isEmpty(b2)) {
                    str2 = "musically://search/trending?type=" + b2 + "&trending=" + v.b(uri.toString(), "edition_uid");
                    break;
                }
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_SELECT_SCENE:
            default:
                str2 = "";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                str2 = "musically://challenge/detail?id=" + str + "&group=0&is_commerce=1";
                break;
            case 15:
                str2 = "musically://goods/shop/?uid=".concat(String.valueOf(v.b(uri.toString(), "object_id")));
                break;
            case 16:
                str2 = "musically://openRecord?recordParam=sticker&id=".concat(String.valueOf(v.b(uri.toString(), "object_id")));
                break;
            case 17:
                str2 = Uri.parse("musically://webview").buildUpon().appendQueryParameter("url", uri.toString()).build().toString();
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                str2 = "musically://live?unique_id=".concat(String.valueOf(str));
                break;
            case 19:
                str2 = "musically://messages/group?invite_id=".concat(String.valueOf(str));
                break;
            case com.ss.android.ugc.playerkit.model.v.U /*{ENCODED_INT: 20}*/:
                break;
            case 21:
                str2 = uri.getQueryParameter("af_dp");
                break;
            case 22:
                str2 = Uri.parse("musically://feed?").buildUpon().appendQueryParameter("invitation_code", uri.getQueryParameter("invitation_code")).appendQueryParameter("inviter_uid", uri.getQueryParameter("inviter_uid")).appendQueryParameter("inviter_sec_uid", uri.getQueryParameter("inviter_sec_uid")).build().toString();
                break;
            case 23:
                str2 = "musically://qna/detail/".concat(String.valueOf(str));
                break;
            case 24:
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("keyword", str).appendQueryParameter("enter_from", "search_engine").appendQueryParameter("enter_method", "click_open").build().toString();
                break;
            case 25:
                str2 = "musically://assmusic/category?cid=".concat(String.valueOf(str));
                break;
        }
        if (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) {
            return null;
        }
        if (uri == null || TextUtils.equals(Uri.parse(str2).getHost(), "webview")) {
            return parse;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!(queryParameterNames == null || buildUpon == null)) {
            for (String str3 : queryParameterNames) {
                buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
            }
        }
        return buildUpon.build();
    }
}
