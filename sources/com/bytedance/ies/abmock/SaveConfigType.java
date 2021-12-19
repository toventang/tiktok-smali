package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;

public final class SaveConfigType {
    static {
        Covode.recordClassIndex(18583);
    }

    public enum ConfigType {
        BOOLEAN,
        INT,
        LONG,
        DOUBLE,
        FLOAT,
        STRING,
        STRING_ARRAY,
        OBJECT;

        static {
            Covode.recordClassIndex(18584);
        }
    }
}
