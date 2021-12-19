package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class PublishBehaviorModel {
    public final String code;
    public int idIndex = -1;
    public final String info;
    public final String publishId;
    public final String stage;
    public final long timeStamp;
    public final BehaviorType type;

    static {
        Covode.recordClassIndex(84467);
    }

    public final String getSimpleTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+0"));
        String format = simpleDateFormat.format(new Date(this.timeStamp));
        l.b(format, "");
        return format;
    }

    public PublishBehaviorModel(long j2, String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(behaviorType, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.timeStamp = j2;
        this.publishId = str;
        this.type = behaviorType;
        this.stage = str2;
        this.code = str3;
        this.info = str4;
    }
}
