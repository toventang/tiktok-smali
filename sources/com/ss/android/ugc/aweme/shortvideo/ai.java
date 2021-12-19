package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.video.e;
import java.util.ArrayList;
import java.util.List;

public class ai extends BaseResponse {
    @c(a = "save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    @c(a = "open_platform_name")
    public String openPlatformName;
    public int realVideoHeight;
    public int realVideoWidth;
    public int shoutOutsType = 0;
    public d shoutoutData;
    public List<String> videoCoverPaths = new ArrayList();

    static {
        Covode.recordClassIndex(82085);
    }

    public String getVideoCoverPath() {
        if (!com.ss.android.ugc.tools.utils.d.a(this.videoCoverPaths) && e.b(this.videoCoverPaths.get(0))) {
            return this.videoCoverPaths.get(0);
        }
        return null;
    }

    public void setVideoCoverPath(String str) {
        List<String> list = this.videoCoverPaths;
        if (list == null) {
            this.videoCoverPaths = new ArrayList();
        } else {
            list.clear();
        }
        this.videoCoverPaths.add(str);
    }
}
