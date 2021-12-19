package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ReplaceMusicRequest {
    @c(a = "new_music_info")
    private EditMusicStruct editMusicStruct = new EditMusicStruct();
    @c(a = "item_id")
    private String itemID = "";
    @c(a = "original_vid")
    private String originalVid = "";

    static {
        Covode.recordClassIndex(79608);
    }

    public final EditMusicStruct getEditMusicStruct() {
        return this.editMusicStruct;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final String getOriginalVid() {
        return this.originalVid;
    }

    public final void setEditMusicStruct(EditMusicStruct editMusicStruct2) {
        l.d(editMusicStruct2, "");
        this.editMusicStruct = editMusicStruct2;
    }

    public final void setItemID(String str) {
        l.d(str, "");
        this.itemID = str;
    }

    public final void setOriginalVid(String str) {
        l.d(str, "");
        this.originalVid = str;
    }
}
