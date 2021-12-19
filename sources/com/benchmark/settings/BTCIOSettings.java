package com.benchmark.settings;

import com.bytedance.covode.number.Covode;

public class BTCIOSettings {
    public int blockNum = 1024;
    public int blockSize = 4096;
    public String cachePathDir;
    public String externalCacheDir;
    public String mode = "internal";

    static {
        Covode.recordClassIndex(3043);
    }
}
