package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class FrameItem implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final int index;
    @c(a = "path")
    private final String path;
    @c(a = "timeStamp")
    private long timeStamp;
    private final int type;

    static {
        Covode.recordClassIndex(84442);
    }

    public FrameItem(String str) {
        this(str, 0, 0, 6, null);
    }

    public FrameItem(String str, int i2) {
        this(str, i2, 0, 4, null);
    }

    public static /* synthetic */ FrameItem copy$default(FrameItem frameItem, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = frameItem.path;
        }
        if ((i4 & 2) != 0) {
            i2 = frameItem.type;
        }
        if ((i4 & 4) != 0) {
            i3 = frameItem.index;
        }
        return frameItem.copy(str, i2, i3);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.index;
    }

    public final FrameItem copy(String str, int i2, int i3) {
        l.d(str, "");
        return new FrameItem(str, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameItem)) {
            return false;
        }
        FrameItem frameItem = (FrameItem) obj;
        return l.a(this.path, frameItem.path) && this.type == frameItem.type && this.index == frameItem.index;
    }

    public final int hashCode() {
        String str = this.path;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.type) * 31) + this.index;
    }

    public final String toString() {
        return "FrameItem(path=" + this.path + ", type=" + this.type + ", index=" + this.index + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(84443);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getType() {
        return this.type;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    public FrameItem(String str, int i2, int i3) {
        l.d(str, "");
        this.path = str;
        this.type = i2;
        this.index = i3;
        this.timeStamp = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrameItem(String str, int i2, int i3, int i4, g gVar) {
        this(str, (i4 & 2) != 0 ? 1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
