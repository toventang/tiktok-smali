package com.ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class DYVideoObject implements a {
    public ArrayList<String> mVideoPaths;

    static {
        Covode.recordClassIndex(73731);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public boolean checkArgs() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public int type() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH", this.mVideoPaths);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public void unserialize(Bundle bundle) {
        this.mVideoPaths = bundle.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
    }
}
