package com.ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PreloadTask {
    public boolean alreadyPreload;
    @c(a = "count")
    public int count = 1;
    @c(a = "offset")
    public int offset;
    @c(a = "download_progress")
    public int progress = 100;
    @c(a = "size")
    private int size;

    static {
        Covode.recordClassIndex(94048);
    }

    public PreloadTask() {
    }

    public int getVideoPreloadSize() {
        int i2 = this.size;
        if (i2 <= 0) {
            return 10485759;
        }
        return i2 * 1024;
    }

    public String toString() {
        return "PreloadTask{progress=" + this.progress + ", offset=" + this.offset + ", count=" + this.count + ", size=" + this.size + '}';
    }

    public PreloadTask(int i2, int i3) {
        this.count = i2;
        this.size = i3;
    }
}
