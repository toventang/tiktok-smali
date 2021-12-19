package com.ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(59615);
    }

    public static b a(Activity activity) {
        boolean z;
        int i2;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        AnchorCustomData anchorCustomData;
        boolean z4;
        boolean z5;
        Intent intent = activity.getIntent();
        String a2 = a(intent, "refer");
        String a3 = a(intent, "id");
        String a4 = a(intent, "cid");
        String a5 = a(intent, "like_ids");
        int intExtra = intent.getIntExtra("like_count", 0);
        String a6 = a(intent, "last_group_id");
        String a7 = a(intent, "insert_viewer_ids");
        String a8 = a(intent, "ids");
        String a9 = a(intent, "userid");
        String a10 = a(intent, "sec_userid");
        String a11 = a(intent, "video_from");
        String a12 = a(intent, "video_challenge_profile_from");
        String a13 = a(intent, "music_id");
        String a14 = a(intent, "sticker_id");
        String a15 = a(intent, "challenge_id");
        String a16 = a(intent, "question_id");
        int intExtra2 = intent.getIntExtra("show_answer_question_button", 0);
        String a17 = a(intent, "movie_id");
        String a18 = a(intent, "duet_id");
        String a19 = a(intent, "extra_tutorial_id");
        String a20 = a(intent, "creation_id");
        int intExtra3 = intent.getIntExtra("channel_id", 0);
        String a21 = a(intent, "enter_method");
        String a22 = a(intent, "spu_id");
        int intExtra4 = intent.getIntExtra("rate_type", 1);
        int intExtra5 = intent.getIntExtra("page_size", 20);
        String a23 = a(intent, "promotion_id");
        String a24 = a(intent, "product_id");
        String a25 = a(intent, "carrier_type");
        String a26 = a(intent, "refer_seed_id");
        String a27 = a(intent, "refer_seed_name");
        String a28 = a(intent, "data_type");
        String a29 = a(intent, "entrance_info");
        int intExtra6 = intent.getIntExtra("video_type", -1);
        String a30 = a(intent, "from_uid");
        a(intent, "from_token");
        String a31 = a(intent, "query_aweme_mode");
        String a32 = a(intent, "account_type");
        String a33 = a(intent, "tab_name");
        String a34 = a(intent, "push_params");
        String a35 = a(intent, "like_enter_method");
        String a36 = a(intent, "content_source");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("user_id_list");
        String a37 = a(intent, "translator_id");
        String a38 = a(intent, "is_from_trending_card");
        String a39 = a(intent, "trending_event_id");
        String str3 = "";
        if (a39 == null) {
            a39 = str3;
            str3 = a39;
        }
        String a40 = a(intent, "trending_event_name");
        if (a40 == null) {
            a40 = str3;
        }
        String a41 = a(intent, "enter_from_request_id");
        String a42 = a(intent, "previous_page");
        String a43 = a(intent, "search_keyword");
        String a44 = a(intent, "extra_previous_page_position");
        boolean booleanExtra = intent.getBooleanExtra("from_adsapp_activity", false);
        int intExtra7 = intent.getIntExtra("from_post_list", 0);
        String a45 = a(intent, "extra_parent_tag_id");
        String a46 = a(intent, "related_gid");
        int intExtra8 = intent.getIntExtra(StringSet.type, 0);
        boolean booleanExtra2 = intent.getBooleanExtra("is_recommend", false);
        String a47 = a(intent, "cell_id");
        int intExtra9 = intent.getIntExtra("task_type", 0);
        String a48 = a(intent, "micro_game_station_id");
        String a49 = a(intent, "micro_game_station_hashtag");
        String a50 = a(intent, "extra_hashtag_tagline");
        String a51 = a(intent, "feeds_aweme_id");
        String a52 = a(intent, "hot_search_key");
        String a53 = a(intent, "item_id_list");
        boolean booleanExtra3 = intent.getBooleanExtra("is_hot_search_key", false);
        boolean booleanExtra4 = intent.getBooleanExtra("hot_is_ad", false);
        String a54 = a(intent, "outer_aweme_id");
        int intExtra10 = intent.getIntExtra("micro_game_station_count", 10);
        int intExtra11 = intent.getIntExtra("micro_game_station_cursor", 0);
        String a55 = a(intent, "activity_id");
        String a56 = a(intent, "new_source_type");
        String a57 = a(intent, "new_source_id");
        int intExtra12 = intent.getIntExtra("comment_deleted", 0);
        String a58 = a(intent, "react_session_id");
        String a59 = a(intent, "news_id");
        boolean booleanExtra5 = intent.getBooleanExtra("is_trending", false);
        String a60 = a(intent, "mix_from_order");
        String a61 = a(intent, "process_id");
        boolean booleanExtra6 = intent.getBooleanExtra("isFromSearchTopic", false);
        String a62 = a(intent, "live_enter_method");
        int intExtra13 = intent.getIntExtra("level1_comment_deleted", 0);
        try {
            i2 = 1;
            if (Integer.parseInt(a(intent, "show_poll")) == 1) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception unused) {
            i2 = 1;
            z = false;
        }
        if (intent.getIntExtra("comment_force_open_reply", 0) == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            if (Integer.parseInt(a(intent, "show_poll")) == i2) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception unused2) {
        }
        String a63 = a(intent, "from_group_id");
        String a64 = a(intent, "refer_commodity_id");
        HashMap<String, String> hashMap = new HashMap<>();
        Serializable serializableExtra = intent.getSerializableExtra("feed_param_log_extra");
        if (serializableExtra instanceof String) {
            try {
                hashMap = c.a((String) serializableExtra);
            } catch (Exception e2) {
                new StringBuilder("logExtra parser error  = [").append(serializableExtra).append("]");
                e2.printStackTrace();
            }
        } else if (serializableExtra instanceof HashMap) {
            hashMap = (HashMap) serializableExtra;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        Serializable serializableExtra2 = intent.getSerializableExtra("feed_param_extra");
        if (serializableExtra2 instanceof HashMap) {
            hashMap2 = (HashMap) serializableExtra2;
        }
        long longExtra = intent.getLongExtra("video_current_position", 0);
        String a65 = a(intent, "tracker_data");
        boolean booleanExtra7 = intent.getBooleanExtra("isChain", false);
        boolean booleanExtra8 = intent.getBooleanExtra("is_from_duet_chain", false);
        try {
            if (!TextUtils.isEmpty(a65)) {
                JSONObject jSONObject = new JSONObject(a65);
                if (jSONObject.has("previous_page")) {
                    a42 = jSONObject.getString("previous_page");
                }
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        String a66 = a(intent, "enter_from");
        if (a66 == null) {
            a66 = str3;
        }
        String a67 = a(intent, "tab_text");
        String a68 = a(intent, "extra_detail_title_text");
        String a69 = a(intent, "extra_category_name");
        int intExtra14 = intent.getIntExtra("detail_cell_type", 0);
        int intExtra15 = intent.getIntExtra("key_has_more", 0);
        boolean booleanExtra9 = intent.getBooleanExtra("video_from_dcd", false);
        String a70 = a(intent, "search_result_id");
        String a71 = a(intent, "list_result_type");
        String a72 = a(intent, "list_item_id");
        String a73 = a(intent, "list_item_id");
        String a74 = a(intent, "search_id");
        String a75 = a(intent, "challenge_id_from_search");
        String a76 = a(intent, "VS_SESSION_ID");
        String a77 = a(intent, "VS_ENTRANCE_TYPE");
        String a78 = a(intent, "VS_ENTER_FROM");
        String a79 = a(intent, "VS_RESULT_ID");
        String a80 = a(intent, "VS_GROUP_ID");
        String a81 = a(intent, "impr_id");
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("from_search_live_card", false));
        String a82 = a(intent, "extra_follow_uid_list");
        List<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(a82)) {
            arrayList = Arrays.asList(a82.split("-"));
        }
        String a83 = a(intent, "extra_follow_blue_dot_list");
        List<String> arrayList2 = new ArrayList<>();
        if (!TextUtils.isEmpty(a82)) {
            arrayList2 = Arrays.asList(a83.split("-"));
        }
        String a84 = a(intent, "extra_selected_follow_uid");
        String a85 = a(intent, "extra_author_name");
        boolean booleanExtra10 = intent.getBooleanExtra("extra_has_latest_following_user", false);
        boolean booleanExtra11 = intent.getBooleanExtra("show_donation", false);
        boolean booleanExtra12 = intent.getBooleanExtra("auto_like_comment", false);
        boolean booleanExtra13 = intent.getBooleanExtra("show_reply_panel", false);
        if (!TextUtils.equals(a2, "page_challenge_mention") ? a2 == null : !TextUtils.isEmpty(a66)) {
            a2 = a66;
        }
        boolean booleanExtra14 = intent.getBooleanExtra("key_from_chat_room_playing", false);
        String a86 = a(intent, "key_from_chat_room_real_aid");
        int intExtra16 = intent.getIntExtra("from_recommend_card", 0);
        boolean booleanExtra15 = intent.getBooleanExtra("extra_key_show_interest_choose", false);
        if (intent.hasExtra("special_topic_region")) {
            str = a(intent, "special_topic_region");
        } else {
            str = str3;
        }
        boolean booleanExtra16 = intent.getBooleanExtra("video_cover_transition", false);
        String a87 = a(intent, "feed_group_id");
        String a88 = a(intent, "share_url_utm_source");
        String a89 = a(intent, "share_url_link_id");
        String a90 = a(intent, "share_url_user_id");
        String a91 = a(intent, "share_sec_url_user_id");
        boolean booleanExtra17 = intent.getBooleanExtra("share_expose_sharer", false);
        String a92 = a(intent, "share_url_checksum");
        String a93 = a(intent, "share_url_timestamp");
        int intExtra17 = intent.getIntExtra("comment_label_type", -1);
        String a94 = a(intent, "comment_label_text");
        String a95 = a(intent, "key_search_type");
        int intExtra18 = intent.getIntExtra("is_new_low_quality_user", 0);
        String a96 = a(intent, "ad_report_reason");
        String a97 = a(intent, "ad_report_reason_type");
        int intExtra19 = intent.getIntExtra("detail_ad_type", 0);
        String a98 = a(intent, "msg_extra");
        boolean booleanExtra18 = intent.getBooleanExtra("is_clean_mode", false);
        int intExtra20 = intent.getIntExtra("is_from_video", -1);
        String a99 = a(intent, "playlist_search_id");
        String a100 = a(intent, "feed_adv_id");
        long longExtra2 = intent.getLongExtra("max_cursor", 0);
        int intExtra21 = intent.getIntExtra("story type", 0);
        boolean booleanExtra19 = intent.getBooleanExtra("query_mine_story_from_cache", false);
        boolean booleanExtra20 = intent.getBooleanExtra("feed_transition_enable", false);
        String a101 = a(intent, "key_playlist_previous_page");
        String a102 = a(intent, "key_playlist_from_group_id");
        String a103 = a(intent, "upvote_id");
        Uri data = intent.getData();
        if (data == null || !(data.getHost() + data.getPath()).startsWith("story/detail")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (a7 != null) {
            str2 = a7.substring(1, a7.length() - 1);
        } else {
            str2 = str3;
        }
        int intExtra22 = intent.getIntExtra("story_comment_user_follow_status", -1);
        String a104 = a(intent, "page_poi_id");
        Serializable serializableExtra3 = intent.getSerializableExtra("feed_anchor_custom_data");
        if (serializableExtra3 instanceof AnchorCustomData) {
            anchorCustomData = (AnchorCustomData) serializableExtra3;
        } else {
            anchorCustomData = null;
        }
        String a105 = a(intent, "enter_play_method");
        b ids = new b().setEventType(a2).setAid(a3).setCid(a4).setLikeListIds(a5).setLikeCount(intExtra).setLastGroupId(a6).setVid(str2).setCommentLabelText(a94).setCommentLabelType(intExtra17).setIds(a8);
        if (a9 == null) {
            a9 = str3;
        }
        b index = ids.setUid(a9).setSecUid(a10).setFrom(a11).setChallengeProfileFrom(a12).setMusicId(a13).setIsFromTrendingCard(a38).setTranslatorId(a37).setTrendingEventId(a39).setTrendingName(a40).setStickerId(a14).setChallengeId(a15).setQuestionId(a16).setShowAnswerQuestionButton(intExtra2).setEnterMethodValue(a21).setCategoryName(a69).setSpuId(a22).setRateType(intExtra4).setPageSize(intExtra5).setMvId(a17).setDuetId(a18).setTutorialId(a19).setCreationId(a20).setChannelId(intExtra3).setProductId(a24).setPromotionId(a23).setCarrierType(a25).setReferSeedId(a26).setReferSeedName(a27).setDataType(a28).setEntranceInfo(a29).setVideoType(intExtra6).setShareUserId(a30).setQueryAwemeMode(a31).setAccountType(a32).setUserList(stringArrayListExtra).setTabName(a33).setPushParams(a34).setLikeEnterMethod(a35).setContentSource(a36).setEnterFromRequestId(a41).setPreviousPage(a42).setSearchKeyword(a43).setPreviousPagePosition(a44).setFromAdsActivity(booleanExtra).setRecommend(booleanExtra2).setType(intExtra8).setCellId(a47).setIndex(intent.getIntExtra("index", -1));
        boolean z6 = true;
        if (intExtra7 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        b taskType = index.setFromPostList(z4).setParentTagId(a45).setTaskType(intExtra9);
        if (intExtra9 == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        b showCommentAfterOpen = taskType.setShowCommentAfterOpen(z5);
        if (intExtra9 != 3) {
            z6 = false;
        }
        b upvoteId = showCommentAfterOpen.setShowShareAfterOpen(z6).setRelatedId(a46).setMicroAppId(a48).setHashTagName(a49).setTagLine(a50).setCount(intExtra10).setFeedsAwemeId(a51).setHotSearch(a52).setItemIdList(a53).setFromHotSearchRanking(booleanExtra3).setCursor(intExtra11).setShowPoll(z).setAdSpot(booleanExtra4).setOutAwemeId(a54).setVideoCurrentPosition(longExtra).setActivityId(a55).setNewSourceType(a56).setNewSourceId(a57).setCommentDeleted(intExtra12).setFromGroupId(a63).setReferCommodityId(a64).setReactSessionId(a58).setTracker(a65).setLevel1CommentDeleted(intExtra13).setCommentForceOpenReply(z2).setChain(booleanExtra7).setIsFromDuetChain(booleanExtra8).setTabText(a67).setDetailTitleText(a68).setCellDetailType(intExtra14).setHotEnterMethod(a66).setNeedShowDonation(booleanExtra11).setMixFromOrder(a60).setTrending(Boolean.valueOf(booleanExtra5)).setProcessId(a61).setVideoFromDcd(booleanExtra9).setSearchResultId(a70).setListResultType(a71).setListItemId(a72).setSearchThirdItemId(a73).setSearchId(a74).setCidFromSearch(a75).setFromSearchLiveCard(valueOf).setSpecialTopicRegion(str).setVideoFromDcd(booleanExtra9).setIsFromChatRoomPlaying(booleanExtra14).setChatRoomPlayingRealAid(a86).setIsFromSearchTopic(booleanExtra6).setUidList(arrayList).setBlueDotList(arrayList2).setSelectedUid(a84).setAuthorName(a85).setHasLatestFollowingUser(booleanExtra10).setHasMore(intExtra15).setEnableDetailActivityVideoCoverTransition(booleanExtra16).setmImprId(a81).setLogExtra(hashMap).setExtra(hashMap2).setFeedGroupIdForMixVideo(a87).setFromRecommendCard(intExtra16).setShowInterestChoose(booleanExtra15).setLiveEnterMethodValue(a62).setVsEnterFrom(a78).setVsSessionId(a76).setVsEntranceType(a77).setVsResultId(a79).setVsGroupId(a80).setShareParamUtmSource(a88).setShareParamLinkId(a89).setShareParamUserId(a90).setShareParamSecUserId(a91).setExposeSharerMsg(booleanExtra17).setShareCheckSum(a92).setShareTimeStamp(a93).setSearchType(a95).setNeedAutoLikeComment(booleanExtra12).setNeedShowReplyPanel(booleanExtra13).setIsNewLowQualityUser(intExtra18).setAdReportReason(a96).setAdReportReasonType(a97).setDetailAdType(intExtra19).setPlaylistCleanMode(booleanExtra18).setIsFromVideo(intExtra20).setPlaylistSearchId(a99).setAnchorCustomData(anchorCustomData).setPagePoiId(a104).setMaxCursor(longExtra2).setAdvId(a100).setInboxExtra(a98).setStoryType(intExtra21).setStoryPage(z3).setShouldQueryMyStoryFromCache(booleanExtra19).setSupportFeedTransition(booleanExtra20).setCommentUserFollowStatus(intExtra22).setPlaylistPreviousPage(a101).setPlaylistEnterGroupId(a102).setEnterPlayMethod(a105).setNewsId(a59).setUpvoteId(a103);
        l.d(activity, str3);
        l.d(upvoteId, str3);
        Activity a106 = o.a((Context) activity);
        Objects.requireNonNull(a106, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a107 = ae.a((e) a106, (ad.b) null).a(FeedParamProvider.class);
        l.b(a107, str3);
        ((FeedParamProvider) a107).f93686a = upvoteId;
        return upvoteId;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
