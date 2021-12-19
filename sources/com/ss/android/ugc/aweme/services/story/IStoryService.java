package com.ss.android.ugc.aweme.services.story;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IStoryService {
    static {
        Covode.recordClassIndex(79823);
    }

    IStoryView createStoryView(EnterStoryParam enterStoryParam);

    void showPublishingToast(Context context);

    void startStoryActivity(Context context, EnterStoryParam enterStoryParam);

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79824);
        }

        public static /* synthetic */ IStoryView createStoryView$default(IStoryService iStoryService, EnterStoryParam enterStoryParam, int i2, Object obj) {
            EnterStoryParam enterStoryParam2 = enterStoryParam;
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    enterStoryParam2 = new EnterStoryParam(null, null, null, false, false, false, false, 127, null);
                }
                return iStoryService.createStoryView(enterStoryParam2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStoryView");
        }

        public static /* synthetic */ void startStoryActivity$default(IStoryService iStoryService, Context context, EnterStoryParam enterStoryParam, int i2, Object obj) {
            EnterStoryParam enterStoryParam2 = enterStoryParam;
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    enterStoryParam2 = new EnterStoryParam(null, null, null, false, false, false, false, 127, null);
                }
                iStoryService.startStoryActivity(context, enterStoryParam2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startStoryActivity");
        }
    }
}
