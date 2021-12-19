package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<d> f34529a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f34530b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(20654);
        ArrayList<d> arrayList = new ArrayList<>();
        f34529a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("com.ss.android.ugc.aweme.mix.api.MixDetailNetPreload");
        arrayList2.add("com.ss.android.ugc.aweme.mix.api.MixListNetPreload");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("aweme://mix/detail");
        arrayList.add(new d(arrayList2, arrayList3, "com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("com.ss.android.ugc.aweme.challenge.api.ChallengeNetPreload");
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("//challenge/detail");
        arrayList5.add("//aweme/challenge/detail");
        arrayList.add(new d(arrayList4, arrayList5, "com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", null));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload");
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add("//music/detail");
        arrayList7.add("aweme://music/detail/");
        arrayList.add(new d(arrayList6, arrayList7, "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", null));
    }
}
