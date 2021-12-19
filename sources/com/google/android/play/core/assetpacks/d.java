package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class d {
    static {
        Covode.recordClassIndex(32746);
    }

    public abstract long a();

    public abstract Map<String, AssetPackState> b();

    static d a(Bundle bundle, ay ayVar, List<String> list, z zVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = stringArrayList.get(i2);
            hashMap.put(str, AssetPackState.a(bundle, str, ayVar, zVar));
        }
        for (String str2 : list) {
            hashMap.put(str2, AssetPackState.a(str2, 4, 0, 0, 0, 0.0d, 1));
        }
        return new ai(bundle.getLong("total_bytes_to_download"), hashMap);
    }
}
