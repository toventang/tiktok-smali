package com.apiguard3.internal;

import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;

public class APIGuard$Callback {
    private static long getHeaders = -4114317503044517042L;
    private static int newBuilder;
    private static int url = 1;
    String AGRequest;
    String getBody;
    log.getBody getMethod;
    long getUrl;

    static {
        Covode.recordClassIndex(2501);
    }

    public String toString() {
        String obj = new StringBuilder().append(getMethod("屏尃쟽⥣쓜⾘ᕙ᳡兞휘㫘ȉ䘗?ࠃㅬ篌݂Ⓗ梆﾿ሢ").intern()).append(this.getMethod).append(getMethod("ᕶᕚᢪࡗᯄຨ䊌䬉᠆ࡉᮾ").intern()).append(this.getBody).append(getMethod("⿭⿁᷏㋎ạ㐾靴黱⊞൴ℽ").intern()).append(this.AGRequest).append('\'').append(getMethod("䳔䳸稝릜祳뽴ꃄꥇ䆭櫾꨻랒囩柎飠蒣").intern()).append(this.getUrl).append('}').toString();
        int i2 = newBuilder + 99;
        url = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    private static String getMethod(String str) {
        char[] cArr = str;
        if (str != null) {
            int i2 = newBuilder + 77;
            url = i2 % 128;
            int i3 = i2 % 2;
            cArr = str.toCharArray();
        }
        char[] AGRequest2 = setNextFocusRightId.AGRequest(getHeaders, cArr);
        int i4 = url + 67;
        newBuilder = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 4;
        while (i6 < AGRequest2.length) {
            int i7 = newBuilder + 29;
            url = i7 % 128;
            if (i7 % 2 != 0) {
                AGRequest2[i6] = (char) ((int) (((long) (AGRequest2[i6] ^ AGRequest2[i6 % 4])) ^ (((long) (i6 - 4)) * getHeaders)));
                i6++;
            } else {
                AGRequest2[i6] = (char) ((int) (((long) (AGRequest2[i6] ^ AGRequest2[i6 - 2])) / (((long) (i6 * 4)) + getHeaders)));
                i6 += 62;
            }
        }
        return new String(AGRequest2, 4, AGRequest2.length - 4);
    }

    APIGuard$Callback(log.getBody getbody, log.getMethod getmethod, String str, long j2) {
        this.getMethod = getbody;
        this.getBody = getmethod.AGRequest();
        this.AGRequest = str;
        this.getUrl = j2;
    }

    APIGuard$Callback(log.getBody getbody, String str, String str2, long j2) {
        this.getMethod = getbody;
        this.getBody = str;
        this.AGRequest = str2;
        this.getUrl = j2;
    }
}
