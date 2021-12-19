package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b;

public final class h implements af<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f40674a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(24955);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.e.af
    public final /* synthetic */ b a(JsonReader jsonReader, float f2) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 102:
                    if (nextName.equals("f")) {
                        str2 = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 106:
                    if (nextName.equals("j")) {
                        i2 = jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        d2 = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        i4 = n.a(jsonReader);
                        continue;
                    }
                    break;
                case 3452:
                    if (nextName.equals("lh")) {
                        d3 = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3463:
                    if (nextName.equals("ls")) {
                        d4 = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3543:
                    if (nextName.equals("of")) {
                        z = jsonReader.nextBoolean();
                        continue;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        i5 = n.a(jsonReader);
                        continue;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        d5 = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        i3 = jsonReader.nextInt();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new b(str, str2, d2, i2, i3, d3, d4, i4, i5, d5, z);
    }
}
