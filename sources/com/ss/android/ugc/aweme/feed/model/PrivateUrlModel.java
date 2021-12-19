package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

public class PrivateUrlModel extends BaseResponse {
    @c(a = "hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;
    @c(a = "label_private")
    public UrlModel labelPrivate;
    @c(a = "video_text")
    public List<AwemeTextLabelModel> textVideoLabels;

    static {
        Covode.recordClassIndex(59444);
    }
}
