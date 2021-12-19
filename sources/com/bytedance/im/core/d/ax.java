package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class ax implements Serializable {
    @c(a = "check_code")
    public int checkCode;
    @c(a = "check_message")
    public String checkMsg;
    @c(a = "status")
    public int status;

    static {
        Covode.recordClassIndex(22724);
    }
}
