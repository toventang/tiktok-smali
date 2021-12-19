package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

public class RoomFeedCellStruct implements Serializable {
    @c(a = "deduplication_type")
    public int deduplicationType;
    @c(a = "distance")
    public String distance;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "fans_struct")
    public FansStruct mFansStruct;
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "rawdata")
    public NewLiveRoomStruct newLiveRoomData;
    @c(a = "room")
    public LiveRoomStruct room;
    @c(a = "tag")
    public String tag;
    @c(a = "tag_id")
    public long tagId;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(59511);
    }

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            if (LiveRoomStruct.isValid(this.room)) {
                return this.room;
            }
            NewLiveRoomStruct newLiveRoomStruct = this.newLiveRoomData;
            if (newLiveRoomStruct == null) {
                return null;
            }
            newLiveRoomStruct.init();
            LiveRoomStruct roomStructConstructor = this.newLiveRoomData.roomStructConstructor();
            this.room = roomStructConstructor;
            return roomStructConstructor;
        } catch (Exception unused) {
            return null;
        }
    }
}
