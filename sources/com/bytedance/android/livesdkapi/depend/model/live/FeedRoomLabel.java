package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class FeedRoomLabel implements Serializable {
    @c(a = "icon")
    public ImageModel icon;
    @c(a = "position")
    public long location;
    @c(a = "log_extra")
    public String logExtra;
    @c(a = "text")
    public b text;

    static {
        Covode.recordClassIndex(13651);
    }
}
