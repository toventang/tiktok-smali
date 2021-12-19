package com.bytedance.android.livesdkapi.session;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface ILinkSession extends Parcelable, c {
    static {
        Covode.recordClassIndex(13885);
    }

    JSONObject b();

    String c();
}
