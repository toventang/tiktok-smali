package com.bytedance.router.arg;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.challenge.ui.j;
import com.ss.android.ugc.aweme.deeplink.UpdateTipActivity;
import com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivityArgs;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivityArgs;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.SessionListNavArg;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment;
import com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity;
import com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg;
import com.ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.c;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.profile.arg.UserProfileArg;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import com.ss.android.ugc.aweme.qna.model.AskQuestionParam;
import com.ss.android.ugc.aweme.question.QuestionDetailActivity;
import com.ss.android.ugc.aweme.question.i;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.ss.android.ugc.aweme.story.base.StoryActivityArg;
import com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;

public final class SmartRouteArgManager {
    public static final SmartRouteArgManager INSTANCE;
    private static final Map<Class<Object>, Class<? extends IRouteArg>> clazzToArgClsMap;
    private static final Map<String, Class<? extends IRouteArg>> urlToArgClsMap;

    private final void addClazzToArgClsPair(Map<Class<Object>, Class<? extends IRouteArg>> map) {
        map.put(ChallengeDetailActivity.class, ChallengeDetailParam.class);
        map.put(j.class, ChallengeDetailParam.class);
        map.put(UpdateTipActivity.class, UpdateTipsArgs.class);
        map.put(FollowRelationTabActivity.class, FollowRelationTabArgs.class);
        map.put(ContactsActivity.class, ContactsActivityArgs.class);
        map.put(AvatarCutActivity.class, AvatarCutActivityArgs.class);
        map.put(SessionListFragment.class, SessionListNavArg.class);
        map.put(MiniAppMediaChooseEmptyActivity.class, MiniAppMediaChooseEmptyArg.class);
        map.put(c.class, OriginMusicArg.class);
        map.put(MusNotificationDetailActivity.class, MusNotificationDetailArg.class);
        map.put(UserProfileActivity.class, UserProfileArg.class);
        map.put(UserProfileFragment.class, UserProfileArg.class);
        map.put(QnaAskQuestionFragment.class, AskQuestionParam.class);
        map.put(QuestionDetailActivity.class, QuestionDetailParam.class);
        map.put(i.class, QuestionDetailParam.class);
        map.put(StoryRootActivity.class, StoryActivityArg.class);
    }

    private final void addUrlToArgClsPair(Map<String, Class<? extends IRouteArg>> map) {
        map.put("//aweme/challenge/detail", ChallengeDetailParam.class);
        map.put("//challenge/detail", ChallengeDetailParam.class);
        map.put("//challenge/detail_fragment", ChallengeDetailParam.class);
        map.put("//chat/center", SessionListNavArg.class);
        map.put("//friends/contacts", ContactsActivityArgs.class);
        map.put("//main/miniapp/media_choose_empty", MiniAppMediaChooseEmptyArg.class);
        map.put("//main/update_tips", UpdateTipsArgs.class);
        map.put("//notice/detail", MusNotificationDetailArg.class);
        map.put("//origin/music_list", OriginMusicArg.class);
        map.put("//profile/avatar_cut", AvatarCutActivityArgs.class);
        map.put("//profile/follow_relation", FollowRelationTabArgs.class);
        map.put("//qna/detail", QuestionDetailParam.class);
        map.put("//qna/detail/", QuestionDetailParam.class);
        map.put("//qna/detail_fragment", QuestionDetailParam.class);
        map.put("//studio/story", StoryActivityArg.class);
        map.put("//user/ask", AskQuestionParam.class);
        map.put("//user/ask/", AskQuestionParam.class);
        map.put("//user/profile", UserProfileArg.class);
        map.put("//user_profile_page", UserProfileArg.class);
        map.put("aweme://qna/detail", QuestionDetailParam.class);
        map.put("aweme://qna/detail/", QuestionDetailParam.class);
        map.put("aweme://user/ask", AskQuestionParam.class);
        map.put("aweme://user/ask/", AskQuestionParam.class);
    }

    private SmartRouteArgManager() {
    }

    static {
        Covode.recordClassIndex(26172);
        SmartRouteArgManager smartRouteArgManager = new SmartRouteArgManager();
        INSTANCE = smartRouteArgManager;
        HashMap hashMap = new HashMap();
        clazzToArgClsMap = hashMap;
        HashMap hashMap2 = new HashMap();
        urlToArgClsMap = hashMap2;
        smartRouteArgManager.addUrlToArgClsPair(hashMap2);
        smartRouteArgManager.addClazzToArgClsPair(hashMap);
    }

    public final Class<? extends IRouteArg> getArgClassByClazz(Class<?> cls) {
        l.c(cls, "");
        return clazzToArgClsMap.get(cls);
    }

    private final String getRealRouteUrl(String str) {
        Uri parse = Uri.parse(str);
        l.a((Object) parse, "");
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return "//" + parse.getAuthority() + parse.getPath();
        }
        return str;
    }

    private final String getRouteUrl(String str) {
        Uri parse = Uri.parse(str);
        l.a((Object) parse, "");
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
        }
        return "//" + parse.getAuthority() + parse.getPath();
    }

    public final Class<? extends IRouteArg> getArgClassByUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String realRouteUrl = getRealRouteUrl(str);
        Map<String, Class<? extends IRouteArg>> map = urlToArgClsMap;
        Class<? extends IRouteArg> cls = map.get(realRouteUrl);
        if (cls != null) {
            return cls;
        }
        if (realRouteUrl != null && p.c(realRouteUrl, "/", false) && realRouteUrl.length() > 1) {
            String substring = realRouteUrl.substring(0, realRouteUrl.length() - 1);
            l.a((Object) substring, "");
            Class<? extends IRouteArg> cls2 = map.get(substring);
            if (cls2 != null) {
                return cls2;
            }
        }
        String routeUrl = getRouteUrl(str);
        Class<? extends IRouteArg> cls3 = map.get(routeUrl);
        if (cls3 != null || routeUrl == null || !p.c(routeUrl, "/", false) || routeUrl.length() <= 1) {
            return cls3;
        }
        String substring2 = routeUrl.substring(0, routeUrl.length() - 1);
        l.a((Object) substring2, "");
        return map.get(substring2);
    }
}
