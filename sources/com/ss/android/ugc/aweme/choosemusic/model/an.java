package com.ss.android.ugc.aweme.choosemusic.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class an implements Serializable {
    @c(a = "content")
    private String content;
    private Map<String, String> extraParam;
    @c(a = "highlight_pos")
    private final List<Position> hignLightPositions;
    private boolean isMobShow;
    @c(a = "pos")
    private List<? extends Position> position;
    @c(a = "sug_type")
    private final String sugType;
    @c(a = "word_record")
    private ar wordRecord;

    static {
        Covode.recordClassIndex(43556);
    }

    public final String getContent() {
        return this.content;
    }

    public final Map<String, String> getExtraParam() {
        return this.extraParam;
    }

    public final List<Position> getHignLightPositions() {
        return this.hignLightPositions;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Position>, java.util.List<com.ss.android.ugc.aweme.discover.model.Position> */
    public final List<Position> getPosition() {
        return this.position;
    }

    public final String getSugType() {
        return this.sugType;
    }

    public final ar getWordRecord() {
        return this.wordRecord;
    }

    public final boolean isMobShow() {
        return this.isMobShow;
    }

    public final boolean isHistoryType() {
        return TextUtils.equals(this.sugType, "history");
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setExtraParam(Map<String, String> map) {
        this.extraParam = map;
    }

    public final void setMobShow(boolean z) {
        this.isMobShow = z;
    }

    public final void setPosition(List<? extends Position> list) {
        this.position = list;
    }

    public final void setWordRecord(ar arVar) {
        this.wordRecord = arVar;
    }
}
