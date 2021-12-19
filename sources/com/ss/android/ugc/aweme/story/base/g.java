package com.ss.android.ugc.aweme.story.base;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(89471);
    }

    public static final Bundle a(EnterStoryParam enterStoryParam) {
        String str;
        l.d(enterStoryParam, "");
        Bundle bundle = new Bundle();
        bundle.putBoolean("launch_as_activity", enterStoryParam.getLaunchAsActivity());
        bundle.putString("shoot_way", enterStoryParam.getShootWay());
        bundle.putString("enter_method", enterStoryParam.getEnterMethod());
        bundle.putString("enter_from", enterStoryParam.getEnterFrom());
        bundle.putBoolean("publish_with_anim", enterStoryParam.getNeedPublishWithAnim());
        bundle.putBoolean("is_story_mode", enterStoryParam.isStory());
        if (l.a((Object) enterStoryParam.getEnterMethod(), (Object) "slide_right")) {
            if (enterStoryParam.isWestWindowExist()) {
                str = "1";
            } else {
                str = "0";
            }
            bundle.putString("is_west_window_exist", str);
        }
        return bundle;
    }
}
