package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

public final class i implements af<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f5666a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(2362);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.h.af
    public final /* synthetic */ Float a(JsonReader jsonReader, float f2) {
        return Float.valueOf(n.b(jsonReader) * f2);
    }
}
