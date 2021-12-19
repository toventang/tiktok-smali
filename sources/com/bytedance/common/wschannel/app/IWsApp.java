package com.bytedance.common.wschannel.app;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public interface IWsApp extends Parcelable {
    static {
        Covode.recordClassIndex(15940);
    }

    int a();

    int b();

    String c();

    String d();

    int e();

    int f();

    JSONObject g();

    String h();

    int i();

    String j();

    List<String> k();
}
