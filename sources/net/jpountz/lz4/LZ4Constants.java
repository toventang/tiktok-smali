package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

enum LZ4Constants {
    ;
    
    static final int SKIP_STRENGTH = Math.max(6, 2);

    static {
        Covode.recordClassIndex(105984);
    }
}
