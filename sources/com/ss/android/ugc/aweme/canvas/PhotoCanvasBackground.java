package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class PhotoCanvasBackground implements Serializable {
    public static final a Companion = new a((byte) 0);
    private int endColor;
    private String filePath = "";
    private int startColor;
    private final int type;

    static {
        Covode.recordClassIndex(42946);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42947);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static PhotoCanvasBackground a(int i2) {
            PhotoCanvasBackground photoCanvasBackground = new PhotoCanvasBackground(0);
            photoCanvasBackground.setStartColor(i2);
            return photoCanvasBackground;
        }
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int getType() {
        return this.type;
    }

    public final void setEndColor(int i2) {
        this.endColor = i2;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setStartColor(int i2) {
        this.startColor = i2;
    }

    public PhotoCanvasBackground(int i2) {
        this.type = i2;
    }
}
