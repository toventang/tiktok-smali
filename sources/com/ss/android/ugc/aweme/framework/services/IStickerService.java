package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.ArrayList;
import java.util.List;

public interface IStickerService {
    static {
        Covode.recordClassIndex(61361);
    }

    public static class FaceSticker {
        public String extra;
        public ToolsUrlModel fileUrl;
        public String hint;
        public ToolsUrlModel iconUrl;
        public String id;
        public boolean isVideoUsedSticker;
        public String localPath;
        public String name;
        public List<String> requirements = new ArrayList();
        public String sdkExtra;
        public long stickerId;
        public List<String> tags;
        public List<String> types;
        private boolean usedFromRecover;

        static {
            Covode.recordClassIndex(61362);
        }

        public boolean isUsedFromRecover() {
            return this.usedFromRecover;
        }

        public void setUsedFromRecover(boolean z) {
            this.usedFromRecover = z;
        }
    }
}
