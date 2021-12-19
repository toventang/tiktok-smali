package com.ss.android.ugc.aweme.comment.api;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.l;
import com.google.c.a.p;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.em;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.o;
import l.b.t;
import org.json.JSONException;
import org.json.JSONObject;

public final class CommentApi {

    /* renamed from: a  reason: collision with root package name */
    static final f f71441a = a.a(b.f59141e);

    public interface RealApi {
        static {
            Covode.recordClassIndex(43969);
        }

        @l.b.f(a = "/aweme/v1/comment/delete/")
        q<BaseCommentResponse> deleteComment(@t(a = "cid") String str, @t(a = "channel_id") int i2);

        @l.b.f(a = "/aweme/v1/comment/delete/")
        q<BaseCommentResponse> deleteComment(@t(a = "cid") String str, @t(a = "channel_id") int i2, @t(a = "action") int i3);

        @l.b.f(a = "/aweme/v1/comment/digg/")
        q<BaseCommentResponse> diggComment(@t(a = "cid") String str, @t(a = "aweme_id") String str2, @t(a = "digg_type") String str3, @t(a = "channel_id") int i2);

        @l.b.f(a = "/aweme/v1/comment/list/")
        q<CommentItemList> fetchCommentList(@t(a = "aweme_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i2, @t(a = "comment_style") int i3, @t(a = "digged_cid") String str2, @t(a = "insert_cids") String str3, @t(a = "user_avatar_shrink") String str4);

        @l.b.f(a = "/aweme/v2/comment/list/")
        i<CommentItemList> fetchCommentListV2(@t(a = "aweme_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i2, @t(a = "insert_ids") String str2, @t(a = "forward_page_type") int i3, @t(a = "ad_creative_id") Long l2, @t(a = "channel_id") int i4, @t(a = "user_avatar_shrink") String str3, @t(a = "ad_pricing_type") int i5, @d Object obj, @l List<com.bytedance.retrofit2.client.b> list);

        @l.b.f(a = "/aweme/v1/comment/story/replylist/")
        q<CommentItemList> fetchStoryReplyCommentList(@t(a = "comment_id") String str, @t(a = "user_avatar_shrink") String str2);

        @l.b.f(a = "/aweme/v1/comment/list/reply/")
        i<CommentItemList> loadMoreCommentList(@t(a = "comment_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i2, @t(a = "top_ids") String str2, @t(a = "item_id") String str3, @t(a = "insert_ids") String str4, @t(a = "channel_id") int i3, @t(a = "user_avatar_shrink") String str5);

        @l.b.f(a = "/aweme/v2/comment/list/")
        q<CommentItemList> preloadCommentList(@t(a = "aweme_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i2, @t(a = "insert_ids") String str2, @t(a = "forward_page_type") int i3, @t(a = "ad_creative_id") Long l2, @t(a = "channel_id") int i4, @t(a = "user_avatar_shrink") String str3, @t(a = "ad_pricing_type") int i5, @d Object obj);

        @o(a = "/aweme/v1/comment/publish/")
        @e
        q<CommentResponse> publishComment(@c(a = "aweme_id") String str, @c(a = "text") String str2, @c(a = "reply_id") String str3, @c(a = "text_extra") String str4, @c(a = "is_self_see") int i2, @c(a = "reply_to_reply_id") String str5, @c(a = "channel_id") int i3, @c(a = "action_type") int i4, @c(a = "ad_info") String str6);

        @o(a = "/aweme/v1/comment/publish/")
        @e
        q<CommentResponse> publishCommentCheck(@c(a = "aweme_id") String str, @c(a = "text") String str2, @c(a = "reply_id") String str3, @c(a = "text_extra") String str4, @c(a = "is_self_see") int i2, @c(a = "reply_to_reply_id") String str5, @c(a = "channel_id") int i3, @c(a = "action_type") int i4, @c(a = "ad_info") String str6, @c(a = "skip_rethink") int i5);

        @o(a = "/tiktok/v1/gift/send/")
        @e
        q<CommentResponse> publishGiftComment(@c(a = "gift_id") String str, @c(a = "aweme_id") String str2, @c(a = "comment_publish_request") String str3);

        @o(a = "/tiktok/v1/gift/send/")
        @e
        q<CommentResponse> publishGiftOnlyComment(@c(a = "gift_id") String str, @c(a = "aweme_id") String str2);
    }

    public static CommentPreloadRequest a(String str, long j2, int i2, String str2, Long l2, int i3, Object obj) {
        Aweme d2 = AwemeService.b().d(str);
        if (l2 == null) {
            l2 = (d2 == null || d2.getAwemeRawAd() == null || com.ss.android.ugc.aweme.commercialize.e.a.b.X(d2)) ? null : d2.getAwemeRawAd().getCreativeId();
        }
        int chargeType = (d2 == null || d2.getAwemeRawAd() == null) ? 0 : d2.getAwemeRawAd().getChargeType();
        CommentPreloadRequest.a aVar = new CommentPreloadRequest.a(str);
        aVar.f72343b = j2;
        aVar.f72344c = i2;
        aVar.f72345d = str2;
        aVar.f72346e = 1;
        aVar.f72347f = l2;
        aVar.f72348g = i3;
        aVar.f72349h = a();
        aVar.f72350i = chargeType;
        aVar.f72351j = obj;
        return new CommentPreloadRequest(aVar, (byte) 0);
    }

    private static String a() {
        int[] a2 = em.a(100);
        if (a2 == null) {
            return "";
        }
        return a2[0] + "_" + a2[1];
    }

    private static String a(String str) {
        Aweme a2;
        if (TextUtils.isEmpty(str) || "0".equals(str) || (a2 = com.ss.android.ugc.aweme.awemeservice.a.a().a(str)) == null || !a2.isAd() || a2.getAwemeRawAd().getAdId() == null) {
            return null;
        }
        Long adId = a2.getAwemeRawAd().getAdId();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_id", adId);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    static {
        Covode.recordClassIndex(43968);
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static CommentResponse b(com.ss.android.ugc.aweme.comment.i.f fVar) {
        try {
            CommentPublishRequestModel a2 = a(fVar, 0);
            if (p.a(fVar.f71955b)) {
                return ((RealApi) f71441a.a(RealApi.class)).publishGiftOnlyComment(String.valueOf(fVar.f71965l), fVar.f71954a).get();
            }
            CommentResponse commentResponse = ((RealApi) f71441a.a(RealApi.class)).publishGiftComment(String.valueOf(fVar.f71965l), fVar.f71954a, GsonHolder.c().b().b(a2)).get();
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setFakeId(fVar.f71962i);
            return commentResponse;
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static CommentResponse a(com.ss.android.ugc.aweme.comment.i.f fVar) {
        CommentResponse commentResponse;
        try {
            if (fVar.f71965l != 0 && !p.a(fVar.f71964k)) {
                return b(fVar);
            }
            com.google.gson.f b2 = GsonHolder.c().b();
            CommentPublishRequestModel a2 = a(fVar, 0);
            String str = "[]";
            if (fVar.p == -1) {
                RealApi realApi = (RealApi) f71441a.a(RealApi.class);
                String aid = a2.getAid();
                String text = a2.getText();
                String replyId = a2.getReplyId();
                if (a2.getTextExtraList() != null) {
                    str = b2.b(a2.getTextExtraList());
                }
                commentResponse = realApi.publishComment(aid, text, replyId, str, a2.getIsSelfSee(), a2.getReplyToReplyId(), a2.getChannelId(), a2.getActionType(), a2.getAdInfo()).get();
            } else {
                RealApi realApi2 = (RealApi) f71441a.a(RealApi.class);
                String aid2 = a2.getAid();
                String text2 = a2.getText();
                String replyId2 = a2.getReplyId();
                if (a2.getTextExtraList() != null) {
                    str = b2.b(a2.getTextExtraList());
                }
                commentResponse = realApi2.publishCommentCheck(aid2, text2, replyId2, str, a2.getIsSelfSee(), a2.getReplyToReplyId(), a2.getChannelId(), a2.getActionType(), a2.getAdInfo(), fVar.p).get();
            }
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setFakeId(fVar.f71962i);
            commentResponse.comment.setStoryEmojiComment(fVar.q);
            return commentResponse;
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseCommentResponse a(String str, int i2) {
        try {
            return ((RealApi) f71441a.a(RealApi.class)).deleteComment(str, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel */
    /* JADX WARN: Multi-variable type inference failed */
    private static CommentPublishRequestModel a(com.ss.android.ugc.aweme.comment.i.f fVar, int i2) {
        CommentPublishRequestModel commentPublishRequestModel = new CommentPublishRequestModel();
        commentPublishRequestModel.setAid(fVar.f71954a);
        commentPublishRequestModel.setText(fVar.f71955b);
        commentPublishRequestModel.setReplyId(fVar.f71956c);
        commentPublishRequestModel.setStructList(fVar.f71957d);
        commentPublishRequestModel.setIsSelfSee(0);
        commentPublishRequestModel.setReplyToReplyId(fVar.f71958e);
        commentPublishRequestModel.setChannelId(fVar.f71960g);
        commentPublishRequestModel.setActionType(0);
        commentPublishRequestModel.setAdInfo(a(fVar.f71954a));
        return commentPublishRequestModel;
    }

    public static BaseCommentResponse a(String str, int i2, int i3) {
        try {
            return ((RealApi) f71441a.a(RealApi.class)).deleteComment(str, i2, i3).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseCommentResponse a(String str, String str2, String str3, int i2) {
        try {
            return ((RealApi) f71441a.a(RealApi.class)).diggComment(str, str2, str3, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static i<CommentItemList> a(String str, long j2, int i2, String str2, Long l2, int i3) {
        com.ss.android.ugc.aweme.net.cache.f fVar;
        Aweme b2 = AwemeService.b().b(str);
        if (b2 == null || b2.getPreload() == null || b2.getPreload().commentPreload < 0) {
            fVar = null;
        } else {
            fVar = new com.ss.android.ugc.aweme.net.cache.f();
            com.ss.android.ugc.aweme.net.cache.d dVar = new com.ss.android.ugc.aweme.net.cache.d();
            dVar.f112259a = "cache_comment";
            dVar.f112261c = 100000;
            dVar.f112260b = 1;
            fVar.v = dVar;
        }
        CommentPreloadRequest a2 = a(str, j2, i2, str2, l2, i3, fVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bytedance.retrofit2.client.b("check_preload", "true"));
        return ((RealApi) f71441a.a(RealApi.class)).fetchCommentListV2(a2.f72332a, a2.f72333b, a2.f72334c, a2.f72335d, a2.f72336e, a2.f72337f, a2.f72338g, a2.f72339h, a2.f72340i, a2.f72341j, arrayList);
    }

    public static i<CommentItemList> a(String str, long j2, int i2, String str2, String str3, String str4, int i3) {
        return ((RealApi) f71441a.a(RealApi.class)).loadMoreCommentList(str, j2, i2, str2, str3, str4, i3, a());
    }
}
