package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

public final class i implements af<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f40675a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(24956);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.e.af
    public final /* synthetic */ Float a(JsonReader jsonReader, float f2) {
        return Float.valueOf(n.b(jsonReader) * f2);
    }
}
