package com.ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

public class GameRTCRoomConfig {
    public int audioVolumeIndicationInterval;
    public boolean enableRangeAudio;
    public boolean enableSpatialAudio;
    public RoomType roomType;

    static {
        Covode.recordClassIndex(100896);
    }

    public enum RoomType {
        RTC_ROOM_TEAM(0),
        RTC_ROOM_WORLD(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100897);
        }

        private RoomType(int i2) {
            this.value = i2;
        }
    }
}
