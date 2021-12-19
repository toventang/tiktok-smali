package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

public final class m implements af<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final m f40677a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(24960);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.e.af
    public final /* synthetic */ Integer a(JsonReader jsonReader, float f2) {
        return Integer.valueOf(Math.round(n.b(jsonReader) * f2));
    }
}
