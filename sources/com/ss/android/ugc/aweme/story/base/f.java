package com.ss.android.ugc.aweme.story.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.ss.android.ugc.aweme.services.story.IStoryView;
import com.ss.android.ugc.aweme.story.base.ui.a;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.aweme.story.record.j.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f implements IStoryService {
    static {
        Covode.recordClassIndex(89470);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final IStoryView createStoryView(EnterStoryParam enterStoryParam) {
        l.d(enterStoryParam, "");
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("enter_story_param", enterStoryParam);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final void showPublishingToast(Context context) {
        l.d(context, "");
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.fal).a();
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryService
    public final void startStoryActivity(Context context, EnterStoryParam enterStoryParam) {
        l.d(context, "");
        l.d(enterStoryParam, "");
        if (StoryPublishServiceImpl.a().isPublishing(context)) {
            showPublishingToast(context);
        } else if (g.a().o().c() && g.a().o().e()) {
            showPublishingToast(context);
        } else if (enterStoryParam.isStory()) {
            SmartRouter.buildRoute(context, "//studio/story").withNavArg(new StoryActivityArg(EnterStoryParam.copy$default(enterStoryParam, null, null, null, false, true, false, false, 111, null))).open();
        } else {
            Bundle a2 = g.a(enterStoryParam);
            a2.putInt("translation_type", 6);
            if (context instanceof Activity) {
                d.a(a2, (Activity) context, false);
                return;
            }
            throw new IllegalArgumentException("use activity as context to launch record page please");
        }
    }
}
