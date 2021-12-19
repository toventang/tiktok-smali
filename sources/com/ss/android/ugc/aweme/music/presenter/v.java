package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.aq;
import com.ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import h.f.a.b;
import java.util.List;

final /* synthetic */ class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f111628a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeSearchMusicList f111629b;

    /* renamed from: c  reason: collision with root package name */
    private final List f111630c;

    static {
        Covode.recordClassIndex(71726);
    }

    v(int i2, AwemeSearchMusicList awemeSearchMusicList, List list) {
        this.f111628a = i2;
        this.f111629b = awemeSearchMusicList;
        this.f111630c = list;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        int i2 = this.f111628a;
        AwemeSearchMusicList awemeSearchMusicList = this.f111629b;
        List list = this.f111630c;
        Integer num = (Integer) obj;
        if (num.intValue() < 0 || num.intValue() > i2) {
            return null;
        }
        aq aqVar = new aq();
        aqVar.setLogPb(awemeSearchMusicList.logPb);
        list.add(num.intValue(), aqVar);
        return null;
    }
}
