package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RandomLinkMicSetting {
    @c(a = "quickly_disconnected_ban_time")
    public int banTime = 30;
    @c(a = "random_linkmic_bubble_strategy")
    public int bubbleStrategy = 2;
    @c(a = "quickly_disconnected_judge")
    public DisconnectJudge disconnectJudge = new DisconnectJudge();
    @c(a = "quickly_disconnected_time")
    public int disconnectTime = 10;

    public static class DisconnectJudge {
        @c(a = "frequency")
        public int frequency = 10;
        @c(a = "period")
        public int period = 10;

        static {
            Covode.recordClassIndex(11287);
        }
    }

    static {
        Covode.recordClassIndex(11286);
    }
}
