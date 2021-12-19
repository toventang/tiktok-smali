package com.ss.ugc.live.sdk.message;

import com.bytedance.covode.number.Covode;

public class MessageApiConstant {
    static {
        Covode.recordClassIndex(102756);
    }

    public static class FetchRule {
        public static int FETCH_DATA_AND_DETERMINE_TYPE = 1;
        public static int FETCH_DATA_FOR_WS_ALONGSIDE = 2;
        public static int FETCH_DATA_ONLY;

        static {
            Covode.recordClassIndex(102757);
        }
    }

    public static class FetchType {
        public static int HTTP;
        public static int WEBSOCKET = 1;

        static {
            Covode.recordClassIndex(102758);
        }
    }
}
