package com.bytedance.x.b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class d implements Serializable, Cloneable {
    public int bitRate = -1;
    public String delivery;
    public int height = -1;
    public Boolean maintainAspectRatio;
    public Boolean scalable;
    public String type;
    public String url;
    public int width = -1;

    static {
        Covode.recordClassIndex(28207);
    }
}
