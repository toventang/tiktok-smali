package com.bytedance.x.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.x.c.c;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b implements Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f46154a = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<g> clickList;
    public String duration;
    public List<c> iconList;
    public String id;
    public List<d> mediaFileList;
    public List<e> trackingEventList;

    static {
        Covode.recordClassIndex(28205);
    }

    public long getDurationInMs() {
        if (c.a(this.duration)) {
            return 0;
        }
        Matcher matcher = f46154a.matcher(this.duration);
        if (!matcher.matches()) {
            return 0;
        }
        long millis = TimeUnit.HOURS.toMillis(Long.parseLong(matcher.group(1))) + 0 + TimeUnit.MINUTES.toMillis(Long.parseLong(matcher.group(2))) + TimeUnit.SECONDS.toMillis(Long.parseLong(matcher.group(3)));
        String group = matcher.group(5);
        if (!c.a(group)) {
            return millis + Long.parseLong(group);
        }
        return millis;
    }
}
