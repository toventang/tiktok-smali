package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.e.a;
import com.airbnb.lottie.e.b.l;
import com.airbnb.lottie.i.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aa implements af<l> {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f5663a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(2349);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.h.af
    public final /* synthetic */ l a(JsonReader jsonReader, float f2) {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (!nextName.equals("c")) {
                        break;
                    } else {
                        z = jsonReader.nextBoolean();
                        break;
                    }
                case 105:
                    if (!nextName.equals("i")) {
                        break;
                    } else {
                        list2 = n.a(jsonReader, f2);
                        break;
                    }
                case 111:
                    if (!nextName.equals("o")) {
                        break;
                    } else {
                        list3 = n.a(jsonReader, f2);
                        break;
                    }
                case 118:
                    if (!nextName.equals("v")) {
                        break;
                    } else {
                        list = n.a(jsonReader, f2);
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 1; i2 < size; i2++) {
                PointF pointF2 = list.get(i2);
                int i3 = i2 - 1;
                arrayList.add(new a(f.a(list.get(i3), list3.get(i3)), f.a(pointF2, list2.get(i2)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i4 = size - 1;
                arrayList.add(new a(f.a(list.get(i4), list3.get(i4)), f.a(pointF3, list2.get(0)), pointF3));
            }
            return new l(pointF, z, arrayList);
        }
    }
}
