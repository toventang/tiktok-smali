package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class y {
    static {
        Covode.recordClassIndex(50464);
    }

    public static final List<Integer> a(List<? extends Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (Aweme aweme : list) {
            LiveRoomStruct newLiveRoomData = aweme != null ? aweme.getNewLiveRoomData() : null;
            p<Integer, Integer> a2 = a(newLiveRoomData);
            int i2 = 0;
            if (a2.getFirst().intValue() == 0 || a2.getSecond().intValue() == 0) {
                if (newLiveRoomData != null && newLiveRoomData.isThirdParty) {
                }
                i2 = 1;
            } else {
                if (a2.getFirst().intValue() >= a2.getSecond().intValue()) {
                }
                i2 = 1;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    private static p<Integer, Integer> a(LiveRoomStruct liveRoomStruct) {
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject optJSONObject;
        if (liveRoomStruct == null) {
            return new p<>(0, 0);
        }
        p<Integer, Integer> pVar = new p<>(0, 0);
        StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || (pullData = liveCoreSDKData.getPullData()) == null || (streamData = pullData.getStreamData()) == null) {
            return pVar;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(streamData).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("origin")) == null) {
                return pVar;
            }
            String optString = new JSONObject(((JSONObject) Objects.requireNonNull(optJSONObject.optJSONObject("main"))).optString("sdk_params")).optString("resolution");
            l.b(optString, "");
            Object[] array = h.m.p.c(optString, new String[]{"x"}).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return new p<>(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return pVar;
        }
    }
}
