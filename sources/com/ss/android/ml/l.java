package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.a;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ml.process.c;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

public interface l {
    static {
        Covode.recordClassIndex(37003);
    }

    float a(Map<String, Object> map, List<? extends c> list, a aVar, List<String> list2);

    List<String> a(Map<String, Object> map, List<? extends c> list, a aVar, List<String> list2, Map<String, Float> map2);

    void a(o oVar);

    void a(FileInputStream fileInputStream, MLConfigModel mLConfigModel);

    void a(String str);

    boolean a();
}
