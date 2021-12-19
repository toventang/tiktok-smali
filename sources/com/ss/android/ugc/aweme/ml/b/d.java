package com.ss.android.ugc.aweme.ml.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.Arrays;
import java.util.List;

public class d {
    @c(a = "default")

    /* renamed from: a  reason: collision with root package name */
    public int f110418a;
    @c(a = "lable_index_mapping")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f110419b;
    @c(a = "plan")

    /* renamed from: c  reason: collision with root package name */
    public PreloadStrategyConfig[] f110420c;

    static {
        Covode.recordClassIndex(70899);
    }

    public String toString() {
        return "PreloadStrategyV2Config{defaultIndex=" + this.f110418a + ", lableIndexMapping=" + this.f110419b + ", plans=" + Arrays.toString(this.f110420c) + '}';
    }
}
