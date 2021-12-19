package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;

public final class go {
    static {
        Covode.recordClassIndex(93602);
    }

    public static RoomStruct a(Room room) {
        boolean z;
        if (room == null) {
            return null;
        }
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.id = room.getId();
        roomStruct.ownerUserId = room.getOwnerUserId();
        StreamUrlStruct a2 = a(room.getStreamUrl(), room.getMultiStreamDefaultQualitySdkKey());
        if (a2 == null) {
            return null;
        }
        roomStruct.stream_url = a2;
        roomStruct.isThirdParty = room.isThirdParty;
        roomStruct.isScreenshot = room.isScreenshot;
        if (room.getStreamType() == i.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        roomStruct.liveTypeAudio = z;
        return roomStruct;
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return q.a(str).j().f("data").f("origin").f("main").c("flv").c();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static StreamUrlStruct a(StreamUrl streamUrl, String str) {
        LiveCoreSDKData liveCoreSDKData;
        if (streamUrl == null) {
            return null;
        }
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        streamUrlStruct.sid = streamUrl.f23034a;
        streamUrlStruct.provider = streamUrl.f23036c;
        streamUrlStruct.rtmp_push_url = streamUrl.a();
        streamUrlStruct.rtmp_pull_url = streamUrl.f23039f;
        if (!(!TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url) || (liveCoreSDKData = streamUrl.o) == null || liveCoreSDKData.getPullData() == null)) {
            streamUrlStruct.rtmp_pull_url = a(liveCoreSDKData.getPullData().getStreamData());
        }
        if (TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return null;
        }
        streamUrlStruct.mDefaultResolution = str;
        return streamUrlStruct;
    }
}
