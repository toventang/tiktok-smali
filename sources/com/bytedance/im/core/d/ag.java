package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class ag implements Serializable {
    public String conversationId;
    public Long create_time;
    public int deleted;
    public String idempotent_id;
    public String key;
    public String msgUuid;
    public String sec_uid;
    public int status;
    public Long uid;
    public String value;
    public long version;

    static {
        Covode.recordClassIndex(22661);
    }
}
