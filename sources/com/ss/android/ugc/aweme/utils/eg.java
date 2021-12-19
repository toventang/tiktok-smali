package com.ss.android.ugc.aweme.utils;

import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;

public interface eg extends l {

    public static final class a {
        static {
            Covode.recordClassIndex(93470);
        }

        @v(a = i.a.ON_CREATE)
        public static void onCreate(eg egVar) {
        }

        @v(a = i.a.ON_DESTROY)
        public static void onDestroy(eg egVar) {
        }

        @v(a = i.a.ON_PAUSE)
        public static void onPause(eg egVar) {
        }

        @v(a = i.a.ON_RESUME)
        public static void onResume(eg egVar) {
        }

        @v(a = i.a.ON_START)
        public static void onStart(eg egVar) {
        }

        @v(a = i.a.ON_STOP)
        public static void onStop(eg egVar) {
        }
    }

    static {
        Covode.recordClassIndex(93469);
    }

    @v(a = i.a.ON_CREATE)
    void onCreate();

    @v(a = i.a.ON_DESTROY)
    void onDestroy();

    @v(a = i.a.ON_PAUSE)
    void onPause();

    @v(a = i.a.ON_RESUME)
    void onResume();

    @v(a = i.a.ON_START)
    void onStart();

    @v(a = i.a.ON_STOP)
    void onStop();
}
