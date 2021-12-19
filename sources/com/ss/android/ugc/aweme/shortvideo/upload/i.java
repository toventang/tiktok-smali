package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;

public final class i {
    static {
        Covode.recordClassIndex(86537);
    }

    public enum a {
        CONSUME_DONE,
        CONSUME_WAIT_DATA,
        CONSUME_FAIL,
        CONSUME_END;

        static {
            Covode.recordClassIndex(86538);
        }
    }

    public enum b {
        GET_HEADER_SIZE_WAIT,
        GET_HEADER_SIZE_DONE;

        static {
            Covode.recordClassIndex(86539);
        }
    }

    public enum c {
        UPLOAD_FINISH,
        UPLOAD_CANCEL,
        UPLOADING;

        static {
            Covode.recordClassIndex(86540);
        }
    }
}
