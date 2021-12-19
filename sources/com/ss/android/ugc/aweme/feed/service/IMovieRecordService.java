package com.ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public interface IMovieRecordService {

    public interface a {
        static {
            Covode.recordClassIndex(59717);
        }
    }

    static {
        Covode.recordClassIndex(59716);
    }

    void startRecordMovie(Activity activity, String str, int i2, int i3, a aVar);

    void startRecordMovie(Fragment fragment, String str);

    void startRecordMovie(Fragment fragment, String str, int i2);
}
