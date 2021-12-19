package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import com.google.gson.a.c;
import h.a.z;
import java.util.List;

public final class XAudioList {
    @c(a = "list")
    private List<XAudioSrc> mDataSet;
    @c(a = "id")
    private String mId = "";
    @c(a = "position")
    private Integer mPosition = 0;

    static {
        Covode.recordClassIndex(22251);
    }

    public final h toPlaylist() {
        int i2;
        String str = this.mId;
        if (str == null) {
            str = "";
        }
        List list = this.mDataSet;
        if (list == null) {
            list = z.INSTANCE;
        }
        Integer num = this.mPosition;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        return new a(str, list, i2);
    }
}
