package com.bytedance.android.livesdk.olddialog.viewmodel;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;

public class GiftDialogViewModel extends ac {
    static {
        Covode.recordClassIndex(11865);
    }

    public enum b {
        ANCHOR,
        GUEST,
        OFFICIAL_GUEST;

        static {
            Covode.recordClassIndex(11867);
        }
    }

    public enum a {
        NORMAL,
        GIFT,
        DOODLE_GIFT,
        PROP,
        TASK_GIFT,
        GIFT_AD;

        static {
            Covode.recordClassIndex(11866);
        }
    }
}
