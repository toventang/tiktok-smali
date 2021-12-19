package com.bytedance.x.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.x.b;
import com.bytedance.x.c;
import com.bytedance.x.d;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class f implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<a> adVerificationList;
    public List<b> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    static {
        Covode.recordClassIndex(28209);
    }

    public Boolean parseContent(String str, int i2) {
        return Boolean.valueOf(new d(this).b(str, i2));
    }

    public Boolean parseUri(String str, int i2) {
        return Boolean.valueOf(new d(this).a(str, i2));
    }

    public Boolean parseContent(String str, int i2, b bVar) {
        return Boolean.valueOf(new d(this, bVar).b(str, i2));
    }

    public Boolean parseUri(String str, int i2, b bVar) {
        return Boolean.valueOf(new d(this, bVar).a(str, i2));
    }

    public Boolean parseContent(String str, int i2, b bVar, c cVar) {
        return Boolean.valueOf(new d(this, bVar, cVar).b(str, i2));
    }

    public Boolean parseUri(String str, int i2, b bVar, c cVar) {
        return Boolean.valueOf(new d(this, bVar, cVar).a(str, i2));
    }
}
