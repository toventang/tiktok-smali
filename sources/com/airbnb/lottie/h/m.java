package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

public final class m implements af<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final m f5668a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(2366);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.h.af
    public final /* synthetic */ Integer a(JsonReader jsonReader, float f2) {
        return Integer.valueOf(Math.round(n.b(jsonReader) * f2));
    }
}
