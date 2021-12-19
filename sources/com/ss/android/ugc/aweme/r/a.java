package com.ss.android.ugc.aweme.r;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(77998);
    }

    i a(String str);

    void a(Context context, long j2, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2);

    void a(Context context, EnterRoomConfig enterRoomConfig);

    void a(Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, b bVar);

    void a(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, b bVar);

    void a(Context context, EnterRoomConfig enterRoomConfig, User user, long[] jArr, long j2, int i2);

    void a(Context context, EnterRoomConfig enterRoomConfig, String str);

    void a(Context context, User user, EnterRoomConfig enterRoomConfig);

    void a(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle);

    void a(Context context, User user, boolean z);

    void b(Context context, EnterRoomConfig enterRoomConfig, String str);
}
