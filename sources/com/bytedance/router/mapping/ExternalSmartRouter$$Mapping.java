package com.bytedance.router.mapping;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.IMappingInitializer;
import java.util.List;
import java.util.Map;

public class ExternalSmartRouter$$Mapping implements IMappingInitializer {
    static {
        Covode.recordClassIndex(26185);
    }

    @Override // com.bytedance.router.IMappingInitializer
    public int getMapSize() {
        return 7;
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void init(Map<String, String> map) {
        map.put("//assmusic/category", "com.ss.android.ugc.aweme.deeplink.actions.PlaylistAction");
        map.put("//eoy/", "com.ss.android.ugc.aweme.deeplink.actions.EOYAction");
        map.put("//feed", "com.ss.android.ugc.aweme.deeplink.actions.FeedAction");
        map.put("//messages/group", "com.ss.android.ugc.aweme.deeplink.actions.OpenChatInviteAction");
        map.put("//profile", "com.ss.android.ugc.aweme.deeplink.actions.UserProfileAction");
        map.put("//qna/detail", "com.ss.android.ugc.aweme.deeplink.actions.QnAAction");
        map.put("//user/imfans", "com.ss.android.ugc.aweme.deeplink.actions.ImFansAction");
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void initInterceptorMap(Map<String, List<String>> map) {
    }
}
